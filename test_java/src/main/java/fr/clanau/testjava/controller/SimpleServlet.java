package fr.clanau.testjava.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleServlet extends HttpServlet {

    private static final String DASHBOARD_JSP = "/simple.jsp";


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /* Date */
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
        Date date = new Date();

        String login_time_attribute_name = format.format(date);;
        String pseudo = req.getParameter("name");

        /* Transmet à la JSP */
        req.setAttribute("loginTime", login_time_attribute_name);
        req.setAttribute("name", pseudo);

        this.getServletContext().getRequestDispatcher(DASHBOARD_JSP).forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }
}
