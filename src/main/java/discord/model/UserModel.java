package discord.model;

public class UserModel {

	private int id;
	private String nom;
	private String prenom;
	private String password;
	
// Constructeur
	public UserModel() {
    }

    public UserModel(int id, String nom, String prenom, String password) {
    	this.id=id;
        this.nom = nom;
        this.prenom = prenom;
        this.password=password;
    }
// Nom
    public void setnom(String nom) {
        this.nom=nom;
    }

    public String getnom() {
        return this.nom;
    }
// Prenom
    public void setprenom(String prenom) {
        this.prenom=prenom;
    }

    public String getprenom() {
        return this.prenom;
    }
// Id 
    public int getid() {
        return this.id;
    }
    // Password
    public void setpassword(String password) {
        this.password=password;
    }
    public String getpassword() {
        return this.password;
    } 
}
