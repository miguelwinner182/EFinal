package com.mcuba.proyectoIntegral.models.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name ="productos")

public class Producto implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id_productos")
	private Long id;
	
	@Column(name ="pro_nombre")
	private String nombre;
	
	@Column(name ="pro_precio")
	private Float precio;
	
	
	@Column(name ="pro_fecha_registro")
	@Temporal(TemporalType.DATE)
	private Date fecha_registro = new Date(System.currentTimeMillis());
	
	
	
	//Relacion
	@ManyToOne
	@JoinColumn(name = "cat_id")
	Categoria categoria;
	
	
	@PrePersist
	@PreUpdate
	public void prePersistencia(){
		fecha_registro= new Date();
	}
	

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

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	
	
}
