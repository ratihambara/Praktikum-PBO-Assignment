/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul3;

/**
 *
 * @author Ratih
 */
public class Phone {
    String brand;
    int yearRelease;
    
    void Call(){
        System.out.println("Calling");
    }
    
    void SMS(){
        System.out.println("Sending SMS");
    }
    
    void TurnOn(){
        System.out.println("Turning On" + brand);
    }
    
    void TurnOff(){
        System.out.println("Turning Off" + brand);
    } 
}
