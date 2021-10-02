package discord.service;

import java.util.List;

import discord.model.UserModel;

public interface IUserService {

	public UserModel findUser(int id);

	public void deleteUser(int id);
		
	public void saveUser(UserModel user);
	
	public UserModel login(String nom, String password);

	public List<UserModel> findAllUser();
}