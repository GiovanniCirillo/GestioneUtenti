<%-- 
    Document   : edit
    Created on : 8 apr 2025, 09:25:16
    Author     : Giovanni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modifica Utente</title>
    </head>
    <body>
        <form method="POST" action="ModificaUtente">
            <label for="usr">Username</label><br>
            <input type="text" name="usr"><br>
            <label for="cognome">Cognome</label><br>
            <input type="text" name="cognome"><br>
            <label for="nome">Nome</label><br>
            <input type="text" name="nome"><br>
            <label for="pwd">Password</label><br>
            <input type="text" name="pwd"><br>
            <label for="tel">Telefono</label><br>
            <input type="text" name="tel"><br>
            <input type="submit" name="submit" >
        </form>
    </body>
</html>
