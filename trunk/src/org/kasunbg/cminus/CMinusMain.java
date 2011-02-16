package org.kasunbg.cminus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.security.auth.callback.LanguageCallback;

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
			file = new File("samples/sample2.cm");
		}

		main.tokenize(file);		
//		main.parser(file);			
	} 

	void tokenize(File file) {		
		try {
			BufferedReader bf = new BufferedReader(new FileReader(file));
			String input="",temp;
			while ((temp = bf.readLine()) != null) {
				input += temp+"\n";
			}

			CharStream charStream = new ANTLRStringStream(input);
			CMinusLexer lexer = new CMinusLexer(charStream);	
			
			Token token;
			String format = "|\t%1$-10s|\t%2$-20s|\t%3$-24s|\n";


			//Prints a table with columns:
			//Line Number | Token Text | Token Type | Token Index
			System.out.println("The Lexical Analyzer for a sample code of C Minus language.");
			System.out.println("|-----------------------------------------------------------------------|");
			System.out.println("|   Line No.\t  |\t  Text \t\t    |\tType    \t\t|");
			System.out.println("|-----------------------------------------------------------------------|");
			while ((token = lexer.nextToken())!= Token.EOF_TOKEN) {
				if(token.getChannel() == 0){	//0 is the DEFAULT_CHANNEL. 
					//99 is the HIDDEN_CHANNEL with comments etc.
					System.out.format(format, token.getLine(), token.getText(), getTokenType(token.getType()) );
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
			//			System.out.println(input);

			CharStream charStream = new ANTLRStringStream(input);
			CMinusLexer lexer = new CMinusLexer(charStream);				
			TokenStream tokenStream = new CommonTokenStream(lexer);
			CMinusParser parser = new CMinusParser(tokenStream);
			parser.program();
		} catch (FileNotFoundException e) {
			System.out.println("Sample file" + file.getName() + " not found.");
			System.exit(1);
		} catch (IOException e) {
			System.out.println("An error occured while reading the file.");
			System.exit(1);
		}
	}

	public String getTokenType(int num) {
		String type = "";
		switch(num) {
		case(30):
			type = "RIGHT_BRACE";
		break;
		case(17):
			type = "LESS_THAN_OR_EQUAL";
		break;
		case(20):
			type = "EQUAL_EQUAL";
		break;
		case(6):
			type = "KEYWORD_ELSE";
		break;
		case(18):
			type = "GREATER_THAN";
		break;
		case(9):
			type = "KEYWORD_RETURN";
		break;
		case(33):
			type = "LETTER";
		break;
		case(35):
			type = "WHITESPACE";
		break;
		case(23):
			type = "SEMICOLON";
		break;
		case(14):
			type = "MULTI";
		break;
		case(13):
			type = "MINUS";
		break;
		case(4):
			type = "ID";
		break;
		case(34):
			type = "NUM";
		break;
		case(27):
			type = "LEFT_SQUARE_BRACKET";
		break;
		case(28):
			type = "RIGHT_SQUARE_BRACKET";
		break;
		case(19):
			type = "GREATER_THAN_OR_EQUAL";
		break;
		case(26):
			type = "RIGHT_PAREN";
		break;
		case(31):
			type = "NEWLINE";
		break;
		case(8):
			type = "KEYWORD_INT";
		break;
		case(24):
			type = "COMMA";
		break;
		case(21):
			type = "NOT_EQUAL";
		break;
		case(29):
			type = "LEFT_BRACE";
		break;
		case(7):
			type = "KEYWORD_IF";
		break;
		case(22):
			type = "EQUAL";
		break;
		case(10):
			type = "KEYWORD_VOID";
		break;
		case(11):
			type = "KEYWORD_WHILE";
		break;
		case(16):
			type = "LESS_THAN";
		break;
		case(25):
			type = "LEFT_PAREN";
		break;
		case(15):
			type = "DIVISION";
		break;
		case(12):
			type = "PLUS";
		break;
		case(5):
			type = "DIGIT";
		break;
		case(32):
			type = "COMMENT";
		break;		
		}
		return type;
	}
}
