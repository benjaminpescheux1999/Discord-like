package discord.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import discord.dao.IUserDao;
import discord.model.UserModel;


@Service
public class UserService {
	@Autowired // On demande � SPRING (injection de d�pendence) l'instance
	@Qualifier("UserDao")
	private IUserDao daoUser;
    public UserModel findById(int id) {
//        IProduitDao daoProduit = Factory.createProduitDao();
		
        return daoUser.findById(id);
    }
}
