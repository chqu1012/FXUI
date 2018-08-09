/*
 * generated by Xtext 2.14.0
 */
grammar InternalFXDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package de.dc.fx.ui.model.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleFXTableView
entryRuleFXTableView returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFXTableViewRule()); }
	iv_ruleFXTableView=ruleFXTableView
	{ $current=$iv_ruleFXTableView.current; }
	EOF;

// Rule FXTableView
ruleFXTableView returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFXTableViewAccess().getFXTableViewAction_0(),
					$current);
			}
		)
		(
			(
				lv_hasFilter_1_0='hasFilter'
				{
					newLeafNode(lv_hasFilter_1_0, grammarAccess.getFXTableViewAccess().getHasFilterHasFilterKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFXTableViewRule());
					}
					setWithLastConsumed($current, "hasFilter", true, "hasFilter");
				}
			)
		)?
		(
			(
				lv_hasSorter_2_0='hasSorter'
				{
					newLeafNode(lv_hasSorter_2_0, grammarAccess.getFXTableViewAccess().getHasSorterHasSorterKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFXTableViewRule());
					}
					setWithLastConsumed($current, "hasSorter", true, "hasSorter");
				}
			)
		)?
		otherlv_3='FXTableView'
		{
			newLeafNode(otherlv_3, grammarAccess.getFXTableViewAccess().getFXTableViewKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFXTableViewAccess().getNameEStringParserRuleCall_4_0());
				}
				lv_name_4_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFXTableViewRule());
					}
					set(
						$current,
						"name",
						lv_name_4_0,
						"de.dc.fx.ui.model.FXDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='{'
		{
			newLeafNode(otherlv_5, grammarAccess.getFXTableViewAccess().getLeftCurlyBracketKeyword_5());
		}
		(
			otherlv_6='packagePath'
			{
				newLeafNode(otherlv_6, grammarAccess.getFXTableViewAccess().getPackagePathKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFXTableViewAccess().getPackagePathEStringParserRuleCall_6_1_0());
					}
					lv_packagePath_7_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFXTableViewRule());
						}
						set(
							$current,
							"packagePath",
							lv_packagePath_7_0,
							"de.dc.fx.ui.model.FXDsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_8='fxColumns'
			{
				newLeafNode(otherlv_8, grammarAccess.getFXTableViewAccess().getFxColumnsKeyword_7_0());
			}
			otherlv_9='{'
			{
				newLeafNode(otherlv_9, grammarAccess.getFXTableViewAccess().getLeftCurlyBracketKeyword_7_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFXTableViewAccess().getFxColumnsFXColumnParserRuleCall_7_2_0());
					}
					lv_fxColumns_10_0=ruleFXColumn
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFXTableViewRule());
						}
						add(
							$current,
							"fxColumns",
							lv_fxColumns_10_0,
							"de.dc.fx.ui.model.FXDsl.FXColumn");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_11=','
				{
					newLeafNode(otherlv_11, grammarAccess.getFXTableViewAccess().getCommaKeyword_7_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getFXTableViewAccess().getFxColumnsFXColumnParserRuleCall_7_3_1_0());
						}
						lv_fxColumns_12_0=ruleFXColumn
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFXTableViewRule());
							}
							add(
								$current,
								"fxColumns",
								lv_fxColumns_12_0,
								"de.dc.fx.ui.model.FXDsl.FXColumn");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_13='}'
			{
				newLeafNode(otherlv_13, grammarAccess.getFXTableViewAccess().getRightCurlyBracketKeyword_7_4());
			}
		)?
		(
			otherlv_14='fxEntity'
			{
				newLeafNode(otherlv_14, grammarAccess.getFXTableViewAccess().getFxEntityKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFXTableViewAccess().getFxEntityFXModelParserRuleCall_8_1_0());
					}
					lv_fxEntity_15_0=ruleFXModel
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFXTableViewRule());
						}
						set(
							$current,
							"fxEntity",
							lv_fxEntity_15_0,
							"de.dc.fx.ui.model.FXDsl.FXModel");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_16='}'
		{
			newLeafNode(otherlv_16, grammarAccess.getFXTableViewAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleFXColumn
entryRuleFXColumn returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFXColumnRule()); }
	iv_ruleFXColumn=ruleFXColumn
	{ $current=$iv_ruleFXColumn.current; }
	EOF;

// Rule FXColumn
ruleFXColumn returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFXColumnAccess().getFXColumnAction_0(),
					$current);
			}
		)
		(
			(
				lv_editable_1_0='editable'
				{
					newLeafNode(lv_editable_1_0, grammarAccess.getFXColumnAccess().getEditableEditableKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFXColumnRule());
					}
					setWithLastConsumed($current, "editable", true, "editable");
				}
			)
		)?
		(
			(
				lv_useCustomCellFactory_2_0='useCustomCellFactory'
				{
					newLeafNode(lv_useCustomCellFactory_2_0, grammarAccess.getFXColumnAccess().getUseCustomCellFactoryUseCustomCellFactoryKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFXColumnRule());
					}
					setWithLastConsumed($current, "useCustomCellFactory", true, "useCustomCellFactory");
				}
			)
		)?
		otherlv_3='FXColumn'
		{
			newLeafNode(otherlv_3, grammarAccess.getFXColumnAccess().getFXColumnKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFXColumnAccess().getNameEStringParserRuleCall_4_0());
				}
				lv_name_4_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFXColumnRule());
					}
					set(
						$current,
						"name",
						lv_name_4_0,
						"de.dc.fx.ui.model.FXDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='{'
		{
			newLeafNode(otherlv_5, grammarAccess.getFXColumnAccess().getLeftCurlyBracketKeyword_5());
		}
		(
			otherlv_6='width'
			{
				newLeafNode(otherlv_6, grammarAccess.getFXColumnAccess().getWidthKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFXColumnAccess().getWidthEDoubleParserRuleCall_6_1_0());
					}
					lv_width_7_0=ruleEDouble
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFXColumnRule());
						}
						set(
							$current,
							"width",
							lv_width_7_0,
							"de.dc.fx.ui.model.FXDsl.EDouble");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_8='alignment'
			{
				newLeafNode(otherlv_8, grammarAccess.getFXColumnAccess().getAlignmentKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFXColumnAccess().getAlignmentPosEnumRuleCall_7_1_0());
					}
					lv_alignment_9_0=rulePos
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFXColumnRule());
						}
						set(
							$current,
							"alignment",
							lv_alignment_9_0,
							"de.dc.fx.ui.model.FXDsl.Pos");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_10='associatedFXProperty'
			{
				newLeafNode(otherlv_10, grammarAccess.getFXColumnAccess().getAssociatedFXPropertyKeyword_8_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFXColumnRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getFXColumnAccess().getAssociatedFXPropertyFXPropertyCrossReference_8_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getFXColumnAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleFXModel
entryRuleFXModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFXModelRule()); }
	iv_ruleFXModel=ruleFXModel
	{ $current=$iv_ruleFXModel.current; }
	EOF;

// Rule FXModel
ruleFXModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFXModelAccess().getFXModelAction_0(),
					$current);
			}
		)
		otherlv_1='FXModel'
		{
			newLeafNode(otherlv_1, grammarAccess.getFXModelAccess().getFXModelKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFXModelAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFXModelRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"de.dc.fx.ui.model.FXDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getFXModelAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='fxProperties'
			{
				newLeafNode(otherlv_4, grammarAccess.getFXModelAccess().getFxPropertiesKeyword_4_0());
			}
			otherlv_5='{'
			{
				newLeafNode(otherlv_5, grammarAccess.getFXModelAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFXModelAccess().getFxPropertiesFXPropertyParserRuleCall_4_2_0());
					}
					lv_fxProperties_6_0=ruleFXProperty
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFXModelRule());
						}
						add(
							$current,
							"fxProperties",
							lv_fxProperties_6_0,
							"de.dc.fx.ui.model.FXDsl.FXProperty");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_7=','
				{
					newLeafNode(otherlv_7, grammarAccess.getFXModelAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getFXModelAccess().getFxPropertiesFXPropertyParserRuleCall_4_3_1_0());
						}
						lv_fxProperties_8_0=ruleFXProperty
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFXModelRule());
							}
							add(
								$current,
								"fxProperties",
								lv_fxProperties_8_0,
								"de.dc.fx.ui.model.FXDsl.FXProperty");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_9='}'
			{
				newLeafNode(otherlv_9, grammarAccess.getFXModelAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getFXModelAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleFXProperty
entryRuleFXProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFXPropertyRule()); }
	iv_ruleFXProperty=ruleFXProperty
	{ $current=$iv_ruleFXProperty.current; }
	EOF;

// Rule FXProperty
ruleFXProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFXPropertyAccess().getFXPropertyAction_0(),
					$current);
			}
		)
		otherlv_1='FXProperty'
		{
			newLeafNode(otherlv_1, grammarAccess.getFXPropertyAccess().getFXPropertyKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFXPropertyAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFXPropertyRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"de.dc.fx.ui.model.FXDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getFXPropertyAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='type'
			{
				newLeafNode(otherlv_4, grammarAccess.getFXPropertyAccess().getTypeKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFXPropertyAccess().getTypeEStringParserRuleCall_4_1_0());
					}
					lv_type_5_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFXPropertyRule());
						}
						set(
							$current,
							"type",
							lv_type_5_0,
							"de.dc.fx.ui.model.FXDsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getFXPropertyAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleEDouble
entryRuleEDouble returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEDoubleRule()); }
	iv_ruleEDouble=ruleEDouble
	{ $current=$iv_ruleEDouble.current.getText(); }
	EOF;

// Rule EDouble
ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
			}
		)?
		(
			this_INT_1=RULE_INT
			{
				$current.merge(this_INT_1);
			}
			{
				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
			}
		)?
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
		}
		this_INT_3=RULE_INT
		{
			$current.merge(this_INT_3);
		}
		{
			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
		}
		(
			(
				kw='E'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
				}
				    |
				kw='e'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
				}
			)
			(
				kw='-'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
				}
			)?
			this_INT_7=RULE_INT
			{
				$current.merge(this_INT_7);
			}
			{
				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
			}
		)?
	)
;

// Rule Pos
rulePos returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='TOP_LEFT'
			{
				$current = grammarAccess.getPosAccess().getTOP_LEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getPosAccess().getTOP_LEFTEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='TOP_CENTER'
			{
				$current = grammarAccess.getPosAccess().getTOP_CENTEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getPosAccess().getTOP_CENTEREnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='TOP_RIGHT'
			{
				$current = grammarAccess.getPosAccess().getTOP_RIGHTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getPosAccess().getTOP_RIGHTEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='CENTER_LEFT'
			{
				$current = grammarAccess.getPosAccess().getCENTER_LEFTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getPosAccess().getCENTER_LEFTEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='CENTER'
			{
				$current = grammarAccess.getPosAccess().getCENTEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getPosAccess().getCENTEREnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='CENTER_RIGHT'
			{
				$current = grammarAccess.getPosAccess().getCENTER_RIGHTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getPosAccess().getCENTER_RIGHTEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='BOTTOM_LEFT'
			{
				$current = grammarAccess.getPosAccess().getBOTTOM_LEFTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getPosAccess().getBOTTOM_LEFTEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='BOTTOM_CENTER'
			{
				$current = grammarAccess.getPosAccess().getBOTTOM_CENTEREnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getPosAccess().getBOTTOM_CENTEREnumLiteralDeclaration_7());
			}
		)
		    |
		(
			enumLiteral_8='BOTTOM_RIGHT'
			{
				$current = grammarAccess.getPosAccess().getBOTTOM_RIGHTEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_8, grammarAccess.getPosAccess().getBOTTOM_RIGHTEnumLiteralDeclaration_8());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
