package com.saf.app.lostpet.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.boardMVC.action.Action;
import com.boardMVC.action.ActionForward;
import com.boardMVC.app.board.dao.BoardReplyDAO;

public class LostPetReplyDeleteOk implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		LostPetReplyDAO dao = new LostPetReplyDAO();
		
		dao.deleteReply(Integer.parseInt(req.getParameter("replyNumber")));
		
		return null;
	}

}
