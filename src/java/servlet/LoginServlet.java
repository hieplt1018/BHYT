/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import com.google.gson.Gson;
import controller.AdminDaoImpl;
import controller.BhytDAOImpl;
import helper.MD5;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Admin;

/**
 *
 * @author asus
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html; charset=UTF-8");
        response.setContentType("application/json");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String url = "";
        HttpSession session = request.getSession();
        try {
            AdminDaoImpl adminDAO = new AdminDaoImpl();
            BhytDAOImpl bhytDao = new BhytDAOImpl();
            System.out.println(password);
            Admin account = adminDAO.login(username, MD5.encryption(password));
            System.out.println(account);
            if (account != null) {
                // Chuyen trang
                url = "index.jsp";
                session.setAttribute("account", account);
                RequestDispatcher dispatcher = request.getRequestDispatcher(url);
                dispatcher.forward(request, response);
            } else {
                url = "login.jsp";
                String errorMessage = "Wrong username or password!";

                request.setAttribute("errorMessage", errorMessage);
                RequestDispatcher dispatcher = request.getRequestDispatcher(url);
                dispatcher.forward(request, response);
            }
        } catch (Exception ex) {
            System.out.println("LoginServlet Failed!");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
