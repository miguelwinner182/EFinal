package com.mcuba.proyectoIntegral.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcuba.proyectoIntegral.models.dao.IProductoDAO;
import com.mcuba.proyectoIntegral.models.entity.Producto;

@Service
public class ProductoServiceImpl implements IProductoService{
	@Autowired
	private IProductoDAO productoDAO;
	
	@Override
	public void guardarProducto(Producto producto) {
		productoDAO.save(producto);
	}

	@Override
	public List<Producto> listarProductos() {
		return productoDAO.findAllByOrderByNombreAsc();
		//return productoDAO.findByNombreLike("%Ayudin");
	}
	
	

}
