<%-- 
    Document   : cosultarPregunta
    Created on : 24/09/2022, 09:36:46 AM
    Author     : Gabriela Moron
--%>
<%-- 
    Document   : consultarPregunta
    Created on : 25/07/2022, 09:50:38 AM
    Author     : julia_000
--%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloVO.PreguntaVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.PreguntaDAO"%>
<%@include file="sesiones.jsp"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
  <link rel="icon" type="image/png" href="../img/logo.png">
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
        <img src="../img/logo.png" class="navbar-brand-img h-100" alt="main_logo">
        
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
          <a class="nav-link " href="./pages/pregunta.html">
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
              <ul class="dropdown-menu  dropdown-menu-end  px-2 py-3 me-sm-n4" aria-labelledby="dropdownMenuButton">
                <li class="mb-2">
                  <a class="dropdown-item border-radius-md" href="javascript:;">
                    <div class="d-flex py-1">
                      <div class="my-auto">
                        <img src="./assets/img/team-2.jpg" class="avatar avatar-sm  me-3 ">
                      </div>
                      <div class="d-flex flex-column justify-content-center">
                        <h6 class="text-sm font-weight-normal mb-1">
                          <span class="font-weight-bold">New message</span> from Laur
                        </h6>
                        <p class="text-xs text-secondary mb-0">
                          <i class="fa fa-clock me-1"></i>
                          13 minutes ago
                        </p>
                      </div>
                    </div>
                  </a>
                </li>
                <li class="mb-2">
                  <a class="dropdown-item border-radius-md" href="javascript:;">
                    <div class="d-flex py-1">
                      <div class="my-auto">
                        <img src="./assets/img/small-logos/logo-spotify.svg" class="avatar avatar-sm bg-gradient-dark  me-3 ">
                      </div>
                      <div class="d-flex flex-column justify-content-center">
                        <h6 class="text-sm font-weight-normal mb-1">
                          <span class="font-weight-bold">New album</span> by Travis Scott
                        </h6>
                        <p class="text-xs text-secondary mb-0">
                          <i class="fa fa-clock me-1"></i>
                          1 day
                        </p>
                      </div>
                    </div>
                  </a>
                </li>
                <li>
                  <a class="dropdown-item border-radius-md" href="javascript:;">
                    <div class="d-flex py-1">
                      <div class="avatar avatar-sm bg-gradient-secondary  me-3  my-auto">
                        <svg width="12px" height="12px" viewBox="0 0 43 36" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink">
                          <title>credit-card</title>
                          <g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd">
                            <g transform="translate(-2169.000000, -745.000000)" fill="#FFFFFF" fill-rule="nonzero">
                              <g transform="translate(1716.000000, 291.000000)">
                                <g transform="translate(453.000000, 454.000000)">
                                  <path class="color-background" d="M43,10.7482083 L43,3.58333333 C43,1.60354167 41.3964583,0 39.4166667,0 L3.58333333,0 C1.60354167,0 0,1.60354167 0,3.58333333 L0,10.7482083 L43,10.7482083 Z" opacity="0.593633743"></path>
                                  <path class="color-background" d="M0,16.125 L0,32.25 C0,34.2297917 1.60354167,35.8333333 3.58333333,35.8333333 L39.4166667,35.8333333 C41.3964583,35.8333333 43,34.2297917 43,32.25 L43,16.125 L0,16.125 Z M19.7083333,26.875 L7.16666667,26.875 L7.16666667,23.2916667 L19.7083333,23.2916667 L19.7083333,26.875 Z M35.8333333,26.875 L28.6666667,26.875 L28.6666667,23.2916667 L35.8333333,23.2916667 L35.8333333,26.875 Z"></path>
                                </g>
                              </g>
                            </g>
                          </g>
                        </svg>
                      </div>
                      <div class="d-flex flex-column justify-content-center">
                        <h6 class="text-sm font-weight-normal mb-1">
                          Payment successfully completed
                        </h6>
                        <p class="text-xs text-secondary mb-0">
                          <i class="fa fa-clock me-1"></i>
                          2 days
                        </p>
                      </div>
                    </div>
                  </a>
                </li>
              </ul>
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
                  <div class="table align-items-center mb-0">
            
                    <div class="form" >
                      <div class="container-fluid py-4">
                        <div class="row">
                          <div class="col-6 col-md-4">
                            <i  class="fa fa-eye"></i>
                                 <a href="verFormulario.jsp" >  Visualizar</a><br><br>
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
                         <div class="row"> <h1>Consulta</h1>
                          <br></div>
                       
                        <form method="post" action="Pregunta">
                          <div class="row">
                            <div class="col-6 col-md-4">
                              <div class="input-group">
                                <span class="input-group-text text-body"><i class="fas fa-search" aria-hidden="true"></i></span>
                                <input type="text" name="textIdPregunta" class="form-control validate" placeholder="Identificador de la Pregunta">
                              </div>
                            </div>
                           <div class="col-8">
                            <button class="waves-effect waves-light btn" >Consultar</button>
                            <input type="hidden" value="3" name="opcion">     
                            <a href="registrarPregunta.jsp" class="mas form-control btn btn-primary submit px-3">+</a>
                          </div>
                          </div>
                          
                        
                          
                         <br><br>
                      <%            if (request.getAttribute("MensajeError") != null) { %>
                      ${MensajeError}
              
                      <% } else {%>
                      ${MensajeExito}
                      <%}%>
                  
              
                          <table class="table align-items-center mb-0">
                              <thead>
                                  <tr>
                                      <th>Identificador de Pregunta</th>
                                      <th>Pregunta</th>
                                       <th>Descripción</th>
                                       
                                      
                                  </tr>
              
              
                                  <%
                                      PreguntaVO preVO = new PreguntaVO();
                                      PreguntaDAO preDAO = new PreguntaDAO();
                                      ArrayList<PreguntaVO> listaPreguntas = preDAO.listar();
                                      for (int i = 0; i < listaPreguntas.size(); i++) {
              
                                          preVO = listaPreguntas.get(i);
              
                                  %>
                              </thead>
                              
                        
              
                              <tbody>
                                  <tr>
                                      <td><%=preVO.getIdPregunta()%></td>
                                       <td>  <div class="d-flex px-2 py-1"><%=preVO.getNombre()%><br><%=preVO.getDescripcion()%></div></td>
                                      <td> <form method="post" action="Pregunta">
                                        <input type="hidden" class="form-control" name="textIdPregunta">
                                     <button id="eliminar" class="waves-effect waves-light btn">Eliminar</button>
                                    <input type="hidden" value="4" name="opcion" id="eliminar">
                                    </form></td>
                                     
                                   
                             
                              </tr>
                              <%}%>
              
                              </tbody>
                          </table>
              
              
                          <style>
                              .form{
                                  padding: 1rem;
                              }
                              table{
                                
                                width: 10rem;
                              }
                          </style>
                      </form>
               





                
               
                
                
                
                
                
                <style>
                    .row{
                        margin-bottom: -1rem;
                    }
                    .form{
                      padding-left: 6rem;
                      padding-top: -1rem;
                      padding-right: 6rem;
                      margin-bottom: 1rem;
                    }
                
                    .table{
                        margin-left: -1rem
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