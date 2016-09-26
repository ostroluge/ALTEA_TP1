<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="bean.Produit"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="java.util.Iterator"%>
<%@ taglib prefix="c"       uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"     uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn"      uri="http://java.sun.com/jsp/jstl/functions" %>
<link rel=stylesheet type="text/css" href="ALTEA_TP1/css/styles.css">

<div class="titre">Catalogue</div>
<br>
<c:forEach items="${requestScope['produitsBean']}" var="produit">
	<div class="produit">
	<table>
	<tr>
	<td rowspan="2"><img src="${produit.value.image}"/></td>
	<td><a class="nom" href=${produit.value.id}>${produit.value.nom}</a></td>
	</tr>
	<tr>
	<td class="prix">${produit.value.prix.prixEuro}&nbsp;&euro;</td>
	</tr>
	<tr>
	<td colspan="2" class="desc">${produit.value.description}</td>
	<br>
	</table>
	</div>
</c:forEach>
</html>