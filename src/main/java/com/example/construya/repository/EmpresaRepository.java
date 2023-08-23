package com.example.construya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.construya.models.entity.Empresa;

@Repository

public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {

}