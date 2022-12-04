<%-- 
    Document   : solicitudes
    Created on : 23/08/2022, 02:22:19 PM
    Author     : Gabriela Moron
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="logoPestaña.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- CSS only -->


      
        <title>CONDICIONES</title>

    </head>
  <body>
  <br>
   
     <div class="form">
         <h3>Registrar CONDICIONES</h3>
        <form method="post" action="Condiciones" >
                <div class="form-row">
                <div class="form-group col-md-10">
                    <label for="inputEmail4">Respuesta </label><br>
                    <input type="numeric" class="form-control" id="inputEmail4" placeholder="respuesta" name="textidres"><br>
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-10">
                    <label for="inputEmail4">Nombre </label><br>
                    <input type="text" class="form-control" id="inputEmail4" placeholder="Nombre" name="textnombrecon"><br>
                </div>
            </div>
             <br>
               <div class="form-group col-md-10">
                <label for="inputEmail4">Fecha de nacimiento</label><br>
                <input type="date" class="form-control" id="inputEmail4" placeholder="Fecha de nacimiento" name="textfechana"><br>
            </div>
              <br>
          
            <div class="form-group col-md-10">
                <label for="inputEmail4">tipo Documento</label><br>
                 <input type="text" class="form-control" id="inputEmail4" placeholder="tipo documento" name="texttipdoc"><br>
            </div>
                

 <br>
 <div class="form-group col-md-10">
                <label for="inputEmail4">numero documento</label><br>
                <input type="number" class="form-control" id="inputEmail4" placeholder="numero documento" name="textnumdoc"><br>
            </div>

 <br>
           
            <div class="form-group col-md-10">
                <label for="inputZip">Correo electronico</label><br>
                <input type="email" class="form-control" id="inputZip" name="textcorreo" placeholder="correo"><br>
            </div>
 
 <br>
  <div class="form-group col-md-10">
                <label for="inputZip">profesión</label><br>
                <input type="text" class="form-control" id="inputZip" name="textprofesion" placeholder="profesión"><br>
            </div>
 
 <br>
  <div class="form-group col-md-10">
                <label for="inputZip">direccion</label><br>
                <input type="text" class="form-control" id="inputZip" name="textdireccion" placeholder="direccion"><br>
            </div>
 
 <br>
  <div class="form-group col-md-10">
                <label for="inputZip">trabajo</label><br>
                <input type="text" class="form-control" id="inputZip" name="texttrabajo" placeholder="trabajo"><br>
            </div>
 
 <br>
            <div class="form-group col-md-10">
                <label for="inputZip">Número celular</label><br>
                <input type="number" class="form-control" id="inputZip" name="textcel" placeholder="textcel"><br>
            </div>



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
   

   
</body>
</html>