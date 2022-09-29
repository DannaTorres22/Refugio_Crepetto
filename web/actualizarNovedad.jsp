<%-- 
    Document   : verMascota
    Created on : 19/08/2022, 09:21:42 AM
    Author     : julia_000
--%>



<%@page import="ModeloVO.NovedadVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ver mascota</title>
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link href="css/materialize.css" rel="stylesheet" type="text/css"/>

    </head>
    <body></body>
    <div class="form">
        <h1>Ver Novedad</h1>


        <%
            NovedadVO novVO = (NovedadVO) request.getAttribute("datosConsultados");
            if (novVO != null) {%>
        <form method="post" action="Novedad">
           
                    <input type="hidden" class="form-control" value="<%=novVO.getIdNovedad()%>"name="textIdNovedad">
              
                   <div class="form-group col-md-10">
                    <label for="inputEmail4">Nombre de la mascota</label>
                    <input type="text" id="nombre" class="form-control" value="<%=novVO.getIdMascota()%> "name="textIdMascota">
                </div>
                <br>

            <div class="form-group col-md-10">
                <label for="inputEmail4">Nombre de la novedad</label>
                <input type="text" id="edad" name="textTipoNovedad" class="form-control" value="<%=novVO.getTipoNovedad()%>">
            </div>
            
            <br>
            

            <br>
            <div class="form-group col-md-10">
                <label for="inputZip">Descripción</label>
                <input type="text" id="raza" class="form-control"  name="textObservacionNovedad" value="<%=novVO.getObservacionNovedad()%>" 
            </div>
            <br>
            
            

            <button id="actualizar" class="waves-effect waves-light btn">Actualizar</button>
            <input type="hidden" value="2" name="opcion" id="actualizar">

            <%}%>
            <%
            if (request.getAttribute("MensajeError") != null) { %>
            ${MensajeError}

            <% } else {%>
            ${MensajeExito}
            <%}%>
             </div>
        </form>
    </div>
    <style>
        .form{
            padding: 50px;
        }

        .volver{
            text-decoration: none;
            color: #fff;
        }

        .volver:hover{
            text-decoration: none;

        }
    </style>
       
       <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
       
</html>
