<%-- 
    Document   : perfiles
    Created on : 18/10/2022, 01:19:23 PM
    Author     : julia_000
--%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloVO.MascotaVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.MascotaDAO"%>

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
        <link href="css/stylelogin.css" rel="stylesheet" type="text/css"/>
        <!-- <link rel="stylesheet" href="css/responsive.css"> -->
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="./css/perfiles.css" rel="stylesheet" type="text/css"/>

        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <header>
            <div class="header-area ">

                <div id="sticky-header" class="main-header-area">
                    <div class="container">
                        <div class="row align-items-center">
                            <div class="col-xl-3 col-lg-3">
                                <div class="logo">
                                    <a href="index.html">
                                        <img src="img/logo.png" alt="">
                                    </a>
                                </div>
                            </div>
                            <div class="col-xl-9 col-lg-9">
                                <div class="main-menu  d-none d-lg-block">
                                    <nav>
                                        <ul id="navigation">
                                            <li><a href="index.html">Inicio</a></li>
                                            <li><a href="#nosotros">Nosotros</a></li>
                                            <li><a href="#modulos">Funcionalidades</a></li>
                                            <li><a href="#ventajas">Ventajas</a></li>
                                            <li><a href="contact.html">Contacto</a></li>
                                            <li><a href="../login-form-17/index.html">Iniciar sesión</a></li>
                                        </ul>

                                        <a href=""><img src="/anipat/img/i logo.png" alt=""></a>
                                    </nav>
                                </div>
                            </div>
                            <div class="col-12">
                                <div class="mobile_menu d-block d-lg-none"></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </header>

        <%
            MascotaVO masVO = new MascotaVO();
            MascotaDAO masDAO = new MascotaDAO();
            ArrayList<MascotaVO> listaMascotas = masDAO.listar();
            for (int i = 0; i < listaMascotas.size(); i++) {

                masVO = listaMascotas.get(i);

        %>
        
        <div class="Cards">
            <div class="card" style="width: 18rem;">
                <img class="card-img-top" src="ControladorIMG?idMascota=<%=masVO.getIdMascota()%>" alt="Card image cap" width="200"  >
                <div class="card-body">
                    <h5 class="card-title"><%=masVO.getNombre()%></h5>
                    <p class="card-text"><%=masVO.getRaza()%> <br>
                        <%=masVO.getEdad()%> años <br>
                    <%=masVO.getTipo()%><br>
                    <%=masVO.getEstadoMascota()%></p>
                    <a href="Respuesta?menu=respuestas&opcion=default" class="btn btn-primary">Adoptar</a>
                </div>
            </div>
        </div>
        <%}%>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    </body>
</html>
