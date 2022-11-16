<%-- 
    Document   : consultarMascota
    Created on : 25/07/2022, 09:50:38 AM
    Author     : julia_000
--%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloVO.MascotaVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.MascotaDAO"%>
<%@include file="sesiones.jsp"%>
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
      
        
        <title>Consultar mascota</title>
    </head>
    <body> <!--     Fonts and icons     -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet" />
 
  <!-- Font Awesome Icons -->
  <script src="https://kit.fontawesome.com/42d5adcbca.js" crossorigin="anonymous"></script>
  <link href="./assets/css/nucleo-svg.css" rel="stylesheet" />
  <!-- CSS Files -->
  <link id="pagestyle" href="css/argon-dashboard.css" rel="stylesheet" />
  <link id="pagestyle" href="css/style.css" rel="stylesheet" />
</head>

<body class="g-sidenav-show   bg-gray-100">
  <div class="min-height-300 bg-primary position-absolute w-100"></div>
  <aside class="sidenav bg-white navbar navbar-vertical navbar-expand-xs border-0 border-radius-xl my-3 fixed-start ms-4 " id="sidenav-main">
    <div class="sidenav-header">
      <i class="fas fa-times p-3 cursor-pointer text-secondary opacity-5 position-absolute end-0 top-0 d-none d-xl-none" aria-hidden="true" id="iconSidenav"></i>
      <a class="navbar-brand m-0" href="#" target="_blank">
        <img src="img/logo.png" class="navbar-brand-img h-100" alt="main_logo">
        
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
          <a class="nav-link " href="http://localhost:8080/refugio/consultarMascota.jsp">
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
  </aside>
  <main class="main-content position-relative border-radius-lg ">
    <!-- Navbar -->
    <nav class="navbar navbar-main navbar-expand-lg px-0 mx-4 shadow-none border-radius-xl " id="navbarBlur" data-scroll="false">
      <div class="container-fluid py-1 px-3">
        <nav aria-label="breadcrumb">
          <ol class="breadcrumb bg-transparent mb-0 pb-0 pt-1 px-0 me-sm-6 me-5">
            <li class="breadcrumb-item text-sm"><a class="opacity-5 text-white" href="javascript:;">Paginas</a></li>
            <li class="breadcrumb-item text-sm text-white active" aria-current="page">Inicio</li>
          </ol>
          <h6 class="font-weight-bolder text-white mb-0">Inicio</h6>
        </nav>
        <div class="collapse navbar-collapse mt-sm-0 mt-2 me-md-0 me-sm-4" id="navbar">
          <div class="ms-md-auto pe-md-3 d-flex align-items-center">
            <div class="input-group">
              <span class="input-group-text text-body"><i class="fas fa-search" aria-hidden="true"></i></span>
              <input type="text" class="form-control" placeholder="Buscar..">
            </div>
          </div>
          <ul class="navbar-nav  justify-content-end">
            <li class="nav-item d-flex align-items-center">
              <a href="javascript:;" class="nav-link text-white font-weight-bold px-0">
                <i class="fa fa-user me-sm-1"></i>
                <span class="d-sm-inline d-none">Cerrar sesión</span>
              </a>
            </li>
            <li class="nav-item d-xl-none ps-3 d-flex align-items-center">
              <a href="javascript:;" class="nav-link text-white p-0" id="iconNavbarSidenav">
                <div class="sidenav-toggler-inner">
                  <i class="sidenav-toggler-line bg-white"></i>
                  <i class="sidenav-toggler-line bg-white"></i>
                  <i class="sidenav-toggler-line bg-white"></i>
                </div>
              </a>
            </li>
            <li class="nav-item px-3 d-flex align-items-center">
              <a href="javascript:;" class="nav-link text-white p-0">
                <i class="fa fa-cog fixed-plugin-button-nav cursor-pointer"></i>
              </a>
            </li>
            <li class="nav-item dropdown pe-2 d-flex align-items-center">
              <a href="javascript:;" class="nav-link text-white p-0" id="dropdownMenuButton" data-bs-toggle="dropdown" aria-expanded="false">
                <i class="fa fa-bell cursor-pointer"></i>
              </a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
    <!-- End Navbar -->
    
      <div class="container-fluid py-4">
        <div class="row">
          <div class="col-12">
            <div class="card mb-4">
              <div class="card-header pb-0">

              </div>
              <div class="card-body px-0 pt-0 pb-2">
                <div class="table-responsive p-0">
                  <table class="table align-items-center mb-0">
            
                 
                 
    <div class="form">
        
        <h1 style="font-size: 50px;">Mascotas</h1>
          
        <form method="post" action="Mascota"  class="form">
            <input type="text" name="textIdMascota" class="validate form-control" placeholder="Identificador de la mascota">
            <button class="waves-effect waves-light btn" >Consultar</button>
            <input type="hidden" value="3" name="opcion">        
            
            <a href="registrarMascota.jsp" class="btn btn-info" >Registrar mascota</a><br><br>
             <a href="registrarNovedad.jsp" class="btn btn-info" >Registrar novedades</a><br><br>

        </form><br><br>
        <%            if (request.getAttribute("MensajeError") != null) { %>
        ${MensajeError}

        <% } else {%>
        ${MensajeExito}
        <%}%>
    

        <form method="post" action="Mascota">
            <table class="striped">
                <thead>
                    <tr>
                        <th>Identificador de mascota</th>
                        <th>Persona que registra</th>
                        <th>Fecha de ingreso</th>
                        <th>Nombre de la Mascota</th>
                        <th>Raza</th>
                        <th>Edad</th>
                        <th>Tipo de mascota</th>
                        <th>Estado</th>
                        <th></th>
                        <th></th>
                    </tr>


                    <%
                        MascotaVO masVO = new MascotaVO();
                        MascotaDAO masDAO = new MascotaDAO();
                        ArrayList<MascotaVO> listaMascotas = masDAO.listar();
                        for (int i = 0; i < listaMascotas.size(); i++) {

                            masVO = listaMascotas.get(i);

                    %>
                </thead>
                
          

                <tbody>
                    <tr>
                        <td><%=masVO.getIdMascota()%></td>
                        <td><%=masVO.getIdUsuario()%></td>
                        <td><%=masVO.getFechaIngreso()%></td>
                        <td><%=masVO.getNombre()%></td>
                        <td><%=masVO.getRaza()%></td>
                        <td><%=masVO.getEdad()%></td>
                        <td><%=masVO.getTipo()%></td>
                        <td><%=masVO.getEstadoMascota()%></td>
                        <td> <input type="hidden" value="5" name="opcion"  ><button class="waves-effect waves-light btn" value="<%=masVO.getIdMascota()%>" >Adoptado</button></td>
               
                </tr>
                <%}%>

                </tbody>
            </table>


            <style>
                .form{
                    padding: 5%;
                }
            </style>
        </form>
                    </div>
    </div>
    <script src="js/materialize.js" type="text/javascript"></script>
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

</html>
