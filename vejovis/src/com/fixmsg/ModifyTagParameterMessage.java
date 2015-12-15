package com.fixmsg;

public class ModifyTagParameterMessage extends FixMessage {
	private String oldParam;
	private String newParam;
	
	public ModifyTagParameterMessage(int _lineNo, String _functionName, String _oldParam, String _newTag) {
		super(_lineNo, _functionName);
		this.oldParam = _oldParam;
		this.newParam = "\"" + _newTag + "\"";
	}
	
	@Override
	public void createMessage() {
		message = "MODIFY THE TAG PARAMETER IN LINE " + 
			lineNo + " OF FUNCTION " + functionName + "() FROM " 
			+ oldParam + " TO " + newParam;
	}
}