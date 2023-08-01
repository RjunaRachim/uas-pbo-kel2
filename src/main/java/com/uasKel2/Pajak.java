package com.uasKel2;

/**
 * @author Kelompok2
 * Tehnik Informatika - Univ.Islam Balitar
 * 2023
*/

public interface Pajak {
    final Double PPN1 = 0.01;
    final Double PPN2 = 0.02;
    final Double PPN3 = 0.05;
    
    public abstract void HargaSetelahPpn(String vendor,String type,Double harga);
    
}
