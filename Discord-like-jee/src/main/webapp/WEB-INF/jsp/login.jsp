<!DOCTYPE html>
<html xmls:th="http://thymeleaf.org">
	<head>
	</head>
	<body>
		<h1>Connexion</h1>
		
		<form method = "POST">
			<div>
				<label>Nom d'utilisateur</label>
				<input type="text" name="username">
			</div>
	         <br />
	         <div>
		         <label>Mot de passe</label>
		         <input type="text" name="password" />
	         </div>
	         <div>
	         <input type="submit" value="Se connecter" />
	         </div>
      	</form>
	</body>
</html>