<%-- 
    Document   : consultarMascota
    Created on : 25/07/2022, 09:50:38 AM
    Author     : Gabriela Moron
--%>
<%@page import="ModeloDAO.PreguntaDAO"%>
<%@page import="ModeloVO.PreguntaVO"%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloVO.MascotaVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.MascotaDAO"%>
<%@include file="sesiones.jsp"%>
<%@ taglib prefix="resVO" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="shortcut icon" type="image/x-icon" href="../anipat/img/logo-img.png">
        <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900&display=swap" rel="stylesheet">

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="css/registrarUsuario.css" rel="stylesheet" type="text/css"/>

        <link rel="stylesheet" href="css/style.css">
        <link id="pagestyle" href="css/argon-dashboard.css" rel="stylesheet" />
        <link href="css/stylelogin.css" rel="stylesheet" type="text/css"/>
        <!-- <link rel="stylesheet" href="css/responsive.css"> -->
        <link href="css/style.css" rel="stylesheet" type="text/css"/>



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
        <link id="pagestyle" href="./assets/css/argon-dashboard.css" rel="stylesheet" />
        <link 



    <body>      
        <section class="ftco-section">
            <div class="container">

                <h1>Solicitud</h1>

                <form method="post" action="Respuesta">

                    <%
                        PreguntaVO preVO = new PreguntaVO();
                        PreguntaDAO preDAO = new PreguntaDAO();
                        ArrayList<PreguntaVO> listaPreguntas = preDAO.listar();
                        for (int i = 0; i < listaPreguntas.size(); i++) {

                            preVO = listaPreguntas.get(i);

                    %>


                    <input name="textIdUsuario" class="form-control" id="usuario" type="hidden" >
                    <div class="form-group" >

                        <div class="form-group col-md-15">
                            <a class="form"  placeholder="nombre"  name="textNombreP" ><%=preVO.getNombre()%></a>
                        </div>


                        <div class="form-group col-md-15">
                            <a   class="form"  placeholder="descripcion "name="textDesc" ><%=preVO.getDescripcion()%></a>   </div>
                    </div>
                    <div class="form-group col-md-15">
                        <input type="text" value="<%=preVO.getIdPregunta()%>" name="textIdPregunta">
                        <input  type="text"  class="form-control" id="inputEmail4" placeholder="<%=preVO.getNombre()%>"  name="textRespuesta" >
                    </div>
                    <br>
                    <%}%>
                    <br>

                    <div class="form-group">
                        <button class="btn btn-info">Registrar</button>
                        <input type="hidden" value="1" name="opcion">
                        <table class="table table-hover" >
                            <thead>                           
                                <tr>
                                    <th>Pregunta</th>
                                    <th>Respuesta</th>
                                </tr>
                            </thead>
                            <tbody>
                                <resVO:forEach var="list" items="${lista}" > 
                                    <tr>
                                        <td>${list.getIdPregunta()}</td>
                                        <td>${list.getRespuesta()}</td>
                                        

                                    </tr>
                                </resVO:forEach>
                            </tbody>
                        </table>


                    </div>
                    <a href="Respuesta?opcion=6" class="btn btn-success">Confirmar</a>

                    <style>
                        .form{
                            padding: 5%;
                        }
                    </style>

                </form>
                <%
                    if (request.getAttribute("MensajeError") != null) { %>
                ${MensajeError}

                <% } else {%>
                ${MensajeExito}
                <%}%>
            </div>

        </div>



    </section>    <style>.container{
            width: 100%;
            border-radius: 5px;
            -webkit-box-shadow: 0px 10px 34px -15px rgb(0 0 0 / 24%);
            -moz-box-shadow: 0px 10px 34px -15px rgba(0, 0, 0, 0.24);
            box-shadow: 0px 10px 34px -15px rgb(0 0 0 / 24%);

        </style>
        }    </body>  
    <script src="js/materialize.js" type="text/javascript"></script>
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

</html>

