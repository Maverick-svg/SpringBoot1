package fr.formation.service;

import java.util.List;

import fr.formation.models.Hopital;

public interface IHopitalService {

	public List<Hopital> getAllHopital();
	
	public int addHopital(Hopital hopital);
	
	public Boolean deletHopital(long id);
	
	public Hopital getHopitalById(long id);
}
