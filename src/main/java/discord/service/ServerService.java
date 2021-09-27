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
	@Qualifier("ServerDao")
	private IServerDao daoServer;

	public ServerModel FindServer(int id) {
		// TODO Auto-generated method stub
		return daoServer.FindServer(id);
	}

	public void DeleteServer(int id) {
		// TODO Auto-generated method stub
		daoServer.DeleteServer(id);
	}

	public void SaveServer(ServerModel server) {
		// TODO Auto-generated method stub
		daoServer.SaveServer(server);
	}

	public void AddUser(UserModel user) {
		// TODO Auto-generated method stub
		daoServer.AddUser(user);
	}

}