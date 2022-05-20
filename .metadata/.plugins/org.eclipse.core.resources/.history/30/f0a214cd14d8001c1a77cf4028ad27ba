package com.saf.app.lostpet.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.boardMVC.app.board.vo.BoardReplyDTO;
import com.boardMVC.app.board.vo.BoardReplyVO;
import com.boardMVC.mybatis.config.MyBatisConfig;

public class LostPetReplyDAO {
	SqlSessionFactory sqlSessionFactory = MyBatisConfig.getSqlsessoinFactory();
	SqlSession sqlSession;
	
	public LostPetReplyDAO() {
		sqlSession = sqlSessionFactory.openSession(true);
	}
	
	//댓글 목록
	public List<LostPetReplyDTO> selectReplies(int boardNumber) {
		return sqlSession.selectList("Board.selectReplies", boardNumber);
	}
	
	//댓글 등록
	public void insertReply(LostPetReplyVO reply) {
		sqlSession.insert("Board.insertReply", reply);
	}
	
	//댓글 삭제
	public void deleteReply(int replyNumber) {
		sqlSession.delete("Board.deleteReply", replyNumber);
	}
	
	//댓글 수정
	public void updateReply(LostPetReplyVO reply) {
		sqlSession.update("Board.updateReply", reply);
	}
}
