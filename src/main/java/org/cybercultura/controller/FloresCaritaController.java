package org.cybercultura.controller;

import java.util.ArrayList;
import java.util.List;

import org.cybercultura.model.Libro;
import org.cybercultura.repository.ILibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Controller
public class FloresCaritaController {

	@Autowired
	private ILibroRepository repo;
	
	ArrayList<Libro> librosarray ;
	
	@GetMapping("/listado")
	public String listadoLibros(@ModelAttribute Libro lib, Model model ) {
		model.addAttribute("lstLibro", repo.findAll());
		
		return "consulta-flores"; 
	}
	
	
	
	@PostMapping("/buscarxautor")
	public String buscarautor(@ModelAttribute Libro lib, Model model)
	{
		model.addAttribute("xautor", repo.findById(lib.getId_autor()));
		return "consulta-flores"; 
		
	}
	
	@PostMapping("/cargareliminar")
	public String cargareliminarPag(@ModelAttribute Libro lib, Model model ) {
		System.out.println(lib);
		
		model.addAttribute( "libros",repo.findById(lib.getCodigo()));
		
		return "mantenimiento-flores"; 
	}
	
	@PostMapping("/eliminar")
	public String eliminarPag(@ModelAttribute Libro lib, Model model ) {
		System.out.println(lib);
		
		model.addAttribute( "libros",repo.findById(lib.getCodigo()));
		repo.deleteById(lib.getCodigo());
		
		return "mantenimiento-flores"; 
	}

}
