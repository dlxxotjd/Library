package com.comodo.myapp.board.dto;

import java.util.Date;

public class Notice_BoardBean {

	private int n_num;
	private int n_category;	//말머리
//	private String n_board_pass;
	private String n_subject; //글제목
	private String n_content; //글내용
//	private int n_board_re_ref; //글그룹번호
//	private int n_board_re_lev; //화면에 보이는 답변글 위치번호
//	private int board_re_seq; //답변글 레벨 순서
	private String n_file;
	private int n_readcount; //조회수
	private String n_date; //글 등록날짜
	private String n_modify_date;
	
	public int getN_num() {
		return n_num;
	}
	public void setN_num(int n_num) {
		this.n_num = n_num;
	}
	public int getN_category() {
		return n_category;
	}
	public void setN_category(int n_category) {
		this.n_category = n_category;
	}
	public String getN_subject() {
		return n_subject;
	}
	public void setN_subject(String n_subject) {
		this.n_subject = n_subject;
	}
	public String getN_content() {
		return n_content;
	}
	public void setN_content(String n_content) {
		this.n_content = n_content;
	}
	public String getN_file() {
		return n_file;
	}
	public void setN_file(String n_file) {
		this.n_file = n_file;
	}
	public int getN_readcount() {
		return n_readcount;
	}
	public void setN_readcount(int n_readcount) {
		this.n_readcount = n_readcount;
	}
	public String getN_date() {
		return n_date;
	}
	public void setN_date(String n_date) {
		this.n_date = n_date;
	}
	public String getN_modify_date() {
		return n_modify_date;
	}
	public void setN_modify_date(String n_modify_date) {
		this.n_modify_date = n_modify_date;
	}
	
	
}
