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

    public MsgModel(int id, String Msg, Boolean State, int Emetteur, int Destinataire) {
		this.id=id;
        this.msg = Msg;
        this.state=false;
        this.emetteur =Emetteur;
        this.destinataire=Destinataire;
        this.date=System.currentTimeMillis();
    }
// Message
    public void setmsg(String msg) {
        this.msg=msg;
    }

    public String getmsg() {
        return this.msg;
    }
// State
    public void setstate(Boolean state) {
        this.state=state;
    }

    public Boolean getstate() {
        return this.state;
    }
// Id 
    public int getid() {
        return this.id;
    }
// Emetteur
    public void setemetteur(int emetteur) {
        this.emetteur=emetteur;
    }

    public int getemetteur() {
        return this.emetteur;
    }  
// Destinataire
    public void setdestinataire(int destinataire) {
        this.destinataire=destinataire;
    }

    public int getdestinataire() {
        return this.destinataire;
    }
 // Date
    public void setdate(long date) {
        this.date=date;
    }
    public long getdate() {
        return this.date;
    }   
}
