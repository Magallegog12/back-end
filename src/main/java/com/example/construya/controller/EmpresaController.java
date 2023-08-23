package com.example.construya.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.construya.models.entity.Empresa;
import com.example.construya.models.service.EmpresaService;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {
	@Autowired
	EmpresaService empresaService;
	
	@GetMapping("/{id}")
	public Optional<Empresa> buscarPorId(@PathVariable Integer id){
		
		return empresaService.findById(id);
	}

	@GetMapping("/listar")
	public List<Empresa> listarTodos(){
		
		return empresaService.findAll();
	}
	
	@PostMapping
	public Empresa guardar(@RequestBody Empresa e) {
		
		return empresaService.save(e);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		
		empresaService.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public Empresa actualizar(@RequestBody Empresa e, @PathVariable Integer id) {
		
		Empresa eEnBD=empresaService.findById(id).get();
	
				eEnBD.setNit(e.getNit());
				eEnBD.setId_empresa(e.getId_empresa());
				eEnBD.setTel_empresa(e.getTel_empresa());
				eEnBD.setNombre_empresa(e.getNombre_empresa());
				
		return	empresaService.save(eEnBD);
				
		
	}
}
