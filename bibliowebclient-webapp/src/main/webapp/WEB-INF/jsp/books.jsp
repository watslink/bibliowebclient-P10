<%@ page import="com.sd.oc.serviceproxy.generated.bookServiceAPI.Book" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="./include/taglibs.jsp" %>
<html>
<%@include file="./include/head.jsp" %>
<body>
<%@include file="./include/header.jsp" %>
<%@include file="./include/menu.jsp" %>
<h1> Listes des livres: </h1>

<div class="container">
        <table id="table" class="table table-striped sortTable">
        <thead>
        <tr>
            <th class="col-xs-3">Titre</th>
            <th class="col-xs-3">Auteur</th>
            <th class="col-xs-2">Publication</th>
            <th class="col-xs-2">Pages</th>
            <th class="nosort col-xs-2">Exemplaires disponibles</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${listBooks}" var="book">
            <tr>
                <td class="col-xs-3">${book.title}</td>
                <td class="col-xs-3">${book.author}</td>
                <td class="col-xs-2">${book.publishYear}</td>
                <td class="col-xs-2">${book.nbPages}</td>
                <c:if test = "${book.nbStock!=0}">
                <td class="col-xs-2">${book.nbStock}/${book.nbTotalExemplaire}</td>
                </c:if>
                <c:if test = "${book.nbStock==0}">
                    <td class=" col-xs-2"><a href="${pageContext.request.contextPath}/reservation?bookId=${book.bookId}"
                                             class="btn btn-primary">Réservation...</a></td>
                </c:if>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<%@include file="./include/footer.jsp" %>
</body>
</html>
