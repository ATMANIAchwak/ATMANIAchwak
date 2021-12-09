<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<titl>Formulaire Utilisateur</title>
</head>
<body>
<form:form action="processForm" modelAttribute="utilisateur" > 

Prénom: <form:input path="prenom" />
Nom: <form:input path="nom"/>

<input type="submit" value="valider"/>
</form:form>
</body>
</html>