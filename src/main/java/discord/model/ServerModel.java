package discord.model;

import java.util.ArrayList;
import java.util.List;

public class ServerModel {

	private int id = 0;
	private String nom;
	private List<UserModel> listuser=new ArrayList<UserModel>();
	private List<MsgModel> listmessage=new ArrayList<MsgModel>();
	
// Constructeur
	public ServerModel() {
        
    }

    public ServerModel(int id, String nom, String prenom, List<UserModel> listuser, List<MsgModel> listmessage) {
        this.id=id;
    	this.nom = nom;
        this.listuser = listuser;
        this.listmessage = listmessage;
    }
// Nom
    public void setnom(String nom) {
        this.nom=nom;
    }

    public String getnom() {
        return this.nom;
    }
// Id 
    public int getid() {
        return this.id;
    }

    public List<UserModel> getusers(){
    	return this.listuser;
    }
    
    public List<MsgModel> getmessages(){
    	return this.listmessage;
    }
}
