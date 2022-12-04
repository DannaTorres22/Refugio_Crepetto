<%-- 
    Document   : perfiles
    Created on : 18/10/2022, 01:19:23 PM
    Author     : julia_000
--%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloVO.MascotaVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.MascotaDAO"%>
<%@include file="sesiones1.jsp"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
     

        <%
            MascotaVO masVO = new MascotaVO();
            MascotaDAO masDAO = new MascotaDAO();
            ArrayList<MascotaVO> listaMascotas = masDAO.listar();
            for (int i = 0; i < listaMascotas.size(); i++) {

                masVO = listaMascotas.get(i);

        %>
        

        <div class="tarjeta-wrap">


            <div class="col-6 col-sm-4">
                <div class="tarjeta">
                    <div class="adelante card1">
                        <img class="im" src="<%=masVO.getUrl()%>" alt="Card image cap">
                        <a class="nom"><%=masVO.getNombre()%></a>
                    </div>
                    <div class="atras">

                        <p class="ad"><%=masVO.getRaza()%> <br>
                            <%=masVO.getEdad()%> años <br>

                            <%=masVO.getEstadoMascota()%></p>
                        <form method="post" action="Formulario">
                            <button name="textIdMascota" class="form-control btn btn-primary submit px-3" value="<%=masVO.getIdMascota()%>">Adoptar</button>
                            <input type="hidden" name="opcion" value="4">
                       </form>
 
                    </div>
                </div>
            </div>
                            <%            if (request.getAttribute("MensajeError") != null) { %>
            ${MensajeError}

            <% } else {%>
            ${MensajeExito}
            <%}%>
        </div>
  


        <style>



            .tarjeta-wrap {
                width: 396px;
                margin-left: 4rem;
                display: -webkit-box;
                display: -webkit-flex;
                display: -ms-flexbox;
                display: inline-flex;
                -webkit-box-pack: center;
                -ms-flex-pack: center;
                justify-content: space-between;
                flex-direction: row;
                margin-right: -38px;
                -webkit-perspective: 800;
            }

            .tarjeta{
                width: 274px;
                height: 318px;
                background: #ffffff;
                position: relative;
                -webkit-transform-style: preserve-3d;
                transform-style: preserve-3d;
                -webkit-transition: .9s;
                transition: .9s;
                -webkit-box-shadow: 0px 10px 15px -5px rgb(0 0 0 / 65%);
                box-shadow: 2px 4px -2px 2px rgb(22 180 255 / 32%);
                border-radius: 1rem;
                margin-left: 2rem;
                margin-bottom: 3rem;


            }
            .ad{
                display: flex;
                justify-content: center;
                align-items: center;
                flex-direction: column;
            }
            .adelante, .atras{
                width: 100%;
                height: 100%;
                position: absolute;
                top: 0;
                left: 0;
                -webkit-backface-visibility: hidden;
                backface-visibility: hidden;
                border-radius: 1rem;
            }
            
            .im:hover{
                filter: brightness(49%);
                cursor:pointer;
            }
            .im{
                border-radius: 1rem;
                width: 100%;
               

            }
            .adelante{
                width: 100%;
            }
            .nom{
                color: snow;
                font-size: 2rem;
                justify-content: center;
                display: flex;
                align-items: center;
                margin-left: 0rem;
            }
            .atras{
                -webkit-transform: rotateY(180deg);
                transform: rotateY(180deg);

                padding: 15px;
                display: -webkit-box;
                display: -webkit-flex;
                display: -ms-flexbox;
                display: flex;
                -webkit-box-pack: center;
                -webkit-justify-content: center;
                -ms-flex-pack: center;
                justify-content: center;
                -webkit-box-align: center;
                -webkit-align-items: center;
                -ms-flex-align: center;
                align-items: center;
                flex-direction: column;
                text-align: center;
                color: #fff;
                font-family: "open sans";
                background: #fff;
            }

            .tarjeta-wrap:hover .tarjeta{
                -webkit-transform: rotateY(180deg);
                transform: rotateY(180deg);
            }

            .card1{

                background-size: cover;
            }
            a{
                text-decoration: none;
                color:#000;
            }

        </style> 
        <%}%>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    </body>
</html>