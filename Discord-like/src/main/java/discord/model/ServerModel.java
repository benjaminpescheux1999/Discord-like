package discord.model;

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
	
	@Id //attribut cle primaire
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Auto increment
	@Column(name = "SERVER_ID")
	private int id = 0;
	
	@Column(name = "SERVER_NOM", length = 100, nullable = false)
	private String nom;
	
	@ManyToMany(mappedBy = "servers")
	private List<UserModel> users;
	
	@OneToMany(mappedBy = "destinataire")
	private List<MsgModel> messages;

// Constructeur

	public ServerModel( String nom) {
	       
    	this.nom = nom;
    }
	


	public ServerModel( String nom, List<UserModel> users, List<MsgModel> messages) {
       
    	this.nom = nom;
        this.users = users;
        this.messages = messages;
    }

//test
	public ServerModel(int id, String nom) {
		this.id=id;
		this.nom=nom;
	}
	public ServerModel() {
		
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
//List Users
    public List<UserModel> getUsers(){
    	return this.users;
    }
    
    public void setUsers(List<UserModel> users) {
		this.users = users;
	}
//List Messages
	public void setMessages(List<MsgModel> messages) {
		this.messages = messages;
	}
	
    public List<MsgModel> getMessages(){
    	return this.messages;
    }
}
