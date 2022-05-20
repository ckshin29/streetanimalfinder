package com.saf.app.board.vo;

public class FilesVO {
	private String fname;
	private String foriginal;
	private int bnumber;
	private int lpnumber;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getForiginal() {
		return foriginal;
	}
	public void setForiginal(String foriginal) {
		this.foriginal = foriginal;
	}
	public int getBnumber() {
		return bnumber;
	}
	public void setBnumber(int bnumber) {
		this.bnumber = bnumber;
	}
	public int getLpnumber() {
		return lpnumber;
	}
	public void setLpnumber(int lpnumber) {
		this.lpnumber = lpnumber;
	}
	
	public FilesVO() {
		
	}
	
	public FilesVO(String fname, String foriginal, int bnumber, int lpnumber) {
		super();
		this.fname = fname;
		this.foriginal = foriginal;
		this.bnumber = bnumber;
		this.lpnumber = lpnumber;
	}
}
	