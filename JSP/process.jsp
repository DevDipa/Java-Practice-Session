<%@ page contentType = "text/html; charset = UTF-8" language = "java" %>

<html>
    <head>
        <title>SI Calculator</title>
    </head>

    <body>
        <%
            float p = Float.parseFloat(request.getParameter("p"));
            float t = Float.parseFloat(request.getParameter("t"));
            float r = Float.parseFloat(request.getParameter("r"));
            float si = (p*t*r)/100;
        %>

        <h1>Simple Interest: <%= si %></h1>
    </body>
</html>