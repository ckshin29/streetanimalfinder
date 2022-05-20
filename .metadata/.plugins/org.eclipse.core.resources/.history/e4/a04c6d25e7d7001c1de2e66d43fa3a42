package com.saf.app.user.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.saf.app.action.Action;
import com.saf.app.action.ActionForward;
import com.saf.app.user.dao.UserDAO;

public class UserLoginOk implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		HashMap<String, String> loginMap = new HashMap<>();
		UserDAO dao = new UserDAO();
		int userNumber = 0;
		ActionForward af = new ActionForward();
		HttpSession session = req.getSession();

		loginMap.put("userId", req.getParameter("userId"));
		loginMap.put("userPw", req.getParameter("userPw"));
		
		userNumber = dao.login(loginMap);
		if(userNumber == 0) {//濡쒓렇�씤 �떎�뙣
			af.setRedirect(false);
			af.setPath("/user/UserLogin.me?code=" + userNumber);
		}else {//濡쒓렇�씤 �꽦怨�
			session.setAttribute("userNumber", userNumber);
			af.setRedirect(true);
			af.setPath(req.getContextPath() + "/board/BoardListOk.bo");
		}
		
		return af;
	}

}
