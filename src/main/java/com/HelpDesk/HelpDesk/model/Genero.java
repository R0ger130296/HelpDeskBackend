package com.HelpDesk.HelpDesk.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "genero")
public class Genero implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2328952476335064820L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="GEN_CODIGO")
	private Long id;
	
	@Column(name = "GEN_NOMBRE")
	public String nombre;
	
	@Column(name = "GEN_BANNER")
	public String inicialGenero;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the inicialGenero
	 */
	public String getInicialGenero() {
		return inicialGenero;
	}

	/**
	 * @param inicialGenero the inicialGenero to set
	 */
	public void setInicialGenero(String inicialGenero) {
		this.inicialGenero = inicialGenero;
	}

	
}
