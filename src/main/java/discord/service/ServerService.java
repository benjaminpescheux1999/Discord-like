package discord.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import discord.dao.IServerDao;
import discord.model.ServerModel;

@Service
public class ServerService {
	@Autowired // On demande à SPRING (injection de dépendence) l'instance
	@Qualifier("ServerDao")
	private IServerDao daoServer;
    public ServerModel findById(int id) {
//        IProduitDao daoProduit = Factory.createProduitDao();
		
        return daoServer.findById(id);
}
}