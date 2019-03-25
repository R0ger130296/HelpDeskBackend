package com.HelpDesk.HelpDesk.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cruge_user")
@Access(AccessType.FIELD)
public class CrugeUser {
	
	@Id
	@Column(name="iduser")
	private Long id;
	
	@Column(name="username")
	public String nombre;
	
	@Column(name="email")
	public String correoEspe;
	
	@Column(name="password")
	public String password;
	
	@Column(name="state")
	public Integer estado;
	
	@Column(name="totalsessioncounter")
	public Integer totalsessioncounter;
	
	@Column(name="currentsessioncounter")
	public String currentsessioncounter;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreoEspe() {
		return correoEspe;
	}

	public void setCorreoEspe(String correoEspe) {
		this.correoEspe = correoEspe;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Integer getTotalsessioncounter() {
		return totalsessioncounter;
	}

	public void setTotalsessioncounter(Integer totalsessioncounter) {
		this.totalsessioncounter = totalsessioncounter;
	}

	public String getCurrentsessioncounter() {
		return currentsessioncounter;
	}

	public void setCurrentsessioncounter(String currentsessioncounter) {
		this.currentsessioncounter = currentsessioncounter;
	}

	@Override
	public String toString() {
		return "CrugeUser [id=" + id + ", nombre=" + nombre + ", correoEspe=" + correoEspe + ", password=" + password
				+ ", estado=" + estado + ", totalsessioncounter=" + totalsessioncounter + ", currentsessioncounter="
				+ currentsessioncounter + "]";
	}
	
}
