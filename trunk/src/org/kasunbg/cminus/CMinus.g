grammar CMinus;

options {
  language = Java;
//  backtrack=true;
}   
  
@header {
  package org.kasunbg.cminus; 
}

@lexer::header { 
  package org.kasunbg.cminus;  
}
 
/*-------------------------------------------------------------------
 * PARSER RULES
 *-----------------------------------------------------------------*/
  
program
	:	 declarationList
	;		 
	 	
declarationList	
	:	declaration+
	;

declaration	
	:	varDeclaration | funDeclaration
	;
	 	 
varDeclaration	
	:	varTypeSpecifier ID SEMICOLON 	// only 'int' can be used as the type-specifier of a variable declaration.
	|	varTypeSpecifier ID LEFT_SQUARE_BRACKET NUM RIGHT_SQUARE_BRACKET SEMICOLON
	;
	
varTypeSpecifier
	:	KEYWORD_INT
	;
	
funTypeSpecifier
	:	KEYWORD_INT | KEYWORD_VOID
	;			
	
funDeclaration
	:	funTypeSpecifier ID LEFT_PAREN params RIGHT_PAREN compoundStmt
	;			
	
params
	:	paramList | KEYWORD_VOID
	;	
	
paramList
	:	param ( COMMA param )*	
	;
	
param
	:	funTypeSpecifier ID 
		( LEFT_SQUARE_BRACKET RIGHT_SQUARE_BRACKET | () )
	;
	
compoundStmt
	:	LEFT_BRACE localDeclarations statementList RIGHT_BRACE
	;
	
localDeclarations	//11
	:	varDeclaration*
	;	
	
statementList
	:	statement*
	;
	
statement 
	:	expressionStmt
	|	compoundStmt
	|	selectionStmt
	|	iterationStmt
	|	returnStmt
	;
	 
expressionStmt	//14 
	:	expression SEMICOLON | SEMICOLON			
	; 
	
selectionStmt 
	:	KEYWORD_IF LEFT_PAREN expression RIGHT_PAREN (statement)
		( (KEYWORD_ELSE) => KEYWORD_ELSE (statement) )?		
	;
     	  
iterationStmt
	:	KEYWORD_WHILE LEFT_PAREN expression RIGHT_PAREN statement	
	;	 
	
returnStmt
	:	KEYWORD_RETURN ( ( ) | expression )  SEMICOLON
	;			
	
expression 
	:	(var '=') => var '=' expression 
	|	simpleExpression
	;		 		 					

var	: 	ID (() | LEFT_SQUARE_BRACKET expression RIGHT_SQUARE_BRACKET)
	; 
	
simpleExpression  
	:	additiveExpression (() | (relop additiveExpression) )		
	;	 
	
relop	//21
	:	'<=' | '<' | '>=' | '>' | '==' | '!='	 
	;
	
additiveExpression
	:	term (addop term)*
	;

addop
	:	PLUS | MINUS
	;			
	
term
	:	factor (mulop factor)*
	;			
	 
mulop	 
	:	MULTI | DIVISION
	;			 
	
factor
	:	LEFT_PAREN expression RIGHT_PAREN
	|	var
	|	call
	|	NUM
	;		 
 
call
	:	ID LEFT_PAREN args RIGHT_PAREN
	;			
	
args
	:	argList | ()
	;			
	
argList		//29
	:	expression (COMMA expression)*
	;			
	

			  
/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

KEYWORD_ELSE : 'else';
KEYWORD_IF : 'if';
KEYWORD_INT : 'int';
KEYWORD_RETURN : 'return';
KEYWORD_VOID : 'void';
KEYWORD_WHILE : 'while';
 
PLUS : '+';
MINUS : '-';
MULTI :	'*';
DIVISION : '/';
LESS_THAN : '<';
LESS_THAN_OR_EQUAL : '<=';
GREATER_THAN : '>';
GREATER_THAN_OR_EQUAL : '>=';
EQUAL_EQUAL : '==';
NOT_EQUAL : '!=';
EQUAL : '=';
SEMICOLON : ';'	;
COMMA : ',';
 
LEFT_PAREN : '(';
RIGHT_PAREN : ')';
LEFT_SQUARE_BRACKET : '[';
RIGHT_SQUARE_BRACKET : ']';
LEFT_BRACE : '{';
RIGHT_BRACE : '}'; 

//When greedy is set to false, lexer matching stops when input matches the next element in the lexer rule.
COMMENT options { greedy = false; }
  : '/*' .* '*/' NEWLINE? { skip(); };
 
fragment LETTER : ( 'a'..'z' | 'A'..'Z');
fragment DIGIT : ('0'..'9');
ID : LETTER LETTER*;
NUM : DIGIT DIGIT*;

//whitespace. In windows '\r\n' considered as NEWLINE, while in Unix systems, it's '\n'.
fragment NEWLINE : ('\r' | '\n'); 
WHITESPACE : ( ' ' | '\t' | NEWLINE)+ { $channel = HIDDEN; };
