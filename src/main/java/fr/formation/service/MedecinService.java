package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.models.Medecin;
import fr.formation.repository.IMedecinRepository;

@Service
public class MedecinService implements IMedecinService{

	@Autowired
	IMedecinRepository medecinRepository;

	@Override
	public List<Medecin> getAllMedecin() {
		return medecinRepository.findAll();
	}

	@Override
	public int addMedecin(Medecin medecin) {
		medecinRepository.save(medecin);
		return 1;
	}

	@Override
	public int deletMedecin(Medecin medecin) {
		medecinRepository.delete(medecin);
		return 1;
	}

	//optional permet d'eviter les erreur si aucun medecin n'est trouvé
	//on place le resultats du optional dans un objet de typ emedin qui est ensuit retourné
	@Override
	public Medecin getMedecinById(long id) {
		Optional<Medecin> opMed = medecinRepository.findById(id);
		Medecin medFind = new Medecin();
		//permet de gére les execption 
		if(opMed.isPresent()) {
			medFind= opMed.get();
		}return medFind;
	}

	
	
	
	
}
