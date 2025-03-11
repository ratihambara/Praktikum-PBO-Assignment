/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul3;

/**
 *
 * @author Ratih
 */
// Kelas utama Car yang menghubungkan Engine, Transmission, dan Wheel
public class Car {
    // Metode untuk menampilkan detail mobil berdasarkan komponennya
    public void setDetailCar(Engine engine, Transmission transmission, Wheel wheel) {
        System.out.println("Car dengan Engine: " + engine.getJenis() + " (" + engine.getTenaga() + " HP) dan Transmission: " + transmission.getJenis() + " (" + transmission.getJumlahGigi() + " gigi), serta roda berukuran " + wheel.getUkuran() + " inci.");
    }
    
    public static void main(String[] args) {
        // Membuat objek Engine dan mengatur jenis serta tenaganya
        Engine engine = new Engine();
        engine.setJenis("V6");
        engine.setTenaga(300);
        
        // Membuat objek Transmission dan mengatur jenis serta jumlah giginya
        Transmission transmission = new Transmission();
        transmission.setJenis("Otomatis");
        transmission.setJumlahGigi(6);
        
        // Membuat objek Wheel dan mengatur ukuran rodanya
        Wheel wheel = new Wheel();
        wheel.setUkuran(17);
        
        // Membuat objek Car dan menampilkan detailnya
        Car car = new Car();
        car.setDetailCar(engine, transmission, wheel);
    }
}
