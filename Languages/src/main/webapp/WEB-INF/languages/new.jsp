<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<h1>New Language</h1>
<form:form action="/languages" method="post" modelAttribute="language">
	<div class="form-group mt-4">
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input class="form-control" path="name"/>
	</div>
	<div class="form-group mt-3">
        <form:label path="creator">Creator</form:label>
        <form:errors path="creator"/>
        <form:input class="form-control" path="creator"/>
    </div>
	<div class="form-group mt-3">
        <form:label path="currentVersion">Current Version</form:label>
        <form:errors path="currentVersion"/>
        <form:input class="form-control" path="currentVersion"/>
	</div>
    <input type="submit" value="Submit" class="btn btn-dark mt-3"/>
</form:form>    
</div>
</body>
</html>