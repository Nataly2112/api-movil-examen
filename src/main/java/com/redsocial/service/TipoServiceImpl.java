package com.redsocial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entity.Tipo;
import com.redsocial.repository.TipoRepository;

@Service
public class TipoServiceImpl implements TipoService {

	@Autowired
	private TipoRepository repository;
	@Override
	public List<Tipo> listaTipo() {
		return repository.findAll();
	}

}
