package discord.dao;

import discord.model.ServerModel;

public interface IServerDao {

	public ServerModel findById(int id);
}
