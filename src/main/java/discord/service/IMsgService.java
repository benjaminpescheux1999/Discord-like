package discord.service;

import discord.model.MsgModel;

public interface IMsgService {
    public MsgModel findById(int id);

}
