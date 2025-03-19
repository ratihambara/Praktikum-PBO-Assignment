/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul4.unguided.entities;

/**
 *
 * @author Ratih
 */
import java.time.LocalDateTime;
public class Appointment {
    private Doctor doctor; // Hubungan dengan class Doctor
    private Patient patient; // Hubungan dengan class Patient
    private LocalDateTime appointmentDate; // Waktu janji temu

    // Constructor untuk membuat objek appointment
    public Appointment(Doctor doctor, Patient patient, LocalDateTime appointmentDate) {
        this.doctor = doctor;
        this.patient = patient;
        this.appointmentDate = appointmentDate;
    }

    // Getter untuk dokter yang terlibat dalam appointment
    public Doctor getDoctor() {
        return doctor;
    }

    // Setter untuk dokter
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    // Getter untuk pasien yang terlibat dalam appointment
    public Patient getPatient() {
        return patient;
    }

    // Setter untuk pasien
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    // Getter untuk tanggal janji temu
    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    // Setter untuk tanggal janji temu
    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
}
