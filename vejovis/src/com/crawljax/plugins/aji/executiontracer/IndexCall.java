package com.crawljax.plugins.aji.executiontracer;

public class IndexCall {
	private int lineNo; //line number relative to the function
	private String srcLine;
	private String funcName;
	private String indexExpr;
	
	public IndexCall(int _lineNo, String _srcLine, String _funcName, String _indexExpr) {
		this.lineNo = _lineNo;
		this.srcLine = _srcLine;
		this.funcName = _funcName;
		this.indexExpr = _indexExpr;
	}
	
	public int getLineNo() {
		return lineNo;
	}
	
	public String getSrcLine() {
		return srcLine;
	}
	
	public String funcName() {
		return funcName;
	}
	
	public String getIndexExpr() {
		return indexExpr;
	}
}