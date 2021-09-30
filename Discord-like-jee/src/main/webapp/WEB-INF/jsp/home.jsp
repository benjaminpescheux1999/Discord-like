<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
	</head>
	<body>
		<h1>Hello ${ utilisateur } and ${ password }</h1>
		<c:forEach items="${utilisateurs}" var="utilisateur">
		<li>${utilisateur }
		</li>
		</c:forEach>
	</body>
</html>