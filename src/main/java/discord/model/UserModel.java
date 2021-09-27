package discord.model;

public class UserModel {

	private static int Id = 0;
	private String Nom;
	private String prenom;
	
// Constructeur
	public UserModel() {
        Id++;
    }

    public UserModel(String Nom, String Prenom) {
        Id++;
        this.Nom = Nom;
        this.prenom = Prenom;
    }
// Nom
    public void setNom(String Nom) {
        this.Nom=Nom;
    }

    public String getNom() {
        return this.Nom;
    }
// Prenom
    public void setPrenom(String Prenom) {
        this.prenom=Prenom;
    }

    public String getPrenom() {
        return this.prenom;
    }
// Id 
    public int getId() {
        return this.Id;
    }
}
