package com.example.construya.models.service;

import com.example.construya.models.entity.Usuario;
public interface UsuarioService {
	public Usuario save(Usuario u);
	public String login(String user, String ctr);
}
