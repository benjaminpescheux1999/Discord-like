package discord.model;

public class UserModel {

	private static int Id = 0;
	private String Nom;
	private String Prenom;
	
// Constructeur
	public UserModel() {
        Id++;
    }

    public UserModel(String Nom, String Prenom) {
        Id++;
        this.Nom = Nom;
        this.Prenom = Prenom;
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
        this.Prenom=Prenom;
    }

    public String getPrenom() {
        return this.Prenom;
    }
// Id 
    public int getId() {
        return this.Id;
    }
}
