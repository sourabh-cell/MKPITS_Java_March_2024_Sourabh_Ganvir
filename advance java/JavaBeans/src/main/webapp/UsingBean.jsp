<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- loading the bean    here s is the id of class which is use to identifies bean-->
<jsp:useBean id="s" class="bean.Student" scope="application"/>

<!-- Setting value of name by hardcoding using jsp action    -->
<jsp:setProperty name="s" property="name" value="Sourabh"/>

<!-- Setting value of mark from user using jsp action  -->
<jsp:setProperty name="s" property="mark" param="mk"/>

<!-- getting the value of name and mark using jsp action jsp:getproperty -->
<jsp:getProperty property="name" name="s"/>

<jsp:getProperty property="mark" name="s"/>


<!-- calling getResult() func -->
<%
String result =s.getResult();
out.println(result);
%>

</body>
</html>