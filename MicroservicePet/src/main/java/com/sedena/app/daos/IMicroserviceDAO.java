package com.sedena.app.daos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sedena.app.entities.AdoptionStatus;
import com.sedena.app.entities.Pet;

public interface IMicroserviceDAO extends CrudRepository<Pet,Long> {
	
	@Query("SELECT p FROM Pet p WHERE p.specie = :specie")
	List<Pet> searchBySpecie(@Param("specie") String specie);
	
	@Query("SELECT p FROM Pet p WHERE p.adoptionStatus = :status")
	List<Pet> searchByAdoptionStatus(@Param("status") AdoptionStatus status);

}
