<%-- 
    Document   : verMascota
    Created on : 19/08/2022, 09:21:42 AM
    Author     : julia_000
--%>


<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloVO.MascotaVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="logoPestaña.jsp"%>
<%@include file="sesiones.jsp"%>
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
        <h1>Ver Mascota</h1>


        <%
            MascotaVO masVO = (MascotaVO) request.getAttribute("datosConsultados");
            if (masVO != null) {%>
        <form method="post" action="Mascota">
           
                
             <!--   <div class="form-group col-md-10">
                    <label for="inputEmail4">id Mascota</label>
                    <input type="date" class="form-control" value="<%-- 
<%=masVO.getIdMascota()%>"--%> name="textIdMascota">
                </div>-->
                <br>
              
                   <div class="form-group col-md-10">
                    <label for="inputEmail4">Nombre de la mascota</label>
                    <input type="text" class="form-control" value="<%=masVO.getNombre()%> "name="textNombreM">
                </div>
                <br>

            
            <div class="form-group col-md-10">
                <label for="inputEmail4">edad</label>
                <input type="text" name="textEdadM" class="form-control" value="<%=masVO.getEdad()%>">
            </div>
            
            <br>
            

            <br>
            <div class="form-group col-md-10">
                <label for="inputZip">Raza de la mascota</label>
                <input type="text" class="form-control" id="inputZip" name="textRazaM" value="<%=masVO.getRaza()%>" 
            </div>
            <br>
            
            

            <div class="form-group col-md-10">
                <label for="inputZip">Tipo de mascota</label>
                <input type="text" class="form-control" id="inputZip" name="textTipoM" value="<%=masVO.getTipo()%>" >
            </div>
            <br>
            
             <div class="form-group col-md-10">
                <label for="inputEmail4">Estado de la mascota</label>
                <input type="text" class="form-control" id="inputEmail4" value="<%=masVO.getEstadoMascota()%>" name="textEstadoM" >
            </div>
            <br>

          

            
            <button class="waves-effect waves-light btn">Actualizar</button>
            <input type="hidden" value="2" name="opcion">


           


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
</html>
