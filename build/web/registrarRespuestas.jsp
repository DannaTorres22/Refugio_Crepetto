<%--
    Document   : registrarVehiculo
    Created on : 13/05/2022, 11:26:33 AM
    Author     : Sena
--%>

<%@page import="ModeloDAO.MascotaDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloVO.MascotaVO"%>
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
        <title>Registrar Novedad</title>

    <header>
        <div class="header-area ">
            <div id="sticky-header" class="main-header-area">
                <div class="container">
                    <div class="row align-items-center">
                        <div class="col-xl-3 col-lg-3">
                            <div class="logo">
                                <a href="index.html">
                                    <img src="logo.png" alt="">
                                </a>
                            </div>
                        </div>
                        <div class="col-xl-9 col-lg-9">
                            <div class="main-menu  d-none d-lg-block">
                                <nav>
                                    <ul id="navigation">
                                        <li><a  href="dashboard.jsp">Inicio</a></li>
                                        <li><a href="index.jsp">Cerrar sesión</a></li>

                                    </ul>


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

</head>
<body>




    <div class="form">
        <a href="consultarNovedad.jsp" class="btn btn-info" >Consultar novedad</a><br><br>
        <h3>Formulario de adopción</h3>
        <form method="post" action="Formulario" onsubmit="return validar()" >
              <input name="textIdUsuario" class="form-control" id="usuario" type="hidden" >
            <div class="form-group col-md-15">
                <label for="inputEmail4">p1</label> <br>
                <input type="text" class="form-control" id="nombreN" placeholder="Nombre de la novedad" name="textP1">
            </div>

            <div class="form-group col-md-15">
                <label for="inputEmail4">p2</label> <br>
                <input type="text" class="form-control" id="descripcion" placeholder="Descripción" name="textP2">
            </div>
            
             <div class="form-group col-md-15">
                <label for="inputEmail4">p3</label> <br>
                <input type="text" class="form-control" id="descripcion" placeholder="Descripción" name="textP3">
            </div>
            
             <div class="form-group col-md-15">
                <label for="inputEmail4">p4</label> <br>
                <input type="text" class="form-control" id="descripcion" placeholder="Descripción" name="textP4">
            </div>
            
             <div class="form-group col-md-15">
                <label for="inputEmail4">p2</label> <br>
                <input type="text" class="form-control" id="descripcion" placeholder="Descripción" name="textP5">
            </div>
            
             <div class="form-group col-md-15">
                <label for="inputEmail4">p2</label> <br>
                <input type="text" class="form-control" id="descripcion" placeholder="Descripción" name="textP6">
            </div>
            
             <div class="form-group col-md-15">
                <label for="inputEmail4">p2</label> <br>
                <input type="text" class="form-control" id="descripcion" placeholder="Descripción" name="textP7">
            </div>
            
             <div class="form-group col-md-15">
                <label for="inputEmail4">p2</label> <br>
                <input type="text" class="form-control" id="descripcion" placeholder="Descripción" name="textP8">
            </div>
            
             <div class="form-group col-md-15">
                <label for="inputEmail4">p2</label> <br>
                <input type="text" class="form-control" id="descripcion" placeholder="Descripción" name="textP9">
            </div>
            
             <div class="form-group col-md-15">
                <label for="inputEmail4">p2</label> <br>
                <input type="text" class="form-control" id="descripcion" placeholder="Descripción" name="textP10">
            </div>
            
           <input type="hidden" class="form-control" id="descripcion" placeholder="Descripción" name="textEstadoFormulario"> 
           <input type="hidden" class="form-control" id="descripcion" placeholder="Descripción" name="textFechaRegistro">
            

           
            <div class="form-group">
                <button id="registrar" class="form-control btn btn-primary submit px-3">Registrar</button>
                <input type="hidden" value="1" name="opcion">
            </div>

        </form>



        <%
                if (request.getAttribute("MensajeError") != null) { %>
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




        </style>
        <br

        <script src="https://cdn.jsdelivr.net.npm.sweetalert2@9"></script>

        <script src="js/validacionRNovedad.js" type="text/javascript"></script>
        <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <script src="js/materialize.js" type="text/javascript"></script>
        <!-- JavaScript Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
</body>
</html>