<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<c:url value="/save-question" var="saveQuestionURL"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body style="background-color:lightgrey;">

<p> Closed questions securities</p>

<p>${question.questionContent}</p>
<form action="${saveQuestionURL}" method="POST">
    <input type ="hidden" value ="${question.id}" name="id">
<c:forEach items="${question.answers}" var="answer">
    <input type="checkbox" name="answers" />${answer.answerContent}<br />

</c:forEach>



<input type="submit" value="next question" />
</form>
</body>
</html>