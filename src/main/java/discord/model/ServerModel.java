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
	@Id //attribut clé primaire
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Auto increment
	@Column(name = "SERVER_ID")
	private int id = 0;
	
	@Column(name = "SERVER_NOM", length = 100, nullable = false)
	private String nom;

	
	@ManyToMany(mappedBy = "SERVER_USER")
	private List<UserModel> users;
	
	@OneToMany(mappedBy = "SERVER_MESSAGE")
	private List<MsgModel> messages;

	
// Constructeur
	public ServerModel() {
        
    }

    public ServerModel( String nom, String prenom, List<UserModel> users, List<MsgModel> messages) {
       
    	this.nom = nom;
        this.users = users;
        this.messages = messages;
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
    	return this.users;
    }
    
    public List<MsgModel> getMessages(){
    	return this.messages;
    }
}
