package com.comodo.myapp.board.dao;

import java.util.List;

import com.comodo.myapp.board.dto.Notice_BoardBean;

public interface BoardDao {

	public void insertBoard(Notice_BoardBean b) throws Exception;

	public List<Notice_BoardBean> getBoardList(int page) throws Exception;

	public int getListCount() throws Exception;

	public Notice_BoardBean getBoardCont(int board_num) throws Exception;

	public void boardHit(int board_num) throws Exception;

	public void boardEdit(Notice_BoardBean b) throws Exception;

	public void boardDelete(int board_num) throws Exception;

	public void refEdit(Notice_BoardBean b) throws Exception;

	public void boardReplyOk(Notice_BoardBean b) throws Exception;
}
