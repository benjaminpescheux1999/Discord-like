package discord.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import discord.dao.IMsgDao;
import discord.model.MsgModel;

@Service
public class MsgService implements IMsgService{
	@Autowired // On demande à SPRING (injection de dépendence) l'instance
	private IMsgDao daoMsg;

	public MsgModel findMsg(int id) {
		// TODO Auto-generated method stub
		return daoMsg.findMsg(id);
	}

	public List<MsgModel> getAllMessage(int id) {
		// TODO Auto-generated method stub
		return daoMsg.getAllMessage(id);
	}

	public void deleteMsg(int id) {
		// TODO Auto-generated method stub
		daoMsg.deleteMsg(id);
	}

	public void editMsg(int id, String text) {
		// TODO Auto-generated method stub
		daoMsg.editMsg(id,text);
	}

	public void saveMsg(MsgModel message) {
		// TODO Auto-generated method stub
		daoMsg.saveMsg(message);
	}

}
