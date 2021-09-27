package discord.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import discord.dao.IServerDao;
import discord.model.ServerModel;
import discord.model.UserModel;

@Service
public class ServerService implements IServerService{
	@Autowired // On demande à SPRING (injection de dépendence) l'instance
	private IServerDao daoServer;

	public ServerModel findServer(int id) {
		// TODO Auto-generated method stub
		return daoServer.findServer(id);
	}

	public void deleteServer(int id) {
		// TODO Auto-generated method stub
		daoServer.deleteServer(id);
	}

	public void saveServer(ServerModel server) {
		// TODO Auto-generated method stub
		daoServer.saveServer(server);
	}

	public void addUser(UserModel user) {
		// TODO Auto-generated method stub
		daoServer.addUser(user);
	}

}