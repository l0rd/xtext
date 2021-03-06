/*
 * generated by Xtext
 */
package org.eclipse.xtext.xbase.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.xbase.services.XbaseGrammarAccess;

public class XbaseParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private XbaseGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipse.xtext.xbase.parser.antlr.internal.InternalXbaseParser createParser(XtextTokenStream stream) {
		return new org.eclipse.xtext.xbase.parser.antlr.internal.InternalXbaseParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "XExpression";
	}
	
	public XbaseGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(XbaseGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
