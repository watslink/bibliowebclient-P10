<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="./include/taglibs.jsp" %>
<html>
<%@include file="./include/head.jsp" %>
<body>
<%@include file="./include/header.jsp" %>

<%@include file="./include/menu.jsp" %>

<h1> Vos Réservation:</h1>
<div class="container">

    <table class="table table-striped sortTable">
        <thead>
        <tr class="row">
            <th class="col-xs-3">Livre</th>
            <th class="col-xs-3">Détails</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${listReservation}" var="reservation">
            <tr class="row">
                <td class="col-xs-3">${reservation.book.title}</td>
                <td class="col-xs-4">
                        <a href="${pageContext.request.contextPath}/detailsReservation?reservationId=${reservation.reservationId}"
                           class="btn btn-success">Détails</a>

                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<%@include file="./include/footer.jsp" %>
</body>
</html>
