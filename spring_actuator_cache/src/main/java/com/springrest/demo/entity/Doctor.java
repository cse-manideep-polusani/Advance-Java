package com.springrest.demo.entity;

import java.util.*;
import jakarta.persistence.*;

@Entity
public class Doctor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String role;
	
	@OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL)
	private List<Patient> patients;
	
	public Doctor() {
		
	}

	public Doctor(String name, String role, List<Patient> patients) {
		this.name = name;
		this.role = role;
		this.patients = patients;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", role=" + role + ", patients=" + patients + "]";
	}

}
