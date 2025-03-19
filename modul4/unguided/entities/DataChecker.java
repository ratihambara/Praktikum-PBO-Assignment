/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul4.unguided.entities;

/**
 *
 * @author Ratih
 */
public class DataChecker {
    // Cek kelengkapan data dokter
    public static boolean isDoctorDataComplete(Doctor doctor) {
        return doctor.getName() != null && doctor.getSpecialization() != null && doctor.getId() != null;
    }

    // Cek kelengkapan data pasien
    public static boolean isPatientDataComplete(Patient patient) {
        return patient.getName() != null && patient.getPatientId() != null && patient.getDiagnosis() != null;
    }

    // Cek kelengkapan data janji temu
    public static boolean isAppointmentDataComplete(Appointment appointment) {
        return appointment.getDoctor() != null && appointment.getPatient() != null && appointment.getAppointmentDate() != null;
    }    
}
