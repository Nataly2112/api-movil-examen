package com.redsocial.entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;




@Entity
@Table(name="tipolibro")

public class Tipo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int idTipoLibro;
	private String nombre;
	private String estado;

	public int getIdTipoLibro() {
		return idTipoLibro;
	}
	public void setIdTipoLibro(int idTipoLibro) {
		this.idTipoLibro = idTipoLibro;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	

}
