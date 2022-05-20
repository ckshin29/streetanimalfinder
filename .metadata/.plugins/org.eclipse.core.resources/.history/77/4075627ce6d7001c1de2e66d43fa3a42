package com.saf.app.user.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.saf.action.Action;
import com.saf.action.ActionForward;
import com.saf.app.user.dao.UserDAO;

public class UserCheckIdOk implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		
		String userId = req.getParameter("userId");
		UserDAO dao = new UserDAO();
		PrintWriter out = resp.getWriter();
		JSONObject obj = new JSONObject();
		

		if(dao.checkId(uid)) {
			//아이디가 중복되었을 때

//			out.print("not-ok");
			obj.put("status", "not-ok");
		}else {
			// ��� ������ ���̵��� ��
//			out.print("ok");
			obj.put("status", "ok");
		}
		
		out.print(obj.toJSONString());
		out.close();
		
		return null;
	}
}
