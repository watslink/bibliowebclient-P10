<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="./include/taglibs.jsp" %>
<html>
<%@include file="./include/head.jsp" %>
<body>
<%@include file="./include/header.jsp" %>

<%@include file="./include/menu.jsp" %>

<h1> Réservation du livre: ${book.title}</h1>

<c:if test="${isAlreadyPresentinBorrowing}">
    <div class="alert alert-info">
        <p>Vous empruntez actuellement déja ce livre, il ne peut être resérvé.</p>
    </div>
</c:if>
<c:if test="${isAlreadyPresentinReservation}">
    <div class="alert alert-info">
        <p>Vous avez déja une réservation pour ce livre.</p>
    </div>
</c:if>
<c:if test="${isTooMuchReservation}">
    <div class="alert alert-info">
        <p>La limite de reservation est atteinte, merci de renouveller votre demande ultérieurement.</p>
    </div>
</c:if>
<c:if test="${!isTooMuchReservation && !isAlreadyPresentinBorrowing &&!isAlreadyPresentinReservation}">
    <div class="container">
        <table class="table table-striped">
            <tbody>
                <tr class="row">
                    <td> Nombre de réservation en cours: </td>
                    <td class="col-xs-4">${nbResa}</td>
                </tr>
                <tr class="row">
                    <td> Date de retour estimée: </td>
                    <td class="col-xs-4">${nextReturnBorrowing.returnDate}</td>
                </tr>
                <tr class="row">
                    <td> Confirmer la réservation: </td>
                    <td class="col-xs-4"><a href="${pageContext.request.contextPath}/validateReservation?bookId=${book.bookId}&userId=${user.userId}"
                                            class="btn btn-success">Réserver</a></td>
                </tr>
            </tbody>
        </table>
    </div>
</c:if>
<%@include file="./include/footer.jsp" %>
</body>
</html>
