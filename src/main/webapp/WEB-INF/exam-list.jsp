<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/take-exam" var="takeURL"/>

<%--
  Created by IntelliJ IDEA.
  User: jalos
  Date: 02.05.2016
  Time: 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="Main.css">
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
          integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css"
          integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
            integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
            crossorigin="anonymous"></script>


</head>
<body style="background-color:lightgrey;">

<h1 align="center">Exam</h1>


<c:forEach items="${ExamsList}" var="exam">
    Exam:${exam.examName}


    <c:choose>
        <c:when test="${exam.status eq 'take'}">
            <!-- opcja 1 wez udzial w egzaminie -->
            <a href="${takeURL}/${exam.examId}">Take exam</a><br><br>


        </c:when>
        <c:when test="${exam.status eq 'continue'}">
            <!-- opcja 2 egzamin in progress -->
            <a href="">continue</a>
        </c:when>
        <c:otherwise>
            <!-- opcja 3 (a) egzamin zdany lub (b) niezdany -->
            <c:choose>
                <c:when test="${exam.status eq 'pass'}">
                    <!--zdany-->
                    Passed

                </c:when>
                <c:otherwise>
                    <!--niezdany-->
                    Failed
                </c:otherwise>
            </c:choose>
        </c:otherwise>
    </c:choose>
</c:forEach>
    <br />
    <p>Please enter your comment:</p>
    <form action="" method="POST">

    <textarea name="Komentarz" cols="50" rows="10" placeholder="Please enter your comments for your line manager."></textarea>
    <br /><br /><br />
    <p>Please enter your email:
    <textarea name="Komentarz" cols="0,5" rows="1"> </textarea>
    <!-- Przycisk WYŚLIJ -->
    <input type="submit" value="Submit" />
    <!-- Przycisk WYCZYŚĆ DANE -->
    <input type="reset" value="Clear" />
    </form>

    </body>
    </html>
