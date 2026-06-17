package com.sedena.app.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.sedena.app.daos.IMicroserviceDAO;
import com.sedena.app.entities.Adopter;

@Service
public class ServiceImpl implements IService {
	
	private IMicroserviceDAO dao;

	public ServiceImpl(IMicroserviceDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean insert(Adopter a) {
		if(a.getId()==0){
			return dao.save(a)!=null;
		}
		return false;
	}

	@Override
	public Adopter findById(long id) {
		
		return this.dao.findById(id).orElseThrow();
	}

	@Override
	public Adopter findByEmail(String email) {
		
		return this.dao.searchByEmail(email).orElseThrow();
	}

	@Override
	public List<Adopter> findByLastName(String lastName) {
		
		return this.dao.searchByLastName(lastName);
	}

	@Override
	public boolean update(Adopter a) {
		if(dao.existsById(a.getId())) {
			return this.dao.save(a)!=null;
		}
		
	    throw new NoSuchElementException();
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
	public List<Adopter> findAll() {
		
		return (List<Adopter>) dao.findAll();
	}
	
	
	
	

}
