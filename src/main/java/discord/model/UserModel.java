package discord.model;

public class UserModel {

	private int id;
	private String nom;
	private String prenom;
	private String password;
	
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
