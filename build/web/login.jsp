<%-- 
    Document   : login
    Created on : 8/09/2022, 06:35:30 AM
    Author     : Danna Lu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- CSS only -->
<!doctype html>
<html lang="en">
    <head>
        <title>Crepetto</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="shortcut icon" type="image/x-icon" href="../anipat/img/logo-img.png">

        <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900&display=swap" rel="stylesheet">

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="css/stylelogin.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <form action="Usuario" method="post">
        <section class="ftco-section">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-md-6 text-center mb-5">
                        <h2 class="heading-section"></h2>
                    </div>
                </div>
                <div class="row justify-content-center">

                    <div class="col-md-12 col-lg-10">
                        <div class="wrap d-md-flex">
                            <div class="text-wrap p-4 p-lg-5 text-center d-flex align-items-center order-md-last">
                                <div class="text w-100">
                                    <h2>Bienvenido a crepetto</h2>
                                    <p>¿No tienes una cuenta?</p>
                                    <a href="registrarUsuario.jsp" class="btn btn-white btn-outline-white">Registrate aqui</a>
                                </div>
                            </div>
                            <div class="login-wrap p-4 p-lg-5">
                                <div class="d-flex">
                                    <div class="w-100">
                                        <img src="./img/logo.png"  alt="">
                                    </div>

                                    <div class="w-100">
                                        <p class="social-media d-flex justify-content-end">
                                            <a href="#" class="social-icon d-flex align-items-center justify-content-center"><span class="fa fa-facebook"></span></a>
                                            <a href="#" class="social-icon d-flex align-items-center justify-content-center"><span class="fa fa-twitter"></span></a>
                                            <a href="index.jsp" class="social-icon d-flex align-items-center justify-content-center"><span class="fa fa-home"></span></a>
                                        </p>
                                    </div>
                                </div><br>


                                <form action="#" class="signin-form">
                                    <div class="form-group mb-3">
                                        <label class="label" for="name">Correo electronico</label>
                                        <input type="email" class="form-control" placeholder="Username" name="textCorreoUsuario" required> 
                                    </div>
                                    <div class="form-group mb-3">
                                        <label class="label" for="password">Contraseña</label>
                                        <input type="password" class="form-control" placeholder="Password" name="textPassword" required>
                                    </div>

                                    <button type="submit" class="form-control btn btn-primary submit px-3">Ingresar</button>
                                    <input type="hidden" value="3" name="opcion"><br>

                                    <div class="form-group d-md-flex">
                                        <div class="w-50 text-left">
                                            <label class="checkbox-wrap checkbox-primary mb-0">Recuerdame
                                                <input type="checkbox" checked>
                                                <span class="checkmark"></span>
                                            </label>
                                        </div>
                                        <div class="w-50 text-md-right">
                                            <a href="#">¿Olvidaste tu contraseña?</a>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
</form>
        <script src="js/jquery.min.js"></script>
        <script src="js/popper.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/main.js"></script>

    </body>
</html>

