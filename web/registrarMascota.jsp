<%--
    Document   : registrarMascota
    Created on : 04/08/2022, 11:26:33 AM
    Author     : Julia_000
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@include file="sesiones.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
      

    <title>Registrar Mascota</title>

</head>
<body>
    <div class="form" >
        <a href="consultarMascota.jsp" class="btn btn-info" >Consultar mascota</a><br><br>
        <h3>Registrar Mascota</h3>
        <form method="post" action="Mascota" onsubmit="return validar()" enctype="multipart/form-data">
                <input name="textIdUsuario" class="form-control" id="usuario" type="hidden" >
                <input type="hidden" class="form-control" id="fecha" placeholder="Fecha de ingreso" name="textFIngreso" >

                <div class="form-group col-md-15">
                    <label for="inputEmail4">Foto de la mascota</label>
                    <input type="file" class="form-control" id="file" placeholder="Foto de la mascota" name="file" >
                </div>
                <div class="form-group col-md-15">
                    <label for="inputEmail4">Nombre de la mascota</label>
                    <input type="text" class="form-control" id="nombre" placeholder="Nombre de la mascota" name="textNombreM" >
                </div>
                

                <div class="form-group col-md-15">
                    <label for="inputEmail4">Edad</label>
                    <input type="number" class="form-control" id="edad" placeholder="Edad de la mascota" name="textEdadM"  maxlength="2">
                </div>
               

                <div class="form-group col-md-15">
                    <label for="inputEmail4">Raza de la mascota</label>
                    <input type="text" class="form-control" id="raza" placeholder="Raza de la mascota" name="textRazaM" >
                </div>
                

                <div class="form-group col-md-15">
                    <label for="inputZip">Tipo de mascota</label>
                    <select type="text" class="form-control" id="tipo" placeholder="Estado de la mascota" name="textTipoM" >
                        <option value="Selecciona..">Selecciona..</option>
                        <option>Perro</option>
                        <option>Gato</option>
                    </select
                </div>
                
                <input type="hidden" class="form-control" id="estado" name="textEstadoM" placeholder="Estado de la mascota">

            </div>
            <br>
           

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
                padding: 5%;
               
            }

            .btn:not(:disabled):not(.disabled) {
                cursor: pointer;
                width: 10rem;
            }



        </style>
        <br
            </body>
        <script src="https://cdn.jsdelivr.net.npm.sweetalert2@9"></script>

       
        <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

</html>