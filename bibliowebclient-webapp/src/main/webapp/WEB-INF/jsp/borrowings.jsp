<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="./include/taglibs.jsp" %>
<html>
<%@include file="./include/head.jsp" %>
<body>
<%@include file="./include/header.jsp" %>

<%@include file="./include/menu.jsp" %>

<h1> Vos Emprunts:</h1>
<div class="container">

    <table class="table table-striped sortTable">
        <thead>
        <tr class="row">
            <th class="col-xs-3">Livre</th>
            <th class="col-xs-3">Auteur</th>
            <th class="col-xs-3">Date de retour</th>
            <th class="col-xs-3">Prolongation</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${listBorrowings}" var="borrowing">
            <tr class="row">
                <td class="col-xs-3">${borrowing.book.title}</td>
                <td class="col-xs-3">${borrowing.book.author}</td>
                <td class="col-xs-3">${borrowing.returnDate}</td>
                <td class="col-xs-3">
                    <c:if test="${!borrowing.extended}">
                        <a href="${pageContext.request.contextPath}/extend?borrowingId=${borrowing.borrowingId}"
                           class="btn btn-primary">Prolonger</a>
                    </c:if>
                    <c:if test="${borrowing.extended}">
                        <p>Déja prolongé</p>
                    </c:if>
                </td>
            </tr>
        </c:forEach>
        <c:forEach items="${listBorrowingsOutOfDate}" var="borrowing">
            <tr class="row">
                <td class="col-xs-3">${borrowing.book.title}</td>
                <td class="col-xs-3">${borrowing.book.author}</td>
                <td class="col-xs-3">${borrowing.returnDate}</td>
                <td class="col-xs-3"><strong>Délai dépassé</strong></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>



<%@include file="./include/footer.jsp" %>
</body>
</html>
