<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora Bhaskara</title>
    </head>
    <body>
        <h1>Calculadora Bhaskara</h1>
        <hr>
        <%
            String a, b, c;
            a = request.getParameter("valorA");
            b = request.getParameter("valorB");
            c = request.getParameter("valorC");
        %>
        
        <jsp:useBean id="bhaskara" class="br.uninove.Bhaskara" scope="page"/>
        <jsp:setProperty name="bhaskara" property="a" value="<%=a%>" />
        <jsp:setProperty name="bhaskara" property="b" value="<%=b%>" />
        <jsp:setProperty name="bhaskara" property="c" value="<%=c%>" />
        
        <p>O resultado da equação <%=a%>x² + <%=b%> + <%=c%> = 0, é:</p>
        <br>
        <%= bhaskara.calculaBhaskara() %>
    </body>
</html>
