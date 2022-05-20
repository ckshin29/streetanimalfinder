package com.saf.app.lostpet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.boardMVC.action.Action;
import com.boardMVC.action.ActionForward;
import com.boardMVC.app.board.dao.BoardReplyDAO;
import com.boardMVC.app.board.vo.BoardReplyDTO;

public class LostPetReplyListOk implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		int boardNumber = Integer.parseInt(req.getParameter("boardNumber"));
		LostPetReplyDAO rDao = new LostPetReplyDAO();
		PrintWriter out = resp.getWriter();
		
		List<LostPetReplyDTO> replyList = rDao.selectReplies(boardNumber);
		
		JSONArray replies = new JSONArray();

		for(LostPetReplyDTO r : replyList) {
			JSONObject reply = new JSONObject();
			reply.put("replyNumber", r.getRnumber());
			reply.put("boardNumber", r.getBnumber());
			reply.put("memberNumber", r.getMemberNumber());
			reply.put("memberId", r.getMemberId());
			reply.put("replyContent", r.getRcontent());
			replies.add(reply);
		}
		
		out.print(replies.toJSONString());
		out.close();
		
		return null;
	}

}
