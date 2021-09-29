package discord.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import discord.model.UserModel;

@Repository
public class UserDao implements IUserDao{

	@PersistenceContext
	private EntityManager em;
	
	public List<UserModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public UserModel findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserModel save(UserModel entity) {
		// TODO Auto-generated method stub
		if(entity.getId() > 0) {
			//Update
			entity = this.em.merge(entity);
		}
		else {
			//Insert
			this.em.persist(entity);
		}
		return null;
	}

	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		this.em.remove(this.findById(id));
	}

	public UserModel login(String nom, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public void subscription(UserModel user) {
		// TODO Auto-generated method stub
		
	}

}
