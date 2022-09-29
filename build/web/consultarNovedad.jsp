<%-- 
    Document   : consultarNovedad
    Created on : 13/09/2022, 02:27:30 AM
    Author     : Danna Bejarano
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.NovedadDAO"%>
<%@page import="ModeloVO.NovedadVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/materialize.css" rel="stylesheet" type="text/css"/>
        <title>Consultar novedad</title>
    </head>
    <body>        
        <div class="form">
            <h1 style="font-size: 50px;">Novedad</h1>
            <form method="post" action="Novedad">
                <input type="text" name="textIdNovedad" class="validate" placeholder="Nombre de la novedad">
                <button class="waves-effect waves-light btn" >Consultar</button>
                <input type="hidden" value="3" name="opcion">        
                <a href="registrarNovedad.jsp" class="btn btn-info" >Registrar novedad</a><br><br>
                <br><br>
                <%            if (request.getAttribute("MensajeError") != null) { %>
                ${MensajeError}

                <% } else {%>
                ${MensajeExito}
                <%}%>


                <table  class="striped">
                    <thead>
                        <tr>
                            <th>Nombre de la mascota</th>
                            <th>Nombre de la novedad</th>
                            <th>Descripcion de la novedad</th>
                            <th>Fecha Novedad</th>
                        </tr>


                        <%
                            NovedadVO novVO = new NovedadVO();
                            NovedadDAO novDAO = new NovedadDAO();
                            ArrayList<NovedadVO> listaNovedad = novDAO.listar();
                            for (int i = 0; i < listaNovedad.size(); i++) {

                                novVO = listaNovedad.get(i);

                        %>
                    </thead>

                    <tbody>
                        <tr>
                            <td><%=novVO.getIdMascota()%></td>
                            <td><%=novVO.getTipoNovedad()%></td>
                            <td><%=novVO.getObservacionNovedad()%></td>  
                            <td><%=novVO.getFechaNovedad()%></td>  
                            <td><a href="" class="waves-effect waves-light btn">Eliminar</a></td>
                        </tr>
                        <%}%>

                    </tbody>
                </table>
        </div>
    </form>
    <style>
        .form{
            padding: 5%;
        }
    </style>

    <script src="js/materialize.js" type="text/javascript"></script>
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

</html>