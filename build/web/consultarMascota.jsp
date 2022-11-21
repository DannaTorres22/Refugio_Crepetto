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
<%@page import="ModeloVO.UsuarioVO"%>
<%@include file="logoPestaña.jsp"%>
<%@include file="sesiones.jsp"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
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
        <link rel="icon" type="image/png" href="../img/logo.png">
        <title>
            Administradora
        </title>
        <!--     Fonts and icons     -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet" />
        <!-- Nucleo Icons -->
        <link href="./assets/css/nucleo-icons.css" rel="stylesheet" />
        <link href="./assets/css/nucleo-svg.css" rel="stylesheet" />
        <!-- Font Awesome Icons -->
        <script src="https://kit.fontawesome.com/42d5adcbca.js" crossorigin="anonymous"></script>
        <link href="./assets/css/nucleo-svg.css" rel="stylesheet" />
        <!-- CSS Files -->
        <link id="pagestyle" href="css/argon-dashboard.css" rel="stylesheet" />
        <link id="pagestyle" href="css/style.css" rel="stylesheet" />
    </head>

    <body class="g-sidenav-show   bg-gray-100">
        <div class="min-height-300 bg-primary position-absolute w-100"></div>

        <main class="main-content position-relative border-radius-lg ">
            <div class="container-fluid py-4">
                <div class="row">
                    <div class="col-12">
                        <div class="card mb-4">
                            <div class="card-header pb-0">

                            </div>
                            <div class="card-body px-0 pt-0 pb-2">
                                <div class="table-responsive p-0">
                                    <div class="table align-items-center mb-0">

                                        <div class="form" >
                                            <div class="container-fluid py-4">
                                                <div class="form">

                                                    <h1 style="font-size: 50px;">Mascotas</h1>

                                                    <form  method="post" action="Mascota">
                                                        <div class="row">
                                                            <div class="col-6 col-md-4">
                                                                <div class="input-group">
                                                                    <span class="input-group-text text-body"><i class="fas fa-search" aria-hidden="true"></i></span>
                                                                    <input type="text" name="textIdMascota" class="form-control validate" placeholder="Identificador de mascota">
                                                                </div>
                                                            </div>
                                                            <div class="col-8">
                                                                <button class="waves-effect waves-light btn" >Consultar</button>
                                                                <input type="hidden" value="3" name="opcion">     
                                                            </div>
                                                        </div>
                                                        <br><br></form>
                                                        <%            if (request.getAttribute("MensajeError") != null) { %>
                                                        ${MensajeError}

                                                        <% } else {%>
                                                        ${MensajeExito}
                                                        <%}%>

                                                        <form  method="post" action="Mascota">

                                                        <table class="table align-items-center mb-0">
                                                            <thead>
                                                                <tr>
                                                                    <th>Identificador</th>
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
                                                                    <td><%=masVO.getFechaIngreso()%></td>
                                                                    <td><%=masVO.getNombre()%></td>
                                                                    <td><%=masVO.getRaza()%></td>
                                                                    <td><%=masVO.getEdad()%></td>
                                                                    <td><%=masVO.getTipo()%></td>
                                                                    <td><%=masVO.getEstadoMascota()%></td>
                                                                    <td> <input type="hidden" value="5" name="opcion"  ><button class="waves-effect waves-light btn" value="<%=masVO.getIdMascota()%>" >Adoptado</button></td>

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
                                            </div>
                                            <script src="js/materialize.js" type="text/javascript"></script>
                                            <!-- JavaScript Bundle with Popper -->
                                            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

                                            </html>
