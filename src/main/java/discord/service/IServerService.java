package discord.service;

import discord.model.ServerModel;
import discord.model.UserModel;

public interface IServerService {
	public ServerModel findServer(int id);
	
	public void deleteServer(int id);
	
	public void saveServer(ServerModel server);
	
	public void addUser(UserModel user);

}
