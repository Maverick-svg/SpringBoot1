package fr.formation.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity 
@Table (name="tb_hopital")
//la table vas s'appleer tb-hopital sur mysql
public class Hopital {
	
	private long idHopital;
	private String nom;
	private String localisation;
	
	
	
	public Hopital() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Hopital(String nom, String localisation) {
		super();
		this.nom = nom;
		this.localisation = localisation;
	
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_hopital")
	public long getIdHopital() {
		return idHopital;
	}


	public void setIdHopital(long idHopital) {
		this.idHopital = idHopital;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getLocalisation() {
		return localisation;
	}


	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}





	@Override
	public String toString() {
		return "Hopital [idHopital=" + idHopital + ", nom=" + nom + ", localisation=" + localisation + 
				"]";}
	
}
	

