<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulaire Utilisateur</title>
<style>.error{color:red}</style>
</head>
<body>
<form:form action="processForm" modelAttribute="personnage" > 

Prénom: <form:input path="prenom" />
Nom (*): <form:input path="nom"/>
<form:errors path="nom" cssClass="error"/> 
 
 <br><br>

<input type="submit" value="valider"/>
</form:form>
</body>
</html>