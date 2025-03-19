/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul4.unguided.Testing;

/**
 *
 * @author Ratih
 */
import com.mycompany.modul4.unguided.entities.Doctor;
import com.mycompany.modul4.unguided.entities.Patient;
import com.mycompany.modul4.unguided.entities.Appointment;
import com.mycompany.modul4.unguided.entities.DataChecker;
import com.mycompany.modul4.unguided.entities.DiagnosisCounter;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Testing {
    public static void main (String[] args) {
        // Membuat objek dokter
        Doctor doctor1 = new Doctor("Dr. Andi", "Kardiolog", "D001");

        // Membuat beberapa objek pasien
        Patient patient1 = new Patient("Budi", "P001", "Flu");
        Patient patient2 = new Patient("Sari", "P002", "Flu");
        Patient patient3 = new Patient("Ayu", "P003", "Diabetes");

        // Membuat janji temu antara dokter dan pasien
        Appointment appointment1 = new Appointment(doctor1, patient1, LocalDateTime.now());

        // Mengecek apakah data sudah lengkap menggunakan DataChecker
        System.out.println("Data dokter lengkap? " + DataChecker.isDoctorDataComplete(doctor1));
        System.out.println("Data pasien lengkap? " + DataChecker.isPatientDataComplete(patient1));
        System.out.println("Data appointment lengkap? " + DataChecker.isAppointmentDataComplete(appointment1));

        // Menghitung jumlah diagnosis yang muncul
        List<Patient> patientList = Arrays.asList(patient1, patient2, patient3);
        Map<String, Integer> diagnosisCount = DiagnosisCounter.countDiagnoses(patientList);

        // Menampilkan hasil diagnosis counter
        System.out.println("Jumlah diagnosis yang ditemukan:");
        for (String diagnosis : diagnosisCount.keySet()) {
            System.out.println(diagnosis + ": " + diagnosisCount.get(diagnosis));
        }
    }
}
