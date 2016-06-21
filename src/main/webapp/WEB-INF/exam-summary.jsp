<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/exams" var="examsURL"/>

<%--
  Created by IntelliJ IDEA.
  User: jalos
  Date: 17.06.2016
  Time: 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
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

<h1 align="center">Exam summary</h1>
<table class="table">
    <tr>
        <td>
Imie Nazwisko
        </td>
        <td>
${userFullName}

        </td>

    </tr>
    <tr>
        <td>
Poprawne odpowiedzi
        </td>
        <td>
${correctAnswers}

        </td>

    </tr>
    <tr>
   <td>
Niepoprawne odpowiedzi
   </td>
        <td>
${inCorrectAnswers}
        </td>
    </tr>
<tr>
    <td>
        Procentowy wynik

    </td>
    <td>
  ${examScore}

    </td>
    <td>
       <!-- Wyświetlanie ilości poprawnych i niepoprawnych odpowiedzi na exam summary-->

      <!--  Ilość odpowiedzi do wyświetlenia na exam summary powinny być zgodne z tym co użytkownik uzyskał podczas testu.-->

    </td>

</tr>
</table>
<a class="btn btn-success" href="${examsURL}">wroc do listy</a>
</body>
</html>
