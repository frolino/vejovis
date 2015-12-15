package com.fixmsg;

public class ModifyIndexToZeroMessage extends FixMessage {
	private String oldIndex;
	
	public ModifyIndexToZeroMessage(int _lineNo, String _functionName, String _oldIndex) {
		super(_lineNo, _functionName);
		this.oldIndex = _oldIndex;
	}
	
	@Override
	public void createMessage() {
		message = "MODIFY THE ARRAY INDEX IN LINE " + 
			lineNo + " OF FUNCTION " + functionName + "() FROM " 
			+ oldIndex + " TO 0";
	}
}