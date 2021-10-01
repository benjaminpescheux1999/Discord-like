package discord.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import discord.dao.IServerDao;
import discord.model.ServerModel;

@Service
public class ServerService implements IServerService{
	@Autowired // On demand à SPRING (injection dependence) l'instance
	private IServerDao daoServer;

	public ServerModel findServer(int id) {
		// TODO Auto-generated method stub
		return daoServer.findById(id);
	}

	public void deleteServer(int id) {
		// TODO Auto-generated method stub
		daoServer.deleteById(id);
	}

	public void saveServer(ServerModel server) {
		// TODO Auto-generated method stub
		daoServer.save(server);
	}

	public List<ServerModel> getAllServer() {
		// TODO Auto-generated method stub
		return daoServer.findAll();
	}

	@Override
	public List<ServerModel> findAll() {
		// TODO Auto-generated method stub
		return daoServer.findAll();
	}

}