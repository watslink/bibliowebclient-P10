<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="./include/taglibs.jsp" %>
<html>
<%@include file="./include/head.jsp" %>
<body>
<%@include file="./include/header.jsp" %>

<%@include file="./include/menu.jsp" %>

<h1> Details de votre reservation: ${reservation.book.title}</h1>

    <div class="container">
        <table class="table table-striped">
            <tbody>
            <c:if test = "${reservation.dateStartMailing == null}">
            <tr class="row">
                <td> Date de retour estimée </td>
                <td class="col-xs-4">${nextReturnBorrowing.returnDate}</td>
            </tr>
            <tr class="row">
                <td> Position dans la file d'attente </td>
                <td class="col-xs-4">${position}</td>
            </tr>
            </c:if>
            <c:if test = "${reservation.dateStartMailing != null}">
                <tr class="row">
                    <td> Livre disponible depuis le: </td>
                    <td class="col-xs-4">${reservation.dateStartMailing}</td>
                </tr>
            </c:if>
            <tr class="row">
                <td> Supprimer la réservation: </td>
                <td class="col-xs-4"><a href="${pageContext.request.contextPath}/deleteReservation?reservationId=${reservation.reservationId}"
                                        class="btn btn-danger">Supprimer</a></td>
            </tr>
            </tbody>
        </table>
    </div>
<%@include file="./include/footer.jsp" %>
</body>
</html>
