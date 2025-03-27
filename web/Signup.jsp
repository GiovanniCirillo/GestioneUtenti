<%-- 
    Document   : Signup
    Created on : 7-mar-2025, 9.21.11
    Author     : Giovanni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrazione Utente</title>
    </head>
    <body>
        <form method="POST" action="RegistrazioneUtente">
            <label for="cognome">Cognome</label><br>
            <input type="text" name="cognome"><br>
            <label for="nome">Nome</label><br>
            <input type="text" name="nome"><br>
            <label for="usr">Username</label><br>
            <input type="text" name="usr"><br>
            <label for="pwd">Password</label><br>
            <input type="text" name="pwd"><br>
            <label for="tel">Telefono</label><br>
            <input type="text" name="tel"><br>
            <input type="submit" name="submit" >
        </form>
    </body>
</html>
