package fr.formation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.formation.models.Hopital;
import fr.formation.models.Medecin;
import fr.formation.models.Patient;
import fr.formation.service.HopitalService;
import fr.formation.service.IHopitalService;
import fr.formation.service.IMedecinService;
import fr.formation.service.IPatientService;

@SpringBootApplication
public class FirstSpringBootApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApplication.class, args);
	}
	@Autowired                  
	IHopitalService hopitalService;
	@Autowired
    IMedecinService medecinService;
	@Autowired
	IPatientService patientService;
	
	
	@Override
	public void run(String... args) throws Exception {
		
//			Ajouter Hopital			
//hopitalService.addHopital(new Hopital("santé", "Paris"));
		
//			liste des hopitaux		
//System.out.println(hopitalService.getAllHopital());
		
//			Trouve un hôpital par son id					
//System.out.println(hopitalService.getHopitalById(2));
		
//			Supprimer hopital		
//hopitalService.deletHopital(2);
		
//			Ajouter un medecin		
//Hopital op1 = new Hopital();
//op1 =	hopitalService.getHopitalById(3);		
//System.err.println(op1);
//Medecin md1 =new Medecin("Jean", "Bon", op1);
//System.err.println(md1);
//medecinService.addMedecin(md1);
		
//			liste des medecin			
//System.out.println(medecinService.getAllMedecin());
		
//			Trouve un medecin par son id			
//System.out.println(medecinService.getMedecinById(2));
		
//			ajouter un patient
//Medecin med1 = new Medecin();
//med1 =medecinService.getMedecinById(2);
//System.err.println(med1);
//Patient pat1 = new Patient("Sacha","red","pokemania",11, med1);
//System.err.println(pat1);
//patientService.addPatient(pat1);
				
//			lister les patients
//System.err.println(patientService.getAllPatient());
		
//			Trouve un patient par son id
//System.err.println(patientService.gePatientById(1));
	}

	
}
