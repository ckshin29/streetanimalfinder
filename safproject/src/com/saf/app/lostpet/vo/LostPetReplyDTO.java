package com.saf.app.lostpet.vo;

public class LostPetReplyDTO {
	private int replyNumber;
	private int lostpetNumber;
	private int userNumber;
	private String userId;
	private String replyContent;
	
	public LostPetReplyDTO() {;}

	public int getReplyNumber() {
		return replyNumber;
	}

	public void setReplyNumber(int replyNumber) {
		this.replyNumber = replyNumber;
	}

	public int getLostpetNumber() {
		return lostpetNumber;
	}

	public void setLostpetNumber(int lostpetNumber) {
		this.lostpetNumber = lostpetNumber;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
}
