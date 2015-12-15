package com.crawljax.plugins.aji.executiontracer;

public class DomTagInfo implements Comparable<DomTagInfo> {
	private String tagStr;
	private int numInstances;
	private int rank; //This is hard-coded, and is based on the frequency in GEBTN calls, according to our mini-study
	
	/*
	 * RANK:
	 * 1 - HEAD
	 * 2 - A
	 * 3 - INPUT
	 * 3 - TBODY
	 * 4 - LI
	 * 5 - IMG
	 * 5 - DIV
	 * 5 - LINK
	 * 6 - UL
	 * 6 - OPTION
	 * 6 - BODY
	 * 6 - OL
	 * 6 - SCRIPT
	 * 7 - U
	 * 7 - TD
	 * 7 - TR
	 * 7 - IFRAME
	 * 7 - SPAN
	 * 7 - META
	 * 7 - PARSERERROR
	 * 7 - everything else
	 * 
	 * The user should be able to override this ranking programmatically
	 */
	
	private int type; //0 - previous state, 1 - current state, 2 - future state
	
	public DomTagInfo(String _tagStr, int _numInstances) {
		this.tagStr = _tagStr;
		this.numInstances = _numInstances;
		this.rank = findRank(_tagStr);
		
		this.type = -1;
	}
	
	private int findRank(String tag) {
		if (tag.toLowerCase().equals("head")) {
			return 1;
		}
		else if (tag.toLowerCase().equals("a")) {
			return 2;
		}
		else if (tag.toLowerCase().equals("input") ||
				tag.toLowerCase().equals("tbody")) {
			return 3;
		}
		else if (tag.toLowerCase().equals("li")) {
			return 4;
		}
		else if (tag.toLowerCase().equals("img") ||
				tag.toLowerCase().equals("div") ||
				tag.toLowerCase().equals("link")) {
			return 5;
		}
		else if (tag.toLowerCase().equals("ul") ||
				tag.toLowerCase().equals("option") ||
				tag.toLowerCase().equals("body") ||
				tag.toLowerCase().equals("ol") ||
				tag.toLowerCase().equals("script")) {
			return 6;
		}
		else {
			return 7;
		}
	}
	
	public String getTagStr() {
		return tagStr;
	}
	
	public int getNumInstances() {
		return numInstances;
	}
	
	public void setType(int _type) {
		this.type = _type;
	}
	
	@Override
	public int compareTo(DomTagInfo dti) {
		if (this.rank < dti.rank) {
			return -1;
		}
		else if (this.rank > dti.rank) {
			return 1;
		}
		else {
			return 0;
		}
	}
}