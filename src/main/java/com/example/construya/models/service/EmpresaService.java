package com.example.construya.models.service;

import java.util.List;

import java.util.Optional;

import com.example.construya.models.entity.Empresa;

public interface EmpresaService {
	
	public Optional<Empresa> findById(Integer id);
	 public List<Empresa> findAll();
	 public Empresa save(Empresa e);
	 public void deleteById(Integer id);
}
