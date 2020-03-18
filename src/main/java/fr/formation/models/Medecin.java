package fr.formation.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity                              
public class Medecin {
               
	private long idMedecin;
	private String nom;
	private String prenom; 
	private Hopital hopital;
	
	public Medecin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medecin( String nom, String prenom, Hopital hopital) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.hopital = hopital;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)               
	public long getIdMedecin() {           
		return idMedecin;
	}

	public void setIdMedecin(long idMedecin) {
		this.idMedecin = idMedecin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSpécialité() {
		return prenom;
	}

	public void setSpécialité(String prenom) {
		this.prenom = prenom;
	}
	@ManyToOne
	@JoinColumn(name="idHopital")
	public Hopital getHopital() {
		return hopital;
	}

	public void setHopital(Hopital hopital) {
		this.hopital = hopital;
	}

	@Override
	public String toString() {
		return "Medecin [idMedecin=" + idMedecin + ", nom=" + nom + ", prenom=" + prenom + ", hopital="
				+ hopital + "]";
	}

	

	
	
	
}
 