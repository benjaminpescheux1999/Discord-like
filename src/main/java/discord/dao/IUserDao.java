package discord.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import discord.model.UserModel;

public interface IUserDao extends IDao<UserModel,Integer>{

	public UserModel login(String nom, String password);
	
	
		

	
}
