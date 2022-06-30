<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
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

<html:form action="/text">

<b> Enter First Name:</b> <html:text property="fname"/> <br>
<b> Enter Last Name:</b> <html:text property="lname"/> <br>
<html:submit value="Submit"/>
<html:reset value="Reset"/>
</html:form>


</body>
</html>