package discord.service;

import discord.model.ServerModel;

public interface IServerService {
    public ServerModel findById(int id);

}
