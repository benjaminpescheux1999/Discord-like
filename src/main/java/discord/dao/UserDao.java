package discord.dao;

import org.springframework.stereotype.Repository;

import discord.model.UserModel;

@Repository
public class UserDao implements IUserDao{

	public UserModel findUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}

	public void editUser(int id, String nom, String prenom) {
		// TODO Auto-generated method stub
		
	}

	public void saveUser(UserModel user) {
		// TODO Auto-generated method stub
		
	}

	public UserModel login(String nom, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public void subscription(UserModel user) {
		// TODO Auto-generated method stub
		
	}

}
