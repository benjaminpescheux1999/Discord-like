package discord.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import discord.model.MsgModel;

@Repository
public class MsgDao implements IMsgDao {

	public MsgModel FindMsg(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<MsgModel> GetAllMessage(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void DeleteMsg(int id) {
		// TODO Auto-generated method stub
		
	}

	public void EditMsg(int id, String text) {
		// TODO Auto-generated method stub
		
	}

	public void SaveMsg(MsgModel message) {
		// TODO Auto-generated method stub
		
	}

}
