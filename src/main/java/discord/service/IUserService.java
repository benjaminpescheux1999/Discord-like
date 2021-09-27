package discord.service;

import discord.model.UserModel;

public interface IUserService {

	public UserModel findUser(int id);

	public void deleteUser(int id);
	
	public void editUser(int id, String nom, String prenom);
	
	public void saveUser(UserModel user);
	
	public UserModel login(String nom, String password);
	
	public void subscription(UserModel user);
}