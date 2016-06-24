<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formulaire</title>
</head>
<body>
	<table cellpadding="0" cellspacing="0" border="1" width="20%">
		<tr>
			<td><h1>Formulaire Ajout Employe</h1></td>
		</tr>
		<tr>
			<td><form:form action="addEmploye" method="post"
					modelAttribute="currentEmploye">
					<table width="100%">
						<tr>
							<td><form:label path="nom">Nom:</form:label></td>
							<td align="center" width="100%"><form:input path="nom" /></td>
						</tr>
						<tr>
							<td><form:label path="prenom">Prenom:</form:label></td>
							<td align="center" width="100%"><form:input path="prenom" /></td>
						</tr>
						<tr>
							<td><form:label path="fonction">Fonction:</form:label></td>
							<td align="center" width="100%"><form:input path="fonction" /></td>
						</tr>
						<tr>
							<td><form:label path="departement">Departement:</form:label></td>
							<td align="center" width="100%"><form:input path="departement" /></td>
						</tr>
						<tr>
							<td><form:label path="salaire">Salaire:</form:label></td>
							<td align="center" width="100%"><form:input path="salaire" /></td>
						</tr>
						<tr>
							<td colspan="2"><input type="submit" value="Submit" /></td>
						</tr>
					</table>
				</form:form></td>
		</tr>
	</table>

</body>
</html>
