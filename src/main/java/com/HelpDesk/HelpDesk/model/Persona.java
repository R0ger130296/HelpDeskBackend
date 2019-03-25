package com.HelpDesk.HelpDesk.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona implements Serializable {

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 5965917213360769857L;

	@Id
	@Column(name="PER_CODIGO")
	private Long id;

	@Column(name = "PER_CEDULA")
	public String cedula;
	
	@Column(name = "PER_APELLIDO")
	public String apellido;
	
	@Column(name = "PER_NOMBRE")
	public String nombre;
	
	@Column(name = "PER_DIRECCION")
	public String direccion;
	
	@Column(name = "PER_CELULAR")
	public String celular;

	@Column(name = "PER_TELEFONO")
	public String telefono;

	@Column(name = "PER_CORREO")
	public String correoPersonal;

	@Column(name = "PER_PASSWORD")
	public String password;


	@Column(name = "PER_CORREOA")
	public String correoEspe ;

	@Column(name = "ETN_CODIGO")
	public String etniaCodigo;
	

	@ManyToOne
	@JoinColumn(name="GEN_CODIGO")
	private Genero genero;

	@ManyToOne
	@JoinColumn(name="TIE_CODIGO")
	private Estudiante estudiante;


	/**
	 * @return the estudiante
	 */
	public Estudiante getEstudiante() {
		return estudiante;
	}


	/**
	 * @param estudiante the estudiante to set
	 */
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}


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
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}


	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}


	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
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
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}


	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	/**
	 * @return the celular
	 */
	public String getCelular() {
		return celular;
	}


	/**
	 * @param celular the celular to set
	 */
	public void setCelular(String celular) {
		this.celular = celular;
	}


	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}


	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	/**
	 * @return the correoPersonal
	 */
	public String getCorreoPersonal() {
		return correoPersonal;
	}


	/**
	 * @param correoPersonal the correoPersonal to set
	 */
	public void setCorreoPersonal(String correoPersonal) {
		this.correoPersonal = correoPersonal;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @return the correoEspe
	 */
	public String getCorreoEspe() {
		return correoEspe;
	}


	/**
	 * @param correoEspe the correoEspe to set
	 */
	public void setCorreoEspe(String correoEspe) {
		this.correoEspe = correoEspe;
	}


	/**
	 * @return the etniaCodigo
	 */
	public String getEtniaCodigo() {
		return etniaCodigo;
	}


	/**
	 * @param etniaCodigo the etniaCodigo to set
	 */
	public void setEtniaCodigo(String etniaCodigo) {
		this.etniaCodigo = etniaCodigo;
	}


	/**
	 * @return the genero
	 */
	public Genero getGenero() {
		return genero;
	}


	/**
	 * @param genero the genero to set
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}


}
