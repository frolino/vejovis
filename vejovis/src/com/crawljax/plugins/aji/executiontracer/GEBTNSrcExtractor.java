package com.crawljax.plugins.aji.executiontracer;

import java.util.*;

import org.apache.log4j.Logger;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.ast.*;

public class GEBTNSrcExtractor implements NodeVisitor {
	private String gebtnSrc;
	private String gebtnParam;
	
	public GEBTNSrcExtractor() {
		gebtnSrc = null;
		gebtnParam = null;
	}
	
	@Override
	public boolean visit(AstNode node) {
		if (node instanceof FunctionCall) {
			FunctionCall fc = (FunctionCall)node;
			
			String funcToCall = fc.getTarget().toSource();
			
			if (funcToCall.endsWith("getElementsByTagName")) {
				gebtnSrc = fc.toSource();
				
				//Get the parameter
				gebtnParam = fc.getArguments().get(0).toSource(); //Assumption is that there is only one argument
				
				return false;
			}
		}
		return true;
	}
	
	public String getGebtnSrc() {
		return gebtnSrc;
	}
	
	public String getGebtnParam() {
		return gebtnParam;
	}
}