<%--
Document   : registrarPregunta
Created on : 04/08/2022, 11:26:33 AM
Author     : Gabriela Moron
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="sesiones1.jsp"%>

<!DOCTYPE html>
<html>
    <head>

        <meta charset="utf-8" />
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/owl.carousel.min.css">
        <link rel="stylesheet" href="css/magnific-popup.css">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/themify-icons.css">
        <link rel="stylesheet" href="css/nice-select.css">
        <link rel="stylesheet" href="css/flaticon.css">
        <link rel="stylesheet" href="css/gijgo.css">
        <link rel="stylesheet" href="css/animate.css">
        <link rel="stylesheet" href="css/slicknav.css">
        <link rel="stylesheet" href="css/style.css">

        <!-- <link rel="stylesheet" href="css/responsive.css"> -->
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link rel="icon" type="image/png" href="img/logo.png">

        <title>
            Administradora
        </title>
        <!--     Fonts and icons     -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet" />

        <!-- Font Awesome Icons -->
        <script src="https://kit.fontawesome.com/42d5adcbca.js" crossorigin="anonymous"></script>
        <link href="./assets/css/nucleo-svg.css" rel="stylesheet" />
        <!-- CSS Files -->
        <link id="pagestyle" href="css/argon-dashboard.css" rel="stylesheet" />
        <link id="pagestyle" href="css/style.css" rel="stylesheet" />
    </head>


    <body>

        <div class="contenedor">
 <a href="perfiles.jsp" class="boxed-btn4">Adoptar</a>
        </div>


        <%@include file="footer.jsp"%>


        <style>

            .contenedor{

                background: url(img/preparado.png);
                height: 42rem;
                display: flex;
                justify-content: center;
                align-items: center;
                margin-left: 14rem;
                margin-top: -2rem;
                margin-bottom: -2rem;
            }

            .boxed-btn4 {
background: -webkit-linear-gradient(0deg, #46B2C2 0%, #0E5FA1 99%);
    font-size: 16px;
    font-weight: 500;
    border: 1px solid transparent;
    color: #ffffff;
    padding: 17px 50px;
    font-family: "Poppins", sans-serif;
    display: flex;
    -webkit-border-radius: 30px;
    -moz-border-radius: 30px;
    border-radius: 30px;
    margin-left: -36rem;
    margin-bottom: -14rem;
}
.boxed-btn4:hover{
    color:black;
    border:black 5px;
}
        </style>
        <!-- Sidebar Backgrounds -->

        <!-- Sidenav Type -->

        <!-- Navbar Fixed -->


        <!--   Core JS Files   -->
        <script src="https://cdn.jsdelivr.net.npm.sweetalert2@9"></script>


        <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
        <script src="./assets/js/core/popper.min.js"></script>
        <script src="./assets/js/core/bootstrap.min.js"></script>
        <script src="./assets/js/plugins/perfect-scrollbar.min.js"></script>
        <script src="./assets/js/plugins/smooth-scrollbar.min.js"></script>
        <script src="./assets/js/plugins/chartjs.min.js"></script>

        <!-- Github buttons -->
        <script async defer src="https://buttons.github.io/buttons.js"></script>
        <!-- Control Center for Soft Dashboard: parallax effects, scripts for the example pages etc -->
        <script src="./assets/js/argon-dashboard.min.js?v=2.0.4"></script>
    </body>

</html>