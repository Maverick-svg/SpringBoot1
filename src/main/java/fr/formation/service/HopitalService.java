package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.models.Hopital;

import fr.formation.repository.IHopitalRepository; 


@Service
public class HopitalService implements IHopitalService{

	@Autowired
	IHopitalRepository hopitalRepository;
	
	@Override
	public List<Hopital> getAllHopital() {
		return hopitalRepository.findAll();
	}

	@Override
	public int addHopital(Hopital hopital) {
		 hopitalRepository.save(hopital);
		return 1;
	}

	@Override
	public Boolean deletHopital(long id) {
		try {
		hopitalRepository.deleteById(id);
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	@Override
	public Hopital getHopitalById(long id) {
		Optional<Hopital> opHop = hopitalRepository.findById(id);
		Hopital HopFind = new Hopital();
		//permet de gére les execption 
		if(opHop.isPresent()) {
			HopFind= opHop.get();
		}return HopFind;
	}
	

}
