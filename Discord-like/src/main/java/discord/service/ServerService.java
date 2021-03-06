package discord.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import discord.dao.IServerDao;
import discord.model.ServerModel;

@Service
public class ServerService implements IServerService{
	@Autowired // On demand ? SPRING (injection dependence) l'instance
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
		this.daoServer.save(server);
	}

	@Override
	public List<ServerModel> findAllServer() {
		// TODO Auto-generated method stub
		return daoServer.findAll();
	}

}