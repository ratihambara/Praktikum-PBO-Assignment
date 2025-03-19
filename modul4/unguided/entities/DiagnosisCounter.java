/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul4.unguided.entities;

/**
 *
 * @author Ratih
 */
import java.util.List;
import java.util.HashMap;
import java.util.Map;
public class DiagnosisCounter {
    // Method untuk menghitung jumlah kemunculan tiap diagnosis dari list pasien
    public static Map<String, Integer> countDiagnoses(List<Patient> patients) {
        Map<String, Integer> diagnosisCount = new HashMap<>();

        // Iterasi melalui daftar pasien
        for (Patient patient : patients) {
            String diagnosis = patient.getDiagnosis();
            // Tambahkan ke map dengan counter
            diagnosisCount.put(diagnosis, diagnosisCount.getOrDefault(diagnosis, 0) + 1);
        }

        return diagnosisCount; // Kembalikan hasil dalam bentuk Map
    }
}
