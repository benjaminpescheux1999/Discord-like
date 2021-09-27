package discord.service;

import java.util.List;

import discord.model.MsgModel;

public interface IMsgService {
	public MsgModel findMsg(int id);
	
	public List<MsgModel> getAllMessage(int id);
	
	public void deleteMsg(int id);
	
	public void editMsg(int id, String text);
	
	public void saveMsg(MsgModel message);

}
