package discord.service;

import java.util.List;

import discord.model.MsgModel;

public interface IMsgService {

	
	public MsgModel findMsg(int id);
	
	public List<MsgModel> getAllMessage();
	
	public void deleteMsg(int id);
		
	public void saveMsg(MsgModel message);
	

}
