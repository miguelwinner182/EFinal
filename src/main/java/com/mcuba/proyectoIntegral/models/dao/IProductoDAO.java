package com.mcuba.proyectoIntegral.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mcuba.proyectoIntegral.models.entity.Producto;

public interface IProductoDAO extends CrudRepository<Producto, Long>{

	public List<Producto> findAllByOrderByNombreAsc();
	public List<Producto> findByNombreLike(String nom);
}
