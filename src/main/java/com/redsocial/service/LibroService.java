package com.redsocial.service;
import java.util.List;
import com.redsocial.entity.Libro;
public interface LibroService {

	public  abstract List<Libro> listaLibro();
	public abstract Libro insertaLibro(Libro obj);
}
