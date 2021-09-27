package discord.service;

import discord.model.UserModel;

public interface IUserService {
	public UserModel FindUser(int id);

	public void DeleteUser(int id);
	
	public void EditUser(int id, String Nom, String Prenom);
	
	public void SaveUser(UserModel user);
}