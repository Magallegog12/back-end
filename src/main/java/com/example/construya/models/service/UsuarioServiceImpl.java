package com.example.construya.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.construya.models.entity.Usuario;
import com.example.construya.repository.UsuarioRepository;
@Service
public class UsuarioServiceImpl implements UsuarioService{
	@Autowired
	UsuarioRepository usuarioRepository;

	
	@Override
	public Usuario save(Usuario u) {
		
		return usuarioRepository.save(u);
	}
 
	
	
	@Override
	public String login(String user, String ctr) {
		
		Usuario usuario = usuarioRepository.findByUsername(user);
		

        if (usuario == null) {
            return "Usuario no encontrado";
        }

        if (!usuario.getPassword().equals(ctr)) {
            return "Contraseña incorrecta";
        }

        return "Inicio de sesión exitoso";
	}
}
