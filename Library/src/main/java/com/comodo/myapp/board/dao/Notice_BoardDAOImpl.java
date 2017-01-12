package com.comodo.myapp.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.comodo.myapp.board.dto.Notice_BoardBean;

//DB랑 들락날락

@Repository
public class Notice_BoardDAOImpl implements BoardDao{

	@Autowired
	private SqlSession sqlSession;

//	public void setSqlSession(SqlSession sqlSession) {
//		this.sqlSession = sqlSession;
//	}//스프링 setter DI 의존관계를 설정
	
	
	/* 게시판 저장 */
	@Transactional
	public void insertBoard(Notice_BoardBean b) throws Exception {
//		getSession();		
		sqlSession.insert("Test.board_insert", b);
//		sqlsession.commit();		
	}

	
	/* 게시물 목록  */
	@Transactional
	public List<Notice_BoardBean> getBoardList(int page) throws Exception {
		List<Notice_BoardBean> list = sqlSession.selectList("Test.board_list", page);

		return list;
	}

	
	/* 게시판 총 갯수  */
	@Transactional
	public int getListCount() throws Exception {
		int count = 0;	
		count = ((Integer) sqlSession.selectOne("Test.board_count")).intValue();

		return count;
	}

	
	/* 게시판 글내용보기  */
	@Transactional
	public Notice_BoardBean getBoardCont(int board_num) throws Exception {
		return (Notice_BoardBean) sqlSession.selectOne("Test.board_cont",board_num);
	}

	
	/* 게시판 조회수 증가  */
	@Transactional
	public void boardHit(int board_num) throws Exception {
		sqlSession.update("Test.board_hit", board_num);		
	}

	
	/* 게시물 수정  */
	@Transactional
	public void boardEdit(Notice_BoardBean b) throws Exception {
		sqlSession.update("Test.board_edit", b);		
	}

	
	/* 게시물 삭제  */
	@Transactional
	public void boardDelete(int board_num) throws Exception {
		sqlSession.delete("Test.board_del", board_num);				
	}

	
	/* 답변글 레벨 증가  */
	@Transactional
	public void refEdit(Notice_BoardBean b) throws Exception {
		sqlSession.update("Test.board_Level", b);		
	}

	
	/* 답변글 저장  */
	@Transactional
	public void boardReplyOk(Notice_BoardBean b) throws Exception {
		sqlSession.insert("Test.board_reply", b);		
	}

}
