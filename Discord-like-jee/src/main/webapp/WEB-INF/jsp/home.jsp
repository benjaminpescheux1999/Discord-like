<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous"/> 
</head>

<body>
<%-- 	<c:if test="${ server == null }">
		<h1>Ajouter un server</h1>
	</c:if> --%>
<div class="card text-center">
  <div class="card-header">
    Discord
  </div>
  <div class="card-body">
  	<div class="row">
		<div class="col-sm-2">
		    <div class="card">
		    	<a href="home/ajouterserver" class="btn btn-primary">Ajouter un serveur</a>
			    <div class="card-body">
			        <h5 class="card-title">Liste des serveurs</h5>
			        <table>
						<thead>
							<tr>
								<th>Nom</th>
								<th></th>
							</tr>
						</thead>
						
						<tbody>
							<c:forEach items="${ servers }" var="server">
								<tr>
									<td><a href="">${ server.getNom() }</a></td>
									<td>|</td>
									<td>
										<a href="home/modifierserver?id=${ server.id }&nom=${ server.nom }">Editer</a>
										<a href="home/supprimeserver?id=${ server.id }">Supprimer</a>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
   		<div class="col-sm-2">
   			<div class="card">
	    	  	<div class="card-body">
	    	   		<h5 class="card-title">Liste des utilisateurs</h5>
	    	   		<table>
						<thead>
							<tr>
								<th>Nom</th>
								<th>Prenom</th>
							</tr>
						</thead>
						
						<tbody>
							<c:forEach items="${ users }" var="user">
								<tr>
									<td><a href="">${ user.getNom() }</a></td>
									<td><a href="">${ user.getPrenom() }</a></td>
									
								</tr>
							</c:forEach>
						</tbody>
					</table>
	   		   	</div>
	  	 	 </div>
	 	</div>
	 	<div class="col-sm-8">
		    <div class="card">
			    <div class="card-body">
			        <h5 class="card-title">Liste des messages</h5>
			        <div class="modal-body">
				        <p>aperçu des messages</p>
				      </div>
			        <div class="input-group">
					    <textarea class="form-control custom-control" rows="3" style="resize:none"></textarea>     
					    <span class="input-group-addon btn btn-primary">Envoyer</span>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
 <div class="card-footer text-muted">
   Discord
 </div>

	
	
	
<%-- 	<c:if test="${ server != null }">
		<h1>Modifier le server</h1>
	</c:if>
	
	<form method="POST">
		<div>
			<label>Nom du server </label>
			<input type="text" name="libelle" value="${ server.name }" />
		</div>
		
		<div>
			<label>Message </label>
			<input type="number" step="0.1" name="prix" value="${ server.messages }" />
		</div>
		
		<div>
			<c:if test="${ server == null }">
				<input type="submit" value="Ajouter" />
			</c:if>
			
			
			<c:if test="${ server != null }">
				<input type="submit" value="Modifier" />
			</c:if>
		</div>
	</form> --%>
</body>
</html>