<%-- 
    Document   : index
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
        <title>Inicio</title>
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
                    <a class="nav-link nav-color" href="pedido_init">Nuevo Pedido</a>
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
        <div class="text-right bg-warning">
            <a class="navbar-brand" href="pedido_init">
              <img src="static/imagenes/icon_check8.png" width="30" height="30" alt="logo-nav">
              Realiza tu pedido aqui
            </a>
        </div>
        <!--Fin Navbar-->
        
        <!--Main-->
        <div class="container">
            <div class="row">
              <div class="col-md-6">
                  <div class="col-xl-10">
                      <p class="text-primary"><strong>Nueva</strong></p>
                      <span>Hamburguesa especial</span>
                      <div class="row">
                          <div class="col-md-8">
                              <img src="static/imagenes/icon_hamburguesa.jpg">
                          </div>
                          <div class="col-md-4">
                              <h1 class="text-danger">A solo</h1>
                              <h2>S/ 7.90</h2>
                          </div>
                      </div>
                      
                  </div>
                  
                  <div class="col-xl-10">
                      <p class="text-primary"><strong>Nueva</strong></p>
                      <span>Tentación de maní</span>
                      
                      <div class="row">
                          <div class="col-md-8">
                              <img src="static/imagenes/icon_helado.png">
                          </div>
                          <div class="col-md-4">
                              <h1 class="text-danger">A solo</h1>
                              <h2>S/ 4.90</h2>
                          </div>
                      </div>
                  </div>
              </div>
              <div class="col-md-6">
                  <img src="static/imagenes/fondo2.jpg" class="img-thumbnail">
              </div>
            </div>
        </div>
        
        <!--Fin Main-->
        
        
        
        <script src="static/js/jquery-3.2.1.min.js"></script>
        <script src="static/js/bootstrap.min.js"></script>
    </body>
</html>
