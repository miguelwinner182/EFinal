package com.mcuba.proyectoIntegral.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mcuba.proyectoIntegral.models.entity.Categoria;
import com.mcuba.proyectoIntegral.models.service.ICategoriaService;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {
	//Creando instancia de iCategoriaService
	@Autowired
	private ICategoriaService categoriaService;


	@RequestMapping("/")
	public String inicio(Model model) {
		Categoria categoria = new Categoria();
		model.addAttribute("categoria",categoria);
		model.addAttribute("listaCategorias",categoriaService.getAllCategorias());
		return "categoria/index";
	}
	@RequestMapping(value="/form", method=RequestMethod.POST)
	public String guardar(@Valid Categoria categoria){
		categoriaService.guardar(categoria);
		return "redirect:/categoria/";
	}
	@RequestMapping("/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id")Long id) {
		categoriaService.eliminarCategoria(id);
		return "redirect:/categoria/";
	}
}
