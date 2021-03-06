package com.saf.app.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saf.app.action.ActionForward;

public class BoardFrontController extends HttpServlet {
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      doProcess(req, resp);
   }
   
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      doProcess(req, resp);
   }
   
   protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String requestURI = req.getRequestURI();
      String contextPath = req.getContextPath();
      String command = requestURI.substring(contextPath.length());
      ActionForward af = null;
      
      if(command.equals("/board/controller/BoardDeleteOk.bo")) {
         try {
            af = new BoardDeleteOk().execute(req,resp);
         } catch(Exception e) {
            e.printStackTrace();
         }
         
      }else if(command.equals("/board/controller/BoardDetail.bo")) {
         try {
            af = new BoardDetailOk().execute(req,resp);
         } catch(Exception e) {
            e.printStackTrace();
         }
         
      }else if(command.equals("/board/controller/BoardWrite.bo")) {
         af = new BoardWrite().execute(req, resp);
         af.setRedirect(false);
         af.setPath("/board/new-write-detail.jsp");
         
      }else if(command.equals("/board/controller/BoardListOk.bo")) {
         try {
            af = new BoardListOk().execute(req,resp);
         } catch(Exception e) {
            e.printStackTrace();
         }

         
      }else if(command.equals("/board/controller/BoardUpdate.bo")) {
         try {
            af = new BoardUpdate().execute(req,resp);
         } catch(Exception e) {
            e.printStackTrace();
         }

      }else if(command.equals("/board/controller/BoardUpdateOk.bo")) {
         //af = new UserLogout().execute(req, resp);
      }
      
      //???????????????
      if(af != null) {
         if(af.isRedirect()) {
            //redirect
            resp.sendRedirect(af.getPath());
         }else {
            //forward
            //request???????????? Dispatch??? ????????? ???, ????????? ????????? ????????????.
            //dispatch : ????????? ????????? ??????????????? ??????
            RequestDispatcher dispatcher = req.getRequestDispatcher(af.getPath());
            //dispatcher???????????? forward()??? ????????? ??? request??? response?????? ??? ??? ???????????????
            //????????? ???????????? ???????????? ????????????.
            dispatcher.forward(req, resp);
         }
      }
   }
}















