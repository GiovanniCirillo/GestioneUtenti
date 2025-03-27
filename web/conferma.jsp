<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conferma</title>
    </head>
    <body>
        <h2><%
                out.println(session.getAttribute("msgok"));
                session.removeAttribute("msgok");
            %>
        </h2>
    </body>
</html>
