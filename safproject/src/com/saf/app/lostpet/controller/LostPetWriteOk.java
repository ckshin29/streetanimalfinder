package com.saf.app.lostpet.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.saf.app.action.Action;
import com.saf.app.action.ActionForward;
import com.saf.app.lostpet.dao.FilesDAO;
import com.saf.app.lostpet.dao.LostPetDAO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.saf.app.lostpet.vo.LostPetVO;

public class LostPetWriteOk implements Action {
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		
		
		System.out.println("컨트롤러 도착");
	
		System.out.println("그다음1");
		String uploadFolder = "C:\\aigb_0900_ksy\\1team_image"; //request.getSession().getServletContext().getRealPath("");
		System.out.println("그다음2");
		int fileSize = 1024 * 1024 * 5;//5M
		System.out.println("그다음3");
		
		//요청객체, 업로드폴더 경로, 파일의 크기, 인코딩 방식, 이름변경정책
		MultipartRequest multi = new MultipartRequest(req, uploadFolder, fileSize, "UTF-8", new DefaultFileRenamePolicy());
		
		
		System.out.println(multi.getParameter("lparea1"));
		System.out.println(multi.getParameter("lparea2"));
		System.out.println(multi.getParameter("lparea3"));
		System.out.println(multi.getParameter("lptime1"));
		System.out.println(multi.getParameter("lptime2"));
		System.out.println(multi.getParameter("lpspecies"));
		System.out.println(multi.getParameter("lpbreed"));
		System.out.println(multi.getParameter("lpgender"));
		System.out.println(multi.getParameter("lpcolor"));
		System.out.println(multi.getParameter("lpcontent"));
		
		
		LostPetDAO lpDao = new LostPetDAO();
		
		
		
		System.out.println("그다음4");
		
		
		
		FilesDAO fDao = new FilesDAO();
		System.out.println("그다음5");
		LostPetVO lostpet = new LostPetVO();
		System.out.println("그다음6");
		ActionForward af = new ActionForward();
		System.out.println("그다음7");
		System.out.println("그다음8");
		lostpet.setLparea1(multi.getParameter("lparea1"));
		lostpet.setLparea2(multi.getParameter("lparea2"));
		lostpet.setLparea3(multi.getParameter("lparea3"));
		lostpet.setLptime(multi.getParameter("lptime1"));
		lostpet.setLptime(multi.getParameter("lptime2"));
		lostpet.setLpspecies(multi.getParameter("lpspecies"));
		lostpet.setLpbreed(multi.getParameter("lpbreed"));
		lostpet.setLpgender(multi.getParameter("lpgender"));
		lostpet.setLpcolor(multi.getParameter("lpcolor"));
		lostpet.setLptime(multi.getParameter("lpcontent"));
		lostpet.setUnum(1);
		
		System.out.println("그다음9");
		//게시글 추가
		lpDao.insert(lostpet);
		System.out.println("그다음10");
		//파일 추가
		fDao.insert(multi, lpDao.getSeq());
		
		af.setRedirect(true);
		af.setPath(req.getContextPath() + "/lostpet/LostPetListOk.lo");
		
		return af;
	}

}
