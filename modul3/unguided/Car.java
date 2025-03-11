/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul3;

/**
 *
 * @author Ratih
 */
public class Car {
    public void setDetailCar(Engine engine, Transmission transmission, Wheel wheel) {
        System.out.println("Car dengan Engine: " + engine.getJenis() + " (" + engine.getTenaga() + " HP) dan Transmission: " + transmission.getJenis() + " (" + transmission.getJumlahGigi() + " gigi), serta roda berukuran " + wheel.getUkuran() + " inci.");
    }
    
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setJenis("V6");
        engine.setTenaga(300);
        
        Transmission transmission = new Transmission();
        transmission.setJenis("Otomatis");
        transmission.setJumlahGigi(6);
        
        Wheel wheel = new Wheel();
        wheel.setUkuran(17);
        
        Car car = new Car();
        car.setDetailCar(engine, transmission, wheel);
    }
}
