<%-- 
    Document   : verMascota
    Created on : 19/08/2022, 09:21:42 AM
    Author     : julia_000
--%>


<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloVO.MascotaVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="logoPestaña.jsp"%>
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

        <main class="main-content position-relative border-radius-lg ">
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
                                                        <a href="consultarUsuario.jsp" >Volver a Consultar</a><br><br>
                                                    </div>
                                                    <div class="col-6 col-md-4">


                                                    </div>
                                                </div>
                                                <div class="row"> 
                                                    <h1>Ver Mascota</h1><br></div>

                                                    <%MascotaVO masVO = (MascotaVO) request.getAttribute("datosConsultados");
                                                        if (masVO != null) {%>
                                                    <form method="post" action="Mascota" onsubmit="return validar()">
                                                         <table class="table align-items-center mb-0">

                                                        <input type="hidden" class="form-controll" value="<%=masVO.getIdMascota()%>"name="textIdMascota">

                                                        <div class="form-group col-md-15">
                                                            <label for="inputEmail4">Nombre de la mascota</label>
                                                            <input type="text" id="nombre" class="form-controll" value="<%=masVO.getNombre()%> "name="textNombreM">
                                                        </div>
                                                       

                                                        <div class="form-group  col-md-15 ">
                                                            <label for="inputEmail4">edad</label>
                                                            <input type="text" id="edad" name="textEdadM" class="form-controll" value="<%=masVO.getEdad()%>">
                                                        </div>

                                                        


                                                        <div class="form-group col-md-15">
                                                            <label for="inputEmail4">Raza de la mascota</label>
                                                            <input type="text" id="raza" class="form-controll"  name="textRazaM" value="<%=masVO.getRaza()%>" 
                                                        </div>
                                                       



                                                        <div class="form-group col-md-15">
                                                            <label for="inputEmail4">Tipo de mascota</label>
                                                            <input type="text" class="form-controll" id="tipo" name="textTipoM" value="<%=masVO.getTipo()%>" >
                                                        </div>
                                                       

                                                        <div class="form-group col-md-15">
                                                            <label for="inputEmail4">Estado de la mascota</label>
                                                            <input type="text" class="form-controll" id="estado" value="<%=masVO.getEstadoMascota()%>" name="textEstadoM" >
                                                        </div>
                                                        <br>
  
                                                                    </table>

                                                                    <button class="waves-effect waves-light btn" >Actualizar</button>
                                                                    <input type="hidden" value="2" name="opcion">

                                                                    </form>

                                                                    <%}%>
                                                                    <%
                                                    if (request.getAttribute("mensajeError") != null) { %>
                                                                    ${mensajeError}

                                                                    <%} else {%>
                                                                    ${mensajeExito}        
                                                                    <%}%>

                                                                    <style>
                                                                        .form{
                                                                            padding: 1rem;
                                                                        }
                                                                        table{

                                                                            width: 10rem;
                                                                        }
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
                                                                    </form>

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