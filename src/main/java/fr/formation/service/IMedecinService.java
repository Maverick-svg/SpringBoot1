package fr.formation.service;

import java.util.List;
import fr.formation.models.Medecin;

public interface IMedecinService {

	
public List<Medecin> getAllMedecin();
	
	public int addMedecin(Medecin medecin);
	
	public int deletMedecin(Medecin medecin);
	
	public Medecin getMedecinById(long id);
	 
}
