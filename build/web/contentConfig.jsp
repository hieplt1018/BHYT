<%-- 
    Document   : contentConfig
    Created on : Apr 13, 2019, 9:59:50 AM
    Author     : asus
--%>

<%@page import="helper.Config"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    Object error = request.getAttribute("errorMessage");
    Object success = request.getAttribute("successMessage");

%>
<div id="wrapper">

    <!-- Sidebar -->
    <ul class="sidebar navbar-nav ">
        <li class="nav-item" id="dasboard">
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
        <li class="nav-item active" id="tables">
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
                <li class="breadcrumb-item active">Config</li>
            </ol>
            <%                    if (error != null) {%>
            <div class="mt-3 mb-3" style ="color:tomato;">
                <%=error%>
            </div>  
            <%} else if (success != null) {%>
            <div class="mt-3 mb-3" style ="color:green;">
                <%=success%>
            </div>
            <%
                }
            %>
            <!-- Form -->
            <div class="card">
                <div class="card-header">Thiết lập giá trị</div>
                <div class="card-body">
                    <form action="${pageContext.request.contextPath}/ConfigServlet" method="post">
                        <!-- Lương-->
                        <div class="form-row">
                            <div class="col-md-4 mb-3">
                                <label for="LuongCS">Lương cơ sở</label>
                                <input name="LuongCS" type="number" class="form-control " id="validationServer01" placeholder="" value="" required>
                            </div>
                            <div class="col-md-4 mb-3">
                                <label for="PhanTramLuongCS">Phần trăm lương cơ sở</label>
                                <input name="PhanTramLuongCS" type="number" min=1 max=100 step=0.1 class="form-control " id="validationServer02" placeholder="" value="" required>
                            </div>
                        </div>
                        <!-- Hỗ trợ-->
                        <hr>
                        <h3>Phần trăm hỗ trợ</h3>
                        <div class="form-row">
                            <div class="col-md-4 mb-3">
                                <label for="HSSV">HSSV</label>
                                <input name="HSSV" type="number" min=1 max=100 step=0.1 class="form-control " id="validationServer03" placeholder="" required>
                            </div>
                            <div class="col-md-4 mb-3">
                                <label for="HoNLNN">Hộ NLND nghiệp có thu nhập TB</label>
                                <input name="HoNLNN" type="number" min=1 max=100 step=0.1 class="form-control " id="validationServer04" placeholder="" required>
                                <div class="invalid-feedback">
                                    *NNND: nông, lâm, ngư, diêm.
                                </div>
                            </div>
                            <div class="col-md-4 mb-3">
                                <label for="HCN">Hộ cận nghèo</label>
                                <input name="HCN" type="number" min=1 max=100 step=0.1 class="form-control " id="validationServer05" placeholder="" required>
                            </div>
                        </div>
                        <!-- Hộ gia đình-->
                        <div class="card">
                            <div class="card-header">Hộ gia đình</div>
                            <div class="card-body">
                                <div class="form-row">
                                    <div class="col-md-4 mb-3">
                                        <label for="NT1">Người thứ nhất</label>
                                        <input name="NT1" type="number" min=1 max=100 step=0.1 class="form-control " id="validationServer06" placeholder="" required>
                                    </div>
                                    <div class="col-md-4 mb-3">
                                        <label for="NT2">Người thứ hai</label>
                                        <input name="NT2" type="number" min=1 max=100 step=0.1 class="form-control " id="validationServer07" placeholder="" required>
                                    </div>
                                    <div class="col-md-4 mb-3">
                                        <label for="NT3">Người thứ ba</label>
                                        <input name="NT3" type="number" min=1 max=100 step=0.1 class="form-control " id="validationServer08" placeholder="" required>
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="col-md-4 mb-3">
                                        <label for="NT4">Người thứ tư</label>
                                        <input name="NT4" type="number" min=1 max=100 step=0.1 class="form-control" id="validationServer09" placeholder="" required>
                                    </div>
                                    <div class="col-md-4 mb-3">
                                        <label for="NT5">Người thứ năm trở lên</label>
                                        <input name="NT5" type="number" min=1 max=100 step=0.1 class="form-control " id="validationServer10" placeholder="" required>
                                    </div>
                                </div>
                            </div>
                            <div class="card-footer"></div>
                        </div>  
                        <button type="submit" class="btn btn-primary mt-3">Config</button>    
                    </form>
                </div>
            </div>
            