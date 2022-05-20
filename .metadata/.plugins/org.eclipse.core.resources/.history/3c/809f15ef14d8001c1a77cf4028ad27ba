package com.saf.app.lostpet.vo;

// 나는 기존 테이블의 컬럼의 변형 또는 이외의 연산이 있을 경우에는
// 클래스이름 뒤에 DTO를 붙이겠다.
public class LostPetDTO {
	private int boardNumber;
	private String boardTitle;
	private String boardContent;
	private int userNumber;
	private String userId;
	private String boardDate;
	private int readCount;
	
	public LostPetDTO() {;}

	public LostPetDTO(BoardVO boardVO) {
		super();
		this.userNumber = boardVO.getUserNumber();
		this.boardNumber = boardVO.getBnumber();
		this.boardTitle = boardVO.getBoardTitle();
		this.boardContent = boardVO.getBoardContent();
		this.boardDate = boardVO.getBoardDate();
		this.readCount = boardVO.getReadCount();
	}

	public int getBoardNumber() {
		return boardNumber;
	}

	public void setBoardNumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
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

	public String getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
}
