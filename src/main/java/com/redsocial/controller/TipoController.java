package com.redsocial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redsocial.entity.Tipo;
import com.redsocial.service.TipoService;

@RestController
@RequestMapping("/api/rest/tipolibro")
public class TipoController {
	@Autowired
    private TipoService service;
	
	@GetMapping
	public ResponseEntity<List<Tipo>> lista(){
		return ResponseEntity.ok(service.listaTipo());
	}
}
