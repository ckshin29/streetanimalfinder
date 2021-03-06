package com.saf.app.user.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saf.app.action.Action;
import com.saf.app.action.ActionForward;
import com.saf.app.user.dao.UserDAO;
import com.saf.app.user.vo.UserVO;

public class UserUpdateProfileOK implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		req.setCharacterEncoding("UTF-8");
		
		ActionForward af = new ActionForward();
		UserVO user = new UserVO();
		UserDAO dao = new UserDAO();
		
		
		
		user.setUimage(req.getParameter("uimage"));
		user.setUname(req.getParameter("uname"));

		
		dao.updateUserProfile(user);
		
		af.setRedirect(true);

		af.setPath(req.getContextPath() + "/user/controller/Userupdateprofile.me");
		
		return af;
	}

	
}
