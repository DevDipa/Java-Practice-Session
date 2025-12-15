<%@ page contentType = "text/html; charset = UTF-8" language = "java" %>

<html>
    <head>
        <title>SI Calculator</title>
    </head>

    <body>
        <form action = "process.jsp" method = "POST">
            <input type = "text" name = "p" placeholder = "Principal"><br>
            <input type = "text" name = "t" placeholder = "Time"><br>
            <input type = "text" name = "r" placeholder = "Rate"><br>
            <input type = "submit" value = "Calculate">
        </form>
    </body>
</html>