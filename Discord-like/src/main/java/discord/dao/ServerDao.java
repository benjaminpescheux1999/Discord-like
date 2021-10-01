package discord.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import discord.model.ServerModel;

@Repository
public class ServerDao implements IServerDao{

	@PersistenceContext
	private EntityManager em;

	public List<ServerModel> findAll() {
		// TODO Auto-generated method stub
		return this.em.createQuery("select s from ServerModel s",ServerModel.class)
				.getResultList();
	}

	public ServerModel findById(Integer id) {
		// TODO Auto-generated method stub
		return this.em.createQuery("select s from ServerModel s where s.id = ?1",ServerModel.class)
				.setParameter(1, id)
				.getSingleResult();
	}

	public ServerModel save(ServerModel entity) {
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
	
	

}
