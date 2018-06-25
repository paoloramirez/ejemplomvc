<%-- 
    Document   : nuevo_pedido
    Author     : bash
--%>

<%@page import="modelo.Entity.Bebida"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Entity.Hamburguesa"%>
<%@page import="modelo.Entity.Postre"%>
<%
    List<Bebida> lista_bebidas = (List<Bebida>) request.getSession().getAttribute("lista_bebidas");
    List<Hamburguesa> lista_hamburguesas = (List<Hamburguesa>) request.getSession().getAttribute("lista_hamburguesas");
    List<Postre> lista_postres = (List<Postre>) request.getSession().getAttribute("lista_postres");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximun-scale=1.0, minimun-scale=1.0">
        <link rel="stylesheet" href="static/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo pedido</title>
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
            <h2 class="">Selección de pedido</h2>
        </div>
        <!--Fin Navbar-->
        
        <form class="form-control-sm" action="pedido_nuevo" method="post">
            
            <!-- HAMBURGUESAS-->
            <h2 class="text-primary">Hamburguesas</h2>
            <h4 class="">Seleccione su hamburguesa</h4>
            
            <div class="form-group">
            <input type="hidden" name="hamburguesa" value="0">
            <label for="carne_clasica" class="col-sm-2 radio-inline"><%= lista_hamburguesas.get(0).getNombre()%>
                <input type="radio"  name="hamburguesa" id="carne_clasica" value="<%= lista_hamburguesas.get(0).getId_ham()%>">
            </label>
            <label for="pollo_clasica" class="col-sm-2 radio-inline"><%= lista_hamburguesas.get(1).getNombre()%>
                <input type="radio"  name="hamburguesa" id="pollo_clasica" value="<%= lista_hamburguesas.get(1).getId_ham()%>">
            </label>
            <label for="queso_tocino" class="col-sm-2 radio-inline"><%= lista_hamburguesas.get(2).getNombre()%>
                <input type="radio" name="hamburguesa" id="queso_tocino" value="<%= lista_hamburguesas.get(2).getId_ham()%>">
            </label>
            <label for="especial" class="col-sm-2 radio-inline"><%= lista_hamburguesas.get(3).getNombre()%>
                <input type="radio" name="hamburguesa" id="especial" value="<%= lista_hamburguesas.get(3).getId_ham()%>">
            </label>
            </div>
            <!-- HAMBURGUESAS END-->
            
            <!-- BEBIDAS-->
            <h2 class="text-primary">Bebidas</h2>
            <h4 class="">Seleccione su bebida</h4>
            
            <div class="form-group">
            <input type="hidden" name="bebida" value="0">
            
            <label for="gaseosa_inka" class="col-sm-2 radio-inline"><%= lista_bebidas.get(0).getNombre()%>
                <input type="radio"  name="bebida" id="gaseosa_inka" value="<%= lista_bebidas.get(0).getIdBeb()%>">
            </label>
            <label for="gaseosa_coca" class="col-sm-2 radio-inline"><%= lista_bebidas.get(1).getNombre()%>
                <input type="radio"  name="bebida" id="gaseosa_coca" value="<%= lista_bebidas.get(0).getIdBeb()%>">
            </label>
            <label for="jugo_fresa" class="col-sm-2 radio-inline"><%= lista_bebidas.get(2).getNombre()%>
                <input type="radio"  name="bebida" id="jugo_fresa" value="<%= lista_bebidas.get(0).getIdBeb()%>">
            </label>
            <label for="chicha_morada" class="col-sm-2 radio-inline"><%= lista_bebidas.get(3).getNombre()%>
                <input type="radio"  name="bebida" id="chicha_morada" value="<%= lista_bebidas.get(0).getIdBeb()%>">
            </label>
            </div>
            <!-- BEBIDAS END-->
            
            <!-- POSTRES-->
            <h2 class="text-primary">Postres</h2>
            <h4 class="">Seleccione su postre</h4>
            
            <div class="form-group">
            <input type="hidden" name="postre" value="0">
            <label for="helado_1" class="col-sm-2 radio-inline"><%= lista_postres.get(0).getNombre()%>
                <input type="radio"  name="postre" id="helado_1" value="<%= lista_postres.get(0).getId_pos()%>">
            </label>
            <label for="sundae_chocolate" class="col-sm-2 radio-inline"><%= lista_postres.get(1).getNombre()%>
                <input type="radio"  name="postre" id="sundae_chocolate" value="<%= lista_postres.get(1).getId_pos()%>">
            </label>
            <label for="tentacion_mani" class="col-sm-2 radio-inline"><%= lista_postres.get(2).getNombre()%>
                <input type="radio"  name="postre" id="tentacion_mani" value="<%= lista_postres.get(2).getId_pos()%>">
            </label>
            </div>
            <!-- POSTRES END-->
            
            
            <div class="form-group text-center">
                <br><br>
                          <span class="col-sm-1 control-label"></span>
                  <span><button type="submit" class="btn btn-primary">Siguiente</button></span>
            </div>
            
        </form>
        
        
        <script src="static/js/jquery-3.2.1.min.js"></script>
        <script src="static/js/bootstrap.min.js"></script>
    </body>
</html>
