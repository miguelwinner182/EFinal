package com.mcuba.proyectoIntegral.models.service;

import java.util.List;

import com.mcuba.proyectoIntegral.models.entity.Categoria;

public interface ICategoriaService {
	//Metodo de guardar
	public void guardar(Categoria categoria);
	public List<Categoria> getAllCategorias();
	public void eliminarCategoria(Long id);

}
