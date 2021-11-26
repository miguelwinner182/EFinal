package com.mcuba.proyectoIntegral.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mcuba.proyectoIntegral.models.entity.Producto;
import com.mcuba.proyectoIntegral.models.service.ICategoriaService;
import com.mcuba.proyectoIntegral.models.service.IProductoService;

@Controller
@RequestMapping("/producto")
public class ProductoController {
	@Autowired	
	private ICategoriaService categoriaService;
	@Autowired
	private IProductoService productoService;
		@RequestMapping("/")
		public String inicio(Model model) {
			Producto producto = new Producto();
			model.addAttribute("producto",producto);
			model.addAttribute("listaCategorias",categoriaService.getAllCategorias());
			model.addAttribute("listaProductos", productoService.listarProductos());
			
			return"producto/index";
		}
		@RequestMapping(value ="/form", method = RequestMethod.POST)
		public String guardar(Producto producto) {
			productoService.guardarProducto(producto);
			return "redirect:/producto/";
		}
		
}
