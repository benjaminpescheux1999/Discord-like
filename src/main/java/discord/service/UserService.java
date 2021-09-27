package discord.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import discord.dao.IUserDao;
import discord.model.UserModel;


@Service
public class UserService implements IUserService{
	@Autowired // On demande à SPRING (injection de dépendence) l'instance
	@Qualifier("UserDao")
	private IUserDao daoUser;

	public UserModel FindUser(int id) {
		// TODO Auto-generated method stub
		return daoUser.FindUser(id);
	}

	public void DeleteUser(int id) {
		// TODO Auto-generated method stub
		daoUser.DeleteUser(id);
	}

	public void SaveUser(UserModel user) {
		// TODO Auto-generated method stub
		daoUser.SaveUser(user);
	}

	public void EditUser(int id, String Nom, String Prenom) {
		// TODO Auto-generated method stub
		daoUser.EditUser(id, Nom, Prenom);
	}

}
