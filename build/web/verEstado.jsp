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
        
        <title>Formulario</title>

    </head>
    <body class="body">
        <div class="form">

            <%FormularioVO formVO = (FormularioVO) request.getAttribute("datosConsultadosss");
                if (formVO != null) {%>
            <form method="post" action="Formulario" onsubmit="return validar()" >


                <input type="hidden" class="form-controll" id="nombreN" name="textIdFormulario" value="<%=formVO.getIdFormulario()%>">
                <input type="hidden" class="form-controll" id="nombreN" name="textIdUsuario" value="<%=formVO.getIdUsuario()%>">
                <input type="hidden" class="form-controll" id="nombreN" name="textIdMascota" value="<%=formVO.getIdMascota()%>" >
                <input type="hidden" class="form-controll" id="nombreN" name="textP1"value="<%=formVO.getP1()%>">
                <input type="hidden" class="form-controll" id="descripcion"  name="textP2"value="<%=formVO.getP2()%>">
                <input type="hidden" class="form-controll" id="descripcion"  name="textP3"value="<%=formVO.getP3()%>">
                <input type="hidden" class="form-controll" id="descripcion" name="textP4" value="<%=formVO.getP4()%>">
                <input type="hidden" class="form-controll" id="descripcion"  name="textP5" value="<%=formVO.getP5()%>">
                <input type="hidden" class="form-controll" id="descripcion"  name="textP6" value="<%=formVO.getP6()%>">
                <input type="hidden" class="form-controll" id="descripcion"  name="textP7" value="<%=formVO.getP7()%>">
                <input type="hidden" class="form-controll" id="descripcion"  name="textP8" value="<%=formVO.getP8()%>">
                <input type="hidden" class="form-controll" id="descripcion"  name="textP9" value="<%=formVO.getP9()%>">
                <input type="hidden" class="form-controll" id="descripcion"  name="textP10" value="<%=formVO.getP10()%>">
                <div class="form-group col-md-15 textoEstado">
                    <label class="labelE" for="inputEmail4">Tu solicitud esta<b> <%=formVO.getEstadoFormulario()%></b><br> Nota Importante: Con este número <b><%=formVO.getIdFormulario()%></b> podras consultar el estado de tu solicitud, ¡Suerte!</label><br>
                </div>
                <input type="hidden" class="form-controll" id="descripcion"  name="textFechaRegistro" value="<%=formVO.getFechaRegistro()%>">

            </form>
        </div>
        <%}%>


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