<%--
  Created by IntelliJ IDEA.
  User: beldar
  Date: 7/10/2022
  Time: 12:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>

    <form:form action="processoForm" modelAttribute="student">
        First name: <form:input path="firstName" />
        <br> <br>
        First name: <form:input path="lastName" />
        <br> <br>

        <input type="submit" value="Submit" />
    </form:form>

</body>
</html>
