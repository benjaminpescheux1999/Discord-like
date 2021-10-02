package discord.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import discord.dao.IUserDao;
import discord.model.ServerModel;
import discord.model.UserModel;


@Service
public class UserService implements IUserService{
	@Autowired // On demande à SPRING (injection de dépendence) l'instance
	private IUserDao daoUser;

	@Override
	public List<UserModel> findAllUser() {
		// TODO Auto-generated method stub
		return daoUser.findAll();
	}
	public UserModel findUser(int id) {
		// TODO Auto-generated method stub
		return daoUser.findById(id);
	}

	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		daoUser.deleteById(id);
	}

	public void saveUser(UserModel user) {
		// TODO Auto-generated method stub
		daoUser.save(user);
	}

	public UserModel login(String nom, String password) {
		// TODO Auto-generated method stub
		return daoUser.login(nom, password);
	}

}
