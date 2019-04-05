<%-- 
    Document   : login
    Created on : Apr 5, 2019, 9:59:45 AM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>BHYT - Login</title>

        <!-- Custom fonts for this template-->
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

        <!-- Custom styles for this template-->
        <link href="css/sb-admin.css" rel="stylesheet">

    </head>
    <body class="bg-dark"> 
        <% 
            Object error = request.getAttribute("errorMessage");
        %>
        <div class="section" style="margin: 10% 0">
            <div class="container">
                <div class="card card-login mx-auto mt-5">
                    <div class="card-header">Login</div>
                    <div class="card-body">
                        <form action="${pageContext.request.contextPath}/LoginServlet"  method="post">
                            <div class="form-group">
                                <label for="exampleInputEmail1">Username</label>
                                <input name="username" type="text" class="form-control" id="exampleInputEmail" aria-describedby="emailHelp" placeholder="Email" required autofocus>
                                <small id="emailHelp" class="form-text text-muted">We'll never share your account with anyone else.</small>
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">Password</label>
                                <input name="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" required>
                            </div>
                            <%
                                            if (error != null) {%>
                            <div style ="color:tomato; margin-bottom: 5px;">
                                <%=error%>
                            </div>
                            <%}
                            %>
                            <button type="submit" class="btn btn-primary">Login</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!-- Bootstrap core JavaScript-->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    </body>

</html>

