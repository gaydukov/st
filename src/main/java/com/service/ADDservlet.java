package com.service;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Маша on 17.02.2017.
 */

public class ADDservlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        DAO dao=new DAO();
        resp.setContentType("text/html;charset=UTF-8");
        String name= req.getParameter("name");
        int gr=Integer.parseInt(req.getParameter("grupa"));
        int oc=Integer.parseInt(req.getParameter("ocenka"));
        dao.DBAdd(new Student(name,gr,oc));
        //PrintWriter out = resp.getWriter();
       // out.print("<h1>"+dao.show()+"</h1>");
        req.setAttribute("var",dao.show());
        req.getRequestDispatcher("mypage.jsp").forward(req, resp);


    }

}