package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String enviarFrom(Usuario usuario) {
		
		return "login";
	}
	
	@PostMapping("/validacion")
	public String procesarForm(Usuario usuario) {
		
		String name = usuario.getUser();
		String pass = usuario.getPassword();
		
		if(name.equals("admin") && pass.equals("root")) {
			return "MostrarMensajeV";
		}else {
			return "MostrarMensajeF";
		}


		
	}

}
