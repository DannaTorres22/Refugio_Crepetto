<%-- 
    Document   : Sesiones
    Created on : 23/05/2022, 10:28:35 a. m.
    Author     : uSER
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sesiones</title>
    </head>
    <%
      response.setHeader("Pragma","No-cache");
      response.setHeader("Cache-control","no-cache,no-store,must-revalidate");
      response.setDateHeader("Expires",0);
    %>
    <%
        HttpSession miSesion = (HttpSession) request.getSession();
        String correoUsuario = "";
        if (miSesion.getAttribute("datosUsuario") == null) {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else {
            UsuarioVO usuVO = (UsuarioVO) miSesion.getAttribute("datosUsuario");
            correoUsuario = usuVO.getCorreoUsuario();
            
        }
    %>
    <body>
        <div class="menu" style="float: right;">
            <ul>
                <li class="usuario">Usuario <%=correoUsuario%></li>
              
                <form method="post" action="Sesiones">
                    <li><input class="boton" type="submit" value="Cerrar sesion"></li>
            </form>
            </ul>
            <%--<h1>Bienvenido:<%=usuario%></h1>
            <form method="post" action="Sesiones">
                <input type="submit" value="cerrar sesion">
            </form>--%>
        </div><br>
        
        <style>
            .menu{
                background: #00B4A9;
                width: 100%;
                padding: 15px;
                position: fixed;
                -webkit-box-shadow: 0px 0px 8px 0px rgba(145,145,145,1);
-moz-box-shadow: 0px 0px 8px 0px rgba(145,145,145,1);
box-shadow: 0px 0px 8px 0px rgba(145,145,145,1);
            }
            
            .boton{
                 background: #00B4A9;
                 
                 border-radius:10px;
                 outline:none;
                 border: none;
                 position: relative;
                 left: 90%;
                 top:3px;
                 color:#fff;
                 font-size: 20px;
            
            }
            
            .boton:hover{
                color:#037B74;
                cursor: pointer;
            }
            
            .usuario{
                 position: fixed;
                 left: 2%;
                 top:1%;
                 color:#fff;
                 font-size: 30px;
            }
            
            
        </style>
    </body>
</html>
