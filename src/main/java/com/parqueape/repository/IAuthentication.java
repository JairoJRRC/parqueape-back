package com.parqueape.repository;

import org.springframework.data.repository.CrudRepository;

import com.parqueape.models.Usuario;

public interface IAuthentication extends CrudRepository<Usuario, Long>{
	
}
