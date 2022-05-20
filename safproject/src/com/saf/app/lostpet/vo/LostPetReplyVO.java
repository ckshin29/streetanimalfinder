package com.saf.app.lostpet.vo;

public class LostPetReplyVO {
	private int replyNumber;
	private int lostpetNumber;
	private int userNumber;
	private String replyContent;
	
	public LostPetReplyVO() {;}

	public int getReplyNumber() {
		return replyNumber;
	}

	public void setReplyNumber(int replyNnumber) {
		this.replyNumber = replyNnumber;
	}

	public int getLostpetNumber() {
		return lostpetNumber;
	}

	public void setBoardNumber(int lostpetNumber) {
		this.lostpetNumber = lostpetNumber;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
}
