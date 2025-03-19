/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul4.unguided.entities;

/**
 *
 * @author Ratih
 */
public class Doctor {
    // Field privat untuk enkapsulasi data
    private String name;
    private String specialization;
    private String id;

    // Constructor untuk menginisialisasi objek dokter
    public Doctor(String name, String specialization, String id) {
        this.name = name;
        this.specialization = specialization;
        this.id = id;
    }

    // Getter untuk mengambil nama dokter
    public String getName() {
        return name;
    }

    // Setter untuk mengubah nama dokter
    public void setName(String name) {
        this.name = name;
    }

    // Getter untuk mengambil spesialisasi dokter
    public String getSpecialization() {
        return specialization;
    }

    // Setter untuk mengubah spesialisasi dokter
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Getter untuk mengambil ID dokter
    public String getId() {
        return id;
    }

    // Setter untuk mengubah ID dokter
    public void setId(String id) {
        this.id = id;
    }
}
