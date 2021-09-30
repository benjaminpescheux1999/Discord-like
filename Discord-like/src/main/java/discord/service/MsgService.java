package discord.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import discord.dao.IMsgDao;
import discord.model.MsgModel;

@Service
public class MsgService implements IMsgService{
	@Autowired // On demande à SPRING (injection de dépendence) l'instance
	private IMsgDao daoMsg;

	public MsgModel findMsg(int id) {
		// TODO Auto-generated method stub
		return daoMsg.findById(id);
	}

	public List<MsgModel> getAllMessage() {
		// TODO Auto-generated method stub
		return daoMsg.findAll();
	}

	public void deleteMsg(int id) {
		// TODO Auto-generated method stub
		daoMsg.deleteById(id);
	}


	public void saveMsg(MsgModel message) {
		// TODO Auto-generated method stub
		daoMsg.save(message);
	}


}
