/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul4.guided.Driver;

import com.mycompany.modul4.guided.HargaBuku.KelasHarga;
import com.mycompany.modul4.guided.HargaToken.KelasToken;

/**
 *
 * @author Ratih
 */
public class TestPackage {
    public static void main(String[] args){
        KelasToken token = new KelasToken();
        KelasHarga harga = new KelasHarga();
        token.info();
        harga.info();
    }  
}
