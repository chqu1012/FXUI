package de.dc.fx.ui.model.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.dc.fx.ui.model.services.FXDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFXDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'hasFilter'", "'hasSorter'", "'FXTableView'", "'{'", "'packagePath'", "'}'", "'editable'", "'useCustomCellFactory'", "'FXColumn'", "'width'", "'alignment'", "'associatedFXProperty'", "'FXModel'", "'-'", "'.'", "'E'", "'e'", "'TOP_LEFT'", "'TOP_CENTER'", "'TOP_RIGHT'", "'CENTER_LEFT'", "'CENTER'", "'CENTER_RIGHT'", "'BOTTOM_LEFT'", "'BOTTOM_CENTER'", "'BOTTOM_RIGHT'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFXDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFXDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFXDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFXDsl.g"; }



     	private FXDslGrammarAccess grammarAccess;

        public InternalFXDslParser(TokenStream input, FXDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "FXTableView";
       	}

       	@Override
       	protected FXDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFXTableView"
    // InternalFXDsl.g:65:1: entryRuleFXTableView returns [EObject current=null] : iv_ruleFXTableView= ruleFXTableView EOF ;
    public final EObject entryRuleFXTableView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFXTableView = null;


        try {
            // InternalFXDsl.g:65:52: (iv_ruleFXTableView= ruleFXTableView EOF )
            // InternalFXDsl.g:66:2: iv_ruleFXTableView= ruleFXTableView EOF
            {
             newCompositeNode(grammarAccess.getFXTableViewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFXTableView=ruleFXTableView();

            state._fsp--;

             current =iv_ruleFXTableView; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFXTableView"


    // $ANTLR start "ruleFXTableView"
    // InternalFXDsl.g:72:1: ruleFXTableView returns [EObject current=null] : ( () ( (lv_hasFilter_1_0= 'hasFilter' ) )? ( (lv_hasSorter_2_0= 'hasSorter' ) )? otherlv_3= 'FXTableView' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'packagePath' ( (lv_packagePath_7_0= ruleEString ) ) )? ( ( (lv_fxColumns_8_0= ruleFXColumn ) ) ( (lv_fxColumns_9_0= ruleFXColumn ) )* )? ( (lv_fxEntity_10_0= ruleFXModel ) )? otherlv_11= '}' ) ;
    public final EObject ruleFXTableView() throws RecognitionException {
        EObject current = null;

        Token lv_hasFilter_1_0=null;
        Token lv_hasSorter_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_packagePath_7_0 = null;

        EObject lv_fxColumns_8_0 = null;

        EObject lv_fxColumns_9_0 = null;

        EObject lv_fxEntity_10_0 = null;



        	enterRule();

        try {
            // InternalFXDsl.g:78:2: ( ( () ( (lv_hasFilter_1_0= 'hasFilter' ) )? ( (lv_hasSorter_2_0= 'hasSorter' ) )? otherlv_3= 'FXTableView' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'packagePath' ( (lv_packagePath_7_0= ruleEString ) ) )? ( ( (lv_fxColumns_8_0= ruleFXColumn ) ) ( (lv_fxColumns_9_0= ruleFXColumn ) )* )? ( (lv_fxEntity_10_0= ruleFXModel ) )? otherlv_11= '}' ) )
            // InternalFXDsl.g:79:2: ( () ( (lv_hasFilter_1_0= 'hasFilter' ) )? ( (lv_hasSorter_2_0= 'hasSorter' ) )? otherlv_3= 'FXTableView' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'packagePath' ( (lv_packagePath_7_0= ruleEString ) ) )? ( ( (lv_fxColumns_8_0= ruleFXColumn ) ) ( (lv_fxColumns_9_0= ruleFXColumn ) )* )? ( (lv_fxEntity_10_0= ruleFXModel ) )? otherlv_11= '}' )
            {
            // InternalFXDsl.g:79:2: ( () ( (lv_hasFilter_1_0= 'hasFilter' ) )? ( (lv_hasSorter_2_0= 'hasSorter' ) )? otherlv_3= 'FXTableView' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'packagePath' ( (lv_packagePath_7_0= ruleEString ) ) )? ( ( (lv_fxColumns_8_0= ruleFXColumn ) ) ( (lv_fxColumns_9_0= ruleFXColumn ) )* )? ( (lv_fxEntity_10_0= ruleFXModel ) )? otherlv_11= '}' )
            // InternalFXDsl.g:80:3: () ( (lv_hasFilter_1_0= 'hasFilter' ) )? ( (lv_hasSorter_2_0= 'hasSorter' ) )? otherlv_3= 'FXTableView' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'packagePath' ( (lv_packagePath_7_0= ruleEString ) ) )? ( ( (lv_fxColumns_8_0= ruleFXColumn ) ) ( (lv_fxColumns_9_0= ruleFXColumn ) )* )? ( (lv_fxEntity_10_0= ruleFXModel ) )? otherlv_11= '}'
            {
            // InternalFXDsl.g:80:3: ()
            // InternalFXDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFXTableViewAccess().getFXTableViewAction_0(),
            					current);
            			

            }

            // InternalFXDsl.g:87:3: ( (lv_hasFilter_1_0= 'hasFilter' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalFXDsl.g:88:4: (lv_hasFilter_1_0= 'hasFilter' )
                    {
                    // InternalFXDsl.g:88:4: (lv_hasFilter_1_0= 'hasFilter' )
                    // InternalFXDsl.g:89:5: lv_hasFilter_1_0= 'hasFilter'
                    {
                    lv_hasFilter_1_0=(Token)match(input,11,FOLLOW_3); 

                    					newLeafNode(lv_hasFilter_1_0, grammarAccess.getFXTableViewAccess().getHasFilterHasFilterKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFXTableViewRule());
                    					}
                    					setWithLastConsumed(current, "hasFilter", true, "hasFilter");
                    				

                    }


                    }
                    break;

            }

            // InternalFXDsl.g:101:3: ( (lv_hasSorter_2_0= 'hasSorter' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalFXDsl.g:102:4: (lv_hasSorter_2_0= 'hasSorter' )
                    {
                    // InternalFXDsl.g:102:4: (lv_hasSorter_2_0= 'hasSorter' )
                    // InternalFXDsl.g:103:5: lv_hasSorter_2_0= 'hasSorter'
                    {
                    lv_hasSorter_2_0=(Token)match(input,12,FOLLOW_4); 

                    					newLeafNode(lv_hasSorter_2_0, grammarAccess.getFXTableViewAccess().getHasSorterHasSorterKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFXTableViewRule());
                    					}
                    					setWithLastConsumed(current, "hasSorter", true, "hasSorter");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getFXTableViewAccess().getFXTableViewKeyword_3());
            		
            // InternalFXDsl.g:119:3: ( (lv_name_4_0= ruleEString ) )
            // InternalFXDsl.g:120:4: (lv_name_4_0= ruleEString )
            {
            // InternalFXDsl.g:120:4: (lv_name_4_0= ruleEString )
            // InternalFXDsl.g:121:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFXTableViewAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFXTableViewRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"de.dc.fx.ui.model.FXDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getFXTableViewAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalFXDsl.g:142:3: (otherlv_6= 'packagePath' ( (lv_packagePath_7_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalFXDsl.g:143:4: otherlv_6= 'packagePath' ( (lv_packagePath_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getFXTableViewAccess().getPackagePathKeyword_6_0());
                    			
                    // InternalFXDsl.g:147:4: ( (lv_packagePath_7_0= ruleEString ) )
                    // InternalFXDsl.g:148:5: (lv_packagePath_7_0= ruleEString )
                    {
                    // InternalFXDsl.g:148:5: (lv_packagePath_7_0= ruleEString )
                    // InternalFXDsl.g:149:6: lv_packagePath_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFXTableViewAccess().getPackagePathEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_packagePath_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFXTableViewRule());
                    						}
                    						set(
                    							current,
                    							"packagePath",
                    							lv_packagePath_7_0,
                    							"de.dc.fx.ui.model.FXDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFXDsl.g:167:3: ( ( (lv_fxColumns_8_0= ruleFXColumn ) ) ( (lv_fxColumns_9_0= ruleFXColumn ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=17 && LA5_0<=19)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFXDsl.g:168:4: ( (lv_fxColumns_8_0= ruleFXColumn ) ) ( (lv_fxColumns_9_0= ruleFXColumn ) )*
                    {
                    // InternalFXDsl.g:168:4: ( (lv_fxColumns_8_0= ruleFXColumn ) )
                    // InternalFXDsl.g:169:5: (lv_fxColumns_8_0= ruleFXColumn )
                    {
                    // InternalFXDsl.g:169:5: (lv_fxColumns_8_0= ruleFXColumn )
                    // InternalFXDsl.g:170:6: lv_fxColumns_8_0= ruleFXColumn
                    {

                    						newCompositeNode(grammarAccess.getFXTableViewAccess().getFxColumnsFXColumnParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_fxColumns_8_0=ruleFXColumn();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFXTableViewRule());
                    						}
                    						add(
                    							current,
                    							"fxColumns",
                    							lv_fxColumns_8_0,
                    							"de.dc.fx.ui.model.FXDsl.FXColumn");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFXDsl.g:187:4: ( (lv_fxColumns_9_0= ruleFXColumn ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=17 && LA4_0<=19)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalFXDsl.g:188:5: (lv_fxColumns_9_0= ruleFXColumn )
                    	    {
                    	    // InternalFXDsl.g:188:5: (lv_fxColumns_9_0= ruleFXColumn )
                    	    // InternalFXDsl.g:189:6: lv_fxColumns_9_0= ruleFXColumn
                    	    {

                    	    						newCompositeNode(grammarAccess.getFXTableViewAccess().getFxColumnsFXColumnParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_fxColumns_9_0=ruleFXColumn();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getFXTableViewRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"fxColumns",
                    	    							lv_fxColumns_9_0,
                    	    							"de.dc.fx.ui.model.FXDsl.FXColumn");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalFXDsl.g:207:3: ( (lv_fxEntity_10_0= ruleFXModel ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFXDsl.g:208:4: (lv_fxEntity_10_0= ruleFXModel )
                    {
                    // InternalFXDsl.g:208:4: (lv_fxEntity_10_0= ruleFXModel )
                    // InternalFXDsl.g:209:5: lv_fxEntity_10_0= ruleFXModel
                    {

                    					newCompositeNode(grammarAccess.getFXTableViewAccess().getFxEntityFXModelParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_fxEntity_10_0=ruleFXModel();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFXTableViewRule());
                    					}
                    					set(
                    						current,
                    						"fxEntity",
                    						lv_fxEntity_10_0,
                    						"de.dc.fx.ui.model.FXDsl.FXModel");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getFXTableViewAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFXTableView"


    // $ANTLR start "entryRuleEString"
    // InternalFXDsl.g:234:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalFXDsl.g:234:47: (iv_ruleEString= ruleEString EOF )
            // InternalFXDsl.g:235:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFXDsl.g:241:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalFXDsl.g:247:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalFXDsl.g:248:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalFXDsl.g:248:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalFXDsl.g:249:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFXDsl.g:257:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleFXColumn"
    // InternalFXDsl.g:268:1: entryRuleFXColumn returns [EObject current=null] : iv_ruleFXColumn= ruleFXColumn EOF ;
    public final EObject entryRuleFXColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFXColumn = null;


        try {
            // InternalFXDsl.g:268:49: (iv_ruleFXColumn= ruleFXColumn EOF )
            // InternalFXDsl.g:269:2: iv_ruleFXColumn= ruleFXColumn EOF
            {
             newCompositeNode(grammarAccess.getFXColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFXColumn=ruleFXColumn();

            state._fsp--;

             current =iv_ruleFXColumn; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFXColumn"


    // $ANTLR start "ruleFXColumn"
    // InternalFXDsl.g:275:1: ruleFXColumn returns [EObject current=null] : ( () ( (lv_editable_1_0= 'editable' ) )? ( (lv_useCustomCellFactory_2_0= 'useCustomCellFactory' ) )? otherlv_3= 'FXColumn' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= '{' (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'alignment' ( (lv_alignment_9_0= rulePos ) ) )? (otherlv_10= 'associatedFXProperty' ( ( ruleEString ) ) )? otherlv_12= '}' )? ) ;
    public final EObject ruleFXColumn() throws RecognitionException {
        EObject current = null;

        Token lv_editable_1_0=null;
        Token lv_useCustomCellFactory_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_width_7_0 = null;

        Enumerator lv_alignment_9_0 = null;



        	enterRule();

        try {
            // InternalFXDsl.g:281:2: ( ( () ( (lv_editable_1_0= 'editable' ) )? ( (lv_useCustomCellFactory_2_0= 'useCustomCellFactory' ) )? otherlv_3= 'FXColumn' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= '{' (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'alignment' ( (lv_alignment_9_0= rulePos ) ) )? (otherlv_10= 'associatedFXProperty' ( ( ruleEString ) ) )? otherlv_12= '}' )? ) )
            // InternalFXDsl.g:282:2: ( () ( (lv_editable_1_0= 'editable' ) )? ( (lv_useCustomCellFactory_2_0= 'useCustomCellFactory' ) )? otherlv_3= 'FXColumn' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= '{' (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'alignment' ( (lv_alignment_9_0= rulePos ) ) )? (otherlv_10= 'associatedFXProperty' ( ( ruleEString ) ) )? otherlv_12= '}' )? )
            {
            // InternalFXDsl.g:282:2: ( () ( (lv_editable_1_0= 'editable' ) )? ( (lv_useCustomCellFactory_2_0= 'useCustomCellFactory' ) )? otherlv_3= 'FXColumn' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= '{' (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'alignment' ( (lv_alignment_9_0= rulePos ) ) )? (otherlv_10= 'associatedFXProperty' ( ( ruleEString ) ) )? otherlv_12= '}' )? )
            // InternalFXDsl.g:283:3: () ( (lv_editable_1_0= 'editable' ) )? ( (lv_useCustomCellFactory_2_0= 'useCustomCellFactory' ) )? otherlv_3= 'FXColumn' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= '{' (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'alignment' ( (lv_alignment_9_0= rulePos ) ) )? (otherlv_10= 'associatedFXProperty' ( ( ruleEString ) ) )? otherlv_12= '}' )?
            {
            // InternalFXDsl.g:283:3: ()
            // InternalFXDsl.g:284:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFXColumnAccess().getFXColumnAction_0(),
            					current);
            			

            }

            // InternalFXDsl.g:290:3: ( (lv_editable_1_0= 'editable' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFXDsl.g:291:4: (lv_editable_1_0= 'editable' )
                    {
                    // InternalFXDsl.g:291:4: (lv_editable_1_0= 'editable' )
                    // InternalFXDsl.g:292:5: lv_editable_1_0= 'editable'
                    {
                    lv_editable_1_0=(Token)match(input,17,FOLLOW_10); 

                    					newLeafNode(lv_editable_1_0, grammarAccess.getFXColumnAccess().getEditableEditableKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFXColumnRule());
                    					}
                    					setWithLastConsumed(current, "editable", true, "editable");
                    				

                    }


                    }
                    break;

            }

            // InternalFXDsl.g:304:3: ( (lv_useCustomCellFactory_2_0= 'useCustomCellFactory' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalFXDsl.g:305:4: (lv_useCustomCellFactory_2_0= 'useCustomCellFactory' )
                    {
                    // InternalFXDsl.g:305:4: (lv_useCustomCellFactory_2_0= 'useCustomCellFactory' )
                    // InternalFXDsl.g:306:5: lv_useCustomCellFactory_2_0= 'useCustomCellFactory'
                    {
                    lv_useCustomCellFactory_2_0=(Token)match(input,18,FOLLOW_11); 

                    					newLeafNode(lv_useCustomCellFactory_2_0, grammarAccess.getFXColumnAccess().getUseCustomCellFactoryUseCustomCellFactoryKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFXColumnRule());
                    					}
                    					setWithLastConsumed(current, "useCustomCellFactory", true, "useCustomCellFactory");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getFXColumnAccess().getFXColumnKeyword_3());
            		
            // InternalFXDsl.g:322:3: ( (lv_name_4_0= ruleEString ) )
            // InternalFXDsl.g:323:4: (lv_name_4_0= ruleEString )
            {
            // InternalFXDsl.g:323:4: (lv_name_4_0= ruleEString )
            // InternalFXDsl.g:324:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFXColumnAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFXColumnRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"de.dc.fx.ui.model.FXDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFXDsl.g:341:3: (otherlv_5= '{' (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'alignment' ( (lv_alignment_9_0= rulePos ) ) )? (otherlv_10= 'associatedFXProperty' ( ( ruleEString ) ) )? otherlv_12= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==14) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalFXDsl.g:342:4: otherlv_5= '{' (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'alignment' ( (lv_alignment_9_0= rulePos ) ) )? (otherlv_10= 'associatedFXProperty' ( ( ruleEString ) ) )? otherlv_12= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getFXColumnAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    // InternalFXDsl.g:346:4: (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==20) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalFXDsl.g:347:5: otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) )
                            {
                            otherlv_6=(Token)match(input,20,FOLLOW_14); 

                            					newLeafNode(otherlv_6, grammarAccess.getFXColumnAccess().getWidthKeyword_5_1_0());
                            				
                            // InternalFXDsl.g:351:5: ( (lv_width_7_0= ruleEDouble ) )
                            // InternalFXDsl.g:352:6: (lv_width_7_0= ruleEDouble )
                            {
                            // InternalFXDsl.g:352:6: (lv_width_7_0= ruleEDouble )
                            // InternalFXDsl.g:353:7: lv_width_7_0= ruleEDouble
                            {

                            							newCompositeNode(grammarAccess.getFXColumnAccess().getWidthEDoubleParserRuleCall_5_1_1_0());
                            						
                            pushFollow(FOLLOW_15);
                            lv_width_7_0=ruleEDouble();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFXColumnRule());
                            							}
                            							set(
                            								current,
                            								"width",
                            								lv_width_7_0,
                            								"de.dc.fx.ui.model.FXDsl.EDouble");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalFXDsl.g:371:4: (otherlv_8= 'alignment' ( (lv_alignment_9_0= rulePos ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==21) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalFXDsl.g:372:5: otherlv_8= 'alignment' ( (lv_alignment_9_0= rulePos ) )
                            {
                            otherlv_8=(Token)match(input,21,FOLLOW_16); 

                            					newLeafNode(otherlv_8, grammarAccess.getFXColumnAccess().getAlignmentKeyword_5_2_0());
                            				
                            // InternalFXDsl.g:376:5: ( (lv_alignment_9_0= rulePos ) )
                            // InternalFXDsl.g:377:6: (lv_alignment_9_0= rulePos )
                            {
                            // InternalFXDsl.g:377:6: (lv_alignment_9_0= rulePos )
                            // InternalFXDsl.g:378:7: lv_alignment_9_0= rulePos
                            {

                            							newCompositeNode(grammarAccess.getFXColumnAccess().getAlignmentPosEnumRuleCall_5_2_1_0());
                            						
                            pushFollow(FOLLOW_17);
                            lv_alignment_9_0=rulePos();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFXColumnRule());
                            							}
                            							set(
                            								current,
                            								"alignment",
                            								lv_alignment_9_0,
                            								"de.dc.fx.ui.model.FXDsl.Pos");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalFXDsl.g:396:4: (otherlv_10= 'associatedFXProperty' ( ( ruleEString ) ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==22) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalFXDsl.g:397:5: otherlv_10= 'associatedFXProperty' ( ( ruleEString ) )
                            {
                            otherlv_10=(Token)match(input,22,FOLLOW_5); 

                            					newLeafNode(otherlv_10, grammarAccess.getFXColumnAccess().getAssociatedFXPropertyKeyword_5_3_0());
                            				
                            // InternalFXDsl.g:401:5: ( ( ruleEString ) )
                            // InternalFXDsl.g:402:6: ( ruleEString )
                            {
                            // InternalFXDsl.g:402:6: ( ruleEString )
                            // InternalFXDsl.g:403:7: ruleEString
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFXColumnRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getFXColumnAccess().getAssociatedFXPropertyFXPropertyCrossReference_5_3_1_0());
                            						
                            pushFollow(FOLLOW_9);
                            ruleEString();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getFXColumnAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFXColumn"


    // $ANTLR start "entryRuleFXModel"
    // InternalFXDsl.g:427:1: entryRuleFXModel returns [EObject current=null] : iv_ruleFXModel= ruleFXModel EOF ;
    public final EObject entryRuleFXModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFXModel = null;


        try {
            // InternalFXDsl.g:427:48: (iv_ruleFXModel= ruleFXModel EOF )
            // InternalFXDsl.g:428:2: iv_ruleFXModel= ruleFXModel EOF
            {
             newCompositeNode(grammarAccess.getFXModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFXModel=ruleFXModel();

            state._fsp--;

             current =iv_ruleFXModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFXModel"


    // $ANTLR start "ruleFXModel"
    // InternalFXDsl.g:434:1: ruleFXModel returns [EObject current=null] : ( () otherlv_1= 'FXModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_fxProperties_4_0= ruleFXProperty ) ) ( (lv_fxProperties_5_0= ruleFXProperty ) )* otherlv_6= '}' ) ;
    public final EObject ruleFXModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_fxProperties_4_0 = null;

        EObject lv_fxProperties_5_0 = null;



        	enterRule();

        try {
            // InternalFXDsl.g:440:2: ( ( () otherlv_1= 'FXModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_fxProperties_4_0= ruleFXProperty ) ) ( (lv_fxProperties_5_0= ruleFXProperty ) )* otherlv_6= '}' ) )
            // InternalFXDsl.g:441:2: ( () otherlv_1= 'FXModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_fxProperties_4_0= ruleFXProperty ) ) ( (lv_fxProperties_5_0= ruleFXProperty ) )* otherlv_6= '}' )
            {
            // InternalFXDsl.g:441:2: ( () otherlv_1= 'FXModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_fxProperties_4_0= ruleFXProperty ) ) ( (lv_fxProperties_5_0= ruleFXProperty ) )* otherlv_6= '}' )
            // InternalFXDsl.g:442:3: () otherlv_1= 'FXModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_fxProperties_4_0= ruleFXProperty ) ) ( (lv_fxProperties_5_0= ruleFXProperty ) )* otherlv_6= '}'
            {
            // InternalFXDsl.g:442:3: ()
            // InternalFXDsl.g:443:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFXModelAccess().getFXModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFXModelAccess().getFXModelKeyword_1());
            		
            // InternalFXDsl.g:453:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFXDsl.g:454:4: (lv_name_2_0= ruleEString )
            {
            // InternalFXDsl.g:454:4: (lv_name_2_0= ruleEString )
            // InternalFXDsl.g:455:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFXModelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFXModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.dc.fx.ui.model.FXDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getFXModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalFXDsl.g:476:3: ( (lv_fxProperties_4_0= ruleFXProperty ) )
            // InternalFXDsl.g:477:4: (lv_fxProperties_4_0= ruleFXProperty )
            {
            // InternalFXDsl.g:477:4: (lv_fxProperties_4_0= ruleFXProperty )
            // InternalFXDsl.g:478:5: lv_fxProperties_4_0= ruleFXProperty
            {

            					newCompositeNode(grammarAccess.getFXModelAccess().getFxPropertiesFXPropertyParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_fxProperties_4_0=ruleFXProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFXModelRule());
            					}
            					add(
            						current,
            						"fxProperties",
            						lv_fxProperties_4_0,
            						"de.dc.fx.ui.model.FXDsl.FXProperty");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFXDsl.g:495:3: ( (lv_fxProperties_5_0= ruleFXProperty ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalFXDsl.g:496:4: (lv_fxProperties_5_0= ruleFXProperty )
            	    {
            	    // InternalFXDsl.g:496:4: (lv_fxProperties_5_0= ruleFXProperty )
            	    // InternalFXDsl.g:497:5: lv_fxProperties_5_0= ruleFXProperty
            	    {

            	    					newCompositeNode(grammarAccess.getFXModelAccess().getFxPropertiesFXPropertyParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_fxProperties_5_0=ruleFXProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFXModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fxProperties",
            	    						lv_fxProperties_5_0,
            	    						"de.dc.fx.ui.model.FXDsl.FXProperty");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getFXModelAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFXModel"


    // $ANTLR start "entryRuleFXProperty"
    // InternalFXDsl.g:522:1: entryRuleFXProperty returns [EObject current=null] : iv_ruleFXProperty= ruleFXProperty EOF ;
    public final EObject entryRuleFXProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFXProperty = null;


        try {
            // InternalFXDsl.g:522:51: (iv_ruleFXProperty= ruleFXProperty EOF )
            // InternalFXDsl.g:523:2: iv_ruleFXProperty= ruleFXProperty EOF
            {
             newCompositeNode(grammarAccess.getFXPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFXProperty=ruleFXProperty();

            state._fsp--;

             current =iv_ruleFXProperty; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFXProperty"


    // $ANTLR start "ruleFXProperty"
    // InternalFXDsl.g:529:1: ruleFXProperty returns [EObject current=null] : ( () ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleFXProperty() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalFXDsl.g:535:2: ( ( () ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalFXDsl.g:536:2: ( () ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalFXDsl.g:536:2: ( () ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) )
            // InternalFXDsl.g:537:3: () ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) )
            {
            // InternalFXDsl.g:537:3: ()
            // InternalFXDsl.g:538:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFXPropertyAccess().getFXPropertyAction_0(),
            					current);
            			

            }

            // InternalFXDsl.g:544:3: ( (lv_type_1_0= ruleEString ) )
            // InternalFXDsl.g:545:4: (lv_type_1_0= ruleEString )
            {
            // InternalFXDsl.g:545:4: (lv_type_1_0= ruleEString )
            // InternalFXDsl.g:546:5: lv_type_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFXPropertyAccess().getTypeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_type_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFXPropertyRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"de.dc.fx.ui.model.FXDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFXDsl.g:563:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFXDsl.g:564:4: (lv_name_2_0= ruleEString )
            {
            // InternalFXDsl.g:564:4: (lv_name_2_0= ruleEString )
            // InternalFXDsl.g:565:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFXPropertyAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFXPropertyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.dc.fx.ui.model.FXDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFXProperty"


    // $ANTLR start "entryRuleEDouble"
    // InternalFXDsl.g:586:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalFXDsl.g:586:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalFXDsl.g:587:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalFXDsl.g:593:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalFXDsl.g:599:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalFXDsl.g:600:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalFXDsl.g:600:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalFXDsl.g:601:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalFXDsl.g:601:3: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalFXDsl.g:602:4: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_19); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalFXDsl.g:608:3: (this_INT_1= RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalFXDsl.g:609:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_20); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,25,FOLLOW_21); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_22); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalFXDsl.g:629:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=26 && LA19_0<=27)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalFXDsl.g:630:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalFXDsl.g:630:4: (kw= 'E' | kw= 'e' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==26) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==27) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalFXDsl.g:631:5: kw= 'E'
                            {
                            kw=(Token)match(input,26,FOLLOW_23); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalFXDsl.g:637:5: kw= 'e'
                            {
                            kw=(Token)match(input,27,FOLLOW_23); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalFXDsl.g:643:4: (kw= '-' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==24) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalFXDsl.g:644:5: kw= '-'
                            {
                            kw=(Token)match(input,24,FOLLOW_21); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "rulePos"
    // InternalFXDsl.g:662:1: rulePos returns [Enumerator current=null] : ( (enumLiteral_0= 'TOP_LEFT' ) | (enumLiteral_1= 'TOP_CENTER' ) | (enumLiteral_2= 'TOP_RIGHT' ) | (enumLiteral_3= 'CENTER_LEFT' ) | (enumLiteral_4= 'CENTER' ) | (enumLiteral_5= 'CENTER_RIGHT' ) | (enumLiteral_6= 'BOTTOM_LEFT' ) | (enumLiteral_7= 'BOTTOM_CENTER' ) | (enumLiteral_8= 'BOTTOM_RIGHT' ) ) ;
    public final Enumerator rulePos() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;


        	enterRule();

        try {
            // InternalFXDsl.g:668:2: ( ( (enumLiteral_0= 'TOP_LEFT' ) | (enumLiteral_1= 'TOP_CENTER' ) | (enumLiteral_2= 'TOP_RIGHT' ) | (enumLiteral_3= 'CENTER_LEFT' ) | (enumLiteral_4= 'CENTER' ) | (enumLiteral_5= 'CENTER_RIGHT' ) | (enumLiteral_6= 'BOTTOM_LEFT' ) | (enumLiteral_7= 'BOTTOM_CENTER' ) | (enumLiteral_8= 'BOTTOM_RIGHT' ) ) )
            // InternalFXDsl.g:669:2: ( (enumLiteral_0= 'TOP_LEFT' ) | (enumLiteral_1= 'TOP_CENTER' ) | (enumLiteral_2= 'TOP_RIGHT' ) | (enumLiteral_3= 'CENTER_LEFT' ) | (enumLiteral_4= 'CENTER' ) | (enumLiteral_5= 'CENTER_RIGHT' ) | (enumLiteral_6= 'BOTTOM_LEFT' ) | (enumLiteral_7= 'BOTTOM_CENTER' ) | (enumLiteral_8= 'BOTTOM_RIGHT' ) )
            {
            // InternalFXDsl.g:669:2: ( (enumLiteral_0= 'TOP_LEFT' ) | (enumLiteral_1= 'TOP_CENTER' ) | (enumLiteral_2= 'TOP_RIGHT' ) | (enumLiteral_3= 'CENTER_LEFT' ) | (enumLiteral_4= 'CENTER' ) | (enumLiteral_5= 'CENTER_RIGHT' ) | (enumLiteral_6= 'BOTTOM_LEFT' ) | (enumLiteral_7= 'BOTTOM_CENTER' ) | (enumLiteral_8= 'BOTTOM_RIGHT' ) )
            int alt20=9;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt20=1;
                }
                break;
            case 29:
                {
                alt20=2;
                }
                break;
            case 30:
                {
                alt20=3;
                }
                break;
            case 31:
                {
                alt20=4;
                }
                break;
            case 32:
                {
                alt20=5;
                }
                break;
            case 33:
                {
                alt20=6;
                }
                break;
            case 34:
                {
                alt20=7;
                }
                break;
            case 35:
                {
                alt20=8;
                }
                break;
            case 36:
                {
                alt20=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalFXDsl.g:670:3: (enumLiteral_0= 'TOP_LEFT' )
                    {
                    // InternalFXDsl.g:670:3: (enumLiteral_0= 'TOP_LEFT' )
                    // InternalFXDsl.g:671:4: enumLiteral_0= 'TOP_LEFT'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getPosAccess().getTOP_LEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPosAccess().getTOP_LEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFXDsl.g:678:3: (enumLiteral_1= 'TOP_CENTER' )
                    {
                    // InternalFXDsl.g:678:3: (enumLiteral_1= 'TOP_CENTER' )
                    // InternalFXDsl.g:679:4: enumLiteral_1= 'TOP_CENTER'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getPosAccess().getTOP_CENTEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPosAccess().getTOP_CENTEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFXDsl.g:686:3: (enumLiteral_2= 'TOP_RIGHT' )
                    {
                    // InternalFXDsl.g:686:3: (enumLiteral_2= 'TOP_RIGHT' )
                    // InternalFXDsl.g:687:4: enumLiteral_2= 'TOP_RIGHT'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getPosAccess().getTOP_RIGHTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPosAccess().getTOP_RIGHTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFXDsl.g:694:3: (enumLiteral_3= 'CENTER_LEFT' )
                    {
                    // InternalFXDsl.g:694:3: (enumLiteral_3= 'CENTER_LEFT' )
                    // InternalFXDsl.g:695:4: enumLiteral_3= 'CENTER_LEFT'
                    {
                    enumLiteral_3=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getPosAccess().getCENTER_LEFTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPosAccess().getCENTER_LEFTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalFXDsl.g:702:3: (enumLiteral_4= 'CENTER' )
                    {
                    // InternalFXDsl.g:702:3: (enumLiteral_4= 'CENTER' )
                    // InternalFXDsl.g:703:4: enumLiteral_4= 'CENTER'
                    {
                    enumLiteral_4=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getPosAccess().getCENTEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPosAccess().getCENTEREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalFXDsl.g:710:3: (enumLiteral_5= 'CENTER_RIGHT' )
                    {
                    // InternalFXDsl.g:710:3: (enumLiteral_5= 'CENTER_RIGHT' )
                    // InternalFXDsl.g:711:4: enumLiteral_5= 'CENTER_RIGHT'
                    {
                    enumLiteral_5=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getPosAccess().getCENTER_RIGHTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPosAccess().getCENTER_RIGHTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalFXDsl.g:718:3: (enumLiteral_6= 'BOTTOM_LEFT' )
                    {
                    // InternalFXDsl.g:718:3: (enumLiteral_6= 'BOTTOM_LEFT' )
                    // InternalFXDsl.g:719:4: enumLiteral_6= 'BOTTOM_LEFT'
                    {
                    enumLiteral_6=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getPosAccess().getBOTTOM_LEFTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPosAccess().getBOTTOM_LEFTEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalFXDsl.g:726:3: (enumLiteral_7= 'BOTTOM_CENTER' )
                    {
                    // InternalFXDsl.g:726:3: (enumLiteral_7= 'BOTTOM_CENTER' )
                    // InternalFXDsl.g:727:4: enumLiteral_7= 'BOTTOM_CENTER'
                    {
                    enumLiteral_7=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getPosAccess().getBOTTOM_CENTEREnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPosAccess().getBOTTOM_CENTEREnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalFXDsl.g:734:3: (enumLiteral_8= 'BOTTOM_RIGHT' )
                    {
                    // InternalFXDsl.g:734:3: (enumLiteral_8= 'BOTTOM_RIGHT' )
                    // InternalFXDsl.g:735:4: enumLiteral_8= 'BOTTOM_RIGHT'
                    {
                    enumLiteral_8=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getPosAccess().getBOTTOM_RIGHTEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPosAccess().getBOTTOM_RIGHTEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePos"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000008F8000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000008F0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000710000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000610000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001FF0000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000040L});

}