package com.mcuba.proyectoIntegral.models.service;

import java.util.List;

import com.mcuba.proyectoIntegral.models.entity.Producto;

public interface IProductoService {
	public void guardarProducto(Producto producto);
	public List<Producto> listarProductos();
}
