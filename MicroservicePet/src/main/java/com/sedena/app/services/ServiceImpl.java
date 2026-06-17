package com.sedena.app.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.sedena.app.daos.IMicroserviceDAO;
import com.sedena.app.entities.AdoptionStatus;
import com.sedena.app.entities.Pet;

@Service
public class ServiceImpl implements IService {
	
	private IMicroserviceDAO dao;
	
	public ServiceImpl(IMicroserviceDAO dao) {
		this.dao=dao;
	}
	

	@Override
	public boolean insert(Pet p) {
		if(p.getId()==0) {
			Pet result=dao.save(p);
			return result!=null;
		}
		return false;
	}

	@Override
	public List<Pet> findAll() {
		return (List<Pet>)dao.findAll();
	}

	@Override
	public List<Pet> findBySpecie(String specie) {
		return dao.searchBySpecie(specie);
	}

	@Override
	public List<Pet> findByAdoptionStatus(AdoptionStatus status) {
		return dao.searchByAdoptionStatus(status);
	}

	@Override
	public boolean update(Pet p) {
		if(dao.existsById(p.getId())) {
			return dao.save(p)!=null;
			
		}
		throw new NoSuchElementException();
	}

	@Override
	public boolean udpateAdoptionStatus(long id, AdoptionStatus status) {
		Pet search=dao.findById(id).orElseThrow();
		search.setAdoptionStatus(status);
		return dao.save(search)!=null;
	}

	@Override
	public boolean deleteById(long id) {
		if(dao.existsById(id)) {
			dao.deleteById(id);
			return true;
		}
			
		throw new NoSuchElementException();
	}


	@Override
	public Pet findById(long id) {
		return dao.findById(id).orElseThrow();
	}

}
