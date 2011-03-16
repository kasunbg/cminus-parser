// $ANTLR 3.2 Sep 23, 2009 12:02:23 src/org/kasunbg/cminus/CMinus.g 2011-03-17 01:21:12

  package org.kasunbg.cminus; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/**
 * Copyright 2011 Kasun Gajasinghe
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
*/
public class CMinusParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "SEMICOLON", "LEFT_SQUARE_BRACKET", "NUM", "RIGHT_SQUARE_BRACKET", "KEYWORD_INT", "KEYWORD_VOID", "LEFT_PAREN", "RIGHT_PAREN", "COMMA", "LEFT_BRACE", "RIGHT_BRACE", "KEYWORD_IF", "KEYWORD_ELSE", "KEYWORD_WHILE", "KEYWORD_RETURN", "EQUAL", "PLUS", "MINUS", "MULTI", "DIVISION", "LESS_THAN", "LESS_THAN_OR_EQUAL", "GREATER_THAN", "GREATER_THAN_OR_EQUAL", "EQUAL_EQUAL", "NOT_EQUAL", "NEWLINE", "COMMENT", "LETTER", "DIGIT", "WHITESPACE"
    };
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
    public static final int NOT_EQUAL=30;
    public static final int COMMA=13;
    public static final int LEFT_BRACE=14;
    public static final int KEYWORD_IF=16;
    public static final int EQUAL=20;
    public static final int KEYWORD_VOID=10;
    public static final int KEYWORD_WHILE=18;
    public static final int LESS_THAN=25;
    public static final int DIVISION=24;
    public static final int LEFT_PAREN=11;
    public static final int PLUS=21;
    public static final int DIGIT=34;
    public static final int COMMENT=32;

    // delegates
    // delegators


        public CMinusParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CMinusParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return CMinusParser.tokenNames; }
    public String getGrammarFileName() { return "src/org/kasunbg/cminus/CMinus.g"; }



    // $ANTLR start "program"
    // src/org/kasunbg/cminus/CMinus.g:36:1: program : declarationList ;
    public final void program() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:37:2: ( declarationList )
            // src/org/kasunbg/cminus/CMinus.g:37:5: declarationList
            {
            pushFollow(FOLLOW_declarationList_in_program68);
            declarationList();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "program"


    // $ANTLR start "declarationList"
    // src/org/kasunbg/cminus/CMinus.g:40:1: declarationList : ( declaration )+ ;
    public final void declarationList() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:41:2: ( ( declaration )+ )
            // src/org/kasunbg/cminus/CMinus.g:41:4: ( declaration )+
            {
            // src/org/kasunbg/cminus/CMinus.g:41:4: ( declaration )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=KEYWORD_INT && LA1_0<=KEYWORD_VOID)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/org/kasunbg/cminus/CMinus.g:41:4: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_declarationList87);
            	    declaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "declarationList"


    // $ANTLR start "declaration"
    // src/org/kasunbg/cminus/CMinus.g:44:1: declaration : ( varDeclaration | funDeclaration );
    public final void declaration() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:45:2: ( varDeclaration | funDeclaration )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==KEYWORD_INT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==ID) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==LEFT_PAREN) ) {
                        alt2=2;
                    }
                    else if ( ((LA2_3>=SEMICOLON && LA2_3<=LEFT_SQUARE_BRACKET)) ) {
                        alt2=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==KEYWORD_VOID) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // src/org/kasunbg/cminus/CMinus.g:45:4: varDeclaration
                    {
                    pushFollow(FOLLOW_varDeclaration_in_declaration102);
                    varDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/kasunbg/cminus/CMinus.g:45:21: funDeclaration
                    {
                    pushFollow(FOLLOW_funDeclaration_in_declaration106);
                    funDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "declaration"


    // $ANTLR start "varDeclaration"
    // src/org/kasunbg/cminus/CMinus.g:48:1: varDeclaration : ( varTypeSpecifier ID SEMICOLON | varTypeSpecifier ID LEFT_SQUARE_BRACKET NUM RIGHT_SQUARE_BRACKET SEMICOLON );
    public final void varDeclaration() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:49:2: ( varTypeSpecifier ID SEMICOLON | varTypeSpecifier ID LEFT_SQUARE_BRACKET NUM RIGHT_SQUARE_BRACKET SEMICOLON )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==KEYWORD_INT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==ID) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==SEMICOLON) ) {
                        alt3=1;
                    }
                    else if ( (LA3_2==LEFT_SQUARE_BRACKET) ) {
                        alt3=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // src/org/kasunbg/cminus/CMinus.g:49:4: varTypeSpecifier ID SEMICOLON
                    {
                    pushFollow(FOLLOW_varTypeSpecifier_in_varDeclaration122);
                    varTypeSpecifier();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,ID,FOLLOW_ID_in_varDeclaration124); if (state.failed) return ;
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_varDeclaration126); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/kasunbg/cminus/CMinus.g:50:4: varTypeSpecifier ID LEFT_SQUARE_BRACKET NUM RIGHT_SQUARE_BRACKET SEMICOLON
                    {
                    pushFollow(FOLLOW_varTypeSpecifier_in_varDeclaration133);
                    varTypeSpecifier();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,ID,FOLLOW_ID_in_varDeclaration135); if (state.failed) return ;
                    match(input,LEFT_SQUARE_BRACKET,FOLLOW_LEFT_SQUARE_BRACKET_in_varDeclaration137); if (state.failed) return ;
                    match(input,NUM,FOLLOW_NUM_in_varDeclaration139); if (state.failed) return ;
                    match(input,RIGHT_SQUARE_BRACKET,FOLLOW_RIGHT_SQUARE_BRACKET_in_varDeclaration141); if (state.failed) return ;
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_varDeclaration143); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "varDeclaration"


    // $ANTLR start "varTypeSpecifier"
    // src/org/kasunbg/cminus/CMinus.g:53:1: varTypeSpecifier : KEYWORD_INT ;
    public final void varTypeSpecifier() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:54:2: ( KEYWORD_INT )
            // src/org/kasunbg/cminus/CMinus.g:54:4: KEYWORD_INT
            {
            match(input,KEYWORD_INT,FOLLOW_KEYWORD_INT_in_varTypeSpecifier155); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "varTypeSpecifier"


    // $ANTLR start "funTypeSpecifier"
    // src/org/kasunbg/cminus/CMinus.g:57:1: funTypeSpecifier : ( KEYWORD_INT | KEYWORD_VOID );
    public final void funTypeSpecifier() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:58:2: ( KEYWORD_INT | KEYWORD_VOID )
            // src/org/kasunbg/cminus/CMinus.g:
            {
            if ( (input.LA(1)>=KEYWORD_INT && input.LA(1)<=KEYWORD_VOID) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "funTypeSpecifier"


    // $ANTLR start "funDeclaration"
    // src/org/kasunbg/cminus/CMinus.g:61:1: funDeclaration : funTypeSpecifier ID LEFT_PAREN params RIGHT_PAREN compoundStmt ;
    public final void funDeclaration() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:62:2: ( funTypeSpecifier ID LEFT_PAREN params RIGHT_PAREN compoundStmt )
            // src/org/kasunbg/cminus/CMinus.g:62:4: funTypeSpecifier ID LEFT_PAREN params RIGHT_PAREN compoundStmt
            {
            pushFollow(FOLLOW_funTypeSpecifier_in_funDeclaration187);
            funTypeSpecifier();

            state._fsp--;
            if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_funDeclaration189); if (state.failed) return ;
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_funDeclaration191); if (state.failed) return ;
            pushFollow(FOLLOW_params_in_funDeclaration193);
            params();

            state._fsp--;
            if (state.failed) return ;
            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_funDeclaration195); if (state.failed) return ;
            pushFollow(FOLLOW_compoundStmt_in_funDeclaration197);
            compoundStmt();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "funDeclaration"


    // $ANTLR start "params"
    // src/org/kasunbg/cminus/CMinus.g:65:1: params : ( paramList | KEYWORD_VOID );
    public final void params() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:66:2: ( paramList | KEYWORD_VOID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==KEYWORD_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==KEYWORD_VOID) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // src/org/kasunbg/cminus/CMinus.g:66:4: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_params212);
                    paramList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/kasunbg/cminus/CMinus.g:66:16: KEYWORD_VOID
                    {
                    match(input,KEYWORD_VOID,FOLLOW_KEYWORD_VOID_in_params216); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "params"


    // $ANTLR start "paramList"
    // src/org/kasunbg/cminus/CMinus.g:69:1: paramList : param ( COMMA param )* ;
    public final void paramList() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:70:2: ( param ( COMMA param )* )
            // src/org/kasunbg/cminus/CMinus.g:70:4: param ( COMMA param )*
            {
            pushFollow(FOLLOW_param_in_paramList229);
            param();

            state._fsp--;
            if (state.failed) return ;
            // src/org/kasunbg/cminus/CMinus.g:70:10: ( COMMA param )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // src/org/kasunbg/cminus/CMinus.g:70:12: COMMA param
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_paramList233); if (state.failed) return ;
            	    pushFollow(FOLLOW_param_in_paramList235);
            	    param();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "paramList"


    // $ANTLR start "param"
    // src/org/kasunbg/cminus/CMinus.g:73:1: param : varTypeSpecifier ID ( LEFT_SQUARE_BRACKET RIGHT_SQUARE_BRACKET )? ;
    public final void param() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:74:2: ( varTypeSpecifier ID ( LEFT_SQUARE_BRACKET RIGHT_SQUARE_BRACKET )? )
            // src/org/kasunbg/cminus/CMinus.g:74:4: varTypeSpecifier ID ( LEFT_SQUARE_BRACKET RIGHT_SQUARE_BRACKET )?
            {
            pushFollow(FOLLOW_varTypeSpecifier_in_param251);
            varTypeSpecifier();

            state._fsp--;
            if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_param253); if (state.failed) return ;
            // src/org/kasunbg/cminus/CMinus.g:74:24: ( LEFT_SQUARE_BRACKET RIGHT_SQUARE_BRACKET )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==LEFT_SQUARE_BRACKET) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // src/org/kasunbg/cminus/CMinus.g:74:26: LEFT_SQUARE_BRACKET RIGHT_SQUARE_BRACKET
                    {
                    match(input,LEFT_SQUARE_BRACKET,FOLLOW_LEFT_SQUARE_BRACKET_in_param257); if (state.failed) return ;
                    match(input,RIGHT_SQUARE_BRACKET,FOLLOW_RIGHT_SQUARE_BRACKET_in_param259); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "param"


    // $ANTLR start "compoundStmt"
    // src/org/kasunbg/cminus/CMinus.g:77:1: compoundStmt : LEFT_BRACE localDeclarations statementList RIGHT_BRACE ;
    public final void compoundStmt() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:78:2: ( LEFT_BRACE localDeclarations statementList RIGHT_BRACE )
            // src/org/kasunbg/cminus/CMinus.g:78:4: LEFT_BRACE localDeclarations statementList RIGHT_BRACE
            {
            match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_compoundStmt274); if (state.failed) return ;
            pushFollow(FOLLOW_localDeclarations_in_compoundStmt276);
            localDeclarations();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_statementList_in_compoundStmt278);
            statementList();

            state._fsp--;
            if (state.failed) return ;
            match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_compoundStmt280); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "compoundStmt"


    // $ANTLR start "localDeclarations"
    // src/org/kasunbg/cminus/CMinus.g:81:1: localDeclarations : ( varDeclaration )* ;
    public final void localDeclarations() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:82:2: ( ( varDeclaration )* )
            // src/org/kasunbg/cminus/CMinus.g:82:4: ( varDeclaration )*
            {
            // src/org/kasunbg/cminus/CMinus.g:82:4: ( varDeclaration )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==KEYWORD_INT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // src/org/kasunbg/cminus/CMinus.g:82:4: varDeclaration
            	    {
            	    pushFollow(FOLLOW_varDeclaration_in_localDeclarations293);
            	    varDeclaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "localDeclarations"


    // $ANTLR start "statementList"
    // src/org/kasunbg/cminus/CMinus.g:85:1: statementList : ( statement )* ;
    public final void statementList() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:86:2: ( ( statement )* )
            // src/org/kasunbg/cminus/CMinus.g:86:4: ( statement )*
            {
            // src/org/kasunbg/cminus/CMinus.g:86:4: ( statement )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=ID && LA8_0<=SEMICOLON)||LA8_0==NUM||LA8_0==LEFT_PAREN||LA8_0==LEFT_BRACE||LA8_0==KEYWORD_IF||(LA8_0>=KEYWORD_WHILE && LA8_0<=KEYWORD_RETURN)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // src/org/kasunbg/cminus/CMinus.g:86:4: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_statementList307);
            	    statement();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "statementList"


    // $ANTLR start "statement"
    // src/org/kasunbg/cminus/CMinus.g:89:1: statement : ( expressionStmt | compoundStmt | selectionStmt | iterationStmt | returnStmt );
    public final void statement() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:90:2: ( expressionStmt | compoundStmt | selectionStmt | iterationStmt | returnStmt )
            int alt9=5;
            switch ( input.LA(1) ) {
            case ID:
            case SEMICOLON:
            case NUM:
            case LEFT_PAREN:
                {
                alt9=1;
                }
                break;
            case LEFT_BRACE:
                {
                alt9=2;
                }
                break;
            case KEYWORD_IF:
                {
                alt9=3;
                }
                break;
            case KEYWORD_WHILE:
                {
                alt9=4;
                }
                break;
            case KEYWORD_RETURN:
                {
                alt9=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // src/org/kasunbg/cminus/CMinus.g:90:4: expressionStmt
                    {
                    pushFollow(FOLLOW_expressionStmt_in_statement321);
                    expressionStmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/kasunbg/cminus/CMinus.g:91:4: compoundStmt
                    {
                    pushFollow(FOLLOW_compoundStmt_in_statement326);
                    compoundStmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/org/kasunbg/cminus/CMinus.g:92:4: selectionStmt
                    {
                    pushFollow(FOLLOW_selectionStmt_in_statement331);
                    selectionStmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/org/kasunbg/cminus/CMinus.g:93:4: iterationStmt
                    {
                    pushFollow(FOLLOW_iterationStmt_in_statement336);
                    iterationStmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/org/kasunbg/cminus/CMinus.g:94:4: returnStmt
                    {
                    pushFollow(FOLLOW_returnStmt_in_statement341);
                    returnStmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "statement"


    // $ANTLR start "expressionStmt"
    // src/org/kasunbg/cminus/CMinus.g:97:1: expressionStmt : ( expression SEMICOLON | SEMICOLON );
    public final void expressionStmt() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:98:2: ( expression SEMICOLON | SEMICOLON )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID||LA10_0==NUM||LA10_0==LEFT_PAREN) ) {
                alt10=1;
            }
            else if ( (LA10_0==SEMICOLON) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // src/org/kasunbg/cminus/CMinus.g:98:4: expression SEMICOLON
                    {
                    pushFollow(FOLLOW_expression_in_expressionStmt355);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_expressionStmt357); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/kasunbg/cminus/CMinus.g:98:27: SEMICOLON
                    {
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_expressionStmt361); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expressionStmt"


    // $ANTLR start "selectionStmt"
    // src/org/kasunbg/cminus/CMinus.g:101:1: selectionStmt : KEYWORD_IF LEFT_PAREN expression RIGHT_PAREN ( statement ) ( ( KEYWORD_ELSE )=> KEYWORD_ELSE ( statement ) )? ;
    public final void selectionStmt() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:102:2: ( KEYWORD_IF LEFT_PAREN expression RIGHT_PAREN ( statement ) ( ( KEYWORD_ELSE )=> KEYWORD_ELSE ( statement ) )? )
            // src/org/kasunbg/cminus/CMinus.g:102:4: KEYWORD_IF LEFT_PAREN expression RIGHT_PAREN ( statement ) ( ( KEYWORD_ELSE )=> KEYWORD_ELSE ( statement ) )?
            {
            match(input,KEYWORD_IF,FOLLOW_KEYWORD_IF_in_selectionStmt378); if (state.failed) return ;
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_selectionStmt380); if (state.failed) return ;
            pushFollow(FOLLOW_expression_in_selectionStmt382);
            expression();

            state._fsp--;
            if (state.failed) return ;
            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_selectionStmt384); if (state.failed) return ;
            // src/org/kasunbg/cminus/CMinus.g:102:49: ( statement )
            // src/org/kasunbg/cminus/CMinus.g:102:50: statement
            {
            pushFollow(FOLLOW_statement_in_selectionStmt387);
            statement();

            state._fsp--;
            if (state.failed) return ;

            }

            // src/org/kasunbg/cminus/CMinus.g:103:3: ( ( KEYWORD_ELSE )=> KEYWORD_ELSE ( statement ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==KEYWORD_ELSE) ) {
                int LA11_1 = input.LA(2);

                if ( (synpred1_CMinus()) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // src/org/kasunbg/cminus/CMinus.g:103:5: ( KEYWORD_ELSE )=> KEYWORD_ELSE ( statement )
                    {
                    match(input,KEYWORD_ELSE,FOLLOW_KEYWORD_ELSE_in_selectionStmt400); if (state.failed) return ;
                    // src/org/kasunbg/cminus/CMinus.g:103:36: ( statement )
                    // src/org/kasunbg/cminus/CMinus.g:103:37: statement
                    {
                    pushFollow(FOLLOW_statement_in_selectionStmt403);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "selectionStmt"


    // $ANTLR start "iterationStmt"
    // src/org/kasunbg/cminus/CMinus.g:106:1: iterationStmt : KEYWORD_WHILE LEFT_PAREN expression RIGHT_PAREN statement ;
    public final void iterationStmt() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:107:2: ( KEYWORD_WHILE LEFT_PAREN expression RIGHT_PAREN statement )
            // src/org/kasunbg/cminus/CMinus.g:107:4: KEYWORD_WHILE LEFT_PAREN expression RIGHT_PAREN statement
            {
            match(input,KEYWORD_WHILE,FOLLOW_KEYWORD_WHILE_in_iterationStmt428); if (state.failed) return ;
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_iterationStmt430); if (state.failed) return ;
            pushFollow(FOLLOW_expression_in_iterationStmt432);
            expression();

            state._fsp--;
            if (state.failed) return ;
            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_iterationStmt434); if (state.failed) return ;
            pushFollow(FOLLOW_statement_in_iterationStmt436);
            statement();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "iterationStmt"


    // $ANTLR start "returnStmt"
    // src/org/kasunbg/cminus/CMinus.g:110:1: returnStmt : KEYWORD_RETURN ( () | expression ) SEMICOLON ;
    public final void returnStmt() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:111:2: ( KEYWORD_RETURN ( () | expression ) SEMICOLON )
            // src/org/kasunbg/cminus/CMinus.g:111:4: KEYWORD_RETURN ( () | expression ) SEMICOLON
            {
            match(input,KEYWORD_RETURN,FOLLOW_KEYWORD_RETURN_in_returnStmt451); if (state.failed) return ;
            // src/org/kasunbg/cminus/CMinus.g:111:19: ( () | expression )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==SEMICOLON) ) {
                alt12=1;
            }
            else if ( (LA12_0==ID||LA12_0==NUM||LA12_0==LEFT_PAREN) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // src/org/kasunbg/cminus/CMinus.g:111:21: ()
                    {
                    // src/org/kasunbg/cminus/CMinus.g:111:21: ()
                    // src/org/kasunbg/cminus/CMinus.g:111:23: 
                    {
                    }


                    }
                    break;
                case 2 :
                    // src/org/kasunbg/cminus/CMinus.g:111:27: expression
                    {
                    pushFollow(FOLLOW_expression_in_returnStmt461);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_returnStmt466); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "returnStmt"


    // $ANTLR start "expression"
    // src/org/kasunbg/cminus/CMinus.g:114:1: expression : ( ( var EQUAL )=> var EQUAL expression | simpleExpression );
    public final void expression() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:115:2: ( ( var EQUAL )=> var EQUAL expression | simpleExpression )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ID) ) {
                int LA13_1 = input.LA(2);

                if ( (synpred2_CMinus()) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA13_0==NUM||LA13_0==LEFT_PAREN) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // src/org/kasunbg/cminus/CMinus.g:115:4: ( var EQUAL )=> var EQUAL expression
                    {
                    pushFollow(FOLLOW_var_in_expression490);
                    var();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,EQUAL,FOLLOW_EQUAL_in_expression492); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_expression494);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/kasunbg/cminus/CMinus.g:116:4: simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expression500);
                    simpleExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expression"


    // $ANTLR start "var"
    // src/org/kasunbg/cminus/CMinus.g:119:1: var : ID ( LEFT_SQUARE_BRACKET expression RIGHT_SQUARE_BRACKET )? ;
    public final void var() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:119:5: ( ID ( LEFT_SQUARE_BRACKET expression RIGHT_SQUARE_BRACKET )? )
            // src/org/kasunbg/cminus/CMinus.g:119:8: ID ( LEFT_SQUARE_BRACKET expression RIGHT_SQUARE_BRACKET )?
            {
            match(input,ID,FOLLOW_ID_in_var522); if (state.failed) return ;
            // src/org/kasunbg/cminus/CMinus.g:119:11: ( LEFT_SQUARE_BRACKET expression RIGHT_SQUARE_BRACKET )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==LEFT_SQUARE_BRACKET) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // src/org/kasunbg/cminus/CMinus.g:119:13: LEFT_SQUARE_BRACKET expression RIGHT_SQUARE_BRACKET
                    {
                    match(input,LEFT_SQUARE_BRACKET,FOLLOW_LEFT_SQUARE_BRACKET_in_var526); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_var528);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RIGHT_SQUARE_BRACKET,FOLLOW_RIGHT_SQUARE_BRACKET_in_var530); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "var"


    // $ANTLR start "simpleExpression"
    // src/org/kasunbg/cminus/CMinus.g:122:1: simpleExpression : additiveExpression ( relop additiveExpression )? ;
    public final void simpleExpression() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:123:2: ( additiveExpression ( relop additiveExpression )? )
            // src/org/kasunbg/cminus/CMinus.g:123:4: additiveExpression ( relop additiveExpression )?
            {
            pushFollow(FOLLOW_additiveExpression_in_simpleExpression549);
            additiveExpression();

            state._fsp--;
            if (state.failed) return ;
            // src/org/kasunbg/cminus/CMinus.g:123:23: ( relop additiveExpression )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=LESS_THAN && LA15_0<=NOT_EQUAL)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // src/org/kasunbg/cminus/CMinus.g:123:24: relop additiveExpression
                    {
                    pushFollow(FOLLOW_relop_in_simpleExpression552);
                    relop();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_additiveExpression_in_simpleExpression554);
                    additiveExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "simpleExpression"


    // $ANTLR start "relop"
    // src/org/kasunbg/cminus/CMinus.g:126:1: relop : ( '<=' | '<' | '>=' | '>' | '==' | '!=' );
    public final void relop() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:127:2: ( '<=' | '<' | '>=' | '>' | '==' | '!=' )
            // src/org/kasunbg/cminus/CMinus.g:
            {
            if ( (input.LA(1)>=LESS_THAN && input.LA(1)<=NOT_EQUAL) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "relop"


    // $ANTLR start "additiveExpression"
    // src/org/kasunbg/cminus/CMinus.g:130:1: additiveExpression : term ( addop term )* ;
    public final void additiveExpression() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:131:2: ( term ( addop term )* )
            // src/org/kasunbg/cminus/CMinus.g:131:4: term ( addop term )*
            {
            pushFollow(FOLLOW_term_in_additiveExpression607);
            term();

            state._fsp--;
            if (state.failed) return ;
            // src/org/kasunbg/cminus/CMinus.g:131:9: ( addop term )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=PLUS && LA16_0<=MINUS)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // src/org/kasunbg/cminus/CMinus.g:131:10: addop term
            	    {
            	    pushFollow(FOLLOW_addop_in_additiveExpression610);
            	    addop();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    pushFollow(FOLLOW_term_in_additiveExpression612);
            	    term();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "additiveExpression"


    // $ANTLR start "addop"
    // src/org/kasunbg/cminus/CMinus.g:134:1: addop : ( PLUS | MINUS );
    public final void addop() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:135:2: ( PLUS | MINUS )
            // src/org/kasunbg/cminus/CMinus.g:
            {
            if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "addop"


    // $ANTLR start "term"
    // src/org/kasunbg/cminus/CMinus.g:138:1: term : factor ( mulop factor )* ;
    public final void term() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:139:2: ( factor ( mulop factor )* )
            // src/org/kasunbg/cminus/CMinus.g:139:4: factor ( mulop factor )*
            {
            pushFollow(FOLLOW_factor_in_term644);
            factor();

            state._fsp--;
            if (state.failed) return ;
            // src/org/kasunbg/cminus/CMinus.g:139:11: ( mulop factor )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=MULTI && LA17_0<=DIVISION)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // src/org/kasunbg/cminus/CMinus.g:139:12: mulop factor
            	    {
            	    pushFollow(FOLLOW_mulop_in_term647);
            	    mulop();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    pushFollow(FOLLOW_factor_in_term649);
            	    factor();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "term"


    // $ANTLR start "mulop"
    // src/org/kasunbg/cminus/CMinus.g:142:1: mulop : ( MULTI | DIVISION );
    public final void mulop() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:143:2: ( MULTI | DIVISION )
            // src/org/kasunbg/cminus/CMinus.g:
            {
            if ( (input.LA(1)>=MULTI && input.LA(1)<=DIVISION) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "mulop"


    // $ANTLR start "factor"
    // src/org/kasunbg/cminus/CMinus.g:146:1: factor : ( LEFT_PAREN expression RIGHT_PAREN | var | call | NUM );
    public final void factor() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:147:2: ( LEFT_PAREN expression RIGHT_PAREN | var | call | NUM )
            int alt18=4;
            switch ( input.LA(1) ) {
            case LEFT_PAREN:
                {
                alt18=1;
                }
                break;
            case ID:
                {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==LEFT_PAREN) ) {
                    alt18=3;
                }
                else if ( ((LA18_2>=SEMICOLON && LA18_2<=LEFT_SQUARE_BRACKET)||LA18_2==RIGHT_SQUARE_BRACKET||(LA18_2>=RIGHT_PAREN && LA18_2<=COMMA)||(LA18_2>=PLUS && LA18_2<=NOT_EQUAL)) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }
                }
                break;
            case NUM:
                {
                alt18=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // src/org/kasunbg/cminus/CMinus.g:147:4: LEFT_PAREN expression RIGHT_PAREN
                    {
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_factor689); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_factor691);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_factor693); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/kasunbg/cminus/CMinus.g:148:4: var
                    {
                    pushFollow(FOLLOW_var_in_factor698);
                    var();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/org/kasunbg/cminus/CMinus.g:149:4: call
                    {
                    pushFollow(FOLLOW_call_in_factor703);
                    call();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/org/kasunbg/cminus/CMinus.g:150:4: NUM
                    {
                    match(input,NUM,FOLLOW_NUM_in_factor708); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "factor"


    // $ANTLR start "call"
    // src/org/kasunbg/cminus/CMinus.g:153:1: call : ID LEFT_PAREN args RIGHT_PAREN ;
    public final void call() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:154:2: ( ID LEFT_PAREN args RIGHT_PAREN )
            // src/org/kasunbg/cminus/CMinus.g:154:4: ID LEFT_PAREN args RIGHT_PAREN
            {
            match(input,ID,FOLLOW_ID_in_call723); if (state.failed) return ;
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_call725); if (state.failed) return ;
            pushFollow(FOLLOW_args_in_call727);
            args();

            state._fsp--;
            if (state.failed) return ;
            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_call729); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "call"


    // $ANTLR start "args"
    // src/org/kasunbg/cminus/CMinus.g:157:1: args : ( argList | () );
    public final void args() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:158:2: ( argList | () )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ID||LA19_0==NUM||LA19_0==LEFT_PAREN) ) {
                alt19=1;
            }
            else if ( (LA19_0==RIGHT_PAREN) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // src/org/kasunbg/cminus/CMinus.g:158:4: argList
                    {
                    pushFollow(FOLLOW_argList_in_args744);
                    argList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/kasunbg/cminus/CMinus.g:158:14: ()
                    {
                    // src/org/kasunbg/cminus/CMinus.g:158:14: ()
                    // src/org/kasunbg/cminus/CMinus.g:158:15: 
                    {
                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "args"


    // $ANTLR start "argList"
    // src/org/kasunbg/cminus/CMinus.g:161:1: argList : expression ( COMMA expression )* ;
    public final void argList() throws RecognitionException {
        try {
            // src/org/kasunbg/cminus/CMinus.g:162:2: ( expression ( COMMA expression )* )
            // src/org/kasunbg/cminus/CMinus.g:162:4: expression ( COMMA expression )*
            {
            pushFollow(FOLLOW_expression_in_argList766);
            expression();

            state._fsp--;
            if (state.failed) return ;
            // src/org/kasunbg/cminus/CMinus.g:162:15: ( COMMA expression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==COMMA) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // src/org/kasunbg/cminus/CMinus.g:162:16: COMMA expression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_argList769); if (state.failed) return ;
            	    pushFollow(FOLLOW_expression_in_argList771);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "argList"

    // $ANTLR start synpred1_CMinus
    public final void synpred1_CMinus_fragment() throws RecognitionException {   
        // src/org/kasunbg/cminus/CMinus.g:103:5: ( KEYWORD_ELSE )
        // src/org/kasunbg/cminus/CMinus.g:103:6: KEYWORD_ELSE
        {
        match(input,KEYWORD_ELSE,FOLLOW_KEYWORD_ELSE_in_synpred1_CMinus395); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_CMinus

    // $ANTLR start synpred2_CMinus
    public final void synpred2_CMinus_fragment() throws RecognitionException {   
        // src/org/kasunbg/cminus/CMinus.g:115:4: ( var EQUAL )
        // src/org/kasunbg/cminus/CMinus.g:115:5: var EQUAL
        {
        pushFollow(FOLLOW_var_in_synpred2_CMinus483);
        var();

        state._fsp--;
        if (state.failed) return ;
        match(input,EQUAL,FOLLOW_EQUAL_in_synpred2_CMinus485); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_CMinus

    // Delegated rules

    public final boolean synpred2_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_declarationList_in_program68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_declarationList87 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_varDeclaration_in_declaration102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funDeclaration_in_declaration106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varTypeSpecifier_in_varDeclaration122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_varDeclaration124 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMICOLON_in_varDeclaration126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varTypeSpecifier_in_varDeclaration133 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_varDeclaration135 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LEFT_SQUARE_BRACKET_in_varDeclaration137 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NUM_in_varDeclaration139 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_BRACKET_in_varDeclaration141 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMICOLON_in_varDeclaration143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_INT_in_varTypeSpecifier155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_funTypeSpecifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funTypeSpecifier_in_funDeclaration187 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_funDeclaration189 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_funDeclaration191 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_params_in_funDeclaration193 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_funDeclaration195 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_compoundStmt_in_funDeclaration197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_params212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_VOID_in_params216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramList229 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_paramList233 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_param_in_paramList235 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_varTypeSpecifier_in_param251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_param253 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_LEFT_SQUARE_BRACKET_in_param257 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_BRACKET_in_param259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACE_in_compoundStmt274 = new BitSet(new long[]{0x00000000000DCAB0L});
    public static final BitSet FOLLOW_localDeclarations_in_compoundStmt276 = new BitSet(new long[]{0x00000000000DC8B0L});
    public static final BitSet FOLLOW_statementList_in_compoundStmt278 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RIGHT_BRACE_in_compoundStmt280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_localDeclarations293 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_statement_in_statementList307 = new BitSet(new long[]{0x00000000000D48B2L});
    public static final BitSet FOLLOW_expressionStmt_in_statement321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundStmt_in_statement326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectionStmt_in_statement331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterationStmt_in_statement336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStmt_in_statement341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionStmt355 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMICOLON_in_expressionStmt357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_expressionStmt361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_IF_in_selectionStmt378 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_selectionStmt380 = new BitSet(new long[]{0x0000000000000890L});
    public static final BitSet FOLLOW_expression_in_selectionStmt382 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_selectionStmt384 = new BitSet(new long[]{0x00000000000D48B0L});
    public static final BitSet FOLLOW_statement_in_selectionStmt387 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_KEYWORD_ELSE_in_selectionStmt400 = new BitSet(new long[]{0x00000000000D48B0L});
    public static final BitSet FOLLOW_statement_in_selectionStmt403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_WHILE_in_iterationStmt428 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_iterationStmt430 = new BitSet(new long[]{0x0000000000000890L});
    public static final BitSet FOLLOW_expression_in_iterationStmt432 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_iterationStmt434 = new BitSet(new long[]{0x00000000000D48B0L});
    public static final BitSet FOLLOW_statement_in_iterationStmt436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_RETURN_in_returnStmt451 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_expression_in_returnStmt461 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMICOLON_in_returnStmt466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_expression490 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_EQUAL_in_expression492 = new BitSet(new long[]{0x0000000000000890L});
    public static final BitSet FOLLOW_expression_in_expression494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_var522 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_LEFT_SQUARE_BRACKET_in_var526 = new BitSet(new long[]{0x0000000000000890L});
    public static final BitSet FOLLOW_expression_in_var528 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_BRACKET_in_var530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_simpleExpression549 = new BitSet(new long[]{0x000000007E000002L});
    public static final BitSet FOLLOW_relop_in_simpleExpression552 = new BitSet(new long[]{0x0000000000000890L});
    public static final BitSet FOLLOW_additiveExpression_in_simpleExpression554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_relop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_additiveExpression607 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_addop_in_additiveExpression610 = new BitSet(new long[]{0x0000000000000890L});
    public static final BitSet FOLLOW_term_in_additiveExpression612 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_set_in_addop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term644 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_mulop_in_term647 = new BitSet(new long[]{0x0000000000000890L});
    public static final BitSet FOLLOW_factor_in_term649 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_set_in_mulop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_factor689 = new BitSet(new long[]{0x0000000000000890L});
    public static final BitSet FOLLOW_expression_in_factor691 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_factor693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_factor698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_factor703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_factor708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_call723 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_call725 = new BitSet(new long[]{0x0000000000001890L});
    public static final BitSet FOLLOW_args_in_call727 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_call729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argList_in_args744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_argList766 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_argList769 = new BitSet(new long[]{0x0000000000000890L});
    public static final BitSet FOLLOW_expression_in_argList771 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_KEYWORD_ELSE_in_synpred1_CMinus395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_synpred2_CMinus483 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred2_CMinus485 = new BitSet(new long[]{0x0000000000000002L});

}