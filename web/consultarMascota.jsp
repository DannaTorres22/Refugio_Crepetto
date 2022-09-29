<%-- 
    Document   : consultarMascota
    Created on : 25/07/2022, 09:50:38 AM
    Author     : julia_000
--%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloVO.MascotaVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.MascotaDAO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/materialize.css" rel="stylesheet" type="text/css"/>
        
        <title>Consultar mascota</title>
    </head>
    <body></body>        
    <div class="form">
        
        <h1 style="font-size: 50px;">Mascotas</h1>
        <form method="post" action="Mascota">
            <input type="text" name="textIdMascota" class="validate" placeholder="Identificador de la mascota">
            <button class="waves-effect waves-light btn" >Consultar</button>
            <input type="hidden" value="3" name="opcion">        
            
            <a href="registrarMascota.jsp" class="btn btn-info" >Registrar mascota</a><br><br>
             <a href="registrarNovedad.jsp" class="btn btn-info" >Registrar novedades</a><br><br>

        </form><br><br>
        <%            if (request.getAttribute("MensajeError") != null) { %>
        ${MensajeError}

        <% } else {%>
        ${MensajeExito}
        <%}%>


        <form method="post" action="Mascota">
            <table class="striped">
                <thead>
                    <tr>
                        <th>Identificador de mascota</th>
                        <th>Persona que registra</th>
                        <th>Fecha de ingreso</th>
                        <th>Nombre de la Mascota</th>
                        <th>Raza</th>
                        <th>Edad</th>
                        <th>Tipo de mascota</th>
                        <th>Estado</th>
                        <th></th>
                        <th></th>
                    </tr>


                    <%
                        MascotaVO masVO = new MascotaVO();
                        MascotaDAO masDAO = new MascotaDAO();
                        ArrayList<MascotaVO> listaMascotas = masDAO.listar();
                        for (int i = 0; i < listaMascotas.size(); i++) {

                            masVO = listaMascotas.get(i);

                    %>
                </thead>

                <tbody>
                    <tr>
                        <td><%=masVO.getIdMascota()%></td>
                        <td><%=masVO.getIdUsuario()%></td>
                        <td><%=masVO.getFechaIngreso()%></td>
                        <td><%=masVO.getNombre()%></td>
                        <td><%=masVO.getRaza()%></td>
                        <td><%=masVO.getEdad()%></td>
                        <td><%=masVO.getTipo()%></td>
                        <td><%=masVO.getEstadoMascota()%></td>
                        <td> <input type="hidden" value="5" name="opcion"  ><button class="waves-effect waves-light btn" value="<%=masVO.getIdMascota()%>" >Eliminar</button></td>
               
                </tr>
                <%}%>

                </tbody>
            </table>


            <style>
                .form{
                    padding: 5%;
                }
            </style>
        </form>
    </div>
    <script src="js/materialize.js" type="text/javascript"></script>
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

</html>
