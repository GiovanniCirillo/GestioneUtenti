<%-- 
    Document   : errore
    Created on : 9-gen-2025, 10.57.31
    Author     : Giovanni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Errore</title>
    </head>
    <body>
        <h1>Si è verificato il seguente errore:</h1>
        <br>
        <h2><%
                out.println(session.getAttribute("msgerr"));
                session.removeAttribute("msgerr");
            %>
        </h2>
    </body>
</html>
