package com.parqueape.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.parqueape.models.Usuario;
import com.parqueape.service.IAuthService;

@RestController
@RequestMapping("/api")
public class ClientRestController {
	
	@Autowired
	private IAuthService service;
	
	@GetMapping("/hola")
	public String data() {
		return "Hola Mundo";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public  List<Usuario> getBarBySimplePathWithRequestParam(
	  @RequestParam("email") String email, @RequestParam("password") String psw, @RequestParam("role") String role) {
	    
		return service.findAll();
	}
	
}
