package org.kasunbg.cminus;

import java.io.BufferedReader;
import java.io.File; 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

public class CMinusMain {
	
	public static void main (String samplePath[]) throws RecognitionException{

		CMinusMain main = new CMinusMain();
		File file;
		if(samplePath.length != 0){
			file = new File(samplePath[0]);
		} else {
			System.out.println("No parameter specified. Using a samples/sample*.cm file to tokenize and parse.\n");
			file = new File("samples/sample2.cm");
		}
		
		main.tokenize(file);		
		main.parser(file);			
	} 
	
	/**
	 * Tokenizes the given file's contents and outputs details of each token.
	 * For each token, following details are displayed.
	 * Line Number | Token Text | Token Type | Token Index 
	 * @param file the content needed to be tokenized 
	 */
	void tokenize(File file) {	
		
		Map<Integer, String > tokenMap;
		tokenMap = generateTokenTypes("src/org/kasunbg/cminus/CMinus.tokens");
		
		try {
			BufferedReader bf = new BufferedReader(new FileReader(file));
			String input="",temp;
			while ((temp = bf.readLine()) != null) {
				input += temp+"\n";
			}

			CharStream charStream = new ANTLRStringStream(input);
			CMinusLexer lexer = new CMinusLexer(charStream);	
			
			Token token;
			String format = "|\t%1$-10s|\t%2$-20s|\t%3$-24s|\n"; //used for printing purposes

			//Prints a table with columns:
			//Line Number | Token Text | Token Type | Token Index
			System.out.println("The Lexical Analyzer for a sample code of C Minus language.");
			System.out.println("|-----------------------------------------------------------------------|");
			System.out.println("|   Line No.\t  |\t  Text \t\t    |\tType    \t\t|");
			System.out.println("|-----------------------------------------------------------------------|");
			while ((token = lexer.nextToken())!= Token.EOF_TOKEN) {
				if(token.getChannel() == 0){	//0 is the DEFAULT_CHANNEL. 
					//99 is the HIDDEN_CHANNEL with comments etc.
					System.out.format(format, token.getLine(), token.getText(), tokenMap.get( token.getType()) );
				}
			}
			System.out.println("|-----------------------------------------------------------------------|");

		} catch (IOException e) {
			System.out.println("An error occured while reading the file.");
		}				
	}

	private void parser(File file) throws RecognitionException {		

		try {
			BufferedReader bf = new BufferedReader(new FileReader(file));
			String input="",temp;
			while ((temp = bf.readLine()) != null) {
				input += temp+"\n";
			}		
			
			CharStream charStream = new ANTLRStringStream(input);
			CMinusLexer lexer = new CMinusLexer(charStream);				
			TokenStream tokenStream = new CommonTokenStream(lexer);
			CMinusParser parser = new CMinusParser(tokenStream);
						
			System.out.println("\nStarted Parsing...");
			parser.program();	//calls the Start symbol 'program' to parse the content.
			System.out.println("\nParsed...");
//			System.out.println("Parsed the content successfully.");
			
		} catch (FileNotFoundException e) {
			System.out.println("Sample file" + file.getName() + " not found.");
			System.exit(1);
		} catch (IOException e) {
			System.out.println("An error occured while reading the file.");
			System.exit(1);
		}
	}

	/**
	 * generates the token types by reading CMinus.tokens file into a java understandable format.
	 * this will only be used for demonstration(to display the output) purposes.
	 * @param filename The Token file name.
	 */
	private Map<Integer, String> generateTokenTypes(String filename) {
		Map<Integer, String> tokenMap = new HashMap<Integer, String>();
		try {
			BufferedReader bf;
			try {
				bf = new BufferedReader(new FileReader(filename));
			} catch (FileNotFoundException ex) {
//				System.out.println(filename + "cannot be found, Trying with org/kasunbg/cminus/CMinus.tokens");
				bf = new BufferedReader(new FileReader("org/kasunbg/cminus/CMinus.tokens"));
			}
			
			String temp;
			char tokenIdSeparator = '='; 	
			while ((temp = bf.readLine()) != null) {
				int index = temp.lastIndexOf(tokenIdSeparator);
				if(index != -1) {
					String tokenType = temp.substring(0, index);
					tokenType = standardizeTokenType(tokenType);
					
					String tokenId = temp.substring(index+1);
											
					tokenMap.put(Integer.parseInt(tokenId), tokenType);	
							//parses the tokenId to a Integer and stores that as the key with tokenType as the value  
							//System.out.println(tokenType+", "+ tokenId);
				} else {
					throw new Exception();
				}
			}
		} catch(Exception ex){
			ex.printStackTrace();
		}		
		
		return tokenMap;		
	}

	private String standardizeTokenType(String tokenType) {
				
		if(tokenType.equals("'<='")) {
			tokenType = "LESS_THAN_OR_EQUAL"; 
		} else if(tokenType.equals("'!='")) {
			tokenType = "NOT_EQUAL";
		} else if(tokenType.equals("'>='")) {
			tokenType = "GREATER_THAN_OR_EQUAL";
		} else if(tokenType.equals("'='")) {
			tokenType = "EQUAL";
		} else if(tokenType.equals("'=='")) {
			tokenType = "EQUAL_EQUAL";
		} else if(tokenType.equals("'<'")) {
			tokenType = "LESS_THAN";
		} else if(tokenType.equals("'>'")) {
			tokenType = "GREATER_THAN";
		}
			
		return tokenType;
	}
	
}
