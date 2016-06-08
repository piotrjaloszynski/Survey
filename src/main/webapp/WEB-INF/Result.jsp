<%--
  Created by IntelliJ IDEA.
  User: jalos
  Date: 12.05.2016
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Results</title>
</head>
<body style="background-color:lightgrey;">
<h1 align="center">Result</h1>
<P>Congratulations!
You made ${result.score}% of correct answers to pass the test.Your knowledge is sufficient to provide the derivative sales to the Retail clients.

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
</P>




</body>
</html>
