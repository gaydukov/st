package com.service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Маша on 12.03.2017.
 */
public class DELservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DAO dao=new DAO();
        resp.setContentType("text/html;charset=UTF-8");
        int id=Integer.parseInt(req.getParameter("id"));
        req.setAttribute("var",dao.showid(id));
        req.getRequestDispatcher("mypage.jsp").forward(req, resp);
        dao.DBDel(id);
    }
}
