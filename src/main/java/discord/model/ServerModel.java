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

    public ServerModel( String nom, String prenom, List<UserModel> listuser, List<MsgModel> listmessage) {
       
    	this.nom = nom;
        this.listuser = listuser;
        this.listmessage = listmessage;
    }
// Nom
    public void setNom(String nom) {
        this.nom=nom;
    }

    public String getNom() {
        return this.nom;
    }
// Id 
    public int getId() {
        return this.id;
    }

    public List<UserModel> getUsers(){
    	return this.listuser;
    }
    
    public List<MsgModel> getMessages(){
    	return this.listmessage;
    }
}
