package discord.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import discord.dao.IUserDao;
import discord.model.UserModel;


@Service
public class UserService implements IUserService{
	@Autowired // On demande à SPRING (injection de dépendence) l'instance
	private IUserDao daoUser;

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
