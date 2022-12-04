<%--
    Document   : registrarVehiculo
    Created on : 13/05/2022, 11:26:33 AM
    Author     : Sena
--%>

<%@page import="ModeloDAO.MascotaDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloVO.MascotaVO"%>
<%@include file="logoPestaña.jsp"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

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
        <title>Crepetto</title>
        <link href="css/argon-dashboard.css" rel="stylesheet" type="text/css"/>


    <body>

        <%@include file="sesiones.jsp"%>



        <div class="inicioa">

            <img class="imghola" src="img/hola.png" alt=""/>

            <h1 class="hola2">Bienvenido  <span class="n">Administrador</span> </h1>

            <h3 class="hola">"Las mascotas <br>llenan tu corazón <br> sin intentarlo"</h3>
        </div>

        <style>
            body{

                margin:0%;
                overflow:hidden;
            }


            .imghola{    
                width: 34rem;
                background-size: cover;
                margin-top: 8rem;
                margin-left: 27rem;
            }
            .hola {
                font-size: 36px;
                margin-top: -8rem;
                margin-left: 10rem;
                font-family: revert;
            }
            .n{    font-size: 3rem;
                   font-family: 'Open Sans';
                   margin-top: -2rem;}
            .hola2 {
                margin-top: -32rem;
                margin-left: -24rem;
                font-size: 5rem;
                color: #f8f9fa;
                margin-bottom: 15rem;
                display: flex;
                flex-direction: column;
                justify-content: center;
                align-items: center;

            }

            .bg-primaryy {
                background: #f8f9fb;
                background-image: -moz-linear-gradient(0deg, #46B2C2 0%, #0E5FA1 99%);
                /* background-image: -webkit-linear-gradient(0deg, #46B2C2 0%, #0E5FA1 99%); */
                background-image: -ms-linear-gradient(0deg, #46B2C2 0%, #0E5FA1 99%);
                filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#76D7C4', endColorstr='#85C1E9 ', GradientType=1 );
            }


        </style>
        <br

        <script src="https://cdn.jsdelivr.net.npm.sweetalert2@9"></script>

        <script src="js/validacionRNovedad.js" type="text/javascript"></script>
        <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <script src="js/materialize.js" type="text/javascript"></script>
        <!-- JavaScript Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    </body>