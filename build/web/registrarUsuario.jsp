<%-- 
    Document   : registrarUsuario
    Created on : 9/05/2022, 09:18:14 AM
    Author     : Sena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- CSS only -->
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
                 Correo electronico:<br>
                <input type="text" id="correo" name="textCorreoUsuario"><br> 
                Contraseña<br>
                <input type="password" id="password" name="textPassword"><br> 
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
            <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
</body>
</html>