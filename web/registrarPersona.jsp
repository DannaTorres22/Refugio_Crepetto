<%--
    Document   : registrarVehiculo
    Created on : 13/05/2022, 11:26:33 AM
    Author     : Sena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="sesiones.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link href="css/materialize.css" rel="stylesheet" type="text/css"/>

      
        <title>Registrar Persona</title>

    </head>
  <body></body>
  <br>
   
     <div class="form">
         <h3>Registrar Persona</h3>
        <form method="post" action="Persona" >
            <div class="form-row">
                <div class="form-group col-md-10">
                    <label for="inputEmail4">Número de identificación</label>
                    <input type="number" class="form-control" id="inputEmail4" placeholder="Número de identificación" name="textIdPersona">
                </div>
            </div>
             <br>
            <div class="form-group col-md-10">
                <label for="inputEmail4">Mascota a adoptar</label>
                 <input type="number" class="form-control" id="inputEmail4" placeholder="Mascota a adoptar" name="textIdMascota">
            </div>
                 <br>
            <div class="form-group col-md-10">
                <label for="inputEmail4">Nombre de la persona</label>
                <input type="text" class="form-control" id="inputEmail4" placeholder="Nombre de la persona" name="textNombresPersona">
            </div>

 <br>
 <div class="form-group col-md-10">
                <label for="inputEmail4">Apellido de persona</label>
                <input type="text" class="form-control" id="inputEmail4" placeholder="Apellido de persona" name="textApellidoPersona">
            </div>

 <br>
           
            <div class="form-group col-md-10">
                <label for="inputZip">Fecha de nacimiento</label>
                <input type="date" class="form-control" id="inputZip" name="textEdadPersona" placeholder="Fecha de nacimiento">
            </div>
 <br>
 
  <br>
           
            <div class="form-group col-md-10">
                <label for="inputZip">Estado persona</label>
                <input type="text" class="form-control" id="inputZip" name="textEstadoPersona" placeholder="Estado persona">
            </div>
 <br>
         
          



 <br>
            <button class="waves-effect waves-light btn">Registrar</button>
            <input type="hidden" value="1" name="opcion">
            
     
              
        <%
            if (request.getAttribute("MensajeError") != null) { %>
        ${MensajeError}

        <% } else {%>
        ${MensajeExito}
        <%}%>
         

        </form>
               
    </div>
    <br
   

    <script src="js/materialize.js" type="text/javascript"></script>
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

</html>

