<%-- 
    Document   : contentIndex
    Created on : Apr 5, 2019, 10:06:05 AM
    Author     : asus
--%>

<%@page import="controller.BhytDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    BhytDAOImpl bhytDao = new BhytDAOImpl();
    int sl2018 = bhytDao.getSoLuongTheoNam("2018");
    int slNguoi = bhytDao.getSoLuongNguoi();
    
    //TienBHYT
    long tienBHYT = bhytDao.getTongTienBHYT();
    long tienBHYT2018 = bhytDao.getTienBHYTTheoNam("2018");
%>
<div id="wrapper">

            <!-- Sidebar -->
            <ul class="sidebar navbar-nav ">
                <li class="nav-item active" id="dasboard">
                    <a class="nav-link dasboard" href="index.jsp">
                        <i class="fas fa-fw fa-tachometer-alt"></i>
                        <span>Dashboard</span>
                    </a>
                </li>
                <li class="nav-item" id="charts">
                    <a class="nav-link charts" href="charts.jsp">
                        <i class="fas fa-fw fa-chart-area"></i>
                        <span>Charts</span></a>
                </li>
                <li class="nav-item" id="tables">
                    <a class="nav-link tables" href="tables.jsp">
                        <i class="fas fa-fw fa-table"></i>
                        <span>Tables</span></a>
                </li>
                <li class="nav-item" id="tables">
                    <a class="nav-link tables" href="config.jsp">
                        <i class="fas fa-fw fa-wrench"></i>
                        <span>Config</span></a>
                </li>
            </ul>
            
            
            <div id="content-wrapper">

                <div class="container-fluid">

                    <!-- Breadcrumbs-->
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item">
                            <a href="#">Dashboard</a>
                        </li>
                        <li class="breadcrumb-item active">Overview</li>
                    </ol>

                    <!-- Icon Cards-->
                    <div class="row">
                        <div class="col-xl-3 col-sm-6 mb-3">
                            <div class="card text-white bg-primary o-hidden h-100">
                                <div class="card-body">
                                    <div class="card-body-icon">
                                        <i class="fas fa-fw fa-comments"></i>
                                    </div>
                                    <div class="mr-5">Tổng số người đã tham gia: <br><i><em><b><%=String.format("%,d", slNguoi) %></b></em></i></div>
                                </div>
                                <a class="card-footer text-white clearfix small z-1" href="tables.jsp">
                                    <span class="float-left">View Details</span>
                                    <span class="float-right">
                                        <i class="fas fa-angle-right"></i>
                                    </span>
                                </a>
                            </div>
                        </div>
                        <div class="col-xl-3 col-sm-6 mb-3">
                            <div class="card text-white bg-warning o-hidden h-100">
                                <div class="card-body">
                                    <div class="card-body-icon">
                                        <i class="fas fa-fw fa-list"></i>
                                    </div>
                                    <div class="mr-5">Số người tham gia 2018: <br><i><em><b><%=String.format("%,d", sl2018) %></b></em></i></div>
                                </div>
                                <a class="card-footer text-white clearfix small z-1" href="tableYear.jsp">
                                    <span class="float-left">View Details</span>
                                    <span class="float-right">
                                        <i class="fas fa-angle-right"></i>
                                    </span>
                                </a>
                            </div>
                        </div>
                        <div class="col-xl-3 col-sm-6 mb-3">
                            <div class="card text-white bg-success o-hidden h-100">
                                <div class="card-body">
                                    <div class="card-body-icon">
                                        <i class="fas fa-fw fa-shopping-cart"></i>
                                    </div>
                                    <div class="mr-5">Tổng tiền BHYT đã đóng: <br><i><em><b><%=String.format("%,d", tienBHYT) %></b></em> VND</i></div>
                                </div>
                                <a class="card-footer text-white clearfix small z-1" href="#">
                                    <span class="float-left">View Details</span>
                                    <span class="float-right">
                                        <i class="fas fa-angle-right"></i>
                                    </span>
                                </a>
                            </div>
                        </div>
                        <div class="col-xl-3 col-sm-6 mb-3">
                            <div class="card text-white bg-danger o-hidden h-100">
                                <div class="card-body">
                                    <div class="card-body-icon">
                                        <i class="fas fa-fw fa-life-ring"></i>
                                    </div>
                                    <div class="mr-5">Số tiền đã đóng 2018: <br><i><em><b><%=String.format("%,d", tienBHYT2018) %></b></em> VND</i></div>
                                </div>
                                <a class="card-footer text-white clearfix small z-1" href="#">
                                    <span class="float-left">View Details</span>
                                    <span class="float-right">
                                        <i class="fas fa-angle-right"></i>
                                    </span>
                                </a>
                            </div>
                        </div>
                    </div>

