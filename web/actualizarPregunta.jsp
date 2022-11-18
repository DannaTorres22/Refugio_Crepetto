<%-- 
    Document   : verMascota
    Created on : 19/08/2022, 09:21:42 AM
    Author     : julia_000
--%>



<%@page import="ModeloVO.PreguntaVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="sesiones.jsp"%>
<!DOCTYPE html>
<html>
<head>
  
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
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
  <link rel="icon" type="image/png" href="img/logo.png">
  <title>
    Administradora
  </title>
  <!--     Fonts and icons     -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet" />
  <!-- Nucleo Icons -->
  <link href="./assets/css/nucleo-icons.css" rel="stylesheet" />
  <link href="./assets/css/nucleo-svg.css" rel="stylesheet" />
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
            
                    <div class="form" >
                      <div class="container-fluid py-4">
                        <div class="row">
                          <div class="col-6 col-md-4">
                              <i class="fa fa-eye"></i>
                                 <a href="registrarPregunta.jsp"  >  Visualizar</a><br><br>
                                  </div>
                          <div class="col-6 col-md-4">
                            
                                <div class="row">
                                  <div class="col-8">
                                      <i class="fa fa-pencil-square-o"></i>
                                    <a href="consultarPregunta.jsp"   > Editar</a><br><br>
                                  </div>   
                                  </div> 
                            </div>
                          </div>
                         
                        <h1>EDITAR</h1>
                        <br>
                                               <%
            PreguntaVO preVO = (PreguntaVO) request.getAttribute("datosConsultados");
            String id = String.valueOf(request.getAttribute("idPregunta"));
            if (preVO != null) {%>
        <form method="post" action="Pregunta" onsubmit="return validar()">
           
                    <input type="hidden" class="form-control" value="<%=id%>"name="textIdPregunta">
              
                   <div class="form-group col-md-10">
                    <label for="inputEmail4">Nombre de la pregunta</label>
                    <input type="text" id="nombre" class="form-control" value="<%=preVO.getNombre()%>" id="nombre" placeholder="Nombre de la pregunta" name="textNombreP">
                </div>
                <br>

            <div class="form-group col-md-10">
                <label for="inputEmail4">Descripción</label>
                <input type="text" id="edad" name="textDesc" class="form-control" value="<%=preVO.getDescripcion()%>">
            </div>
            
           
            <div class="botonese">
                <div class="col-6 col-md-4">
                <button id="actualizar" class="waves-effect waves-light btn">Actualizar</button>
                <input type="hidden" value="2" name="opcion" id="actualizar"></div>
            </form>
            <div class="col-6 col-md-4">
                <div class="col-8">
            <form method="post" action="Pregunta">
                <input type="hidden" class="form-control" value="<%=id%>"name="textIdPregunta">
             <button id="eliminar" class="waves-effect waves-light btn">Eliminar</button>
            <input type="hidden" value="4" name="opcion" id="eliminar">
            </form>
</div></div>
            
             </div>
            <%}%>
            <%
            if (request.getAttribute("MensajeError") != null) { %>
            ${MensajeError}

            <% } else {%>
            ${MensajeExito}
            <%}%>
            




                
               
                
                
                
                
                
                <style>
                    .form{
                      padding-left: 6rem;
                      padding-top: 0rem;
                      padding-right: 6rem;
                    }
                
                    .botonese{
                        margin-left: 2rem;
                    }
                    
                
                
                
                </style>
                <br>
              
              
                
                
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div> 
    </div>
    </div>
    <footer class="footer">
      <div class="socail_links">
          <ul>
              <li>
                  <a href="#">
                      <i class="ti-facebook"></i>
                  </a>
              </li>
              <li>
                  <a href="#">
                      <i class="ti-pinterest"></i>
                  </a>
              </li>
              <li>
                  <a href="#">
                      <i class="fa fa-google-plus"></i>
                  </a>
              </li>
              <li>
                  <a href="#">
                      <i class="fa fa-linkedin"></i>
                  </a>
              </li>
          </ul>
      </div>

      </div>
      </div>
      </div>
      </div>
      </div>
      <div class="copy-right_text">
          <div class="container">
              <div class="bordered_1px"></div>
              <div class="row">
                  <div class="col-xl-12">
                      <p class="copy_right text-center">
                      <p>
                          <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                          Copyright &copy;
                          <script>document.write(new Date().getFullYear());</script> Crepetto
                          <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                      </p>
                      </p>
                  </div>
              </div>
          </div>
      </div>
  </footer>
  </main>
  
      
        <!-- Sidebar Backgrounds -->
       
        <!-- Sidenav Type -->
        
        <!-- Navbar Fixed -->
        

  <!--   Core JS Files   -->
  <script src="https://cdn.jsdelivr.net.npm.sweetalert2@9"></script>
                
                
  <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
  
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
 <script src="https://cdn.jsdelivr.net.npm.sweetalert2@9"></script>
    <script src="js/validacionPregunta.js" type="text/javascript"></script>
    <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
  
  <!-- Github buttons -->
  <script async defer src="https://buttons.github.io/buttons.js"></script>
  <!-- Control Center for Soft Dashboard: parallax effects, scripts for the example pages etc -->
  <script src="./assets/js/argon-dashboard.min.js?v=2.0.4"></script>
</body>

</html>