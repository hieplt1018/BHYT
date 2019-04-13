/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import helper.Config;
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
        String luongCoSoStr = request.getParameter("LuongCS");
        String phanTramLuongStr = request.getParameter("PhanTramLuongCS");
        String phanTramHoTroHSSVStr = request.getParameter("HSSV");;
        String phanTramHoTroNongLamNguStr = request.getParameter("HoNLNN");
        String phanTramHoTroCanNgheoStr = request.getParameter("HCN");
        String phanTramHoGDMotNguoiPhuThuocStr = request.getParameter("NT1");
        String phanTramHoGDHaiNguoiPhuThuocStr = request.getParameter("NT2");
        String phanTramHoGDBaNguoiPhuThuocStr = request.getParameter("NT3"); 
        String phanTramHoGDBonNguoiPhuThuocStr = request.getParameter("NT4");
        String phanTramHoGDNamVaLonHonNguoiPhuThuocStr = request.getParameter("NT5");
        String url = "";

        HttpSession session = request.getSession();
        try {
            System.out.println();
            if (luongCoSoStr != null) {
                // Chuyen trang
                url = "config.jsp";
                String successMessage = "Thay đổi thành công!";
                int luongCoSo = Integer.parseInt(luongCoSoStr);
                double phanTramLuong = Double.parseDouble(phanTramLuongStr);
                double phanTramHoTroHSSV = Double.parseDouble(phanTramHoTroHSSVStr);
                double phanTramHoTroNongLamNgu = Double.parseDouble(phanTramHoTroNongLamNguStr);
                double phanTramHoTroCanNgheo = Double.parseDouble(phanTramHoTroCanNgheoStr);
                double phanTramHoGDMotNguoiPhuThuoc = Double.parseDouble(phanTramHoGDMotNguoiPhuThuocStr);
                double phanTramHoGDHaiNguoiPhuThuoc = Double.parseDouble(phanTramHoGDHaiNguoiPhuThuocStr);
                double phanTramHoGDBaNguoiPhuThuoc = Double.parseDouble(phanTramHoGDBaNguoiPhuThuocStr);
                double phanTramHoGDBonNguoiPhuThuoc = Double.parseDouble(phanTramHoGDBonNguoiPhuThuocStr);
                double phanTramHoGDNamVaLonHonNguoiPhuThuoc = Double.parseDouble(phanTramHoGDNamVaLonHonNguoiPhuThuocStr);
                
                Config config = new Config();
                config.ghiFile(luongCoSo, phanTramLuong, phanTramHoTroHSSV, 
                        phanTramHoTroNongLamNgu, phanTramHoTroCanNgheo, 
                        phanTramHoGDMotNguoiPhuThuoc, 
                        phanTramHoGDHaiNguoiPhuThuoc, 
                        phanTramHoGDBaNguoiPhuThuoc, 
                        phanTramHoGDBonNguoiPhuThuoc, 
                        phanTramHoGDNamVaLonHonNguoiPhuThuoc);
                config.docFile();
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
