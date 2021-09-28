package discord.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity //Classe persiste
@Table(name = "server")
public class ServerModel {
	@Id //attribut clé primaire
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Auto increment
	@Column(name = "Server_ID")
	private int id = 0;
	
	@Column(name = "Server_Nom", length = 100, nullable = false)
	private String nom;

	
	@ManyToMany(mappedBy = "server")
	private List<UserModel> users;
	
	@OneToMany(mappedBy = "server")
	private List<UserModel> messages;

	
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
