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
	@Qualifier("MsgDao")
	private IMsgDao daoMsg;

	public MsgModel FindMsg(int id) {
		// TODO Auto-generated method stub
		return daoMsg.FindMsg(id);
	}

	public List<MsgModel> GetAllMessage(int id) {
		// TODO Auto-generated method stub
		return daoMsg.GetAllMessage(id);
	}

	public void DeleteMsg(int id) {
		// TODO Auto-generated method stub
		daoMsg.DeleteMsg(id);
	}

	public void EditMsg(int id, String text) {
		// TODO Auto-generated method stub
		daoMsg.EditMsg(id,text);
	}

	public void SaveMsg(MsgModel message) {
		// TODO Auto-generated method stub
		daoMsg.SaveMsg(message);
	}

}
