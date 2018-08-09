package de.dc.fx.ui.model.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.dc.fx.ui.model.services.FXDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFXDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'TOP_LEFT'", "'TOP_CENTER'", "'TOP_RIGHT'", "'CENTER_LEFT'", "'CENTER'", "'CENTER_RIGHT'", "'BOTTOM_LEFT'", "'BOTTOM_CENTER'", "'BOTTOM_RIGHT'", "'FXTableView'", "'{'", "'}'", "'packagePath'", "'FXColumn'", "'width'", "'alignment'", "'associatedFXProperty'", "'FXModel'", "'-'", "'.'", "'hasFilter'", "'hasSorter'", "'editable'", "'useCustomCellFactory'"
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

    	public void setGrammarAccess(FXDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleFXTableView"
    // InternalFXDsl.g:53:1: entryRuleFXTableView : ruleFXTableView EOF ;
    public final void entryRuleFXTableView() throws RecognitionException {
        try {
            // InternalFXDsl.g:54:1: ( ruleFXTableView EOF )
            // InternalFXDsl.g:55:1: ruleFXTableView EOF
            {
             before(grammarAccess.getFXTableViewRule()); 
            pushFollow(FOLLOW_1);
            ruleFXTableView();

            state._fsp--;

             after(grammarAccess.getFXTableViewRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFXTableView"


    // $ANTLR start "ruleFXTableView"
    // InternalFXDsl.g:62:1: ruleFXTableView : ( ( rule__FXTableView__Group__0 ) ) ;
    public final void ruleFXTableView() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:66:2: ( ( ( rule__FXTableView__Group__0 ) ) )
            // InternalFXDsl.g:67:2: ( ( rule__FXTableView__Group__0 ) )
            {
            // InternalFXDsl.g:67:2: ( ( rule__FXTableView__Group__0 ) )
            // InternalFXDsl.g:68:3: ( rule__FXTableView__Group__0 )
            {
             before(grammarAccess.getFXTableViewAccess().getGroup()); 
            // InternalFXDsl.g:69:3: ( rule__FXTableView__Group__0 )
            // InternalFXDsl.g:69:4: rule__FXTableView__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FXTableView__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFXTableViewAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFXTableView"


    // $ANTLR start "entryRuleEString"
    // InternalFXDsl.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalFXDsl.g:79:1: ( ruleEString EOF )
            // InternalFXDsl.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalFXDsl.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalFXDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalFXDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalFXDsl.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalFXDsl.g:94:3: ( rule__EString__Alternatives )
            // InternalFXDsl.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleFXColumn"
    // InternalFXDsl.g:103:1: entryRuleFXColumn : ruleFXColumn EOF ;
    public final void entryRuleFXColumn() throws RecognitionException {
        try {
            // InternalFXDsl.g:104:1: ( ruleFXColumn EOF )
            // InternalFXDsl.g:105:1: ruleFXColumn EOF
            {
             before(grammarAccess.getFXColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleFXColumn();

            state._fsp--;

             after(grammarAccess.getFXColumnRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFXColumn"


    // $ANTLR start "ruleFXColumn"
    // InternalFXDsl.g:112:1: ruleFXColumn : ( ( rule__FXColumn__Group__0 ) ) ;
    public final void ruleFXColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:116:2: ( ( ( rule__FXColumn__Group__0 ) ) )
            // InternalFXDsl.g:117:2: ( ( rule__FXColumn__Group__0 ) )
            {
            // InternalFXDsl.g:117:2: ( ( rule__FXColumn__Group__0 ) )
            // InternalFXDsl.g:118:3: ( rule__FXColumn__Group__0 )
            {
             before(grammarAccess.getFXColumnAccess().getGroup()); 
            // InternalFXDsl.g:119:3: ( rule__FXColumn__Group__0 )
            // InternalFXDsl.g:119:4: rule__FXColumn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FXColumn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFXColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFXColumn"


    // $ANTLR start "entryRuleFXModel"
    // InternalFXDsl.g:128:1: entryRuleFXModel : ruleFXModel EOF ;
    public final void entryRuleFXModel() throws RecognitionException {
        try {
            // InternalFXDsl.g:129:1: ( ruleFXModel EOF )
            // InternalFXDsl.g:130:1: ruleFXModel EOF
            {
             before(grammarAccess.getFXModelRule()); 
            pushFollow(FOLLOW_1);
            ruleFXModel();

            state._fsp--;

             after(grammarAccess.getFXModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFXModel"


    // $ANTLR start "ruleFXModel"
    // InternalFXDsl.g:137:1: ruleFXModel : ( ( rule__FXModel__Group__0 ) ) ;
    public final void ruleFXModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:141:2: ( ( ( rule__FXModel__Group__0 ) ) )
            // InternalFXDsl.g:142:2: ( ( rule__FXModel__Group__0 ) )
            {
            // InternalFXDsl.g:142:2: ( ( rule__FXModel__Group__0 ) )
            // InternalFXDsl.g:143:3: ( rule__FXModel__Group__0 )
            {
             before(grammarAccess.getFXModelAccess().getGroup()); 
            // InternalFXDsl.g:144:3: ( rule__FXModel__Group__0 )
            // InternalFXDsl.g:144:4: rule__FXModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FXModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFXModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFXModel"


    // $ANTLR start "entryRuleFXProperty"
    // InternalFXDsl.g:153:1: entryRuleFXProperty : ruleFXProperty EOF ;
    public final void entryRuleFXProperty() throws RecognitionException {
        try {
            // InternalFXDsl.g:154:1: ( ruleFXProperty EOF )
            // InternalFXDsl.g:155:1: ruleFXProperty EOF
            {
             before(grammarAccess.getFXPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleFXProperty();

            state._fsp--;

             after(grammarAccess.getFXPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFXProperty"


    // $ANTLR start "ruleFXProperty"
    // InternalFXDsl.g:162:1: ruleFXProperty : ( ( rule__FXProperty__Group__0 ) ) ;
    public final void ruleFXProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:166:2: ( ( ( rule__FXProperty__Group__0 ) ) )
            // InternalFXDsl.g:167:2: ( ( rule__FXProperty__Group__0 ) )
            {
            // InternalFXDsl.g:167:2: ( ( rule__FXProperty__Group__0 ) )
            // InternalFXDsl.g:168:3: ( rule__FXProperty__Group__0 )
            {
             before(grammarAccess.getFXPropertyAccess().getGroup()); 
            // InternalFXDsl.g:169:3: ( rule__FXProperty__Group__0 )
            // InternalFXDsl.g:169:4: rule__FXProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FXProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFXPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFXProperty"


    // $ANTLR start "entryRuleEDouble"
    // InternalFXDsl.g:178:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalFXDsl.g:179:1: ( ruleEDouble EOF )
            // InternalFXDsl.g:180:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalFXDsl.g:187:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:191:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalFXDsl.g:192:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalFXDsl.g:192:2: ( ( rule__EDouble__Group__0 ) )
            // InternalFXDsl.g:193:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalFXDsl.g:194:3: ( rule__EDouble__Group__0 )
            // InternalFXDsl.g:194:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "rulePos"
    // InternalFXDsl.g:203:1: rulePos : ( ( rule__Pos__Alternatives ) ) ;
    public final void rulePos() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:207:1: ( ( ( rule__Pos__Alternatives ) ) )
            // InternalFXDsl.g:208:2: ( ( rule__Pos__Alternatives ) )
            {
            // InternalFXDsl.g:208:2: ( ( rule__Pos__Alternatives ) )
            // InternalFXDsl.g:209:3: ( rule__Pos__Alternatives )
            {
             before(grammarAccess.getPosAccess().getAlternatives()); 
            // InternalFXDsl.g:210:3: ( rule__Pos__Alternatives )
            // InternalFXDsl.g:210:4: rule__Pos__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Pos__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPosAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePos"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalFXDsl.g:218:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:222:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalFXDsl.g:223:2: ( RULE_STRING )
                    {
                    // InternalFXDsl.g:223:2: ( RULE_STRING )
                    // InternalFXDsl.g:224:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFXDsl.g:229:2: ( RULE_ID )
                    {
                    // InternalFXDsl.g:229:2: ( RULE_ID )
                    // InternalFXDsl.g:230:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalFXDsl.g:239:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:243:1: ( ( 'E' ) | ( 'e' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalFXDsl.g:244:2: ( 'E' )
                    {
                    // InternalFXDsl.g:244:2: ( 'E' )
                    // InternalFXDsl.g:245:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFXDsl.g:250:2: ( 'e' )
                    {
                    // InternalFXDsl.g:250:2: ( 'e' )
                    // InternalFXDsl.g:251:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__Pos__Alternatives"
    // InternalFXDsl.g:260:1: rule__Pos__Alternatives : ( ( ( 'TOP_LEFT' ) ) | ( ( 'TOP_CENTER' ) ) | ( ( 'TOP_RIGHT' ) ) | ( ( 'CENTER_LEFT' ) ) | ( ( 'CENTER' ) ) | ( ( 'CENTER_RIGHT' ) ) | ( ( 'BOTTOM_LEFT' ) ) | ( ( 'BOTTOM_CENTER' ) ) | ( ( 'BOTTOM_RIGHT' ) ) );
    public final void rule__Pos__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:264:1: ( ( ( 'TOP_LEFT' ) ) | ( ( 'TOP_CENTER' ) ) | ( ( 'TOP_RIGHT' ) ) | ( ( 'CENTER_LEFT' ) ) | ( ( 'CENTER' ) ) | ( ( 'CENTER_RIGHT' ) ) | ( ( 'BOTTOM_LEFT' ) ) | ( ( 'BOTTOM_CENTER' ) ) | ( ( 'BOTTOM_RIGHT' ) ) )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            case 17:
                {
                alt3=5;
                }
                break;
            case 18:
                {
                alt3=6;
                }
                break;
            case 19:
                {
                alt3=7;
                }
                break;
            case 20:
                {
                alt3=8;
                }
                break;
            case 21:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalFXDsl.g:265:2: ( ( 'TOP_LEFT' ) )
                    {
                    // InternalFXDsl.g:265:2: ( ( 'TOP_LEFT' ) )
                    // InternalFXDsl.g:266:3: ( 'TOP_LEFT' )
                    {
                     before(grammarAccess.getPosAccess().getTOP_LEFTEnumLiteralDeclaration_0()); 
                    // InternalFXDsl.g:267:3: ( 'TOP_LEFT' )
                    // InternalFXDsl.g:267:4: 'TOP_LEFT'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getPosAccess().getTOP_LEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFXDsl.g:271:2: ( ( 'TOP_CENTER' ) )
                    {
                    // InternalFXDsl.g:271:2: ( ( 'TOP_CENTER' ) )
                    // InternalFXDsl.g:272:3: ( 'TOP_CENTER' )
                    {
                     before(grammarAccess.getPosAccess().getTOP_CENTEREnumLiteralDeclaration_1()); 
                    // InternalFXDsl.g:273:3: ( 'TOP_CENTER' )
                    // InternalFXDsl.g:273:4: 'TOP_CENTER'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getPosAccess().getTOP_CENTEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFXDsl.g:277:2: ( ( 'TOP_RIGHT' ) )
                    {
                    // InternalFXDsl.g:277:2: ( ( 'TOP_RIGHT' ) )
                    // InternalFXDsl.g:278:3: ( 'TOP_RIGHT' )
                    {
                     before(grammarAccess.getPosAccess().getTOP_RIGHTEnumLiteralDeclaration_2()); 
                    // InternalFXDsl.g:279:3: ( 'TOP_RIGHT' )
                    // InternalFXDsl.g:279:4: 'TOP_RIGHT'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getPosAccess().getTOP_RIGHTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFXDsl.g:283:2: ( ( 'CENTER_LEFT' ) )
                    {
                    // InternalFXDsl.g:283:2: ( ( 'CENTER_LEFT' ) )
                    // InternalFXDsl.g:284:3: ( 'CENTER_LEFT' )
                    {
                     before(grammarAccess.getPosAccess().getCENTER_LEFTEnumLiteralDeclaration_3()); 
                    // InternalFXDsl.g:285:3: ( 'CENTER_LEFT' )
                    // InternalFXDsl.g:285:4: 'CENTER_LEFT'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getPosAccess().getCENTER_LEFTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalFXDsl.g:289:2: ( ( 'CENTER' ) )
                    {
                    // InternalFXDsl.g:289:2: ( ( 'CENTER' ) )
                    // InternalFXDsl.g:290:3: ( 'CENTER' )
                    {
                     before(grammarAccess.getPosAccess().getCENTEREnumLiteralDeclaration_4()); 
                    // InternalFXDsl.g:291:3: ( 'CENTER' )
                    // InternalFXDsl.g:291:4: 'CENTER'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getPosAccess().getCENTEREnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalFXDsl.g:295:2: ( ( 'CENTER_RIGHT' ) )
                    {
                    // InternalFXDsl.g:295:2: ( ( 'CENTER_RIGHT' ) )
                    // InternalFXDsl.g:296:3: ( 'CENTER_RIGHT' )
                    {
                     before(grammarAccess.getPosAccess().getCENTER_RIGHTEnumLiteralDeclaration_5()); 
                    // InternalFXDsl.g:297:3: ( 'CENTER_RIGHT' )
                    // InternalFXDsl.g:297:4: 'CENTER_RIGHT'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getPosAccess().getCENTER_RIGHTEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalFXDsl.g:301:2: ( ( 'BOTTOM_LEFT' ) )
                    {
                    // InternalFXDsl.g:301:2: ( ( 'BOTTOM_LEFT' ) )
                    // InternalFXDsl.g:302:3: ( 'BOTTOM_LEFT' )
                    {
                     before(grammarAccess.getPosAccess().getBOTTOM_LEFTEnumLiteralDeclaration_6()); 
                    // InternalFXDsl.g:303:3: ( 'BOTTOM_LEFT' )
                    // InternalFXDsl.g:303:4: 'BOTTOM_LEFT'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPosAccess().getBOTTOM_LEFTEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalFXDsl.g:307:2: ( ( 'BOTTOM_CENTER' ) )
                    {
                    // InternalFXDsl.g:307:2: ( ( 'BOTTOM_CENTER' ) )
                    // InternalFXDsl.g:308:3: ( 'BOTTOM_CENTER' )
                    {
                     before(grammarAccess.getPosAccess().getBOTTOM_CENTEREnumLiteralDeclaration_7()); 
                    // InternalFXDsl.g:309:3: ( 'BOTTOM_CENTER' )
                    // InternalFXDsl.g:309:4: 'BOTTOM_CENTER'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPosAccess().getBOTTOM_CENTEREnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalFXDsl.g:313:2: ( ( 'BOTTOM_RIGHT' ) )
                    {
                    // InternalFXDsl.g:313:2: ( ( 'BOTTOM_RIGHT' ) )
                    // InternalFXDsl.g:314:3: ( 'BOTTOM_RIGHT' )
                    {
                     before(grammarAccess.getPosAccess().getBOTTOM_RIGHTEnumLiteralDeclaration_8()); 
                    // InternalFXDsl.g:315:3: ( 'BOTTOM_RIGHT' )
                    // InternalFXDsl.g:315:4: 'BOTTOM_RIGHT'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPosAccess().getBOTTOM_RIGHTEnumLiteralDeclaration_8()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pos__Alternatives"


    // $ANTLR start "rule__FXTableView__Group__0"
    // InternalFXDsl.g:323:1: rule__FXTableView__Group__0 : rule__FXTableView__Group__0__Impl rule__FXTableView__Group__1 ;
    public final void rule__FXTableView__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:327:1: ( rule__FXTableView__Group__0__Impl rule__FXTableView__Group__1 )
            // InternalFXDsl.g:328:2: rule__FXTableView__Group__0__Impl rule__FXTableView__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__FXTableView__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXTableView__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__Group__0"


    // $ANTLR start "rule__FXTableView__Group__0__Impl"
    // InternalFXDsl.g:335:1: rule__FXTableView__Group__0__Impl : ( () ) ;
    public final void rule__FXTableView__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:339:1: ( ( () ) )
            // InternalFXDsl.g:340:1: ( () )
            {
            // InternalFXDsl.g:340:1: ( () )
            // InternalFXDsl.g:341:2: ()
            {
             before(grammarAccess.getFXTableViewAccess().getFXTableViewAction_0()); 
            // InternalFXDsl.g:342:2: ()
            // InternalFXDsl.g:342:3: 
            {
            }

             after(grammarAccess.getFXTableViewAccess().getFXTableViewAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__Group__0__Impl"


    // $ANTLR start "rule__FXTableView__Group__1"
    // InternalFXDsl.g:350:1: rule__FXTableView__Group__1 : rule__FXTableView__Group__1__Impl rule__FXTableView__Group__2 ;
    public final void rule__FXTableView__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:354:1: ( rule__FXTableView__Group__1__Impl rule__FXTableView__Group__2 )
            // InternalFXDsl.g:355:2: rule__FXTableView__Group__1__Impl rule__FXTableView__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__FXTableView__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXTableView__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__Group__1"


    // $ANTLR start "rule__FXTableView__Group__1__Impl"
    // InternalFXDsl.g:362:1: rule__FXTableView__Group__1__Impl : ( ( rule__FXTableView__HasFilterAssignment_1 )? ) ;
    public final void rule__FXTableView__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:366:1: ( ( ( rule__FXTableView__HasFilterAssignment_1 )? ) )
            // InternalFXDsl.g:367:1: ( ( rule__FXTableView__HasFilterAssignment_1 )? )
            {
            // InternalFXDsl.g:367:1: ( ( rule__FXTableView__HasFilterAssignment_1 )? )
            // InternalFXDsl.g:368:2: ( rule__FXTableView__HasFilterAssignment_1 )?
            {
             before(grammarAccess.getFXTableViewAccess().getHasFilterAssignment_1()); 
            // InternalFXDsl.g:369:2: ( rule__FXTableView__HasFilterAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==33) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalFXDsl.g:369:3: rule__FXTableView__HasFilterAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FXTableView__HasFilterAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFXTableViewAccess().getHasFilterAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__Group__1__Impl"


    // $ANTLR start "rule__FXTableView__Group__2"
    // InternalFXDsl.g:377:1: rule__FXTableView__Group__2 : rule__FXTableView__Group__2__Impl rule__FXTableView__Group__3 ;
    public final void rule__FXTableView__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:381:1: ( rule__FXTableView__Group__2__Impl rule__FXTableView__Group__3 )
            // InternalFXDsl.g:382:2: rule__FXTableView__Group__2__Impl rule__FXTableView__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__FXTableView__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXTableView__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__Group__2"


    // $ANTLR start "rule__FXTableView__Group__2__Impl"
    // InternalFXDsl.g:389:1: rule__FXTableView__Group__2__Impl : ( ( rule__FXTableView__HasSorterAssignment_2 )? ) ;
    public final void rule__FXTableView__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:393:1: ( ( ( rule__FXTableView__HasSorterAssignment_2 )? ) )
            // InternalFXDsl.g:394:1: ( ( rule__FXTableView__HasSorterAssignment_2 )? )
            {
            // InternalFXDsl.g:394:1: ( ( rule__FXTableView__HasSorterAssignment_2 )? )
            // InternalFXDsl.g:395:2: ( rule__FXTableView__HasSorterAssignment_2 )?
            {
             before(grammarAccess.getFXTableViewAccess().getHasSorterAssignment_2()); 
            // InternalFXDsl.g:396:2: ( rule__FXTableView__HasSorterAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==34) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFXDsl.g:396:3: rule__FXTableView__HasSorterAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FXTableView__HasSorterAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFXTableViewAccess().getHasSorterAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__Group__2__Impl"


    // $ANTLR start "rule__FXTableView__Group__3"
    // InternalFXDsl.g:404:1: rule__FXTableView__Group__3 : rule__FXTableView__Group__3__Impl rule__FXTableView__Group__4 ;
    public final void rule__FXTableView__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:408:1: ( rule__FXTableView__Group__3__Impl rule__FXTableView__Group__4 )
            // InternalFXDsl.g:409:2: rule__FXTableView__Group__3__Impl rule__FXTableView__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__FXTableView__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXTableView__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__Group__3"


    // $ANTLR start "rule__FXTableView__Group__3__Impl"
    // InternalFXDsl.g:416:1: rule__FXTableView__Group__3__Impl : ( 'FXTableView' ) ;
    public final void rule__FXTableView__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:420:1: ( ( 'FXTableView' ) )
            // InternalFXDsl.g:421:1: ( 'FXTableView' )
            {
            // InternalFXDsl.g:421:1: ( 'FXTableView' )
            // InternalFXDsl.g:422:2: 'FXTableView'
            {
             before(grammarAccess.getFXTableViewAccess().getFXTableViewKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFXTableViewAccess().getFXTableViewKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__Group__3__Impl"


    // $ANTLR start "rule__FXTableView__Group__4"
    // InternalFXDsl.g:431:1: rule__FXTableView__Group__4 : rule__FXTableView__Group__4__Impl rule__FXTableView__Group__5 ;
    public final void rule__FXTableView__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:435:1: ( rule__FXTableView__Group__4__Impl rule__FXTableView__Group__5 )
            // InternalFXDsl.g:436:2: rule__FXTableView__Group__4__Impl rule__FXTableView__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__FXTableView__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXTableView__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__Group__4"


    // $ANTLR start "rule__FXTableView__Group__4__Impl"
    // InternalFXDsl.g:443:1: rule__FXTableView__Group__4__Impl : ( ( rule__FXTableView__NameAssignment_4 ) ) ;
    public final void rule__FXTableView__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:447:1: ( ( ( rule__FXTableView__NameAssignment_4 ) ) )
            // InternalFXDsl.g:448:1: ( ( rule__FXTableView__NameAssignment_4 ) )
            {
            // InternalFXDsl.g:448:1: ( ( rule__FXTableView__NameAssignment_4 ) )
            // InternalFXDsl.g:449:2: ( rule__FXTableView__NameAssignment_4 )
            {
             before(grammarAccess.getFXTableViewAccess().getNameAssignment_4()); 
            // InternalFXDsl.g:450:2: ( rule__FXTableView__NameAssignment_4 )
            // InternalFXDsl.g:450:3: rule__FXTableView__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__FXTableView__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFXTableViewAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__Group__4__Impl"


    // $ANTLR start "rule__FXTableView__Group__5"
    // InternalFXDsl.g:458:1: rule__FXTableView__Group__5 : rule__FXTableView__Group__5__Impl rule__FXTableView__Group__6 ;
    public final void rule__FXTableView__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:462:1: ( rule__FXTableView__Group__5__Impl rule__FXTableView__Group__6 )
            // InternalFXDsl.g:463:2: rule__FXTableView__Group__5__Impl rule__FXTableView__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__FXTableView__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXTableView__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__Group__5"


    // $ANTLR start "rule__FXTableView__Group__5__Impl"
    // InternalFXDsl.g:470:1: rule__FXTableView__Group__5__Impl : ( '{' ) ;
    public final void rule__FXTableView__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:474:1: ( ( '{' ) )
            // InternalFXDsl.g:475:1: ( '{' )
            {
            // InternalFXDsl.g:475:1: ( '{' )
            // InternalFXDsl.g:476:2: '{'
            {
             before(grammarAccess.getFXTableViewAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFXTableViewAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__Group__5__Impl"


    // $ANTLR start "rule__FXTableView__Group__6"
    // InternalFXDsl.g:485:1: rule__FXTableView__Group__6 : rule__FXTableView__Group__6__Impl rule__FXTableView__Group__7 ;
    public final void rule__FXTableView__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:489:1: ( rule__FXTableView__Group__6__Impl rule__FXTableView__Group__7 )
            // InternalFXDsl.g:490:2: rule__FXTableView__Group__6__Impl rule__FXTableView__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__FXTableView__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXTableView__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__Group__6"


    // $ANTLR start "rule__FXTableView__Group__6__Impl"
    // InternalFXDsl.g:497:1: rule__FXTableView__Group__6__Impl : ( ( rule__FXTableView__Group_6__0 )? ) ;
    public final void rule__FXTableView__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:501:1: ( ( ( rule__FXTableView__Group_6__0 )? ) )
            // InternalFXDsl.g:502:1: ( ( rule__FXTableView__Group_6__0 )? )
            {
            // InternalFXDsl.g:502:1: ( ( rule__FXTableView__Group_6__0 )? )
            // InternalFXDsl.g:503:2: ( rule__FXTableView__Group_6__0 )?
            {
             before(grammarAccess.getFXTableViewAccess().getGroup_6()); 
            // InternalFXDsl.g:504:2: ( rule__FXTableView__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFXDsl.g:504:3: rule__FXTableView__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FXTableView__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFXTableViewAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__Group__6__Impl"


    // $ANTLR start "rule__FXTableView__Group__7"
    // InternalFXDsl.g:512:1: rule__FXTableView__Group__7 : rule__FXTableView__Group__7__Impl rule__FXTableView__Group__8 ;
    public final void rule__FXTableView__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:516:1: ( rule__FXTableView__Group__7__Impl rule__FXTableView__Group__8 )
            // InternalFXDsl.g:517:2: rule__FXTableView__Group__7__Impl rule__FXTableView__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__FXTableView__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXTableView__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__Group__7"


    // $ANTLR start "rule__FXTableView__Group__7__Impl"
    // InternalFXDsl.g:524:1: rule__FXTableView__Group__7__Impl : ( ( rule__FXTableView__Group_7__0 )? ) ;
    public final void rule__FXTableView__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:528:1: ( ( ( rule__FXTableView__Group_7__0 )? ) )
            // InternalFXDsl.g:529:1: ( ( rule__FXTableView__Group_7__0 )? )
            {
            // InternalFXDsl.g:529:1: ( ( rule__FXTableView__Group_7__0 )? )
            // InternalFXDsl.g:530:2: ( rule__FXTableView__Group_7__0 )?
            {
             before(grammarAccess.getFXTableViewAccess().getGroup_7()); 
            // InternalFXDsl.g:531:2: ( rule__FXTableView__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26||(LA7_0>=35 && LA7_0<=36)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalFXDsl.g:531:3: rule__FXTableView__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FXTableView__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFXTableViewAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__Group__7__Impl"


    // $ANTLR start "rule__FXTableView__Group__8"
    // InternalFXDsl.g:539:1: rule__FXTableView__Group__8 : rule__FXTableView__Group__8__Impl rule__FXTableView__Group__9 ;
    public final void rule__FXTableView__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:543:1: ( rule__FXTableView__Group__8__Impl rule__FXTableView__Group__9 )
            // InternalFXDsl.g:544:2: rule__FXTableView__Group__8__Impl rule__FXTableView__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__FXTableView__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXTableView__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__Group__8"


    // $ANTLR start "rule__FXTableView__Group__8__Impl"
    // InternalFXDsl.g:551:1: rule__FXTableView__Group__8__Impl : ( ( rule__FXTableView__FxEntityAssignment_8 )? ) ;
    public final void rule__FXTableView__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:555:1: ( ( ( rule__FXTableView__FxEntityAssignment_8 )? ) )
            // InternalFXDsl.g:556:1: ( ( rule__FXTableView__FxEntityAssignment_8 )? )
            {
            // InternalFXDsl.g:556:1: ( ( rule__FXTableView__FxEntityAssignment_8 )? )
            // InternalFXDsl.g:557:2: ( rule__FXTableView__FxEntityAssignment_8 )?
            {
             before(grammarAccess.getFXTableViewAccess().getFxEntityAssignment_8()); 
            // InternalFXDsl.g:558:2: ( rule__FXTableView__FxEntityAssignment_8 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFXDsl.g:558:3: rule__FXTableView__FxEntityAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__FXTableView__FxEntityAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFXTableViewAccess().getFxEntityAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__Group__8__Impl"


    // $ANTLR start "rule__FXTableView__Group__9"
    // InternalFXDsl.g:566:1: rule__FXTableView__Group__9 : rule__FXTableView__Group__9__Impl ;
    public final void rule__FXTableView__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:570:1: ( rule__FXTableView__Group__9__Impl )
            // InternalFXDsl.g:571:2: rule__FXTableView__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FXTableView__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__Group__9"


    // $ANTLR start "rule__FXTableView__Group__9__Impl"
    // InternalFXDsl.g:577:1: rule__FXTableView__Group__9__Impl : ( '}' ) ;
    public final void rule__FXTableView__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:581:1: ( ( '}' ) )
            // InternalFXDsl.g:582:1: ( '}' )
            {
            // InternalFXDsl.g:582:1: ( '}' )
            // InternalFXDsl.g:583:2: '}'
            {
             before(grammarAccess.getFXTableViewAccess().getRightCurlyBracketKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFXTableViewAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__Group__9__Impl"


    // $ANTLR start "rule__FXTableView__Group_6__0"
    // InternalFXDsl.g:593:1: rule__FXTableView__Group_6__0 : rule__FXTableView__Group_6__0__Impl rule__FXTableView__Group_6__1 ;
    public final void rule__FXTableView__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:597:1: ( rule__FXTableView__Group_6__0__Impl rule__FXTableView__Group_6__1 )
            // InternalFXDsl.g:598:2: rule__FXTableView__Group_6__0__Impl rule__FXTableView__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__FXTableView__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXTableView__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__Group_6__0"


    // $ANTLR start "rule__FXTableView__Group_6__0__Impl"
    // InternalFXDsl.g:605:1: rule__FXTableView__Group_6__0__Impl : ( 'packagePath' ) ;
    public final void rule__FXTableView__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:609:1: ( ( 'packagePath' ) )
            // InternalFXDsl.g:610:1: ( 'packagePath' )
            {
            // InternalFXDsl.g:610:1: ( 'packagePath' )
            // InternalFXDsl.g:611:2: 'packagePath'
            {
             before(grammarAccess.getFXTableViewAccess().getPackagePathKeyword_6_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFXTableViewAccess().getPackagePathKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__Group_6__0__Impl"


    // $ANTLR start "rule__FXTableView__Group_6__1"
    // InternalFXDsl.g:620:1: rule__FXTableView__Group_6__1 : rule__FXTableView__Group_6__1__Impl ;
    public final void rule__FXTableView__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:624:1: ( rule__FXTableView__Group_6__1__Impl )
            // InternalFXDsl.g:625:2: rule__FXTableView__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FXTableView__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__Group_6__1"


    // $ANTLR start "rule__FXTableView__Group_6__1__Impl"
    // InternalFXDsl.g:631:1: rule__FXTableView__Group_6__1__Impl : ( ( rule__FXTableView__PackagePathAssignment_6_1 ) ) ;
    public final void rule__FXTableView__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:635:1: ( ( ( rule__FXTableView__PackagePathAssignment_6_1 ) ) )
            // InternalFXDsl.g:636:1: ( ( rule__FXTableView__PackagePathAssignment_6_1 ) )
            {
            // InternalFXDsl.g:636:1: ( ( rule__FXTableView__PackagePathAssignment_6_1 ) )
            // InternalFXDsl.g:637:2: ( rule__FXTableView__PackagePathAssignment_6_1 )
            {
             before(grammarAccess.getFXTableViewAccess().getPackagePathAssignment_6_1()); 
            // InternalFXDsl.g:638:2: ( rule__FXTableView__PackagePathAssignment_6_1 )
            // InternalFXDsl.g:638:3: rule__FXTableView__PackagePathAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__FXTableView__PackagePathAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFXTableViewAccess().getPackagePathAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__Group_6__1__Impl"


    // $ANTLR start "rule__FXTableView__Group_7__0"
    // InternalFXDsl.g:647:1: rule__FXTableView__Group_7__0 : rule__FXTableView__Group_7__0__Impl rule__FXTableView__Group_7__1 ;
    public final void rule__FXTableView__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:651:1: ( rule__FXTableView__Group_7__0__Impl rule__FXTableView__Group_7__1 )
            // InternalFXDsl.g:652:2: rule__FXTableView__Group_7__0__Impl rule__FXTableView__Group_7__1
            {
            pushFollow(FOLLOW_7);
            rule__FXTableView__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXTableView__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__Group_7__0"


    // $ANTLR start "rule__FXTableView__Group_7__0__Impl"
    // InternalFXDsl.g:659:1: rule__FXTableView__Group_7__0__Impl : ( ( rule__FXTableView__FxColumnsAssignment_7_0 ) ) ;
    public final void rule__FXTableView__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:663:1: ( ( ( rule__FXTableView__FxColumnsAssignment_7_0 ) ) )
            // InternalFXDsl.g:664:1: ( ( rule__FXTableView__FxColumnsAssignment_7_0 ) )
            {
            // InternalFXDsl.g:664:1: ( ( rule__FXTableView__FxColumnsAssignment_7_0 ) )
            // InternalFXDsl.g:665:2: ( rule__FXTableView__FxColumnsAssignment_7_0 )
            {
             before(grammarAccess.getFXTableViewAccess().getFxColumnsAssignment_7_0()); 
            // InternalFXDsl.g:666:2: ( rule__FXTableView__FxColumnsAssignment_7_0 )
            // InternalFXDsl.g:666:3: rule__FXTableView__FxColumnsAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__FXTableView__FxColumnsAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getFXTableViewAccess().getFxColumnsAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__Group_7__0__Impl"


    // $ANTLR start "rule__FXTableView__Group_7__1"
    // InternalFXDsl.g:674:1: rule__FXTableView__Group_7__1 : rule__FXTableView__Group_7__1__Impl ;
    public final void rule__FXTableView__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:678:1: ( rule__FXTableView__Group_7__1__Impl )
            // InternalFXDsl.g:679:2: rule__FXTableView__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FXTableView__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__Group_7__1"


    // $ANTLR start "rule__FXTableView__Group_7__1__Impl"
    // InternalFXDsl.g:685:1: rule__FXTableView__Group_7__1__Impl : ( ( rule__FXTableView__FxColumnsAssignment_7_1 )* ) ;
    public final void rule__FXTableView__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:689:1: ( ( ( rule__FXTableView__FxColumnsAssignment_7_1 )* ) )
            // InternalFXDsl.g:690:1: ( ( rule__FXTableView__FxColumnsAssignment_7_1 )* )
            {
            // InternalFXDsl.g:690:1: ( ( rule__FXTableView__FxColumnsAssignment_7_1 )* )
            // InternalFXDsl.g:691:2: ( rule__FXTableView__FxColumnsAssignment_7_1 )*
            {
             before(grammarAccess.getFXTableViewAccess().getFxColumnsAssignment_7_1()); 
            // InternalFXDsl.g:692:2: ( rule__FXTableView__FxColumnsAssignment_7_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26||(LA9_0>=35 && LA9_0<=36)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFXDsl.g:692:3: rule__FXTableView__FxColumnsAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__FXTableView__FxColumnsAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getFXTableViewAccess().getFxColumnsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__Group_7__1__Impl"


    // $ANTLR start "rule__FXColumn__Group__0"
    // InternalFXDsl.g:701:1: rule__FXColumn__Group__0 : rule__FXColumn__Group__0__Impl rule__FXColumn__Group__1 ;
    public final void rule__FXColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:705:1: ( rule__FXColumn__Group__0__Impl rule__FXColumn__Group__1 )
            // InternalFXDsl.g:706:2: rule__FXColumn__Group__0__Impl rule__FXColumn__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__FXColumn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXColumn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group__0"


    // $ANTLR start "rule__FXColumn__Group__0__Impl"
    // InternalFXDsl.g:713:1: rule__FXColumn__Group__0__Impl : ( () ) ;
    public final void rule__FXColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:717:1: ( ( () ) )
            // InternalFXDsl.g:718:1: ( () )
            {
            // InternalFXDsl.g:718:1: ( () )
            // InternalFXDsl.g:719:2: ()
            {
             before(grammarAccess.getFXColumnAccess().getFXColumnAction_0()); 
            // InternalFXDsl.g:720:2: ()
            // InternalFXDsl.g:720:3: 
            {
            }

             after(grammarAccess.getFXColumnAccess().getFXColumnAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group__0__Impl"


    // $ANTLR start "rule__FXColumn__Group__1"
    // InternalFXDsl.g:728:1: rule__FXColumn__Group__1 : rule__FXColumn__Group__1__Impl rule__FXColumn__Group__2 ;
    public final void rule__FXColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:732:1: ( rule__FXColumn__Group__1__Impl rule__FXColumn__Group__2 )
            // InternalFXDsl.g:733:2: rule__FXColumn__Group__1__Impl rule__FXColumn__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__FXColumn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXColumn__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group__1"


    // $ANTLR start "rule__FXColumn__Group__1__Impl"
    // InternalFXDsl.g:740:1: rule__FXColumn__Group__1__Impl : ( ( rule__FXColumn__EditableAssignment_1 )? ) ;
    public final void rule__FXColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:744:1: ( ( ( rule__FXColumn__EditableAssignment_1 )? ) )
            // InternalFXDsl.g:745:1: ( ( rule__FXColumn__EditableAssignment_1 )? )
            {
            // InternalFXDsl.g:745:1: ( ( rule__FXColumn__EditableAssignment_1 )? )
            // InternalFXDsl.g:746:2: ( rule__FXColumn__EditableAssignment_1 )?
            {
             before(grammarAccess.getFXColumnAccess().getEditableAssignment_1()); 
            // InternalFXDsl.g:747:2: ( rule__FXColumn__EditableAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==35) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFXDsl.g:747:3: rule__FXColumn__EditableAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FXColumn__EditableAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFXColumnAccess().getEditableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group__1__Impl"


    // $ANTLR start "rule__FXColumn__Group__2"
    // InternalFXDsl.g:755:1: rule__FXColumn__Group__2 : rule__FXColumn__Group__2__Impl rule__FXColumn__Group__3 ;
    public final void rule__FXColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:759:1: ( rule__FXColumn__Group__2__Impl rule__FXColumn__Group__3 )
            // InternalFXDsl.g:760:2: rule__FXColumn__Group__2__Impl rule__FXColumn__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__FXColumn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXColumn__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group__2"


    // $ANTLR start "rule__FXColumn__Group__2__Impl"
    // InternalFXDsl.g:767:1: rule__FXColumn__Group__2__Impl : ( ( rule__FXColumn__UseCustomCellFactoryAssignment_2 )? ) ;
    public final void rule__FXColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:771:1: ( ( ( rule__FXColumn__UseCustomCellFactoryAssignment_2 )? ) )
            // InternalFXDsl.g:772:1: ( ( rule__FXColumn__UseCustomCellFactoryAssignment_2 )? )
            {
            // InternalFXDsl.g:772:1: ( ( rule__FXColumn__UseCustomCellFactoryAssignment_2 )? )
            // InternalFXDsl.g:773:2: ( rule__FXColumn__UseCustomCellFactoryAssignment_2 )?
            {
             before(grammarAccess.getFXColumnAccess().getUseCustomCellFactoryAssignment_2()); 
            // InternalFXDsl.g:774:2: ( rule__FXColumn__UseCustomCellFactoryAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==36) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalFXDsl.g:774:3: rule__FXColumn__UseCustomCellFactoryAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FXColumn__UseCustomCellFactoryAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFXColumnAccess().getUseCustomCellFactoryAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group__2__Impl"


    // $ANTLR start "rule__FXColumn__Group__3"
    // InternalFXDsl.g:782:1: rule__FXColumn__Group__3 : rule__FXColumn__Group__3__Impl rule__FXColumn__Group__4 ;
    public final void rule__FXColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:786:1: ( rule__FXColumn__Group__3__Impl rule__FXColumn__Group__4 )
            // InternalFXDsl.g:787:2: rule__FXColumn__Group__3__Impl rule__FXColumn__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__FXColumn__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXColumn__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group__3"


    // $ANTLR start "rule__FXColumn__Group__3__Impl"
    // InternalFXDsl.g:794:1: rule__FXColumn__Group__3__Impl : ( 'FXColumn' ) ;
    public final void rule__FXColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:798:1: ( ( 'FXColumn' ) )
            // InternalFXDsl.g:799:1: ( 'FXColumn' )
            {
            // InternalFXDsl.g:799:1: ( 'FXColumn' )
            // InternalFXDsl.g:800:2: 'FXColumn'
            {
             before(grammarAccess.getFXColumnAccess().getFXColumnKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFXColumnAccess().getFXColumnKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group__3__Impl"


    // $ANTLR start "rule__FXColumn__Group__4"
    // InternalFXDsl.g:809:1: rule__FXColumn__Group__4 : rule__FXColumn__Group__4__Impl rule__FXColumn__Group__5 ;
    public final void rule__FXColumn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:813:1: ( rule__FXColumn__Group__4__Impl rule__FXColumn__Group__5 )
            // InternalFXDsl.g:814:2: rule__FXColumn__Group__4__Impl rule__FXColumn__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__FXColumn__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXColumn__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group__4"


    // $ANTLR start "rule__FXColumn__Group__4__Impl"
    // InternalFXDsl.g:821:1: rule__FXColumn__Group__4__Impl : ( ( rule__FXColumn__NameAssignment_4 ) ) ;
    public final void rule__FXColumn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:825:1: ( ( ( rule__FXColumn__NameAssignment_4 ) ) )
            // InternalFXDsl.g:826:1: ( ( rule__FXColumn__NameAssignment_4 ) )
            {
            // InternalFXDsl.g:826:1: ( ( rule__FXColumn__NameAssignment_4 ) )
            // InternalFXDsl.g:827:2: ( rule__FXColumn__NameAssignment_4 )
            {
             before(grammarAccess.getFXColumnAccess().getNameAssignment_4()); 
            // InternalFXDsl.g:828:2: ( rule__FXColumn__NameAssignment_4 )
            // InternalFXDsl.g:828:3: rule__FXColumn__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__FXColumn__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFXColumnAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group__4__Impl"


    // $ANTLR start "rule__FXColumn__Group__5"
    // InternalFXDsl.g:836:1: rule__FXColumn__Group__5 : rule__FXColumn__Group__5__Impl ;
    public final void rule__FXColumn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:840:1: ( rule__FXColumn__Group__5__Impl )
            // InternalFXDsl.g:841:2: rule__FXColumn__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FXColumn__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group__5"


    // $ANTLR start "rule__FXColumn__Group__5__Impl"
    // InternalFXDsl.g:847:1: rule__FXColumn__Group__5__Impl : ( ( rule__FXColumn__Group_5__0 )? ) ;
    public final void rule__FXColumn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:851:1: ( ( ( rule__FXColumn__Group_5__0 )? ) )
            // InternalFXDsl.g:852:1: ( ( rule__FXColumn__Group_5__0 )? )
            {
            // InternalFXDsl.g:852:1: ( ( rule__FXColumn__Group_5__0 )? )
            // InternalFXDsl.g:853:2: ( rule__FXColumn__Group_5__0 )?
            {
             before(grammarAccess.getFXColumnAccess().getGroup_5()); 
            // InternalFXDsl.g:854:2: ( rule__FXColumn__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFXDsl.g:854:3: rule__FXColumn__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FXColumn__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFXColumnAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group__5__Impl"


    // $ANTLR start "rule__FXColumn__Group_5__0"
    // InternalFXDsl.g:863:1: rule__FXColumn__Group_5__0 : rule__FXColumn__Group_5__0__Impl rule__FXColumn__Group_5__1 ;
    public final void rule__FXColumn__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:867:1: ( rule__FXColumn__Group_5__0__Impl rule__FXColumn__Group_5__1 )
            // InternalFXDsl.g:868:2: rule__FXColumn__Group_5__0__Impl rule__FXColumn__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__FXColumn__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXColumn__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group_5__0"


    // $ANTLR start "rule__FXColumn__Group_5__0__Impl"
    // InternalFXDsl.g:875:1: rule__FXColumn__Group_5__0__Impl : ( '{' ) ;
    public final void rule__FXColumn__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:879:1: ( ( '{' ) )
            // InternalFXDsl.g:880:1: ( '{' )
            {
            // InternalFXDsl.g:880:1: ( '{' )
            // InternalFXDsl.g:881:2: '{'
            {
             before(grammarAccess.getFXColumnAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFXColumnAccess().getLeftCurlyBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group_5__0__Impl"


    // $ANTLR start "rule__FXColumn__Group_5__1"
    // InternalFXDsl.g:890:1: rule__FXColumn__Group_5__1 : rule__FXColumn__Group_5__1__Impl rule__FXColumn__Group_5__2 ;
    public final void rule__FXColumn__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:894:1: ( rule__FXColumn__Group_5__1__Impl rule__FXColumn__Group_5__2 )
            // InternalFXDsl.g:895:2: rule__FXColumn__Group_5__1__Impl rule__FXColumn__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__FXColumn__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXColumn__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group_5__1"


    // $ANTLR start "rule__FXColumn__Group_5__1__Impl"
    // InternalFXDsl.g:902:1: rule__FXColumn__Group_5__1__Impl : ( ( rule__FXColumn__Group_5_1__0 )? ) ;
    public final void rule__FXColumn__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:906:1: ( ( ( rule__FXColumn__Group_5_1__0 )? ) )
            // InternalFXDsl.g:907:1: ( ( rule__FXColumn__Group_5_1__0 )? )
            {
            // InternalFXDsl.g:907:1: ( ( rule__FXColumn__Group_5_1__0 )? )
            // InternalFXDsl.g:908:2: ( rule__FXColumn__Group_5_1__0 )?
            {
             before(grammarAccess.getFXColumnAccess().getGroup_5_1()); 
            // InternalFXDsl.g:909:2: ( rule__FXColumn__Group_5_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalFXDsl.g:909:3: rule__FXColumn__Group_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FXColumn__Group_5_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFXColumnAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group_5__1__Impl"


    // $ANTLR start "rule__FXColumn__Group_5__2"
    // InternalFXDsl.g:917:1: rule__FXColumn__Group_5__2 : rule__FXColumn__Group_5__2__Impl rule__FXColumn__Group_5__3 ;
    public final void rule__FXColumn__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:921:1: ( rule__FXColumn__Group_5__2__Impl rule__FXColumn__Group_5__3 )
            // InternalFXDsl.g:922:2: rule__FXColumn__Group_5__2__Impl rule__FXColumn__Group_5__3
            {
            pushFollow(FOLLOW_9);
            rule__FXColumn__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXColumn__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group_5__2"


    // $ANTLR start "rule__FXColumn__Group_5__2__Impl"
    // InternalFXDsl.g:929:1: rule__FXColumn__Group_5__2__Impl : ( ( rule__FXColumn__Group_5_2__0 )? ) ;
    public final void rule__FXColumn__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:933:1: ( ( ( rule__FXColumn__Group_5_2__0 )? ) )
            // InternalFXDsl.g:934:1: ( ( rule__FXColumn__Group_5_2__0 )? )
            {
            // InternalFXDsl.g:934:1: ( ( rule__FXColumn__Group_5_2__0 )? )
            // InternalFXDsl.g:935:2: ( rule__FXColumn__Group_5_2__0 )?
            {
             before(grammarAccess.getFXColumnAccess().getGroup_5_2()); 
            // InternalFXDsl.g:936:2: ( rule__FXColumn__Group_5_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFXDsl.g:936:3: rule__FXColumn__Group_5_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FXColumn__Group_5_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFXColumnAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group_5__2__Impl"


    // $ANTLR start "rule__FXColumn__Group_5__3"
    // InternalFXDsl.g:944:1: rule__FXColumn__Group_5__3 : rule__FXColumn__Group_5__3__Impl rule__FXColumn__Group_5__4 ;
    public final void rule__FXColumn__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:948:1: ( rule__FXColumn__Group_5__3__Impl rule__FXColumn__Group_5__4 )
            // InternalFXDsl.g:949:2: rule__FXColumn__Group_5__3__Impl rule__FXColumn__Group_5__4
            {
            pushFollow(FOLLOW_9);
            rule__FXColumn__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXColumn__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group_5__3"


    // $ANTLR start "rule__FXColumn__Group_5__3__Impl"
    // InternalFXDsl.g:956:1: rule__FXColumn__Group_5__3__Impl : ( ( rule__FXColumn__Group_5_3__0 )? ) ;
    public final void rule__FXColumn__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:960:1: ( ( ( rule__FXColumn__Group_5_3__0 )? ) )
            // InternalFXDsl.g:961:1: ( ( rule__FXColumn__Group_5_3__0 )? )
            {
            // InternalFXDsl.g:961:1: ( ( rule__FXColumn__Group_5_3__0 )? )
            // InternalFXDsl.g:962:2: ( rule__FXColumn__Group_5_3__0 )?
            {
             before(grammarAccess.getFXColumnAccess().getGroup_5_3()); 
            // InternalFXDsl.g:963:2: ( rule__FXColumn__Group_5_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalFXDsl.g:963:3: rule__FXColumn__Group_5_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FXColumn__Group_5_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFXColumnAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group_5__3__Impl"


    // $ANTLR start "rule__FXColumn__Group_5__4"
    // InternalFXDsl.g:971:1: rule__FXColumn__Group_5__4 : rule__FXColumn__Group_5__4__Impl ;
    public final void rule__FXColumn__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:975:1: ( rule__FXColumn__Group_5__4__Impl )
            // InternalFXDsl.g:976:2: rule__FXColumn__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FXColumn__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group_5__4"


    // $ANTLR start "rule__FXColumn__Group_5__4__Impl"
    // InternalFXDsl.g:982:1: rule__FXColumn__Group_5__4__Impl : ( '}' ) ;
    public final void rule__FXColumn__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:986:1: ( ( '}' ) )
            // InternalFXDsl.g:987:1: ( '}' )
            {
            // InternalFXDsl.g:987:1: ( '}' )
            // InternalFXDsl.g:988:2: '}'
            {
             before(grammarAccess.getFXColumnAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFXColumnAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group_5__4__Impl"


    // $ANTLR start "rule__FXColumn__Group_5_1__0"
    // InternalFXDsl.g:998:1: rule__FXColumn__Group_5_1__0 : rule__FXColumn__Group_5_1__0__Impl rule__FXColumn__Group_5_1__1 ;
    public final void rule__FXColumn__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1002:1: ( rule__FXColumn__Group_5_1__0__Impl rule__FXColumn__Group_5_1__1 )
            // InternalFXDsl.g:1003:2: rule__FXColumn__Group_5_1__0__Impl rule__FXColumn__Group_5_1__1
            {
            pushFollow(FOLLOW_10);
            rule__FXColumn__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXColumn__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group_5_1__0"


    // $ANTLR start "rule__FXColumn__Group_5_1__0__Impl"
    // InternalFXDsl.g:1010:1: rule__FXColumn__Group_5_1__0__Impl : ( 'width' ) ;
    public final void rule__FXColumn__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1014:1: ( ( 'width' ) )
            // InternalFXDsl.g:1015:1: ( 'width' )
            {
            // InternalFXDsl.g:1015:1: ( 'width' )
            // InternalFXDsl.g:1016:2: 'width'
            {
             before(grammarAccess.getFXColumnAccess().getWidthKeyword_5_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFXColumnAccess().getWidthKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group_5_1__0__Impl"


    // $ANTLR start "rule__FXColumn__Group_5_1__1"
    // InternalFXDsl.g:1025:1: rule__FXColumn__Group_5_1__1 : rule__FXColumn__Group_5_1__1__Impl ;
    public final void rule__FXColumn__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1029:1: ( rule__FXColumn__Group_5_1__1__Impl )
            // InternalFXDsl.g:1030:2: rule__FXColumn__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FXColumn__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group_5_1__1"


    // $ANTLR start "rule__FXColumn__Group_5_1__1__Impl"
    // InternalFXDsl.g:1036:1: rule__FXColumn__Group_5_1__1__Impl : ( ( rule__FXColumn__WidthAssignment_5_1_1 ) ) ;
    public final void rule__FXColumn__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1040:1: ( ( ( rule__FXColumn__WidthAssignment_5_1_1 ) ) )
            // InternalFXDsl.g:1041:1: ( ( rule__FXColumn__WidthAssignment_5_1_1 ) )
            {
            // InternalFXDsl.g:1041:1: ( ( rule__FXColumn__WidthAssignment_5_1_1 ) )
            // InternalFXDsl.g:1042:2: ( rule__FXColumn__WidthAssignment_5_1_1 )
            {
             before(grammarAccess.getFXColumnAccess().getWidthAssignment_5_1_1()); 
            // InternalFXDsl.g:1043:2: ( rule__FXColumn__WidthAssignment_5_1_1 )
            // InternalFXDsl.g:1043:3: rule__FXColumn__WidthAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FXColumn__WidthAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFXColumnAccess().getWidthAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group_5_1__1__Impl"


    // $ANTLR start "rule__FXColumn__Group_5_2__0"
    // InternalFXDsl.g:1052:1: rule__FXColumn__Group_5_2__0 : rule__FXColumn__Group_5_2__0__Impl rule__FXColumn__Group_5_2__1 ;
    public final void rule__FXColumn__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1056:1: ( rule__FXColumn__Group_5_2__0__Impl rule__FXColumn__Group_5_2__1 )
            // InternalFXDsl.g:1057:2: rule__FXColumn__Group_5_2__0__Impl rule__FXColumn__Group_5_2__1
            {
            pushFollow(FOLLOW_11);
            rule__FXColumn__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXColumn__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group_5_2__0"


    // $ANTLR start "rule__FXColumn__Group_5_2__0__Impl"
    // InternalFXDsl.g:1064:1: rule__FXColumn__Group_5_2__0__Impl : ( 'alignment' ) ;
    public final void rule__FXColumn__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1068:1: ( ( 'alignment' ) )
            // InternalFXDsl.g:1069:1: ( 'alignment' )
            {
            // InternalFXDsl.g:1069:1: ( 'alignment' )
            // InternalFXDsl.g:1070:2: 'alignment'
            {
             before(grammarAccess.getFXColumnAccess().getAlignmentKeyword_5_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFXColumnAccess().getAlignmentKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group_5_2__0__Impl"


    // $ANTLR start "rule__FXColumn__Group_5_2__1"
    // InternalFXDsl.g:1079:1: rule__FXColumn__Group_5_2__1 : rule__FXColumn__Group_5_2__1__Impl ;
    public final void rule__FXColumn__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1083:1: ( rule__FXColumn__Group_5_2__1__Impl )
            // InternalFXDsl.g:1084:2: rule__FXColumn__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FXColumn__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group_5_2__1"


    // $ANTLR start "rule__FXColumn__Group_5_2__1__Impl"
    // InternalFXDsl.g:1090:1: rule__FXColumn__Group_5_2__1__Impl : ( ( rule__FXColumn__AlignmentAssignment_5_2_1 ) ) ;
    public final void rule__FXColumn__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1094:1: ( ( ( rule__FXColumn__AlignmentAssignment_5_2_1 ) ) )
            // InternalFXDsl.g:1095:1: ( ( rule__FXColumn__AlignmentAssignment_5_2_1 ) )
            {
            // InternalFXDsl.g:1095:1: ( ( rule__FXColumn__AlignmentAssignment_5_2_1 ) )
            // InternalFXDsl.g:1096:2: ( rule__FXColumn__AlignmentAssignment_5_2_1 )
            {
             before(grammarAccess.getFXColumnAccess().getAlignmentAssignment_5_2_1()); 
            // InternalFXDsl.g:1097:2: ( rule__FXColumn__AlignmentAssignment_5_2_1 )
            // InternalFXDsl.g:1097:3: rule__FXColumn__AlignmentAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FXColumn__AlignmentAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFXColumnAccess().getAlignmentAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group_5_2__1__Impl"


    // $ANTLR start "rule__FXColumn__Group_5_3__0"
    // InternalFXDsl.g:1106:1: rule__FXColumn__Group_5_3__0 : rule__FXColumn__Group_5_3__0__Impl rule__FXColumn__Group_5_3__1 ;
    public final void rule__FXColumn__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1110:1: ( rule__FXColumn__Group_5_3__0__Impl rule__FXColumn__Group_5_3__1 )
            // InternalFXDsl.g:1111:2: rule__FXColumn__Group_5_3__0__Impl rule__FXColumn__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__FXColumn__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXColumn__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group_5_3__0"


    // $ANTLR start "rule__FXColumn__Group_5_3__0__Impl"
    // InternalFXDsl.g:1118:1: rule__FXColumn__Group_5_3__0__Impl : ( 'associatedFXProperty' ) ;
    public final void rule__FXColumn__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1122:1: ( ( 'associatedFXProperty' ) )
            // InternalFXDsl.g:1123:1: ( 'associatedFXProperty' )
            {
            // InternalFXDsl.g:1123:1: ( 'associatedFXProperty' )
            // InternalFXDsl.g:1124:2: 'associatedFXProperty'
            {
             before(grammarAccess.getFXColumnAccess().getAssociatedFXPropertyKeyword_5_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFXColumnAccess().getAssociatedFXPropertyKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group_5_3__0__Impl"


    // $ANTLR start "rule__FXColumn__Group_5_3__1"
    // InternalFXDsl.g:1133:1: rule__FXColumn__Group_5_3__1 : rule__FXColumn__Group_5_3__1__Impl ;
    public final void rule__FXColumn__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1137:1: ( rule__FXColumn__Group_5_3__1__Impl )
            // InternalFXDsl.g:1138:2: rule__FXColumn__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FXColumn__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group_5_3__1"


    // $ANTLR start "rule__FXColumn__Group_5_3__1__Impl"
    // InternalFXDsl.g:1144:1: rule__FXColumn__Group_5_3__1__Impl : ( ( rule__FXColumn__AssociatedFXPropertyAssignment_5_3_1 ) ) ;
    public final void rule__FXColumn__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1148:1: ( ( ( rule__FXColumn__AssociatedFXPropertyAssignment_5_3_1 ) ) )
            // InternalFXDsl.g:1149:1: ( ( rule__FXColumn__AssociatedFXPropertyAssignment_5_3_1 ) )
            {
            // InternalFXDsl.g:1149:1: ( ( rule__FXColumn__AssociatedFXPropertyAssignment_5_3_1 ) )
            // InternalFXDsl.g:1150:2: ( rule__FXColumn__AssociatedFXPropertyAssignment_5_3_1 )
            {
             before(grammarAccess.getFXColumnAccess().getAssociatedFXPropertyAssignment_5_3_1()); 
            // InternalFXDsl.g:1151:2: ( rule__FXColumn__AssociatedFXPropertyAssignment_5_3_1 )
            // InternalFXDsl.g:1151:3: rule__FXColumn__AssociatedFXPropertyAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FXColumn__AssociatedFXPropertyAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFXColumnAccess().getAssociatedFXPropertyAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__Group_5_3__1__Impl"


    // $ANTLR start "rule__FXModel__Group__0"
    // InternalFXDsl.g:1160:1: rule__FXModel__Group__0 : rule__FXModel__Group__0__Impl rule__FXModel__Group__1 ;
    public final void rule__FXModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1164:1: ( rule__FXModel__Group__0__Impl rule__FXModel__Group__1 )
            // InternalFXDsl.g:1165:2: rule__FXModel__Group__0__Impl rule__FXModel__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__FXModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXModel__Group__0"


    // $ANTLR start "rule__FXModel__Group__0__Impl"
    // InternalFXDsl.g:1172:1: rule__FXModel__Group__0__Impl : ( () ) ;
    public final void rule__FXModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1176:1: ( ( () ) )
            // InternalFXDsl.g:1177:1: ( () )
            {
            // InternalFXDsl.g:1177:1: ( () )
            // InternalFXDsl.g:1178:2: ()
            {
             before(grammarAccess.getFXModelAccess().getFXModelAction_0()); 
            // InternalFXDsl.g:1179:2: ()
            // InternalFXDsl.g:1179:3: 
            {
            }

             after(grammarAccess.getFXModelAccess().getFXModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXModel__Group__0__Impl"


    // $ANTLR start "rule__FXModel__Group__1"
    // InternalFXDsl.g:1187:1: rule__FXModel__Group__1 : rule__FXModel__Group__1__Impl rule__FXModel__Group__2 ;
    public final void rule__FXModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1191:1: ( rule__FXModel__Group__1__Impl rule__FXModel__Group__2 )
            // InternalFXDsl.g:1192:2: rule__FXModel__Group__1__Impl rule__FXModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__FXModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXModel__Group__1"


    // $ANTLR start "rule__FXModel__Group__1__Impl"
    // InternalFXDsl.g:1199:1: rule__FXModel__Group__1__Impl : ( 'FXModel' ) ;
    public final void rule__FXModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1203:1: ( ( 'FXModel' ) )
            // InternalFXDsl.g:1204:1: ( 'FXModel' )
            {
            // InternalFXDsl.g:1204:1: ( 'FXModel' )
            // InternalFXDsl.g:1205:2: 'FXModel'
            {
             before(grammarAccess.getFXModelAccess().getFXModelKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFXModelAccess().getFXModelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXModel__Group__1__Impl"


    // $ANTLR start "rule__FXModel__Group__2"
    // InternalFXDsl.g:1214:1: rule__FXModel__Group__2 : rule__FXModel__Group__2__Impl rule__FXModel__Group__3 ;
    public final void rule__FXModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1218:1: ( rule__FXModel__Group__2__Impl rule__FXModel__Group__3 )
            // InternalFXDsl.g:1219:2: rule__FXModel__Group__2__Impl rule__FXModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__FXModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXModel__Group__2"


    // $ANTLR start "rule__FXModel__Group__2__Impl"
    // InternalFXDsl.g:1226:1: rule__FXModel__Group__2__Impl : ( ( rule__FXModel__NameAssignment_2 ) ) ;
    public final void rule__FXModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1230:1: ( ( ( rule__FXModel__NameAssignment_2 ) ) )
            // InternalFXDsl.g:1231:1: ( ( rule__FXModel__NameAssignment_2 ) )
            {
            // InternalFXDsl.g:1231:1: ( ( rule__FXModel__NameAssignment_2 ) )
            // InternalFXDsl.g:1232:2: ( rule__FXModel__NameAssignment_2 )
            {
             before(grammarAccess.getFXModelAccess().getNameAssignment_2()); 
            // InternalFXDsl.g:1233:2: ( rule__FXModel__NameAssignment_2 )
            // InternalFXDsl.g:1233:3: rule__FXModel__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FXModel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFXModelAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXModel__Group__2__Impl"


    // $ANTLR start "rule__FXModel__Group__3"
    // InternalFXDsl.g:1241:1: rule__FXModel__Group__3 : rule__FXModel__Group__3__Impl rule__FXModel__Group__4 ;
    public final void rule__FXModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1245:1: ( rule__FXModel__Group__3__Impl rule__FXModel__Group__4 )
            // InternalFXDsl.g:1246:2: rule__FXModel__Group__3__Impl rule__FXModel__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__FXModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXModel__Group__3"


    // $ANTLR start "rule__FXModel__Group__3__Impl"
    // InternalFXDsl.g:1253:1: rule__FXModel__Group__3__Impl : ( '{' ) ;
    public final void rule__FXModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1257:1: ( ( '{' ) )
            // InternalFXDsl.g:1258:1: ( '{' )
            {
            // InternalFXDsl.g:1258:1: ( '{' )
            // InternalFXDsl.g:1259:2: '{'
            {
             before(grammarAccess.getFXModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFXModelAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXModel__Group__3__Impl"


    // $ANTLR start "rule__FXModel__Group__4"
    // InternalFXDsl.g:1268:1: rule__FXModel__Group__4 : rule__FXModel__Group__4__Impl rule__FXModel__Group__5 ;
    public final void rule__FXModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1272:1: ( rule__FXModel__Group__4__Impl rule__FXModel__Group__5 )
            // InternalFXDsl.g:1273:2: rule__FXModel__Group__4__Impl rule__FXModel__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__FXModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXModel__Group__4"


    // $ANTLR start "rule__FXModel__Group__4__Impl"
    // InternalFXDsl.g:1280:1: rule__FXModel__Group__4__Impl : ( ( rule__FXModel__FxPropertiesAssignment_4 ) ) ;
    public final void rule__FXModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1284:1: ( ( ( rule__FXModel__FxPropertiesAssignment_4 ) ) )
            // InternalFXDsl.g:1285:1: ( ( rule__FXModel__FxPropertiesAssignment_4 ) )
            {
            // InternalFXDsl.g:1285:1: ( ( rule__FXModel__FxPropertiesAssignment_4 ) )
            // InternalFXDsl.g:1286:2: ( rule__FXModel__FxPropertiesAssignment_4 )
            {
             before(grammarAccess.getFXModelAccess().getFxPropertiesAssignment_4()); 
            // InternalFXDsl.g:1287:2: ( rule__FXModel__FxPropertiesAssignment_4 )
            // InternalFXDsl.g:1287:3: rule__FXModel__FxPropertiesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__FXModel__FxPropertiesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFXModelAccess().getFxPropertiesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXModel__Group__4__Impl"


    // $ANTLR start "rule__FXModel__Group__5"
    // InternalFXDsl.g:1295:1: rule__FXModel__Group__5 : rule__FXModel__Group__5__Impl rule__FXModel__Group__6 ;
    public final void rule__FXModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1299:1: ( rule__FXModel__Group__5__Impl rule__FXModel__Group__6 )
            // InternalFXDsl.g:1300:2: rule__FXModel__Group__5__Impl rule__FXModel__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__FXModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXModel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXModel__Group__5"


    // $ANTLR start "rule__FXModel__Group__5__Impl"
    // InternalFXDsl.g:1307:1: rule__FXModel__Group__5__Impl : ( ( rule__FXModel__FxPropertiesAssignment_5 )* ) ;
    public final void rule__FXModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1311:1: ( ( ( rule__FXModel__FxPropertiesAssignment_5 )* ) )
            // InternalFXDsl.g:1312:1: ( ( rule__FXModel__FxPropertiesAssignment_5 )* )
            {
            // InternalFXDsl.g:1312:1: ( ( rule__FXModel__FxPropertiesAssignment_5 )* )
            // InternalFXDsl.g:1313:2: ( rule__FXModel__FxPropertiesAssignment_5 )*
            {
             before(grammarAccess.getFXModelAccess().getFxPropertiesAssignment_5()); 
            // InternalFXDsl.g:1314:2: ( rule__FXModel__FxPropertiesAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFXDsl.g:1314:3: rule__FXModel__FxPropertiesAssignment_5
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__FXModel__FxPropertiesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getFXModelAccess().getFxPropertiesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXModel__Group__5__Impl"


    // $ANTLR start "rule__FXModel__Group__6"
    // InternalFXDsl.g:1322:1: rule__FXModel__Group__6 : rule__FXModel__Group__6__Impl ;
    public final void rule__FXModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1326:1: ( rule__FXModel__Group__6__Impl )
            // InternalFXDsl.g:1327:2: rule__FXModel__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FXModel__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXModel__Group__6"


    // $ANTLR start "rule__FXModel__Group__6__Impl"
    // InternalFXDsl.g:1333:1: rule__FXModel__Group__6__Impl : ( '}' ) ;
    public final void rule__FXModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1337:1: ( ( '}' ) )
            // InternalFXDsl.g:1338:1: ( '}' )
            {
            // InternalFXDsl.g:1338:1: ( '}' )
            // InternalFXDsl.g:1339:2: '}'
            {
             before(grammarAccess.getFXModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFXModelAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXModel__Group__6__Impl"


    // $ANTLR start "rule__FXProperty__Group__0"
    // InternalFXDsl.g:1349:1: rule__FXProperty__Group__0 : rule__FXProperty__Group__0__Impl rule__FXProperty__Group__1 ;
    public final void rule__FXProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1353:1: ( rule__FXProperty__Group__0__Impl rule__FXProperty__Group__1 )
            // InternalFXDsl.g:1354:2: rule__FXProperty__Group__0__Impl rule__FXProperty__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__FXProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXProperty__Group__0"


    // $ANTLR start "rule__FXProperty__Group__0__Impl"
    // InternalFXDsl.g:1361:1: rule__FXProperty__Group__0__Impl : ( () ) ;
    public final void rule__FXProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1365:1: ( ( () ) )
            // InternalFXDsl.g:1366:1: ( () )
            {
            // InternalFXDsl.g:1366:1: ( () )
            // InternalFXDsl.g:1367:2: ()
            {
             before(grammarAccess.getFXPropertyAccess().getFXPropertyAction_0()); 
            // InternalFXDsl.g:1368:2: ()
            // InternalFXDsl.g:1368:3: 
            {
            }

             after(grammarAccess.getFXPropertyAccess().getFXPropertyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXProperty__Group__0__Impl"


    // $ANTLR start "rule__FXProperty__Group__1"
    // InternalFXDsl.g:1376:1: rule__FXProperty__Group__1 : rule__FXProperty__Group__1__Impl rule__FXProperty__Group__2 ;
    public final void rule__FXProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1380:1: ( rule__FXProperty__Group__1__Impl rule__FXProperty__Group__2 )
            // InternalFXDsl.g:1381:2: rule__FXProperty__Group__1__Impl rule__FXProperty__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__FXProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FXProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXProperty__Group__1"


    // $ANTLR start "rule__FXProperty__Group__1__Impl"
    // InternalFXDsl.g:1388:1: rule__FXProperty__Group__1__Impl : ( ( rule__FXProperty__TypeAssignment_1 ) ) ;
    public final void rule__FXProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1392:1: ( ( ( rule__FXProperty__TypeAssignment_1 ) ) )
            // InternalFXDsl.g:1393:1: ( ( rule__FXProperty__TypeAssignment_1 ) )
            {
            // InternalFXDsl.g:1393:1: ( ( rule__FXProperty__TypeAssignment_1 ) )
            // InternalFXDsl.g:1394:2: ( rule__FXProperty__TypeAssignment_1 )
            {
             before(grammarAccess.getFXPropertyAccess().getTypeAssignment_1()); 
            // InternalFXDsl.g:1395:2: ( rule__FXProperty__TypeAssignment_1 )
            // InternalFXDsl.g:1395:3: rule__FXProperty__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FXProperty__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFXPropertyAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXProperty__Group__1__Impl"


    // $ANTLR start "rule__FXProperty__Group__2"
    // InternalFXDsl.g:1403:1: rule__FXProperty__Group__2 : rule__FXProperty__Group__2__Impl ;
    public final void rule__FXProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1407:1: ( rule__FXProperty__Group__2__Impl )
            // InternalFXDsl.g:1408:2: rule__FXProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FXProperty__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXProperty__Group__2"


    // $ANTLR start "rule__FXProperty__Group__2__Impl"
    // InternalFXDsl.g:1414:1: rule__FXProperty__Group__2__Impl : ( ( rule__FXProperty__NameAssignment_2 ) ) ;
    public final void rule__FXProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1418:1: ( ( ( rule__FXProperty__NameAssignment_2 ) ) )
            // InternalFXDsl.g:1419:1: ( ( rule__FXProperty__NameAssignment_2 ) )
            {
            // InternalFXDsl.g:1419:1: ( ( rule__FXProperty__NameAssignment_2 ) )
            // InternalFXDsl.g:1420:2: ( rule__FXProperty__NameAssignment_2 )
            {
             before(grammarAccess.getFXPropertyAccess().getNameAssignment_2()); 
            // InternalFXDsl.g:1421:2: ( rule__FXProperty__NameAssignment_2 )
            // InternalFXDsl.g:1421:3: rule__FXProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FXProperty__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFXPropertyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXProperty__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalFXDsl.g:1430:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1434:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalFXDsl.g:1435:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalFXDsl.g:1442:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1446:1: ( ( ( '-' )? ) )
            // InternalFXDsl.g:1447:1: ( ( '-' )? )
            {
            // InternalFXDsl.g:1447:1: ( ( '-' )? )
            // InternalFXDsl.g:1448:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalFXDsl.g:1449:2: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalFXDsl.g:1449:3: '-'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalFXDsl.g:1457:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1461:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalFXDsl.g:1462:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalFXDsl.g:1469:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1473:1: ( ( ( RULE_INT )? ) )
            // InternalFXDsl.g:1474:1: ( ( RULE_INT )? )
            {
            // InternalFXDsl.g:1474:1: ( ( RULE_INT )? )
            // InternalFXDsl.g:1475:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalFXDsl.g:1476:2: ( RULE_INT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalFXDsl.g:1476:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalFXDsl.g:1484:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1488:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalFXDsl.g:1489:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalFXDsl.g:1496:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1500:1: ( ( '.' ) )
            // InternalFXDsl.g:1501:1: ( '.' )
            {
            // InternalFXDsl.g:1501:1: ( '.' )
            // InternalFXDsl.g:1502:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalFXDsl.g:1511:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1515:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalFXDsl.g:1516:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalFXDsl.g:1523:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1527:1: ( ( RULE_INT ) )
            // InternalFXDsl.g:1528:1: ( RULE_INT )
            {
            // InternalFXDsl.g:1528:1: ( RULE_INT )
            // InternalFXDsl.g:1529:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalFXDsl.g:1538:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1542:1: ( rule__EDouble__Group__4__Impl )
            // InternalFXDsl.g:1543:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalFXDsl.g:1549:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1553:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalFXDsl.g:1554:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalFXDsl.g:1554:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalFXDsl.g:1555:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalFXDsl.g:1556:2: ( rule__EDouble__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=11 && LA19_0<=12)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalFXDsl.g:1556:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalFXDsl.g:1565:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1569:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalFXDsl.g:1570:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalFXDsl.g:1577:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1581:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalFXDsl.g:1582:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalFXDsl.g:1582:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalFXDsl.g:1583:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalFXDsl.g:1584:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalFXDsl.g:1584:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalFXDsl.g:1592:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1596:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalFXDsl.g:1597:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_17);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalFXDsl.g:1604:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1608:1: ( ( ( '-' )? ) )
            // InternalFXDsl.g:1609:1: ( ( '-' )? )
            {
            // InternalFXDsl.g:1609:1: ( ( '-' )? )
            // InternalFXDsl.g:1610:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalFXDsl.g:1611:2: ( '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalFXDsl.g:1611:3: '-'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalFXDsl.g:1619:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1623:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalFXDsl.g:1624:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalFXDsl.g:1630:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1634:1: ( ( RULE_INT ) )
            // InternalFXDsl.g:1635:1: ( RULE_INT )
            {
            // InternalFXDsl.g:1635:1: ( RULE_INT )
            // InternalFXDsl.g:1636:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__FXTableView__HasFilterAssignment_1"
    // InternalFXDsl.g:1646:1: rule__FXTableView__HasFilterAssignment_1 : ( ( 'hasFilter' ) ) ;
    public final void rule__FXTableView__HasFilterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1650:1: ( ( ( 'hasFilter' ) ) )
            // InternalFXDsl.g:1651:2: ( ( 'hasFilter' ) )
            {
            // InternalFXDsl.g:1651:2: ( ( 'hasFilter' ) )
            // InternalFXDsl.g:1652:3: ( 'hasFilter' )
            {
             before(grammarAccess.getFXTableViewAccess().getHasFilterHasFilterKeyword_1_0()); 
            // InternalFXDsl.g:1653:3: ( 'hasFilter' )
            // InternalFXDsl.g:1654:4: 'hasFilter'
            {
             before(grammarAccess.getFXTableViewAccess().getHasFilterHasFilterKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFXTableViewAccess().getHasFilterHasFilterKeyword_1_0()); 

            }

             after(grammarAccess.getFXTableViewAccess().getHasFilterHasFilterKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__HasFilterAssignment_1"


    // $ANTLR start "rule__FXTableView__HasSorterAssignment_2"
    // InternalFXDsl.g:1665:1: rule__FXTableView__HasSorterAssignment_2 : ( ( 'hasSorter' ) ) ;
    public final void rule__FXTableView__HasSorterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1669:1: ( ( ( 'hasSorter' ) ) )
            // InternalFXDsl.g:1670:2: ( ( 'hasSorter' ) )
            {
            // InternalFXDsl.g:1670:2: ( ( 'hasSorter' ) )
            // InternalFXDsl.g:1671:3: ( 'hasSorter' )
            {
             before(grammarAccess.getFXTableViewAccess().getHasSorterHasSorterKeyword_2_0()); 
            // InternalFXDsl.g:1672:3: ( 'hasSorter' )
            // InternalFXDsl.g:1673:4: 'hasSorter'
            {
             before(grammarAccess.getFXTableViewAccess().getHasSorterHasSorterKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFXTableViewAccess().getHasSorterHasSorterKeyword_2_0()); 

            }

             after(grammarAccess.getFXTableViewAccess().getHasSorterHasSorterKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__HasSorterAssignment_2"


    // $ANTLR start "rule__FXTableView__NameAssignment_4"
    // InternalFXDsl.g:1684:1: rule__FXTableView__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__FXTableView__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1688:1: ( ( ruleEString ) )
            // InternalFXDsl.g:1689:2: ( ruleEString )
            {
            // InternalFXDsl.g:1689:2: ( ruleEString )
            // InternalFXDsl.g:1690:3: ruleEString
            {
             before(grammarAccess.getFXTableViewAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFXTableViewAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__NameAssignment_4"


    // $ANTLR start "rule__FXTableView__PackagePathAssignment_6_1"
    // InternalFXDsl.g:1699:1: rule__FXTableView__PackagePathAssignment_6_1 : ( ruleEString ) ;
    public final void rule__FXTableView__PackagePathAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1703:1: ( ( ruleEString ) )
            // InternalFXDsl.g:1704:2: ( ruleEString )
            {
            // InternalFXDsl.g:1704:2: ( ruleEString )
            // InternalFXDsl.g:1705:3: ruleEString
            {
             before(grammarAccess.getFXTableViewAccess().getPackagePathEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFXTableViewAccess().getPackagePathEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__PackagePathAssignment_6_1"


    // $ANTLR start "rule__FXTableView__FxColumnsAssignment_7_0"
    // InternalFXDsl.g:1714:1: rule__FXTableView__FxColumnsAssignment_7_0 : ( ruleFXColumn ) ;
    public final void rule__FXTableView__FxColumnsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1718:1: ( ( ruleFXColumn ) )
            // InternalFXDsl.g:1719:2: ( ruleFXColumn )
            {
            // InternalFXDsl.g:1719:2: ( ruleFXColumn )
            // InternalFXDsl.g:1720:3: ruleFXColumn
            {
             before(grammarAccess.getFXTableViewAccess().getFxColumnsFXColumnParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFXColumn();

            state._fsp--;

             after(grammarAccess.getFXTableViewAccess().getFxColumnsFXColumnParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__FxColumnsAssignment_7_0"


    // $ANTLR start "rule__FXTableView__FxColumnsAssignment_7_1"
    // InternalFXDsl.g:1729:1: rule__FXTableView__FxColumnsAssignment_7_1 : ( ruleFXColumn ) ;
    public final void rule__FXTableView__FxColumnsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1733:1: ( ( ruleFXColumn ) )
            // InternalFXDsl.g:1734:2: ( ruleFXColumn )
            {
            // InternalFXDsl.g:1734:2: ( ruleFXColumn )
            // InternalFXDsl.g:1735:3: ruleFXColumn
            {
             before(grammarAccess.getFXTableViewAccess().getFxColumnsFXColumnParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFXColumn();

            state._fsp--;

             after(grammarAccess.getFXTableViewAccess().getFxColumnsFXColumnParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__FxColumnsAssignment_7_1"


    // $ANTLR start "rule__FXTableView__FxEntityAssignment_8"
    // InternalFXDsl.g:1744:1: rule__FXTableView__FxEntityAssignment_8 : ( ruleFXModel ) ;
    public final void rule__FXTableView__FxEntityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1748:1: ( ( ruleFXModel ) )
            // InternalFXDsl.g:1749:2: ( ruleFXModel )
            {
            // InternalFXDsl.g:1749:2: ( ruleFXModel )
            // InternalFXDsl.g:1750:3: ruleFXModel
            {
             before(grammarAccess.getFXTableViewAccess().getFxEntityFXModelParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleFXModel();

            state._fsp--;

             after(grammarAccess.getFXTableViewAccess().getFxEntityFXModelParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXTableView__FxEntityAssignment_8"


    // $ANTLR start "rule__FXColumn__EditableAssignment_1"
    // InternalFXDsl.g:1759:1: rule__FXColumn__EditableAssignment_1 : ( ( 'editable' ) ) ;
    public final void rule__FXColumn__EditableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1763:1: ( ( ( 'editable' ) ) )
            // InternalFXDsl.g:1764:2: ( ( 'editable' ) )
            {
            // InternalFXDsl.g:1764:2: ( ( 'editable' ) )
            // InternalFXDsl.g:1765:3: ( 'editable' )
            {
             before(grammarAccess.getFXColumnAccess().getEditableEditableKeyword_1_0()); 
            // InternalFXDsl.g:1766:3: ( 'editable' )
            // InternalFXDsl.g:1767:4: 'editable'
            {
             before(grammarAccess.getFXColumnAccess().getEditableEditableKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFXColumnAccess().getEditableEditableKeyword_1_0()); 

            }

             after(grammarAccess.getFXColumnAccess().getEditableEditableKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__EditableAssignment_1"


    // $ANTLR start "rule__FXColumn__UseCustomCellFactoryAssignment_2"
    // InternalFXDsl.g:1778:1: rule__FXColumn__UseCustomCellFactoryAssignment_2 : ( ( 'useCustomCellFactory' ) ) ;
    public final void rule__FXColumn__UseCustomCellFactoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1782:1: ( ( ( 'useCustomCellFactory' ) ) )
            // InternalFXDsl.g:1783:2: ( ( 'useCustomCellFactory' ) )
            {
            // InternalFXDsl.g:1783:2: ( ( 'useCustomCellFactory' ) )
            // InternalFXDsl.g:1784:3: ( 'useCustomCellFactory' )
            {
             before(grammarAccess.getFXColumnAccess().getUseCustomCellFactoryUseCustomCellFactoryKeyword_2_0()); 
            // InternalFXDsl.g:1785:3: ( 'useCustomCellFactory' )
            // InternalFXDsl.g:1786:4: 'useCustomCellFactory'
            {
             before(grammarAccess.getFXColumnAccess().getUseCustomCellFactoryUseCustomCellFactoryKeyword_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFXColumnAccess().getUseCustomCellFactoryUseCustomCellFactoryKeyword_2_0()); 

            }

             after(grammarAccess.getFXColumnAccess().getUseCustomCellFactoryUseCustomCellFactoryKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__UseCustomCellFactoryAssignment_2"


    // $ANTLR start "rule__FXColumn__NameAssignment_4"
    // InternalFXDsl.g:1797:1: rule__FXColumn__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__FXColumn__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1801:1: ( ( ruleEString ) )
            // InternalFXDsl.g:1802:2: ( ruleEString )
            {
            // InternalFXDsl.g:1802:2: ( ruleEString )
            // InternalFXDsl.g:1803:3: ruleEString
            {
             before(grammarAccess.getFXColumnAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFXColumnAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__NameAssignment_4"


    // $ANTLR start "rule__FXColumn__WidthAssignment_5_1_1"
    // InternalFXDsl.g:1812:1: rule__FXColumn__WidthAssignment_5_1_1 : ( ruleEDouble ) ;
    public final void rule__FXColumn__WidthAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1816:1: ( ( ruleEDouble ) )
            // InternalFXDsl.g:1817:2: ( ruleEDouble )
            {
            // InternalFXDsl.g:1817:2: ( ruleEDouble )
            // InternalFXDsl.g:1818:3: ruleEDouble
            {
             before(grammarAccess.getFXColumnAccess().getWidthEDoubleParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getFXColumnAccess().getWidthEDoubleParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__WidthAssignment_5_1_1"


    // $ANTLR start "rule__FXColumn__AlignmentAssignment_5_2_1"
    // InternalFXDsl.g:1827:1: rule__FXColumn__AlignmentAssignment_5_2_1 : ( rulePos ) ;
    public final void rule__FXColumn__AlignmentAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1831:1: ( ( rulePos ) )
            // InternalFXDsl.g:1832:2: ( rulePos )
            {
            // InternalFXDsl.g:1832:2: ( rulePos )
            // InternalFXDsl.g:1833:3: rulePos
            {
             before(grammarAccess.getFXColumnAccess().getAlignmentPosEnumRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePos();

            state._fsp--;

             after(grammarAccess.getFXColumnAccess().getAlignmentPosEnumRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__AlignmentAssignment_5_2_1"


    // $ANTLR start "rule__FXColumn__AssociatedFXPropertyAssignment_5_3_1"
    // InternalFXDsl.g:1842:1: rule__FXColumn__AssociatedFXPropertyAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__FXColumn__AssociatedFXPropertyAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1846:1: ( ( ( ruleEString ) ) )
            // InternalFXDsl.g:1847:2: ( ( ruleEString ) )
            {
            // InternalFXDsl.g:1847:2: ( ( ruleEString ) )
            // InternalFXDsl.g:1848:3: ( ruleEString )
            {
             before(grammarAccess.getFXColumnAccess().getAssociatedFXPropertyFXPropertyCrossReference_5_3_1_0()); 
            // InternalFXDsl.g:1849:3: ( ruleEString )
            // InternalFXDsl.g:1850:4: ruleEString
            {
             before(grammarAccess.getFXColumnAccess().getAssociatedFXPropertyFXPropertyEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFXColumnAccess().getAssociatedFXPropertyFXPropertyEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getFXColumnAccess().getAssociatedFXPropertyFXPropertyCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXColumn__AssociatedFXPropertyAssignment_5_3_1"


    // $ANTLR start "rule__FXModel__NameAssignment_2"
    // InternalFXDsl.g:1861:1: rule__FXModel__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__FXModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1865:1: ( ( ruleEString ) )
            // InternalFXDsl.g:1866:2: ( ruleEString )
            {
            // InternalFXDsl.g:1866:2: ( ruleEString )
            // InternalFXDsl.g:1867:3: ruleEString
            {
             before(grammarAccess.getFXModelAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFXModelAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXModel__NameAssignment_2"


    // $ANTLR start "rule__FXModel__FxPropertiesAssignment_4"
    // InternalFXDsl.g:1876:1: rule__FXModel__FxPropertiesAssignment_4 : ( ruleFXProperty ) ;
    public final void rule__FXModel__FxPropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1880:1: ( ( ruleFXProperty ) )
            // InternalFXDsl.g:1881:2: ( ruleFXProperty )
            {
            // InternalFXDsl.g:1881:2: ( ruleFXProperty )
            // InternalFXDsl.g:1882:3: ruleFXProperty
            {
             before(grammarAccess.getFXModelAccess().getFxPropertiesFXPropertyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFXProperty();

            state._fsp--;

             after(grammarAccess.getFXModelAccess().getFxPropertiesFXPropertyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXModel__FxPropertiesAssignment_4"


    // $ANTLR start "rule__FXModel__FxPropertiesAssignment_5"
    // InternalFXDsl.g:1891:1: rule__FXModel__FxPropertiesAssignment_5 : ( ruleFXProperty ) ;
    public final void rule__FXModel__FxPropertiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1895:1: ( ( ruleFXProperty ) )
            // InternalFXDsl.g:1896:2: ( ruleFXProperty )
            {
            // InternalFXDsl.g:1896:2: ( ruleFXProperty )
            // InternalFXDsl.g:1897:3: ruleFXProperty
            {
             before(grammarAccess.getFXModelAccess().getFxPropertiesFXPropertyParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFXProperty();

            state._fsp--;

             after(grammarAccess.getFXModelAccess().getFxPropertiesFXPropertyParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXModel__FxPropertiesAssignment_5"


    // $ANTLR start "rule__FXProperty__TypeAssignment_1"
    // InternalFXDsl.g:1906:1: rule__FXProperty__TypeAssignment_1 : ( ruleEString ) ;
    public final void rule__FXProperty__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1910:1: ( ( ruleEString ) )
            // InternalFXDsl.g:1911:2: ( ruleEString )
            {
            // InternalFXDsl.g:1911:2: ( ruleEString )
            // InternalFXDsl.g:1912:3: ruleEString
            {
             before(grammarAccess.getFXPropertyAccess().getTypeEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFXPropertyAccess().getTypeEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXProperty__TypeAssignment_1"


    // $ANTLR start "rule__FXProperty__NameAssignment_2"
    // InternalFXDsl.g:1921:1: rule__FXProperty__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__FXProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFXDsl.g:1925:1: ( ( ruleEString ) )
            // InternalFXDsl.g:1926:2: ( ruleEString )
            {
            // InternalFXDsl.g:1926:2: ( ruleEString )
            // InternalFXDsl.g:1927:3: ruleEString
            {
             before(grammarAccess.getFXPropertyAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFXPropertyAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXProperty__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000600400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001847000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001804000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001804000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000039000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000180000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000003FE000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000040L});

}