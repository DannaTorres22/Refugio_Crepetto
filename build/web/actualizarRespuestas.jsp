<%--
    Document   : registrarVehiculo
    Created on : 13/05/2022, 11:26:33 AM
    Author     : Sena
--%>

<%@page import="ModeloDAO.FormularioDAO"%>
<%@page import="ModeloVO.FormularioVO"%>
<%@page import="ModeloVO.RolVO"%>
<%@page import="ModeloDAO.RolDAO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloDAO.MascotaDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloVO.MascotaVO"%>
<%@include file="logoPestaña.jsp"%>
<%@include file="sesiones.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
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
                                                    <a href="consultarRespuestas.jsp" >Volver a Consultar</a><br><br>
                                                </div>
                                                <div class="col-6 col-md-4">


                                                </div>
                                            </div>
                                            <div class="row"> <h1>Cambiar estado</h1>
                                                <br></div>

                                            <%FormularioVO formVO = (FormularioVO) request.getAttribute("datosConsultados");
                                                if (formVO != null) {%>
                                            <form method="post" action="Formulario" onsubmit="return validar()" >


                                                <input type="hidden" class="form-controll" id="nombreN" name="textIdFormulario" value="<%=formVO.getIdFormulario()%>">


                                                <div class="form-group col-md-15">
                                                    <input type="hidden" class="form-controll" id="nombreN" name="textIdUsuario" value="<%=formVO.getIdUsuario()%>">
                                                </div>

                                                <div class="form-group col-md-15">
                                                    <input type="hidden" class="form-controll" id="nombreN" name="textIdMascota" value="<%=formVO.getIdMascota()%>" >
                                                </div>

                                                <div class="form-group col-md-15">
                                                    <label for="inputEmail4">¿Qué crees que la mascota le va a aportar a la familia?</label> <br>
                                                    <input type="text" class="form-controll" id="nombreN" name="textP1" readonly value="<%=formVO.getP1()%>">
                                                </div>

                                                <div class="form-group col-md-15">
                                                    <label for="inputEmail4">¿Quién será el adulto encargado de las principales necesidades de la mascota? (Limpieza, paseos, compra de la comida, alimentación, gastos veterinarios)</label> <br>
                                                    <input type="text" class="form-controll" id="descripcion"  name="textP2" readonly value="<%=formVO.getP2()%>">
                                                </div>

                                                <div class="form-group col-md-15">
                                                    <label for="inputEmail4">¿Estas dispuesto a poner mayas de protección para evitar accidentes?</label> <br>
                                                    <input type="text" class="form-controll" id="descripcion"  name="textP3" readonly value="<%=formVO.getP3()%>">
                                                </div>

                                                <div class="form-group col-md-15">
                                                    <label for="inputEmail4">¿Has tenido mascotas antes? - En caso de que el animalito ya no esté contigo, cuentanos ¿Qué paso?</label> <br>
                                                    <input type="text" class="form-controll" id="descripcion" name="textP4" readonly value="<%=formVO.getP4()%>">
                                                </div>

                                                <div class="form-group col-md-15">
                                                    <label for="inputEmail4">¿Qué lugar de tu casa tendrias destinado para la mascota?, ¿En dónde dormiría?</label> <br>
                                                    <input type="text" class="form-controll" id="descripcion"  name="textP5" readonly value="<%=formVO.getP5()%>">
                                                </div>

                                                <div class="form-group col-md-15">
                                                    <label for="inputEmail4">¿Con cuanto tiempo dispones para la mascota por día?</label> <br>
                                                    <input type="text" class="form-controll" id="descripcion"  name="textP6" readonly value="<%=formVO.getP6()%>">
                                                </div>

                                                <div class="form-group col-md-15">
                                                    <label for="inputEmail4">¿Vives en casa o apartamento?</label> <br>
                                                    <input type="text" class="form-controll" id="descripcion"  name="textP7" readonly value="<%=formVO.getP7()%>">
                                                </div>

                                                <div class="form-group col-md-15">
                                                    <label for="inputEmail4">¿Tu vivienda es propia o en arriendo?</label> <br>
                                                    <input type="text" class="form-controll" id="descripcion"  name="textP8" readonly value="<%=formVO.getP8()%>">
                                                </div>

                                                <div class="form-group col-md-15">
                                                    <label for="inputEmail4">¿En caso de que vivas en un inmueble arrendado ¿Has consultado al dueño del inmueble si puedes tener mascotas?</label> <br>
                                                    <input type="text" class="form-controll" id="descripcion"  name="textP9" readonly value="<%=formVO.getP9()%>">
                                                </div>

                                                <div class="form-group col-md-15">
                                                    <label for="inputEmail4">¿La mascota podría escaparse por algún lugar de la casa o podría caer del balcón?</label> <br>
                                                    <input type="text" class="form-controll" id="descripcion"  name="textP10" readonly value="<%=formVO.getP10()%>">
                                                </div>
                                                <div class="form-group col-md-15">
                                                    <label for="inputEmail4">Estado de formulario</label> <br>

                                                    <select name="textEstadoFormulario"class="form-controll">
                                                        <option class="form-controll" name="textEstadoFormulario" value="<%=formVO.getEstadoFormulario()%>"><%=formVO.getEstadoFormulario()%></option>
                                                        <option class="form-controll" name="textEstadoFormulario">Aceptada</option>
                                                        <option class="form-controll" name="textEstadoFormulario">Rechazada</option>
                                                    </select>

                                                </div>


                                                <div class="form-group col-md-15">
                                                    <label for="inputEmail4">Fecha de registro</label> <br>
                                                    <input type="text" class="form-controll" id="descripcion"  name="textFechaRegistro" readonly value="<%=formVO.getFechaRegistro()%>">
                                                </div>



                                                <div class="form-group">
                                                    <button id="registrar" class="form-controll btn btn-primary submit px-3">Actualizar</button>
                                                    <input type="hidden" value="2" name="opcion">
                                                </div>
                                        </div>
                                        </form>
                                        <%}%>
                                    </div>

                                    <%            if (request.getAttribute("MensajeError") != null) { %>
                                    ${MensajeError}

                                    <% } else {%>
                                    ${MensajeExito}
                                    <%}%>


                                    <div id="modalTerminos" class="modal">
                                        <div class="contenidoModal">
                                            <h2>Acepto y entiendo</h2>
                                            <p class="pModal" >Que diligenciar este formulario no siginifica que me entregaran la mascota en adopción y que la información que he proporcionado será estudiada teniendo en cuenta la personalidad y las condiciones de la mascota en la que estoy interesado(a).
                                                Manifiesto que mis intenciones de tener una mascota de compañia han sido meditadas y es una decisión que he tomado a conciencia y de forma racional, cuento con el tiempo, el dinero y el amor que implica tener una mascota, por lo tanto cumplire con las condiciones de tenencia y protección animal.
                                                En caso de recibir la mascota y no poder tenerlo en un futuro le informare al refugio para entregarselo y/o conjuntamente llegar a un acuerdo sobre el futuro de la mascota.
                                                Me comprometo a no maltratar a la mascota, a darle conmida de buena calidad y suficiente, no amarrarlo, no dejarlo a la interperie, al sol, al frio y/o sin techo, si debo viajar lo dejaré con alguien de confianza.
                                                Me comprometo a darle mucho amor a tratarlo dignamente, a ser diligente con sus necesidades, a educarlo sin maltrato, a tenerle paciencia, a vacunarlo anualmente, a llevarlo constantemente al veterinario, a comprar las medicinas y pagar los tratamientos que requiera.</p>
                                            <img src="img/patas.png" class='imagenPatas' alt=""/>
                                            <button class="cerrarModal boton form-controll btn btn-primary submit px-3 botonT">Aceptar</button>
                                        </div>
                                    </div><br>


                                    <style>
                                        .form{
                                            padding: 5%;
                                        }
                                        h3{
                                            text-align: left;
                                        }

                                        .btn:not(:disabled):not(.disabled) {
                                            cursor: pointer;
                                            width: 10rem;
                                        }




                                    </style>

                                    <br>

                                    <script src="js/modalFormulario.js" type="text/javascript"></script>
                                    <script src="https://cdn.jsdelivr.net.npm.sweetalert2@9"></script>

                                    <%-- <script src="js/validacionRNovedad.js" type="text/javascript"></script>--%>
                                    <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
                                    <script src="js/materialize.js" type="text/javascript"></script>
                                    <!-- JavaScript Bundle with Popper -->
                                    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
                                    </body>
                                    </html>