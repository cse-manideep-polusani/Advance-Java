package com.springrest.demo.entity;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer age;
	private Long phoneNumber;
	private String medicalHistory;
	private String doctorDetails;
	private LocalDate appointmentDate;
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "doctor_id")
	private Doctor doctor;
	
	public Patient() {
		
	}

	public Patient(String name, Integer age, Long phoneNumber, String medicalHistory, String doctorDetails,
			LocalDate appointmentDate, String status, Doctor doctor) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.medicalHistory = medicalHistory;
		this.doctorDetails = doctorDetails;
		this.appointmentDate = appointmentDate;
		this.status = status;
		this.doctor = doctor;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMedicalHistory() {
		return medicalHistory;
	}

	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}

	public String getDoctorDetails() {
		return doctorDetails;
	}

	public void setDoctorDetails(String doctorDetails) {
		this.doctorDetails = doctorDetails;
	}

	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber
				+ ", medicalHistory=" + medicalHistory + ", doctorDetails=" + doctorDetails + ", appointmentDate="
				+ appointmentDate + ", status=" + status + ", doctor=" + doctor + "]";
	}
	
}
