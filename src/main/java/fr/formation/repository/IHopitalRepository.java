package fr.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.models.Hopital;

//nom de la classe et type de l'id ==> creation des crud 
public interface IHopitalRepository extends JpaRepository<Hopital, Long>{

}
