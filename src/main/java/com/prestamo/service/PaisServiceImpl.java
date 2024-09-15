package com.prestamo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prestamo.entity.Pais;
import com.prestamo.repository.PaisRepository;

@Service
public class PaisServiceImpl implements PaisService{
	
	@Autowired
	PaisRepository paisRepository;

	@Override
	public List<Pais> listaPais() {
		return paisRepository.findAll();
	}

}
