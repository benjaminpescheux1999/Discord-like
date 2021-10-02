package discord.service;

import java.util.List;

import discord.model.ServerModel;

public interface IServerService {
	
	public ServerModel findServer(int id);
	
	public void deleteServer(int id);
	
	public void saveServer(ServerModel server);

	public List<ServerModel> findAllServer();
	
}
