package discord.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "message") //On nomme la table "message"
public class MsgModel {

    @Id //attribut clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MSG_ID")
	private int id;
    @Column(name = "MSG_TEXT", nullable = false)
	private String msg;
    @ManyToOne
    @JoinColumn(name = "MSG_USER_EMETTEUR")
	private UserModel emetteur;
    
    @ManyToOne
    @JoinColumn(name = "MSG_SERVER_DESTINATAIRE")
	private ServerModel destinataire;
    
    @Column(name = "MSG_DATE", nullable = false)
	private LocalDateTime date;
 
	@ManyToOne
    @JoinColumn(name = "Msg_Server_ID")
    private ServerModel messages;
	
// Constructeur
	public MsgModel() {
        this.date=date;
    }

    public MsgModel( String Msg, Boolean State, UserModel Emetteur, ServerModel Destinataire) {
		
        this.msg = Msg;
        this.emetteur =Emetteur;
        this.destinataire=Destinataire;
        this.date=date;
    }
// Message
    public void setMsg(String msg) {
        this.msg=msg;
    }

    public String getMsg() {
        return this.msg;
    }
// Id 
    public int getId() {
        return this.id;
    }
// Emetteur
    public void setEmetteur(UserModel emetteur) {
        this.emetteur=emetteur;
    }

    public UserModel getEmetteur() {
        return this.emetteur;
    }  
// Destinataire
    public void setDestinataire(ServerModel destinataire) {
        this.destinataire=destinataire;
    }

    public ServerModel getDestinataire() {
        return this.destinataire;
    }
 // Date
    public void setDate(LocalDateTime date) {
        this.date=date;
    }
    public LocalDateTime getDate() {
        return this.date;
    }   
}
