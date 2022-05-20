package com.saf.app.lostpet.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.saf.app.action.*;
import com.saf.app.lostpet.dao.*;
import com.saf.app.lostpet.vo.*; 
import com.saf.app.user.dao.*; 


public class LostPetWrite implements Action{
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		HttpSession session = req.getSession();
		UserDAO uDao = new UserDAO();
		ActionForward af = new ActionForward();
		
		String userId = uDao.getInfo((Integer)session.getAttribute("unum")).getUid();
		
		req.setAttribute("uid", userId);
		
		af.setRedirect(false);
		af.setPath("/lostpet/fine_write.jsp");
		
		return af;
	}
}




