/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul4.unguided.entities;

/**
 *
 * @author Ratih
 */
public class Patient {
    // Field privat untuk data pasien
    private String name;
    private String patientId;
    private String diagnosis; // Data sensitif

    // Constructor untuk membuat objek pasien
    public Patient(String name, String patientId, String diagnosis) {
        this.name = name;
        this.patientId = patientId;
        this.diagnosis = diagnosis;
    }

    // Getter untuk mengambil nama pasien
    public String getName() {
        return name;
    }

    // Setter untuk mengubah nama pasien
    public void setName(String name) {
        this.name = name;
    }

    // Getter untuk mengambil ID pasien
    public String getPatientId() {
        return patientId;
    }

    // Setter untuk mengubah ID pasien
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    // Getter untuk diagnosis pasien (dengan kontrol akses)
    public String getDiagnosis() {
        return diagnosis;
    }

    // Setter untuk mengubah diagnosis pasien
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }    
}
