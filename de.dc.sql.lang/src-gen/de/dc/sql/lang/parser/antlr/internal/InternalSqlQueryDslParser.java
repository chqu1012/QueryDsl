package de.dc.sql.lang.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.dc.sql.lang.services.SqlQueryDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSqlQueryDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_MLTEXT", "RULE_STRING", "RULE_ID", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Query'", "'('", "','", "')'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'<'", "'>'", "'>='", "'||'", "'&&'", "'=='", "'!='", "'==='", "'!=='", "'instanceof'", "'->'", "'..<'", "'..'", "'=>'", "'<>'", "'?:'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'++'", "'--'", "'.'", "'::'", "'?.'", "'#'", "'{'", "'}'", "'['", "']'", "'|'", "';'", "'if'", "'else'", "'switch'", "':'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'extends'", "'static'", "'import'", "'extension'", "'super'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'synchronized'", "'catch'", "'?'", "'&'"
    };
    public static final int RULE_HEX=7;
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int RULE_DECIMAL=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int RULE_MLTEXT=4;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__88=88;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalSqlQueryDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSqlQueryDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSqlQueryDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSqlQueryDsl.g"; }



     	private SqlQueryDslGrammarAccess grammarAccess;

        public InternalSqlQueryDslParser(TokenStream input, SqlQueryDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Application";
       	}

       	@Override
       	protected SqlQueryDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleApplication"
    // InternalSqlQueryDsl.g:64:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalSqlQueryDsl.g:64:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalSqlQueryDsl.g:65:2: iv_ruleApplication= ruleApplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getApplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleApplication=ruleApplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleApplication; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalSqlQueryDsl.g:71:1: ruleApplication returns [EObject current=null] : ( () ( ( (lv_queries_1_0= ruleQuery ) ) ( (lv_queries_2_0= ruleQuery ) )* )? ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        EObject lv_queries_1_0 = null;

        EObject lv_queries_2_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:77:2: ( ( () ( ( (lv_queries_1_0= ruleQuery ) ) ( (lv_queries_2_0= ruleQuery ) )* )? ) )
            // InternalSqlQueryDsl.g:78:2: ( () ( ( (lv_queries_1_0= ruleQuery ) ) ( (lv_queries_2_0= ruleQuery ) )* )? )
            {
            // InternalSqlQueryDsl.g:78:2: ( () ( ( (lv_queries_1_0= ruleQuery ) ) ( (lv_queries_2_0= ruleQuery ) )* )? )
            // InternalSqlQueryDsl.g:79:3: () ( ( (lv_queries_1_0= ruleQuery ) ) ( (lv_queries_2_0= ruleQuery ) )* )?
            {
            // InternalSqlQueryDsl.g:79:3: ()
            // InternalSqlQueryDsl.g:80:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getApplicationAccess().getApplicationAction_0(),
              					current);
              			
            }

            }

            // InternalSqlQueryDsl.g:86:3: ( ( (lv_queries_1_0= ruleQuery ) ) ( (lv_queries_2_0= ruleQuery ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSqlQueryDsl.g:87:4: ( (lv_queries_1_0= ruleQuery ) ) ( (lv_queries_2_0= ruleQuery ) )*
                    {
                    // InternalSqlQueryDsl.g:87:4: ( (lv_queries_1_0= ruleQuery ) )
                    // InternalSqlQueryDsl.g:88:5: (lv_queries_1_0= ruleQuery )
                    {
                    // InternalSqlQueryDsl.g:88:5: (lv_queries_1_0= ruleQuery )
                    // InternalSqlQueryDsl.g:89:6: lv_queries_1_0= ruleQuery
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getApplicationAccess().getQueriesQueryParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_3);
                    lv_queries_1_0=ruleQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getApplicationRule());
                      						}
                      						add(
                      							current,
                      							"queries",
                      							lv_queries_1_0,
                      							"de.dc.sql.lang.SqlQueryDsl.Query");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSqlQueryDsl.g:106:4: ( (lv_queries_2_0= ruleQuery ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalSqlQueryDsl.g:107:5: (lv_queries_2_0= ruleQuery )
                    	    {
                    	    // InternalSqlQueryDsl.g:107:5: (lv_queries_2_0= ruleQuery )
                    	    // InternalSqlQueryDsl.g:108:6: lv_queries_2_0= ruleQuery
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getApplicationAccess().getQueriesQueryParserRuleCall_1_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_3);
                    	    lv_queries_2_0=ruleQuery();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getApplicationRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"queries",
                    	      							lv_queries_2_0,
                    	      							"de.dc.sql.lang.SqlQueryDsl.Query");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleQuery"
    // InternalSqlQueryDsl.g:130:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalSqlQueryDsl.g:130:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalSqlQueryDsl.g:131:2: iv_ruleQuery= ruleQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQuery=ruleQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuery; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalSqlQueryDsl.g:137:1: ruleQuery returns [EObject current=null] : ( () otherlv_1= 'Query' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' ( (lv_statement_8_0= RULE_MLTEXT ) ) ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_statement_8_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:143:2: ( ( () otherlv_1= 'Query' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' ( (lv_statement_8_0= RULE_MLTEXT ) ) ) )
            // InternalSqlQueryDsl.g:144:2: ( () otherlv_1= 'Query' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' ( (lv_statement_8_0= RULE_MLTEXT ) ) )
            {
            // InternalSqlQueryDsl.g:144:2: ( () otherlv_1= 'Query' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' ( (lv_statement_8_0= RULE_MLTEXT ) ) )
            // InternalSqlQueryDsl.g:145:3: () otherlv_1= 'Query' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' ( (lv_statement_8_0= RULE_MLTEXT ) )
            {
            // InternalSqlQueryDsl.g:145:3: ()
            // InternalSqlQueryDsl.g:146:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getQueryAccess().getQueryAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getQueryAccess().getQueryKeyword_1());
              		
            }
            // InternalSqlQueryDsl.g:156:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSqlQueryDsl.g:157:4: (lv_name_2_0= ruleEString )
            {
            // InternalSqlQueryDsl.g:157:4: (lv_name_2_0= ruleEString )
            // InternalSqlQueryDsl.g:158:5: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQueryAccess().getNameEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getQueryRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"de.dc.sql.lang.SqlQueryDsl.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getQueryAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalSqlQueryDsl.g:179:3: ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||LA4_0==15||LA4_0==37) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSqlQueryDsl.g:180:4: ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    {
                    // InternalSqlQueryDsl.g:180:4: ( (lv_parameters_4_0= ruleParameter ) )
                    // InternalSqlQueryDsl.g:181:5: (lv_parameters_4_0= ruleParameter )
                    {
                    // InternalSqlQueryDsl.g:181:5: (lv_parameters_4_0= ruleParameter )
                    // InternalSqlQueryDsl.g:182:6: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getQueryAccess().getParametersParameterParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_7);
                    lv_parameters_4_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getQueryRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_4_0,
                      							"de.dc.sql.lang.SqlQueryDsl.Parameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSqlQueryDsl.g:199:4: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSqlQueryDsl.g:200:5: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getQueryAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalSqlQueryDsl.g:204:5: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // InternalSqlQueryDsl.g:205:6: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // InternalSqlQueryDsl.g:205:6: (lv_parameters_6_0= ruleParameter )
                    	    // InternalSqlQueryDsl.g:206:7: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getQueryAccess().getParametersParameterParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_7);
                    	    lv_parameters_6_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getQueryRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_6_0,
                    	      								"de.dc.sql.lang.SqlQueryDsl.Parameter");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getQueryAccess().getRightParenthesisKeyword_5());
              		
            }
            // InternalSqlQueryDsl.g:229:3: ( (lv_statement_8_0= RULE_MLTEXT ) )
            // InternalSqlQueryDsl.g:230:4: (lv_statement_8_0= RULE_MLTEXT )
            {
            // InternalSqlQueryDsl.g:230:4: (lv_statement_8_0= RULE_MLTEXT )
            // InternalSqlQueryDsl.g:231:5: lv_statement_8_0= RULE_MLTEXT
            {
            lv_statement_8_0=(Token)match(input,RULE_MLTEXT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_statement_8_0, grammarAccess.getQueryAccess().getStatementMLTEXTTerminalRuleCall_6_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getQueryRule());
              					}
              					setWithLastConsumed(
              						current,
              						"statement",
              						lv_statement_8_0,
              						"de.dc.sql.lang.SqlQueryDsl.MLTEXT");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleEString"
    // InternalSqlQueryDsl.g:251:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSqlQueryDsl.g:251:47: (iv_ruleEString= ruleEString EOF )
            // InternalSqlQueryDsl.g:252:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSqlQueryDsl.g:258:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSqlQueryDsl.g:264:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSqlQueryDsl.g:265:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSqlQueryDsl.g:265:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSqlQueryDsl.g:266:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSqlQueryDsl.g:274:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleParameter"
    // InternalSqlQueryDsl.g:285:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalSqlQueryDsl.g:285:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalSqlQueryDsl.g:286:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalSqlQueryDsl.g:292:1: ruleParameter returns [EObject current=null] : ( () ( (lv_type_1_0= ruleJvmTypeReference ) ) ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:298:2: ( ( () ( (lv_type_1_0= ruleJvmTypeReference ) ) ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSqlQueryDsl.g:299:2: ( () ( (lv_type_1_0= ruleJvmTypeReference ) ) ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSqlQueryDsl.g:299:2: ( () ( (lv_type_1_0= ruleJvmTypeReference ) ) ( (lv_name_2_0= ruleEString ) ) )
            // InternalSqlQueryDsl.g:300:3: () ( (lv_type_1_0= ruleJvmTypeReference ) ) ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSqlQueryDsl.g:300:3: ()
            // InternalSqlQueryDsl.g:301:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterAccess().getParameterAction_0(),
              					current);
              			
            }

            }

            // InternalSqlQueryDsl.g:307:3: ( (lv_type_1_0= ruleJvmTypeReference ) )
            // InternalSqlQueryDsl.g:308:4: (lv_type_1_0= ruleJvmTypeReference )
            {
            // InternalSqlQueryDsl.g:308:4: (lv_type_1_0= ruleJvmTypeReference )
            // InternalSqlQueryDsl.g:309:5: lv_type_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterAccess().getTypeJvmTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_type_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_1_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSqlQueryDsl.g:326:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSqlQueryDsl.g:327:4: (lv_name_2_0= ruleEString )
            {
            // InternalSqlQueryDsl.g:327:4: (lv_name_2_0= ruleEString )
            // InternalSqlQueryDsl.g:328:5: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"de.dc.sql.lang.SqlQueryDsl.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleXExpression"
    // InternalSqlQueryDsl.g:349:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // InternalSqlQueryDsl.g:349:52: (iv_ruleXExpression= ruleXExpression EOF )
            // InternalSqlQueryDsl.g:350:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // InternalSqlQueryDsl.g:356:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:362:2: (this_XAssignment_0= ruleXAssignment )
            // InternalSqlQueryDsl.g:363:2: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_XAssignment_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // InternalSqlQueryDsl.g:374:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // InternalSqlQueryDsl.g:374:52: (iv_ruleXAssignment= ruleXAssignment EOF )
            // InternalSqlQueryDsl.g:375:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // InternalSqlQueryDsl.g:381:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:387:2: ( ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // InternalSqlQueryDsl.g:388:2: ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // InternalSqlQueryDsl.g:388:2: ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt7=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EOF||(LA7_1>=RULE_STRING && LA7_1<=RULE_DECIMAL)||(LA7_1>=15 && LA7_1<=17)||(LA7_1>=19 && LA7_1<=57)||(LA7_1>=59 && LA7_1<=86)) ) {
                    alt7=2;
                }
                else if ( (LA7_1==18) ) {
                    alt7=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case 71:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==18) ) {
                    alt7=1;
                }
                else if ( (LA7_2==EOF||(LA7_2>=RULE_STRING && LA7_2<=RULE_DECIMAL)||(LA7_2>=15 && LA7_2<=17)||(LA7_2>=19 && LA7_2<=57)||(LA7_2>=59 && LA7_2<=86)) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case 72:
                {
                int LA7_3 = input.LA(2);

                if ( (LA7_3==EOF||(LA7_3>=RULE_STRING && LA7_3<=RULE_DECIMAL)||(LA7_3>=15 && LA7_3<=17)||(LA7_3>=19 && LA7_3<=57)||(LA7_3>=59 && LA7_3<=86)) ) {
                    alt7=2;
                }
                else if ( (LA7_3==18) ) {
                    alt7=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    throw nvae;
                }
                }
                break;
            case 73:
                {
                int LA7_4 = input.LA(2);

                if ( (LA7_4==EOF||(LA7_4>=RULE_STRING && LA7_4<=RULE_DECIMAL)||(LA7_4>=15 && LA7_4<=17)||(LA7_4>=19 && LA7_4<=57)||(LA7_4>=59 && LA7_4<=86)) ) {
                    alt7=2;
                }
                else if ( (LA7_4==18) ) {
                    alt7=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 4, input);

                    throw nvae;
                }
                }
                break;
            case 74:
                {
                int LA7_5 = input.LA(2);

                if ( (LA7_5==EOF||(LA7_5>=RULE_STRING && LA7_5<=RULE_DECIMAL)||(LA7_5>=15 && LA7_5<=17)||(LA7_5>=19 && LA7_5<=57)||(LA7_5>=59 && LA7_5<=86)) ) {
                    alt7=2;
                }
                else if ( (LA7_5==18) ) {
                    alt7=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
            case 15:
            case 24:
            case 40:
            case 41:
            case 46:
            case 53:
            case 54:
            case 56:
            case 60:
            case 62:
            case 66:
            case 67:
            case 68:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 85:
                {
                alt7=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSqlQueryDsl.g:389:3: ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // InternalSqlQueryDsl.g:389:3: ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // InternalSqlQueryDsl.g:390:4: () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // InternalSqlQueryDsl.g:390:4: ()
                    // InternalSqlQueryDsl.g:391:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSqlQueryDsl.g:397:4: ( ( ruleFeatureCallID ) )
                    // InternalSqlQueryDsl.g:398:5: ( ruleFeatureCallID )
                    {
                    // InternalSqlQueryDsl.g:398:5: ( ruleFeatureCallID )
                    // InternalSqlQueryDsl.g:399:6: ruleFeatureCallID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getXAssignmentRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    ruleFeatureCallID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_11);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalSqlQueryDsl.g:420:4: ( (lv_value_3_0= ruleXAssignment ) )
                    // InternalSqlQueryDsl.g:421:5: (lv_value_3_0= ruleXAssignment )
                    {
                    // InternalSqlQueryDsl.g:421:5: (lv_value_3_0= ruleXAssignment )
                    // InternalSqlQueryDsl.g:422:6: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_3_0,
                      							"org.eclipse.xtext.xbase.Xbase.XAssignment");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSqlQueryDsl.g:441:3: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // InternalSqlQueryDsl.g:441:3: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // InternalSqlQueryDsl.g:442:4: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_12);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_XOrExpression_4;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalSqlQueryDsl.g:450:4: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt6=2;
                    alt6 = dfa6.predict(input);
                    switch (alt6) {
                        case 1 :
                            // InternalSqlQueryDsl.g:451:5: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // InternalSqlQueryDsl.g:451:5: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // InternalSqlQueryDsl.g:452:6: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // InternalSqlQueryDsl.g:462:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // InternalSqlQueryDsl.g:463:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // InternalSqlQueryDsl.g:463:7: ()
                            // InternalSqlQueryDsl.g:464:8: 
                            {
                            if ( state.backtracking==0 ) {

                              								current = forceCreateModelElementAndSet(
                              									grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                              									current);
                              							
                            }

                            }

                            // InternalSqlQueryDsl.g:470:7: ( ( ruleOpMultiAssign ) )
                            // InternalSqlQueryDsl.g:471:8: ( ruleOpMultiAssign )
                            {
                            // InternalSqlQueryDsl.g:471:8: ( ruleOpMultiAssign )
                            // InternalSqlQueryDsl.g:472:9: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElement(grammarAccess.getXAssignmentRule());
                              									}
                              								
                            }
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0());
                              								
                            }
                            pushFollow(FOLLOW_11);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }


                            }


                            }

                            // InternalSqlQueryDsl.g:488:5: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // InternalSqlQueryDsl.g:489:6: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // InternalSqlQueryDsl.g:489:6: (lv_rightOperand_7_0= ruleXAssignment )
                            // InternalSqlQueryDsl.g:490:7: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              							}
                              							set(
                              								current,
                              								"rightOperand",
                              								lv_rightOperand_7_0,
                              								"org.eclipse.xtext.xbase.Xbase.XAssignment");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // InternalSqlQueryDsl.g:513:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // InternalSqlQueryDsl.g:513:54: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // InternalSqlQueryDsl.g:514:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // InternalSqlQueryDsl.g:520:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSqlQueryDsl.g:526:2: (kw= '=' )
            // InternalSqlQueryDsl.g:527:2: kw= '='
            {
            kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // InternalSqlQueryDsl.g:535:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // InternalSqlQueryDsl.g:535:53: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // InternalSqlQueryDsl.g:536:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // InternalSqlQueryDsl.g:542:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | (kw= '<' kw= '<' kw= '=' ) | (kw= '>' (kw= '>' )? kw= '>=' ) ) ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSqlQueryDsl.g:548:2: ( (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | (kw= '<' kw= '<' kw= '=' ) | (kw= '>' (kw= '>' )? kw= '>=' ) ) )
            // InternalSqlQueryDsl.g:549:2: (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | (kw= '<' kw= '<' kw= '=' ) | (kw= '>' (kw= '>' )? kw= '>=' ) )
            {
            // InternalSqlQueryDsl.g:549:2: (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | (kw= '<' kw= '<' kw= '=' ) | (kw= '>' (kw= '>' )? kw= '>=' ) )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            case 22:
                {
                alt9=4;
                }
                break;
            case 23:
                {
                alt9=5;
                }
                break;
            case 24:
                {
                alt9=6;
                }
                break;
            case 25:
                {
                alt9=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSqlQueryDsl.g:550:3: kw= '+='
                    {
                    kw=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSqlQueryDsl.g:556:3: kw= '-='
                    {
                    kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getHyphenMinusEqualsSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSqlQueryDsl.g:562:3: kw= '*='
                    {
                    kw=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getAsteriskEqualsSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSqlQueryDsl.g:568:3: kw= '/='
                    {
                    kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getSolidusEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSqlQueryDsl.g:574:3: kw= '%='
                    {
                    kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPercentSignEqualsSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalSqlQueryDsl.g:580:3: (kw= '<' kw= '<' kw= '=' )
                    {
                    // InternalSqlQueryDsl.g:580:3: (kw= '<' kw= '<' kw= '=' )
                    // InternalSqlQueryDsl.g:581:4: kw= '<' kw= '<' kw= '='
                    {
                    kw=(Token)match(input,24,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getLessThanSignKeyword_5_0());
                      			
                    }
                    kw=(Token)match(input,24,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getLessThanSignKeyword_5_1());
                      			
                    }
                    kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getEqualsSignKeyword_5_2());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalSqlQueryDsl.g:598:3: (kw= '>' (kw= '>' )? kw= '>=' )
                    {
                    // InternalSqlQueryDsl.g:598:3: (kw= '>' (kw= '>' )? kw= '>=' )
                    // InternalSqlQueryDsl.g:599:4: kw= '>' (kw= '>' )? kw= '>='
                    {
                    kw=(Token)match(input,25,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getGreaterThanSignKeyword_6_0());
                      			
                    }
                    // InternalSqlQueryDsl.g:604:4: (kw= '>' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==25) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalSqlQueryDsl.g:605:5: kw= '>'
                            {
                            kw=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getGreaterThanSignKeyword_6_1());
                              				
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getGreaterThanSignEqualsSignKeyword_6_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // InternalSqlQueryDsl.g:621:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // InternalSqlQueryDsl.g:621:54: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // InternalSqlQueryDsl.g:622:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // InternalSqlQueryDsl.g:628:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:634:2: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // InternalSqlQueryDsl.g:635:2: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // InternalSqlQueryDsl.g:635:2: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // InternalSqlQueryDsl.g:636:3: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_16);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSqlQueryDsl.g:644:3: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    int LA10_2 = input.LA(2);

                    if ( (synpred2_InternalSqlQueryDsl()) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalSqlQueryDsl.g:645:4: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // InternalSqlQueryDsl.g:645:4: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // InternalSqlQueryDsl.g:646:5: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // InternalSqlQueryDsl.g:656:5: ( () ( ( ruleOpOr ) ) )
            	    // InternalSqlQueryDsl.g:657:6: () ( ( ruleOpOr ) )
            	    {
            	    // InternalSqlQueryDsl.g:657:6: ()
            	    // InternalSqlQueryDsl.g:658:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalSqlQueryDsl.g:664:6: ( ( ruleOpOr ) )
            	    // InternalSqlQueryDsl.g:665:7: ( ruleOpOr )
            	    {
            	    // InternalSqlQueryDsl.g:665:7: ( ruleOpOr )
            	    // InternalSqlQueryDsl.g:666:8: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      								}
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_11);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalSqlQueryDsl.g:682:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // InternalSqlQueryDsl.g:683:5: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // InternalSqlQueryDsl.g:683:5: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // InternalSqlQueryDsl.g:684:6: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"org.eclipse.xtext.xbase.Xbase.XAndExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // InternalSqlQueryDsl.g:706:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // InternalSqlQueryDsl.g:706:44: (iv_ruleOpOr= ruleOpOr EOF )
            // InternalSqlQueryDsl.g:707:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // InternalSqlQueryDsl.g:713:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSqlQueryDsl.g:719:2: (kw= '||' )
            // InternalSqlQueryDsl.g:720:2: kw= '||'
            {
            kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // InternalSqlQueryDsl.g:728:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // InternalSqlQueryDsl.g:728:55: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // InternalSqlQueryDsl.g:729:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // InternalSqlQueryDsl.g:735:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:741:2: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // InternalSqlQueryDsl.g:742:2: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // InternalSqlQueryDsl.g:742:2: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // InternalSqlQueryDsl.g:743:3: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_17);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XEqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSqlQueryDsl.g:751:3: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    int LA11_2 = input.LA(2);

                    if ( (synpred3_InternalSqlQueryDsl()) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalSqlQueryDsl.g:752:4: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // InternalSqlQueryDsl.g:752:4: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // InternalSqlQueryDsl.g:753:5: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // InternalSqlQueryDsl.g:763:5: ( () ( ( ruleOpAnd ) ) )
            	    // InternalSqlQueryDsl.g:764:6: () ( ( ruleOpAnd ) )
            	    {
            	    // InternalSqlQueryDsl.g:764:6: ()
            	    // InternalSqlQueryDsl.g:765:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalSqlQueryDsl.g:771:6: ( ( ruleOpAnd ) )
            	    // InternalSqlQueryDsl.g:772:7: ( ruleOpAnd )
            	    {
            	    // InternalSqlQueryDsl.g:772:7: ( ruleOpAnd )
            	    // InternalSqlQueryDsl.g:773:8: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      								}
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_11);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalSqlQueryDsl.g:789:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // InternalSqlQueryDsl.g:790:5: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // InternalSqlQueryDsl.g:790:5: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // InternalSqlQueryDsl.g:791:6: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"org.eclipse.xtext.xbase.Xbase.XEqualityExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // InternalSqlQueryDsl.g:813:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // InternalSqlQueryDsl.g:813:45: (iv_ruleOpAnd= ruleOpAnd EOF )
            // InternalSqlQueryDsl.g:814:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // InternalSqlQueryDsl.g:820:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSqlQueryDsl.g:826:2: (kw= '&&' )
            // InternalSqlQueryDsl.g:827:2: kw= '&&'
            {
            kw=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // InternalSqlQueryDsl.g:835:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // InternalSqlQueryDsl.g:835:60: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // InternalSqlQueryDsl.g:836:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // InternalSqlQueryDsl.g:842:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:848:2: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // InternalSqlQueryDsl.g:849:2: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // InternalSqlQueryDsl.g:849:2: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // InternalSqlQueryDsl.g:850:3: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_18);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XRelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSqlQueryDsl.g:858:3: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                switch ( input.LA(1) ) {
                case 29:
                    {
                    int LA12_2 = input.LA(2);

                    if ( (synpred4_InternalSqlQueryDsl()) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA12_3 = input.LA(2);

                    if ( (synpred4_InternalSqlQueryDsl()) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 31:
                    {
                    int LA12_4 = input.LA(2);

                    if ( (synpred4_InternalSqlQueryDsl()) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 32:
                    {
                    int LA12_5 = input.LA(2);

                    if ( (synpred4_InternalSqlQueryDsl()) ) {
                        alt12=1;
                    }


                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // InternalSqlQueryDsl.g:859:4: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // InternalSqlQueryDsl.g:859:4: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // InternalSqlQueryDsl.g:860:5: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // InternalSqlQueryDsl.g:870:5: ( () ( ( ruleOpEquality ) ) )
            	    // InternalSqlQueryDsl.g:871:6: () ( ( ruleOpEquality ) )
            	    {
            	    // InternalSqlQueryDsl.g:871:6: ()
            	    // InternalSqlQueryDsl.g:872:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalSqlQueryDsl.g:878:6: ( ( ruleOpEquality ) )
            	    // InternalSqlQueryDsl.g:879:7: ( ruleOpEquality )
            	    {
            	    // InternalSqlQueryDsl.g:879:7: ( ruleOpEquality )
            	    // InternalSqlQueryDsl.g:880:8: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      								}
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_11);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalSqlQueryDsl.g:896:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // InternalSqlQueryDsl.g:897:5: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // InternalSqlQueryDsl.g:897:5: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // InternalSqlQueryDsl.g:898:6: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"org.eclipse.xtext.xbase.Xbase.XRelationalExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // InternalSqlQueryDsl.g:920:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // InternalSqlQueryDsl.g:920:50: (iv_ruleOpEquality= ruleOpEquality EOF )
            // InternalSqlQueryDsl.g:921:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // InternalSqlQueryDsl.g:927:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSqlQueryDsl.g:933:2: ( (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) )
            // InternalSqlQueryDsl.g:934:2: (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' )
            {
            // InternalSqlQueryDsl.g:934:2: (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt13=1;
                }
                break;
            case 30:
                {
                alt13=2;
                }
                break;
            case 31:
                {
                alt13=3;
                }
                break;
            case 32:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalSqlQueryDsl.g:935:3: kw= '=='
                    {
                    kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSqlQueryDsl.g:941:3: kw= '!='
                    {
                    kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSqlQueryDsl.g:947:3: kw= '==='
                    {
                    kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignEqualsSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSqlQueryDsl.g:953:3: kw= '!=='
                    {
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // InternalSqlQueryDsl.g:962:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // InternalSqlQueryDsl.g:962:62: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // InternalSqlQueryDsl.g:963:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // InternalSqlQueryDsl.g:969:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:975:2: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // InternalSqlQueryDsl.g:976:2: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // InternalSqlQueryDsl.g:976:2: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // InternalSqlQueryDsl.g:977:3: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_19);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XOtherOperatorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSqlQueryDsl.g:985:3: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop14:
            do {
                int alt14=3;
                switch ( input.LA(1) ) {
                case 24:
                    {
                    int LA14_2 = input.LA(2);

                    if ( (synpred6_InternalSqlQueryDsl()) ) {
                        alt14=2;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA14_3 = input.LA(2);

                    if ( (synpred6_InternalSqlQueryDsl()) ) {
                        alt14=2;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA14_4 = input.LA(2);

                    if ( (synpred5_InternalSqlQueryDsl()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA14_5 = input.LA(2);

                    if ( (synpred6_InternalSqlQueryDsl()) ) {
                        alt14=2;
                    }


                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // InternalSqlQueryDsl.g:986:4: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // InternalSqlQueryDsl.g:986:4: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // InternalSqlQueryDsl.g:987:5: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // InternalSqlQueryDsl.g:987:5: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // InternalSqlQueryDsl.g:988:6: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // InternalSqlQueryDsl.g:994:6: ( () otherlv_2= 'instanceof' )
            	    // InternalSqlQueryDsl.g:995:7: () otherlv_2= 'instanceof'
            	    {
            	    // InternalSqlQueryDsl.g:995:7: ()
            	    // InternalSqlQueryDsl.g:996:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	      						
            	    }

            	    }


            	    }

            	    // InternalSqlQueryDsl.g:1008:5: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // InternalSqlQueryDsl.g:1009:6: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // InternalSqlQueryDsl.g:1009:6: (lv_type_3_0= ruleJvmTypeReference )
            	    // InternalSqlQueryDsl.g:1010:7: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      							}
            	      							set(
            	      								current,
            	      								"type",
            	      								lv_type_3_0,
            	      								"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSqlQueryDsl.g:1029:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // InternalSqlQueryDsl.g:1029:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // InternalSqlQueryDsl.g:1030:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // InternalSqlQueryDsl.g:1030:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // InternalSqlQueryDsl.g:1031:6: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // InternalSqlQueryDsl.g:1041:6: ( () ( ( ruleOpCompare ) ) )
            	    // InternalSqlQueryDsl.g:1042:7: () ( ( ruleOpCompare ) )
            	    {
            	    // InternalSqlQueryDsl.g:1042:7: ()
            	    // InternalSqlQueryDsl.g:1043:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalSqlQueryDsl.g:1049:7: ( ( ruleOpCompare ) )
            	    // InternalSqlQueryDsl.g:1050:8: ( ruleOpCompare )
            	    {
            	    // InternalSqlQueryDsl.g:1050:8: ( ruleOpCompare )
            	    // InternalSqlQueryDsl.g:1051:9: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      									}
            	      								
            	    }
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_11);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									afterParserOrEnumRuleCall();
            	      								
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalSqlQueryDsl.g:1067:5: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // InternalSqlQueryDsl.g:1068:6: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // InternalSqlQueryDsl.g:1068:6: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // InternalSqlQueryDsl.g:1069:7: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      							}
            	      							set(
            	      								current,
            	      								"rightOperand",
            	      								lv_rightOperand_6_0,
            	      								"org.eclipse.xtext.xbase.Xbase.XOtherOperatorExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // InternalSqlQueryDsl.g:1092:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // InternalSqlQueryDsl.g:1092:49: (iv_ruleOpCompare= ruleOpCompare EOF )
            // InternalSqlQueryDsl.g:1093:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // InternalSqlQueryDsl.g:1099:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | (kw= '<' kw= '=' ) | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSqlQueryDsl.g:1105:2: ( (kw= '>=' | (kw= '<' kw= '=' ) | kw= '>' | kw= '<' ) )
            // InternalSqlQueryDsl.g:1106:2: (kw= '>=' | (kw= '<' kw= '=' ) | kw= '>' | kw= '<' )
            {
            // InternalSqlQueryDsl.g:1106:2: (kw= '>=' | (kw= '<' kw= '=' ) | kw= '>' | kw= '<' )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt15=1;
                }
                break;
            case 24:
                {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==EOF||(LA15_2>=RULE_STRING && LA15_2<=RULE_DECIMAL)||LA15_2==15||LA15_2==24||(LA15_2>=40 && LA15_2<=41)||LA15_2==46||(LA15_2>=53 && LA15_2<=54)||LA15_2==56||LA15_2==60||LA15_2==62||(LA15_2>=66 && LA15_2<=68)||(LA15_2>=71 && LA15_2<=83)||LA15_2==85) ) {
                    alt15=4;
                }
                else if ( (LA15_2==18) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }
                }
                break;
            case 25:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalSqlQueryDsl.g:1107:3: kw= '>='
                    {
                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSqlQueryDsl.g:1113:3: (kw= '<' kw= '=' )
                    {
                    // InternalSqlQueryDsl.g:1113:3: (kw= '<' kw= '=' )
                    // InternalSqlQueryDsl.g:1114:4: kw= '<' kw= '='
                    {
                    kw=(Token)match(input,24,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_1_0());
                      			
                    }
                    kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getOpCompareAccess().getEqualsSignKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSqlQueryDsl.g:1126:3: kw= '>'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSqlQueryDsl.g:1132:3: kw= '<'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // InternalSqlQueryDsl.g:1141:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // InternalSqlQueryDsl.g:1141:65: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // InternalSqlQueryDsl.g:1142:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // InternalSqlQueryDsl.g:1148:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:1154:2: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // InternalSqlQueryDsl.g:1155:2: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // InternalSqlQueryDsl.g:1155:2: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // InternalSqlQueryDsl.g:1156:3: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_20);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XAdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSqlQueryDsl.g:1164:3: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // InternalSqlQueryDsl.g:1165:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // InternalSqlQueryDsl.g:1165:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // InternalSqlQueryDsl.g:1166:5: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // InternalSqlQueryDsl.g:1176:5: ( () ( ( ruleOpOther ) ) )
            	    // InternalSqlQueryDsl.g:1177:6: () ( ( ruleOpOther ) )
            	    {
            	    // InternalSqlQueryDsl.g:1177:6: ()
            	    // InternalSqlQueryDsl.g:1178:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalSqlQueryDsl.g:1184:6: ( ( ruleOpOther ) )
            	    // InternalSqlQueryDsl.g:1185:7: ( ruleOpOther )
            	    {
            	    // InternalSqlQueryDsl.g:1185:7: ( ruleOpOther )
            	    // InternalSqlQueryDsl.g:1186:8: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      								}
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_11);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalSqlQueryDsl.g:1202:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // InternalSqlQueryDsl.g:1203:5: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // InternalSqlQueryDsl.g:1203:5: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // InternalSqlQueryDsl.g:1204:6: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"org.eclipse.xtext.xbase.Xbase.XAdditiveExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // InternalSqlQueryDsl.g:1226:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // InternalSqlQueryDsl.g:1226:47: (iv_ruleOpOther= ruleOpOther EOF )
            // InternalSqlQueryDsl.g:1227:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // InternalSqlQueryDsl.g:1233:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' ) ) | kw= '<>' | kw= '?:' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSqlQueryDsl.g:1239:2: ( (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' ) ) | kw= '<>' | kw= '?:' ) )
            // InternalSqlQueryDsl.g:1240:2: (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' ) ) | kw= '<>' | kw= '?:' )
            {
            // InternalSqlQueryDsl.g:1240:2: (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' ) ) | kw= '<>' | kw= '?:' )
            int alt19=9;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalSqlQueryDsl.g:1241:3: kw= '->'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSqlQueryDsl.g:1247:3: kw= '..<'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopLessThanSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSqlQueryDsl.g:1253:3: (kw= '>' kw= '..' )
                    {
                    // InternalSqlQueryDsl.g:1253:3: (kw= '>' kw= '..' )
                    // InternalSqlQueryDsl.g:1254:4: kw= '>' kw= '..'
                    {
                    kw=(Token)match(input,25,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_2_0());
                      			
                    }
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_2_1());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSqlQueryDsl.g:1266:3: kw= '..'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSqlQueryDsl.g:1272:3: kw= '=>'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalSqlQueryDsl.g:1278:3: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // InternalSqlQueryDsl.g:1278:3: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // InternalSqlQueryDsl.g:1279:4: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,25,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_0());
                      			
                    }
                    // InternalSqlQueryDsl.g:1284:4: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==25) ) {
                        int LA17_1 = input.LA(2);

                        if ( (LA17_1==EOF||(LA17_1>=RULE_STRING && LA17_1<=RULE_DECIMAL)||LA17_1==15||LA17_1==24||(LA17_1>=40 && LA17_1<=41)||LA17_1==46||(LA17_1>=53 && LA17_1<=54)||LA17_1==56||LA17_1==60||LA17_1==62||(LA17_1>=66 && LA17_1<=68)||(LA17_1>=71 && LA17_1<=83)||LA17_1==85) ) {
                            alt17=2;
                        }
                        else if ( (LA17_1==25) && (synpred8_InternalSqlQueryDsl())) {
                            alt17=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalSqlQueryDsl.g:1285:5: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // InternalSqlQueryDsl.g:1285:5: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // InternalSqlQueryDsl.g:1286:6: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // InternalSqlQueryDsl.g:1291:6: (kw= '>' kw= '>' )
                            // InternalSqlQueryDsl.g:1292:7: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,25,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							current.merge(kw);
                              							newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_1_0_0_0());
                              						
                            }
                            kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							current.merge(kw);
                              							newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_1_0_0_1());
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSqlQueryDsl.g:1305:5: kw= '>'
                            {
                            kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalSqlQueryDsl.g:1313:3: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' ) )
                    {
                    // InternalSqlQueryDsl.g:1313:3: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' ) )
                    // InternalSqlQueryDsl.g:1314:4: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' )
                    {
                    kw=(Token)match(input,24,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_0());
                      			
                    }
                    // InternalSqlQueryDsl.g:1319:4: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' )
                    int alt18=3;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==24) ) {
                        int LA18_1 = input.LA(2);

                        if ( (synpred9_InternalSqlQueryDsl()) ) {
                            alt18=1;
                        }
                        else if ( (true) ) {
                            alt18=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA18_0==37) ) {
                        alt18=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalSqlQueryDsl.g:1320:5: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // InternalSqlQueryDsl.g:1320:5: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // InternalSqlQueryDsl.g:1321:6: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // InternalSqlQueryDsl.g:1326:6: (kw= '<' kw= '<' )
                            // InternalSqlQueryDsl.g:1327:7: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,24,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							current.merge(kw);
                              							newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_1_0_0_0());
                              						
                            }
                            kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							current.merge(kw);
                              							newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_1_0_0_1());
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSqlQueryDsl.g:1340:5: kw= '<'
                            {
                            kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_1_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalSqlQueryDsl.g:1346:5: kw= '=>'
                            {
                            kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_6_1_2());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalSqlQueryDsl.g:1354:3: kw= '<>'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalSqlQueryDsl.g:1360:3: kw= '?:'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_8());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // InternalSqlQueryDsl.g:1369:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // InternalSqlQueryDsl.g:1369:60: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // InternalSqlQueryDsl.g:1370:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // InternalSqlQueryDsl.g:1376:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:1382:2: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // InternalSqlQueryDsl.g:1383:2: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // InternalSqlQueryDsl.g:1383:2: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // InternalSqlQueryDsl.g:1384:3: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XMultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSqlQueryDsl.g:1392:3: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==40) ) {
                    int LA20_2 = input.LA(2);

                    if ( (synpred10_InternalSqlQueryDsl()) ) {
                        alt20=1;
                    }


                }
                else if ( (LA20_0==41) ) {
                    int LA20_3 = input.LA(2);

                    if ( (synpred10_InternalSqlQueryDsl()) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // InternalSqlQueryDsl.g:1393:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // InternalSqlQueryDsl.g:1393:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // InternalSqlQueryDsl.g:1394:5: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // InternalSqlQueryDsl.g:1404:5: ( () ( ( ruleOpAdd ) ) )
            	    // InternalSqlQueryDsl.g:1405:6: () ( ( ruleOpAdd ) )
            	    {
            	    // InternalSqlQueryDsl.g:1405:6: ()
            	    // InternalSqlQueryDsl.g:1406:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalSqlQueryDsl.g:1412:6: ( ( ruleOpAdd ) )
            	    // InternalSqlQueryDsl.g:1413:7: ( ruleOpAdd )
            	    {
            	    // InternalSqlQueryDsl.g:1413:7: ( ruleOpAdd )
            	    // InternalSqlQueryDsl.g:1414:8: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      								}
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_11);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalSqlQueryDsl.g:1430:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // InternalSqlQueryDsl.g:1431:5: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // InternalSqlQueryDsl.g:1431:5: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // InternalSqlQueryDsl.g:1432:6: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"org.eclipse.xtext.xbase.Xbase.XMultiplicativeExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // InternalSqlQueryDsl.g:1454:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // InternalSqlQueryDsl.g:1454:45: (iv_ruleOpAdd= ruleOpAdd EOF )
            // InternalSqlQueryDsl.g:1455:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // InternalSqlQueryDsl.g:1461:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSqlQueryDsl.g:1467:2: ( (kw= '+' | kw= '-' ) )
            // InternalSqlQueryDsl.g:1468:2: (kw= '+' | kw= '-' )
            {
            // InternalSqlQueryDsl.g:1468:2: (kw= '+' | kw= '-' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            else if ( (LA21_0==41) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalSqlQueryDsl.g:1469:3: kw= '+'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSqlQueryDsl.g:1475:3: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // InternalSqlQueryDsl.g:1484:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // InternalSqlQueryDsl.g:1484:66: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // InternalSqlQueryDsl.g:1485:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // InternalSqlQueryDsl.g:1491:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:1497:2: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // InternalSqlQueryDsl.g:1498:2: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // InternalSqlQueryDsl.g:1498:2: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // InternalSqlQueryDsl.g:1499:3: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_25);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XUnaryOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSqlQueryDsl.g:1507:3: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop22:
            do {
                int alt22=2;
                switch ( input.LA(1) ) {
                case 42:
                    {
                    int LA22_2 = input.LA(2);

                    if ( (synpred11_InternalSqlQueryDsl()) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 43:
                    {
                    int LA22_3 = input.LA(2);

                    if ( (synpred11_InternalSqlQueryDsl()) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 44:
                    {
                    int LA22_4 = input.LA(2);

                    if ( (synpred11_InternalSqlQueryDsl()) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA22_5 = input.LA(2);

                    if ( (synpred11_InternalSqlQueryDsl()) ) {
                        alt22=1;
                    }


                    }
                    break;

                }

                switch (alt22) {
            	case 1 :
            	    // InternalSqlQueryDsl.g:1508:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // InternalSqlQueryDsl.g:1508:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // InternalSqlQueryDsl.g:1509:5: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // InternalSqlQueryDsl.g:1519:5: ( () ( ( ruleOpMulti ) ) )
            	    // InternalSqlQueryDsl.g:1520:6: () ( ( ruleOpMulti ) )
            	    {
            	    // InternalSqlQueryDsl.g:1520:6: ()
            	    // InternalSqlQueryDsl.g:1521:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalSqlQueryDsl.g:1527:6: ( ( ruleOpMulti ) )
            	    // InternalSqlQueryDsl.g:1528:7: ( ruleOpMulti )
            	    {
            	    // InternalSqlQueryDsl.g:1528:7: ( ruleOpMulti )
            	    // InternalSqlQueryDsl.g:1529:8: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      								}
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_11);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalSqlQueryDsl.g:1545:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // InternalSqlQueryDsl.g:1546:5: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // InternalSqlQueryDsl.g:1546:5: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // InternalSqlQueryDsl.g:1547:6: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"org.eclipse.xtext.xbase.Xbase.XUnaryOperation");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // InternalSqlQueryDsl.g:1569:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // InternalSqlQueryDsl.g:1569:47: (iv_ruleOpMulti= ruleOpMulti EOF )
            // InternalSqlQueryDsl.g:1570:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // InternalSqlQueryDsl.g:1576:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSqlQueryDsl.g:1582:2: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // InternalSqlQueryDsl.g:1583:2: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // InternalSqlQueryDsl.g:1583:2: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt23=1;
                }
                break;
            case 43:
                {
                alt23=2;
                }
                break;
            case 44:
                {
                alt23=3;
                }
                break;
            case 45:
                {
                alt23=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalSqlQueryDsl.g:1584:3: kw= '*'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSqlQueryDsl.g:1590:3: kw= '**'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSqlQueryDsl.g:1596:3: kw= '/'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSqlQueryDsl.g:1602:3: kw= '%'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // InternalSqlQueryDsl.g:1611:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // InternalSqlQueryDsl.g:1611:56: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // InternalSqlQueryDsl.g:1612:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // InternalSqlQueryDsl.g:1618:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:1624:2: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // InternalSqlQueryDsl.g:1625:2: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // InternalSqlQueryDsl.g:1625:2: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=40 && LA24_0<=41)||LA24_0==46) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_DECIMAL)||LA24_0==15||LA24_0==24||(LA24_0>=53 && LA24_0<=54)||LA24_0==56||LA24_0==60||LA24_0==62||(LA24_0>=66 && LA24_0<=68)||(LA24_0>=71 && LA24_0<=83)||LA24_0==85) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalSqlQueryDsl.g:1626:3: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) )
                    {
                    // InternalSqlQueryDsl.g:1626:3: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) )
                    // InternalSqlQueryDsl.g:1627:4: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) )
                    {
                    // InternalSqlQueryDsl.g:1627:4: ()
                    // InternalSqlQueryDsl.g:1628:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSqlQueryDsl.g:1634:4: ( ( ruleOpUnary ) )
                    // InternalSqlQueryDsl.g:1635:5: ( ruleOpUnary )
                    {
                    // InternalSqlQueryDsl.g:1635:5: ( ruleOpUnary )
                    // InternalSqlQueryDsl.g:1636:6: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSqlQueryDsl.g:1650:4: ( (lv_operand_2_0= ruleXUnaryOperation ) )
                    // InternalSqlQueryDsl.g:1651:5: (lv_operand_2_0= ruleXUnaryOperation )
                    {
                    // InternalSqlQueryDsl.g:1651:5: (lv_operand_2_0= ruleXUnaryOperation )
                    // InternalSqlQueryDsl.g:1652:6: lv_operand_2_0= ruleXUnaryOperation
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXUnaryOperationParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_2_0=ruleXUnaryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      						}
                      						set(
                      							current,
                      							"operand",
                      							lv_operand_2_0,
                      							"org.eclipse.xtext.xbase.Xbase.XUnaryOperation");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSqlQueryDsl.g:1671:3: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XCastedExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // InternalSqlQueryDsl.g:1683:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // InternalSqlQueryDsl.g:1683:47: (iv_ruleOpUnary= ruleOpUnary EOF )
            // InternalSqlQueryDsl.g:1684:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // InternalSqlQueryDsl.g:1690:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSqlQueryDsl.g:1696:2: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // InternalSqlQueryDsl.g:1697:2: (kw= '!' | kw= '-' | kw= '+' )
            {
            // InternalSqlQueryDsl.g:1697:2: (kw= '!' | kw= '-' | kw= '+' )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt25=1;
                }
                break;
            case 41:
                {
                alt25=2;
                }
                break;
            case 40:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalSqlQueryDsl.g:1698:3: kw= '!'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSqlQueryDsl.g:1704:3: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSqlQueryDsl.g:1710:3: kw= '+'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // InternalSqlQueryDsl.g:1719:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // InternalSqlQueryDsl.g:1719:58: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // InternalSqlQueryDsl.g:1720:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // InternalSqlQueryDsl.g:1726:1: ruleXCastedExpression returns [EObject current=null] : (this_XPostfixOperation_0= ruleXPostfixOperation ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XPostfixOperation_0 = null;

        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:1732:2: ( (this_XPostfixOperation_0= ruleXPostfixOperation ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // InternalSqlQueryDsl.g:1733:2: (this_XPostfixOperation_0= ruleXPostfixOperation ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // InternalSqlQueryDsl.g:1733:2: (this_XPostfixOperation_0= ruleXPostfixOperation ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // InternalSqlQueryDsl.g:1734:3: this_XPostfixOperation_0= ruleXPostfixOperation ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXPostfixOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_26);
            this_XPostfixOperation_0=ruleXPostfixOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XPostfixOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSqlQueryDsl.g:1742:3: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==47) ) {
                    int LA26_2 = input.LA(2);

                    if ( (synpred12_InternalSqlQueryDsl()) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalSqlQueryDsl.g:1743:4: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // InternalSqlQueryDsl.g:1743:4: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // InternalSqlQueryDsl.g:1744:5: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // InternalSqlQueryDsl.g:1750:5: ( () otherlv_2= 'as' )
            	    // InternalSqlQueryDsl.g:1751:6: () otherlv_2= 'as'
            	    {
            	    // InternalSqlQueryDsl.g:1751:6: ()
            	    // InternalSqlQueryDsl.g:1752:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    otherlv_2=(Token)match(input,47,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	      					
            	    }

            	    }


            	    }

            	    // InternalSqlQueryDsl.g:1764:4: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // InternalSqlQueryDsl.g:1765:5: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // InternalSqlQueryDsl.g:1765:5: (lv_type_3_0= ruleJvmTypeReference )
            	    // InternalSqlQueryDsl.g:1766:6: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"type",
            	      							lv_type_3_0,
            	      							"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXPostfixOperation"
    // InternalSqlQueryDsl.g:1788:1: entryRuleXPostfixOperation returns [EObject current=null] : iv_ruleXPostfixOperation= ruleXPostfixOperation EOF ;
    public final EObject entryRuleXPostfixOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPostfixOperation = null;


        try {
            // InternalSqlQueryDsl.g:1788:58: (iv_ruleXPostfixOperation= ruleXPostfixOperation EOF )
            // InternalSqlQueryDsl.g:1789:2: iv_ruleXPostfixOperation= ruleXPostfixOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPostfixOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXPostfixOperation=ruleXPostfixOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPostfixOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPostfixOperation"


    // $ANTLR start "ruleXPostfixOperation"
    // InternalSqlQueryDsl.g:1795:1: ruleXPostfixOperation returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( () ( ( ruleOpPostfix ) ) ) )=> ( () ( ( ruleOpPostfix ) ) ) )? ) ;
    public final EObject ruleXPostfixOperation() throws RecognitionException {
        EObject current = null;

        EObject this_XMemberFeatureCall_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:1801:2: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( () ( ( ruleOpPostfix ) ) ) )=> ( () ( ( ruleOpPostfix ) ) ) )? ) )
            // InternalSqlQueryDsl.g:1802:2: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( () ( ( ruleOpPostfix ) ) ) )=> ( () ( ( ruleOpPostfix ) ) ) )? )
            {
            // InternalSqlQueryDsl.g:1802:2: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( () ( ( ruleOpPostfix ) ) ) )=> ( () ( ( ruleOpPostfix ) ) ) )? )
            // InternalSqlQueryDsl.g:1803:3: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( () ( ( ruleOpPostfix ) ) ) )=> ( () ( ( ruleOpPostfix ) ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXPostfixOperationAccess().getXMemberFeatureCallParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_27);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XMemberFeatureCall_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSqlQueryDsl.g:1811:3: ( ( ( () ( ( ruleOpPostfix ) ) ) )=> ( () ( ( ruleOpPostfix ) ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==48) ) {
                int LA27_1 = input.LA(2);

                if ( (synpred13_InternalSqlQueryDsl()) ) {
                    alt27=1;
                }
            }
            else if ( (LA27_0==49) ) {
                int LA27_2 = input.LA(2);

                if ( (synpred13_InternalSqlQueryDsl()) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // InternalSqlQueryDsl.g:1812:4: ( ( () ( ( ruleOpPostfix ) ) ) )=> ( () ( ( ruleOpPostfix ) ) )
                    {
                    // InternalSqlQueryDsl.g:1822:4: ( () ( ( ruleOpPostfix ) ) )
                    // InternalSqlQueryDsl.g:1823:5: () ( ( ruleOpPostfix ) )
                    {
                    // InternalSqlQueryDsl.g:1823:5: ()
                    // InternalSqlQueryDsl.g:1824:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0(),
                      							current);
                      					
                    }

                    }

                    // InternalSqlQueryDsl.g:1830:5: ( ( ruleOpPostfix ) )
                    // InternalSqlQueryDsl.g:1831:6: ( ruleOpPostfix )
                    {
                    // InternalSqlQueryDsl.g:1831:6: ( ruleOpPostfix )
                    // InternalSqlQueryDsl.g:1832:7: ruleOpPostfix
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getXPostfixOperationRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getXPostfixOperationAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    ruleOpPostfix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPostfixOperation"


    // $ANTLR start "entryRuleOpPostfix"
    // InternalSqlQueryDsl.g:1852:1: entryRuleOpPostfix returns [String current=null] : iv_ruleOpPostfix= ruleOpPostfix EOF ;
    public final String entryRuleOpPostfix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpPostfix = null;


        try {
            // InternalSqlQueryDsl.g:1852:49: (iv_ruleOpPostfix= ruleOpPostfix EOF )
            // InternalSqlQueryDsl.g:1853:2: iv_ruleOpPostfix= ruleOpPostfix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpPostfixRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpPostfix=ruleOpPostfix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpPostfix.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpPostfix"


    // $ANTLR start "ruleOpPostfix"
    // InternalSqlQueryDsl.g:1859:1: ruleOpPostfix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '++' | kw= '--' ) ;
    public final AntlrDatatypeRuleToken ruleOpPostfix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSqlQueryDsl.g:1865:2: ( (kw= '++' | kw= '--' ) )
            // InternalSqlQueryDsl.g:1866:2: (kw= '++' | kw= '--' )
            {
            // InternalSqlQueryDsl.g:1866:2: (kw= '++' | kw= '--' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==48) ) {
                alt28=1;
            }
            else if ( (LA28_0==49) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalSqlQueryDsl.g:1867:3: kw= '++'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpPostfixAccess().getPlusSignPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSqlQueryDsl.g:1873:3: kw= '--'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpPostfixAccess().getHyphenMinusHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpPostfix"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // InternalSqlQueryDsl.g:1882:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // InternalSqlQueryDsl.g:1882:59: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // InternalSqlQueryDsl.g:1883:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // InternalSqlQueryDsl.g:1889:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitStatic_3_0=null;
        Token otherlv_8=null;
        Token lv_nullSafe_9_0=null;
        Token lv_explicitStatic_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token lv_explicitOperationCall_17_0=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_6_0 = null;

        EObject lv_typeArguments_12_0 = null;

        EObject lv_typeArguments_14_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_19_0 = null;

        EObject lv_memberCallArguments_21_0 = null;

        EObject lv_memberCallArguments_23_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:1895:2: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )* ) )
            // InternalSqlQueryDsl.g:1896:2: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )* )
            {
            // InternalSqlQueryDsl.g:1896:2: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )* )
            // InternalSqlQueryDsl.g:1897:3: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_28);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XPrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSqlQueryDsl.g:1905:3: ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )*
            loop37:
            do {
                int alt37=3;
                switch ( input.LA(1) ) {
                case 50:
                    {
                    int LA37_2 = input.LA(2);

                    if ( (synpred14_InternalSqlQueryDsl()) ) {
                        alt37=1;
                    }
                    else if ( (synpred15_InternalSqlQueryDsl()) ) {
                        alt37=2;
                    }


                    }
                    break;
                case 51:
                    {
                    int LA37_3 = input.LA(2);

                    if ( (synpred14_InternalSqlQueryDsl()) ) {
                        alt37=1;
                    }
                    else if ( (synpred15_InternalSqlQueryDsl()) ) {
                        alt37=2;
                    }


                    }
                    break;
                case 52:
                    {
                    int LA37_4 = input.LA(2);

                    if ( (synpred15_InternalSqlQueryDsl()) ) {
                        alt37=2;
                    }


                    }
                    break;

                }

                switch (alt37) {
            	case 1 :
            	    // InternalSqlQueryDsl.g:1906:4: ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) )
            	    {
            	    // InternalSqlQueryDsl.g:1906:4: ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) )
            	    // InternalSqlQueryDsl.g:1907:5: ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) )
            	    {
            	    // InternalSqlQueryDsl.g:1907:5: ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )
            	    // InternalSqlQueryDsl.g:1908:6: ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
            	    {
            	    // InternalSqlQueryDsl.g:1928:6: ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
            	    // InternalSqlQueryDsl.g:1929:7: () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign
            	    {
            	    // InternalSqlQueryDsl.g:1929:7: ()
            	    // InternalSqlQueryDsl.g:1930:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalSqlQueryDsl.g:1936:7: (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==50) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==51) ) {
            	        alt29=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalSqlQueryDsl.g:1937:8: otherlv_2= '.'
            	            {
            	            otherlv_2=(Token)match(input,50,FOLLOW_29); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1_0());
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalSqlQueryDsl.g:1942:8: ( (lv_explicitStatic_3_0= '::' ) )
            	            {
            	            // InternalSqlQueryDsl.g:1942:8: ( (lv_explicitStatic_3_0= '::' ) )
            	            // InternalSqlQueryDsl.g:1943:9: (lv_explicitStatic_3_0= '::' )
            	            {
            	            // InternalSqlQueryDsl.g:1943:9: (lv_explicitStatic_3_0= '::' )
            	            // InternalSqlQueryDsl.g:1944:10: lv_explicitStatic_3_0= '::'
            	            {
            	            lv_explicitStatic_3_0=(Token)match(input,51,FOLLOW_29); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              										newLeafNode(lv_explicitStatic_3_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitStaticColonColonKeyword_1_0_0_0_1_1_0());
            	              									
            	            }
            	            if ( state.backtracking==0 ) {

            	              										if (current==null) {
            	              											current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              										}
            	              										setWithLastConsumed(current, "explicitStatic", true, "::");
            	              									
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalSqlQueryDsl.g:1957:7: ( ( ruleFeatureCallID ) )
            	    // InternalSqlQueryDsl.g:1958:8: ( ruleFeatureCallID )
            	    {
            	    // InternalSqlQueryDsl.g:1958:8: ( ruleFeatureCallID )
            	    // InternalSqlQueryDsl.g:1959:9: ruleFeatureCallID
            	    {
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      									}
            	      								
            	    }
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_10);
            	    ruleFeatureCallID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									afterParserOrEnumRuleCall();
            	      								
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3());
            	      						
            	    }
            	    pushFollow(FOLLOW_11);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalSqlQueryDsl.g:1982:5: ( (lv_value_6_0= ruleXAssignment ) )
            	    // InternalSqlQueryDsl.g:1983:6: (lv_value_6_0= ruleXAssignment )
            	    {
            	    // InternalSqlQueryDsl.g:1983:6: (lv_value_6_0= ruleXAssignment )
            	    // InternalSqlQueryDsl.g:1984:7: lv_value_6_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_value_6_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      							}
            	      							set(
            	      								current,
            	      								"value",
            	      								lv_value_6_0,
            	      								"org.eclipse.xtext.xbase.Xbase.XAssignment");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSqlQueryDsl.g:2003:4: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? )
            	    {
            	    // InternalSqlQueryDsl.g:2003:4: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? )
            	    // InternalSqlQueryDsl.g:2004:5: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )?
            	    {
            	    // InternalSqlQueryDsl.g:2004:5: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) )
            	    // InternalSqlQueryDsl.g:2005:6: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) )
            	    {
            	    // InternalSqlQueryDsl.g:2025:6: ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) )
            	    // InternalSqlQueryDsl.g:2026:7: () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) )
            	    {
            	    // InternalSqlQueryDsl.g:2026:7: ()
            	    // InternalSqlQueryDsl.g:2027:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalSqlQueryDsl.g:2033:7: (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) )
            	    int alt30=3;
            	    switch ( input.LA(1) ) {
            	    case 50:
            	        {
            	        alt30=1;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt30=2;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt30=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt30) {
            	        case 1 :
            	            // InternalSqlQueryDsl.g:2034:8: otherlv_8= '.'
            	            {
            	            otherlv_8=(Token)match(input,50,FOLLOW_30); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(otherlv_8, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalSqlQueryDsl.g:2039:8: ( (lv_nullSafe_9_0= '?.' ) )
            	            {
            	            // InternalSqlQueryDsl.g:2039:8: ( (lv_nullSafe_9_0= '?.' ) )
            	            // InternalSqlQueryDsl.g:2040:9: (lv_nullSafe_9_0= '?.' )
            	            {
            	            // InternalSqlQueryDsl.g:2040:9: (lv_nullSafe_9_0= '?.' )
            	            // InternalSqlQueryDsl.g:2041:10: lv_nullSafe_9_0= '?.'
            	            {
            	            lv_nullSafe_9_0=(Token)match(input,52,FOLLOW_30); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              										newLeafNode(lv_nullSafe_9_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	              									
            	            }
            	            if ( state.backtracking==0 ) {

            	              										if (current==null) {
            	              											current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              										}
            	              										setWithLastConsumed(current, "nullSafe", true, "?.");
            	              									
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalSqlQueryDsl.g:2054:8: ( (lv_explicitStatic_10_0= '::' ) )
            	            {
            	            // InternalSqlQueryDsl.g:2054:8: ( (lv_explicitStatic_10_0= '::' ) )
            	            // InternalSqlQueryDsl.g:2055:9: (lv_explicitStatic_10_0= '::' )
            	            {
            	            // InternalSqlQueryDsl.g:2055:9: (lv_explicitStatic_10_0= '::' )
            	            // InternalSqlQueryDsl.g:2056:10: lv_explicitStatic_10_0= '::'
            	            {
            	            lv_explicitStatic_10_0=(Token)match(input,51,FOLLOW_30); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              										newLeafNode(lv_explicitStatic_10_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitStaticColonColonKeyword_1_1_0_0_1_2_0());
            	              									
            	            }
            	            if ( state.backtracking==0 ) {

            	              										if (current==null) {
            	              											current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              										}
            	              										setWithLastConsumed(current, "explicitStatic", true, "::");
            	              									
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalSqlQueryDsl.g:2071:5: (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==24) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // InternalSqlQueryDsl.g:2072:6: otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>'
            	            {
            	            otherlv_11=(Token)match(input,24,FOLLOW_31); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_11, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	              					
            	            }
            	            // InternalSqlQueryDsl.g:2076:6: ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) )
            	            // InternalSqlQueryDsl.g:2077:7: (lv_typeArguments_12_0= ruleJvmArgumentTypeReference )
            	            {
            	            // InternalSqlQueryDsl.g:2077:7: (lv_typeArguments_12_0= ruleJvmArgumentTypeReference )
            	            // InternalSqlQueryDsl.g:2078:8: lv_typeArguments_12_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_32);
            	            lv_typeArguments_12_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              								}
            	              								add(
            	              									current,
            	              									"typeArguments",
            	              									lv_typeArguments_12_0,
            	              									"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }

            	            // InternalSqlQueryDsl.g:2095:6: (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop31:
            	            do {
            	                int alt31=2;
            	                int LA31_0 = input.LA(1);

            	                if ( (LA31_0==16) ) {
            	                    alt31=1;
            	                }


            	                switch (alt31) {
            	            	case 1 :
            	            	    // InternalSqlQueryDsl.g:2096:7: otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_13=(Token)match(input,16,FOLLOW_31); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      							newLeafNode(otherlv_13, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	      						
            	            	    }
            	            	    // InternalSqlQueryDsl.g:2100:7: ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) )
            	            	    // InternalSqlQueryDsl.g:2101:8: (lv_typeArguments_14_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // InternalSqlQueryDsl.g:2101:8: (lv_typeArguments_14_0= ruleJvmArgumentTypeReference )
            	            	    // InternalSqlQueryDsl.g:2102:9: lv_typeArguments_14_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {

            	            	      									newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0());
            	            	      								
            	            	    }
            	            	    pushFollow(FOLLOW_32);
            	            	    lv_typeArguments_14_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      									if (current==null) {
            	            	      										current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      									}
            	            	      									add(
            	            	      										current,
            	            	      										"typeArguments",
            	            	      										lv_typeArguments_14_0,
            	            	      										"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
            	            	      									afterParserOrEnumRuleCall();
            	            	      								
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop31;
            	                }
            	            } while (true);

            	            otherlv_15=(Token)match(input,25,FOLLOW_30); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_15, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	              					
            	            }

            	            }
            	            break;

            	    }

            	    // InternalSqlQueryDsl.g:2125:5: ( ( ruleIdOrSuper ) )
            	    // InternalSqlQueryDsl.g:2126:6: ( ruleIdOrSuper )
            	    {
            	    // InternalSqlQueryDsl.g:2126:6: ( ruleIdOrSuper )
            	    // InternalSqlQueryDsl.g:2127:7: ruleIdOrSuper
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      							}
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_33);
            	    ruleIdOrSuper();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalSqlQueryDsl.g:2141:5: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )?
            	    int alt35=2;
            	    alt35 = dfa35.predict(input);
            	    switch (alt35) {
            	        case 1 :
            	            // InternalSqlQueryDsl.g:2142:6: ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')'
            	            {
            	            // InternalSqlQueryDsl.g:2142:6: ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) )
            	            // InternalSqlQueryDsl.g:2143:7: ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' )
            	            {
            	            // InternalSqlQueryDsl.g:2147:7: (lv_explicitOperationCall_17_0= '(' )
            	            // InternalSqlQueryDsl.g:2148:8: lv_explicitOperationCall_17_0= '('
            	            {
            	            lv_explicitOperationCall_17_0=(Token)match(input,15,FOLLOW_34); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_explicitOperationCall_17_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              								}
            	              								setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              							
            	            }

            	            }


            	            }

            	            // InternalSqlQueryDsl.g:2160:6: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )?
            	            int alt34=3;
            	            alt34 = dfa34.predict(input);
            	            switch (alt34) {
            	                case 1 :
            	                    // InternalSqlQueryDsl.g:2161:7: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) )
            	                    {
            	                    // InternalSqlQueryDsl.g:2161:7: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) )
            	                    // InternalSqlQueryDsl.g:2162:8: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure )
            	                    {
            	                    // InternalSqlQueryDsl.g:2187:8: (lv_memberCallArguments_18_0= ruleXShortClosure )
            	                    // InternalSqlQueryDsl.g:2188:9: lv_memberCallArguments_18_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {

            	                      									newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0());
            	                      								
            	                    }
            	                    pushFollow(FOLLOW_35);
            	                    lv_memberCallArguments_18_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      									if (current==null) {
            	                      										current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      									}
            	                      									add(
            	                      										current,
            	                      										"memberCallArguments",
            	                      										lv_memberCallArguments_18_0,
            	                      										"org.eclipse.xtext.xbase.Xbase.XShortClosure");
            	                      									afterParserOrEnumRuleCall();
            	                      								
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalSqlQueryDsl.g:2206:7: ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* )
            	                    {
            	                    // InternalSqlQueryDsl.g:2206:7: ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* )
            	                    // InternalSqlQueryDsl.g:2207:8: ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )*
            	                    {
            	                    // InternalSqlQueryDsl.g:2207:8: ( (lv_memberCallArguments_19_0= ruleXExpression ) )
            	                    // InternalSqlQueryDsl.g:2208:9: (lv_memberCallArguments_19_0= ruleXExpression )
            	                    {
            	                    // InternalSqlQueryDsl.g:2208:9: (lv_memberCallArguments_19_0= ruleXExpression )
            	                    // InternalSqlQueryDsl.g:2209:10: lv_memberCallArguments_19_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {

            	                      										newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0());
            	                      									
            	                    }
            	                    pushFollow(FOLLOW_7);
            	                    lv_memberCallArguments_19_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      										if (current==null) {
            	                      											current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      										}
            	                      										add(
            	                      											current,
            	                      											"memberCallArguments",
            	                      											lv_memberCallArguments_19_0,
            	                      											"org.eclipse.xtext.xbase.Xbase.XExpression");
            	                      										afterParserOrEnumRuleCall();
            	                      									
            	                    }

            	                    }


            	                    }

            	                    // InternalSqlQueryDsl.g:2226:8: (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )*
            	                    loop33:
            	                    do {
            	                        int alt33=2;
            	                        int LA33_0 = input.LA(1);

            	                        if ( (LA33_0==16) ) {
            	                            alt33=1;
            	                        }


            	                        switch (alt33) {
            	                    	case 1 :
            	                    	    // InternalSqlQueryDsl.g:2227:9: otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_20=(Token)match(input,16,FOLLOW_11); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      									newLeafNode(otherlv_20, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	      								
            	                    	    }
            	                    	    // InternalSqlQueryDsl.g:2231:9: ( (lv_memberCallArguments_21_0= ruleXExpression ) )
            	                    	    // InternalSqlQueryDsl.g:2232:10: (lv_memberCallArguments_21_0= ruleXExpression )
            	                    	    {
            	                    	    // InternalSqlQueryDsl.g:2232:10: (lv_memberCallArguments_21_0= ruleXExpression )
            	                    	    // InternalSqlQueryDsl.g:2233:11: lv_memberCallArguments_21_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {

            	                    	      											newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0());
            	                    	      										
            	                    	    }
            	                    	    pushFollow(FOLLOW_7);
            	                    	    lv_memberCallArguments_21_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      											if (current==null) {
            	                    	      												current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      											}
            	                    	      											add(
            	                    	      												current,
            	                    	      												"memberCallArguments",
            	                    	      												lv_memberCallArguments_21_0,
            	                    	      												"org.eclipse.xtext.xbase.Xbase.XExpression");
            	                    	      											afterParserOrEnumRuleCall();
            	                    	      										
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop33;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_22=(Token)match(input,17,FOLLOW_36); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_22, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	              					
            	            }

            	            }
            	            break;

            	    }

            	    // InternalSqlQueryDsl.g:2258:5: ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )?
            	    int alt36=2;
            	    alt36 = dfa36.predict(input);
            	    switch (alt36) {
            	        case 1 :
            	            // InternalSqlQueryDsl.g:2259:6: ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure )
            	            {
            	            // InternalSqlQueryDsl.g:2265:6: (lv_memberCallArguments_23_0= ruleXClosure )
            	            // InternalSqlQueryDsl.g:2266:7: lv_memberCallArguments_23_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_28);
            	            lv_memberCallArguments_23_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              							}
            	              							add(
            	              								current,
            	              								"memberCallArguments",
            	              								lv_memberCallArguments_23_0,
            	              								"org.eclipse.xtext.xbase.Xbase.XClosure");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // InternalSqlQueryDsl.g:2289:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // InternalSqlQueryDsl.g:2289:59: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // InternalSqlQueryDsl.g:2290:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // InternalSqlQueryDsl.g:2296:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | ( ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression ) | this_XFeatureCall_4= ruleXFeatureCall | this_XLiteral_5= ruleXLiteral | this_XIfExpression_6= ruleXIfExpression | ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression ) | this_XBasicForLoopExpression_8= ruleXBasicForLoopExpression | this_XWhileExpression_9= ruleXWhileExpression | this_XDoWhileExpression_10= ruleXDoWhileExpression | this_XThrowExpression_11= ruleXThrowExpression | this_XReturnExpression_12= ruleXReturnExpression | this_XTryCatchFinallyExpression_13= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_14= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XSynchronizedExpression_3 = null;

        EObject this_XFeatureCall_4 = null;

        EObject this_XLiteral_5 = null;

        EObject this_XIfExpression_6 = null;

        EObject this_XForLoopExpression_7 = null;

        EObject this_XBasicForLoopExpression_8 = null;

        EObject this_XWhileExpression_9 = null;

        EObject this_XDoWhileExpression_10 = null;

        EObject this_XThrowExpression_11 = null;

        EObject this_XReturnExpression_12 = null;

        EObject this_XTryCatchFinallyExpression_13 = null;

        EObject this_XParenthesizedExpression_14 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:2302:2: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | ( ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression ) | this_XFeatureCall_4= ruleXFeatureCall | this_XLiteral_5= ruleXLiteral | this_XIfExpression_6= ruleXIfExpression | ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression ) | this_XBasicForLoopExpression_8= ruleXBasicForLoopExpression | this_XWhileExpression_9= ruleXWhileExpression | this_XDoWhileExpression_10= ruleXDoWhileExpression | this_XThrowExpression_11= ruleXThrowExpression | this_XReturnExpression_12= ruleXReturnExpression | this_XTryCatchFinallyExpression_13= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_14= ruleXParenthesizedExpression ) )
            // InternalSqlQueryDsl.g:2303:2: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | ( ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression ) | this_XFeatureCall_4= ruleXFeatureCall | this_XLiteral_5= ruleXLiteral | this_XIfExpression_6= ruleXIfExpression | ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression ) | this_XBasicForLoopExpression_8= ruleXBasicForLoopExpression | this_XWhileExpression_9= ruleXWhileExpression | this_XDoWhileExpression_10= ruleXDoWhileExpression | this_XThrowExpression_11= ruleXThrowExpression | this_XReturnExpression_12= ruleXReturnExpression | this_XTryCatchFinallyExpression_13= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_14= ruleXParenthesizedExpression )
            {
            // InternalSqlQueryDsl.g:2303:2: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | ( ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression ) | this_XFeatureCall_4= ruleXFeatureCall | this_XLiteral_5= ruleXLiteral | this_XIfExpression_6= ruleXIfExpression | ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression ) | this_XBasicForLoopExpression_8= ruleXBasicForLoopExpression | this_XWhileExpression_9= ruleXWhileExpression | this_XDoWhileExpression_10= ruleXDoWhileExpression | this_XThrowExpression_11= ruleXThrowExpression | this_XReturnExpression_12= ruleXReturnExpression | this_XTryCatchFinallyExpression_13= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_14= ruleXParenthesizedExpression )
            int alt38=15;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // InternalSqlQueryDsl.g:2304:3: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XConstructorCall_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSqlQueryDsl.g:2313:3: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XBlockExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSqlQueryDsl.g:2322:3: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XSwitchExpression_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSqlQueryDsl.g:2331:3: ( ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression )
                    {
                    // InternalSqlQueryDsl.g:2331:3: ( ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression )
                    // InternalSqlQueryDsl.g:2332:4: ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSynchronizedExpressionParserRuleCall_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_XSynchronizedExpression_3=ruleXSynchronizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_XSynchronizedExpression_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSqlQueryDsl.g:2349:3: this_XFeatureCall_4= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XFeatureCall_4=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XFeatureCall_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalSqlQueryDsl.g:2358:3: this_XLiteral_5= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XLiteral_5=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XLiteral_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalSqlQueryDsl.g:2367:3: this_XIfExpression_6= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XIfExpression_6=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XIfExpression_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalSqlQueryDsl.g:2376:3: ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression )
                    {
                    // InternalSqlQueryDsl.g:2376:3: ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression )
                    // InternalSqlQueryDsl.g:2377:4: ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_7());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_XForLoopExpression_7=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_XForLoopExpression_7;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalSqlQueryDsl.g:2400:3: this_XBasicForLoopExpression_8= ruleXBasicForLoopExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBasicForLoopExpressionParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XBasicForLoopExpression_8=ruleXBasicForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XBasicForLoopExpression_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalSqlQueryDsl.g:2409:3: this_XWhileExpression_9= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XWhileExpression_9=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XWhileExpression_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalSqlQueryDsl.g:2418:3: this_XDoWhileExpression_10= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XDoWhileExpression_10=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XDoWhileExpression_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalSqlQueryDsl.g:2427:3: this_XThrowExpression_11= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_11());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XThrowExpression_11=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XThrowExpression_11;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalSqlQueryDsl.g:2436:3: this_XReturnExpression_12= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_12());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XReturnExpression_12=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XReturnExpression_12;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalSqlQueryDsl.g:2445:3: this_XTryCatchFinallyExpression_13= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_13());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XTryCatchFinallyExpression_13=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XTryCatchFinallyExpression_13;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalSqlQueryDsl.g:2454:3: this_XParenthesizedExpression_14= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_14());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XParenthesizedExpression_14=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XParenthesizedExpression_14;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // InternalSqlQueryDsl.g:2466:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // InternalSqlQueryDsl.g:2466:49: (iv_ruleXLiteral= ruleXLiteral EOF )
            // InternalSqlQueryDsl.g:2467:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // InternalSqlQueryDsl.g:2473:1: ruleXLiteral returns [EObject current=null] : (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XCollectionLiteral_0 = null;

        EObject this_XClosure_1 = null;

        EObject this_XBooleanLiteral_2 = null;

        EObject this_XNumberLiteral_3 = null;

        EObject this_XNullLiteral_4 = null;

        EObject this_XStringLiteral_5 = null;

        EObject this_XTypeLiteral_6 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:2479:2: ( (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral ) )
            // InternalSqlQueryDsl.g:2480:2: (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral )
            {
            // InternalSqlQueryDsl.g:2480:2: (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral )
            int alt39=7;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==53) ) {
                alt39=1;
            }
            else if ( (LA39_0==56) && (synpred21_InternalSqlQueryDsl())) {
                alt39=2;
            }
            else if ( ((LA39_0>=77 && LA39_0<=78)) ) {
                alt39=3;
            }
            else if ( ((LA39_0>=RULE_HEX && LA39_0<=RULE_DECIMAL)) ) {
                alt39=4;
            }
            else if ( (LA39_0==79) ) {
                alt39=5;
            }
            else if ( (LA39_0==RULE_STRING) ) {
                alt39=6;
            }
            else if ( (LA39_0==80) ) {
                alt39=7;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalSqlQueryDsl.g:2481:3: this_XCollectionLiteral_0= ruleXCollectionLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXLiteralAccess().getXCollectionLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XCollectionLiteral_0=ruleXCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XCollectionLiteral_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSqlQueryDsl.g:2490:3: ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure )
                    {
                    // InternalSqlQueryDsl.g:2490:3: ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure )
                    // InternalSqlQueryDsl.g:2491:4: ( ( () '[' ) )=>this_XClosure_1= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_XClosure_1=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_XClosure_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSqlQueryDsl.g:2507:3: this_XBooleanLiteral_2= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XBooleanLiteral_2=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XBooleanLiteral_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSqlQueryDsl.g:2516:3: this_XNumberLiteral_3= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XNumberLiteral_3=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XNumberLiteral_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSqlQueryDsl.g:2525:3: this_XNullLiteral_4= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XNullLiteral_4=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XNullLiteral_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalSqlQueryDsl.g:2534:3: this_XStringLiteral_5= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XStringLiteral_5=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XStringLiteral_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalSqlQueryDsl.g:2543:3: this_XTypeLiteral_6= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XTypeLiteral_6=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XTypeLiteral_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXCollectionLiteral"
    // InternalSqlQueryDsl.g:2555:1: entryRuleXCollectionLiteral returns [EObject current=null] : iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF ;
    public final EObject entryRuleXCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCollectionLiteral = null;


        try {
            // InternalSqlQueryDsl.g:2555:59: (iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF )
            // InternalSqlQueryDsl.g:2556:2: iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCollectionLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXCollectionLiteral=ruleXCollectionLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCollectionLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCollectionLiteral"


    // $ANTLR start "ruleXCollectionLiteral"
    // InternalSqlQueryDsl.g:2562:1: ruleXCollectionLiteral returns [EObject current=null] : (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral ) ;
    public final EObject ruleXCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XSetLiteral_0 = null;

        EObject this_XListLiteral_1 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:2568:2: ( (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral ) )
            // InternalSqlQueryDsl.g:2569:2: (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral )
            {
            // InternalSqlQueryDsl.g:2569:2: (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==53) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==56) ) {
                    alt40=2;
                }
                else if ( (LA40_1==54) ) {
                    alt40=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalSqlQueryDsl.g:2570:3: this_XSetLiteral_0= ruleXSetLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXCollectionLiteralAccess().getXSetLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XSetLiteral_0=ruleXSetLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XSetLiteral_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSqlQueryDsl.g:2579:3: this_XListLiteral_1= ruleXListLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXCollectionLiteralAccess().getXListLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XListLiteral_1=ruleXListLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XListLiteral_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCollectionLiteral"


    // $ANTLR start "entryRuleXSetLiteral"
    // InternalSqlQueryDsl.g:2591:1: entryRuleXSetLiteral returns [EObject current=null] : iv_ruleXSetLiteral= ruleXSetLiteral EOF ;
    public final EObject entryRuleXSetLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSetLiteral = null;


        try {
            // InternalSqlQueryDsl.g:2591:52: (iv_ruleXSetLiteral= ruleXSetLiteral EOF )
            // InternalSqlQueryDsl.g:2592:2: iv_ruleXSetLiteral= ruleXSetLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSetLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXSetLiteral=ruleXSetLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSetLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSetLiteral"


    // $ANTLR start "ruleXSetLiteral"
    // InternalSqlQueryDsl.g:2598:1: ruleXSetLiteral returns [EObject current=null] : ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleXSetLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:2604:2: ( ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' ) )
            // InternalSqlQueryDsl.g:2605:2: ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' )
            {
            // InternalSqlQueryDsl.g:2605:2: ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' )
            // InternalSqlQueryDsl.g:2606:3: () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}'
            {
            // InternalSqlQueryDsl.g:2606:3: ()
            // InternalSqlQueryDsl.g:2607:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXSetLiteralAccess().getXSetLiteralAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXSetLiteralAccess().getNumberSignKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,54,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getXSetLiteralAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalSqlQueryDsl.g:2621:3: ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_STRING && LA42_0<=RULE_DECIMAL)||LA42_0==15||LA42_0==24||(LA42_0>=40 && LA42_0<=41)||LA42_0==46||(LA42_0>=53 && LA42_0<=54)||LA42_0==56||LA42_0==60||LA42_0==62||(LA42_0>=66 && LA42_0<=68)||(LA42_0>=71 && LA42_0<=83)||LA42_0==85) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSqlQueryDsl.g:2622:4: ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    {
                    // InternalSqlQueryDsl.g:2622:4: ( (lv_elements_3_0= ruleXExpression ) )
                    // InternalSqlQueryDsl.g:2623:5: (lv_elements_3_0= ruleXExpression )
                    {
                    // InternalSqlQueryDsl.g:2623:5: (lv_elements_3_0= ruleXExpression )
                    // InternalSqlQueryDsl.g:2624:6: lv_elements_3_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXSetLiteralAccess().getElementsXExpressionParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_39);
                    lv_elements_3_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXSetLiteralRule());
                      						}
                      						add(
                      							current,
                      							"elements",
                      							lv_elements_3_0,
                      							"org.eclipse.xtext.xbase.Xbase.XExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSqlQueryDsl.g:2641:4: (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==16) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalSqlQueryDsl.g:2642:5: otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getXSetLiteralAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalSqlQueryDsl.g:2646:5: ( (lv_elements_5_0= ruleXExpression ) )
                    	    // InternalSqlQueryDsl.g:2647:6: (lv_elements_5_0= ruleXExpression )
                    	    {
                    	    // InternalSqlQueryDsl.g:2647:6: (lv_elements_5_0= ruleXExpression )
                    	    // InternalSqlQueryDsl.g:2648:7: lv_elements_5_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getXSetLiteralAccess().getElementsXExpressionParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_39);
                    	    lv_elements_5_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getXSetLiteralRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_5_0,
                    	      								"org.eclipse.xtext.xbase.Xbase.XExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getXSetLiteralAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSetLiteral"


    // $ANTLR start "entryRuleXListLiteral"
    // InternalSqlQueryDsl.g:2675:1: entryRuleXListLiteral returns [EObject current=null] : iv_ruleXListLiteral= ruleXListLiteral EOF ;
    public final EObject entryRuleXListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXListLiteral = null;


        try {
            // InternalSqlQueryDsl.g:2675:53: (iv_ruleXListLiteral= ruleXListLiteral EOF )
            // InternalSqlQueryDsl.g:2676:2: iv_ruleXListLiteral= ruleXListLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXListLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXListLiteral=ruleXListLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXListLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXListLiteral"


    // $ANTLR start "ruleXListLiteral"
    // InternalSqlQueryDsl.g:2682:1: ruleXListLiteral returns [EObject current=null] : ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' ) ;
    public final EObject ruleXListLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:2688:2: ( ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' ) )
            // InternalSqlQueryDsl.g:2689:2: ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' )
            {
            // InternalSqlQueryDsl.g:2689:2: ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' )
            // InternalSqlQueryDsl.g:2690:3: () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']'
            {
            // InternalSqlQueryDsl.g:2690:3: ()
            // InternalSqlQueryDsl.g:2691:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXListLiteralAccess().getXListLiteralAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXListLiteralAccess().getNumberSignKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,56,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getXListLiteralAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalSqlQueryDsl.g:2705:3: ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_STRING && LA44_0<=RULE_DECIMAL)||LA44_0==15||LA44_0==24||(LA44_0>=40 && LA44_0<=41)||LA44_0==46||(LA44_0>=53 && LA44_0<=54)||LA44_0==56||LA44_0==60||LA44_0==62||(LA44_0>=66 && LA44_0<=68)||(LA44_0>=71 && LA44_0<=83)||LA44_0==85) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSqlQueryDsl.g:2706:4: ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    {
                    // InternalSqlQueryDsl.g:2706:4: ( (lv_elements_3_0= ruleXExpression ) )
                    // InternalSqlQueryDsl.g:2707:5: (lv_elements_3_0= ruleXExpression )
                    {
                    // InternalSqlQueryDsl.g:2707:5: (lv_elements_3_0= ruleXExpression )
                    // InternalSqlQueryDsl.g:2708:6: lv_elements_3_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXListLiteralAccess().getElementsXExpressionParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_42);
                    lv_elements_3_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXListLiteralRule());
                      						}
                      						add(
                      							current,
                      							"elements",
                      							lv_elements_3_0,
                      							"org.eclipse.xtext.xbase.Xbase.XExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSqlQueryDsl.g:2725:4: (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==16) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalSqlQueryDsl.g:2726:5: otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getXListLiteralAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalSqlQueryDsl.g:2730:5: ( (lv_elements_5_0= ruleXExpression ) )
                    	    // InternalSqlQueryDsl.g:2731:6: (lv_elements_5_0= ruleXExpression )
                    	    {
                    	    // InternalSqlQueryDsl.g:2731:6: (lv_elements_5_0= ruleXExpression )
                    	    // InternalSqlQueryDsl.g:2732:7: lv_elements_5_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getXListLiteralAccess().getElementsXExpressionParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_42);
                    	    lv_elements_5_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getXListLiteralRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_5_0,
                    	      								"org.eclipse.xtext.xbase.Xbase.XExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getXListLiteralAccess().getRightSquareBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXListLiteral"


    // $ANTLR start "entryRuleXClosure"
    // InternalSqlQueryDsl.g:2759:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // InternalSqlQueryDsl.g:2759:49: (iv_ruleXClosure= ruleXClosure EOF )
            // InternalSqlQueryDsl.g:2760:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // InternalSqlQueryDsl.g:2766:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:2772:2: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // InternalSqlQueryDsl.g:2773:2: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // InternalSqlQueryDsl.g:2773:2: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // InternalSqlQueryDsl.g:2774:3: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // InternalSqlQueryDsl.g:2774:3: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // InternalSqlQueryDsl.g:2775:4: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // InternalSqlQueryDsl.g:2781:4: ( () otherlv_1= '[' )
            // InternalSqlQueryDsl.g:2782:5: () otherlv_1= '['
            {
            // InternalSqlQueryDsl.g:2782:5: ()
            // InternalSqlQueryDsl.g:2783:6: 
            {
            if ( state.backtracking==0 ) {

              						current = forceCreateModelElement(
              							grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
              							current);
              					
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
              				
            }

            }


            }

            // InternalSqlQueryDsl.g:2795:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt47=2;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // InternalSqlQueryDsl.g:2796:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // InternalSqlQueryDsl.g:2819:4: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // InternalSqlQueryDsl.g:2820:5: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // InternalSqlQueryDsl.g:2820:5: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_ID||LA46_0==15||LA46_0==37) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalSqlQueryDsl.g:2821:6: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // InternalSqlQueryDsl.g:2821:6: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // InternalSqlQueryDsl.g:2822:7: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // InternalSqlQueryDsl.g:2822:7: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // InternalSqlQueryDsl.g:2823:8: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0());
                              							
                            }
                            pushFollow(FOLLOW_44);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getXClosureRule());
                              								}
                              								add(
                              									current,
                              									"declaredFormalParameters",
                              									lv_declaredFormalParameters_2_0,
                              									"org.eclipse.xtext.xbase.Xbase.JvmFormalParameter");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalSqlQueryDsl.g:2840:6: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop45:
                            do {
                                int alt45=2;
                                int LA45_0 = input.LA(1);

                                if ( (LA45_0==16) ) {
                                    alt45=1;
                                }


                                switch (alt45) {
                            	case 1 :
                            	    // InternalSqlQueryDsl.g:2841:7: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	      						
                            	    }
                            	    // InternalSqlQueryDsl.g:2845:7: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // InternalSqlQueryDsl.g:2846:8: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // InternalSqlQueryDsl.g:2846:8: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // InternalSqlQueryDsl.g:2847:9: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_44);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"declaredFormalParameters",
                            	      										lv_declaredFormalParameters_4_0,
                            	      										"org.eclipse.xtext.xbase.Xbase.JvmFormalParameter");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop45;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalSqlQueryDsl.g:2866:5: ( (lv_explicitSyntax_5_0= '|' ) )
                    // InternalSqlQueryDsl.g:2867:6: (lv_explicitSyntax_5_0= '|' )
                    {
                    // InternalSqlQueryDsl.g:2867:6: (lv_explicitSyntax_5_0= '|' )
                    // InternalSqlQueryDsl.g:2868:7: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,58,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_1_0_1_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getXClosureRule());
                      							}
                      							setWithLastConsumed(current, "explicitSyntax", true, "|");
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalSqlQueryDsl.g:2882:3: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // InternalSqlQueryDsl.g:2883:4: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // InternalSqlQueryDsl.g:2883:4: (lv_expression_6_0= ruleXExpressionInClosure )
            // InternalSqlQueryDsl.g:2884:5: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_46);
            lv_expression_6_0=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXClosureRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_6_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpressionInClosure");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXExpressionInClosure"
    // InternalSqlQueryDsl.g:2909:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // InternalSqlQueryDsl.g:2909:61: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // InternalSqlQueryDsl.g:2910:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // InternalSqlQueryDsl.g:2916:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:2922:2: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_2= ';' )? )* ) )
            // InternalSqlQueryDsl.g:2923:2: ( () ( ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_2= ';' )? )* )
            {
            // InternalSqlQueryDsl.g:2923:2: ( () ( ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_2= ';' )? )* )
            // InternalSqlQueryDsl.g:2924:3: () ( ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_2= ';' )? )*
            {
            // InternalSqlQueryDsl.g:2924:3: ()
            // InternalSqlQueryDsl.g:2925:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalSqlQueryDsl.g:2931:3: ( ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_2= ';' )? )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=RULE_STRING && LA49_0<=RULE_DECIMAL)||LA49_0==15||LA49_0==24||(LA49_0>=40 && LA49_0<=41)||LA49_0==46||(LA49_0>=53 && LA49_0<=54)||LA49_0==56||LA49_0==60||LA49_0==62||(LA49_0>=66 && LA49_0<=83)||LA49_0==85) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalSqlQueryDsl.g:2932:4: ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_2= ';' )?
            	    {
            	    // InternalSqlQueryDsl.g:2932:4: ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) )
            	    // InternalSqlQueryDsl.g:2933:5: (lv_expressions_1_0= ruleXExpressionOrVarDeclaration )
            	    {
            	    // InternalSqlQueryDsl.g:2933:5: (lv_expressions_1_0= ruleXExpressionOrVarDeclaration )
            	    // InternalSqlQueryDsl.g:2934:6: lv_expressions_1_0= ruleXExpressionOrVarDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionOrVarDeclarationParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_47);
            	    lv_expressions_1_0=ruleXExpressionOrVarDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      						}
            	      						add(
            	      							current,
            	      							"expressions",
            	      							lv_expressions_1_0,
            	      							"org.eclipse.xtext.xbase.Xbase.XExpressionOrVarDeclaration");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalSqlQueryDsl.g:2951:4: (otherlv_2= ';' )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==59) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // InternalSqlQueryDsl.g:2952:5: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,59,FOLLOW_48); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // InternalSqlQueryDsl.g:2962:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // InternalSqlQueryDsl.g:2962:54: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // InternalSqlQueryDsl.g:2963:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // InternalSqlQueryDsl.g:2969:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:2975:2: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // InternalSqlQueryDsl.g:2976:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // InternalSqlQueryDsl.g:2976:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // InternalSqlQueryDsl.g:2977:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // InternalSqlQueryDsl.g:2977:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // InternalSqlQueryDsl.g:2978:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // InternalSqlQueryDsl.g:3003:4: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // InternalSqlQueryDsl.g:3004:5: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // InternalSqlQueryDsl.g:3004:5: ()
            // InternalSqlQueryDsl.g:3005:6: 
            {
            if ( state.backtracking==0 ) {

              						current = forceCreateModelElement(
              							grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
              							current);
              					
            }

            }

            // InternalSqlQueryDsl.g:3011:5: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID||LA51_0==15||LA51_0==37) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalSqlQueryDsl.g:3012:6: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // InternalSqlQueryDsl.g:3012:6: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // InternalSqlQueryDsl.g:3013:7: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // InternalSqlQueryDsl.g:3013:7: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // InternalSqlQueryDsl.g:3014:8: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0());
                      							
                    }
                    pushFollow(FOLLOW_44);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      								}
                      								add(
                      									current,
                      									"declaredFormalParameters",
                      									lv_declaredFormalParameters_1_0,
                      									"org.eclipse.xtext.xbase.Xbase.JvmFormalParameter");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalSqlQueryDsl.g:3031:6: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==16) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalSqlQueryDsl.g:3032:7: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	      						
                    	    }
                    	    // InternalSqlQueryDsl.g:3036:7: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // InternalSqlQueryDsl.g:3037:8: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // InternalSqlQueryDsl.g:3037:8: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // InternalSqlQueryDsl.g:3038:9: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      									newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0());
                    	      								
                    	    }
                    	    pushFollow(FOLLOW_44);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      									if (current==null) {
                    	      										current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      									}
                    	      									add(
                    	      										current,
                    	      										"declaredFormalParameters",
                    	      										lv_declaredFormalParameters_3_0,
                    	      										"org.eclipse.xtext.xbase.Xbase.JvmFormalParameter");
                    	      									afterParserOrEnumRuleCall();
                    	      								
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSqlQueryDsl.g:3057:5: ( (lv_explicitSyntax_4_0= '|' ) )
            // InternalSqlQueryDsl.g:3058:6: (lv_explicitSyntax_4_0= '|' )
            {
            // InternalSqlQueryDsl.g:3058:6: (lv_explicitSyntax_4_0= '|' )
            // InternalSqlQueryDsl.g:3059:7: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,58,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              							newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
              						
            }
            if ( state.backtracking==0 ) {

              							if (current==null) {
              								current = createModelElement(grammarAccess.getXShortClosureRule());
              							}
              							setWithLastConsumed(current, "explicitSyntax", true, "|");
              						
            }

            }


            }


            }


            }

            // InternalSqlQueryDsl.g:3073:3: ( (lv_expression_5_0= ruleXExpression ) )
            // InternalSqlQueryDsl.g:3074:4: (lv_expression_5_0= ruleXExpression )
            {
            // InternalSqlQueryDsl.g:3074:4: (lv_expression_5_0= ruleXExpression )
            // InternalSqlQueryDsl.g:3075:5: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_5_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // InternalSqlQueryDsl.g:3096:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // InternalSqlQueryDsl.g:3096:65: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // InternalSqlQueryDsl.g:3097:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // InternalSqlQueryDsl.g:3103:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:3109:2: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // InternalSqlQueryDsl.g:3110:2: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // InternalSqlQueryDsl.g:3110:2: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // InternalSqlQueryDsl.g:3111:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_35);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XExpression_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // InternalSqlQueryDsl.g:3131:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // InternalSqlQueryDsl.g:3131:54: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // InternalSqlQueryDsl.g:3132:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // InternalSqlQueryDsl.g:3138:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:3144:2: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // InternalSqlQueryDsl.g:3145:2: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // InternalSqlQueryDsl.g:3145:2: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // InternalSqlQueryDsl.g:3146:3: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // InternalSqlQueryDsl.g:3146:3: ()
            // InternalSqlQueryDsl.g:3147:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,15,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalSqlQueryDsl.g:3161:3: ( (lv_if_3_0= ruleXExpression ) )
            // InternalSqlQueryDsl.g:3162:4: (lv_if_3_0= ruleXExpression )
            {
            // InternalSqlQueryDsl.g:3162:4: (lv_if_3_0= ruleXExpression )
            // InternalSqlQueryDsl.g:3163:5: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              					}
              					set(
              						current,
              						"if",
              						lv_if_3_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalSqlQueryDsl.g:3184:3: ( (lv_then_5_0= ruleXExpression ) )
            // InternalSqlQueryDsl.g:3185:4: (lv_then_5_0= ruleXExpression )
            {
            // InternalSqlQueryDsl.g:3185:4: (lv_then_5_0= ruleXExpression )
            // InternalSqlQueryDsl.g:3186:5: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_49);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              					}
              					set(
              						current,
              						"then",
              						lv_then_5_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSqlQueryDsl.g:3203:3: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==61) ) {
                int LA52_1 = input.LA(2);

                if ( (synpred25_InternalSqlQueryDsl()) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // InternalSqlQueryDsl.g:3204:4: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // InternalSqlQueryDsl.g:3204:4: ( ( 'else' )=>otherlv_6= 'else' )
                    // InternalSqlQueryDsl.g:3205:5: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,61,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                      				
                    }

                    }

                    // InternalSqlQueryDsl.g:3211:4: ( (lv_else_7_0= ruleXExpression ) )
                    // InternalSqlQueryDsl.g:3212:5: (lv_else_7_0= ruleXExpression )
                    {
                    // InternalSqlQueryDsl.g:3212:5: (lv_else_7_0= ruleXExpression )
                    // InternalSqlQueryDsl.g:3213:6: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      						}
                      						set(
                      							current,
                      							"else",
                      							lv_else_7_0,
                      							"org.eclipse.xtext.xbase.Xbase.XExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // InternalSqlQueryDsl.g:3235:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // InternalSqlQueryDsl.g:3235:58: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // InternalSqlQueryDsl.g:3236:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // InternalSqlQueryDsl.g:3242:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' ) | ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )* (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_switch_5_0 = null;

        EObject lv_declaredParam_7_0 = null;

        EObject lv_switch_9_0 = null;

        EObject lv_cases_11_0 = null;

        EObject lv_default_14_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:3248:2: ( ( () otherlv_1= 'switch' ( ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' ) | ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )* (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // InternalSqlQueryDsl.g:3249:2: ( () otherlv_1= 'switch' ( ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' ) | ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )* (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // InternalSqlQueryDsl.g:3249:2: ( () otherlv_1= 'switch' ( ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' ) | ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )* (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // InternalSqlQueryDsl.g:3250:3: () otherlv_1= 'switch' ( ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' ) | ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )* (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // InternalSqlQueryDsl.g:3250:3: ()
            // InternalSqlQueryDsl.g:3251:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
              		
            }
            // InternalSqlQueryDsl.g:3261:3: ( ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' ) | ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) ) )
            int alt54=2;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // InternalSqlQueryDsl.g:3262:4: ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' )
                    {
                    // InternalSqlQueryDsl.g:3262:4: ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' )
                    // InternalSqlQueryDsl.g:3263:5: ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')'
                    {
                    // InternalSqlQueryDsl.g:3263:5: ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) )
                    // InternalSqlQueryDsl.g:3264:6: ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' )
                    {
                    // InternalSqlQueryDsl.g:3274:6: (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' )
                    // InternalSqlQueryDsl.g:3275:7: otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_2, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_0_0_0_0());
                      						
                    }
                    // InternalSqlQueryDsl.g:3279:7: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
                    // InternalSqlQueryDsl.g:3280:8: (lv_declaredParam_3_0= ruleJvmFormalParameter )
                    {
                    // InternalSqlQueryDsl.g:3280:8: (lv_declaredParam_3_0= ruleJvmFormalParameter )
                    // InternalSqlQueryDsl.g:3281:9: lv_declaredParam_3_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {

                      									newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_0_0_0_1_0());
                      								
                    }
                    pushFollow(FOLLOW_51);
                    lv_declaredParam_3_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      									if (current==null) {
                      										current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      									}
                      									set(
                      										current,
                      										"declaredParam",
                      										lv_declaredParam_3_0,
                      										"org.eclipse.xtext.xbase.Xbase.JvmFormalParameter");
                      									afterParserOrEnumRuleCall();
                      								
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,63,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_4, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_2());
                      						
                    }

                    }


                    }

                    // InternalSqlQueryDsl.g:3304:5: ( (lv_switch_5_0= ruleXExpression ) )
                    // InternalSqlQueryDsl.g:3305:6: (lv_switch_5_0= ruleXExpression )
                    {
                    // InternalSqlQueryDsl.g:3305:6: (lv_switch_5_0= ruleXExpression )
                    // InternalSqlQueryDsl.g:3306:7: lv_switch_5_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_35);
                    lv_switch_5_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      							}
                      							set(
                      								current,
                      								"switch",
                      								lv_switch_5_0,
                      								"org.eclipse.xtext.xbase.Xbase.XExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,17,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_0_2());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSqlQueryDsl.g:3329:4: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) )
                    {
                    // InternalSqlQueryDsl.g:3329:4: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) )
                    // InternalSqlQueryDsl.g:3330:5: ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) )
                    {
                    // InternalSqlQueryDsl.g:3330:5: ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )?
                    int alt53=2;
                    alt53 = dfa53.predict(input);
                    switch (alt53) {
                        case 1 :
                            // InternalSqlQueryDsl.g:3331:6: ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' )
                            {
                            // InternalSqlQueryDsl.g:3340:6: ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' )
                            // InternalSqlQueryDsl.g:3341:7: ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':'
                            {
                            // InternalSqlQueryDsl.g:3341:7: ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) )
                            // InternalSqlQueryDsl.g:3342:8: (lv_declaredParam_7_0= ruleJvmFormalParameter )
                            {
                            // InternalSqlQueryDsl.g:3342:8: (lv_declaredParam_7_0= ruleJvmFormalParameter )
                            // InternalSqlQueryDsl.g:3343:9: lv_declaredParam_7_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_1_0_0_0_0());
                              								
                            }
                            pushFollow(FOLLOW_51);
                            lv_declaredParam_7_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                              									}
                              									set(
                              										current,
                              										"declaredParam",
                              										lv_declaredParam_7_0,
                              										"org.eclipse.xtext.xbase.Xbase.JvmFormalParameter");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }

                            otherlv_8=(Token)match(input,63,FOLLOW_11); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_1());
                              						
                            }

                            }


                            }
                            break;

                    }

                    // InternalSqlQueryDsl.g:3366:5: ( (lv_switch_9_0= ruleXExpression ) )
                    // InternalSqlQueryDsl.g:3367:6: (lv_switch_9_0= ruleXExpression )
                    {
                    // InternalSqlQueryDsl.g:3367:6: (lv_switch_9_0= ruleXExpression )
                    // InternalSqlQueryDsl.g:3368:7: lv_switch_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_37);
                    lv_switch_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      							}
                      							set(
                      								current,
                      								"switch",
                      								lv_switch_9_0,
                      								"org.eclipse.xtext.xbase.Xbase.XExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,54,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalSqlQueryDsl.g:3391:3: ( (lv_cases_11_0= ruleXCasePart ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_ID||(LA55_0>=15 && LA55_0<=16)||LA55_0==37||LA55_0==63||LA55_0==65) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalSqlQueryDsl.g:3392:4: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // InternalSqlQueryDsl.g:3392:4: (lv_cases_11_0= ruleXCasePart )
            	    // InternalSqlQueryDsl.g:3393:5: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_52);
            	    lv_cases_11_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"cases",
            	      						lv_cases_11_0,
            	      						"org.eclipse.xtext.xbase.Xbase.XCasePart");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            // InternalSqlQueryDsl.g:3410:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==64) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalSqlQueryDsl.g:3411:4: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,64,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                      			
                    }
                    otherlv_13=(Token)match(input,63,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                      			
                    }
                    // InternalSqlQueryDsl.g:3419:4: ( (lv_default_14_0= ruleXExpression ) )
                    // InternalSqlQueryDsl.g:3420:5: (lv_default_14_0= ruleXExpression )
                    {
                    // InternalSqlQueryDsl.g:3420:5: (lv_default_14_0= ruleXExpression )
                    // InternalSqlQueryDsl.g:3421:6: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_53);
                    lv_default_14_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      						}
                      						set(
                      							current,
                      							"default",
                      							lv_default_14_0,
                      							"org.eclipse.xtext.xbase.Xbase.XExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // InternalSqlQueryDsl.g:3447:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // InternalSqlQueryDsl.g:3447:50: (iv_ruleXCasePart= ruleXCasePart EOF )
            // InternalSqlQueryDsl.g:3448:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // InternalSqlQueryDsl.g:3454:1: ruleXCasePart returns [EObject current=null] : ( () ( (lv_typeGuard_1_0= ruleJvmTypeReference ) )? (otherlv_2= 'case' ( (lv_case_3_0= ruleXExpression ) ) )? ( (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) ) | ( (lv_fallThrough_6_0= ',' ) ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_fallThrough_6_0=null;
        EObject lv_typeGuard_1_0 = null;

        EObject lv_case_3_0 = null;

        EObject lv_then_5_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:3460:2: ( ( () ( (lv_typeGuard_1_0= ruleJvmTypeReference ) )? (otherlv_2= 'case' ( (lv_case_3_0= ruleXExpression ) ) )? ( (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) ) | ( (lv_fallThrough_6_0= ',' ) ) ) ) )
            // InternalSqlQueryDsl.g:3461:2: ( () ( (lv_typeGuard_1_0= ruleJvmTypeReference ) )? (otherlv_2= 'case' ( (lv_case_3_0= ruleXExpression ) ) )? ( (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) ) | ( (lv_fallThrough_6_0= ',' ) ) ) )
            {
            // InternalSqlQueryDsl.g:3461:2: ( () ( (lv_typeGuard_1_0= ruleJvmTypeReference ) )? (otherlv_2= 'case' ( (lv_case_3_0= ruleXExpression ) ) )? ( (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) ) | ( (lv_fallThrough_6_0= ',' ) ) ) )
            // InternalSqlQueryDsl.g:3462:3: () ( (lv_typeGuard_1_0= ruleJvmTypeReference ) )? (otherlv_2= 'case' ( (lv_case_3_0= ruleXExpression ) ) )? ( (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) ) | ( (lv_fallThrough_6_0= ',' ) ) )
            {
            // InternalSqlQueryDsl.g:3462:3: ()
            // InternalSqlQueryDsl.g:3463:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXCasePartAccess().getXCasePartAction_0(),
              					current);
              			
            }

            }

            // InternalSqlQueryDsl.g:3469:3: ( (lv_typeGuard_1_0= ruleJvmTypeReference ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID||LA57_0==15||LA57_0==37) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalSqlQueryDsl.g:3470:4: (lv_typeGuard_1_0= ruleJvmTypeReference )
                    {
                    // InternalSqlQueryDsl.g:3470:4: (lv_typeGuard_1_0= ruleJvmTypeReference )
                    // InternalSqlQueryDsl.g:3471:5: lv_typeGuard_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_54);
                    lv_typeGuard_1_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      					}
                      					set(
                      						current,
                      						"typeGuard",
                      						lv_typeGuard_1_0,
                      						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSqlQueryDsl.g:3488:3: (otherlv_2= 'case' ( (lv_case_3_0= ruleXExpression ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==65) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalSqlQueryDsl.g:3489:4: otherlv_2= 'case' ( (lv_case_3_0= ruleXExpression ) )
                    {
                    otherlv_2=(Token)match(input,65,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getXCasePartAccess().getCaseKeyword_2_0());
                      			
                    }
                    // InternalSqlQueryDsl.g:3493:4: ( (lv_case_3_0= ruleXExpression ) )
                    // InternalSqlQueryDsl.g:3494:5: (lv_case_3_0= ruleXExpression )
                    {
                    // InternalSqlQueryDsl.g:3494:5: (lv_case_3_0= ruleXExpression )
                    // InternalSqlQueryDsl.g:3495:6: lv_case_3_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_55);
                    lv_case_3_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      						}
                      						set(
                      							current,
                      							"case",
                      							lv_case_3_0,
                      							"org.eclipse.xtext.xbase.Xbase.XExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSqlQueryDsl.g:3513:3: ( (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) ) | ( (lv_fallThrough_6_0= ',' ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==63) ) {
                alt59=1;
            }
            else if ( (LA59_0==16) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalSqlQueryDsl.g:3514:4: (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) )
                    {
                    // InternalSqlQueryDsl.g:3514:4: (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) )
                    // InternalSqlQueryDsl.g:3515:5: otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) )
                    {
                    otherlv_4=(Token)match(input,63,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getXCasePartAccess().getColonKeyword_3_0_0());
                      				
                    }
                    // InternalSqlQueryDsl.g:3519:5: ( (lv_then_5_0= ruleXExpression ) )
                    // InternalSqlQueryDsl.g:3520:6: (lv_then_5_0= ruleXExpression )
                    {
                    // InternalSqlQueryDsl.g:3520:6: (lv_then_5_0= ruleXExpression )
                    // InternalSqlQueryDsl.g:3521:7: lv_then_5_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_then_5_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      							}
                      							set(
                      								current,
                      								"then",
                      								lv_then_5_0,
                      								"org.eclipse.xtext.xbase.Xbase.XExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSqlQueryDsl.g:3540:4: ( (lv_fallThrough_6_0= ',' ) )
                    {
                    // InternalSqlQueryDsl.g:3540:4: ( (lv_fallThrough_6_0= ',' ) )
                    // InternalSqlQueryDsl.g:3541:5: (lv_fallThrough_6_0= ',' )
                    {
                    // InternalSqlQueryDsl.g:3541:5: (lv_fallThrough_6_0= ',' )
                    // InternalSqlQueryDsl.g:3542:6: lv_fallThrough_6_0= ','
                    {
                    lv_fallThrough_6_0=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_fallThrough_6_0, grammarAccess.getXCasePartAccess().getFallThroughCommaKeyword_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getXCasePartRule());
                      						}
                      						setWithLastConsumed(current, "fallThrough", true, ",");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // InternalSqlQueryDsl.g:3559:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // InternalSqlQueryDsl.g:3559:59: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // InternalSqlQueryDsl.g:3560:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // InternalSqlQueryDsl.g:3566:1: ruleXForLoopExpression returns [EObject current=null] : ( ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:3572:2: ( ( ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // InternalSqlQueryDsl.g:3573:2: ( ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // InternalSqlQueryDsl.g:3573:2: ( ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // InternalSqlQueryDsl.g:3574:3: ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // InternalSqlQueryDsl.g:3574:3: ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) )
            // InternalSqlQueryDsl.g:3575:4: ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' )
            {
            // InternalSqlQueryDsl.g:3588:4: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' )
            // InternalSqlQueryDsl.g:3589:5: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':'
            {
            // InternalSqlQueryDsl.g:3589:5: ()
            // InternalSqlQueryDsl.g:3590:6: 
            {
            if ( state.backtracking==0 ) {

              						current = forceCreateModelElement(
              							grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0_0_0(),
              							current);
              					
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_0_0_1());
              				
            }
            otherlv_2=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_0_0_2());
              				
            }
            // InternalSqlQueryDsl.g:3604:5: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // InternalSqlQueryDsl.g:3605:6: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // InternalSqlQueryDsl.g:3605:6: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // InternalSqlQueryDsl.g:3606:7: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {

              							newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_0_0_3_0());
              						
            }
            pushFollow(FOLLOW_51);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              							if (current==null) {
              								current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              							}
              							set(
              								current,
              								"declaredParam",
              								lv_declaredParam_3_0,
              								"org.eclipse.xtext.xbase.Xbase.JvmFormalParameter");
              							afterParserOrEnumRuleCall();
              						
            }

            }


            }

            otherlv_4=(Token)match(input,63,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_0_0_4());
              				
            }

            }


            }

            // InternalSqlQueryDsl.g:3629:3: ( (lv_forExpression_5_0= ruleXExpression ) )
            // InternalSqlQueryDsl.g:3630:4: (lv_forExpression_5_0= ruleXExpression )
            {
            // InternalSqlQueryDsl.g:3630:4: (lv_forExpression_5_0= ruleXExpression )
            // InternalSqlQueryDsl.g:3631:5: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              					}
              					set(
              						current,
              						"forExpression",
              						lv_forExpression_5_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_2());
              		
            }
            // InternalSqlQueryDsl.g:3652:3: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // InternalSqlQueryDsl.g:3653:4: (lv_eachExpression_7_0= ruleXExpression )
            {
            // InternalSqlQueryDsl.g:3653:4: (lv_eachExpression_7_0= ruleXExpression )
            // InternalSqlQueryDsl.g:3654:5: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              					}
              					set(
              						current,
              						"eachExpression",
              						lv_eachExpression_7_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXBasicForLoopExpression"
    // InternalSqlQueryDsl.g:3675:1: entryRuleXBasicForLoopExpression returns [EObject current=null] : iv_ruleXBasicForLoopExpression= ruleXBasicForLoopExpression EOF ;
    public final EObject entryRuleXBasicForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBasicForLoopExpression = null;


        try {
            // InternalSqlQueryDsl.g:3675:64: (iv_ruleXBasicForLoopExpression= ruleXBasicForLoopExpression EOF )
            // InternalSqlQueryDsl.g:3676:2: iv_ruleXBasicForLoopExpression= ruleXBasicForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBasicForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXBasicForLoopExpression=ruleXBasicForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBasicForLoopExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBasicForLoopExpression"


    // $ANTLR start "ruleXBasicForLoopExpression"
    // InternalSqlQueryDsl.g:3682:1: ruleXBasicForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )* )? otherlv_6= ';' ( (lv_expression_7_0= ruleXExpression ) )? otherlv_8= ';' ( ( (lv_updateExpressions_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )* )? otherlv_12= ')' ( (lv_eachExpression_13_0= ruleXExpression ) ) ) ;
    public final EObject ruleXBasicForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_initExpressions_3_0 = null;

        EObject lv_initExpressions_5_0 = null;

        EObject lv_expression_7_0 = null;

        EObject lv_updateExpressions_9_0 = null;

        EObject lv_updateExpressions_11_0 = null;

        EObject lv_eachExpression_13_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:3688:2: ( ( () otherlv_1= 'for' otherlv_2= '(' ( ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )* )? otherlv_6= ';' ( (lv_expression_7_0= ruleXExpression ) )? otherlv_8= ';' ( ( (lv_updateExpressions_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )* )? otherlv_12= ')' ( (lv_eachExpression_13_0= ruleXExpression ) ) ) )
            // InternalSqlQueryDsl.g:3689:2: ( () otherlv_1= 'for' otherlv_2= '(' ( ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )* )? otherlv_6= ';' ( (lv_expression_7_0= ruleXExpression ) )? otherlv_8= ';' ( ( (lv_updateExpressions_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )* )? otherlv_12= ')' ( (lv_eachExpression_13_0= ruleXExpression ) ) )
            {
            // InternalSqlQueryDsl.g:3689:2: ( () otherlv_1= 'for' otherlv_2= '(' ( ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )* )? otherlv_6= ';' ( (lv_expression_7_0= ruleXExpression ) )? otherlv_8= ';' ( ( (lv_updateExpressions_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )* )? otherlv_12= ')' ( (lv_eachExpression_13_0= ruleXExpression ) ) )
            // InternalSqlQueryDsl.g:3690:3: () otherlv_1= 'for' otherlv_2= '(' ( ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )* )? otherlv_6= ';' ( (lv_expression_7_0= ruleXExpression ) )? otherlv_8= ';' ( ( (lv_updateExpressions_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )* )? otherlv_12= ')' ( (lv_eachExpression_13_0= ruleXExpression ) )
            {
            // InternalSqlQueryDsl.g:3690:3: ()
            // InternalSqlQueryDsl.g:3691:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXBasicForLoopExpressionAccess().getXBasicForLoopExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXBasicForLoopExpressionAccess().getForKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,15,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getXBasicForLoopExpressionAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalSqlQueryDsl.g:3705:3: ( ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )* )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=RULE_STRING && LA61_0<=RULE_DECIMAL)||LA61_0==15||LA61_0==24||(LA61_0>=40 && LA61_0<=41)||LA61_0==46||(LA61_0>=53 && LA61_0<=54)||LA61_0==56||LA61_0==60||LA61_0==62||(LA61_0>=66 && LA61_0<=83)||LA61_0==85) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalSqlQueryDsl.g:3706:4: ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )*
                    {
                    // InternalSqlQueryDsl.g:3706:4: ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) )
                    // InternalSqlQueryDsl.g:3707:5: (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration )
                    {
                    // InternalSqlQueryDsl.g:3707:5: (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration )
                    // InternalSqlQueryDsl.g:3708:6: lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXBasicForLoopExpressionAccess().getInitExpressionsXExpressionOrVarDeclarationParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_57);
                    lv_initExpressions_3_0=ruleXExpressionOrVarDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXBasicForLoopExpressionRule());
                      						}
                      						add(
                      							current,
                      							"initExpressions",
                      							lv_initExpressions_3_0,
                      							"org.eclipse.xtext.xbase.Xbase.XExpressionOrVarDeclaration");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSqlQueryDsl.g:3725:4: (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==16) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalSqlQueryDsl.g:3726:5: otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_58); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getXBasicForLoopExpressionAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalSqlQueryDsl.g:3730:5: ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) )
                    	    // InternalSqlQueryDsl.g:3731:6: (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration )
                    	    {
                    	    // InternalSqlQueryDsl.g:3731:6: (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration )
                    	    // InternalSqlQueryDsl.g:3732:7: lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getXBasicForLoopExpressionAccess().getInitExpressionsXExpressionOrVarDeclarationParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_57);
                    	    lv_initExpressions_5_0=ruleXExpressionOrVarDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getXBasicForLoopExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"initExpressions",
                    	      								lv_initExpressions_5_0,
                    	      								"org.eclipse.xtext.xbase.Xbase.XExpressionOrVarDeclaration");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,59,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getXBasicForLoopExpressionAccess().getSemicolonKeyword_4());
              		
            }
            // InternalSqlQueryDsl.g:3755:3: ( (lv_expression_7_0= ruleXExpression ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=RULE_STRING && LA62_0<=RULE_DECIMAL)||LA62_0==15||LA62_0==24||(LA62_0>=40 && LA62_0<=41)||LA62_0==46||(LA62_0>=53 && LA62_0<=54)||LA62_0==56||LA62_0==60||LA62_0==62||(LA62_0>=66 && LA62_0<=68)||(LA62_0>=71 && LA62_0<=83)||LA62_0==85) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalSqlQueryDsl.g:3756:4: (lv_expression_7_0= ruleXExpression )
                    {
                    // InternalSqlQueryDsl.g:3756:4: (lv_expression_7_0= ruleXExpression )
                    // InternalSqlQueryDsl.g:3757:5: lv_expression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getXBasicForLoopExpressionAccess().getExpressionXExpressionParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_60);
                    lv_expression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getXBasicForLoopExpressionRule());
                      					}
                      					set(
                      						current,
                      						"expression",
                      						lv_expression_7_0,
                      						"org.eclipse.xtext.xbase.Xbase.XExpression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,59,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getXBasicForLoopExpressionAccess().getSemicolonKeyword_6());
              		
            }
            // InternalSqlQueryDsl.g:3778:3: ( ( (lv_updateExpressions_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )* )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=RULE_STRING && LA64_0<=RULE_DECIMAL)||LA64_0==15||LA64_0==24||(LA64_0>=40 && LA64_0<=41)||LA64_0==46||(LA64_0>=53 && LA64_0<=54)||LA64_0==56||LA64_0==60||LA64_0==62||(LA64_0>=66 && LA64_0<=68)||(LA64_0>=71 && LA64_0<=83)||LA64_0==85) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalSqlQueryDsl.g:3779:4: ( (lv_updateExpressions_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )*
                    {
                    // InternalSqlQueryDsl.g:3779:4: ( (lv_updateExpressions_9_0= ruleXExpression ) )
                    // InternalSqlQueryDsl.g:3780:5: (lv_updateExpressions_9_0= ruleXExpression )
                    {
                    // InternalSqlQueryDsl.g:3780:5: (lv_updateExpressions_9_0= ruleXExpression )
                    // InternalSqlQueryDsl.g:3781:6: lv_updateExpressions_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXBasicForLoopExpressionAccess().getUpdateExpressionsXExpressionParserRuleCall_7_0_0());
                      					
                    }
                    pushFollow(FOLLOW_7);
                    lv_updateExpressions_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXBasicForLoopExpressionRule());
                      						}
                      						add(
                      							current,
                      							"updateExpressions",
                      							lv_updateExpressions_9_0,
                      							"org.eclipse.xtext.xbase.Xbase.XExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSqlQueryDsl.g:3798:4: (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==16) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalSqlQueryDsl.g:3799:5: otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_10, grammarAccess.getXBasicForLoopExpressionAccess().getCommaKeyword_7_1_0());
                    	      				
                    	    }
                    	    // InternalSqlQueryDsl.g:3803:5: ( (lv_updateExpressions_11_0= ruleXExpression ) )
                    	    // InternalSqlQueryDsl.g:3804:6: (lv_updateExpressions_11_0= ruleXExpression )
                    	    {
                    	    // InternalSqlQueryDsl.g:3804:6: (lv_updateExpressions_11_0= ruleXExpression )
                    	    // InternalSqlQueryDsl.g:3805:7: lv_updateExpressions_11_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getXBasicForLoopExpressionAccess().getUpdateExpressionsXExpressionParserRuleCall_7_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_7);
                    	    lv_updateExpressions_11_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getXBasicForLoopExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"updateExpressions",
                    	      								lv_updateExpressions_11_0,
                    	      								"org.eclipse.xtext.xbase.Xbase.XExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getXBasicForLoopExpressionAccess().getRightParenthesisKeyword_8());
              		
            }
            // InternalSqlQueryDsl.g:3828:3: ( (lv_eachExpression_13_0= ruleXExpression ) )
            // InternalSqlQueryDsl.g:3829:4: (lv_eachExpression_13_0= ruleXExpression )
            {
            // InternalSqlQueryDsl.g:3829:4: (lv_eachExpression_13_0= ruleXExpression )
            // InternalSqlQueryDsl.g:3830:5: lv_eachExpression_13_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXBasicForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_9_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_eachExpression_13_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXBasicForLoopExpressionRule());
              					}
              					set(
              						current,
              						"eachExpression",
              						lv_eachExpression_13_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBasicForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // InternalSqlQueryDsl.g:3851:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // InternalSqlQueryDsl.g:3851:57: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // InternalSqlQueryDsl.g:3852:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // InternalSqlQueryDsl.g:3858:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:3864:2: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // InternalSqlQueryDsl.g:3865:2: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // InternalSqlQueryDsl.g:3865:2: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // InternalSqlQueryDsl.g:3866:3: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // InternalSqlQueryDsl.g:3866:3: ()
            // InternalSqlQueryDsl.g:3867:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,15,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalSqlQueryDsl.g:3881:3: ( (lv_predicate_3_0= ruleXExpression ) )
            // InternalSqlQueryDsl.g:3882:4: (lv_predicate_3_0= ruleXExpression )
            {
            // InternalSqlQueryDsl.g:3882:4: (lv_predicate_3_0= ruleXExpression )
            // InternalSqlQueryDsl.g:3883:5: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              					}
              					set(
              						current,
              						"predicate",
              						lv_predicate_3_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalSqlQueryDsl.g:3904:3: ( (lv_body_5_0= ruleXExpression ) )
            // InternalSqlQueryDsl.g:3905:4: (lv_body_5_0= ruleXExpression )
            {
            // InternalSqlQueryDsl.g:3905:4: (lv_body_5_0= ruleXExpression )
            // InternalSqlQueryDsl.g:3906:5: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_5_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // InternalSqlQueryDsl.g:3927:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // InternalSqlQueryDsl.g:3927:59: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // InternalSqlQueryDsl.g:3928:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // InternalSqlQueryDsl.g:3934:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:3940:2: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // InternalSqlQueryDsl.g:3941:2: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // InternalSqlQueryDsl.g:3941:2: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // InternalSqlQueryDsl.g:3942:3: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // InternalSqlQueryDsl.g:3942:3: ()
            // InternalSqlQueryDsl.g:3943:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
              		
            }
            // InternalSqlQueryDsl.g:3953:3: ( (lv_body_2_0= ruleXExpression ) )
            // InternalSqlQueryDsl.g:3954:4: (lv_body_2_0= ruleXExpression )
            {
            // InternalSqlQueryDsl.g:3954:4: (lv_body_2_0= ruleXExpression )
            // InternalSqlQueryDsl.g:3955:5: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_62);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_2_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,67,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,15,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
              		
            }
            // InternalSqlQueryDsl.g:3980:3: ( (lv_predicate_5_0= ruleXExpression ) )
            // InternalSqlQueryDsl.g:3981:4: (lv_predicate_5_0= ruleXExpression )
            {
            // InternalSqlQueryDsl.g:3981:4: (lv_predicate_5_0= ruleXExpression )
            // InternalSqlQueryDsl.g:3982:5: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              					}
              					set(
              						current,
              						"predicate",
              						lv_predicate_5_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // InternalSqlQueryDsl.g:4007:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // InternalSqlQueryDsl.g:4007:57: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // InternalSqlQueryDsl.g:4008:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // InternalSqlQueryDsl.g:4014:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:4020:2: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // InternalSqlQueryDsl.g:4021:2: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // InternalSqlQueryDsl.g:4021:2: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // InternalSqlQueryDsl.g:4022:3: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // InternalSqlQueryDsl.g:4022:3: ()
            // InternalSqlQueryDsl.g:4023:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalSqlQueryDsl.g:4033:3: ( ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_3= ';' )? )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( ((LA66_0>=RULE_STRING && LA66_0<=RULE_DECIMAL)||LA66_0==15||LA66_0==24||(LA66_0>=40 && LA66_0<=41)||LA66_0==46||(LA66_0>=53 && LA66_0<=54)||LA66_0==56||LA66_0==60||LA66_0==62||(LA66_0>=66 && LA66_0<=83)||LA66_0==85) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalSqlQueryDsl.g:4034:4: ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_3= ';' )?
            	    {
            	    // InternalSqlQueryDsl.g:4034:4: ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) )
            	    // InternalSqlQueryDsl.g:4035:5: (lv_expressions_2_0= ruleXExpressionOrVarDeclaration )
            	    {
            	    // InternalSqlQueryDsl.g:4035:5: (lv_expressions_2_0= ruleXExpressionOrVarDeclaration )
            	    // InternalSqlQueryDsl.g:4036:6: lv_expressions_2_0= ruleXExpressionOrVarDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionOrVarDeclarationParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_64);
            	    lv_expressions_2_0=ruleXExpressionOrVarDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"expressions",
            	      							lv_expressions_2_0,
            	      							"org.eclipse.xtext.xbase.Xbase.XExpressionOrVarDeclaration");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalSqlQueryDsl.g:4053:4: (otherlv_3= ';' )?
            	    int alt65=2;
            	    int LA65_0 = input.LA(1);

            	    if ( (LA65_0==59) ) {
            	        alt65=1;
            	    }
            	    switch (alt65) {
            	        case 1 :
            	            // InternalSqlQueryDsl.g:4054:5: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,59,FOLLOW_63); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            otherlv_4=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionOrVarDeclaration"
    // InternalSqlQueryDsl.g:4068:1: entryRuleXExpressionOrVarDeclaration returns [EObject current=null] : iv_ruleXExpressionOrVarDeclaration= ruleXExpressionOrVarDeclaration EOF ;
    public final EObject entryRuleXExpressionOrVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionOrVarDeclaration = null;


        try {
            // InternalSqlQueryDsl.g:4068:68: (iv_ruleXExpressionOrVarDeclaration= ruleXExpressionOrVarDeclaration EOF )
            // InternalSqlQueryDsl.g:4069:2: iv_ruleXExpressionOrVarDeclaration= ruleXExpressionOrVarDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionOrVarDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXExpressionOrVarDeclaration=ruleXExpressionOrVarDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionOrVarDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionOrVarDeclaration"


    // $ANTLR start "ruleXExpressionOrVarDeclaration"
    // InternalSqlQueryDsl.g:4075:1: ruleXExpressionOrVarDeclaration returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionOrVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:4081:2: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // InternalSqlQueryDsl.g:4082:2: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // InternalSqlQueryDsl.g:4082:2: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=69 && LA67_0<=70)) ) {
                alt67=1;
            }
            else if ( ((LA67_0>=RULE_STRING && LA67_0<=RULE_DECIMAL)||LA67_0==15||LA67_0==24||(LA67_0>=40 && LA67_0<=41)||LA67_0==46||(LA67_0>=53 && LA67_0<=54)||LA67_0==56||LA67_0==60||LA67_0==62||(LA67_0>=66 && LA67_0<=68)||(LA67_0>=71 && LA67_0<=83)||LA67_0==85) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalSqlQueryDsl.g:4083:3: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXExpressionOrVarDeclarationAccess().getXVariableDeclarationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XVariableDeclaration_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSqlQueryDsl.g:4092:3: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXExpressionOrVarDeclarationAccess().getXExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionOrVarDeclaration"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // InternalSqlQueryDsl.g:4104:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // InternalSqlQueryDsl.g:4104:61: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // InternalSqlQueryDsl.g:4105:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // InternalSqlQueryDsl.g:4111:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:4117:2: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // InternalSqlQueryDsl.g:4118:2: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // InternalSqlQueryDsl.g:4118:2: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // InternalSqlQueryDsl.g:4119:3: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // InternalSqlQueryDsl.g:4119:3: ()
            // InternalSqlQueryDsl.g:4120:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
              					current);
              			
            }

            }

            // InternalSqlQueryDsl.g:4126:3: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==69) ) {
                alt68=1;
            }
            else if ( (LA68_0==70) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalSqlQueryDsl.g:4127:4: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // InternalSqlQueryDsl.g:4127:4: ( (lv_writeable_1_0= 'var' ) )
                    // InternalSqlQueryDsl.g:4128:5: (lv_writeable_1_0= 'var' )
                    {
                    // InternalSqlQueryDsl.g:4128:5: (lv_writeable_1_0= 'var' )
                    // InternalSqlQueryDsl.g:4129:6: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,69,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      						}
                      						setWithLastConsumed(current, "writeable", true, "var");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSqlQueryDsl.g:4142:4: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,70,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalSqlQueryDsl.g:4147:3: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_ID) ) {
                int LA69_1 = input.LA(2);

                if ( (synpred29_InternalSqlQueryDsl()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA69_0==15) && (synpred29_InternalSqlQueryDsl())) {
                alt69=1;
            }
            else if ( (LA69_0==37) && (synpred29_InternalSqlQueryDsl())) {
                alt69=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalSqlQueryDsl.g:4148:4: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // InternalSqlQueryDsl.g:4148:4: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // InternalSqlQueryDsl.g:4149:5: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // InternalSqlQueryDsl.g:4162:5: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // InternalSqlQueryDsl.g:4163:6: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // InternalSqlQueryDsl.g:4163:6: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // InternalSqlQueryDsl.g:4164:7: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // InternalSqlQueryDsl.g:4164:7: (lv_type_3_0= ruleJvmTypeReference )
                    // InternalSqlQueryDsl.g:4165:8: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0());
                      							
                    }
                    pushFollow(FOLLOW_65);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      								}
                      								set(
                      									current,
                      									"type",
                      									lv_type_3_0,
                      									"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalSqlQueryDsl.g:4182:6: ( (lv_name_4_0= ruleValidID ) )
                    // InternalSqlQueryDsl.g:4183:7: (lv_name_4_0= ruleValidID )
                    {
                    // InternalSqlQueryDsl.g:4183:7: (lv_name_4_0= ruleValidID )
                    // InternalSqlQueryDsl.g:4184:8: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0());
                      							
                    }
                    pushFollow(FOLLOW_66);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      								}
                      								set(
                      									current,
                      									"name",
                      									lv_name_4_0,
                      									"org.eclipse.xtext.xbase.Xtype.ValidID");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSqlQueryDsl.g:4204:4: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // InternalSqlQueryDsl.g:4204:4: ( (lv_name_5_0= ruleValidID ) )
                    // InternalSqlQueryDsl.g:4205:5: (lv_name_5_0= ruleValidID )
                    {
                    // InternalSqlQueryDsl.g:4205:5: (lv_name_5_0= ruleValidID )
                    // InternalSqlQueryDsl.g:4206:6: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_66);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_5_0,
                      							"org.eclipse.xtext.xbase.Xtype.ValidID");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSqlQueryDsl.g:4224:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==18) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalSqlQueryDsl.g:4225:4: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                      			
                    }
                    // InternalSqlQueryDsl.g:4229:4: ( (lv_right_7_0= ruleXExpression ) )
                    // InternalSqlQueryDsl.g:4230:5: (lv_right_7_0= ruleXExpression )
                    {
                    // InternalSqlQueryDsl.g:4230:5: (lv_right_7_0= ruleXExpression )
                    // InternalSqlQueryDsl.g:4231:6: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_7_0,
                      							"org.eclipse.xtext.xbase.Xbase.XExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // InternalSqlQueryDsl.g:4253:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // InternalSqlQueryDsl.g:4253:59: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // InternalSqlQueryDsl.g:4254:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // InternalSqlQueryDsl.g:4260:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:4266:2: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // InternalSqlQueryDsl.g:4267:2: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // InternalSqlQueryDsl.g:4267:2: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // InternalSqlQueryDsl.g:4268:3: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // InternalSqlQueryDsl.g:4268:3: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_ID) ) {
                int LA71_1 = input.LA(2);

                if ( (LA71_1==RULE_ID||LA71_1==24||LA71_1==50||LA71_1==56) ) {
                    alt71=1;
                }
            }
            else if ( (LA71_0==15||LA71_0==37) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalSqlQueryDsl.g:4269:4: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // InternalSqlQueryDsl.g:4269:4: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // InternalSqlQueryDsl.g:4270:5: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_65);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      					}
                      					set(
                      						current,
                      						"parameterType",
                      						lv_parameterType_0_0,
                      						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSqlQueryDsl.g:4287:3: ( (lv_name_1_0= ruleValidID ) )
            // InternalSqlQueryDsl.g:4288:4: (lv_name_1_0= ruleValidID )
            {
            // InternalSqlQueryDsl.g:4288:4: (lv_name_1_0= ruleValidID )
            // InternalSqlQueryDsl.g:4289:5: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.xbase.Xtype.ValidID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // InternalSqlQueryDsl.g:4310:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // InternalSqlQueryDsl.g:4310:63: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // InternalSqlQueryDsl.g:4311:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // InternalSqlQueryDsl.g:4317:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:4323:2: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // InternalSqlQueryDsl.g:4324:2: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // InternalSqlQueryDsl.g:4324:2: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // InternalSqlQueryDsl.g:4325:3: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // InternalSqlQueryDsl.g:4325:3: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // InternalSqlQueryDsl.g:4326:4: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // InternalSqlQueryDsl.g:4326:4: (lv_parameterType_0_0= ruleJvmTypeReference )
            // InternalSqlQueryDsl.g:4327:5: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_65);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              					}
              					set(
              						current,
              						"parameterType",
              						lv_parameterType_0_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSqlQueryDsl.g:4344:3: ( (lv_name_1_0= ruleValidID ) )
            // InternalSqlQueryDsl.g:4345:4: (lv_name_1_0= ruleValidID )
            {
            // InternalSqlQueryDsl.g:4345:4: (lv_name_1_0= ruleValidID )
            // InternalSqlQueryDsl.g:4346:5: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.xbase.Xtype.ValidID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // InternalSqlQueryDsl.g:4367:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // InternalSqlQueryDsl.g:4367:53: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // InternalSqlQueryDsl.g:4368:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // InternalSqlQueryDsl.g:4374:1: ruleXFeatureCall returns [EObject current=null] : ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_explicitOperationCall_7_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_typeArguments_2_0 = null;

        EObject lv_typeArguments_4_0 = null;

        EObject lv_featureCallArguments_8_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_11_0 = null;

        EObject lv_featureCallArguments_13_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:4380:2: ( ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )? ) )
            // InternalSqlQueryDsl.g:4381:2: ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )? )
            {
            // InternalSqlQueryDsl.g:4381:2: ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )? )
            // InternalSqlQueryDsl.g:4382:3: () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )?
            {
            // InternalSqlQueryDsl.g:4382:3: ()
            // InternalSqlQueryDsl.g:4383:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
              					current);
              			
            }

            }

            // InternalSqlQueryDsl.g:4389:3: (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==24) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalSqlQueryDsl.g:4390:4: otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_1_0());
                      			
                    }
                    // InternalSqlQueryDsl.g:4394:4: ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) )
                    // InternalSqlQueryDsl.g:4395:5: (lv_typeArguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // InternalSqlQueryDsl.g:4395:5: (lv_typeArguments_2_0= ruleJvmArgumentTypeReference )
                    // InternalSqlQueryDsl.g:4396:6: lv_typeArguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_32);
                    lv_typeArguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      						}
                      						add(
                      							current,
                      							"typeArguments",
                      							lv_typeArguments_2_0,
                      							"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSqlQueryDsl.g:4413:4: (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==16) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalSqlQueryDsl.g:4414:5: otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_31); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getXFeatureCallAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalSqlQueryDsl.g:4418:5: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // InternalSqlQueryDsl.g:4419:6: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // InternalSqlQueryDsl.g:4419:6: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    	    // InternalSqlQueryDsl.g:4420:7: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_32);
                    	    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"typeArguments",
                    	      								lv_typeArguments_4_0,
                    	      								"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,25,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_1_3());
                      			
                    }

                    }
                    break;

            }

            // InternalSqlQueryDsl.g:4443:3: ( ( ruleIdOrSuper ) )
            // InternalSqlQueryDsl.g:4444:4: ( ruleIdOrSuper )
            {
            // InternalSqlQueryDsl.g:4444:4: ( ruleIdOrSuper )
            // InternalSqlQueryDsl.g:4445:5: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getXFeatureCallRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_67);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSqlQueryDsl.g:4459:3: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )?
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // InternalSqlQueryDsl.g:4460:4: ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')'
                    {
                    // InternalSqlQueryDsl.g:4460:4: ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) )
                    // InternalSqlQueryDsl.g:4461:5: ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' )
                    {
                    // InternalSqlQueryDsl.g:4465:5: (lv_explicitOperationCall_7_0= '(' )
                    // InternalSqlQueryDsl.g:4466:6: lv_explicitOperationCall_7_0= '('
                    {
                    lv_explicitOperationCall_7_0=(Token)match(input,15,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_explicitOperationCall_7_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_3_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getXFeatureCallRule());
                      						}
                      						setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      					
                    }

                    }


                    }

                    // InternalSqlQueryDsl.g:4478:4: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )?
                    int alt75=3;
                    alt75 = dfa75.predict(input);
                    switch (alt75) {
                        case 1 :
                            // InternalSqlQueryDsl.g:4479:5: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) )
                            {
                            // InternalSqlQueryDsl.g:4479:5: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) )
                            // InternalSqlQueryDsl.g:4480:6: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure )
                            {
                            // InternalSqlQueryDsl.g:4505:6: (lv_featureCallArguments_8_0= ruleXShortClosure )
                            // InternalSqlQueryDsl.g:4506:7: lv_featureCallArguments_8_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_3_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_35);
                            lv_featureCallArguments_8_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              							}
                              							add(
                              								current,
                              								"featureCallArguments",
                              								lv_featureCallArguments_8_0,
                              								"org.eclipse.xtext.xbase.Xbase.XShortClosure");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSqlQueryDsl.g:4524:5: ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* )
                            {
                            // InternalSqlQueryDsl.g:4524:5: ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* )
                            // InternalSqlQueryDsl.g:4525:6: ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )*
                            {
                            // InternalSqlQueryDsl.g:4525:6: ( (lv_featureCallArguments_9_0= ruleXExpression ) )
                            // InternalSqlQueryDsl.g:4526:7: (lv_featureCallArguments_9_0= ruleXExpression )
                            {
                            // InternalSqlQueryDsl.g:4526:7: (lv_featureCallArguments_9_0= ruleXExpression )
                            // InternalSqlQueryDsl.g:4527:8: lv_featureCallArguments_9_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_3_1_1_0_0());
                              							
                            }
                            pushFollow(FOLLOW_7);
                            lv_featureCallArguments_9_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              								}
                              								add(
                              									current,
                              									"featureCallArguments",
                              									lv_featureCallArguments_9_0,
                              									"org.eclipse.xtext.xbase.Xbase.XExpression");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalSqlQueryDsl.g:4544:6: (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )*
                            loop74:
                            do {
                                int alt74=2;
                                int LA74_0 = input.LA(1);

                                if ( (LA74_0==16) ) {
                                    alt74=1;
                                }


                                switch (alt74) {
                            	case 1 :
                            	    // InternalSqlQueryDsl.g:4545:7: otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) )
                            	    {
                            	    otherlv_10=(Token)match(input,16,FOLLOW_11); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_10, grammarAccess.getXFeatureCallAccess().getCommaKeyword_3_1_1_1_0());
                            	      						
                            	    }
                            	    // InternalSqlQueryDsl.g:4549:7: ( (lv_featureCallArguments_11_0= ruleXExpression ) )
                            	    // InternalSqlQueryDsl.g:4550:8: (lv_featureCallArguments_11_0= ruleXExpression )
                            	    {
                            	    // InternalSqlQueryDsl.g:4550:8: (lv_featureCallArguments_11_0= ruleXExpression )
                            	    // InternalSqlQueryDsl.g:4551:9: lv_featureCallArguments_11_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_3_1_1_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_7);
                            	    lv_featureCallArguments_11_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"featureCallArguments",
                            	      										lv_featureCallArguments_11_0,
                            	      										"org.eclipse.xtext.xbase.Xbase.XExpression");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop74;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,17,FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_3_2());
                      			
                    }

                    }
                    break;

            }

            // InternalSqlQueryDsl.g:4576:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )?
            int alt77=2;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // InternalSqlQueryDsl.g:4577:4: ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure )
                    {
                    // InternalSqlQueryDsl.g:4583:4: (lv_featureCallArguments_13_0= ruleXClosure )
                    // InternalSqlQueryDsl.g:4584:5: lv_featureCallArguments_13_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_featureCallArguments_13_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      					}
                      					add(
                      						current,
                      						"featureCallArguments",
                      						lv_featureCallArguments_13_0,
                      						"org.eclipse.xtext.xbase.Xbase.XClosure");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleFeatureCallID"
    // InternalSqlQueryDsl.g:4605:1: entryRuleFeatureCallID returns [String current=null] : iv_ruleFeatureCallID= ruleFeatureCallID EOF ;
    public final String entryRuleFeatureCallID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureCallID = null;


        try {
            // InternalSqlQueryDsl.g:4605:53: (iv_ruleFeatureCallID= ruleFeatureCallID EOF )
            // InternalSqlQueryDsl.g:4606:2: iv_ruleFeatureCallID= ruleFeatureCallID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeatureCallID=ruleFeatureCallID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCallID.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureCallID"


    // $ANTLR start "ruleFeatureCallID"
    // InternalSqlQueryDsl.g:4612:1: ruleFeatureCallID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' ) ;
    public final AntlrDatatypeRuleToken ruleFeatureCallID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:4618:2: ( (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' ) )
            // InternalSqlQueryDsl.g:4619:2: (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' )
            {
            // InternalSqlQueryDsl.g:4619:2: (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' )
            int alt78=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt78=1;
                }
                break;
            case 71:
                {
                alt78=2;
                }
                break;
            case 72:
                {
                alt78=3;
                }
                break;
            case 73:
                {
                alt78=4;
                }
                break;
            case 74:
                {
                alt78=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // InternalSqlQueryDsl.g:4620:3: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureCallIDAccess().getValidIDParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ValidID_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSqlQueryDsl.g:4631:3: kw= 'extends'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getExtendsKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSqlQueryDsl.g:4637:3: kw= 'static'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getStaticKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSqlQueryDsl.g:4643:3: kw= 'import'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getImportKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSqlQueryDsl.g:4649:3: kw= 'extension'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getExtensionKeyword_4());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureCallID"


    // $ANTLR start "entryRuleIdOrSuper"
    // InternalSqlQueryDsl.g:4658:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // InternalSqlQueryDsl.g:4658:49: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // InternalSqlQueryDsl.g:4659:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // InternalSqlQueryDsl.g:4665:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FeatureCallID_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:4671:2: ( (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' ) )
            // InternalSqlQueryDsl.g:4672:2: (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' )
            {
            // InternalSqlQueryDsl.g:4672:2: (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_ID||(LA79_0>=71 && LA79_0<=74)) ) {
                alt79=1;
            }
            else if ( (LA79_0==75) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // InternalSqlQueryDsl.g:4673:3: this_FeatureCallID_0= ruleFeatureCallID
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getIdOrSuperAccess().getFeatureCallIDParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FeatureCallID_0=ruleFeatureCallID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_FeatureCallID_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSqlQueryDsl.g:4684:3: kw= 'super'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleXConstructorCall"
    // InternalSqlQueryDsl.g:4693:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // InternalSqlQueryDsl.g:4693:57: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // InternalSqlQueryDsl.g:4694:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // InternalSqlQueryDsl.g:4700:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_explicitConstructorCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_14_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:4706:2: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // InternalSqlQueryDsl.g:4707:2: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // InternalSqlQueryDsl.g:4707:2: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // InternalSqlQueryDsl.g:4708:3: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // InternalSqlQueryDsl.g:4708:3: ()
            // InternalSqlQueryDsl.g:4709:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
              		
            }
            // InternalSqlQueryDsl.g:4719:3: ( ( ruleQualifiedName ) )
            // InternalSqlQueryDsl.g:4720:4: ( ruleQualifiedName )
            {
            // InternalSqlQueryDsl.g:4720:4: ( ruleQualifiedName )
            // InternalSqlQueryDsl.g:4721:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getXConstructorCallRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_69);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSqlQueryDsl.g:4735:3: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt81=2;
            alt81 = dfa81.predict(input);
            switch (alt81) {
                case 1 :
                    // InternalSqlQueryDsl.g:4736:4: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // InternalSqlQueryDsl.g:4736:4: ( ( '<' )=>otherlv_3= '<' )
                    // InternalSqlQueryDsl.g:4737:5: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                      				
                    }

                    }

                    // InternalSqlQueryDsl.g:4743:4: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // InternalSqlQueryDsl.g:4744:5: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // InternalSqlQueryDsl.g:4744:5: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // InternalSqlQueryDsl.g:4745:6: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_32);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      						}
                      						add(
                      							current,
                      							"typeArguments",
                      							lv_typeArguments_4_0,
                      							"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSqlQueryDsl.g:4762:4: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==16) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalSqlQueryDsl.g:4763:5: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_31); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalSqlQueryDsl.g:4767:5: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // InternalSqlQueryDsl.g:4768:6: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // InternalSqlQueryDsl.g:4768:6: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // InternalSqlQueryDsl.g:4769:7: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_32);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"typeArguments",
                    	      								lv_typeArguments_6_0,
                    	      								"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,25,FOLLOW_67); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                      			
                    }

                    }
                    break;

            }

            // InternalSqlQueryDsl.g:4792:3: ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt84=2;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // InternalSqlQueryDsl.g:4793:4: ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // InternalSqlQueryDsl.g:4793:4: ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) )
                    // InternalSqlQueryDsl.g:4794:5: ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' )
                    {
                    // InternalSqlQueryDsl.g:4798:5: (lv_explicitConstructorCall_8_0= '(' )
                    // InternalSqlQueryDsl.g:4799:6: lv_explicitConstructorCall_8_0= '('
                    {
                    lv_explicitConstructorCall_8_0=(Token)match(input,15,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_explicitConstructorCall_8_0, grammarAccess.getXConstructorCallAccess().getExplicitConstructorCallLeftParenthesisKeyword_4_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getXConstructorCallRule());
                      						}
                      						setWithLastConsumed(current, "explicitConstructorCall", true, "(");
                      					
                    }

                    }


                    }

                    // InternalSqlQueryDsl.g:4811:4: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt83=3;
                    alt83 = dfa83.predict(input);
                    switch (alt83) {
                        case 1 :
                            // InternalSqlQueryDsl.g:4812:5: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // InternalSqlQueryDsl.g:4812:5: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // InternalSqlQueryDsl.g:4813:6: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // InternalSqlQueryDsl.g:4838:6: (lv_arguments_9_0= ruleXShortClosure )
                            // InternalSqlQueryDsl.g:4839:7: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_35);
                            lv_arguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              							}
                              							add(
                              								current,
                              								"arguments",
                              								lv_arguments_9_0,
                              								"org.eclipse.xtext.xbase.Xbase.XShortClosure");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSqlQueryDsl.g:4857:5: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // InternalSqlQueryDsl.g:4857:5: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // InternalSqlQueryDsl.g:4858:6: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // InternalSqlQueryDsl.g:4858:6: ( (lv_arguments_10_0= ruleXExpression ) )
                            // InternalSqlQueryDsl.g:4859:7: (lv_arguments_10_0= ruleXExpression )
                            {
                            // InternalSqlQueryDsl.g:4859:7: (lv_arguments_10_0= ruleXExpression )
                            // InternalSqlQueryDsl.g:4860:8: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0());
                              							
                            }
                            pushFollow(FOLLOW_7);
                            lv_arguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              								}
                              								add(
                              									current,
                              									"arguments",
                              									lv_arguments_10_0,
                              									"org.eclipse.xtext.xbase.Xbase.XExpression");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalSqlQueryDsl.g:4877:6: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop82:
                            do {
                                int alt82=2;
                                int LA82_0 = input.LA(1);

                                if ( (LA82_0==16) ) {
                                    alt82=1;
                                }


                                switch (alt82) {
                            	case 1 :
                            	    // InternalSqlQueryDsl.g:4878:7: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,16,FOLLOW_11); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	      						
                            	    }
                            	    // InternalSqlQueryDsl.g:4882:7: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // InternalSqlQueryDsl.g:4883:8: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // InternalSqlQueryDsl.g:4883:8: (lv_arguments_12_0= ruleXExpression )
                            	    // InternalSqlQueryDsl.g:4884:9: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_7);
                            	    lv_arguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"arguments",
                            	      										lv_arguments_12_0,
                            	      										"org.eclipse.xtext.xbase.Xbase.XExpression");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop82;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,17,FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                      			
                    }

                    }
                    break;

            }

            // InternalSqlQueryDsl.g:4909:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt85=2;
            alt85 = dfa85.predict(input);
            switch (alt85) {
                case 1 :
                    // InternalSqlQueryDsl.g:4910:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // InternalSqlQueryDsl.g:4916:4: (lv_arguments_14_0= ruleXClosure )
                    // InternalSqlQueryDsl.g:4917:5: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      					}
                      					add(
                      						current,
                      						"arguments",
                      						lv_arguments_14_0,
                      						"org.eclipse.xtext.xbase.Xbase.XClosure");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // InternalSqlQueryDsl.g:4938:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // InternalSqlQueryDsl.g:4938:56: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // InternalSqlQueryDsl.g:4939:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // InternalSqlQueryDsl.g:4945:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;


        	enterRule();

        try {
            // InternalSqlQueryDsl.g:4951:2: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // InternalSqlQueryDsl.g:4952:2: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // InternalSqlQueryDsl.g:4952:2: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // InternalSqlQueryDsl.g:4953:3: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // InternalSqlQueryDsl.g:4953:3: ()
            // InternalSqlQueryDsl.g:4954:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalSqlQueryDsl.g:4960:3: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==77) ) {
                alt86=1;
            }
            else if ( (LA86_0==78) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // InternalSqlQueryDsl.g:4961:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSqlQueryDsl.g:4966:4: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // InternalSqlQueryDsl.g:4966:4: ( (lv_isTrue_2_0= 'true' ) )
                    // InternalSqlQueryDsl.g:4967:5: (lv_isTrue_2_0= 'true' )
                    {
                    // InternalSqlQueryDsl.g:4967:5: (lv_isTrue_2_0= 'true' )
                    // InternalSqlQueryDsl.g:4968:6: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      						}
                      						setWithLastConsumed(current, "isTrue", true, "true");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // InternalSqlQueryDsl.g:4985:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // InternalSqlQueryDsl.g:4985:53: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // InternalSqlQueryDsl.g:4986:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // InternalSqlQueryDsl.g:4992:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSqlQueryDsl.g:4998:2: ( ( () otherlv_1= 'null' ) )
            // InternalSqlQueryDsl.g:4999:2: ( () otherlv_1= 'null' )
            {
            // InternalSqlQueryDsl.g:4999:2: ( () otherlv_1= 'null' )
            // InternalSqlQueryDsl.g:5000:3: () otherlv_1= 'null'
            {
            // InternalSqlQueryDsl.g:5000:3: ()
            // InternalSqlQueryDsl.g:5001:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXNumberLiteral"
    // InternalSqlQueryDsl.g:5015:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // InternalSqlQueryDsl.g:5015:55: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // InternalSqlQueryDsl.g:5016:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNumberLiteral"


    // $ANTLR start "ruleXNumberLiteral"
    // InternalSqlQueryDsl.g:5022:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:5028:2: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // InternalSqlQueryDsl.g:5029:2: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // InternalSqlQueryDsl.g:5029:2: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // InternalSqlQueryDsl.g:5030:3: () ( (lv_value_1_0= ruleNumber ) )
            {
            // InternalSqlQueryDsl.g:5030:3: ()
            // InternalSqlQueryDsl.g:5031:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalSqlQueryDsl.g:5037:3: ( (lv_value_1_0= ruleNumber ) )
            // InternalSqlQueryDsl.g:5038:4: (lv_value_1_0= ruleNumber )
            {
            // InternalSqlQueryDsl.g:5038:4: (lv_value_1_0= ruleNumber )
            // InternalSqlQueryDsl.g:5039:5: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXNumberLiteralRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"org.eclipse.xtext.xbase.Xbase.Number");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNumberLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // InternalSqlQueryDsl.g:5060:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // InternalSqlQueryDsl.g:5060:55: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // InternalSqlQueryDsl.g:5061:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // InternalSqlQueryDsl.g:5067:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalSqlQueryDsl.g:5073:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalSqlQueryDsl.g:5074:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalSqlQueryDsl.g:5074:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalSqlQueryDsl.g:5075:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalSqlQueryDsl.g:5075:3: ()
            // InternalSqlQueryDsl.g:5076:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalSqlQueryDsl.g:5082:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalSqlQueryDsl.g:5083:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalSqlQueryDsl.g:5083:4: (lv_value_1_0= RULE_STRING )
            // InternalSqlQueryDsl.g:5084:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getXStringLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_1_0,
              						"org.eclipse.xtext.xbase.Xtype.STRING");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // InternalSqlQueryDsl.g:5104:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // InternalSqlQueryDsl.g:5104:53: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // InternalSqlQueryDsl.g:5105:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // InternalSqlQueryDsl.g:5111:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_arrayDimensions_4_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:5117:2: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' ) )
            // InternalSqlQueryDsl.g:5118:2: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' )
            {
            // InternalSqlQueryDsl.g:5118:2: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' )
            // InternalSqlQueryDsl.g:5119:3: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')'
            {
            // InternalSqlQueryDsl.g:5119:3: ()
            // InternalSqlQueryDsl.g:5120:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,80,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,15,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalSqlQueryDsl.g:5134:3: ( ( ruleQualifiedName ) )
            // InternalSqlQueryDsl.g:5135:4: ( ruleQualifiedName )
            {
            // InternalSqlQueryDsl.g:5135:4: ( ruleQualifiedName )
            // InternalSqlQueryDsl.g:5136:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getXTypeLiteralRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_70);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSqlQueryDsl.g:5150:3: ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==56) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalSqlQueryDsl.g:5151:4: (lv_arrayDimensions_4_0= ruleArrayBrackets )
            	    {
            	    // InternalSqlQueryDsl.g:5151:4: (lv_arrayDimensions_4_0= ruleArrayBrackets )
            	    // InternalSqlQueryDsl.g:5152:5: lv_arrayDimensions_4_0= ruleArrayBrackets
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getXTypeLiteralAccess().getArrayDimensionsArrayBracketsParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_70);
            	    lv_arrayDimensions_4_0=ruleArrayBrackets();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getXTypeLiteralRule());
            	      					}
            	      					add(
            	      						current,
            	      						"arrayDimensions",
            	      						lv_arrayDimensions_4_0,
            	      						"org.eclipse.xtext.xbase.Xtype.ArrayBrackets");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // InternalSqlQueryDsl.g:5177:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // InternalSqlQueryDsl.g:5177:57: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // InternalSqlQueryDsl.g:5178:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // InternalSqlQueryDsl.g:5184:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:5190:2: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // InternalSqlQueryDsl.g:5191:2: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // InternalSqlQueryDsl.g:5191:2: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // InternalSqlQueryDsl.g:5192:3: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // InternalSqlQueryDsl.g:5192:3: ()
            // InternalSqlQueryDsl.g:5193:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,81,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
              		
            }
            // InternalSqlQueryDsl.g:5203:3: ( (lv_expression_2_0= ruleXExpression ) )
            // InternalSqlQueryDsl.g:5204:4: (lv_expression_2_0= ruleXExpression )
            {
            // InternalSqlQueryDsl.g:5204:4: (lv_expression_2_0= ruleXExpression )
            // InternalSqlQueryDsl.g:5205:5: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // InternalSqlQueryDsl.g:5226:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // InternalSqlQueryDsl.g:5226:58: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // InternalSqlQueryDsl.g:5227:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // InternalSqlQueryDsl.g:5233:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:5239:2: ( ( () otherlv_1= 'return' ( ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // InternalSqlQueryDsl.g:5240:2: ( () otherlv_1= 'return' ( ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // InternalSqlQueryDsl.g:5240:2: ( () otherlv_1= 'return' ( ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression ) )? )
            // InternalSqlQueryDsl.g:5241:3: () otherlv_1= 'return' ( ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // InternalSqlQueryDsl.g:5241:3: ()
            // InternalSqlQueryDsl.g:5242:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,82,FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
              		
            }
            // InternalSqlQueryDsl.g:5252:3: ( ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt88=2;
            alt88 = dfa88.predict(input);
            switch (alt88) {
                case 1 :
                    // InternalSqlQueryDsl.g:5253:4: ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // InternalSqlQueryDsl.g:5254:4: (lv_expression_2_0= ruleXExpression )
                    // InternalSqlQueryDsl.g:5255:5: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      					}
                      					set(
                      						current,
                      						"expression",
                      						lv_expression_2_0,
                      						"org.eclipse.xtext.xbase.Xbase.XExpression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // InternalSqlQueryDsl.g:5276:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // InternalSqlQueryDsl.g:5276:67: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // InternalSqlQueryDsl.g:5277:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // InternalSqlQueryDsl.g:5283:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:5289:2: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // InternalSqlQueryDsl.g:5290:2: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // InternalSqlQueryDsl.g:5290:2: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // InternalSqlQueryDsl.g:5291:3: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // InternalSqlQueryDsl.g:5291:3: ()
            // InternalSqlQueryDsl.g:5292:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,83,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
              		
            }
            // InternalSqlQueryDsl.g:5302:3: ( (lv_expression_2_0= ruleXExpression ) )
            // InternalSqlQueryDsl.g:5303:4: (lv_expression_2_0= ruleXExpression )
            {
            // InternalSqlQueryDsl.g:5303:4: (lv_expression_2_0= ruleXExpression )
            // InternalSqlQueryDsl.g:5304:5: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_72);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSqlQueryDsl.g:5321:3: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==86) ) {
                alt91=1;
            }
            else if ( (LA91_0==84) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // InternalSqlQueryDsl.g:5322:4: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // InternalSqlQueryDsl.g:5322:4: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // InternalSqlQueryDsl.g:5323:5: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // InternalSqlQueryDsl.g:5323:5: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt89=0;
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==86) ) {
                            int LA89_2 = input.LA(2);

                            if ( (synpred38_InternalSqlQueryDsl()) ) {
                                alt89=1;
                            }


                        }


                        switch (alt89) {
                    	case 1 :
                    	    // InternalSqlQueryDsl.g:5324:6: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // InternalSqlQueryDsl.g:5325:6: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // InternalSqlQueryDsl.g:5326:7: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_73);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"catchClauses",
                    	      								lv_catchClauses_3_0,
                    	      								"org.eclipse.xtext.xbase.Xbase.XCatchClause");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt89 >= 1 ) break loop89;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(89, input);
                                throw eee;
                        }
                        cnt89++;
                    } while (true);

                    // InternalSqlQueryDsl.g:5343:5: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==84) ) {
                        int LA90_1 = input.LA(2);

                        if ( (synpred39_InternalSqlQueryDsl()) ) {
                            alt90=1;
                        }
                    }
                    switch (alt90) {
                        case 1 :
                            // InternalSqlQueryDsl.g:5344:6: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // InternalSqlQueryDsl.g:5344:6: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // InternalSqlQueryDsl.g:5345:7: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,84,FOLLOW_11); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                              						
                            }

                            }

                            // InternalSqlQueryDsl.g:5351:6: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // InternalSqlQueryDsl.g:5352:7: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // InternalSqlQueryDsl.g:5352:7: (lv_finallyExpression_5_0= ruleXExpression )
                            // InternalSqlQueryDsl.g:5353:8: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_2);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              								}
                              								set(
                              									current,
                              									"finallyExpression",
                              									lv_finallyExpression_5_0,
                              									"org.eclipse.xtext.xbase.Xbase.XExpression");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSqlQueryDsl.g:5373:4: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // InternalSqlQueryDsl.g:5373:4: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // InternalSqlQueryDsl.g:5374:5: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,84,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                      				
                    }
                    // InternalSqlQueryDsl.g:5378:5: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // InternalSqlQueryDsl.g:5379:6: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // InternalSqlQueryDsl.g:5379:6: (lv_finallyExpression_7_0= ruleXExpression )
                    // InternalSqlQueryDsl.g:5380:7: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      							}
                      							set(
                      								current,
                      								"finallyExpression",
                      								lv_finallyExpression_7_0,
                      								"org.eclipse.xtext.xbase.Xbase.XExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXSynchronizedExpression"
    // InternalSqlQueryDsl.g:5403:1: entryRuleXSynchronizedExpression returns [EObject current=null] : iv_ruleXSynchronizedExpression= ruleXSynchronizedExpression EOF ;
    public final EObject entryRuleXSynchronizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSynchronizedExpression = null;


        try {
            // InternalSqlQueryDsl.g:5403:64: (iv_ruleXSynchronizedExpression= ruleXSynchronizedExpression EOF )
            // InternalSqlQueryDsl.g:5404:2: iv_ruleXSynchronizedExpression= ruleXSynchronizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSynchronizedExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXSynchronizedExpression=ruleXSynchronizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSynchronizedExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSynchronizedExpression"


    // $ANTLR start "ruleXSynchronizedExpression"
    // InternalSqlQueryDsl.g:5410:1: ruleXSynchronizedExpression returns [EObject current=null] : ( ( ( ( () 'synchronized' '(' ) )=> ( () otherlv_1= 'synchronized' otherlv_2= '(' ) ) ( (lv_param_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXSynchronizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_param_3_0 = null;

        EObject lv_expression_5_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:5416:2: ( ( ( ( ( () 'synchronized' '(' ) )=> ( () otherlv_1= 'synchronized' otherlv_2= '(' ) ) ( (lv_param_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // InternalSqlQueryDsl.g:5417:2: ( ( ( ( () 'synchronized' '(' ) )=> ( () otherlv_1= 'synchronized' otherlv_2= '(' ) ) ( (lv_param_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // InternalSqlQueryDsl.g:5417:2: ( ( ( ( () 'synchronized' '(' ) )=> ( () otherlv_1= 'synchronized' otherlv_2= '(' ) ) ( (lv_param_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_expression_5_0= ruleXExpression ) ) )
            // InternalSqlQueryDsl.g:5418:3: ( ( ( () 'synchronized' '(' ) )=> ( () otherlv_1= 'synchronized' otherlv_2= '(' ) ) ( (lv_param_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_expression_5_0= ruleXExpression ) )
            {
            // InternalSqlQueryDsl.g:5418:3: ( ( ( () 'synchronized' '(' ) )=> ( () otherlv_1= 'synchronized' otherlv_2= '(' ) )
            // InternalSqlQueryDsl.g:5419:4: ( ( () 'synchronized' '(' ) )=> ( () otherlv_1= 'synchronized' otherlv_2= '(' )
            {
            // InternalSqlQueryDsl.g:5426:4: ( () otherlv_1= 'synchronized' otherlv_2= '(' )
            // InternalSqlQueryDsl.g:5427:5: () otherlv_1= 'synchronized' otherlv_2= '('
            {
            // InternalSqlQueryDsl.g:5427:5: ()
            // InternalSqlQueryDsl.g:5428:6: 
            {
            if ( state.backtracking==0 ) {

              						current = forceCreateModelElement(
              							grammarAccess.getXSynchronizedExpressionAccess().getXSynchronizedExpressionAction_0_0_0(),
              							current);
              					
            }

            }

            otherlv_1=(Token)match(input,85,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getXSynchronizedExpressionAccess().getSynchronizedKeyword_0_0_1());
              				
            }
            otherlv_2=(Token)match(input,15,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getXSynchronizedExpressionAccess().getLeftParenthesisKeyword_0_0_2());
              				
            }

            }


            }

            // InternalSqlQueryDsl.g:5444:3: ( (lv_param_3_0= ruleXExpression ) )
            // InternalSqlQueryDsl.g:5445:4: (lv_param_3_0= ruleXExpression )
            {
            // InternalSqlQueryDsl.g:5445:4: (lv_param_3_0= ruleXExpression )
            // InternalSqlQueryDsl.g:5446:5: lv_param_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXSynchronizedExpressionAccess().getParamXExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_param_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXSynchronizedExpressionRule());
              					}
              					set(
              						current,
              						"param",
              						lv_param_3_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getXSynchronizedExpressionAccess().getRightParenthesisKeyword_2());
              		
            }
            // InternalSqlQueryDsl.g:5467:3: ( (lv_expression_5_0= ruleXExpression ) )
            // InternalSqlQueryDsl.g:5468:4: (lv_expression_5_0= ruleXExpression )
            {
            // InternalSqlQueryDsl.g:5468:4: (lv_expression_5_0= ruleXExpression )
            // InternalSqlQueryDsl.g:5469:5: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXSynchronizedExpressionAccess().getExpressionXExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXSynchronizedExpressionRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_5_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSynchronizedExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // InternalSqlQueryDsl.g:5490:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // InternalSqlQueryDsl.g:5490:53: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // InternalSqlQueryDsl.g:5491:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // InternalSqlQueryDsl.g:5497:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:5503:2: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // InternalSqlQueryDsl.g:5504:2: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // InternalSqlQueryDsl.g:5504:2: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // InternalSqlQueryDsl.g:5505:3: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // InternalSqlQueryDsl.g:5505:3: ( ( 'catch' )=>otherlv_0= 'catch' )
            // InternalSqlQueryDsl.g:5506:4: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,86,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
              			
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSqlQueryDsl.g:5516:3: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // InternalSqlQueryDsl.g:5517:4: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // InternalSqlQueryDsl.g:5517:4: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // InternalSqlQueryDsl.g:5518:5: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              					}
              					set(
              						current,
              						"declaredParam",
              						lv_declaredParam_2_0,
              						"org.eclipse.xtext.xbase.Xbase.FullJvmFormalParameter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalSqlQueryDsl.g:5539:3: ( (lv_expression_4_0= ruleXExpression ) )
            // InternalSqlQueryDsl.g:5540:4: (lv_expression_4_0= ruleXExpression )
            {
            // InternalSqlQueryDsl.g:5540:4: (lv_expression_4_0= ruleXExpression )
            // InternalSqlQueryDsl.g:5541:5: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_4_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSqlQueryDsl.g:5562:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSqlQueryDsl.g:5562:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSqlQueryDsl.g:5563:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSqlQueryDsl.g:5569:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:5575:2: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // InternalSqlQueryDsl.g:5576:2: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // InternalSqlQueryDsl.g:5576:2: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // InternalSqlQueryDsl.g:5577:3: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_74);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ValidID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSqlQueryDsl.g:5587:3: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==50) ) {
                    int LA92_2 = input.LA(2);

                    if ( (LA92_2==RULE_ID) ) {
                        int LA92_3 = input.LA(3);

                        if ( (synpred42_InternalSqlQueryDsl()) ) {
                            alt92=1;
                        }


                    }


                }


                switch (alt92) {
            	case 1 :
            	    // InternalSqlQueryDsl.g:5588:4: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // InternalSqlQueryDsl.g:5588:4: ( ( '.' )=>kw= '.' )
            	    // InternalSqlQueryDsl.g:5589:5: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,50,FOLLOW_65); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_74);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ValidID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleNumber"
    // InternalSqlQueryDsl.g:5611:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSqlQueryDsl.g:5613:2: (iv_ruleNumber= ruleNumber EOF )
            // InternalSqlQueryDsl.g:5614:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalSqlQueryDsl.g:5623:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_0=null;
        Token this_INT_1=null;
        Token this_DECIMAL_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_DECIMAL_5=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSqlQueryDsl.g:5630:2: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // InternalSqlQueryDsl.g:5631:2: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // InternalSqlQueryDsl.g:5631:2: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==RULE_HEX) ) {
                alt96=1;
            }
            else if ( ((LA96_0>=RULE_INT && LA96_0<=RULE_DECIMAL)) ) {
                alt96=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // InternalSqlQueryDsl.g:5632:3: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_HEX_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSqlQueryDsl.g:5640:3: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // InternalSqlQueryDsl.g:5640:3: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // InternalSqlQueryDsl.g:5641:4: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // InternalSqlQueryDsl.g:5641:4: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==RULE_INT) ) {
                        alt93=1;
                    }
                    else if ( (LA93_0==RULE_DECIMAL) ) {
                        alt93=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 93, 0, input);

                        throw nvae;
                    }
                    switch (alt93) {
                        case 1 :
                            // InternalSqlQueryDsl.g:5642:5: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_74); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_INT_1);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSqlQueryDsl.g:5650:5: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_74); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_DECIMAL_2);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSqlQueryDsl.g:5658:4: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==50) ) {
                        int LA95_1 = input.LA(2);

                        if ( ((LA95_1>=RULE_INT && LA95_1<=RULE_DECIMAL)) ) {
                            alt95=1;
                        }
                    }
                    switch (alt95) {
                        case 1 :
                            // InternalSqlQueryDsl.g:5659:5: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,50,FOLLOW_75); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0());
                              				
                            }
                            // InternalSqlQueryDsl.g:5664:5: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt94=2;
                            int LA94_0 = input.LA(1);

                            if ( (LA94_0==RULE_INT) ) {
                                alt94=1;
                            }
                            else if ( (LA94_0==RULE_DECIMAL) ) {
                                alt94=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 94, 0, input);

                                throw nvae;
                            }
                            switch (alt94) {
                                case 1 :
                                    // InternalSqlQueryDsl.g:5665:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						current.merge(this_INT_4);
                                      					
                                    }
                                    if ( state.backtracking==0 ) {

                                      						newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0());
                                      					
                                    }

                                    }
                                    break;
                                case 2 :
                                    // InternalSqlQueryDsl.g:5673:6: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						current.merge(this_DECIMAL_5);
                                      					
                                    }
                                    if ( state.backtracking==0 ) {

                                      						newLeafNode(this_DECIMAL_5, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1());
                                      					
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleJvmTypeReference"
    // InternalSqlQueryDsl.g:5690:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // InternalSqlQueryDsl.g:5690:57: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // InternalSqlQueryDsl.g:5691:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // InternalSqlQueryDsl.g:5697:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_3 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:5703:2: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) )
            // InternalSqlQueryDsl.g:5704:2: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            {
            // InternalSqlQueryDsl.g:5704:2: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==RULE_ID) ) {
                alt98=1;
            }
            else if ( (LA98_0==15||LA98_0==37) ) {
                alt98=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // InternalSqlQueryDsl.g:5705:3: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    {
                    // InternalSqlQueryDsl.g:5705:3: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    // InternalSqlQueryDsl.g:5706:4: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_68);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_JvmParameterizedTypeReference_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalSqlQueryDsl.g:5714:4: ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==56) ) {
                            int LA97_2 = input.LA(2);

                            if ( (LA97_2==57) ) {
                                int LA97_3 = input.LA(3);

                                if ( (synpred43_InternalSqlQueryDsl()) ) {
                                    alt97=1;
                                }


                            }


                        }


                        switch (alt97) {
                    	case 1 :
                    	    // InternalSqlQueryDsl.g:5715:5: ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets )
                    	    {
                    	    // InternalSqlQueryDsl.g:5721:5: ( () ruleArrayBrackets )
                    	    // InternalSqlQueryDsl.g:5722:6: () ruleArrayBrackets
                    	    {
                    	    // InternalSqlQueryDsl.g:5722:6: ()
                    	    // InternalSqlQueryDsl.g:5723:7: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							current = forceCreateModelElementAndSet(
                    	      								grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	      								current);
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getArrayBracketsParserRuleCall_0_1_0_1());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_68);
                    	    ruleArrayBrackets();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop97;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSqlQueryDsl.g:5740:3: this_XFunctionTypeRef_3= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XFunctionTypeRef_3=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XFunctionTypeRef_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleArrayBrackets"
    // InternalSqlQueryDsl.g:5752:1: entryRuleArrayBrackets returns [String current=null] : iv_ruleArrayBrackets= ruleArrayBrackets EOF ;
    public final String entryRuleArrayBrackets() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayBrackets = null;


        try {
            // InternalSqlQueryDsl.g:5752:53: (iv_ruleArrayBrackets= ruleArrayBrackets EOF )
            // InternalSqlQueryDsl.g:5753:2: iv_ruleArrayBrackets= ruleArrayBrackets EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayBracketsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayBrackets=ruleArrayBrackets();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayBrackets.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayBrackets"


    // $ANTLR start "ruleArrayBrackets"
    // InternalSqlQueryDsl.g:5759:1: ruleArrayBrackets returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleArrayBrackets() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSqlQueryDsl.g:5765:2: ( (kw= '[' kw= ']' ) )
            // InternalSqlQueryDsl.g:5766:2: (kw= '[' kw= ']' )
            {
            // InternalSqlQueryDsl.g:5766:2: (kw= '[' kw= ']' )
            // InternalSqlQueryDsl.g:5767:3: kw= '[' kw= ']'
            {
            kw=(Token)match(input,56,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getArrayBracketsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getArrayBracketsAccess().getRightSquareBracketKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayBrackets"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // InternalSqlQueryDsl.g:5781:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // InternalSqlQueryDsl.g:5781:57: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // InternalSqlQueryDsl.g:5782:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // InternalSqlQueryDsl.g:5788:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:5794:2: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // InternalSqlQueryDsl.g:5795:2: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // InternalSqlQueryDsl.g:5795:2: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // InternalSqlQueryDsl.g:5796:3: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // InternalSqlQueryDsl.g:5796:3: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==15) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalSqlQueryDsl.g:5797:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    // InternalSqlQueryDsl.g:5801:4: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==RULE_ID||LA100_0==15||LA100_0==37) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // InternalSqlQueryDsl.g:5802:5: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // InternalSqlQueryDsl.g:5802:5: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // InternalSqlQueryDsl.g:5803:6: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // InternalSqlQueryDsl.g:5803:6: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // InternalSqlQueryDsl.g:5804:7: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_7);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                              							}
                              							add(
                              								current,
                              								"paramTypes",
                              								lv_paramTypes_1_0,
                              								"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalSqlQueryDsl.g:5821:5: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop99:
                            do {
                                int alt99=2;
                                int LA99_0 = input.LA(1);

                                if ( (LA99_0==16) ) {
                                    alt99=1;
                                }


                                switch (alt99) {
                            	case 1 :
                            	    // InternalSqlQueryDsl.g:5822:6: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	      					
                            	    }
                            	    // InternalSqlQueryDsl.g:5826:6: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // InternalSqlQueryDsl.g:5827:7: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // InternalSqlQueryDsl.g:5827:7: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // InternalSqlQueryDsl.g:5828:8: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_7);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"paramTypes",
                            	      									lv_paramTypes_3_0,
                            	      									"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop99;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_76); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,37,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalSqlQueryDsl.g:5856:3: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // InternalSqlQueryDsl.g:5857:4: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // InternalSqlQueryDsl.g:5857:4: (lv_returnType_6_0= ruleJvmTypeReference )
            // InternalSqlQueryDsl.g:5858:5: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              					}
              					set(
              						current,
              						"returnType",
              						lv_returnType_6_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // InternalSqlQueryDsl.g:5879:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // InternalSqlQueryDsl.g:5879:70: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // InternalSqlQueryDsl.g:5880:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // InternalSqlQueryDsl.g:5886:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:5892:2: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? ) )
            // InternalSqlQueryDsl.g:5893:2: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? )
            {
            // InternalSqlQueryDsl.g:5893:2: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? )
            // InternalSqlQueryDsl.g:5894:3: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )?
            {
            // InternalSqlQueryDsl.g:5894:3: ( ( ruleQualifiedName ) )
            // InternalSqlQueryDsl.g:5895:4: ( ruleQualifiedName )
            {
            // InternalSqlQueryDsl.g:5895:4: ( ruleQualifiedName )
            // InternalSqlQueryDsl.g:5896:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_77);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSqlQueryDsl.g:5910:3: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )?
            int alt106=2;
            alt106 = dfa106.predict(input);
            switch (alt106) {
                case 1 :
                    // InternalSqlQueryDsl.g:5911:4: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )*
                    {
                    // InternalSqlQueryDsl.g:5911:4: ( ( '<' )=>otherlv_1= '<' )
                    // InternalSqlQueryDsl.g:5912:5: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                      				
                    }

                    }

                    // InternalSqlQueryDsl.g:5918:4: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // InternalSqlQueryDsl.g:5919:5: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // InternalSqlQueryDsl.g:5919:5: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // InternalSqlQueryDsl.g:5920:6: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_32);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      						}
                      						add(
                      							current,
                      							"arguments",
                      							lv_arguments_2_0,
                      							"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSqlQueryDsl.g:5937:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop102:
                    do {
                        int alt102=2;
                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==16) ) {
                            alt102=1;
                        }


                        switch (alt102) {
                    	case 1 :
                    	    // InternalSqlQueryDsl.g:5938:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_31); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalSqlQueryDsl.g:5942:5: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // InternalSqlQueryDsl.g:5943:6: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // InternalSqlQueryDsl.g:5943:6: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // InternalSqlQueryDsl.g:5944:7: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_32);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"arguments",
                    	      								lv_arguments_4_0,
                    	      								"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop102;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,25,FOLLOW_74); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                      			
                    }
                    // InternalSqlQueryDsl.g:5966:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==50) ) {
                            int LA105_2 = input.LA(2);

                            if ( (LA105_2==RULE_ID) ) {
                                int LA105_3 = input.LA(3);

                                if ( (synpred45_InternalSqlQueryDsl()) ) {
                                    alt105=1;
                                }


                            }


                        }


                        switch (alt105) {
                    	case 1 :
                    	    // InternalSqlQueryDsl.g:5967:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )?
                    	    {
                    	    // InternalSqlQueryDsl.g:5967:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
                    	    // InternalSqlQueryDsl.g:5968:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
                    	    {
                    	    // InternalSqlQueryDsl.g:5974:6: ( () otherlv_7= '.' )
                    	    // InternalSqlQueryDsl.g:5975:7: () otherlv_7= '.'
                    	    {
                    	    // InternalSqlQueryDsl.g:5975:7: ()
                    	    // InternalSqlQueryDsl.g:5976:8: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								current = forceCreateModelElementAndSet(
                    	      									grammarAccess.getJvmParameterizedTypeReferenceAccess().getJvmInnerTypeReferenceOuterAction_1_4_0_0_0(),
                    	      									current);
                    	      							
                    	    }

                    	    }

                    	    otherlv_7=(Token)match(input,50,FOLLOW_65); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_7, grammarAccess.getJvmParameterizedTypeReferenceAccess().getFullStopKeyword_1_4_0_0_1());
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalSqlQueryDsl.g:5988:5: ( ( ruleValidID ) )
                    	    // InternalSqlQueryDsl.g:5989:6: ( ruleValidID )
                    	    {
                    	    // InternalSqlQueryDsl.g:5989:6: ( ruleValidID )
                    	    // InternalSqlQueryDsl.g:5990:7: ruleValidID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_1_4_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_78);
                    	    ruleValidID();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalSqlQueryDsl.g:6004:5: ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )?
                    	    int alt104=2;
                    	    alt104 = dfa104.predict(input);
                    	    switch (alt104) {
                    	        case 1 :
                    	            // InternalSqlQueryDsl.g:6005:6: ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>'
                    	            {
                    	            // InternalSqlQueryDsl.g:6005:6: ( ( '<' )=>otherlv_9= '<' )
                    	            // InternalSqlQueryDsl.g:6006:7: ( '<' )=>otherlv_9= '<'
                    	            {
                    	            otherlv_9=(Token)match(input,24,FOLLOW_31); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							newLeafNode(otherlv_9, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_4_2_0());
                    	              						
                    	            }

                    	            }

                    	            // InternalSqlQueryDsl.g:6012:6: ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) )
                    	            // InternalSqlQueryDsl.g:6013:7: (lv_arguments_10_0= ruleJvmArgumentTypeReference )
                    	            {
                    	            // InternalSqlQueryDsl.g:6013:7: (lv_arguments_10_0= ruleJvmArgumentTypeReference )
                    	            // InternalSqlQueryDsl.g:6014:8: lv_arguments_10_0= ruleJvmArgumentTypeReference
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              								newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_4_2_1_0());
                    	              							
                    	            }
                    	            pushFollow(FOLLOW_32);
                    	            lv_arguments_10_0=ruleJvmArgumentTypeReference();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								if (current==null) {
                    	              									current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	              								}
                    	              								add(
                    	              									current,
                    	              									"arguments",
                    	              									lv_arguments_10_0,
                    	              									"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                    	              								afterParserOrEnumRuleCall();
                    	              							
                    	            }

                    	            }


                    	            }

                    	            // InternalSqlQueryDsl.g:6031:6: (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )*
                    	            loop103:
                    	            do {
                    	                int alt103=2;
                    	                int LA103_0 = input.LA(1);

                    	                if ( (LA103_0==16) ) {
                    	                    alt103=1;
                    	                }


                    	                switch (alt103) {
                    	            	case 1 :
                    	            	    // InternalSqlQueryDsl.g:6032:7: otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) )
                    	            	    {
                    	            	    otherlv_11=(Token)match(input,16,FOLLOW_31); if (state.failed) return current;
                    	            	    if ( state.backtracking==0 ) {

                    	            	      							newLeafNode(otherlv_11, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_4_2_2_0());
                    	            	      						
                    	            	    }
                    	            	    // InternalSqlQueryDsl.g:6036:7: ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) )
                    	            	    // InternalSqlQueryDsl.g:6037:8: (lv_arguments_12_0= ruleJvmArgumentTypeReference )
                    	            	    {
                    	            	    // InternalSqlQueryDsl.g:6037:8: (lv_arguments_12_0= ruleJvmArgumentTypeReference )
                    	            	    // InternalSqlQueryDsl.g:6038:9: lv_arguments_12_0= ruleJvmArgumentTypeReference
                    	            	    {
                    	            	    if ( state.backtracking==0 ) {

                    	            	      									newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_4_2_2_1_0());
                    	            	      								
                    	            	    }
                    	            	    pushFollow(FOLLOW_32);
                    	            	    lv_arguments_12_0=ruleJvmArgumentTypeReference();

                    	            	    state._fsp--;
                    	            	    if (state.failed) return current;
                    	            	    if ( state.backtracking==0 ) {

                    	            	      									if (current==null) {
                    	            	      										current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	            	      									}
                    	            	      									add(
                    	            	      										current,
                    	            	      										"arguments",
                    	            	      										lv_arguments_12_0,
                    	            	      										"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                    	            	      									afterParserOrEnumRuleCall();
                    	            	      								
                    	            	    }

                    	            	    }


                    	            	    }


                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop103;
                    	                }
                    	            } while (true);

                    	            otherlv_13=(Token)match(input,25,FOLLOW_74); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_13, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_4_2_3());
                    	              					
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop105;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // InternalSqlQueryDsl.g:6067:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // InternalSqlQueryDsl.g:6067:65: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // InternalSqlQueryDsl.g:6068:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // InternalSqlQueryDsl.g:6074:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:6080:2: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // InternalSqlQueryDsl.g:6081:2: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // InternalSqlQueryDsl.g:6081:2: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==RULE_ID||LA107_0==15||LA107_0==37) ) {
                alt107=1;
            }
            else if ( (LA107_0==87) ) {
                alt107=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // InternalSqlQueryDsl.g:6082:3: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JvmTypeReference_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSqlQueryDsl.g:6091:3: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JvmWildcardTypeReference_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // InternalSqlQueryDsl.g:6103:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // InternalSqlQueryDsl.g:6103:65: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // InternalSqlQueryDsl.g:6104:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // InternalSqlQueryDsl.g:6110:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;

        EObject lv_constraints_4_0 = null;

        EObject lv_constraints_5_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:6116:2: ( ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? ) )
            // InternalSqlQueryDsl.g:6117:2: ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? )
            {
            // InternalSqlQueryDsl.g:6117:2: ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? )
            // InternalSqlQueryDsl.g:6118:3: () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )?
            {
            // InternalSqlQueryDsl.g:6118:3: ()
            // InternalSqlQueryDsl.g:6119:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,87,FOLLOW_79); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
              		
            }
            // InternalSqlQueryDsl.g:6129:3: ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )?
            int alt110=3;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==71) ) {
                alt110=1;
            }
            else if ( (LA110_0==75) ) {
                alt110=2;
            }
            switch (alt110) {
                case 1 :
                    // InternalSqlQueryDsl.g:6130:4: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* )
                    {
                    // InternalSqlQueryDsl.g:6130:4: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* )
                    // InternalSqlQueryDsl.g:6131:5: ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )*
                    {
                    // InternalSqlQueryDsl.g:6131:5: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // InternalSqlQueryDsl.g:6132:6: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // InternalSqlQueryDsl.g:6132:6: (lv_constraints_2_0= ruleJvmUpperBound )
                    // InternalSqlQueryDsl.g:6133:7: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_80);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      							}
                      							add(
                      								current,
                      								"constraints",
                      								lv_constraints_2_0,
                      								"org.eclipse.xtext.xbase.Xtype.JvmUpperBound");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalSqlQueryDsl.g:6150:5: ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )*
                    loop108:
                    do {
                        int alt108=2;
                        int LA108_0 = input.LA(1);

                        if ( (LA108_0==88) ) {
                            alt108=1;
                        }


                        switch (alt108) {
                    	case 1 :
                    	    // InternalSqlQueryDsl.g:6151:6: (lv_constraints_3_0= ruleJvmUpperBoundAnded )
                    	    {
                    	    // InternalSqlQueryDsl.g:6151:6: (lv_constraints_3_0= ruleJvmUpperBoundAnded )
                    	    // InternalSqlQueryDsl.g:6152:7: lv_constraints_3_0= ruleJvmUpperBoundAnded
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundAndedParserRuleCall_2_0_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_80);
                    	    lv_constraints_3_0=ruleJvmUpperBoundAnded();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"constraints",
                    	      								lv_constraints_3_0,
                    	      								"org.eclipse.xtext.xbase.Xtype.JvmUpperBoundAnded");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop108;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSqlQueryDsl.g:6171:4: ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* )
                    {
                    // InternalSqlQueryDsl.g:6171:4: ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* )
                    // InternalSqlQueryDsl.g:6172:5: ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )*
                    {
                    // InternalSqlQueryDsl.g:6172:5: ( (lv_constraints_4_0= ruleJvmLowerBound ) )
                    // InternalSqlQueryDsl.g:6173:6: (lv_constraints_4_0= ruleJvmLowerBound )
                    {
                    // InternalSqlQueryDsl.g:6173:6: (lv_constraints_4_0= ruleJvmLowerBound )
                    // InternalSqlQueryDsl.g:6174:7: lv_constraints_4_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_80);
                    lv_constraints_4_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      							}
                      							add(
                      								current,
                      								"constraints",
                      								lv_constraints_4_0,
                      								"org.eclipse.xtext.xbase.Xtype.JvmLowerBound");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalSqlQueryDsl.g:6191:5: ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )*
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==88) ) {
                            alt109=1;
                        }


                        switch (alt109) {
                    	case 1 :
                    	    // InternalSqlQueryDsl.g:6192:6: (lv_constraints_5_0= ruleJvmLowerBoundAnded )
                    	    {
                    	    // InternalSqlQueryDsl.g:6192:6: (lv_constraints_5_0= ruleJvmLowerBoundAnded )
                    	    // InternalSqlQueryDsl.g:6193:7: lv_constraints_5_0= ruleJvmLowerBoundAnded
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundAndedParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_80);
                    	    lv_constraints_5_0=ruleJvmLowerBoundAnded();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"constraints",
                    	      								lv_constraints_5_0,
                    	      								"org.eclipse.xtext.xbase.Xtype.JvmLowerBoundAnded");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop109;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // InternalSqlQueryDsl.g:6216:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // InternalSqlQueryDsl.g:6216:54: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // InternalSqlQueryDsl.g:6217:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // InternalSqlQueryDsl.g:6223:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:6229:2: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalSqlQueryDsl.g:6230:2: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalSqlQueryDsl.g:6230:2: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalSqlQueryDsl.g:6231:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
              		
            }
            // InternalSqlQueryDsl.g:6235:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalSqlQueryDsl.g:6236:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalSqlQueryDsl.g:6236:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalSqlQueryDsl.g:6237:5: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              					}
              					set(
              						current,
              						"typeReference",
              						lv_typeReference_1_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // InternalSqlQueryDsl.g:6258:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // InternalSqlQueryDsl.g:6258:59: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // InternalSqlQueryDsl.g:6259:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // InternalSqlQueryDsl.g:6265:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:6271:2: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalSqlQueryDsl.g:6272:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalSqlQueryDsl.g:6272:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalSqlQueryDsl.g:6273:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,88,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
              		
            }
            // InternalSqlQueryDsl.g:6277:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalSqlQueryDsl.g:6278:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalSqlQueryDsl.g:6278:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalSqlQueryDsl.g:6279:5: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              					}
              					set(
              						current,
              						"typeReference",
              						lv_typeReference_1_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // InternalSqlQueryDsl.g:6300:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // InternalSqlQueryDsl.g:6300:54: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // InternalSqlQueryDsl.g:6301:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // InternalSqlQueryDsl.g:6307:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:6313:2: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalSqlQueryDsl.g:6314:2: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalSqlQueryDsl.g:6314:2: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalSqlQueryDsl.g:6315:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
              		
            }
            // InternalSqlQueryDsl.g:6319:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalSqlQueryDsl.g:6320:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalSqlQueryDsl.g:6320:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalSqlQueryDsl.g:6321:5: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              					}
              					set(
              						current,
              						"typeReference",
              						lv_typeReference_1_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleJvmLowerBoundAnded"
    // InternalSqlQueryDsl.g:6342:1: entryRuleJvmLowerBoundAnded returns [EObject current=null] : iv_ruleJvmLowerBoundAnded= ruleJvmLowerBoundAnded EOF ;
    public final EObject entryRuleJvmLowerBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBoundAnded = null;


        try {
            // InternalSqlQueryDsl.g:6342:59: (iv_ruleJvmLowerBoundAnded= ruleJvmLowerBoundAnded EOF )
            // InternalSqlQueryDsl.g:6343:2: iv_ruleJvmLowerBoundAnded= ruleJvmLowerBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundAndedRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmLowerBoundAnded=ruleJvmLowerBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBoundAnded; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBoundAnded"


    // $ANTLR start "ruleJvmLowerBoundAnded"
    // InternalSqlQueryDsl.g:6349:1: ruleJvmLowerBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:6355:2: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalSqlQueryDsl.g:6356:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalSqlQueryDsl.g:6356:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalSqlQueryDsl.g:6357:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,88,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAndedAccess().getAmpersandKeyword_0());
              		
            }
            // InternalSqlQueryDsl.g:6361:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalSqlQueryDsl.g:6362:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalSqlQueryDsl.g:6362:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalSqlQueryDsl.g:6363:5: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmLowerBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJvmLowerBoundAndedRule());
              					}
              					set(
              						current,
              						"typeReference",
              						lv_typeReference_1_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBoundAnded"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalSqlQueryDsl.g:6384:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalSqlQueryDsl.g:6384:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalSqlQueryDsl.g:6385:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalSqlQueryDsl.g:6391:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:6397:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // InternalSqlQueryDsl.g:6398:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // InternalSqlQueryDsl.g:6398:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // InternalSqlQueryDsl.g:6399:3: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_81);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,50,FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1());
              		
            }
            kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleValidID"
    // InternalSqlQueryDsl.g:6423:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalSqlQueryDsl.g:6423:47: (iv_ruleValidID= ruleValidID EOF )
            // InternalSqlQueryDsl.g:6424:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalSqlQueryDsl.g:6430:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalSqlQueryDsl.g:6436:2: (this_ID_0= RULE_ID )
            // InternalSqlQueryDsl.g:6437:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleXImportDeclaration"
    // InternalSqlQueryDsl.g:6447:1: entryRuleXImportDeclaration returns [EObject current=null] : iv_ruleXImportDeclaration= ruleXImportDeclaration EOF ;
    public final EObject entryRuleXImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXImportDeclaration = null;


        try {
            // InternalSqlQueryDsl.g:6447:59: (iv_ruleXImportDeclaration= ruleXImportDeclaration EOF )
            // InternalSqlQueryDsl.g:6448:2: iv_ruleXImportDeclaration= ruleXImportDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXImportDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXImportDeclaration=ruleXImportDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXImportDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXImportDeclaration"


    // $ANTLR start "ruleXImportDeclaration"
    // InternalSqlQueryDsl.g:6454:1: ruleXImportDeclaration returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) ;
    public final EObject ruleXImportDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_static_1_0=null;
        Token lv_extension_2_0=null;
        Token lv_wildcard_4_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_memberName_5_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_7_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:6460:2: ( (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) )
            // InternalSqlQueryDsl.g:6461:2: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            {
            // InternalSqlQueryDsl.g:6461:2: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            // InternalSqlQueryDsl.g:6462:3: otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )?
            {
            otherlv_0=(Token)match(input,73,FOLLOW_83); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getXImportDeclarationAccess().getImportKeyword_0());
              		
            }
            // InternalSqlQueryDsl.g:6466:3: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )
            int alt113=3;
            alt113 = dfa113.predict(input);
            switch (alt113) {
                case 1 :
                    // InternalSqlQueryDsl.g:6467:4: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) )
                    {
                    // InternalSqlQueryDsl.g:6467:4: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) )
                    // InternalSqlQueryDsl.g:6468:5: ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) )
                    {
                    // InternalSqlQueryDsl.g:6468:5: ( (lv_static_1_0= 'static' ) )
                    // InternalSqlQueryDsl.g:6469:6: (lv_static_1_0= 'static' )
                    {
                    // InternalSqlQueryDsl.g:6469:6: (lv_static_1_0= 'static' )
                    // InternalSqlQueryDsl.g:6470:7: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,72,FOLLOW_84); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_static_1_0, grammarAccess.getXImportDeclarationAccess().getStaticStaticKeyword_1_0_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      							}
                      							setWithLastConsumed(current, "static", true, "static");
                      						
                    }

                    }


                    }

                    // InternalSqlQueryDsl.g:6482:5: ( (lv_extension_2_0= 'extension' ) )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==74) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // InternalSqlQueryDsl.g:6483:6: (lv_extension_2_0= 'extension' )
                            {
                            // InternalSqlQueryDsl.g:6483:6: (lv_extension_2_0= 'extension' )
                            // InternalSqlQueryDsl.g:6484:7: lv_extension_2_0= 'extension'
                            {
                            lv_extension_2_0=(Token)match(input,74,FOLLOW_84); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_extension_2_0, grammarAccess.getXImportDeclarationAccess().getExtensionExtensionKeyword_1_0_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getXImportDeclarationRule());
                              							}
                              							setWithLastConsumed(current, "extension", true, "extension");
                              						
                            }

                            }


                            }
                            break;

                    }

                    // InternalSqlQueryDsl.g:6496:5: ( ( ruleQualifiedNameInStaticImport ) )
                    // InternalSqlQueryDsl.g:6497:6: ( ruleQualifiedNameInStaticImport )
                    {
                    // InternalSqlQueryDsl.g:6497:6: ( ruleQualifiedNameInStaticImport )
                    // InternalSqlQueryDsl.g:6498:7: ruleQualifiedNameInStaticImport
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_85);
                    ruleQualifiedNameInStaticImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalSqlQueryDsl.g:6512:5: ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) )
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==42) ) {
                        alt112=1;
                    }
                    else if ( (LA112_0==RULE_ID) ) {
                        alt112=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 112, 0, input);

                        throw nvae;
                    }
                    switch (alt112) {
                        case 1 :
                            // InternalSqlQueryDsl.g:6513:6: ( (lv_wildcard_4_0= '*' ) )
                            {
                            // InternalSqlQueryDsl.g:6513:6: ( (lv_wildcard_4_0= '*' ) )
                            // InternalSqlQueryDsl.g:6514:7: (lv_wildcard_4_0= '*' )
                            {
                            // InternalSqlQueryDsl.g:6514:7: (lv_wildcard_4_0= '*' )
                            // InternalSqlQueryDsl.g:6515:8: lv_wildcard_4_0= '*'
                            {
                            lv_wildcard_4_0=(Token)match(input,42,FOLLOW_86); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_wildcard_4_0, grammarAccess.getXImportDeclarationAccess().getWildcardAsteriskKeyword_1_0_3_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getXImportDeclarationRule());
                              								}
                              								setWithLastConsumed(current, "wildcard", true, "*");
                              							
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSqlQueryDsl.g:6528:6: ( (lv_memberName_5_0= ruleValidID ) )
                            {
                            // InternalSqlQueryDsl.g:6528:6: ( (lv_memberName_5_0= ruleValidID ) )
                            // InternalSqlQueryDsl.g:6529:7: (lv_memberName_5_0= ruleValidID )
                            {
                            // InternalSqlQueryDsl.g:6529:7: (lv_memberName_5_0= ruleValidID )
                            // InternalSqlQueryDsl.g:6530:8: lv_memberName_5_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getXImportDeclarationAccess().getMemberNameValidIDParserRuleCall_1_0_3_1_0());
                              							
                            }
                            pushFollow(FOLLOW_86);
                            lv_memberName_5_0=ruleValidID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getXImportDeclarationRule());
                              								}
                              								set(
                              									current,
                              									"memberName",
                              									lv_memberName_5_0,
                              									"org.eclipse.xtext.xbase.Xtype.ValidID");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSqlQueryDsl.g:6550:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalSqlQueryDsl.g:6550:4: ( ( ruleQualifiedName ) )
                    // InternalSqlQueryDsl.g:6551:5: ( ruleQualifiedName )
                    {
                    // InternalSqlQueryDsl.g:6551:5: ( ruleQualifiedName )
                    // InternalSqlQueryDsl.g:6552:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_86);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSqlQueryDsl.g:6567:4: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    {
                    // InternalSqlQueryDsl.g:6567:4: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    // InternalSqlQueryDsl.g:6568:5: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    {
                    // InternalSqlQueryDsl.g:6568:5: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    // InternalSqlQueryDsl.g:6569:6: lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_86);
                    lv_importedNamespace_7_0=ruleQualifiedNameWithWildcard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXImportDeclarationRule());
                      						}
                      						set(
                      							current,
                      							"importedNamespace",
                      							lv_importedNamespace_7_0,
                      							"org.eclipse.xtext.xbase.Xtype.QualifiedNameWithWildcard");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSqlQueryDsl.g:6587:3: (otherlv_8= ';' )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==59) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalSqlQueryDsl.g:6588:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXImportDeclaration"


    // $ANTLR start "entryRuleQualifiedNameInStaticImport"
    // InternalSqlQueryDsl.g:6597:1: entryRuleQualifiedNameInStaticImport returns [String current=null] : iv_ruleQualifiedNameInStaticImport= ruleQualifiedNameInStaticImport EOF ;
    public final String entryRuleQualifiedNameInStaticImport() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameInStaticImport = null;


        try {
            // InternalSqlQueryDsl.g:6597:67: (iv_ruleQualifiedNameInStaticImport= ruleQualifiedNameInStaticImport EOF )
            // InternalSqlQueryDsl.g:6598:2: iv_ruleQualifiedNameInStaticImport= ruleQualifiedNameInStaticImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameInStaticImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameInStaticImport=ruleQualifiedNameInStaticImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameInStaticImport.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameInStaticImport"


    // $ANTLR start "ruleQualifiedNameInStaticImport"
    // InternalSqlQueryDsl.g:6604:1: ruleQualifiedNameInStaticImport returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '.' )+ ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameInStaticImport() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;



        	enterRule();

        try {
            // InternalSqlQueryDsl.g:6610:2: ( (this_ValidID_0= ruleValidID kw= '.' )+ )
            // InternalSqlQueryDsl.g:6611:2: (this_ValidID_0= ruleValidID kw= '.' )+
            {
            // InternalSqlQueryDsl.g:6611:2: (this_ValidID_0= ruleValidID kw= '.' )+
            int cnt115=0;
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==RULE_ID) ) {
                    int LA115_2 = input.LA(2);

                    if ( (LA115_2==50) ) {
                        alt115=1;
                    }


                }


                switch (alt115) {
            	case 1 :
            	    // InternalSqlQueryDsl.g:6612:3: this_ValidID_0= ruleValidID kw= '.'
            	    {
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getQualifiedNameInStaticImportAccess().getValidIDParserRuleCall_0());
            	      		
            	    }
            	    pushFollow(FOLLOW_81);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_ValidID_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			afterParserOrEnumRuleCall();
            	      		
            	    }
            	    kw=(Token)match(input,50,FOLLOW_87); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getQualifiedNameInStaticImportAccess().getFullStopKeyword_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt115 >= 1 ) break loop115;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(115, input);
                        throw eee;
                }
                cnt115++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameInStaticImport"

    // $ANTLR start synpred1_InternalSqlQueryDsl
    public final void synpred1_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:452:6: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // InternalSqlQueryDsl.g:452:7: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // InternalSqlQueryDsl.g:452:7: ( () ( ( ruleOpMultiAssign ) ) )
        // InternalSqlQueryDsl.g:453:7: () ( ( ruleOpMultiAssign ) )
        {
        // InternalSqlQueryDsl.g:453:7: ()
        // InternalSqlQueryDsl.g:454:7: 
        {
        }

        // InternalSqlQueryDsl.g:455:7: ( ( ruleOpMultiAssign ) )
        // InternalSqlQueryDsl.g:456:8: ( ruleOpMultiAssign )
        {
        // InternalSqlQueryDsl.g:456:8: ( ruleOpMultiAssign )
        // InternalSqlQueryDsl.g:457:9: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_2);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalSqlQueryDsl

    // $ANTLR start synpred2_InternalSqlQueryDsl
    public final void synpred2_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:646:5: ( ( () ( ( ruleOpOr ) ) ) )
        // InternalSqlQueryDsl.g:646:6: ( () ( ( ruleOpOr ) ) )
        {
        // InternalSqlQueryDsl.g:646:6: ( () ( ( ruleOpOr ) ) )
        // InternalSqlQueryDsl.g:647:6: () ( ( ruleOpOr ) )
        {
        // InternalSqlQueryDsl.g:647:6: ()
        // InternalSqlQueryDsl.g:648:6: 
        {
        }

        // InternalSqlQueryDsl.g:649:6: ( ( ruleOpOr ) )
        // InternalSqlQueryDsl.g:650:7: ( ruleOpOr )
        {
        // InternalSqlQueryDsl.g:650:7: ( ruleOpOr )
        // InternalSqlQueryDsl.g:651:8: ruleOpOr
        {
        pushFollow(FOLLOW_2);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalSqlQueryDsl

    // $ANTLR start synpred3_InternalSqlQueryDsl
    public final void synpred3_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:753:5: ( ( () ( ( ruleOpAnd ) ) ) )
        // InternalSqlQueryDsl.g:753:6: ( () ( ( ruleOpAnd ) ) )
        {
        // InternalSqlQueryDsl.g:753:6: ( () ( ( ruleOpAnd ) ) )
        // InternalSqlQueryDsl.g:754:6: () ( ( ruleOpAnd ) )
        {
        // InternalSqlQueryDsl.g:754:6: ()
        // InternalSqlQueryDsl.g:755:6: 
        {
        }

        // InternalSqlQueryDsl.g:756:6: ( ( ruleOpAnd ) )
        // InternalSqlQueryDsl.g:757:7: ( ruleOpAnd )
        {
        // InternalSqlQueryDsl.g:757:7: ( ruleOpAnd )
        // InternalSqlQueryDsl.g:758:8: ruleOpAnd
        {
        pushFollow(FOLLOW_2);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalSqlQueryDsl

    // $ANTLR start synpred4_InternalSqlQueryDsl
    public final void synpred4_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:860:5: ( ( () ( ( ruleOpEquality ) ) ) )
        // InternalSqlQueryDsl.g:860:6: ( () ( ( ruleOpEquality ) ) )
        {
        // InternalSqlQueryDsl.g:860:6: ( () ( ( ruleOpEquality ) ) )
        // InternalSqlQueryDsl.g:861:6: () ( ( ruleOpEquality ) )
        {
        // InternalSqlQueryDsl.g:861:6: ()
        // InternalSqlQueryDsl.g:862:6: 
        {
        }

        // InternalSqlQueryDsl.g:863:6: ( ( ruleOpEquality ) )
        // InternalSqlQueryDsl.g:864:7: ( ruleOpEquality )
        {
        // InternalSqlQueryDsl.g:864:7: ( ruleOpEquality )
        // InternalSqlQueryDsl.g:865:8: ruleOpEquality
        {
        pushFollow(FOLLOW_2);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalSqlQueryDsl

    // $ANTLR start synpred5_InternalSqlQueryDsl
    public final void synpred5_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:988:6: ( ( () 'instanceof' ) )
        // InternalSqlQueryDsl.g:988:7: ( () 'instanceof' )
        {
        // InternalSqlQueryDsl.g:988:7: ( () 'instanceof' )
        // InternalSqlQueryDsl.g:989:7: () 'instanceof'
        {
        // InternalSqlQueryDsl.g:989:7: ()
        // InternalSqlQueryDsl.g:990:7: 
        {
        }

        match(input,33,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalSqlQueryDsl

    // $ANTLR start synpred6_InternalSqlQueryDsl
    public final void synpred6_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:1031:6: ( ( () ( ( ruleOpCompare ) ) ) )
        // InternalSqlQueryDsl.g:1031:7: ( () ( ( ruleOpCompare ) ) )
        {
        // InternalSqlQueryDsl.g:1031:7: ( () ( ( ruleOpCompare ) ) )
        // InternalSqlQueryDsl.g:1032:7: () ( ( ruleOpCompare ) )
        {
        // InternalSqlQueryDsl.g:1032:7: ()
        // InternalSqlQueryDsl.g:1033:7: 
        {
        }

        // InternalSqlQueryDsl.g:1034:7: ( ( ruleOpCompare ) )
        // InternalSqlQueryDsl.g:1035:8: ( ruleOpCompare )
        {
        // InternalSqlQueryDsl.g:1035:8: ( ruleOpCompare )
        // InternalSqlQueryDsl.g:1036:9: ruleOpCompare
        {
        pushFollow(FOLLOW_2);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalSqlQueryDsl

    // $ANTLR start synpred7_InternalSqlQueryDsl
    public final void synpred7_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:1166:5: ( ( () ( ( ruleOpOther ) ) ) )
        // InternalSqlQueryDsl.g:1166:6: ( () ( ( ruleOpOther ) ) )
        {
        // InternalSqlQueryDsl.g:1166:6: ( () ( ( ruleOpOther ) ) )
        // InternalSqlQueryDsl.g:1167:6: () ( ( ruleOpOther ) )
        {
        // InternalSqlQueryDsl.g:1167:6: ()
        // InternalSqlQueryDsl.g:1168:6: 
        {
        }

        // InternalSqlQueryDsl.g:1169:6: ( ( ruleOpOther ) )
        // InternalSqlQueryDsl.g:1170:7: ( ruleOpOther )
        {
        // InternalSqlQueryDsl.g:1170:7: ( ruleOpOther )
        // InternalSqlQueryDsl.g:1171:8: ruleOpOther
        {
        pushFollow(FOLLOW_2);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalSqlQueryDsl

    // $ANTLR start synpred8_InternalSqlQueryDsl
    public final void synpred8_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:1286:6: ( ( '>' '>' ) )
        // InternalSqlQueryDsl.g:1286:7: ( '>' '>' )
        {
        // InternalSqlQueryDsl.g:1286:7: ( '>' '>' )
        // InternalSqlQueryDsl.g:1287:7: '>' '>'
        {
        match(input,25,FOLLOW_22); if (state.failed) return ;
        match(input,25,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalSqlQueryDsl

    // $ANTLR start synpred9_InternalSqlQueryDsl
    public final void synpred9_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:1321:6: ( ( '<' '<' ) )
        // InternalSqlQueryDsl.g:1321:7: ( '<' '<' )
        {
        // InternalSqlQueryDsl.g:1321:7: ( '<' '<' )
        // InternalSqlQueryDsl.g:1322:7: '<' '<'
        {
        match(input,24,FOLLOW_13); if (state.failed) return ;
        match(input,24,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalSqlQueryDsl

    // $ANTLR start synpred10_InternalSqlQueryDsl
    public final void synpred10_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:1394:5: ( ( () ( ( ruleOpAdd ) ) ) )
        // InternalSqlQueryDsl.g:1394:6: ( () ( ( ruleOpAdd ) ) )
        {
        // InternalSqlQueryDsl.g:1394:6: ( () ( ( ruleOpAdd ) ) )
        // InternalSqlQueryDsl.g:1395:6: () ( ( ruleOpAdd ) )
        {
        // InternalSqlQueryDsl.g:1395:6: ()
        // InternalSqlQueryDsl.g:1396:6: 
        {
        }

        // InternalSqlQueryDsl.g:1397:6: ( ( ruleOpAdd ) )
        // InternalSqlQueryDsl.g:1398:7: ( ruleOpAdd )
        {
        // InternalSqlQueryDsl.g:1398:7: ( ruleOpAdd )
        // InternalSqlQueryDsl.g:1399:8: ruleOpAdd
        {
        pushFollow(FOLLOW_2);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalSqlQueryDsl

    // $ANTLR start synpred11_InternalSqlQueryDsl
    public final void synpred11_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:1509:5: ( ( () ( ( ruleOpMulti ) ) ) )
        // InternalSqlQueryDsl.g:1509:6: ( () ( ( ruleOpMulti ) ) )
        {
        // InternalSqlQueryDsl.g:1509:6: ( () ( ( ruleOpMulti ) ) )
        // InternalSqlQueryDsl.g:1510:6: () ( ( ruleOpMulti ) )
        {
        // InternalSqlQueryDsl.g:1510:6: ()
        // InternalSqlQueryDsl.g:1511:6: 
        {
        }

        // InternalSqlQueryDsl.g:1512:6: ( ( ruleOpMulti ) )
        // InternalSqlQueryDsl.g:1513:7: ( ruleOpMulti )
        {
        // InternalSqlQueryDsl.g:1513:7: ( ruleOpMulti )
        // InternalSqlQueryDsl.g:1514:8: ruleOpMulti
        {
        pushFollow(FOLLOW_2);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalSqlQueryDsl

    // $ANTLR start synpred12_InternalSqlQueryDsl
    public final void synpred12_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:1744:5: ( ( () 'as' ) )
        // InternalSqlQueryDsl.g:1744:6: ( () 'as' )
        {
        // InternalSqlQueryDsl.g:1744:6: ( () 'as' )
        // InternalSqlQueryDsl.g:1745:6: () 'as'
        {
        // InternalSqlQueryDsl.g:1745:6: ()
        // InternalSqlQueryDsl.g:1746:6: 
        {
        }

        match(input,47,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalSqlQueryDsl

    // $ANTLR start synpred13_InternalSqlQueryDsl
    public final void synpred13_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:1812:4: ( ( () ( ( ruleOpPostfix ) ) ) )
        // InternalSqlQueryDsl.g:1812:5: ( () ( ( ruleOpPostfix ) ) )
        {
        // InternalSqlQueryDsl.g:1812:5: ( () ( ( ruleOpPostfix ) ) )
        // InternalSqlQueryDsl.g:1813:5: () ( ( ruleOpPostfix ) )
        {
        // InternalSqlQueryDsl.g:1813:5: ()
        // InternalSqlQueryDsl.g:1814:5: 
        {
        }

        // InternalSqlQueryDsl.g:1815:5: ( ( ruleOpPostfix ) )
        // InternalSqlQueryDsl.g:1816:6: ( ruleOpPostfix )
        {
        // InternalSqlQueryDsl.g:1816:6: ( ruleOpPostfix )
        // InternalSqlQueryDsl.g:1817:7: ruleOpPostfix
        {
        pushFollow(FOLLOW_2);
        ruleOpPostfix();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred13_InternalSqlQueryDsl

    // $ANTLR start synpred14_InternalSqlQueryDsl
    public final void synpred14_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:1908:6: ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )
        // InternalSqlQueryDsl.g:1908:7: ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
        {
        // InternalSqlQueryDsl.g:1908:7: ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
        // InternalSqlQueryDsl.g:1909:7: () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign
        {
        // InternalSqlQueryDsl.g:1909:7: ()
        // InternalSqlQueryDsl.g:1910:7: 
        {
        }

        // InternalSqlQueryDsl.g:1911:7: ( '.' | ( ( '::' ) ) )
        int alt116=2;
        int LA116_0 = input.LA(1);

        if ( (LA116_0==50) ) {
            alt116=1;
        }
        else if ( (LA116_0==51) ) {
            alt116=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 116, 0, input);

            throw nvae;
        }
        switch (alt116) {
            case 1 :
                // InternalSqlQueryDsl.g:1912:8: '.'
                {
                match(input,50,FOLLOW_29); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalSqlQueryDsl.g:1914:8: ( ( '::' ) )
                {
                // InternalSqlQueryDsl.g:1914:8: ( ( '::' ) )
                // InternalSqlQueryDsl.g:1915:9: ( '::' )
                {
                // InternalSqlQueryDsl.g:1915:9: ( '::' )
                // InternalSqlQueryDsl.g:1916:10: '::'
                {
                match(input,51,FOLLOW_29); if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalSqlQueryDsl.g:1920:7: ( ( ruleFeatureCallID ) )
        // InternalSqlQueryDsl.g:1921:8: ( ruleFeatureCallID )
        {
        // InternalSqlQueryDsl.g:1921:8: ( ruleFeatureCallID )
        // InternalSqlQueryDsl.g:1922:9: ruleFeatureCallID
        {
        pushFollow(FOLLOW_10);
        ruleFeatureCallID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_2);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalSqlQueryDsl

    // $ANTLR start synpred15_InternalSqlQueryDsl
    public final void synpred15_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:2005:6: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )
        // InternalSqlQueryDsl.g:2005:7: ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) )
        {
        // InternalSqlQueryDsl.g:2005:7: ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) )
        // InternalSqlQueryDsl.g:2006:7: () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) )
        {
        // InternalSqlQueryDsl.g:2006:7: ()
        // InternalSqlQueryDsl.g:2007:7: 
        {
        }

        // InternalSqlQueryDsl.g:2008:7: ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) )
        int alt117=3;
        switch ( input.LA(1) ) {
        case 50:
            {
            alt117=1;
            }
            break;
        case 52:
            {
            alt117=2;
            }
            break;
        case 51:
            {
            alt117=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 117, 0, input);

            throw nvae;
        }

        switch (alt117) {
            case 1 :
                // InternalSqlQueryDsl.g:2009:8: '.'
                {
                match(input,50,FOLLOW_2); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalSqlQueryDsl.g:2011:8: ( ( '?.' ) )
                {
                // InternalSqlQueryDsl.g:2011:8: ( ( '?.' ) )
                // InternalSqlQueryDsl.g:2012:9: ( '?.' )
                {
                // InternalSqlQueryDsl.g:2012:9: ( '?.' )
                // InternalSqlQueryDsl.g:2013:10: '?.'
                {
                match(input,52,FOLLOW_2); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // InternalSqlQueryDsl.g:2017:8: ( ( '::' ) )
                {
                // InternalSqlQueryDsl.g:2017:8: ( ( '::' ) )
                // InternalSqlQueryDsl.g:2018:9: ( '::' )
                {
                // InternalSqlQueryDsl.g:2018:9: ( '::' )
                // InternalSqlQueryDsl.g:2019:10: '::'
                {
                match(input,51,FOLLOW_2); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred15_InternalSqlQueryDsl

    // $ANTLR start synpred16_InternalSqlQueryDsl
    public final void synpred16_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:2143:7: ( ( '(' ) )
        // InternalSqlQueryDsl.g:2143:8: ( '(' )
        {
        // InternalSqlQueryDsl.g:2143:8: ( '(' )
        // InternalSqlQueryDsl.g:2144:8: '('
        {
        match(input,15,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred16_InternalSqlQueryDsl

    // $ANTLR start synpred17_InternalSqlQueryDsl
    public final void synpred17_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:2162:8: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // InternalSqlQueryDsl.g:2162:9: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // InternalSqlQueryDsl.g:2162:9: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // InternalSqlQueryDsl.g:2163:9: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // InternalSqlQueryDsl.g:2163:9: ()
        // InternalSqlQueryDsl.g:2164:9: 
        {
        }

        // InternalSqlQueryDsl.g:2165:9: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt119=2;
        int LA119_0 = input.LA(1);

        if ( (LA119_0==RULE_ID||LA119_0==15||LA119_0==37) ) {
            alt119=1;
        }
        switch (alt119) {
            case 1 :
                // InternalSqlQueryDsl.g:2166:10: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // InternalSqlQueryDsl.g:2166:10: ( ( ruleJvmFormalParameter ) )
                // InternalSqlQueryDsl.g:2167:11: ( ruleJvmFormalParameter )
                {
                // InternalSqlQueryDsl.g:2167:11: ( ruleJvmFormalParameter )
                // InternalSqlQueryDsl.g:2168:12: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_44);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalSqlQueryDsl.g:2171:10: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop118:
                do {
                    int alt118=2;
                    int LA118_0 = input.LA(1);

                    if ( (LA118_0==16) ) {
                        alt118=1;
                    }


                    switch (alt118) {
                	case 1 :
                	    // InternalSqlQueryDsl.g:2172:11: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,16,FOLLOW_8); if (state.failed) return ;
                	    // InternalSqlQueryDsl.g:2173:11: ( ( ruleJvmFormalParameter ) )
                	    // InternalSqlQueryDsl.g:2174:12: ( ruleJvmFormalParameter )
                	    {
                	    // InternalSqlQueryDsl.g:2174:12: ( ruleJvmFormalParameter )
                	    // InternalSqlQueryDsl.g:2175:13: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_44);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop118;
                    }
                } while (true);


                }
                break;

        }

        // InternalSqlQueryDsl.g:2180:9: ( ( '|' ) )
        // InternalSqlQueryDsl.g:2181:10: ( '|' )
        {
        // InternalSqlQueryDsl.g:2181:10: ( '|' )
        // InternalSqlQueryDsl.g:2182:11: '|'
        {
        match(input,58,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalSqlQueryDsl

    // $ANTLR start synpred18_InternalSqlQueryDsl
    public final void synpred18_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:2259:6: ( ( () '[' ) )
        // InternalSqlQueryDsl.g:2259:7: ( () '[' )
        {
        // InternalSqlQueryDsl.g:2259:7: ( () '[' )
        // InternalSqlQueryDsl.g:2260:7: () '['
        {
        // InternalSqlQueryDsl.g:2260:7: ()
        // InternalSqlQueryDsl.g:2261:7: 
        {
        }

        match(input,56,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalSqlQueryDsl

    // $ANTLR start synpred19_InternalSqlQueryDsl
    public final void synpred19_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:2332:4: ( ( () 'synchronized' '(' ) )
        // InternalSqlQueryDsl.g:2332:5: ( () 'synchronized' '(' )
        {
        // InternalSqlQueryDsl.g:2332:5: ( () 'synchronized' '(' )
        // InternalSqlQueryDsl.g:2333:5: () 'synchronized' '('
        {
        // InternalSqlQueryDsl.g:2333:5: ()
        // InternalSqlQueryDsl.g:2334:5: 
        {
        }

        match(input,85,FOLLOW_5); if (state.failed) return ;
        match(input,15,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalSqlQueryDsl

    // $ANTLR start synpred20_InternalSqlQueryDsl
    public final void synpred20_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:2377:4: ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )
        // InternalSqlQueryDsl.g:2377:5: ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' )
        {
        // InternalSqlQueryDsl.g:2377:5: ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' )
        // InternalSqlQueryDsl.g:2378:5: () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':'
        {
        // InternalSqlQueryDsl.g:2378:5: ()
        // InternalSqlQueryDsl.g:2379:5: 
        {
        }

        match(input,66,FOLLOW_5); if (state.failed) return ;
        match(input,15,FOLLOW_8); if (state.failed) return ;
        // InternalSqlQueryDsl.g:2382:5: ( ( ruleJvmFormalParameter ) )
        // InternalSqlQueryDsl.g:2383:6: ( ruleJvmFormalParameter )
        {
        // InternalSqlQueryDsl.g:2383:6: ( ruleJvmFormalParameter )
        // InternalSqlQueryDsl.g:2384:7: ruleJvmFormalParameter
        {
        pushFollow(FOLLOW_51);
        ruleJvmFormalParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,63,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalSqlQueryDsl

    // $ANTLR start synpred21_InternalSqlQueryDsl
    public final void synpred21_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:2491:4: ( ( () '[' ) )
        // InternalSqlQueryDsl.g:2491:5: ( () '[' )
        {
        // InternalSqlQueryDsl.g:2491:5: ( () '[' )
        // InternalSqlQueryDsl.g:2492:5: () '['
        {
        // InternalSqlQueryDsl.g:2492:5: ()
        // InternalSqlQueryDsl.g:2493:5: 
        {
        }

        match(input,56,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalSqlQueryDsl

    // $ANTLR start synpred23_InternalSqlQueryDsl
    public final void synpred23_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:2796:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // InternalSqlQueryDsl.g:2796:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // InternalSqlQueryDsl.g:2796:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // InternalSqlQueryDsl.g:2797:5: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // InternalSqlQueryDsl.g:2797:5: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt121=2;
        int LA121_0 = input.LA(1);

        if ( (LA121_0==RULE_ID||LA121_0==15||LA121_0==37) ) {
            alt121=1;
        }
        switch (alt121) {
            case 1 :
                // InternalSqlQueryDsl.g:2798:6: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // InternalSqlQueryDsl.g:2798:6: ( ( ruleJvmFormalParameter ) )
                // InternalSqlQueryDsl.g:2799:7: ( ruleJvmFormalParameter )
                {
                // InternalSqlQueryDsl.g:2799:7: ( ruleJvmFormalParameter )
                // InternalSqlQueryDsl.g:2800:8: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_44);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalSqlQueryDsl.g:2803:6: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop120:
                do {
                    int alt120=2;
                    int LA120_0 = input.LA(1);

                    if ( (LA120_0==16) ) {
                        alt120=1;
                    }


                    switch (alt120) {
                	case 1 :
                	    // InternalSqlQueryDsl.g:2804:7: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,16,FOLLOW_8); if (state.failed) return ;
                	    // InternalSqlQueryDsl.g:2805:7: ( ( ruleJvmFormalParameter ) )
                	    // InternalSqlQueryDsl.g:2806:8: ( ruleJvmFormalParameter )
                	    {
                	    // InternalSqlQueryDsl.g:2806:8: ( ruleJvmFormalParameter )
                	    // InternalSqlQueryDsl.g:2807:9: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_44);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop120;
                    }
                } while (true);


                }
                break;

        }

        // InternalSqlQueryDsl.g:2812:5: ( ( '|' ) )
        // InternalSqlQueryDsl.g:2813:6: ( '|' )
        {
        // InternalSqlQueryDsl.g:2813:6: ( '|' )
        // InternalSqlQueryDsl.g:2814:7: '|'
        {
        match(input,58,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred23_InternalSqlQueryDsl

    // $ANTLR start synpred25_InternalSqlQueryDsl
    public final void synpred25_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:3205:5: ( 'else' )
        // InternalSqlQueryDsl.g:3205:6: 'else'
        {
        match(input,61,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalSqlQueryDsl

    // $ANTLR start synpred26_InternalSqlQueryDsl
    public final void synpred26_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:3264:6: ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )
        // InternalSqlQueryDsl.g:3264:7: ( '(' ( ( ruleJvmFormalParameter ) ) ':' )
        {
        // InternalSqlQueryDsl.g:3264:7: ( '(' ( ( ruleJvmFormalParameter ) ) ':' )
        // InternalSqlQueryDsl.g:3265:7: '(' ( ( ruleJvmFormalParameter ) ) ':'
        {
        match(input,15,FOLLOW_8); if (state.failed) return ;
        // InternalSqlQueryDsl.g:3266:7: ( ( ruleJvmFormalParameter ) )
        // InternalSqlQueryDsl.g:3267:8: ( ruleJvmFormalParameter )
        {
        // InternalSqlQueryDsl.g:3267:8: ( ruleJvmFormalParameter )
        // InternalSqlQueryDsl.g:3268:9: ruleJvmFormalParameter
        {
        pushFollow(FOLLOW_51);
        ruleJvmFormalParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,63,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalSqlQueryDsl

    // $ANTLR start synpred27_InternalSqlQueryDsl
    public final void synpred27_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:3331:6: ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )
        // InternalSqlQueryDsl.g:3331:7: ( ( ( ruleJvmFormalParameter ) ) ':' )
        {
        // InternalSqlQueryDsl.g:3331:7: ( ( ( ruleJvmFormalParameter ) ) ':' )
        // InternalSqlQueryDsl.g:3332:7: ( ( ruleJvmFormalParameter ) ) ':'
        {
        // InternalSqlQueryDsl.g:3332:7: ( ( ruleJvmFormalParameter ) )
        // InternalSqlQueryDsl.g:3333:8: ( ruleJvmFormalParameter )
        {
        // InternalSqlQueryDsl.g:3333:8: ( ruleJvmFormalParameter )
        // InternalSqlQueryDsl.g:3334:9: ruleJvmFormalParameter
        {
        pushFollow(FOLLOW_51);
        ruleJvmFormalParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,63,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred27_InternalSqlQueryDsl

    // $ANTLR start synpred29_InternalSqlQueryDsl
    public final void synpred29_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:4149:5: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // InternalSqlQueryDsl.g:4149:6: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // InternalSqlQueryDsl.g:4149:6: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // InternalSqlQueryDsl.g:4150:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // InternalSqlQueryDsl.g:4150:6: ( ( ruleJvmTypeReference ) )
        // InternalSqlQueryDsl.g:4151:7: ( ruleJvmTypeReference )
        {
        // InternalSqlQueryDsl.g:4151:7: ( ruleJvmTypeReference )
        // InternalSqlQueryDsl.g:4152:8: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_65);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalSqlQueryDsl.g:4155:6: ( ( ruleValidID ) )
        // InternalSqlQueryDsl.g:4156:7: ( ruleValidID )
        {
        // InternalSqlQueryDsl.g:4156:7: ( ruleValidID )
        // InternalSqlQueryDsl.g:4157:8: ruleValidID
        {
        pushFollow(FOLLOW_2);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred29_InternalSqlQueryDsl

    // $ANTLR start synpred30_InternalSqlQueryDsl
    public final void synpred30_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:4461:5: ( ( '(' ) )
        // InternalSqlQueryDsl.g:4461:6: ( '(' )
        {
        // InternalSqlQueryDsl.g:4461:6: ( '(' )
        // InternalSqlQueryDsl.g:4462:6: '('
        {
        match(input,15,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred30_InternalSqlQueryDsl

    // $ANTLR start synpred31_InternalSqlQueryDsl
    public final void synpred31_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:4480:6: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // InternalSqlQueryDsl.g:4480:7: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // InternalSqlQueryDsl.g:4480:7: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // InternalSqlQueryDsl.g:4481:7: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // InternalSqlQueryDsl.g:4481:7: ()
        // InternalSqlQueryDsl.g:4482:7: 
        {
        }

        // InternalSqlQueryDsl.g:4483:7: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt125=2;
        int LA125_0 = input.LA(1);

        if ( (LA125_0==RULE_ID||LA125_0==15||LA125_0==37) ) {
            alt125=1;
        }
        switch (alt125) {
            case 1 :
                // InternalSqlQueryDsl.g:4484:8: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // InternalSqlQueryDsl.g:4484:8: ( ( ruleJvmFormalParameter ) )
                // InternalSqlQueryDsl.g:4485:9: ( ruleJvmFormalParameter )
                {
                // InternalSqlQueryDsl.g:4485:9: ( ruleJvmFormalParameter )
                // InternalSqlQueryDsl.g:4486:10: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_44);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalSqlQueryDsl.g:4489:8: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop124:
                do {
                    int alt124=2;
                    int LA124_0 = input.LA(1);

                    if ( (LA124_0==16) ) {
                        alt124=1;
                    }


                    switch (alt124) {
                	case 1 :
                	    // InternalSqlQueryDsl.g:4490:9: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,16,FOLLOW_8); if (state.failed) return ;
                	    // InternalSqlQueryDsl.g:4491:9: ( ( ruleJvmFormalParameter ) )
                	    // InternalSqlQueryDsl.g:4492:10: ( ruleJvmFormalParameter )
                	    {
                	    // InternalSqlQueryDsl.g:4492:10: ( ruleJvmFormalParameter )
                	    // InternalSqlQueryDsl.g:4493:11: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_44);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop124;
                    }
                } while (true);


                }
                break;

        }

        // InternalSqlQueryDsl.g:4498:7: ( ( '|' ) )
        // InternalSqlQueryDsl.g:4499:8: ( '|' )
        {
        // InternalSqlQueryDsl.g:4499:8: ( '|' )
        // InternalSqlQueryDsl.g:4500:9: '|'
        {
        match(input,58,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalSqlQueryDsl

    // $ANTLR start synpred32_InternalSqlQueryDsl
    public final void synpred32_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:4577:4: ( ( () '[' ) )
        // InternalSqlQueryDsl.g:4577:5: ( () '[' )
        {
        // InternalSqlQueryDsl.g:4577:5: ( () '[' )
        // InternalSqlQueryDsl.g:4578:5: () '['
        {
        // InternalSqlQueryDsl.g:4578:5: ()
        // InternalSqlQueryDsl.g:4579:5: 
        {
        }

        match(input,56,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalSqlQueryDsl

    // $ANTLR start synpred33_InternalSqlQueryDsl
    public final void synpred33_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:4737:5: ( '<' )
        // InternalSqlQueryDsl.g:4737:6: '<'
        {
        match(input,24,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalSqlQueryDsl

    // $ANTLR start synpred34_InternalSqlQueryDsl
    public final void synpred34_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:4794:5: ( ( '(' ) )
        // InternalSqlQueryDsl.g:4794:6: ( '(' )
        {
        // InternalSqlQueryDsl.g:4794:6: ( '(' )
        // InternalSqlQueryDsl.g:4795:6: '('
        {
        match(input,15,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred34_InternalSqlQueryDsl

    // $ANTLR start synpred35_InternalSqlQueryDsl
    public final void synpred35_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:4813:6: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // InternalSqlQueryDsl.g:4813:7: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // InternalSqlQueryDsl.g:4813:7: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // InternalSqlQueryDsl.g:4814:7: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // InternalSqlQueryDsl.g:4814:7: ()
        // InternalSqlQueryDsl.g:4815:7: 
        {
        }

        // InternalSqlQueryDsl.g:4816:7: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt127=2;
        int LA127_0 = input.LA(1);

        if ( (LA127_0==RULE_ID||LA127_0==15||LA127_0==37) ) {
            alt127=1;
        }
        switch (alt127) {
            case 1 :
                // InternalSqlQueryDsl.g:4817:8: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // InternalSqlQueryDsl.g:4817:8: ( ( ruleJvmFormalParameter ) )
                // InternalSqlQueryDsl.g:4818:9: ( ruleJvmFormalParameter )
                {
                // InternalSqlQueryDsl.g:4818:9: ( ruleJvmFormalParameter )
                // InternalSqlQueryDsl.g:4819:10: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_44);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalSqlQueryDsl.g:4822:8: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop126:
                do {
                    int alt126=2;
                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==16) ) {
                        alt126=1;
                    }


                    switch (alt126) {
                	case 1 :
                	    // InternalSqlQueryDsl.g:4823:9: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,16,FOLLOW_8); if (state.failed) return ;
                	    // InternalSqlQueryDsl.g:4824:9: ( ( ruleJvmFormalParameter ) )
                	    // InternalSqlQueryDsl.g:4825:10: ( ruleJvmFormalParameter )
                	    {
                	    // InternalSqlQueryDsl.g:4825:10: ( ruleJvmFormalParameter )
                	    // InternalSqlQueryDsl.g:4826:11: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_44);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop126;
                    }
                } while (true);


                }
                break;

        }

        // InternalSqlQueryDsl.g:4831:7: ( ( '|' ) )
        // InternalSqlQueryDsl.g:4832:8: ( '|' )
        {
        // InternalSqlQueryDsl.g:4832:8: ( '|' )
        // InternalSqlQueryDsl.g:4833:9: '|'
        {
        match(input,58,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred35_InternalSqlQueryDsl

    // $ANTLR start synpred36_InternalSqlQueryDsl
    public final void synpred36_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:4910:4: ( ( () '[' ) )
        // InternalSqlQueryDsl.g:4910:5: ( () '[' )
        {
        // InternalSqlQueryDsl.g:4910:5: ( () '[' )
        // InternalSqlQueryDsl.g:4911:5: () '['
        {
        // InternalSqlQueryDsl.g:4911:5: ()
        // InternalSqlQueryDsl.g:4912:5: 
        {
        }

        match(input,56,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred36_InternalSqlQueryDsl

    // $ANTLR start synpred37_InternalSqlQueryDsl
    public final void synpred37_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:5253:4: ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )
        // InternalSqlQueryDsl.g:
        {
        if ( (input.LA(1)>=RULE_STRING && input.LA(1)<=RULE_DECIMAL)||input.LA(1)==15||input.LA(1)==24||(input.LA(1)>=40 && input.LA(1)<=41)||input.LA(1)==46||(input.LA(1)>=53 && input.LA(1)<=54)||input.LA(1)==56||input.LA(1)==60||input.LA(1)==62||(input.LA(1)>=66 && input.LA(1)<=68)||(input.LA(1)>=71 && input.LA(1)<=83)||input.LA(1)==85 ) {
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
    // $ANTLR end synpred37_InternalSqlQueryDsl

    // $ANTLR start synpred38_InternalSqlQueryDsl
    public final void synpred38_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:5324:6: ( 'catch' )
        // InternalSqlQueryDsl.g:5324:7: 'catch'
        {
        match(input,86,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_InternalSqlQueryDsl

    // $ANTLR start synpred39_InternalSqlQueryDsl
    public final void synpred39_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:5345:7: ( 'finally' )
        // InternalSqlQueryDsl.g:5345:8: 'finally'
        {
        match(input,84,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalSqlQueryDsl

    // $ANTLR start synpred42_InternalSqlQueryDsl
    public final void synpred42_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:5589:5: ( '.' )
        // InternalSqlQueryDsl.g:5589:6: '.'
        {
        match(input,50,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_InternalSqlQueryDsl

    // $ANTLR start synpred43_InternalSqlQueryDsl
    public final void synpred43_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:5715:5: ( ( () ruleArrayBrackets ) )
        // InternalSqlQueryDsl.g:5715:6: ( () ruleArrayBrackets )
        {
        // InternalSqlQueryDsl.g:5715:6: ( () ruleArrayBrackets )
        // InternalSqlQueryDsl.g:5716:6: () ruleArrayBrackets
        {
        // InternalSqlQueryDsl.g:5716:6: ()
        // InternalSqlQueryDsl.g:5717:6: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleArrayBrackets();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred43_InternalSqlQueryDsl

    // $ANTLR start synpred44_InternalSqlQueryDsl
    public final void synpred44_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:5912:5: ( '<' )
        // InternalSqlQueryDsl.g:5912:6: '<'
        {
        match(input,24,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_InternalSqlQueryDsl

    // $ANTLR start synpred45_InternalSqlQueryDsl
    public final void synpred45_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:5968:6: ( ( () '.' ) )
        // InternalSqlQueryDsl.g:5968:7: ( () '.' )
        {
        // InternalSqlQueryDsl.g:5968:7: ( () '.' )
        // InternalSqlQueryDsl.g:5969:7: () '.'
        {
        // InternalSqlQueryDsl.g:5969:7: ()
        // InternalSqlQueryDsl.g:5970:7: 
        {
        }

        match(input,50,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred45_InternalSqlQueryDsl

    // $ANTLR start synpred46_InternalSqlQueryDsl
    public final void synpred46_InternalSqlQueryDsl_fragment() throws RecognitionException {   
        // InternalSqlQueryDsl.g:6006:7: ( '<' )
        // InternalSqlQueryDsl.g:6006:8: '<'
        {
        match(input,24,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_InternalSqlQueryDsl

    // Delegated rules

    public final boolean synpred36_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalSqlQueryDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalSqlQueryDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA81 dfa81 = new DFA81(this);
    protected DFA84 dfa84 = new DFA84(this);
    protected DFA83 dfa83 = new DFA83(this);
    protected DFA85 dfa85 = new DFA85(this);
    protected DFA88 dfa88 = new DFA88(this);
    protected DFA106 dfa106 = new DFA106(this);
    protected DFA104 dfa104 = new DFA104(this);
    protected DFA113 dfa113 = new DFA113(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\10\11\uffff";
    static final String dfa_3s = "\1\5\7\0\2\uffff";
    static final String dfa_4s = "\1\126\7\0\2\uffff";
    static final String dfa_5s = "\10\uffff\1\2\1\1";
    static final String dfa_6s = "\1\uffff\1\2\1\3\1\4\1\5\1\6\1\0\1\1\2\uffff}>";
    static final String[] dfa_7s = {
            "\5\10\5\uffff\3\10\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\40\10\1\uffff\34\10",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "450:4: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_6 = input.LA(1);

                         
                        int index6_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSqlQueryDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_7 = input.LA(1);

                         
                        int index6_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSqlQueryDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA6_1 = input.LA(1);

                         
                        int index6_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSqlQueryDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_1);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA6_2 = input.LA(1);

                         
                        int index6_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSqlQueryDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_2);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA6_3 = input.LA(1);

                         
                        int index6_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSqlQueryDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_3);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA6_4 = input.LA(1);

                         
                        int index6_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSqlQueryDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA6_5 = input.LA(1);

                         
                        int index6_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSqlQueryDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\13\uffff";
    static final String dfa_9s = "\1\1\12\uffff";
    static final String dfa_10s = "\1\5\1\uffff\10\0\1\uffff";
    static final String dfa_11s = "\1\126\1\uffff\10\0\1\uffff";
    static final String dfa_12s = "\1\uffff\1\2\10\uffff\1\1";
    static final String dfa_13s = "\2\uffff\1\4\1\1\1\6\1\7\1\0\1\5\1\2\1\3\1\uffff}>";
    static final String[] dfa_14s = {
            "\5\1\5\uffff\3\1\1\uffff\5\1\1\2\1\3\10\1\1\4\1\5\1\6\1\7\1\10\1\11\22\1\1\uffff\34\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 1164:3: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_6 = input.LA(1);

                         
                        int index16_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalSqlQueryDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_3 = input.LA(1);

                         
                        int index16_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalSqlQueryDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_8 = input.LA(1);

                         
                        int index16_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalSqlQueryDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_9 = input.LA(1);

                         
                        int index16_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalSqlQueryDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_2 = input.LA(1);

                         
                        int index16_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalSqlQueryDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_2);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_7 = input.LA(1);

                         
                        int index16_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalSqlQueryDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA16_4 = input.LA(1);

                         
                        int index16_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalSqlQueryDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_4);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA16_5 = input.LA(1);

                         
                        int index16_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalSqlQueryDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_15s = "\1\30\2\uffff\1\31\7\uffff";
    static final String dfa_16s = "\1\47\2\uffff\1\44\7\uffff";
    static final String dfa_17s = "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\7\1\10\1\11\1\3\1\6";
    static final String dfa_18s = "\13\uffff}>";
    static final String[] dfa_19s = {
            "\1\6\1\3\10\uffff\1\1\1\2\1\4\1\5\1\7\1\10",
            "",
            "",
            "\1\12\12\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1240:2: (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' ) ) | kw= '<>' | kw= '?:' )";
        }
    }
    static final String dfa_20s = "\116\uffff";
    static final String dfa_21s = "\1\2\115\uffff";
    static final String dfa_22s = "\1\5\1\0\114\uffff";
    static final String dfa_23s = "\1\126\1\0\114\uffff";
    static final String dfa_24s = "\2\uffff\1\2\112\uffff\1\1";
    static final String dfa_25s = "\1\uffff\1\0\114\uffff}>";
    static final String[] dfa_26s = {
            "\5\2\5\uffff\1\1\2\2\1\uffff\47\2\1\uffff\34\2",
            "\1\uffff",
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
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "2141:5: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_1 = input.LA(1);

                         
                        int index35_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index35_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_27s = "\44\uffff";
    static final String dfa_28s = "\1\5\2\0\41\uffff";
    static final String dfa_29s = "\1\125\2\0\41\uffff";
    static final String dfa_30s = "\3\uffff\2\1\1\2\35\uffff\1\3";
    static final String dfa_31s = "\1\0\1\1\1\2\41\uffff}>";
    static final String[] dfa_32s = {
            "\1\5\1\1\3\5\5\uffff\1\2\1\uffff\1\43\6\uffff\1\5\14\uffff\1\3\2\uffff\2\5\4\uffff\1\5\6\uffff\2\5\1\uffff\1\5\1\uffff\1\4\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5\2\uffff\15\5\1\uffff\1\5",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "2160:6: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_0 = input.LA(1);

                         
                        int index34_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_0==RULE_ID) ) {s = 1;}

                        else if ( (LA34_0==15) ) {s = 2;}

                        else if ( (LA34_0==37) && (synpred17_InternalSqlQueryDsl())) {s = 3;}

                        else if ( (LA34_0==58) && (synpred17_InternalSqlQueryDsl())) {s = 4;}

                        else if ( (LA34_0==RULE_STRING||(LA34_0>=RULE_HEX && LA34_0<=RULE_DECIMAL)||LA34_0==24||(LA34_0>=40 && LA34_0<=41)||LA34_0==46||(LA34_0>=53 && LA34_0<=54)||LA34_0==56||LA34_0==60||LA34_0==62||(LA34_0>=66 && LA34_0<=68)||(LA34_0>=71 && LA34_0<=83)||LA34_0==85) ) {s = 5;}

                        else if ( (LA34_0==17) ) {s = 35;}

                         
                        input.seek(index34_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSqlQueryDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_2 = input.LA(1);

                         
                        int index34_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSqlQueryDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index34_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String[] dfa_33s = {
            "\5\2\5\uffff\3\2\1\uffff\45\2\1\1\1\2\1\uffff\34\2",
            "\1\uffff",
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
            "",
            "",
            "",
            ""
    };
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "2258:5: ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_1 = input.LA(1);

                         
                        int index36_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index36_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_34s = "\40\uffff";
    static final String dfa_35s = "\1\5\26\uffff\1\0\10\uffff";
    static final String dfa_36s = "\1\125\26\uffff\1\0\10\uffff";
    static final String dfa_37s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\6\uffff\1\6\11\uffff\1\7\1\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\10\1\11";
    static final String dfa_38s = "\1\0\26\uffff\1\1\10\uffff}>";
    static final String[] dfa_39s = {
            "\1\14\1\5\3\14\5\uffff\1\35\10\uffff\1\5\34\uffff\1\14\1\2\1\uffff\1\14\3\uffff\1\26\1\uffff\1\3\3\uffff\1\27\1\30\1\31\2\uffff\5\5\1\1\4\14\1\32\1\33\1\34\1\uffff\1\4",
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
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[][] dfa_39 = unpackEncodedStringArray(dfa_39s);

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_34;
            this.eof = dfa_34;
            this.min = dfa_35;
            this.max = dfa_36;
            this.accept = dfa_37;
            this.special = dfa_38;
            this.transition = dfa_39;
        }
        public String getDescription() {
            return "2303:2: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | ( ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression ) | this_XFeatureCall_4= ruleXFeatureCall | this_XLiteral_5= ruleXLiteral | this_XIfExpression_6= ruleXIfExpression | ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression ) | this_XBasicForLoopExpression_8= ruleXBasicForLoopExpression | this_XWhileExpression_9= ruleXWhileExpression | this_XDoWhileExpression_10= ruleXDoWhileExpression | this_XThrowExpression_11= ruleXThrowExpression | this_XReturnExpression_12= ruleXReturnExpression | this_XTryCatchFinallyExpression_13= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_14= ruleXParenthesizedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_0 = input.LA(1);

                         
                        int index38_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA38_0==76) ) {s = 1;}

                        else if ( (LA38_0==54) ) {s = 2;}

                        else if ( (LA38_0==62) ) {s = 3;}

                        else if ( (LA38_0==85) && (synpred19_InternalSqlQueryDsl())) {s = 4;}

                        else if ( (LA38_0==RULE_ID||LA38_0==24||(LA38_0>=71 && LA38_0<=75)) ) {s = 5;}

                        else if ( (LA38_0==RULE_STRING||(LA38_0>=RULE_HEX && LA38_0<=RULE_DECIMAL)||LA38_0==53||LA38_0==56||(LA38_0>=77 && LA38_0<=80)) ) {s = 12;}

                        else if ( (LA38_0==60) ) {s = 22;}

                        else if ( (LA38_0==66) ) {s = 23;}

                        else if ( (LA38_0==67) ) {s = 24;}

                        else if ( (LA38_0==68) ) {s = 25;}

                        else if ( (LA38_0==81) ) {s = 26;}

                        else if ( (LA38_0==82) ) {s = 27;}

                        else if ( (LA38_0==83) ) {s = 28;}

                        else if ( (LA38_0==15) ) {s = 29;}

                         
                        input.seek(index38_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_23 = input.LA(1);

                         
                        int index38_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSqlQueryDsl()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index38_23);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_40s = "\46\uffff";
    static final String dfa_41s = "\1\5\2\0\43\uffff";
    static final String dfa_42s = "\1\125\2\0\43\uffff";
    static final String dfa_43s = "\3\uffff\2\1\1\2\40\uffff";
    static final String dfa_44s = "\1\0\1\1\1\2\43\uffff}>";
    static final String[] dfa_45s = {
            "\1\5\1\1\3\5\5\uffff\1\2\10\uffff\1\5\14\uffff\1\3\2\uffff\2\5\4\uffff\1\5\6\uffff\2\5\1\uffff\2\5\1\4\1\uffff\1\5\1\uffff\1\5\3\uffff\22\5\1\uffff\1\5",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final char[] dfa_42 = DFA.unpackEncodedStringToUnsignedChars(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[][] dfa_45 = unpackEncodedStringArray(dfa_45s);

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = dfa_40;
            this.eof = dfa_40;
            this.min = dfa_41;
            this.max = dfa_42;
            this.accept = dfa_43;
            this.special = dfa_44;
            this.transition = dfa_45;
        }
        public String getDescription() {
            return "2795:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_0 = input.LA(1);

                         
                        int index47_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA47_0==RULE_ID) ) {s = 1;}

                        else if ( (LA47_0==15) ) {s = 2;}

                        else if ( (LA47_0==37) && (synpred23_InternalSqlQueryDsl())) {s = 3;}

                        else if ( (LA47_0==58) && (synpred23_InternalSqlQueryDsl())) {s = 4;}

                        else if ( (LA47_0==RULE_STRING||(LA47_0>=RULE_HEX && LA47_0<=RULE_DECIMAL)||LA47_0==24||(LA47_0>=40 && LA47_0<=41)||LA47_0==46||(LA47_0>=53 && LA47_0<=54)||(LA47_0>=56 && LA47_0<=57)||LA47_0==60||LA47_0==62||(LA47_0>=66 && LA47_0<=83)||LA47_0==85) ) {s = 5;}

                         
                        input.seek(index47_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA47_1 = input.LA(1);

                         
                        int index47_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalSqlQueryDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index47_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA47_2 = input.LA(1);

                         
                        int index47_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalSqlQueryDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index47_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 47, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_46s = "\43\uffff";
    static final String dfa_47s = "\1\5\1\0\41\uffff";
    static final String dfa_48s = "\1\125\1\0\41\uffff";
    static final String dfa_49s = "\2\uffff\1\2\37\uffff\1\1";
    static final String dfa_50s = "\1\uffff\1\0\41\uffff}>";
    static final String[] dfa_51s = {
            "\5\2\5\uffff\1\1\10\uffff\1\2\14\uffff\1\2\2\uffff\2\2\4\uffff\1\2\6\uffff\2\2\1\uffff\1\2\3\uffff\1\2\1\uffff\1\2\3\uffff\3\2\2\uffff\15\2\1\uffff\1\2",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final char[] dfa_47 = DFA.unpackEncodedStringToUnsignedChars(dfa_47s);
    static final char[] dfa_48 = DFA.unpackEncodedStringToUnsignedChars(dfa_48s);
    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[][] dfa_51 = unpackEncodedStringArray(dfa_51s);

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = dfa_46;
            this.eof = dfa_46;
            this.min = dfa_47;
            this.max = dfa_48;
            this.accept = dfa_49;
            this.special = dfa_50;
            this.transition = dfa_51;
        }
        public String getDescription() {
            return "3261:3: ( ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' ) | ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_1 = input.LA(1);

                         
                        int index54_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSqlQueryDsl()) ) {s = 34;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index54_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_52s = "\42\uffff";
    static final String dfa_53s = "\1\5\2\0\37\uffff";
    static final String dfa_54s = "\1\125\2\0\37\uffff";
    static final String dfa_55s = "\3\uffff\1\1\1\2\35\uffff";
    static final String dfa_56s = "\1\0\1\1\1\2\37\uffff}>";
    static final String[] dfa_57s = {
            "\1\4\1\1\3\4\5\uffff\1\2\10\uffff\1\4\14\uffff\1\3\2\uffff\2\4\4\uffff\1\4\6\uffff\2\4\1\uffff\1\4\3\uffff\1\4\1\uffff\1\4\3\uffff\3\4\2\uffff\15\4\1\uffff\1\4",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final char[] dfa_53 = DFA.unpackEncodedStringToUnsignedChars(dfa_53s);
    static final char[] dfa_54 = DFA.unpackEncodedStringToUnsignedChars(dfa_54s);
    static final short[] dfa_55 = DFA.unpackEncodedString(dfa_55s);
    static final short[] dfa_56 = DFA.unpackEncodedString(dfa_56s);
    static final short[][] dfa_57 = unpackEncodedStringArray(dfa_57s);

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = dfa_52;
            this.eof = dfa_52;
            this.min = dfa_53;
            this.max = dfa_54;
            this.accept = dfa_55;
            this.special = dfa_56;
            this.transition = dfa_57;
        }
        public String getDescription() {
            return "3330:5: ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_0 = input.LA(1);

                         
                        int index53_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA53_0==RULE_ID) ) {s = 1;}

                        else if ( (LA53_0==15) ) {s = 2;}

                        else if ( (LA53_0==37) && (synpred27_InternalSqlQueryDsl())) {s = 3;}

                        else if ( (LA53_0==RULE_STRING||(LA53_0>=RULE_HEX && LA53_0<=RULE_DECIMAL)||LA53_0==24||(LA53_0>=40 && LA53_0<=41)||LA53_0==46||(LA53_0>=53 && LA53_0<=54)||LA53_0==56||LA53_0==60||LA53_0==62||(LA53_0>=66 && LA53_0<=68)||(LA53_0>=71 && LA53_0<=83)||LA53_0==85) ) {s = 4;}

                         
                        input.seek(index53_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA53_1 = input.LA(1);

                         
                        int index53_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSqlQueryDsl()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index53_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA53_2 = input.LA(1);

                         
                        int index53_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSqlQueryDsl()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index53_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "4459:3: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA76_1 = input.LA(1);

                         
                        int index76_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index76_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 76, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "4478:4: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA75_0 = input.LA(1);

                         
                        int index75_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA75_0==RULE_ID) ) {s = 1;}

                        else if ( (LA75_0==15) ) {s = 2;}

                        else if ( (LA75_0==37) && (synpred31_InternalSqlQueryDsl())) {s = 3;}

                        else if ( (LA75_0==58) && (synpred31_InternalSqlQueryDsl())) {s = 4;}

                        else if ( (LA75_0==RULE_STRING||(LA75_0>=RULE_HEX && LA75_0<=RULE_DECIMAL)||LA75_0==24||(LA75_0>=40 && LA75_0<=41)||LA75_0==46||(LA75_0>=53 && LA75_0<=54)||LA75_0==56||LA75_0==60||LA75_0==62||(LA75_0>=66 && LA75_0<=68)||(LA75_0>=71 && LA75_0<=83)||LA75_0==85) ) {s = 5;}

                        else if ( (LA75_0==17) ) {s = 35;}

                         
                        input.seek(index75_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA75_1 = input.LA(1);

                         
                        int index75_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalSqlQueryDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index75_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA75_2 = input.LA(1);

                         
                        int index75_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalSqlQueryDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index75_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 75, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "4576:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA77_1 = input.LA(1);

                         
                        int index77_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index77_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 77, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String[] dfa_58s = {
            "\5\2\5\uffff\3\2\1\uffff\5\2\1\1\41\2\1\uffff\34\2",
            "\1\uffff",
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
            "",
            "",
            "",
            ""
    };
    static final short[][] dfa_58 = unpackEncodedStringArray(dfa_58s);

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_58;
        }
        public String getDescription() {
            return "4735:3: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA81_1 = input.LA(1);

                         
                        int index81_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index81_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 81, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "4792:3: ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA84_1 = input.LA(1);

                         
                        int index84_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index84_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 84, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "4811:4: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA83_0 = input.LA(1);

                         
                        int index83_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA83_0==RULE_ID) ) {s = 1;}

                        else if ( (LA83_0==15) ) {s = 2;}

                        else if ( (LA83_0==37) && (synpred35_InternalSqlQueryDsl())) {s = 3;}

                        else if ( (LA83_0==58) && (synpred35_InternalSqlQueryDsl())) {s = 4;}

                        else if ( (LA83_0==RULE_STRING||(LA83_0>=RULE_HEX && LA83_0<=RULE_DECIMAL)||LA83_0==24||(LA83_0>=40 && LA83_0<=41)||LA83_0==46||(LA83_0>=53 && LA83_0<=54)||LA83_0==56||LA83_0==60||LA83_0==62||(LA83_0>=66 && LA83_0<=68)||(LA83_0>=71 && LA83_0<=83)||LA83_0==85) ) {s = 5;}

                        else if ( (LA83_0==17) ) {s = 35;}

                         
                        input.seek(index83_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA83_1 = input.LA(1);

                         
                        int index83_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalSqlQueryDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index83_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA83_2 = input.LA(1);

                         
                        int index83_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalSqlQueryDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index83_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 83, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA85 extends DFA {

        public DFA85(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 85;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "4909:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA85_1 = input.LA(1);

                         
                        int index85_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index85_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 85, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_59s = "\1\41\115\uffff";
    static final String dfa_60s = "\1\5\40\0\55\uffff";
    static final String dfa_61s = "\1\126\40\0\55\uffff";
    static final String dfa_62s = "\41\uffff\1\2\53\uffff\1\1";
    static final String dfa_63s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\55\uffff}>";
    static final String[] dfa_64s = {
            "\1\27\1\1\1\23\1\24\1\25\5\uffff\1\40\2\41\1\uffff\5\41\1\15\17\41\1\10\1\7\4\41\1\6\6\41\1\17\1\12\1\41\1\20\1\41\1\uffff\1\41\1\31\1\41\1\13\3\41\1\32\1\33\1\34\2\41\1\2\1\3\1\4\1\5\1\16\1\11\1\21\1\22\1\26\1\30\1\35\1\36\1\37\1\41\1\14\1\41",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_59 = DFA.unpackEncodedString(dfa_59s);
    static final char[] dfa_60 = DFA.unpackEncodedStringToUnsignedChars(dfa_60s);
    static final char[] dfa_61 = DFA.unpackEncodedStringToUnsignedChars(dfa_61s);
    static final short[] dfa_62 = DFA.unpackEncodedString(dfa_62s);
    static final short[] dfa_63 = DFA.unpackEncodedString(dfa_63s);
    static final short[][] dfa_64 = unpackEncodedStringArray(dfa_64s);

    class DFA88 extends DFA {

        public DFA88(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 88;
            this.eot = dfa_20;
            this.eof = dfa_59;
            this.min = dfa_60;
            this.max = dfa_61;
            this.accept = dfa_62;
            this.special = dfa_63;
            this.transition = dfa_64;
        }
        public String getDescription() {
            return "5252:3: ( ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA88_1 = input.LA(1);

                         
                        int index88_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA88_2 = input.LA(1);

                         
                        int index88_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA88_3 = input.LA(1);

                         
                        int index88_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA88_4 = input.LA(1);

                         
                        int index88_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA88_5 = input.LA(1);

                         
                        int index88_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA88_6 = input.LA(1);

                         
                        int index88_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA88_7 = input.LA(1);

                         
                        int index88_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA88_8 = input.LA(1);

                         
                        int index88_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA88_9 = input.LA(1);

                         
                        int index88_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA88_10 = input.LA(1);

                         
                        int index88_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA88_11 = input.LA(1);

                         
                        int index88_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA88_12 = input.LA(1);

                         
                        int index88_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA88_13 = input.LA(1);

                         
                        int index88_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA88_14 = input.LA(1);

                         
                        int index88_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA88_15 = input.LA(1);

                         
                        int index88_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA88_16 = input.LA(1);

                         
                        int index88_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA88_17 = input.LA(1);

                         
                        int index88_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA88_18 = input.LA(1);

                         
                        int index88_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA88_19 = input.LA(1);

                         
                        int index88_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA88_20 = input.LA(1);

                         
                        int index88_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA88_21 = input.LA(1);

                         
                        int index88_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA88_22 = input.LA(1);

                         
                        int index88_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA88_23 = input.LA(1);

                         
                        int index88_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA88_24 = input.LA(1);

                         
                        int index88_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA88_25 = input.LA(1);

                         
                        int index88_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA88_26 = input.LA(1);

                         
                        int index88_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA88_27 = input.LA(1);

                         
                        int index88_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA88_28 = input.LA(1);

                         
                        int index88_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA88_29 = input.LA(1);

                         
                        int index88_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA88_30 = input.LA(1);

                         
                        int index88_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA88_31 = input.LA(1);

                         
                        int index88_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA88_32 = input.LA(1);

                         
                        int index88_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSqlQueryDsl()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index88_32);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 88, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_65s = "\117\uffff";
    static final String dfa_66s = "\1\2\116\uffff";
    static final String dfa_67s = "\1\5\1\0\115\uffff";
    static final String dfa_68s = "\1\130\1\0\115\uffff";
    static final String dfa_69s = "\2\uffff\1\2\113\uffff\1\1";
    static final String dfa_70s = "\1\uffff\1\0\115\uffff}>";
    static final String[] dfa_71s = {
            "\5\2\5\uffff\3\2\1\uffff\5\2\1\1\41\2\1\uffff\34\2\1\uffff\1\2",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_65 = DFA.unpackEncodedString(dfa_65s);
    static final short[] dfa_66 = DFA.unpackEncodedString(dfa_66s);
    static final char[] dfa_67 = DFA.unpackEncodedStringToUnsignedChars(dfa_67s);
    static final char[] dfa_68 = DFA.unpackEncodedStringToUnsignedChars(dfa_68s);
    static final short[] dfa_69 = DFA.unpackEncodedString(dfa_69s);
    static final short[] dfa_70 = DFA.unpackEncodedString(dfa_70s);
    static final short[][] dfa_71 = unpackEncodedStringArray(dfa_71s);

    class DFA106 extends DFA {

        public DFA106(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 106;
            this.eot = dfa_65;
            this.eof = dfa_66;
            this.min = dfa_67;
            this.max = dfa_68;
            this.accept = dfa_69;
            this.special = dfa_70;
            this.transition = dfa_71;
        }
        public String getDescription() {
            return "5910:3: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA106_1 = input.LA(1);

                         
                        int index106_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSqlQueryDsl()) ) {s = 78;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index106_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 106, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA104 extends DFA {

        public DFA104(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 104;
            this.eot = dfa_65;
            this.eof = dfa_66;
            this.min = dfa_67;
            this.max = dfa_68;
            this.accept = dfa_69;
            this.special = dfa_70;
            this.transition = dfa_71;
        }
        public String getDescription() {
            return "6004:5: ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA104_1 = input.LA(1);

                         
                        int index104_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalSqlQueryDsl()) ) {s = 78;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index104_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 104, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_72s = "\7\uffff";
    static final String dfa_73s = "\2\uffff\1\4\3\uffff\1\4";
    static final String dfa_74s = "\1\6\1\uffff\1\62\1\6\2\uffff\1\62";
    static final String dfa_75s = "\1\110\1\uffff\1\73\1\52\2\uffff\1\73";
    static final String dfa_76s = "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff";
    static final String dfa_77s = "\7\uffff}>";
    static final String[] dfa_78s = {
            "\1\2\101\uffff\1\1",
            "",
            "\1\3\10\uffff\1\4",
            "\1\6\43\uffff\1\5",
            "",
            "",
            "\1\3\10\uffff\1\4"
    };

    static final short[] dfa_72 = DFA.unpackEncodedString(dfa_72s);
    static final short[] dfa_73 = DFA.unpackEncodedString(dfa_73s);
    static final char[] dfa_74 = DFA.unpackEncodedStringToUnsignedChars(dfa_74s);
    static final char[] dfa_75 = DFA.unpackEncodedStringToUnsignedChars(dfa_75s);
    static final short[] dfa_76 = DFA.unpackEncodedString(dfa_76s);
    static final short[] dfa_77 = DFA.unpackEncodedString(dfa_77s);
    static final short[][] dfa_78 = unpackEncodedStringArray(dfa_78s);

    class DFA113 extends DFA {

        public DFA113(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 113;
            this.eot = dfa_72;
            this.eof = dfa_73;
            this.min = dfa_74;
            this.max = dfa_75;
            this.accept = dfa_76;
            this.special = dfa_77;
            this.transition = dfa_78;
        }
        public String getDescription() {
            return "6466:3: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000002000028040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002000008040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x51604300010083E0L,0x00000000002FFF9CL});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003F80002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000001E0000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000207000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000FC03000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00003C0000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x001C000000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000780L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000001000040L,0x0000000000000F80L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000008040L,0x0000000000800000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x011C000000008002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x55604320010283E0L,0x00000000002FFF9CL});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x011C000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x51E04300010083E0L,0x00000000002FFF9CL});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0080000000010000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x53604300010083E0L,0x00000000002FFF9CL});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0200000000010000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x57604320010083E0L,0x00000000002FFFFCL});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0400000000010000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x53604300010083E0L,0x00000000002FFFFCL});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x59604300010083E2L,0x00000000002FFFFCL});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x51604300010083E2L,0x00000000002FFFFCL});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x51604320010083E0L,0x00000000002FFF9CL});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x8080002000018040L,0x0000000000000003L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x8000000000010000L,0x0000000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x8000000000010000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x59604300010083E0L,0x00000000002FFFFCL});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0800000000010000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x51604300010083E0L,0x00000000002FFFFCL});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x59604300010083E0L,0x00000000002FFF9CL});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x51604300010283E0L,0x00000000002FFF9CL});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x51E04300010083E0L,0x00000000002FFFFCL});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x59E04300010083E0L,0x00000000002FFFFCL});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0100000000008002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0100000001008002L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0100000000020000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x51604300010083E2L,0x00000000002FFF9CL});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000500000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000002L,0x0000000000500000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0004000001000002L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000880L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000400L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000042L});

}