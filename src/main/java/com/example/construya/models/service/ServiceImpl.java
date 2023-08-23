package com.example.construya.models.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.construya.models.entity.Empresa;
import com.example.construya.repository.EmpresaRepository;

@Service
public class ServiceImpl implements EmpresaService{
	@Autowired
	EmpresaRepository empresaRepository;
	
	
	@Override
	public Optional<Empresa> findById(Integer id) {
		
		
		return empresaRepository.findById(id);
	}

	@Override
	public List<Empresa> findAll() {
		
		return empresaRepository.findAll();
	}

	@Override
	public Empresa save(Empresa e) {
		
		return empresaRepository.save(e);
	}

	@Override
	public void deleteById(Integer id) {
		empresaRepository.deleteById(id);
		
	}
}
