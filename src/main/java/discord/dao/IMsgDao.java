package discord.dao;

import discord.model.MsgModel;

public interface IMsgDao {
	public MsgModel findById(int id);
}
