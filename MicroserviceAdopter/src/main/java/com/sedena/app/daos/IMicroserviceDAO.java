package com.sedena.app.daos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sedena.app.entities.Adopter;

public interface IMicroserviceDAO extends CrudRepository<Adopter, Long> {
	
	@Query("SELECT u FROM Adopter u WHERE u.email=:email")
	Optional<Adopter> searchByEmail(@Param("email") String email);
	
	
	@Query("SELECT u FROM Adopter u WHERE u.lastName=:lastName")
	List<Adopter> searchByLastName(@Param("lastName") String lastName);

}
