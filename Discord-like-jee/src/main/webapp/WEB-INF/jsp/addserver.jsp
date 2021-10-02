<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
</head>

<body>
	<c:if test="${ server == null }">
		<h1>Ajouter un server</h1>
	</c:if>
	<c:if test="${ produit != null }">
		<h1>Modifier le server</h1>
	</c:if>
	
	<form method="POST">
		<div>
			<label>Nom</label>
			<input type="text" name="nom" value="${ nom }" />
		</div>
		
		
		<div>
			<c:if test="${ server == null }">
				<input type="submit" value="Ajouter" />
			</c:if>
			
			
			<c:if test="${ server != null }">
				<input type="submit" value="Modifier" />
			</c:if>
		</div>
	</form>
</body>
</html>