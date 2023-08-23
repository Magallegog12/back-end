package com.example.construya.models.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
@Table(name = "empresas")
public class Empresa {
	
		@Id
		@Column(name = "nit_est")
		private int nit;
		
		@Column(name = "id_est")
	    private int id_empresa;
		
		@Column(name = "tel_est")
	    private int tel_empresa;
		
		@Column(name = "nom_est")
	    private String nombre_empresa;

		public Empresa(int nit, int id_empresa, int tel_empresa, String nombre_empresa) {
			super();
			this.nit = nit;
			this.id_empresa = id_empresa;
			this.tel_empresa = tel_empresa;
			this.nombre_empresa = nombre_empresa;
		}

		public Empresa() {
			
		}

		public int getNit() {
			return nit;
		}

		public void setNit(int nit) {
			this.nit = nit;
		}

		public int getId_empresa() {
			return id_empresa;
		}

		public void setId_empresa(int id_empresa) {
			this.id_empresa = id_empresa;
		}

		public int getTel_empresa() {
			return tel_empresa;
		}

		public void setTel_empresa(int tel_empresa) {
			this.tel_empresa = tel_empresa;
		}

		public String getNombre_empresa() {
			return nombre_empresa;
		}

		public void setNombre_empresa(String nombre_empresa) {
			this.nombre_empresa = nombre_empresa;
		}
	    
	    
}
