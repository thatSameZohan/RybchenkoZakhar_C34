<%@ page import="com.Car" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    if(request.getAttribute("items")!=null){
        List<Car> atts=(List<Car>)request.getAttribute("items");

        for( Car car:atts ){
            out.print(" ID: "+car.getId()+"<br>");
            out.print(" Model: "+car.getModel()+"<br>");
            out.print(" Cost: "+car.getCost()+"<br><br>");
        }
    }
%>

    <c:if test="${requestScope.items!=null}">
        <ul>
        <c:forEach var="car" items="${items}">

        <li>ID: ${car.id} <br> Model: ${car.model}<br> Cost: ${car.cost}</li><br>

        </c:forEach>
        </ul>
    </c:if>


</body>
</html>
