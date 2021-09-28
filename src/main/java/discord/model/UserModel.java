package discord.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity //Classe persisté
@Table(name = "user") //On nomme la table "user"
public class UserModel {

	@Id //attribut clé primaire
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Auto increment
	@Column(name = "USER_ID")
	private int id;
	
	@Column(name = "USER_NOM", length = 50, nullable = false)
	private String nom;
	
	@Column(name = "USER_PRENOM", length = 50, nullable = false)
	private String prenom;
	
	@Column(name = "USER_PASSWORD", length = 50, nullable = false)
	private String password;
	
	@ManyToMany
	@JoinColumn(name = "User_Server_ID")
	private ServerModel users;
	
// Constructeur
	public UserModel() {
    }

    public UserModel( String nom, String prenom, String password) {
    	
        this.nom = nom;
        this.prenom = prenom;
        this.password=password;
    }
// Nom
    public void setNom(String nom) {
        this.nom=nom;
    }

    public String getNom() {
        return this.nom;
    }
// Prenom
    public void setPrenom(String prenom) {
        this.prenom=prenom;
    }

    public String getPrenom() {
        return this.prenom;
    }
// Id 
    public int getId() {
        return this.id;
    }
    // Password
    public void setPassword(String password) {
        this.password=password;
    }
    public String getPassword() {
        return this.password;
    } 
}
