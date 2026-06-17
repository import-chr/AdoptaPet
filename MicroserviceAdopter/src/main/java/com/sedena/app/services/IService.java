package com.sedena.app.services;

import java.util.List;

import com.sedena.app.entities.Adopter;

/*
 * 1. Registrar un adoptante.
2. Consultar todos los adoptantes.
3. Buscar adoptante por id.
4. Buscar adoptante por email.
5. Buscar adoptantes por apellido.
6. Actualizar información de un adoptante.
7. Eliminar un adoptante por id.
*/
public interface IService {
	boolean insert(Adopter a);
	Adopter findById(long id);
	Adopter findByEmail(String email);
	List<Adopter> findByLastName(String lastName);
	boolean update(Adopter a);
	boolean deleteById(long id);
	List<Adopter> findAll();
	

}
