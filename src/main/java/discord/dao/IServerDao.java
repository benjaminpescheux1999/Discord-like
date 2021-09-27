package discord.dao;

import discord.model.ServerModel;
import discord.model.UserModel;

public interface IServerDao {

	public ServerModel FindServer(int id);
	
	public void DeleteServer(int id);
	
	public void SaveServer(ServerModel server);
	
	public void AddUser(UserModel user);

}
