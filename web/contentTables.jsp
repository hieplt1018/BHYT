<%-- 
    Document   : contentTables
    Created on : Apr 5, 2019, 10:11:51 AM
    Author     : asus
--%>

<%@page import="model.BHYT"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controller.BhytDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    BhytDAOImpl bhytDao = new BhytDAOImpl();
    ArrayList<BHYT> listBhyt = null;
%>
<div id="content-wrapper">

    <div class="container-fluid">

        <!-- Breadcrumbs-->
        <ol class="breadcrumb">
            <li class="breadcrumb-item">
                <a href="#">Dashboard</a>
            </li>
            <li class="breadcrumb-item active">Tables</li>
        </ol>

        <!-- DataTables Example -->
        <div class="card mb-3">
            <div class="card-header">
                <i class="fas fa-table"></i>
                Data Table Example</div>
            <div class="card-body">
                <div class="table-responsive">
                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                        <thead>
                            <tr>
                                <th>Mã BHYT</th>
                                <th>Họ Tên</th>
                                <th>Địa chỉ</th>
                                <th>Loại BHYT</th>
                                <th>Hộ GĐ</th>
                                <th>Ngày đóng</th>
                            </tr>
                        </thead>
                        <tfoot>
                            <tr>
                                <th>Mã BHYT</th>
                                <th>Họ Tên</th>
                                <th>Địa chỉ</th>
                                <th>Loại BHYT</th>
                                <th>Hộ GĐ</th>
                                <th>Ngày đóng</th>
                            </tr>
                        </tfoot>
                        <tbody>
                            <%
                                listBhyt = bhytDao.get(100);
                                for (BHYT bhyt : listBhyt) {
                            %>
                            <tr>
                                <td class="data"><%=bhyt.getMaTheBHYT()%></td>
                                <td class="data"><%=bhyt.getHoTen()%></td>
                                <td class="data"><%=bhyt.getThanhPho() + ", " + bhyt.getQuanHuyen() + ", " + bhyt.getXaPhuong() + ", " + bhyt.getThonXom()%></td>
                                <td class="data"><%=bhyt.getLoaiBHYT()%></td>
                                <td class="data"><%=bhyt.getSoNguoiTrongHo()%></td>
                                <td class="data"><%=bhyt.getTienBHYT()%></td>
                            </tr>
                            <%
                                }
                            %>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
        </div>

        <p class="small text-center text-muted my-5">
            <em>More table examples coming soon...</em>
        </p>

    </div>
    <!-- /.container-fluid -->
</div>
