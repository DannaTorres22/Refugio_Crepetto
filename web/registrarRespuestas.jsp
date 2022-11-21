<%--
    Document   : registrarVehiculo
    Created on : 13/05/2022, 11:26:33 AM
    Author     : Sena
--%>

<%@page import="ModeloDAO.FormularioDAO"%>
<%@page import="ModeloVO.FormularioVO"%>
<%@page import="ModeloVO.RolVO"%>
<%@page import="ModeloDAO.RolDAO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloDAO.MascotaDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloVO.MascotaVO"%>
 <%@include file="logoPestaña.jsp"%>
<%@include file="sesiones1.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

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
        <title>Formulario</title>

    </head>
    <body>




        <div class="form">
            <h3>Formulario de adopción</h3>
            <p>Muchas gracias por querer cambiarle la vida a una mascota que previamente a sido sometida a maltrato, abandono o que ha nacido en condición de calle.
                Si estas leyendo este formulario es porque estas a punto de tomar una gran decisión que impica amor, tiempo y dinero.
                Es importante que seas consciente de que la mascota sera un integrante más de la familia, con tu adopción adquieres un gran compromiso que debe ser asumido con responsabilidad, no solo debes brindarle amor, tratarlo con respeto y dedicarle tiempo, sino que tambien debes estar dispuesto a pagar su manutención, sus gastos veterinarios basicos (Esterilización, vacunación anual y desparacitación a criterio del veterinario) y sus gastos veterinarios excepcionales en caso de que se enferme o tenga un accidente. </p>
            <br>
            <form method="post" action="Formulario" onsubmit="return validar()" >
                <%
                    MascotaVO masVO = (MascotaVO) request.getAttribute("datosConsultados");
                    if (masVO != null) {
                %>

                    <input type="text" class="form-control" id="nombreN" name="textIdMascota" value="<%=masVO.getIdMascota()%>" >
                <%}%>
              
                <div class="form-group col-md-15">

                    <%
                        RolDAO rolDAO = new RolDAO();
                        RolVO rolVO = new RolVO();

                        ArrayList<RolVO> listarRol = rolDAO.listar(correoUsuario);
                        for (int i = 0; i < listarRol.size(); i++) {
                            rolVO = listarRol.get(i);
                        }
                    %>
                    <input type="hidden" class="form-control" id="nombreN" name="textIdUsuario" value="<%=rolVO.getRolId()%>">
                    
                </div>
                <div class="form-group col-md-15">
                    <label for="inputEmail4">¿Qué crees que la mascota le va a aportar a la familia?</label> <br>
                    <input type="text" class="form-control" id="nombreN" name="textP1">
                </div>

                <div class="form-group col-md-15">
                    <label for="inputEmail4">¿Quién será el adulto encargado de las principales necesidades de la mascota? (Limpieza, paseos, compra de la comida, alimentación, gastos veterinarios)</label> <br>
                    <input type="text" class="form-control" id="descripcion"  name="textP2">
                </div>

                <div class="form-group col-md-15">
                    <label for="inputEmail4">¿Estas dispuesto a poner mayas de protección para evitar accidentes?</label> <br>
                    <input type="text" class="form-control" id="descripcion"  name="textP3">
                </div>

                <div class="form-group col-md-15">
                    <label for="inputEmail4">¿Has tenido mascotas antes? - En caso de que el animalito ya no esté contigo, cuentanos ¿Qué paso?</label> <br>
                    <input type="text" class="form-control" id="descripcion" name="textP4">
                </div>

                <div class="form-group col-md-15">
                    <label for="inputEmail4">¿Qué lugar de tu casa tendrias destinado para la mascota?, ¿En dónde dormiría?</label> <br>
                    <input type="text" class="form-control" id="descripcion"  name="textP5">
                </div>

                <div class="form-group col-md-15">
                    <label for="inputEmail4">¿Con cuanto tiempo dispones para la mascota por día?</label> <br>
                    <input type="text" class="form-control" id="descripcion"  name="textP6">
                </div>

                <div class="form-group col-md-15">
                    <label for="inputEmail4">¿Vives en casa o apartamento?</label> <br>
                    <input type="text" class="form-control" id="descripcion"  name="textP7">
                </div>

                <div class="form-group col-md-15">
                    <label for="inputEmail4">¿Tu vivienda es propia o en arriendo?</label> <br>
                    <input type="text" class="form-control" id="descripcion"  name="textP8">
                </div>

                <div class="form-group col-md-15">
                    <label for="inputEmail4">¿En caso de que vivas en un inmueble arrendado ¿Has consultado al dueño del inmueble si puedes tener mascotas?</label> <br>
                    <input type="text" class="form-control" id="descripcion"  name="textP9">
                </div>

                <div class="form-group col-md-15">
                    <label for="inputEmail4">¿La mascota podría escaparse por algún lugar de la casa o podría caer del balcón?</label> <br>
                    <input type="text" class="form-control" id="descripcion"  name="textP10">
                </div>

                <input type="hidden" class="form-control" id="descripcion"  name="textEstadoFormulario"> 
                <input type="hidden" class="form-control" id="descripcion"  name="textFechaRegistro">


                <div class="terminos2">
                    <input id="terminosA" name="termino" className="input2" type="checkbox" class="termino2"></input>
                    <label class="labell">Acepto Terminos y Condiciones</label>

                </div>                
                <div class="form-group">
                    <button id="registrar" class="form-control btn btn-primary submit px-3">Registrar</button>
                    <input type="hidden" value="1" name="opcion">
                </div>
            </form>
        </div>

            <%            if (request.getAttribute("MensajeError") != null) { %>
            ${MensajeError}

            <% } else {%>
            ${MensajeExito}
            <%}%>


            <div id="modalTerminos" class="modal">
                <div class="contenidoModal">
                    <h2>Acepto y entiendo</h2>
                    <p class="pModal" >Que diligenciar este formulario no siginifica que me entregaran la mascota en adopción y que la información que he proporcionado será estudiada teniendo en cuenta la personalidad y las condiciones de la mascota en la que estoy interesado(a).
                        Manifiesto que mis intenciones de tener una mascota de compañia han sido meditadas y es una decisión que he tomado a conciencia y de forma racional, cuento con el tiempo, el dinero y el amor que implica tener una mascota, por lo tanto cumplire con las condiciones de tenencia y protección animal.
                        En caso de recibir la mascota y no poder tenerlo en un futuro le informare al refugio para entregarselo y/o conjuntamente llegar a un acuerdo sobre el futuro de la mascota.
                        Me comprometo a no maltratar a la mascota, a darle conmida de buena calidad y suficiente, no amarrarlo, no dejarlo a la interperie, al sol, al frio y/o sin techo, si debo viajar lo dejaré con alguien de confianza.
                        Me comprometo a darle mucho amor a tratarlo dignamente, a ser diligente con sus necesidades, a educarlo sin maltrato, a tenerle paciencia, a vacunarlo anualmente, a llevarlo constantemente al veterinario, a comprar las medicinas y pagar los tratamientos que requiera.</p>
                    <img src="img/patas.png" class='imagenPatas' alt=""/>
                    <button class="cerrarModal boton form-control btn btn-primary submit px-3 botonT">Aceptar</button>
                </div>
            </div><br>


            <style>
                .form{
                    padding: 5%;
                }
                h3{
                    text-align: left;
                }

                .btn:not(:disabled):not(.disabled) {
                    cursor: pointer;
                    width: 10rem;
                }




            </style>

            <br>

            <script src="js/modalFormulario.js" type="text/javascript"></script>
            <script src="https://cdn.jsdelivr.net.npm.sweetalert2@9"></script>

            <%-- <script src="js/validacionRNovedad.js" type="text/javascript"></script>--%>
            <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
            <script src="js/materialize.js" type="text/javascript"></script>
            <!-- JavaScript Bundle with Popper -->
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    </body>
</html>