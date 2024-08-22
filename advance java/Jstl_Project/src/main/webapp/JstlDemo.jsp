<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  <%-- taglib for core tag --%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  <%-- taglib for faormat tag --%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="a" value="1"></c:set>

<c:out value="${a}"></c:out>

<c:if test="${a > 0}">
<c:out value="sardar singh"></c:out>
</c:if>



<c:forEach var="j" begin="1" end="4">
<c:out value="sourabh"></c:out><br>
</c:forEach>

<c:set var="str" value="<%=new java.util.Date()%>" />
 <fmt:formatDate value="${str}" type="both" timeStyle="long" dateStyle="long" /> 
 <center>
<table border="3" >


 <c:forEach var="zone"  items="<%=java.util.TimeZone.getAvailableIDs()%>">  
<tr>
<td><c:out value="${zone }"></c:out></td>

<td>
<fmt:timeZone value="${zone}">  
              <fmt:formatDate value="${str}" timeZone="${zn}"  
              type="both"/>  
            </fmt:timeZone> 
</td>

</tr>
</c:forEach>
</table>
</center>


</body>
</html>