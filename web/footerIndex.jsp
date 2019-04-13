<%-- 
    Document   : footer
    Created on : Apr 5, 2019, 10:06:05 AM
    Author     : asus
--%>

<%@page import="controller.BhytDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    BhytDAOImpl bhytDao = new BhytDAOImpl();
    int slHssv = bhytDao.getSoLuongTheoLoaiTatCa("HSSV");
    int slHcn = bhytDao.getSoLuongTheoLoaiTatCa("Hộ cận nghèo");
    int slHtb = bhytDao.getSoLuongTheoLoaiTatCa("Hộ nông lâm ngư nghiệp thu nhập trung bình");
    int slNld = bhytDao.getSoLuongTheoLoaiTatCa("Người lao động");
    int slHgd = bhytDao.getSoLuongTheoLoaiTatCa("Hộ gia đình");
    int slBhxhd = bhytDao.getSoLuongTheoLoaiTatCa("BHXH đóng");
    int slNNd = bhytDao.getSoLuongTheoLoaiTatCa("Nhà nước đóng");
    
    //Bieu do theo loai BHYT
    int sl2015 = bhytDao.getSoLuongTheoNam("2015");
    int sl2016 = bhytDao.getSoLuongTheoNam("2016");
    int sl2017 = bhytDao.getSoLuongTheoNam("2017");
    int sl2018 = bhytDao.getSoLuongTheoNam("2018");
    int slNguoi = bhytDao.getSoLuongNguoi();
   
%>

        <!-- Area Chart Example-->
        <div class="card mb-3">
            <div class="card-header">
                <i class="fas fa-chart-area"></i>
                Biểu đồ số lượng người tham gia theo từng năm (Người)</div>
            <div class="card-body">
                <canvas id="myAreaChart" width="100%" height="30"></canvas>
            </div>
            <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
        </div>

         <!-- Bar Chart -->
        <div class="card mb-3">
            <div class="card-header">
                <i class="fas fa-chart-bar"></i>
                Biểu đồ số lượng người tham gia theo từng loại BHYT (Người)</div>
            <div class="card-body">
                <canvas id="myBarChart" width="100%" height="50"></canvas>
            </div>
            <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
        </div>
    </div>
    <!-- /.container-fluid -->

        <!-- Sticky Footer -->
        <footer class="sticky-footer">
            <div class="container my-auto">
                <div class="copyright text-center my-auto">
                    <span>Copyright © Your Website 2019</span>
                </div>
            </div>
        </footer>

        </div>
        <!-- /.content-wrapper -->

        </div>
        <!-- /#wrapper -->

        <!-- Scroll to Top Button-->
        <a class="scroll-to-top rounded" href="#page-top">
            <i class="fas fa-angle-up"></i>
        </a>

        <!-- Logout Modal-->
        <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                        <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                    <div class="modal-body mx-auto" >Select "Logout" below if you are ready to logout!</div>
                    <div class="modal-footer">
                        <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                        <a class="btn btn-primary" href="${pageContext.request.contextPath}/LogoutServlet">Logout</a>
                    </div>
                </div>
            </div>
        </div>

        <!-- Bootstrap core JavaScript-->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Page level plugin JavaScript-->
        <script src="vendor/chart.js/Chart.min.js"></script>
        <script src="vendor/datatables/jquery.dataTables.js"></script>
        <script src="vendor/datatables/dataTables.bootstrap4.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="js/sb-admin.min.js"></script>

        <!-- Demo scripts for this page-->
        <script src="js/demo/datatables-demo.js"></script>
        <script src="js/demo/chart-area-demo.js"></script>
        <script src="js/demo/chart-pie-demo.js"></script>
        <!--<script src="js/demo/chart-bar-demo.js"></script>-->
        <script type="text/javascript" >
            var ctx = document.getElementById("myPieChart");
            var myPieChart = new Chart(ctx, {
                type: 'pie',
                data: {
                    labels: ["Miền Bắc", "Miền Trung", "Miền Nam"],
                    datasets: [{
                            data: [soLuongBac, soLuongNguoiTrung, soLuongNguoiNam],
                            backgroundColor: ['#007bff', '#dc3545', '#ffc107'],
                        }],
                },
            });
        </script>
        <script type="text/javascript">
            var ctx = document.getElementById("myBarChart");
            var slHssv = <%=slHssv %>;
            var slBhxhd = <%=slBhxhd %>;
            var slHcn = <%=slHcn %>;
            var slHgd = <%=slHgd %>;
            var slHtb = <%=slHtb %>;
            var slNNd = <%=slNNd %>;
            var slNld = <%=slNld %>;
            
            var myLineChart = new Chart(ctx, {
              type: 'bar',
              data: {
                labels: ["HSSV", "Hộ cận nghèo", "Hộ nông lâm ngư nghiệp thu nhập TB", "Người lao động", "Hộ gia đình", "BHXH đóng", "Nhà nước đóng"],
                datasets: [{
                  label: "Revenue",
                  backgroundColor: "rgba(2,117,216,1)",
                  borderColor: "rgba(2,117,216,1)",
                  data: [slHssv, slHcn, slHtb, slNld, slHgd, slBhxhd, slNNd],
                }],
              },
              options: {
                scales: {
                  xAxes: [{
                    time: {
                      unit: 'Vùng'
                    },
                    gridLines: {
                      display: false
                    },
                    ticks: {
                      maxTicksLimit: 6
                    }
                  }],
                  yAxes: [{
                    ticks: {
                      min: 0,
                      max: 400,
                      maxTicksLimit: 5
                    },
                    gridLines: {
                      display: true
                    }
                  }],
                },
                legend: {
                  display: false
                }
              }
            });
        </script>
        <script type="text/javascript">
            var ctx = document.getElementById("myAreaChart");
            var sl2015 = <%=sl2015 %>;
            var sl2016 = <%=sl2016 %>;
            var sl2017 = <%=sl2017 %>;
            var sl2018 = <%=sl2018 %>;
            var myLineChart = new Chart(ctx, {
              type: 'line',
              data: {
                labels: ["2018", "2017", "2016", "2015"],
                datasets: [{
                  label: "Sessions",
                  lineTension: 0.3,
                  backgroundColor: "rgba(2,117,216,0.2)",
                  borderColor: "rgba(2,117,216,1)",
                  pointRadius: 5,
                  pointBackgroundColor: "rgba(2,117,216,1)",
                  pointBorderColor: "rgba(255,255,255,0.8)",
                  pointHoverRadius: 5,
                  pointHoverBackgroundColor: "rgba(2,117,216,1)",
                  pointHitRadius: 50,
                  pointBorderWidth: 2,
                  data: [sl2015, sl2016, sl2017, sl2018],
                }],
              },
              options: {
                scales: {
                  xAxes: [{
                    time: {
                      unit: 'date'
                    },
                    gridLines: {
                      display: false
                    },
                    ticks: {
                      maxTicksLimit: 7
                    }
                  }],
                  yAxes: [{
                    ticks: {
                      min: 0,
                      max: 1000,
                      maxTicksLimit: 5
                    },
                    gridLines: {
                      color: "rgba(0, 0, 0, .125)",
                    }
                  }],
                },
                legend: {
                  display: false
                }
              }
            });
    
        </script>
    </body>

</html>
