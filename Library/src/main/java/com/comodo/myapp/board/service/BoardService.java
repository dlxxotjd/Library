package com.comodo.myapp.board.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.comodo.myapp.board.dto.Notice_BoardBean;


public interface BoardService {

	public void insert(Notice_BoardBean b) throws Exception;

	public Map<String, Object> board_list(HttpServletRequest request,
			HttpServletResponse response) throws Exception;

	public void hit(int board_num) throws Exception;

	public Notice_BoardBean board_cont(int board_num) throws Exception;

	public int edit(HttpServletResponse response, Notice_BoardBean b) throws Exception;

	public int del_ok(HttpServletResponse response, int board_num,
			String board_pass) throws Exception;


}
