package com.saf.app.board.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.saf.action.Action;
import com.saf.action.ActionForward;
import com.saf.app.user.dao.UserDAO;

public class BoardWrite implements Action{
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		HttpSession session = req.getSession();
		UserDAO mDao = new UserDAO();
		ActionForward af = new ActionForward();
		
		String userId = uDao.getInfo((Integer)session.getAttribute("userNumber")).getUserId();
		
		req.setAttribute("userId", userId);
		
		af.setRedirect(false);
		af.setPath("/app/board/boardWrite.jsp");
		
		return af;
	}
}




