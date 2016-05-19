<%--
  Created by IntelliJ IDEA.
  User: jalos
  Date: 12.05.2016
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/See-exam results" var ="takeURL"/>
<html>
<head>
    <title>Results</title>
</head>
<body>
<c:forEach items="${ResultList}" var="score">
Exam: ${question.score}<a href="${takeURL}/${question.score}"<see result</a>

</c:forEach>
</body>
</html>
