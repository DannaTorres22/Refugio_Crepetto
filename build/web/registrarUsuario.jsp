<%-- 
    Document   : registrarUsuario
    Created on : 9/05/2022, 09:18:14 AM
    Author     : Sena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@include file="logoPestaña.jsp"%>
<!-- CSS only -->
<!doctype html>
<html lang="en">

    <head>
        <title>Crepetto</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="shortcut icon" type="image/x-icon" href="../anipat/img/logo-img.png">
        <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900&display=swap" rel="stylesheet">

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="css/registrarUsuario.css" rel="stylesheet" type="text/css"/>
        

    </head>

    <body>

        <section class="ftco-section">
            <div class="container">

                <div class="row justify-content-center">

                    <div class="col-md-12 col-lg-10">
                        <div class="wrap d-md-flex">

                            <div class="text-wrap p-4 p-lg-5 text-center d-flex align-items-center order-md-last">
                                <form class="signin-form" method="post" action="Usuario" onsubmit="return validar()">
                                    <div class="text w-100">

                                        <div class="form-group mb-3">
                                            <div class="form-group mb-3">
                                                <label class="label" for="name">Nombre</label>
                                                <input type="text" class="form-control" name="textNombre" placeholder="Ingresa tu nombre"
                                                       required>
                                            </div>
                                        </div>
                                        <div class="form-group mb-3">
                                            <label class="label" for="name">Dirección</label>
                                            <input type="text" name="textDireccion" class="form-control" placeholder="Ingresa tu dirección"
                                                   required>
                                        </div>
                                        <div class="form-group mb-3">
                                            <label class="label" for="name">Fecha de nacimiento</label>
                                            <input type="date" class="form-control"
                                                   placeholder="Ingresa tu fecha de nacimiento" name="textFechaNacimiento" required>
                                        </div>
                                        <div class="form-group mb-3">
                                            <label class="label" for="name">Correo electronico</label>
                                            <input type="email" name="textCorreoUsuario" class="form-control" placeholder="Ingresa tu correo"
                                                   required>
                                        </div>
                                    </div>

                                    <div class="text w-100 ">

                                        <div class="form-group mb-3">
                                            <label class="label" for="name">Apellido</label>
                                            <input type="text" class="form-control" name="textApellido" placeholder="Ingresa tu apellido"
                                                   required>
                                        </div>
                                        <div class="form-group mb-3">
                                            <label class="label" for="password">Número celular</label>
                                            <input type="number" name="textCelular" class="form-control" placeholder="Ingresa tu celular"
                                                   required>
                                        </div>
                                        <input type="hidden" class="form-control" id="estado" name="textEstadoUsuario" placeholder="Estado de la mascota">
                                        <div class="form-group mb-3 dos">
                                            <label class="label" for="name">Tipo de documento</label>
                                            <label class="label num"   for="name">Número de documento</label>
                                            <!--<select class="form-control" name="" id="">
                                                    <option value="">Selecciona..</option>
                                                    <option value="1">TI</option>
                                                    <option value="1">CC</option>
                                            </select>
                                            
                                                    
                                                    <input type="text" class="form-control" placeholder="Ingresa tu identificación" required>-->
                                        </div>

                                        <div class="form-group mb-3 dosInput">

                                            <select name="textTipoDocumento" class="form-control select" name="" id="">
                                                <option>Selecciona..</option>
                                                <option>TI</option>
                                                <option>CC</option>
                                            </select>


                                            <input type="text" name="textNumDocumento" class="form-control" placeholder="Identificación" required>
                                        </div>


                                        <div class="form-group mb-3">
                                            <label class="label" for="name">Contraseña</label>
                                            <input type="password" name="textPassword" class="form-control" placeholder="Ingresa una contraseña"
                                                   required>
                                        </div>
                                        <input type="hidden" class="form-control" id="estado" name="textRolId" placeholder="Estado de la mascota">

                                        <div class="boton">
                                            <div class="form-group" >
                                                <h7 class="mensaje">
                                                <%
                                                    if (request.getAttribute("mensajeError") != null) { %>
                                                ${mensajeError}

                                                <%} else {%>
                                                ${mensajeExito}        
                                                <%}%></h7>
                                                <button id="registrar" class="form-control btn btn-primary submit px-3">Registrarme</button>
                                                <input type="hidden" value="1" name="opcion"><br>

                                                <div class=" text-md-right">

                                                    <a href="login.jsp">¿Ya tienes cuenta? Ingresar</a>

                                                </div>
                                            </div>
                                        </div>
                                        <div class="medio">

                                            <div class="form-group">
                                                <img src="img/logo.png" alt=""/>
                                                <h3 class="titulo">Registrarse</h3>
                                            </div>
                                        </div>
                                    </div>


                                </form>


                            </div>

                        </div>


                    </div>

                </div>  

            </div>
        </section>
                                                <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <script src="https://cdn.jsdelivr.net.npm.sweetalert2@9"></script>
        <script src="js/validacionRUsuario.js" type="text/javascript"></script>
        <script src="js/jquery.min.js"></script>
        <script src="js/popper.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/main.js"></script>

    </body>

</html>
<%--
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

        <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <title>Registrar</title>
    </head>
    <body>


        <form method="post" action="Usuario" class="rusu" onsubmit="return validar()">
            <nav>
                <div class="nav-wrapper blue lighten-4">
                    <a href="#" class="brand-logo">Crepetto</a>
                    <ul id="nav-mobile" class="right hide-on-med-and-down">
                        <li><a href="login.jsp">Ingresar</a></li>
                        <li><a href="registrarUsuario.jsp">Registrarse</a></li>
                        <li><a href="registrarUsuario.jsp">volver</a></li>
                    </ul>
                </div>
            </nav><br><br>
            <div class="container">
                <table class="highlight">
                    <h1>Registro de Usuario</h1><br>
                    <tr>


                        nOMBRE:<br>
                    <input type="text"  name="textNombre"><br>

                    Apellido:<br>
                    <input type="text" name="textApellido"><br>

                    fecha :<br>
                    <input type="date"  name="textFechaNacimiento"><br>

                    tipo de documento:<br>
                    <input type="text"  name="textTipoDocumento"><br>

                    numero de doc:<br>
                    <input type="text"  name="textNumDocumento"><br>

                    direccion:<br>
                    <input type="text"  name="textDireccion"><br>

                    celular<br>
                    <input type="text" name="textCelular"><br>


                    <input type="hidden"  name="textEstadoUsuario"><br>

                    Correo electronico:<br>
                    <input type="text"  name="textCorreoUsuario"><br>


                    Contraseña<br>
                    <input type="password"  name="textPassword"><br> 

                    </tr>
                    <a href="login.jsp" >¿Ya tienes una cuenta? Ingresa</a>
                </table><br>
                <button id="registrar" class="waves-effect blue lighten-3 btn">registrar</button>
                <input type="hidden" value="1" name="opcion"><br>

                </form>

                <%
                    if (request.getAttribute("mensajeError") != null) { %>
                ${mensajeError}

                <%} else {%>
                ${mensajeExito}        
                <%}%>

            </div> 
            <script src="https://cdn.jsdelivr.net.npm.sweetalert2@9"></script>

            <script src="js/validacionRUsuario.js" type="text/javascript"></script>
            <!--<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>-->
    </body>
</html>--%>