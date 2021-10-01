package discord.dao;

import discord.model.UserModel;

public interface IUserDao extends IDao<UserModel,Integer>{

	public UserModel login(String nom, String password);
	public UserModel findByMail(String mail);
}
