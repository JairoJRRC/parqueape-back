package com.parqueape.service;

import java.util.List;

import com.parqueape.models.Usuario;

public interface IAuthService {
	public List<Usuario> findAll();
}
