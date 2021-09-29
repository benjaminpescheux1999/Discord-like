package discord.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import discord.model.MsgModel;

@Repository
public class MsgDao implements IMsgDao{

	@PersistenceContext
	private EntityManager em;
	
	public List<MsgModel> findAll() {
		// TODO Auto-generated method stub
		return this.em.createQuery("select m from Message",MsgModel.class)
				.getResultList();
	}

	public MsgModel findById(Integer id) {
		// TODO Auto-generated method stub
		return this.em.createQuery("select m from Message p where m.MSG_ID = :?1",MsgModel.class)
				.setParameter(1, id)
				.getSingleResult();
	}

	public MsgModel save(MsgModel entity) {
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
