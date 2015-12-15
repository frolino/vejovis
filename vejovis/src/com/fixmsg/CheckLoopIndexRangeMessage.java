package com.fixmsg;

public class CheckLoopIndexRangeMessage extends FixMessage {
	public CheckLoopIndexRangeMessage(int _lineNo, String _functionName) {
		super(_lineNo, _functionName);
	}
	
	@Override
	public void createMessage() {
		message = "MODIFY INDEX RANGE OF LOOP OF WHICH LINE " + 
		lineNo + " IS A PART IN FUNCTION " + functionName + "()";
	}
}