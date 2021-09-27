package discord.dao;

import discord.model.ServerModel;
import discord.model.UserModel;

public interface IServerDao {

	public ServerModel findServer(int id);
	
	public void deleteServer(int id);
	
	public void saveServer(ServerModel server);
	
	public void addUser(UserModel user);

}
