<%-- 
    Document   : verMascota
    Created on : 19/08/2022, 09:21:42 AM
    Author     : julia_000
--%>


<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloVO.MascotaVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <!-- CSS here -->
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
        <link rel="stylesheet" href="css/style.css">
   
        <link href="css/stylelogin.css" rel="stylesheet" type="text/css"/>
        <!-- <link rel="stylesheet" href="css/responsive.css"> -->
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        
<header>
            <div class="header-area ">
                <div id="sticky-header" class="main-header-area">
                    <div class="container">
                        <div class="row align-items-center">
                            <div class="col-xl-3 col-lg-3">
                                <div class="logo">
                                    <a href="index.html">
                                        <img src="logo.png" alt="">
                                    </a>
                                </div>
                            </div>
                            <div class="col-xl-9 col-lg-9">
                                <div class="main-menu  d-none d-lg-block">
                                    <nav>
                                        <ul id="navigation">
                                            <li><a  href="dashboard.html">Inicio</a></li>
                                            <li><a href="login.html">Cerrar sesión</a></li>

                                        </ul>


                                    </nav>
                                </div>
                            </div>
                            <div class="col-12">
                                <div class="mobile_menu d-block d-lg-none"></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </header>
    <body></body>
    <div class="form">
        <h1>Ver Mascota</h1>


        <%
            MascotaVO masVO = (MascotaVO) request.getAttribute("datosConsultados");
            if (masVO != null) {%>
        <form method="post" action="Mascota" onsubmit="return validar()">
           
                    <input type="hidden" class="form-control" value="<%=masVO.getIdMascota()%>"name="textIdMascota">
              
                   <div class="form-group col-md-10">
                    <label for="inputEmail4">Nombre de la mascota</label>
                    <input type="text" id="nombre" class="form-control" value="<%=masVO.getNombre()%> "name="textNombreM">
                </div>
                <br>

            <div class="form-group col-md-10">
                <label for="inputEmail4">edad</label>
                <input type="text" id="edad" name="textEdadM" class="form-control" value="<%=masVO.getEdad()%>">
            </div>
            
            <br>
            

            <br>
            <div class="form-group col-md-10">
                <label for="inputZip">Raza de la mascota</label>
                <input type="text" id="raza" class="form-control"  name="textRazaM" value="<%=masVO.getRaza()%>" 
            </div>
            <br>
            
            

            <div class="form-group col-md-10">
                <label for="inputZip">Tipo de mascota</label>
                <input type="text" class="form-control" id="tipo" name="textTipoM" value="<%=masVO.getTipo()%>" >
            </div>
            <br>
            
             <div class="form-group col-md-10">
                <label for="inputEmail4">Estado de la mascota</label>
                <input type="text" class="form-control" id="estado" value="<%=masVO.getEstadoMascota()%>" name="textEstadoM" >
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
    <script src="https://cdn.jsdelivr.net.npm.sweetalert2@9"></script>
    <script src="js/validacionAMascota.js" type="text/javascript"></script>
    <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
       
</html>
