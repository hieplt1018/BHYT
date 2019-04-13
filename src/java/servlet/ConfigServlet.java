/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author asus
 */
public class ConfigServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html; charset=UTF-8");
        response.setContentType("application/json");
        String luongCoSo = request.getParameter("LuongCS");
        String phanTramLuong = request.getParameter("PhanTramLuongCS");
        String phanTramHoTroHSSV = request.getParameter("HSSV");;
        String phanTramHoTroNongLamNgu = request.getParameter("HoNLNN");
        String phanTramHoTroCanNgheo = request.getParameter("HCN");
        String phanTramHoGDMotNguoiPhuThuoc = request.getParameter("NT1");
        String phanTramHoGDHaiNguoiPhuThuoc = request.getParameter("NT2");
        String phanTramHoGDBaNguoiPhuThuoc = request.getParameter("NT3"); 
        String phanTramHoGDBonNguoiPhuThuoc = request.getParameter("NT4");
        String phanTramHoGDNamVaLonHonNguoiPhuThuoc = request.getParameter("NT5");
        String url = "";

        HttpSession session = request.getSession();
        try {
            System.out.println();
            if (luongCoSo != null) {
                // Chuyen trang
                url = "config.jsp";
                String successMessage = "Thay đổi thành công!";
                
                request.setAttribute("successMessage", successMessage);
                RequestDispatcher dispatcher = request.getRequestDispatcher(url);
                dispatcher.forward(request, response);
            } else {
                url = "config.jsp";
                String errorMessage = "Thay đổi thất bại!";

                request.setAttribute("errorMessage", errorMessage);
                RequestDispatcher dispatcher = request.getRequestDispatcher(url);
                dispatcher.forward(request, response);
            }
        } catch (Exception ex) {
            System.out.println("ConfigServlet Failed!");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }


}
