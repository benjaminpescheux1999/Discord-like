package discord.model;

import java.util.ArrayList;
import java.util.List;

public class ServerModel {

	private static int Id = 0;
	private String Nom;
	private List<UserModel> ListUser=new ArrayList<UserModel>();
	private List<MsgModel> ListMessage=new ArrayList<MsgModel>();
	
// Constructeur
	public ServerModel() {
        Id++;
    }

    public ServerModel(String Nom, String Prenom, List<UserModel> ListUser, List<MsgModel> ListMessage) {
        Id++;
        this.Nom = Nom;
        this.ListUser = ListUser;
        this.ListMessage = ListMessage;
    }
// Nom
    public void setNom(String Nom) {
        this.Nom=Nom;
    }

    public String getNom() {
        return this.Nom;
    }
// Id 
    public int getId() {
        return this.Id;
    }

    public List<UserModel> getUsers(){
    	return this.ListUser;
    }
    
    public List<MsgModel> getMessages(){
    	return this.ListMessage;
    }
}
