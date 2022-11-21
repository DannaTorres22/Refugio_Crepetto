<%--
Document   : registrarPregunta
Created on : 04/08/2022, 11:26:33 AM
Author     : Gabriela Moron
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
  <%@include file="logoPestaña.jsp"%>
<%@include file="sesiones.jsp"%>

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
                                                        <img src="img/vista.png" alt=""/>
                                                        <a href="verFormulario.jsp"  >  Visualizar</a><br><br>
                                                    </div>
                                                    <div class="col-6 col-md-4">

                                                        <div class="row">
                                                            <div class="col-8">
                                                                <img src="img/editar.png" alt=""/>
                                                                <a href="consultarPregunta.jsp"   > Editar</a><br><br>
                                                            </div>   
                                                        </div> 
                                                    </div>
                                                </div>

                                                <h1>CREAR FORMULARIO</h1>
                                                <br>
                                                <form method="post" action="Pregunta">
                                                    <input name="textIdUsuario" value="1" class="form-controll" id="usuario" type="hidden" >


                                                    <div class="form-group col-md-15">
                                                        <label for="inputEmail4">Nombre de la pregunta</label><br>
                                                        <input type="text" class="form-controll" id="nombre" placeholder="Nombre de la pregunta" name="textNombreP" >
                                                    </div>


                                                    <div class="form-group col-md-15">
                                                        <label for="inputEmail4">Descripcion</label><br>
                                                        <input type="text" class="form-controll" id="edad" placeholder="Descripción" name="textDesc">
                                                    </div>

                                                    <div class="form-group">

                                                        <button value="1" name="opcion"  type="submit" id="registrar" class="btn btn-primaryy submit px-3">Agregar</button>
                                                        <input type="hidden" >

                                                    </div>


                                            </div>



                                            </form>

                                            <%    if (request.getAttribute("MensajeError") != null) { %>
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

                                                .btn:not(:disabled):not(.disabled) {
                                                    cursor: pointer;
                                                    width: 10rem;
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