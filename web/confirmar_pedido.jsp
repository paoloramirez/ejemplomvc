<%-- 
    Document   : confirmar_pedido
    Author     : bash
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximun-scale=1.0, minimun-scale=1.0">
        <link rel="stylesheet" href="static/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmar pedido</title>
    </head>
    <body>
        
        <!--Navbar-->
        <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>

            <a class="navbar-brand" href="index.jsp">
              <img src="static/imagenes/icon.jpg" width="60" height="60" class="d-inline-block align-top" alt="logo-nav">
              QWERTY'S RESTAURANT
            </a>
            

            <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
              <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                  <li class="nav-item">
                    <a class="nav-link nav-color-active" href="index.jsp">Inicio</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link nav-color" href="nuevo_pedido.jsp">Nuevo Pedido</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link nav-color" href="#">Menú</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link nav-color" href="#">Contacto</a>
                  </li>
              </ul>
            </div>
        </nav>
        <div class="text-center bg-warning">
            <h2 class="">¿Estas deacuerdo con el pedido elegido?</h2>
        </div>
        <!--Fin Navbar-->
        
        <!--Mostrar datos-->
        
        <div class="container-fluid">
            
            
        </div>
        
        
        <!--Mostrar datos END-->
        
        <div class="row">
            
            <div class="col-md-6 text-right">
                <a href="nuevo_pedido.jsp">
                    Regresar
                </a>
            </div>
            
            <div class="col-md-6 text-left">
                <form action="pedido_guardar" method="post">

                    <button type="submit" class="btn btn-primary">Aceptar</button>

                </form>
            </div>
            
        </div>
        
        <script src="static/js/jquery-3.2.1.min.js"></script>
        <script src="static/js/bootstrap.min.js"></script>
    </body>
</html>
