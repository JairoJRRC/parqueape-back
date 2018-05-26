package com.parqueape.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parqueape.models.Usuario;
import com.parqueape.repository.IAuthentication;

public class AuthService implements IAuthService {
	
	@Autowired
	private IAuthentication authRespository;

	@Override
	public List<Usuario> findAll() {
			return (List<Usuario>) authRespository.findAll();
	}
	
	
	
}
