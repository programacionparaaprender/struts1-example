<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@page import="app.entidad.ListaCampos"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String contextPath = request.getContextPath();
	String name = "Jun";
%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>Hello</title>
</head>
<body>
<h1> Struts html:text example </h1>
<html:form action="/Hello">
<b> Enter User Name:</b> <html:text property="username"/> <br>
<b> Enter Password:</b> <html:text property="password"/> <br>
<html:submit value="Submit"/>
<html:reset value="Reset"/>
</html:form>


</body>
</html>
