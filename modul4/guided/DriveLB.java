/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul4.guided;

/**
 *
 * @author Ratih
 */
public class DriveLB {
    public static void main(String[] args){
        LibraryBook lb = new LibraryBook();
        lb.setTitle("Petualangan Ramzi");
        lb.setAuthor("Julio");
        lb.setIsBorrowed(true);
        System.out.println("Title: " + lb.getTitle());
        System.out.println("Author: " + lb.getAuthor());
        System.out.println("Is Borrowed: " + lb.getStatus());
    }    
}
