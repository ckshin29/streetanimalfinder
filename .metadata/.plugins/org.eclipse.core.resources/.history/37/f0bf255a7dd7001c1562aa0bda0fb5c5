package com.saf.app.user.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saf.action.Action;
import com.saf.action.ActionForward;
import com.sag.app.user.dao.UserDAO;
import com.saf.app.user.vo.UserVO;

public class UserJoinOk implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		req.setCharacterEncoding("UTF-8");
		
		ActionForward af = new ActionForward();
		UserVO user = new UserVO();
		UserDAO dao = new UserDAO();
		
		
		user.setUserId(req.getParameter("userId"));
		user.setUserPw(req.getParameter("userPw"));
		user.setUserName(req.getParameter("userName"));
		user.setUserAge(Integer.parseInt(req.getParameter("userAge")));
		user.setUserGender(req.getParameter("userGender"));
		user.setUserEmail(req.getParameter("userEmail"));
		user.setUserZipcode(req.getParameter("userZipcode"));
		user.setUserAddress(req.getParameter("userAddress"));
		user.setUserAddressDetail(req.getParameter("userAddressDetail"));
		
		dao.join(user);
		
		af.setRedirect(true);
		//redirect로 전송할 때 contextPath가 사라지기 때문에
		//미리ㅣ 붙여놓고 전송
		af.setPath(req.getContextPath() + "/user/UserLogin.me");
		
		return af;
	}
}
