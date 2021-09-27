package discord.service;

import java.util.List;

import discord.model.MsgModel;

public interface IMsgService {
	public MsgModel FindMsg(int id);
	
	public List<MsgModel> GetAllMessage(int id);
	
	public void DeleteMsg(int id);
	
	public void EditMsg(int id, String text);
	
	public void SaveMsg(MsgModel message);

}
