package com.saf.app.board.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saf.action.Action;
import com.saf.action.ActionForward;
import com.saf.app.board.dao.BoardDAO;
import com.saf.app.board.dao.FilesDAO;
import com.saf.app.board.vo.BoardVO;
import com.saf.app.board.vo.FilesVO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BoardWriteOk implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		String uploadFolder = "D:\\aigb_0900_hds\\jsp\\workspace\\boardMVC\\WebContent\\upload";//변경할것
		int fileSize = 1024 * 1024 * 5;//5M
		BoardDAO bDao = new BoardDAO();
		FilesDAO fDao = new FilesDAO();
		BoardVO board = new BoardVO();
		ActionForward af = new ActionForward();
		
		//요청객체, 업로드폴더 경로, 파일의 크기, 인코딩 방식, 이름변경정책
		MultipartRequest multi = new MultipartRequest(req, uploadFolder, fileSize, "UTF-8", new DefaultFileRenamePolicy());
		
		board.setBtitle(multi.getParameter("btitle"));
		board.setBcontent(multi.getParameter("bcontent"));
		board.setUnum((Integer)req.getSession().getAttribute("unum"));
		
		//게시글 추가
		bDao.insert(board);
		
		//파일 추가
		fDao.insert(multi, bDao.getSeq());
		
		af.setRedirect(true);
		af.setPath(req.getContextPath() + "/board/BoardListOk.bo");
		
		return af;
	}

}
