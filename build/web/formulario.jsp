<%-- 
    Document   : formulario
    Author     : bash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            Registro nuevo
        </h1>
        
        <form action="procesar" method="post">
            
            <div class="form-group">
                <label for="dni" class="col-sm-1 control-label">DNI:</label>
                <input type="text" class="form-control" name="dni" id="dni" required>
            </div>
            
            <div class="form-group">
                <label for="nombre" class="col-sm-1 control-label">Nombre:</label>
                <input type="text" class="form-control" name="nombre" id="nombre" required>
            </div>
            
            </div>
            <div class="form-group">
                          <span class="col-sm-1 control-label"></span>
                  <span><button type="submit" class="btn btn-primary">Enviar</button></span>
            </div>
            
        </form>
    </body>
</html>
