package com.example.construya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.construya.models.entity.Usuario;
import com.example.construya.models.service.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
@Autowired UsuarioService usuarioService;
	
	
	@PostMapping
	public Usuario guardar(@RequestBody Usuario u) {
		
		return usuarioService.save(u);
	}
	
	@PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Usuario usuario) {
        String mensaje = usuarioService.login(usuario.getUsername(), usuario.getPassword());
        return ResponseEntity.ok(mensaje);
    }
}
