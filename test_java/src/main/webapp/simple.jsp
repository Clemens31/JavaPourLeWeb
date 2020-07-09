<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>

<h1>Vue JSP : Dashboard </h1>

<h3> Affichage avec la Java </h3>
<p>Nom : <%= request.getParameter("name") %></p>
<p>Date et horaire : <%= request.getAttribute("loginTime") %></p>

</hr>

<h3> Affichage avec JSTL simple </h3>
<p> Il est ${ loginTime } </p>
<p> Bonjour ${name ? name : 'bob '} <p>

<h3> Affichage avec JSTL + biblio core </h3>
<p> Bonjour <c:out if   ${name ? name : 'bob '} /> <p>
<p> Bonjour <c:out value="${ name }" /> <p>