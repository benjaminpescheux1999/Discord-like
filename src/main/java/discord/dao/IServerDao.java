package discord.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import discord.model.ServerModel;
import discord.model.UserModel;

public interface IServerDao extends IDao<ServerModel,Integer>{

	

}
