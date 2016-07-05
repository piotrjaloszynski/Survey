<%--
  Created by IntelliJ IDEA.
  User: jalos
  Date: 05.07.2016
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/exam-history" var="examsURL"/>
<html>
<head>
    <link rel="stylesheet" href="Main.css">
    <meta charset="UTF-8">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
          integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css"
          integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
            integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
            crossorigin="anonymous"></script>




    <title>Table of all exams</title>
</head>
<body>
<body style="background-color:lightgrey;">
<h1 align="center">exam-history</h1>
<table class="table">
    <tr>
        <td>
            Exam name:
        </td>

        <td>
            result:

        </td>
        <td>
            When taken:
        </td>
    </tr>
    <c:forEach items="${results}" var="result" >
    <tr>
     <td>${result.exam.nameOfExam}</td>
        <td>${result.score}</td>
        <td>${result.user.getFullName()}</td>

    </tr>
    </c:forEach>



</table>
</body>
</html>
