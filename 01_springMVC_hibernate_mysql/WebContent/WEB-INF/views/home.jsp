<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- Ajout des bibliotheques jsp -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
	
	<div align="center">
		<h2 style="background-color: lightgreen; color: darkgreen; ">
			Liste des Employes.
		</h2>
	</div>
	
	<table align="center" width="80%">
		<tr>
			<td align="right">
				<a href="">Ajouter un employe</a>
			</td>
		</tr>
		<tr>
			<td>
				<table cellspacing="0" cellpadding="6" border="1" width="100%">
					<!-- En tete de la table -->
					<tr style="background-color: lightgrey; ">
						<th>Numero</th>
						<th>Nom</th>
						<th>Prenom</th>
						<th>Fonction</th>
						<th>Departement</th>
						<th>Salaire</th>
						<th></th>
						<th></th>
					</tr>
					<!-- Donnees de la table -->
					<c:forEach items="${listeDesEmployes}" var="employee">
						<tr style="background-color: lightyellow">
							<td>${employee.id}</td>
							<td>${employee.nom}</td>
							<td>${employee.prenom}</td>
							<td>${employee.fonction}</td>
							<td>${employee.departement}</td>
							<td>${employee.salaire}</td>
							<!-- Colonne pour editer un employe -->
							<td>
								<a href="">Modifier</a>
							</td>
							<!-- Colonne pour supprimer un employe -->
							<td>
								<a href="">Supprimer</a>
							</td>
							
						</tr>
					</c:forEach>
				</table>
			</td>
		</tr>
		
	</table>

</body>
</html>