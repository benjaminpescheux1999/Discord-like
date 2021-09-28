package discord.model;

public class MsgModel {
	
	private int id;
	private String msg;
	private Boolean state;
	private int emetteur;
	private int destinataire;
	private long date;
 
	
// Constructeur
	public MsgModel() {
        this.state=false;
        this.date=System.currentTimeMillis();
    }

    public MsgModel( String Msg, Boolean State, int Emetteur, int Destinataire) {
		
        this.msg = Msg;
        this.state=false;
        this.emetteur =Emetteur;
        this.destinataire=Destinataire;
        this.date=System.currentTimeMillis();
    }
// Message
    public void setMsg(String msg) {
        this.msg=msg;
    }

    public String getMsg() {
        return this.msg;
    }
// State
    public void setState(Boolean state) {
        this.state=state;
    }

    public Boolean getState() {
        return this.state;
    }
// Id 
    public int getId() {
        return this.id;
    }
// Emetteur
    public void setEmetteur(int emetteur) {
        this.emetteur=emetteur;
    }

    public int getEmetteur() {
        return this.emetteur;
    }  
// Destinataire
    public void setDestinataire(int destinataire) {
        this.destinataire=destinataire;
    }

    public int getDestinataire() {
        return this.destinataire;
    }
 // Date
    public void setDate(long date) {
        this.date=date;
    }
    public long getDate() {
        return this.date;
    }   
}
