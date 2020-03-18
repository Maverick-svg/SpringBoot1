package fr.formation.service;

import java.util.List;


import fr.formation.models.Patient;

public interface IPatientService {

public List<Patient> getAllPatient();
	
	public int addPatient(Patient patient);
	
	public int deletPatient(Patient patient);
	
	public Patient gePatientById(long id);
	
}
