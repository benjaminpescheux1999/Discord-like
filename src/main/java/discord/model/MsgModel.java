package discord.model;

import java.sql.Date;

public class MsgModel {
	
	private static int Id = 0;
	private String Msg;
	private Boolean State;
	private int Emetteur;
	private int Destinataire;
	private long Date;
 
	
// Constructeur
	public MsgModel() {
        Id++;
        this.State=false;
        this.Date=System.currentTimeMillis();
    }

    public MsgModel(String Msg, Boolean State, int Emetteur, int Destinataire) {
        Id++;
        this.Msg = Msg;
        this.State=false;
        this.Emetteur =Emetteur;
        this.Destinataire=Destinataire;
        this.Date=System.currentTimeMillis();
    }
// Message
    public void setMsg(String Msg) {
        this.Msg=Msg;
    }

    public String getMsg() {
        return this.Msg;
    }
// State
    public void setState(Boolean State) {
        this.State=State;
    }

    public Boolean getState() {
        return this.State;
    }
// Id 
    public int getId() {
        return this.Id;
    }
// Emetteur
    public void setEmetteur(int Emetteur) {
        this.Emetteur=Emetteur;
    }

    public int getEmetteur() {
        return this.Emetteur;
    }  
// Destinataire
    public void setDestinataire(int Destinataire) {
        this.Destinataire=Destinataire;
    }

    public int getDestinataire() {
        return this.Destinataire;
    }
 // Date
    public void setDate(long Date) {
        this.Date=Date;
    }
    public long getDate() {
        return this.Date;
    }  
}
