<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link rel=stylesheet type="text/css" href="ALTEA_TP1/css/styles.css">

<div class="titre">Catalogue</div>
<br>
<br>
<%@ page import="bean.Produit"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="java.util.Iterator"%>
<% HashMap<String, Produit> produits = (HashMap<String, Produit>) request.getAttribute("produitsBean"); %>
<%
	Iterator<Produit> it = produits.values().iterator();
	while (it.hasNext()) {
		Produit produit = (Produit) it.next();
		out.println("<div class=\"produit\">");
		out.println("<table>");
		out.println("<tr>");
		out.println("<td rowspan=\"2\"></td>");
		if (produit.getImage() != null) {
			out.println("<td rowspan=\"2\"><img src=\"" + produit.getImage() + "\"/></td>");			
		}
		out.println("<td><a class=\"nom\" href="+ produit.getId() +">" + produit.getNom() + "</a></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td class=\"prix\">" + produit.getPrix().getPrixEuro() + "&nbsp;&euro;</td>");
		out.println("</tr>");
		out.println("<tr>");
		if (produit.getDescription() != null) {
			out.println("<td colspan=\"2\" class=\"desc\">" + produit.getDescription() + "</td>");			
		}
		out.println("<br>");
		out.println("</table>");
		out.println("</div>");
	}
%>
</html>