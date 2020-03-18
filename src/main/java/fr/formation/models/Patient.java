package fr.formation.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Patient {
	
	@Id
	@GeneratedValue
	private long idPatient;
	private String nom;
	private String prenom;
	private String maladie;
	private int age;
	@ManyToOne
	@JoinColumn (name="idMedecin")
	private Medecin medecin;
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Patient( String nom, String prenom, String maladie, int age, Medecin medecin) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.maladie = maladie;
		this.age = age;
		this.medecin=medecin;
	}


	public long getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(long idPatient) {
		this.idPatient = idPatient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMaladie() {
		return maladie;
	}

	public void setMaladie(String maladie) {
		this.maladie = maladie;
	}

	public Medecin getMedecin() {
		return medecin;
	}


	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}


	@Override
	public String toString() {
		return "patient [idPatient=" + idPatient + ", nom=" + nom + ", prenom=" + prenom + ", maladie=" + maladie +  "age=" +age +" medecin "+medecin+"]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	} 
	
	
}
