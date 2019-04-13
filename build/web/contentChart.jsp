<%-- 
    Document   : contentChart
    Created on : Apr 5, 2019, 10:10:13 AM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="wrapper">

    <!-- Sidebar -->
    <ul class="sidebar navbar-nav ">
        <li class="nav-item" id="dasboard">
            <a class="nav-link dasboard" href="index.jsp">
                <i class="fas fa-fw fa-tachometer-alt"></i>
                <span>Dashboard</span>
            </a>
        </li>
        <li class="nav-item active" id="charts">
            <a class="nav-link " href="charts.jsp">
                <i class="fas fa-fw fa-chart-area"></i>
                <span>Charts</span></a>
        </li>
        <li class="nav-item" id="tables">
            <a class="nav-link" href="tables.jsp">
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
                <li class="breadcrumb-item active">Charts</li>
            </ol>

            <!-- Area Chart Example-->
            <div class="card mb-3">
                <div class="card-header">
                    <i class="fas fa-chart-area"></i>
                    Số tiền đóng BHYT theo từng năm (VND)</div>
                <div class="card-body">
                    <canvas id="myAreaChart" width="100%" height="30"></canvas>
                </div>
                <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
            </div>

            <div class="row">
                <div class="col-lg-8">
                    <div class="card mb-3">
                        <div class="card-header">
                            <i class="fas fa-chart-bar"></i>
                            Lượng người đã tham gia bảo hiểm theo vùng (Người)</div>
                        <div class="card-body">
                            <canvas id="myBarChart" width="100%" height="50"></canvas>
                        </div>
                        <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
                    </div>
                </div>
                <div class="col-lg-4">
                    <div class="card mb-3">
                        <div class="card-header">
                            <i class="fas fa-chart-pie"></i>
                            Tổng số người tham gia BHYT theo miền (Người)</div>
                        <div class="card-body">
                            <canvas id="myPieChart" width="100%" height="100"></canvas>
                        </div>
                        <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
                    </div>
                </div>
            </div>

            <p class="small text-center text-muted my-5">
                <em>More chart examples coming soon...</em>
            </p>

        </div>
        <!-- /.container-fluid -->
    </div>
