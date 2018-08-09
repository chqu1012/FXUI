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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'hasFilter'", "'hasSorter'", "'FXTableView'", "'{'", "'packagePath'", "'fxColumns'", "','", "'}'", "'fxEntity'", "'editable'", "'useCustomCellFactory'", "'FXColumn'", "'width'", "'alignment'", "'associatedFXProperty'", "'FXModel'", "'fxProperties'", "'FXProperty'", "'type'", "'-'", "'.'", "'E'", "'e'", "'TOP_LEFT'", "'TOP_CENTER'", "'TOP_RIGHT'", "'CENTER_LEFT'", "'CENTER'", "'CENTER_RIGHT'", "'BOTTOM_LEFT'", "'BOTTOM_CENTER'", "'BOTTOM_RIGHT'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
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
    // InternalFXDsl.g:72:1: ruleFXTableView returns [EObject current=null] : ( () ( (lv_hasFilter_1_0= 'hasFilter' ) )? ( (lv_hasSorter_2_0= 'hasSorter' ) )? otherlv_3= 'FXTableView' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'packagePath' ( (lv_packagePath_7_0= ruleEString ) ) )? (otherlv_8= 'fxColumns' otherlv_9= '{' ( (lv_fxColumns_10_0= ruleFXColumn ) ) (otherlv_11= ',' ( (lv_fxColumns_12_0= ruleFXColumn ) ) )* otherlv_13= '}' )? (otherlv_14= 'fxEntity' ( (lv_fxEntity_15_0= ruleFXModel ) ) )? otherlv_16= '}' ) ;
    public final EObject ruleFXTableView() throws RecognitionException {
        EObject current = null;

        Token lv_hasFilter_1_0=null;
        Token lv_hasSorter_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_packagePath_7_0 = null;

        EObject lv_fxColumns_10_0 = null;

        EObject lv_fxColumns_12_0 = null;

        EObject lv_fxEntity_15_0 = null;



        	enterRule();

        try {
            // InternalFXDsl.g:78:2: ( ( () ( (lv_hasFilter_1_0= 'hasFilter' ) )? ( (lv_hasSorter_2_0= 'hasSorter' ) )? otherlv_3= 'FXTableView' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'packagePath' ( (lv_packagePath_7_0= ruleEString ) ) )? (otherlv_8= 'fxColumns' otherlv_9= '{' ( (lv_fxColumns_10_0= ruleFXColumn ) ) (otherlv_11= ',' ( (lv_fxColumns_12_0= ruleFXColumn ) ) )* otherlv_13= '}' )? (otherlv_14= 'fxEntity' ( (lv_fxEntity_15_0= ruleFXModel ) ) )? otherlv_16= '}' ) )
            // InternalFXDsl.g:79:2: ( () ( (lv_hasFilter_1_0= 'hasFilter' ) )? ( (lv_hasSorter_2_0= 'hasSorter' ) )? otherlv_3= 'FXTableView' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'packagePath' ( (lv_packagePath_7_0= ruleEString ) ) )? (otherlv_8= 'fxColumns' otherlv_9= '{' ( (lv_fxColumns_10_0= ruleFXColumn ) ) (otherlv_11= ',' ( (lv_fxColumns_12_0= ruleFXColumn ) ) )* otherlv_13= '}' )? (otherlv_14= 'fxEntity' ( (lv_fxEntity_15_0= ruleFXModel ) ) )? otherlv_16= '}' )
            {
            // InternalFXDsl.g:79:2: ( () ( (lv_hasFilter_1_0= 'hasFilter' ) )? ( (lv_hasSorter_2_0= 'hasSorter' ) )? otherlv_3= 'FXTableView' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'packagePath' ( (lv_packagePath_7_0= ruleEString ) ) )? (otherlv_8= 'fxColumns' otherlv_9= '{' ( (lv_fxColumns_10_0= ruleFXColumn ) ) (otherlv_11= ',' ( (lv_fxColumns_12_0= ruleFXColumn ) ) )* otherlv_13= '}' )? (otherlv_14= 'fxEntity' ( (lv_fxEntity_15_0= ruleFXModel ) ) )? otherlv_16= '}' )
            // InternalFXDsl.g:80:3: () ( (lv_hasFilter_1_0= 'hasFilter' ) )? ( (lv_hasSorter_2_0= 'hasSorter' ) )? otherlv_3= 'FXTableView' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'packagePath' ( (lv_packagePath_7_0= ruleEString ) ) )? (otherlv_8= 'fxColumns' otherlv_9= '{' ( (lv_fxColumns_10_0= ruleFXColumn ) ) (otherlv_11= ',' ( (lv_fxColumns_12_0= ruleFXColumn ) ) )* otherlv_13= '}' )? (otherlv_14= 'fxEntity' ( (lv_fxEntity_15_0= ruleFXModel ) ) )? otherlv_16= '}'
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

            // InternalFXDsl.g:167:3: (otherlv_8= 'fxColumns' otherlv_9= '{' ( (lv_fxColumns_10_0= ruleFXColumn ) ) (otherlv_11= ',' ( (lv_fxColumns_12_0= ruleFXColumn ) ) )* otherlv_13= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFXDsl.g:168:4: otherlv_8= 'fxColumns' otherlv_9= '{' ( (lv_fxColumns_10_0= ruleFXColumn ) ) (otherlv_11= ',' ( (lv_fxColumns_12_0= ruleFXColumn ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getFXTableViewAccess().getFxColumnsKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getFXTableViewAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalFXDsl.g:176:4: ( (lv_fxColumns_10_0= ruleFXColumn ) )
                    // InternalFXDsl.g:177:5: (lv_fxColumns_10_0= ruleFXColumn )
                    {
                    // InternalFXDsl.g:177:5: (lv_fxColumns_10_0= ruleFXColumn )
                    // InternalFXDsl.g:178:6: lv_fxColumns_10_0= ruleFXColumn
                    {

                    						newCompositeNode(grammarAccess.getFXTableViewAccess().getFxColumnsFXColumnParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_fxColumns_10_0=ruleFXColumn();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFXTableViewRule());
                    						}
                    						add(
                    							current,
                    							"fxColumns",
                    							lv_fxColumns_10_0,
                    							"de.dc.fx.ui.model.FXDsl.FXColumn");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFXDsl.g:195:4: (otherlv_11= ',' ( (lv_fxColumns_12_0= ruleFXColumn ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalFXDsl.g:196:5: otherlv_11= ',' ( (lv_fxColumns_12_0= ruleFXColumn ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FOLLOW_9); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getFXTableViewAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalFXDsl.g:200:5: ( (lv_fxColumns_12_0= ruleFXColumn ) )
                    	    // InternalFXDsl.g:201:6: (lv_fxColumns_12_0= ruleFXColumn )
                    	    {
                    	    // InternalFXDsl.g:201:6: (lv_fxColumns_12_0= ruleFXColumn )
                    	    // InternalFXDsl.g:202:7: lv_fxColumns_12_0= ruleFXColumn
                    	    {

                    	    							newCompositeNode(grammarAccess.getFXTableViewAccess().getFxColumnsFXColumnParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_fxColumns_12_0=ruleFXColumn();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFXTableViewRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fxColumns",
                    	    								lv_fxColumns_12_0,
                    	    								"de.dc.fx.ui.model.FXDsl.FXColumn");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getFXTableViewAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalFXDsl.g:225:3: (otherlv_14= 'fxEntity' ( (lv_fxEntity_15_0= ruleFXModel ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFXDsl.g:226:4: otherlv_14= 'fxEntity' ( (lv_fxEntity_15_0= ruleFXModel ) )
                    {
                    otherlv_14=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getFXTableViewAccess().getFxEntityKeyword_8_0());
                    			
                    // InternalFXDsl.g:230:4: ( (lv_fxEntity_15_0= ruleFXModel ) )
                    // InternalFXDsl.g:231:5: (lv_fxEntity_15_0= ruleFXModel )
                    {
                    // InternalFXDsl.g:231:5: (lv_fxEntity_15_0= ruleFXModel )
                    // InternalFXDsl.g:232:6: lv_fxEntity_15_0= ruleFXModel
                    {

                    						newCompositeNode(grammarAccess.getFXTableViewAccess().getFxEntityFXModelParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_fxEntity_15_0=ruleFXModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFXTableViewRule());
                    						}
                    						set(
                    							current,
                    							"fxEntity",
                    							lv_fxEntity_15_0,
                    							"de.dc.fx.ui.model.FXDsl.FXModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getFXTableViewAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalFXDsl.g:258:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalFXDsl.g:258:47: (iv_ruleEString= ruleEString EOF )
            // InternalFXDsl.g:259:2: iv_ruleEString= ruleEString EOF
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
    // InternalFXDsl.g:265:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalFXDsl.g:271:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalFXDsl.g:272:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalFXDsl.g:272:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalFXDsl.g:273:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFXDsl.g:281:3: this_ID_1= RULE_ID
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
    // InternalFXDsl.g:292:1: entryRuleFXColumn returns [EObject current=null] : iv_ruleFXColumn= ruleFXColumn EOF ;
    public final EObject entryRuleFXColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFXColumn = null;


        try {
            // InternalFXDsl.g:292:49: (iv_ruleFXColumn= ruleFXColumn EOF )
            // InternalFXDsl.g:293:2: iv_ruleFXColumn= ruleFXColumn EOF
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
    // InternalFXDsl.g:299:1: ruleFXColumn returns [EObject current=null] : ( () ( (lv_editable_1_0= 'editable' ) )? ( (lv_useCustomCellFactory_2_0= 'useCustomCellFactory' ) )? otherlv_3= 'FXColumn' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'alignment' ( (lv_alignment_9_0= rulePos ) ) )? (otherlv_10= 'associatedFXProperty' ( ( ruleEString ) ) )? otherlv_12= '}' ) ;
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
            // InternalFXDsl.g:305:2: ( ( () ( (lv_editable_1_0= 'editable' ) )? ( (lv_useCustomCellFactory_2_0= 'useCustomCellFactory' ) )? otherlv_3= 'FXColumn' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'alignment' ( (lv_alignment_9_0= rulePos ) ) )? (otherlv_10= 'associatedFXProperty' ( ( ruleEString ) ) )? otherlv_12= '}' ) )
            // InternalFXDsl.g:306:2: ( () ( (lv_editable_1_0= 'editable' ) )? ( (lv_useCustomCellFactory_2_0= 'useCustomCellFactory' ) )? otherlv_3= 'FXColumn' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'alignment' ( (lv_alignment_9_0= rulePos ) ) )? (otherlv_10= 'associatedFXProperty' ( ( ruleEString ) ) )? otherlv_12= '}' )
            {
            // InternalFXDsl.g:306:2: ( () ( (lv_editable_1_0= 'editable' ) )? ( (lv_useCustomCellFactory_2_0= 'useCustomCellFactory' ) )? otherlv_3= 'FXColumn' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'alignment' ( (lv_alignment_9_0= rulePos ) ) )? (otherlv_10= 'associatedFXProperty' ( ( ruleEString ) ) )? otherlv_12= '}' )
            // InternalFXDsl.g:307:3: () ( (lv_editable_1_0= 'editable' ) )? ( (lv_useCustomCellFactory_2_0= 'useCustomCellFactory' ) )? otherlv_3= 'FXColumn' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'alignment' ( (lv_alignment_9_0= rulePos ) ) )? (otherlv_10= 'associatedFXProperty' ( ( ruleEString ) ) )? otherlv_12= '}'
            {
            // InternalFXDsl.g:307:3: ()
            // InternalFXDsl.g:308:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFXColumnAccess().getFXColumnAction_0(),
            					current);
            			

            }

            // InternalFXDsl.g:314:3: ( (lv_editable_1_0= 'editable' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFXDsl.g:315:4: (lv_editable_1_0= 'editable' )
                    {
                    // InternalFXDsl.g:315:4: (lv_editable_1_0= 'editable' )
                    // InternalFXDsl.g:316:5: lv_editable_1_0= 'editable'
                    {
                    lv_editable_1_0=(Token)match(input,20,FOLLOW_14); 

                    					newLeafNode(lv_editable_1_0, grammarAccess.getFXColumnAccess().getEditableEditableKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFXColumnRule());
                    					}
                    					setWithLastConsumed(current, "editable", true, "editable");
                    				

                    }


                    }
                    break;

            }

            // InternalFXDsl.g:328:3: ( (lv_useCustomCellFactory_2_0= 'useCustomCellFactory' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalFXDsl.g:329:4: (lv_useCustomCellFactory_2_0= 'useCustomCellFactory' )
                    {
                    // InternalFXDsl.g:329:4: (lv_useCustomCellFactory_2_0= 'useCustomCellFactory' )
                    // InternalFXDsl.g:330:5: lv_useCustomCellFactory_2_0= 'useCustomCellFactory'
                    {
                    lv_useCustomCellFactory_2_0=(Token)match(input,21,FOLLOW_15); 

                    					newLeafNode(lv_useCustomCellFactory_2_0, grammarAccess.getFXColumnAccess().getUseCustomCellFactoryUseCustomCellFactoryKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFXColumnRule());
                    					}
                    					setWithLastConsumed(current, "useCustomCellFactory", true, "useCustomCellFactory");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getFXColumnAccess().getFXColumnKeyword_3());
            		
            // InternalFXDsl.g:346:3: ( (lv_name_4_0= ruleEString ) )
            // InternalFXDsl.g:347:4: (lv_name_4_0= ruleEString )
            {
            // InternalFXDsl.g:347:4: (lv_name_4_0= ruleEString )
            // InternalFXDsl.g:348:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFXColumnAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_5=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getFXColumnAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalFXDsl.g:369:3: (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFXDsl.g:370:4: otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getFXColumnAccess().getWidthKeyword_6_0());
                    			
                    // InternalFXDsl.g:374:4: ( (lv_width_7_0= ruleEDouble ) )
                    // InternalFXDsl.g:375:5: (lv_width_7_0= ruleEDouble )
                    {
                    // InternalFXDsl.g:375:5: (lv_width_7_0= ruleEDouble )
                    // InternalFXDsl.g:376:6: lv_width_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getFXColumnAccess().getWidthEDoubleParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

            // InternalFXDsl.g:394:3: (otherlv_8= 'alignment' ( (lv_alignment_9_0= rulePos ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalFXDsl.g:395:4: otherlv_8= 'alignment' ( (lv_alignment_9_0= rulePos ) )
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_19); 

                    				newLeafNode(otherlv_8, grammarAccess.getFXColumnAccess().getAlignmentKeyword_7_0());
                    			
                    // InternalFXDsl.g:399:4: ( (lv_alignment_9_0= rulePos ) )
                    // InternalFXDsl.g:400:5: (lv_alignment_9_0= rulePos )
                    {
                    // InternalFXDsl.g:400:5: (lv_alignment_9_0= rulePos )
                    // InternalFXDsl.g:401:6: lv_alignment_9_0= rulePos
                    {

                    						newCompositeNode(grammarAccess.getFXColumnAccess().getAlignmentPosEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_20);
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

            // InternalFXDsl.g:419:3: (otherlv_10= 'associatedFXProperty' ( ( ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFXDsl.g:420:4: otherlv_10= 'associatedFXProperty' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getFXColumnAccess().getAssociatedFXPropertyKeyword_8_0());
                    			
                    // InternalFXDsl.g:424:4: ( ( ruleEString ) )
                    // InternalFXDsl.g:425:5: ( ruleEString )
                    {
                    // InternalFXDsl.g:425:5: ( ruleEString )
                    // InternalFXDsl.g:426:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFXColumnRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFXColumnAccess().getAssociatedFXPropertyFXPropertyCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getFXColumnAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalFXDsl.g:449:1: entryRuleFXModel returns [EObject current=null] : iv_ruleFXModel= ruleFXModel EOF ;
    public final EObject entryRuleFXModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFXModel = null;


        try {
            // InternalFXDsl.g:449:48: (iv_ruleFXModel= ruleFXModel EOF )
            // InternalFXDsl.g:450:2: iv_ruleFXModel= ruleFXModel EOF
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
    // InternalFXDsl.g:456:1: ruleFXModel returns [EObject current=null] : ( () otherlv_1= 'FXModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fxProperties' otherlv_5= '{' ( (lv_fxProperties_6_0= ruleFXProperty ) ) (otherlv_7= ',' ( (lv_fxProperties_8_0= ruleFXProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleFXModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_fxProperties_6_0 = null;

        EObject lv_fxProperties_8_0 = null;



        	enterRule();

        try {
            // InternalFXDsl.g:462:2: ( ( () otherlv_1= 'FXModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fxProperties' otherlv_5= '{' ( (lv_fxProperties_6_0= ruleFXProperty ) ) (otherlv_7= ',' ( (lv_fxProperties_8_0= ruleFXProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalFXDsl.g:463:2: ( () otherlv_1= 'FXModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fxProperties' otherlv_5= '{' ( (lv_fxProperties_6_0= ruleFXProperty ) ) (otherlv_7= ',' ( (lv_fxProperties_8_0= ruleFXProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalFXDsl.g:463:2: ( () otherlv_1= 'FXModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fxProperties' otherlv_5= '{' ( (lv_fxProperties_6_0= ruleFXProperty ) ) (otherlv_7= ',' ( (lv_fxProperties_8_0= ruleFXProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalFXDsl.g:464:3: () otherlv_1= 'FXModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fxProperties' otherlv_5= '{' ( (lv_fxProperties_6_0= ruleFXProperty ) ) (otherlv_7= ',' ( (lv_fxProperties_8_0= ruleFXProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalFXDsl.g:464:3: ()
            // InternalFXDsl.g:465:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFXModelAccess().getFXModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFXModelAccess().getFXModelKeyword_1());
            		
            // InternalFXDsl.g:475:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFXDsl.g:476:4: (lv_name_2_0= ruleEString )
            {
            // InternalFXDsl.g:476:4: (lv_name_2_0= ruleEString )
            // InternalFXDsl.g:477:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getFXModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalFXDsl.g:498:3: (otherlv_4= 'fxProperties' otherlv_5= '{' ( (lv_fxProperties_6_0= ruleFXProperty ) ) (otherlv_7= ',' ( (lv_fxProperties_8_0= ruleFXProperty ) ) )* otherlv_9= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFXDsl.g:499:4: otherlv_4= 'fxProperties' otherlv_5= '{' ( (lv_fxProperties_6_0= ruleFXProperty ) ) (otherlv_7= ',' ( (lv_fxProperties_8_0= ruleFXProperty ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getFXModelAccess().getFxPropertiesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,14,FOLLOW_22); 

                    				newLeafNode(otherlv_5, grammarAccess.getFXModelAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalFXDsl.g:507:4: ( (lv_fxProperties_6_0= ruleFXProperty ) )
                    // InternalFXDsl.g:508:5: (lv_fxProperties_6_0= ruleFXProperty )
                    {
                    // InternalFXDsl.g:508:5: (lv_fxProperties_6_0= ruleFXProperty )
                    // InternalFXDsl.g:509:6: lv_fxProperties_6_0= ruleFXProperty
                    {

                    						newCompositeNode(grammarAccess.getFXModelAccess().getFxPropertiesFXPropertyParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_fxProperties_6_0=ruleFXProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFXModelRule());
                    						}
                    						add(
                    							current,
                    							"fxProperties",
                    							lv_fxProperties_6_0,
                    							"de.dc.fx.ui.model.FXDsl.FXProperty");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFXDsl.g:526:4: (otherlv_7= ',' ( (lv_fxProperties_8_0= ruleFXProperty ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==17) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalFXDsl.g:527:5: otherlv_7= ',' ( (lv_fxProperties_8_0= ruleFXProperty ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FOLLOW_22); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getFXModelAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalFXDsl.g:531:5: ( (lv_fxProperties_8_0= ruleFXProperty ) )
                    	    // InternalFXDsl.g:532:6: (lv_fxProperties_8_0= ruleFXProperty )
                    	    {
                    	    // InternalFXDsl.g:532:6: (lv_fxProperties_8_0= ruleFXProperty )
                    	    // InternalFXDsl.g:533:7: lv_fxProperties_8_0= ruleFXProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getFXModelAccess().getFxPropertiesFXPropertyParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_fxProperties_8_0=ruleFXProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFXModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fxProperties",
                    	    								lv_fxProperties_8_0,
                    	    								"de.dc.fx.ui.model.FXDsl.FXProperty");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getFXModelAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getFXModelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalFXDsl.g:564:1: entryRuleFXProperty returns [EObject current=null] : iv_ruleFXProperty= ruleFXProperty EOF ;
    public final EObject entryRuleFXProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFXProperty = null;


        try {
            // InternalFXDsl.g:564:51: (iv_ruleFXProperty= ruleFXProperty EOF )
            // InternalFXDsl.g:565:2: iv_ruleFXProperty= ruleFXProperty EOF
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
    // InternalFXDsl.g:571:1: ruleFXProperty returns [EObject current=null] : ( () otherlv_1= 'FXProperty' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleFXProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalFXDsl.g:577:2: ( ( () otherlv_1= 'FXProperty' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalFXDsl.g:578:2: ( () otherlv_1= 'FXProperty' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalFXDsl.g:578:2: ( () otherlv_1= 'FXProperty' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalFXDsl.g:579:3: () otherlv_1= 'FXProperty' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalFXDsl.g:579:3: ()
            // InternalFXDsl.g:580:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFXPropertyAccess().getFXPropertyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFXPropertyAccess().getFXPropertyKeyword_1());
            		
            // InternalFXDsl.g:590:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFXDsl.g:591:4: (lv_name_2_0= ruleEString )
            {
            // InternalFXDsl.g:591:4: (lv_name_2_0= ruleEString )
            // InternalFXDsl.g:592:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFXPropertyAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_3=(Token)match(input,14,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getFXPropertyAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalFXDsl.g:613:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalFXDsl.g:614:4: otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getFXPropertyAccess().getTypeKeyword_4_0());
                    			
                    // InternalFXDsl.g:618:4: ( (lv_type_5_0= ruleEString ) )
                    // InternalFXDsl.g:619:5: (lv_type_5_0= ruleEString )
                    {
                    // InternalFXDsl.g:619:5: (lv_type_5_0= ruleEString )
                    // InternalFXDsl.g:620:6: lv_type_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFXPropertyAccess().getTypeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_type_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFXPropertyRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"de.dc.fx.ui.model.FXDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getFXPropertyAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalFXDsl.g:646:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalFXDsl.g:646:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalFXDsl.g:647:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalFXDsl.g:653:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalFXDsl.g:659:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalFXDsl.g:660:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalFXDsl.g:660:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalFXDsl.g:661:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalFXDsl.g:661:3: (kw= '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalFXDsl.g:662:4: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_24); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalFXDsl.g:668:3: (this_INT_1= RULE_INT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalFXDsl.g:669:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_25); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,31,FOLLOW_26); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_27); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalFXDsl.g:689:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=32 && LA20_0<=33)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalFXDsl.g:690:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalFXDsl.g:690:4: (kw= 'E' | kw= 'e' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==32) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==33) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalFXDsl.g:691:5: kw= 'E'
                            {
                            kw=(Token)match(input,32,FOLLOW_28); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalFXDsl.g:697:5: kw= 'e'
                            {
                            kw=(Token)match(input,33,FOLLOW_28); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalFXDsl.g:703:4: (kw= '-' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==30) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalFXDsl.g:704:5: kw= '-'
                            {
                            kw=(Token)match(input,30,FOLLOW_26); 

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
    // InternalFXDsl.g:722:1: rulePos returns [Enumerator current=null] : ( (enumLiteral_0= 'TOP_LEFT' ) | (enumLiteral_1= 'TOP_CENTER' ) | (enumLiteral_2= 'TOP_RIGHT' ) | (enumLiteral_3= 'CENTER_LEFT' ) | (enumLiteral_4= 'CENTER' ) | (enumLiteral_5= 'CENTER_RIGHT' ) | (enumLiteral_6= 'BOTTOM_LEFT' ) | (enumLiteral_7= 'BOTTOM_CENTER' ) | (enumLiteral_8= 'BOTTOM_RIGHT' ) ) ;
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
            // InternalFXDsl.g:728:2: ( ( (enumLiteral_0= 'TOP_LEFT' ) | (enumLiteral_1= 'TOP_CENTER' ) | (enumLiteral_2= 'TOP_RIGHT' ) | (enumLiteral_3= 'CENTER_LEFT' ) | (enumLiteral_4= 'CENTER' ) | (enumLiteral_5= 'CENTER_RIGHT' ) | (enumLiteral_6= 'BOTTOM_LEFT' ) | (enumLiteral_7= 'BOTTOM_CENTER' ) | (enumLiteral_8= 'BOTTOM_RIGHT' ) ) )
            // InternalFXDsl.g:729:2: ( (enumLiteral_0= 'TOP_LEFT' ) | (enumLiteral_1= 'TOP_CENTER' ) | (enumLiteral_2= 'TOP_RIGHT' ) | (enumLiteral_3= 'CENTER_LEFT' ) | (enumLiteral_4= 'CENTER' ) | (enumLiteral_5= 'CENTER_RIGHT' ) | (enumLiteral_6= 'BOTTOM_LEFT' ) | (enumLiteral_7= 'BOTTOM_CENTER' ) | (enumLiteral_8= 'BOTTOM_RIGHT' ) )
            {
            // InternalFXDsl.g:729:2: ( (enumLiteral_0= 'TOP_LEFT' ) | (enumLiteral_1= 'TOP_CENTER' ) | (enumLiteral_2= 'TOP_RIGHT' ) | (enumLiteral_3= 'CENTER_LEFT' ) | (enumLiteral_4= 'CENTER' ) | (enumLiteral_5= 'CENTER_RIGHT' ) | (enumLiteral_6= 'BOTTOM_LEFT' ) | (enumLiteral_7= 'BOTTOM_CENTER' ) | (enumLiteral_8= 'BOTTOM_RIGHT' ) )
            int alt21=9;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt21=1;
                }
                break;
            case 35:
                {
                alt21=2;
                }
                break;
            case 36:
                {
                alt21=3;
                }
                break;
            case 37:
                {
                alt21=4;
                }
                break;
            case 38:
                {
                alt21=5;
                }
                break;
            case 39:
                {
                alt21=6;
                }
                break;
            case 40:
                {
                alt21=7;
                }
                break;
            case 41:
                {
                alt21=8;
                }
                break;
            case 42:
                {
                alt21=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalFXDsl.g:730:3: (enumLiteral_0= 'TOP_LEFT' )
                    {
                    // InternalFXDsl.g:730:3: (enumLiteral_0= 'TOP_LEFT' )
                    // InternalFXDsl.g:731:4: enumLiteral_0= 'TOP_LEFT'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getPosAccess().getTOP_LEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPosAccess().getTOP_LEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFXDsl.g:738:3: (enumLiteral_1= 'TOP_CENTER' )
                    {
                    // InternalFXDsl.g:738:3: (enumLiteral_1= 'TOP_CENTER' )
                    // InternalFXDsl.g:739:4: enumLiteral_1= 'TOP_CENTER'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getPosAccess().getTOP_CENTEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPosAccess().getTOP_CENTEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFXDsl.g:746:3: (enumLiteral_2= 'TOP_RIGHT' )
                    {
                    // InternalFXDsl.g:746:3: (enumLiteral_2= 'TOP_RIGHT' )
                    // InternalFXDsl.g:747:4: enumLiteral_2= 'TOP_RIGHT'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getPosAccess().getTOP_RIGHTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPosAccess().getTOP_RIGHTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFXDsl.g:754:3: (enumLiteral_3= 'CENTER_LEFT' )
                    {
                    // InternalFXDsl.g:754:3: (enumLiteral_3= 'CENTER_LEFT' )
                    // InternalFXDsl.g:755:4: enumLiteral_3= 'CENTER_LEFT'
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getPosAccess().getCENTER_LEFTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPosAccess().getCENTER_LEFTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalFXDsl.g:762:3: (enumLiteral_4= 'CENTER' )
                    {
                    // InternalFXDsl.g:762:3: (enumLiteral_4= 'CENTER' )
                    // InternalFXDsl.g:763:4: enumLiteral_4= 'CENTER'
                    {
                    enumLiteral_4=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getPosAccess().getCENTEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPosAccess().getCENTEREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalFXDsl.g:770:3: (enumLiteral_5= 'CENTER_RIGHT' )
                    {
                    // InternalFXDsl.g:770:3: (enumLiteral_5= 'CENTER_RIGHT' )
                    // InternalFXDsl.g:771:4: enumLiteral_5= 'CENTER_RIGHT'
                    {
                    enumLiteral_5=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getPosAccess().getCENTER_RIGHTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPosAccess().getCENTER_RIGHTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalFXDsl.g:778:3: (enumLiteral_6= 'BOTTOM_LEFT' )
                    {
                    // InternalFXDsl.g:778:3: (enumLiteral_6= 'BOTTOM_LEFT' )
                    // InternalFXDsl.g:779:4: enumLiteral_6= 'BOTTOM_LEFT'
                    {
                    enumLiteral_6=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getPosAccess().getBOTTOM_LEFTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPosAccess().getBOTTOM_LEFTEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalFXDsl.g:786:3: (enumLiteral_7= 'BOTTOM_CENTER' )
                    {
                    // InternalFXDsl.g:786:3: (enumLiteral_7= 'BOTTOM_CENTER' )
                    // InternalFXDsl.g:787:4: enumLiteral_7= 'BOTTOM_CENTER'
                    {
                    enumLiteral_7=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getPosAccess().getBOTTOM_CENTEREnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPosAccess().getBOTTOM_CENTEREnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalFXDsl.g:794:3: (enumLiteral_8= 'BOTTOM_RIGHT' )
                    {
                    // InternalFXDsl.g:794:3: (enumLiteral_8= 'BOTTOM_RIGHT' )
                    // InternalFXDsl.g:795:4: enumLiteral_8= 'BOTTOM_RIGHT'
                    {
                    enumLiteral_8=(Token)match(input,42,FOLLOW_2); 

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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000D8000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000D0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003840000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000C0000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000007FC00000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000040L});

}