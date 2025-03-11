/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul3.unguided;

/**
 *
 * @author Ratih
 */
// Kelas Transmission merepresentasikan sistem transmisi mobil
public class Transmission {
private String jenis; // Jenis transmisi (misal: Manual, Otomatis, CVT, dll.)
    private int jumlahGigi; // Jumlah gigi dalam transmisi 
    
    // Setter untuk jenis transmisi
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    // Getter untuk jenis transmisi
    public String getJenis() {
        return this.jenis;
    }
    
    // Setter untuk jumlah gigi transmisi
    public void setJumlahGigi(int jumlahGigi) {
        this.jumlahGigi = jumlahGigi;
    }
    
    // Getter untuk jumlah gigi transmisi
    public int getJumlahGigi() {
        return this.jumlahGigi;
    }
}
