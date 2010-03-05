<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calculate!</h1>
        <form  name="calc" action="calculate" method="POST">
            <input type="text" name="term1" value="" size="10" />
            <input type="text" name="term2" value="" size="10" />
            <input type="submit" value="*" name="multiply" />
            <input type="submit" value="/" name="divide" />
        </form>
    </body>
</html>
