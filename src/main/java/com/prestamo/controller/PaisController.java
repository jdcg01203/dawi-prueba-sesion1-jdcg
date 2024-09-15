package com.prestamo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prestamo.entity.Pais;
import com.prestamo.service.PaisService;

@RestController
@RequestMapping("/pais")
public class PaisController {

	@Autowired
	private PaisService paisService;
	
	@GetMapping("/listar")
	public List<Pais> listarPaises() {
	    return paisService.listaPais();
	}

}
