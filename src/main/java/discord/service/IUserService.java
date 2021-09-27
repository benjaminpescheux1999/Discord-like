package discord.service;

import discord.model.UserModel;

public interface IUserService {
    public UserModel findById(int id);
}
