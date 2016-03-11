<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
</head>
<body>
<form:form method="Post" action="bookEntry.htm">
<label>Book Number</label>
<form:input path="bookNumber"/>
<label>Book Name</label>
<form:input path="bookName"/>
<input type="submit" value="Add Book">
</form:form>
</body>
</html>