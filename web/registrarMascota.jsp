<%--
    Document   : registrarMascota
    Created on : 04/08/2022, 11:26:33 AM
    Author     : Julia_000
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <!-- CSS here -->
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        
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

        <title>Registrar Mascota</title>

    </head>
    <body>
        <div class="form" >
            <a href="consultarMascota.jsp" class="btn btn-info" >Consultar mascota</a><br><br>
            <h3>Registrar Mascota</h3>
            <form method="post" action="Mascota" onsubmit="return validar()">
                <div class="form-row">
                    <div class="form-group col-md-10">
                        <label for="inputEmail4">Correo de la persona que registra</label>
                        <select name="textIdUsuario" class="form-control" id="usuario">
                            <option value="5" selected>Selecciona..</option>
                            <%
                                UsuarioDAO usuDAO = new UsuarioDAO();
                                for (UsuarioVO usuVO : usuDAO.listar()) {

                            %>
                            <option  class="form-control" value="<%=usuVO.getIdUsuario()%>"><%=usuVO.getCorreoUsuario()%></option>
                            <%}%>
                        </select>
                    </div>
                    <br>


                    <div class="form-group col-md-10">
                        <label for="inputEmail4">Fecha de ingreso de la mascota</label>
                        <input type="date" class="form-control" id="fecha" placeholder="Fecha de ingreso" name="textFIngreso" >
                    </div>
                    <br>

                    <div class="form-group col-md-10">
                        <label for="inputEmail4">Nombre de la mascota</label>
                        <input type="text" class="form-control" id="nombre" placeholder="Nombre de la mascota" name="textNombreM" >
                    </div>
                    <br>

                    <div class="form-group col-md-10">
                        <label for="inputEmail4">Edad</label>
                        <input type="number" class="form-control" id="edad" placeholder="Edad de la mascota" name="textEdadM"  maxlength="2">
                    </div>
                    <br>

                    <div class="form-group col-md-10">
                        <label for="inputEmail4">Raza de la mascota</label>
                        <input type="text" class="form-control" id="raza" placeholder="Raza de la mascota" name="textRazaM" >
                    </div>
                    <br>

                    <div class="form-group col-md-10">
                        <label for="inputZip">Tipo de mascota</label>
                        <select type="text" class="form-control" id="tipo" placeholder="Estado de la mascota" name="textTipoM" >
                            <option value="2" selected>Selecciona..</option>
                            <option>Perro</option>
                            <option>Gato</option>
                        </select
                    </div>
                    <br>

                    <div class="form-group col-md-10">
                        <label for="inputEmail4">Estado de la mascota</label>
                        <select type="text" class="form-control" id="estado" name="textEstadoM" placeholder="Estado de la mascota">
                            <option value="3" selected>Selecciona..</option>
                            <option>Disponible</option>
                            <option>Adoptado</option>
                        </select>
                    </div>
                </div>

                <br>
               

                </div>

                  <div class="form-group">
                    <button value="1" name="opcion"  type="submit" id="registrar" class="form-control btn btn-primary submit px-3">Registrar</button>

                    <input type="hidden" >
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
                    padding: 3%;
                }

                .btn:not(:disabled):not(.disabled) {
                    cursor: pointer;
                    width: 10rem;
                }



            </style>
            <br
                </body>
            <script src="https://cdn.jsdelivr.net.npm.sweetalert2@9"></script>

            <script src="js/validacionRMascota.js" type="text/javascript"></script>
            <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
           
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

</html>