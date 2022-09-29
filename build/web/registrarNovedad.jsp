<%--
    Document   : registrarVehiculo
    Created on : 13/05/2022, 11:26:33 AM
    Author     : Sena
--%>

<%@page import="ModeloDAO.MascotaDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloVO.MascotaVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         
         <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link href="css/materialize.css" rel="stylesheet" type="text/css"/>
        <title>Registrar Novedad</title>

    </head>
    <body>
    <center>
        <br>

        <div class="form">
            <h3>Registrar Novedad</h3>
            <form method="post" action="Novedad" onsubmit="return validar()" >

               <div class="form-group col-md-10">
                        <label for="inputEmail4">Mascota</label>
                        <select name="textIdMascota" class="form-control" id="mascota">
                            <option value="4" selected>Selecciona..</option>
                            <%
                                MascotaDAO masDAO = new MascotaDAO();
                                for (MascotaVO masVO : masDAO.listar()) {

                            %>
                            <option  class="form-control" value="<%=masVO.getIdMascota()%>"><%=masVO.getNombre()%></option>
                            <%}%>
                        </select>
                    </div>
                <div class="form-group col-md-10">
                    <label for="inputEmail4">Nombre de la novedad</label> <br>
                    <input type="text" class="form-control" id="nombreN" placeholder="Nombre de la novedad" name="textTipoNovedad"> <br>
                </div>

                <div class="form-group col-md-10">
                    <label for="inputEmail4">Descripción</label> <br>
                    <input type="text" class="form-control" id="descripcion" placeholder="Descripción" name="textObservacionNovedad"> <br>
                </div>
    
                <br>
                <button id="registrar" class="waves-effect waves-light btn">Registrar</button>
                <input type="hidden" value="1" name="opcion">
                
                 <a href="consultarNovedad.jsp" class="btn btn-info" >Consultar novedad</a><br><br>



                <%
            if (request.getAttribute("MensajeError") != null) { %>
                ${MensajeError}

                <% } else {%>
                ${MensajeExito}
                <%}%>


            </form>
  <style>
                .form{
                    padding: 3%;
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