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
		return daoUser.findUser(id);
	}

	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		daoUser.deleteUser(id);
	}

	public void saveUser(UserModel user) {
		// TODO Auto-generated method stub
		daoUser.saveUser(user);
	}

	public void editUser(int id, String nom, String prenom) {
		// TODO Auto-generated method stub
		daoUser.editUser(id, nom, prenom);
	}

	public UserModel login(String nom, String password) {
		// TODO Auto-generated method stub
		return daoUser.login(nom, password);
	}

	public void subscription(UserModel user) {
		// TODO Auto-generated method stub
		daoUser.subscription(user);
	}

}
