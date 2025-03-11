/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul3;

/**
 *
 * @author Ratih
 */
// Kelas Engine merepresentasikan mesin pada mobil
public class Engine {
private String jenis; // Jenis mesin (misal: V6, V8, dll.)
    private int tenaga; // Tenaga mesin dalam HP (horsepower)
    
    // Setter untuk jenis mesin
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    // Getter untuk jenis mesin    
    public String getJenis() {
        return this.jenis;
    }

    // Setter untuk tenaga mesin  
    public void setTenaga(int tenaga) {
        this.tenaga = tenaga;
    }
    
    // Getter untuk tenaga mesin
    public int getTenaga() {
        return this.tenaga;
    }  
}
