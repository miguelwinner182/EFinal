package com.mcuba.proyectoIntegral.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcuba.proyectoIntegral.models.dao.ICategoriaDAO;
import com.mcuba.proyectoIntegral.models.entity.Categoria;

@Service
public class CategoriaServiceImpl implements ICategoriaService{

	@Autowired
	private ICategoriaDAO categoriaDAO;
	@Override
	public void guardar(Categoria categoria) {
		// TODO Auto-generated method stub
		categoriaDAO.save(categoria);
	}
	@Override
	public List<Categoria> getAllCategorias() {
		return (List<Categoria>)categoriaDAO.findAll();
	}
	@Override
	public void eliminarCategoria(Long id) {
		categoriaDAO.deleteById(id);
		
	}

}
