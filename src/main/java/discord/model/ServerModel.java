package discord.model;

import java.util.ArrayList;
import java.util.List;

public class ServerModel {

	private static int Id = 0;
	private String Nom;
	private List<String> ListUser=new ArrayList<String>();
	private List<String> ListMessage=new ArrayList<String>();
	
// Constructeur
	public ServerModel() {
        Id++;
    }

    public ServerModel(String Nom, String Prenom, List<String> ListUser, List<String> ListMessage) {
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

    public List<String> getUsers(){
    	return this.ListUser;
    }
    
    public List<String> getMessages(){
    	return this.ListMessage;
    }
}
