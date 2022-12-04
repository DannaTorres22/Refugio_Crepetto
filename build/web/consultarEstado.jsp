
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
<%@include file="sesiones1.jsp"%>

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
          <!--     Fonts and icons     -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet" />
        <!-- Nucleo Icons -->
        <link href="./assets/css/nucleo-icons.css" rel="stylesheet" />
        <link href="./assets/css/nucleo-svg.css" rel="stylesheet" />
        <!-- Font Awesome Icons -->
        <script src="https://kit.fontawesome.com/42d5adcbca.js" crossorigin="anonymous"></script>
        <link href="./assets/css/nucleo-svg.css" rel="stylesheet" />
          <link id="pagestyle" href="css/argon-dashboard.css" rel="stylesheet" />
        <title>Formulario</title>

    </head>
    <body>
        <div class="form"> <h1>Ver estado de mi solicitud</h1><br>
            <form method="post" action="Formulario">
                <div class="row">
                    <div class="col-6 col-md-4">
                        <div class="input-group">
                            <span class="input-group-text text-body"><i class="fas fa-search" aria-hidden="true"></i></span>
                            <input type="text" name="textIdFormulario" class="form-control validate" placeholder="Identificador de la solicitud">
                        </div>
                    </div>
                    <div class="col-8">
                        <button class="waves-effect waves-light btn" >Consultar</button>
                        <input type="hidden" value="6" name="opcion">     
                    </div>
                </div>
            </form>
        </div>
   <img class="fondo" src="img/fondoEstado.jpeg" alt=""/>

        <br><br>
        <%            if (request.getAttribute("MensajeError") != null) { %>
        ${MensajeError}

        <% } else {%>
        ${MensajeExito}
        <%}%>





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
            
            .fondo{
                width: 100%;
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