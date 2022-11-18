<%-- 
    Document   : Sesiones
    Created on : 23/05/2022, 10:28:35 a. m.
    Author     : uSER
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
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
        <title>sesion admi</title>
    </head>
    <%
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-control", "no-cache,no-store,must-revalidate");
        response.setDateHeader("Expires", 0);
    %>
    <%
        HttpSession miSesion = (HttpSession) request.getSession();
        String correoUsuario = "";
        if (miSesion.getAttribute("datosUsuario") == null) {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else {
            UsuarioVO usuVO = (UsuarioVO) miSesion.getAttribute("datosUsuario");
            correoUsuario = usuVO.getCorreoUsuario();

        }
    %>
     <body class="g-sidenav-show   bg-gray-100">
        <div class="min-height-300 bg-primary position-absolute w-100"></div>
        <aside class="sidenav bg-white navbar navbar-vertical navbar-expand-xs border-0 border-radius-xl my-3 fixed-start ms-4 " id="sidenav-main">
            <div class="sidenav-header">
                <i class="fas fa-times p-3 cursor-pointer text-secondary opacity-5 position-absolute end-0 top-0 d-none d-xl-none" aria-hidden="true" id="iconSidenav"></i>
                <a class="navbar-brand m-0" href="#" target="_blank">
                    <img src="logo.png" class="navbar-brand-img h-100" alt="main_logo">
                      <li class="usuario"><%=correoUsuario%></li>
                                          

                </a>
            </div>
            <hr class="horizontal dark mt-0">
            <div class="collapse navbar-collapse  w-auto " id="sidenav-collapse-main">
                <ul class="navbar-nav">
                    <li class="nav-item">
                      
                        <a class="nav-link active" href="./pages/dashboard.html">
                            <div class="icon icon-shape icon-sm border-radius-md text-center me-2 d-flex align-items-center justify-content-center">
                                <i class="fa fa-indent text-info text-sm opacity-10"></i>
                            </div>
                            <span class="nav-link-text ms-1">Inicio</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link " href="./pages/tables.html">
                            <div class="icon icon-shape icon-sm border-radius-md text-center me-2 d-flex align-items-center justify-content-center">
                                <i class="fa fa-paw text-info text-sm opacity-10"></i>
                            </div>
                            <span class="nav-link-text ms-1">Mascotas</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link " href="./pages/billing.html">
                            <div class="icon icon-shape icon-sm border-radius-md text-center me-2 d-flex align-items-center justify-content-center">
                                <i class="fa fa-plus-square text-info text-sm opacity-10"></i>
                            </div>
                            <span class="nav-link-text ms-1">Novedades</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link " href="./pages/virtual-reality.html">
                            <div class="icon icon-shape icon-sm border-radius-md text-center me-2 d-flex align-items-center justify-content-center">
                                <i class="fa fa-user text-info text-sm opacity-10"></i>
                            </div>
                            <span class="nav-link-text ms-1">Usuarios</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link " href="./pages/rtl.html">
                            <div class="icon icon-shape icon-sm border-radius-md text-center me-2 d-flex align-items-center justify-content-center">
                                <i class="fa fa-bell text-info text-sm opacity-10"></i>
                            </div>
                            <span class="nav-link-text ms-1">Solicitudes</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link " href="registrarPregunta.jsp">
                            <div class="icon icon-shape icon-sm border-radius-md text-center me-2 d-flex align-items-center justify-content-center">
                                <i class="fa fa-pencil text-info text-sm opacity-10"></i>
                            </div>
                            <span class="nav-link-text ms-1">Formulario</span>
                        </a>
                    </li>



            </div>
                <form method="post" action="Sesiones">
                              <span><input class="btn btn-primaryy submit px-3 cerrar" type="submit" value="Cerrar sesion"></span>
                                            </form>
        </aside>
        <main class="main-content position-relative border-radius-lg ">
            <!-- Navbar -->
            <nav class="navbar navbar-main navbar-expand-lg px-0 mx-4 shadow-none border-radius-xl " id="navbarBlur" data-scroll="false">
                <div class="container-fluid py-1 px-3">
                  


                </div>
                </div>
            </nav>
            <!-- End Navbar -->
    <body>

      
      
      
    </body>
</html>
