
<%@page import="ModeloDAO.FormularioDAO"%>
<%@page import="ModeloVO.FormularioVO"%>
<%-- 
    Document   : consultarPregunta
    Created on : 25/07/2022, 09:50:38 AM
    Author     : julia_000
--%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="java.util.ArrayList"%>
<%@include file="logoPestaña.jsp"%>
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

                                                <div class="row"> <h1>Consultar Solicitudes</h1>
                                                    <br></div>
                                                  <form method="post" action="generarPDF.jsp" target="_black">
                                                     <div class="col-8">
                                                         <button class="waves-effect waves-light btn">Generar reporte</button></div>
                                                </form>
                                                <form method="post" action="Formulario">
                                                    <div class="row">
                                                        <div class="col-6 col-md-4">
                                                            <div class="input-group">
                                                                <span class="input-group-text text-body"><i class="fas fa-search" aria-hidden="true"></i></span>
                                                                <input type="text" name="textIdFormulario"  class="form-control" placeholder="Identificador de la solicitud">
                                                            </div>
                                                        </div>
                                                      
                                                        <div class="col-8">
                                                            <button class="waves-effect waves-light btn" >Consultar</button>
                                                            <input type="hidden" value="3" name="opcion">     

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

                                                                <th>Identificador</th>
                                                                <th>Correo del usuario</th>
                                                                <th>Mascota a adoptar</th>

                                                                <%--     <th>Pregunta 1</th>
                                                                     <th>Pregunta 2</th>
                                                                     <th>Pregunta 3</th>
                                                                     <th>Pregunta 4</th>
                                                                     <th>Pregunta 5</th>
                                                                     <th>Pregunta 6</th>
                                                                     <th>Pregunta 7</th>
                                                                     <th>Pregunta 8</th>
                                                                     <th>Pregunta 9</th>
                                                                     <th>Pregunta 10</th>--%>
                                                                <th>Estado</th>
                                                                <th>Fecha de registro</th>
                                                                <th>Ver más</th>


                                                            </tr>


                                                            <%
                                                                FormularioVO formVO = new FormularioVO();
                                                                FormularioDAO formDAO = new FormularioDAO();
                                                                ArrayList<FormularioVO> listaFormulario = formDAO.listar();
                                                                for (int i = 0; i < listaFormulario.size(); i++) {

                                                                    formVO = listaFormulario.get(i);

                                                            %>
                                                        </thead>



                                                        <tbody>
                                                            <tr>

                                                                <td><%=formVO.getIdFormulario()%></td>
                                                                <td><%=formVO.getIdUsuario()%></td>
                                                                <td><%=formVO.getIdMascota()%></td>
                                                                <td><%=formVO.getEstadoFormulario()%></td>  
                                                                <td><%=formVO.getFechaRegistro()%></td>  
                                                                <td>
                                                                    <a class="boton btn btn-primary submit px-3" id="terminosA">Ver más</a></td>  



                                                            </tr>
                                                        <div id="modalTerminos" class="modalR">
                                                            <div class="contenidoModalR">

                                                                <div class="form-group col-md-15 moIn">
                                                                    <label for="inputEmail4">Mascota</label> <br>
                                                                    <input type="text" class="form-controll" id="nombreN" name="textIdMascota" readonly value="<%=formVO.getIdMascota()%>" >
                                                                </div>

                                                                <div class="form-group col-md-15 moIn">
                                                                    <label for="inputEmail4">¿Qué crees que la mascota le va a aportar a la familia?</label> <br>
                                                                    <input type="text" class="form-controll" id="nombreN" name="textP1" readonly value="<%=formVO.getP1()%>">
                                                                </div>

                                                                <div class="form-group col-md-15 moIn">
                                                                    <label for="inputEmail4">¿Quién será el adulto encargado de las principales necesidades de la mascota?</label> <br>
                                                                    <input type="text" class="form-controll" id="descripcion"  name="textP2" readonly value="<%=formVO.getP2()%>">
                                                                </div>

                                                                <div class="form-group col-md-15 moIn">
                                                                    <label for="inputEmail4">¿Estas dispuesto a poner mayas de protección para evitar accidentes?</label> <br>
                                                                    <input type="text" class="form-controll" id="descripcion"  name="textP3" readonly value="<%=formVO.getP3()%>">
                                                                </div>

                                                                <div class="form-group col-md-15 moIn">
                                                                    <label for="inputEmail4">¿Has tenido mascotas antes? - En caso de que el animalito ya no esté contigo, cuentanos ¿Qué paso?</label> <br>
                                                                    <input type="text" class="form-controll" id="descripcion" name="textP4"readonly value="<%=formVO.getP4()%>">
                                                                </div>

                                                                <div class="form-group col-md-15 moIn">
                                                                    <label for="inputEmail4">¿Qué lugar de tu casa tendrias destinado para la mascota?, ¿En dónde dormiría?</label> <br>
                                                                    <input type="text" class="form-controll" id="descripcion"  name="textP5"readonly value="<%=formVO.getP5()%>">
                                                                </div>

                                                                <div class="form-group col-md-15 moIn">
                                                                    <label for="inputEmail4">¿Con cuanto tiempo dispones para la mascota por día?</label>
                                                                    <input type="text" class="form-controll" id="descripcion"  name="textP6" readonly value="<%=formVO.getP6()%>">
                                                                </div>

                                                                <div class="form-group col-md-15 moIn">
                                                                    <label for="inputEmail4">¿Vives en casa o apartamento?</label>
                                                                    <input type="text" class="form-controll" id="descripcion"  name="textP7" readonly value="<%=formVO.getP7()%>">
                                                                </div>

                                                                <div class="form-group col-md-15 moIn">
                                                                    <label for="inputEmail4">¿Tu vivienda es propia o en arriendo?</label>
                                                                    <input type="text" class="form-controll" id="descripcion"  name="textP8" readonly value="<%=formVO.getP8()%>">
                                                                </div>

                                                                <div class="form-group col-md-15 moIn">
                                                                    <label for="inputEmail4">El dueño del inmueble permite tener mascotas?</label>
                                                                    <input type="text" class="form-controll" id="descripcion"  name="textP9" readonly value="<%=formVO.getP9()%>">
                                                                </div>

                                                                <div class="form-group col-md-15 moIn">
                                                                    <label for="inputEmail4">¿La mascota podría escaparse por algún lugar de la casa?</label>
                                                                    <input type="text" class="form-controll" id="descripcion"  name="textP10" readonly value="<%=formVO.getP10()%>">
                                                                </div>
                                                                <div class="form-group col-md-15 moIn">
                                                                    <label for="inputEmail4">Estado de formulario</label>
                                                                    <input type="text" class="form-controll" id="descripcion"  name="textEstadoFormulario" readonly value="<%=formVO.getEstadoFormulario()%>"><br><br>

                                                                    <a class="cerrarModal boton form-control btn btn-primary submit px-3">Aceptar</a>
                                                                </div>



                                                            </div>

                                                        </div>


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
                                                            margin-left: -3rem;
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
        <script src="js/modalVermas.js" type="text/javascript"></script>
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