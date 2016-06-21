<%--
  Created by IntelliJ IDEA.
  User: jalos
  Date: 12.05.2016
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/exams" var="examsURL"/>
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


    <title>Results</title>
</head>
<br style="background-color:lightgrey;">
<h1 align="center">Result</h1>

<c:choose>
    <c:when test="${examPassed == true}">
        <P>Congratulations!</P>
        You made ${result.score}% of correct answers to pass the test.
        Your knowledge is sufficient to provide the ${exam.nameOfExam}  sales to the Retail clients.
    </c:when>
    <c:otherwise>
        <p>You failed!</p>
        You made ${result.score}% of correct answers and failed the test.
        Your knowledge is unsufficient to provide the ${exam.nameOfExam} sales to the Retail clients.

    </c:otherwise>
</c:choose>
    <%--< wersja za pomoca taga c:choose--%>
   <%--< wersja warukowego wyknania kodu za pomoca taga c:if--%>
<%--<c:if test="${examPassed == true}">--%>
<%--<P>Congratulations!</P>--%>
<%--You made ${result.score}% of correct answers to pass the test.--%>
    <%--Your knowledge is sufficient to provide the ${exam.nameOfExam}  sales to the Retail clients.--%>
<%--</c:if>--%>

<%--<c:if test="${examPassed == false}">--%>
<%--<p>You failed!</p>--%>
    <%--You made ${result.score}% of correct answers to fail the test.--%>
    <%--Your knowledge is unsufficient to provide the ${exam.nameOfExam} sales to the Retail clients.--%>

<%--</c:if>--%>
<br/><a class="btn btn-success" href="${examsURL}" >lista</a>
<p>How difficult was the questionaire?</p>
<input type="radio" name="Wiek" value="very easy" />1 very easy <br/>
<input type="radio" name="Wiek" value="easy" />2 easy <br/>
<input type="radio" name="Wiek" value="medium" />3 medium <br/>
<input type="radio" name="Wiek" value="difficult" />4 difficult <<br/>
<input type="radio" name="Wiek" value="very difficult" />5 very difficult<<br/>
<p>Please enter your comment:</p>
<textarea name="Komentarz" cols="50" rows="10">Please enter your feedback for your line manager.</textarea>
<br /><br /><br />
<!-- Przycisk WYŚLIJ -->
<input type="submit" value="Submit" />
<!-- Przycisk WYCZYŚĆ DANE -->
<input type="reset" value="Clear" />




</body>
</html>
