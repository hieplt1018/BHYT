<%-- 
    Document   : footer
    Created on : Apr 5, 2019, 10:06:05 AM
    Author     : asus
--%>

<%@page import="controller.BhytDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    BhytDAOImpl bhytDao = new BhytDAOImpl();
    int soLuongNguoiBac = bhytDao.getSoLuongTheoMien("Bắc");
    int soLuongNguoiTrung = bhytDao.getSoLuongTheoMien("Trung");
    int soLuongNguoiNam = bhytDao.getSoLuongTheoMien("Nam");
    int soLuongNguoiVungDBB = bhytDao.getSoLuongTheoVung("Đông Bắc Bộ");
    int soLuongNguoiVungTBB = bhytDao.getSoLuongTheoVung("Tây Bắc Bộ");
    int soLuongNguoiVungDBSH = bhytDao.getSoLuongTheoVung("Đồng bằng sông Hồng");
    int soLuongNguoiVungBTB = bhytDao.getSoLuongTheoVung("Bắc Trung Bộ");
    int soLuongNguoiVungNTB = bhytDao.getSoLuongTheoVung("Nam Trung Bộ");
    int soLuongNguoiVungTN = bhytDao.getSoLuongTheoVung("Tây Nguyên");
    int soLuongNguoiVungDNB = bhytDao.getSoLuongTheoVung("Đông Nam Bộ");
    int soLuongNguoiVungDBSCL = bhytDao.getSoLuongTheoVung("Đồng bằng sông Cửu Long");
%>
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
                    <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
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
            var soLuongBac = <%=soLuongNguoiBac %>;
            var soLuongNguoiNam = <%=soLuongNguoiNam %>;
            var soLuongNguoiTrung = <%=soLuongNguoiTrung %>;
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
            var soLuongDBB = <%=soLuongNguoiVungDBB %>;
            var soLuongTBB = <%=soLuongNguoiVungTBB %>;
            var soLuongDBSH = <%=soLuongNguoiVungDBSH %>;
            var soLuongBTB = <%=soLuongNguoiVungBTB %>;
            var soLuongNTB = <%=soLuongNguoiVungNTB %>;
            var soLuongTN = <%=soLuongNguoiVungTN %>;
            var soLuongDNB = <%=soLuongNguoiVungDNB %>;
            var soLuongDBSCL = <%=soLuongNguoiVungDBSCL %>;
            var myLineChart = new Chart(ctx, {
              type: 'bar',
              data: {
                labels: ["Tây Bắc Bộ", "Đông Bắc Bộ", "ĐB sông Hồng", "Bắc Trung Bộ", "Nam Trung Bộ", "Tây Nguyên", "Đông Nam Bộ", "ĐB sông Cửu Long"],
                datasets: [{
                  label: "Revenue",
                  backgroundColor: "rgba(2,117,216,1)",
                  borderColor: "rgba(2,117,216,1)",
                  data: [soLuongTBB, soLuongDBB, soLuongDBSH, soLuongBTB, soLuongNTB, soLuongTN, soLuongDNB, soLuongDBSCL],
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
                      max: 500,
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
    </body>

</html>
