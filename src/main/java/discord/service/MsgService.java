package discord.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import discord.dao.IMsgDao;
import discord.model.MsgModel;

@Service
public class MsgService {
	@Autowired // On demande à SPRING (injection de dépendence) l'instance
	@Qualifier("MsgDao")
	private IMsgDao daoMsg;
    public MsgModel findById(int id) {
//        IProduitDao daoProduit = Factory.createProduitDao();
		
        return daoMsg.findById(id);
    }
}
