package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.models.Patient;
import fr.formation.repository.IPatientRepository;

@Service
public class PatientService implements IPatientService{

	@Autowired
	IPatientRepository patientRepository;

	@Override
	public List<Patient> getAllPatient() {
		return patientRepository.findAll();
	}
	@Override
	public int addPatient(Patient patient) {
		patientRepository.save(patient);
		return 0;
	}

	@Override
	public int deletPatient(Patient patient) {
		patientRepository.delete(patient);
		return 0;
	}

	@Override
	public Patient gePatientById(long id) {
		Optional<Patient> opPat = patientRepository.findById(id);
		Patient patFind = new Patient();
		if(opPat.isPresent()) {
		patFind =opPat.get();
		}return patFind;
	}
	


}
