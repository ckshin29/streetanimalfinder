package com.saf.app.board.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saf.action.Action;
import com.saf.action.ActionForward;
import com.saf.app.board.dao.BoardReplyDAO;

public class BoardReplyDeleteOk implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		BoardReplyDAO dao = new BoardReplyDAO();
		
		dao.deleteReply(Integer.parseInt(req.getParameter("rnumber")));
		
		return null;
	}

}
