<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<titl>Formulaire Utilisateur</title>
</head>
<body>
<form:form action="processForm" modelAttribute="utilisateur" > 

Pr?nom: <form:input path="prenom" />
Nom: <form:input path="nom"/>

Pays: 
	<form:select path="pays">
		<form:options items="${laListeDesPays}"/>
		 
	</form:select>

<input type="submit" value="valider"/>
</form:form>
</body>
</html>