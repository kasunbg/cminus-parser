// $ANTLR 3.2 Sep 23, 2009 12:02:23 src/org/kasunbg/cminus/CMinus.g 2011-03-17 01:21:13
  
  package org.kasunbg.cminus;  


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CMinusLexer extends Lexer {
    public static final int RIGHT_BRACE=15;
    public static final int LESS_THAN_OR_EQUAL=26;
    public static final int EQUAL_EQUAL=29;
    public static final int GREATER_THAN=27;
    public static final int KEYWORD_ELSE=17;
    public static final int KEYWORD_RETURN=19;
    public static final int LETTER=33;
    public static final int WHITESPACE=35;
    public static final int SEMICOLON=5;
    public static final int MULTI=23;
    public static final int MINUS=22;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int NUM=7;
    public static final int LEFT_SQUARE_BRACKET=6;
    public static final int RIGHT_SQUARE_BRACKET=8;
    public static final int GREATER_THAN_OR_EQUAL=28;
    public static final int RIGHT_PAREN=12;
    public static final int NEWLINE=31;
    public static final int KEYWORD_INT=9;
    public static final int COMMA=13;
    public static final int NOT_EQUAL=30;
    public static final int KEYWORD_IF=16;
    public static final int LEFT_BRACE=14;
    public static final int EQUAL=20;
    public static final int KEYWORD_WHILE=18;
    public static final int KEYWORD_VOID=10;
    public static final int LESS_THAN=25;
    public static final int LEFT_PAREN=11;
    public static final int DIVISION=24;
    public static final int PLUS=21;
    public static final int DIGIT=34;
    public static final int COMMENT=32;

    // delegates
    // delegators

    public CMinusLexer() {;} 
    public CMinusLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CMinusLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "src/org/kasunbg/cminus/CMinus.g"; }

    // $ANTLR start "KEYWORD_ELSE"
    public final void mKEYWORD_ELSE() throws RecognitionException {
        try {
            int _type = KEYWORD_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:171:14: ( 'else' )
            // src/org/kasunbg/cminus/CMinus.g:171:16: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_ELSE"

    // $ANTLR start "KEYWORD_IF"
    public final void mKEYWORD_IF() throws RecognitionException {
        try {
            int _type = KEYWORD_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:172:12: ( 'if' )
            // src/org/kasunbg/cminus/CMinus.g:172:14: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_IF"

    // $ANTLR start "KEYWORD_INT"
    public final void mKEYWORD_INT() throws RecognitionException {
        try {
            int _type = KEYWORD_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:173:13: ( 'int' )
            // src/org/kasunbg/cminus/CMinus.g:173:15: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_INT"

    // $ANTLR start "KEYWORD_RETURN"
    public final void mKEYWORD_RETURN() throws RecognitionException {
        try {
            int _type = KEYWORD_RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:174:16: ( 'return' )
            // src/org/kasunbg/cminus/CMinus.g:174:18: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_RETURN"

    // $ANTLR start "KEYWORD_VOID"
    public final void mKEYWORD_VOID() throws RecognitionException {
        try {
            int _type = KEYWORD_VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:175:14: ( 'void' )
            // src/org/kasunbg/cminus/CMinus.g:175:16: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_VOID"

    // $ANTLR start "KEYWORD_WHILE"
    public final void mKEYWORD_WHILE() throws RecognitionException {
        try {
            int _type = KEYWORD_WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:176:15: ( 'while' )
            // src/org/kasunbg/cminus/CMinus.g:176:17: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_WHILE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:178:6: ( '+' )
            // src/org/kasunbg/cminus/CMinus.g:178:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:179:7: ( '-' )
            // src/org/kasunbg/cminus/CMinus.g:179:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MULTI"
    public final void mMULTI() throws RecognitionException {
        try {
            int _type = MULTI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:180:7: ( '*' )
            // src/org/kasunbg/cminus/CMinus.g:180:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULTI"

    // $ANTLR start "DIVISION"
    public final void mDIVISION() throws RecognitionException {
        try {
            int _type = DIVISION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:181:10: ( '/' )
            // src/org/kasunbg/cminus/CMinus.g:181:12: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIVISION"

    // $ANTLR start "LESS_THAN"
    public final void mLESS_THAN() throws RecognitionException {
        try {
            int _type = LESS_THAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:182:11: ( '<' )
            // src/org/kasunbg/cminus/CMinus.g:182:13: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS_THAN"

    // $ANTLR start "LESS_THAN_OR_EQUAL"
    public final void mLESS_THAN_OR_EQUAL() throws RecognitionException {
        try {
            int _type = LESS_THAN_OR_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:183:20: ( '<=' )
            // src/org/kasunbg/cminus/CMinus.g:183:22: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS_THAN_OR_EQUAL"

    // $ANTLR start "GREATER_THAN"
    public final void mGREATER_THAN() throws RecognitionException {
        try {
            int _type = GREATER_THAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:184:14: ( '>' )
            // src/org/kasunbg/cminus/CMinus.g:184:16: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER_THAN"

    // $ANTLR start "GREATER_THAN_OR_EQUAL"
    public final void mGREATER_THAN_OR_EQUAL() throws RecognitionException {
        try {
            int _type = GREATER_THAN_OR_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:185:23: ( '>=' )
            // src/org/kasunbg/cminus/CMinus.g:185:25: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER_THAN_OR_EQUAL"

    // $ANTLR start "EQUAL_EQUAL"
    public final void mEQUAL_EQUAL() throws RecognitionException {
        try {
            int _type = EQUAL_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:186:13: ( '==' )
            // src/org/kasunbg/cminus/CMinus.g:186:15: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL_EQUAL"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:187:11: ( '!=' )
            // src/org/kasunbg/cminus/CMinus.g:187:13: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:188:7: ( '=' )
            // src/org/kasunbg/cminus/CMinus.g:188:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:189:11: ( ';' )
            // src/org/kasunbg/cminus/CMinus.g:189:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:190:7: ( ',' )
            // src/org/kasunbg/cminus/CMinus.g:190:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "LEFT_PAREN"
    public final void mLEFT_PAREN() throws RecognitionException {
        try {
            int _type = LEFT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:192:12: ( '(' )
            // src/org/kasunbg/cminus/CMinus.g:192:14: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFT_PAREN"

    // $ANTLR start "RIGHT_PAREN"
    public final void mRIGHT_PAREN() throws RecognitionException {
        try {
            int _type = RIGHT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:193:13: ( ')' )
            // src/org/kasunbg/cminus/CMinus.g:193:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHT_PAREN"

    // $ANTLR start "LEFT_SQUARE_BRACKET"
    public final void mLEFT_SQUARE_BRACKET() throws RecognitionException {
        try {
            int _type = LEFT_SQUARE_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:194:21: ( '[' )
            // src/org/kasunbg/cminus/CMinus.g:194:23: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFT_SQUARE_BRACKET"

    // $ANTLR start "RIGHT_SQUARE_BRACKET"
    public final void mRIGHT_SQUARE_BRACKET() throws RecognitionException {
        try {
            int _type = RIGHT_SQUARE_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:195:22: ( ']' )
            // src/org/kasunbg/cminus/CMinus.g:195:24: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHT_SQUARE_BRACKET"

    // $ANTLR start "LEFT_BRACE"
    public final void mLEFT_BRACE() throws RecognitionException {
        try {
            int _type = LEFT_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:196:12: ( '{' )
            // src/org/kasunbg/cminus/CMinus.g:196:14: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFT_BRACE"

    // $ANTLR start "RIGHT_BRACE"
    public final void mRIGHT_BRACE() throws RecognitionException {
        try {
            int _type = RIGHT_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:197:13: ( '}' )
            // src/org/kasunbg/cminus/CMinus.g:197:15: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHT_BRACE"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:201:3: ( '/*' ( . )* '*/' ( NEWLINE )? )
            // src/org/kasunbg/cminus/CMinus.g:201:5: '/*' ( . )* '*/' ( NEWLINE )?
            {
            match("/*"); 

            // src/org/kasunbg/cminus/CMinus.g:201:10: ( . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/org/kasunbg/cminus/CMinus.g:201:10: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("*/"); 

            // src/org/kasunbg/cminus/CMinus.g:201:18: ( NEWLINE )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\n'||LA2_0=='\r') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // src/org/kasunbg/cminus/CMinus.g:201:18: NEWLINE
                    {
                    mNEWLINE(); 

                    }
                    break;

            }

             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:203:17: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // src/org/kasunbg/cminus/CMinus.g:203:19: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:204:16: ( ( '0' .. '9' ) )
            // src/org/kasunbg/cminus/CMinus.g:204:18: ( '0' .. '9' )
            {
            // src/org/kasunbg/cminus/CMinus.g:204:18: ( '0' .. '9' )
            // src/org/kasunbg/cminus/CMinus.g:204:19: '0' .. '9'
            {
            matchRange('0','9'); 

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:205:4: ( LETTER ( LETTER )* )
            // src/org/kasunbg/cminus/CMinus.g:205:6: LETTER ( LETTER )*
            {
            mLETTER(); 
            // src/org/kasunbg/cminus/CMinus.g:205:13: ( LETTER )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // src/org/kasunbg/cminus/CMinus.g:205:13: LETTER
            	    {
            	    mLETTER(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            int _type = NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:206:5: ( DIGIT ( DIGIT )* )
            // src/org/kasunbg/cminus/CMinus.g:206:7: DIGIT ( DIGIT )*
            {
            mDIGIT(); 
            // src/org/kasunbg/cminus/CMinus.g:206:13: ( DIGIT )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // src/org/kasunbg/cminus/CMinus.g:206:13: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUM"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:209:18: ( ( '\\r' | '\\n' ) )
            // src/org/kasunbg/cminus/CMinus.g:209:20: ( '\\r' | '\\n' )
            {
            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/kasunbg/cminus/CMinus.g:210:12: ( ( ' ' | '\\t' | NEWLINE )+ )
            // src/org/kasunbg/cminus/CMinus.g:210:14: ( ' ' | '\\t' | NEWLINE )+
            {
            // src/org/kasunbg/cminus/CMinus.g:210:14: ( ' ' | '\\t' | NEWLINE )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // src/org/kasunbg/cminus/CMinus.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    public void mTokens() throws RecognitionException {
        // src/org/kasunbg/cminus/CMinus.g:1:8: ( KEYWORD_ELSE | KEYWORD_IF | KEYWORD_INT | KEYWORD_RETURN | KEYWORD_VOID | KEYWORD_WHILE | PLUS | MINUS | MULTI | DIVISION | LESS_THAN | LESS_THAN_OR_EQUAL | GREATER_THAN | GREATER_THAN_OR_EQUAL | EQUAL_EQUAL | NOT_EQUAL | EQUAL | SEMICOLON | COMMA | LEFT_PAREN | RIGHT_PAREN | LEFT_SQUARE_BRACKET | RIGHT_SQUARE_BRACKET | LEFT_BRACE | RIGHT_BRACE | COMMENT | ID | NUM | WHITESPACE )
        int alt6=29;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // src/org/kasunbg/cminus/CMinus.g:1:10: KEYWORD_ELSE
                {
                mKEYWORD_ELSE(); 

                }
                break;
            case 2 :
                // src/org/kasunbg/cminus/CMinus.g:1:23: KEYWORD_IF
                {
                mKEYWORD_IF(); 

                }
                break;
            case 3 :
                // src/org/kasunbg/cminus/CMinus.g:1:34: KEYWORD_INT
                {
                mKEYWORD_INT(); 

                }
                break;
            case 4 :
                // src/org/kasunbg/cminus/CMinus.g:1:46: KEYWORD_RETURN
                {
                mKEYWORD_RETURN(); 

                }
                break;
            case 5 :
                // src/org/kasunbg/cminus/CMinus.g:1:61: KEYWORD_VOID
                {
                mKEYWORD_VOID(); 

                }
                break;
            case 6 :
                // src/org/kasunbg/cminus/CMinus.g:1:74: KEYWORD_WHILE
                {
                mKEYWORD_WHILE(); 

                }
                break;
            case 7 :
                // src/org/kasunbg/cminus/CMinus.g:1:88: PLUS
                {
                mPLUS(); 

                }
                break;
            case 8 :
                // src/org/kasunbg/cminus/CMinus.g:1:93: MINUS
                {
                mMINUS(); 

                }
                break;
            case 9 :
                // src/org/kasunbg/cminus/CMinus.g:1:99: MULTI
                {
                mMULTI(); 

                }
                break;
            case 10 :
                // src/org/kasunbg/cminus/CMinus.g:1:105: DIVISION
                {
                mDIVISION(); 

                }
                break;
            case 11 :
                // src/org/kasunbg/cminus/CMinus.g:1:114: LESS_THAN
                {
                mLESS_THAN(); 

                }
                break;
            case 12 :
                // src/org/kasunbg/cminus/CMinus.g:1:124: LESS_THAN_OR_EQUAL
                {
                mLESS_THAN_OR_EQUAL(); 

                }
                break;
            case 13 :
                // src/org/kasunbg/cminus/CMinus.g:1:143: GREATER_THAN
                {
                mGREATER_THAN(); 

                }
                break;
            case 14 :
                // src/org/kasunbg/cminus/CMinus.g:1:156: GREATER_THAN_OR_EQUAL
                {
                mGREATER_THAN_OR_EQUAL(); 

                }
                break;
            case 15 :
                // src/org/kasunbg/cminus/CMinus.g:1:178: EQUAL_EQUAL
                {
                mEQUAL_EQUAL(); 

                }
                break;
            case 16 :
                // src/org/kasunbg/cminus/CMinus.g:1:190: NOT_EQUAL
                {
                mNOT_EQUAL(); 

                }
                break;
            case 17 :
                // src/org/kasunbg/cminus/CMinus.g:1:200: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 18 :
                // src/org/kasunbg/cminus/CMinus.g:1:206: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 19 :
                // src/org/kasunbg/cminus/CMinus.g:1:216: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 20 :
                // src/org/kasunbg/cminus/CMinus.g:1:222: LEFT_PAREN
                {
                mLEFT_PAREN(); 

                }
                break;
            case 21 :
                // src/org/kasunbg/cminus/CMinus.g:1:233: RIGHT_PAREN
                {
                mRIGHT_PAREN(); 

                }
                break;
            case 22 :
                // src/org/kasunbg/cminus/CMinus.g:1:245: LEFT_SQUARE_BRACKET
                {
                mLEFT_SQUARE_BRACKET(); 

                }
                break;
            case 23 :
                // src/org/kasunbg/cminus/CMinus.g:1:265: RIGHT_SQUARE_BRACKET
                {
                mRIGHT_SQUARE_BRACKET(); 

                }
                break;
            case 24 :
                // src/org/kasunbg/cminus/CMinus.g:1:286: LEFT_BRACE
                {
                mLEFT_BRACE(); 

                }
                break;
            case 25 :
                // src/org/kasunbg/cminus/CMinus.g:1:297: RIGHT_BRACE
                {
                mRIGHT_BRACE(); 

                }
                break;
            case 26 :
                // src/org/kasunbg/cminus/CMinus.g:1:309: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 27 :
                // src/org/kasunbg/cminus/CMinus.g:1:317: ID
                {
                mID(); 

                }
                break;
            case 28 :
                // src/org/kasunbg/cminus/CMinus.g:1:320: NUM
                {
                mNUM(); 

                }
                break;
            case 29 :
                // src/org/kasunbg/cminus/CMinus.g:1:324: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\5\26\3\uffff\1\40\1\42\1\44\1\46\14\uffff\1\26\1\50\4\26"+
        "\10\uffff\1\26\1\uffff\1\56\3\26\1\62\1\uffff\1\26\1\64\1\26\1\uffff"+
        "\1\26\1\uffff\1\67\1\70\2\uffff";
    static final String DFA6_eofS =
        "\71\uffff";
    static final String DFA6_minS =
        "\1\11\1\154\1\146\1\145\1\157\1\150\3\uffff\1\52\3\75\14\uffff\1"+
        "\163\1\101\2\164\2\151\10\uffff\1\145\1\uffff\1\101\1\165\1\144"+
        "\1\154\1\101\1\uffff\1\162\1\101\1\145\1\uffff\1\156\1\uffff\2\101"+
        "\2\uffff";
    static final String DFA6_maxS =
        "\1\175\1\154\1\156\1\145\1\157\1\150\3\uffff\1\52\3\75\14\uffff"+
        "\1\163\1\172\2\164\2\151\10\uffff\1\145\1\uffff\1\172\1\165\1\144"+
        "\1\154\1\172\1\uffff\1\162\1\172\1\145\1\uffff\1\156\1\uffff\2\172"+
        "\2\uffff";
    static final String DFA6_acceptS =
        "\6\uffff\1\7\1\10\1\11\4\uffff\1\20\1\22\1\23\1\24\1\25\1\26\1\27"+
        "\1\30\1\31\1\33\1\34\1\35\6\uffff\1\32\1\12\1\14\1\13\1\16\1\15"+
        "\1\17\1\21\1\uffff\1\2\5\uffff\1\3\3\uffff\1\1\1\uffff\1\5\2\uffff"+
        "\1\6\1\4";
    static final String DFA6_specialS =
        "\71\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\30\2\uffff\1\30\22\uffff\1\30\1\15\6\uffff\1\20\1\21\1\10"+
            "\1\6\1\17\1\7\1\uffff\1\11\12\27\1\uffff\1\16\1\12\1\14\1\13"+
            "\2\uffff\32\26\1\22\1\uffff\1\23\3\uffff\4\26\1\1\3\26\1\2\10"+
            "\26\1\3\3\26\1\4\1\5\3\26\1\24\1\uffff\1\25",
            "\1\31",
            "\1\32\7\uffff\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "",
            "",
            "",
            "\1\37",
            "\1\41",
            "\1\43",
            "\1\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\47",
            "\32\26\6\uffff\32\26",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\55",
            "",
            "\32\26\6\uffff\32\26",
            "\1\57",
            "\1\60",
            "\1\61",
            "\32\26\6\uffff\32\26",
            "",
            "\1\63",
            "\32\26\6\uffff\32\26",
            "\1\65",
            "",
            "\1\66",
            "",
            "\32\26\6\uffff\32\26",
            "\32\26\6\uffff\32\26",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KEYWORD_ELSE | KEYWORD_IF | KEYWORD_INT | KEYWORD_RETURN | KEYWORD_VOID | KEYWORD_WHILE | PLUS | MINUS | MULTI | DIVISION | LESS_THAN | LESS_THAN_OR_EQUAL | GREATER_THAN | GREATER_THAN_OR_EQUAL | EQUAL_EQUAL | NOT_EQUAL | EQUAL | SEMICOLON | COMMA | LEFT_PAREN | RIGHT_PAREN | LEFT_SQUARE_BRACKET | RIGHT_SQUARE_BRACKET | LEFT_BRACE | RIGHT_BRACE | COMMENT | ID | NUM | WHITESPACE );";
        }
    }
 

}