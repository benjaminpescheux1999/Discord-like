package discord.dao;

import discord.model.UserModel;

public interface IUserDao {
	public UserModel findById(int id);

}
