<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- ${name}
${user.name}
${user.email}
${user.pass}   -->

${use.namer}
${use.cricket}
${use.flag}

<%

String name=(String)request.getAttribute("n");
out.println(""+name);
%>
</body>
</html>