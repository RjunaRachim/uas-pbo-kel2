package com.uasKel2;

/**
 * @author Kelompok2
 * Tehnik Informatika - Univ.Islam Balitar
 * 2023
*/

public class Main implements Pajak{



    
    public static void main(String[] args) {
    Main main = new Main();
        System.out.println("+========================================================+");
        System.out.println("|            TABEL HARGA SMARTPHONE SETELAH PPN          |");
        System.out.println("+========================================================+");
        System.out.println("| Vendor   | Type     | Harga        | Harga Setelah PPN |");
        System.out.println("+==========+==========+==============+===================+");
    main.HargaSetelahPpn("Samsung", "A51", 5000000.00);
    main.HargaSetelahPpn("Oppo", "Reno 5", 4400000.00);
    main.HargaSetelahPpn("Xiaomi", "A1", 4100000.00);
    System.out.println("+==========+==========+==============+===================+");
    }

    
    @Override
    public void HargaSetelahPpn(String vendor, String type, Double harga) {
        if(harga > 4500000.00){
            System.out.print("| " + vendor + "  | " + type + "      | Rp." + harga);
            System.out.println(" |   Rp." + (harga+(harga*PPN3))+ "    |");
           
        } else if(harga > 4200000.00){
            System.out.print("| " + vendor + "     | " + type + "   | Rp." + harga);
            System.out.println(" |   Rp." + (harga+(harga*PPN2))+ "    |");
        } else if(harga > 4000000.00){
            System.out.print("| " + vendor + "   | " + type + "       | Rp." + harga);
            System.out.println(" |   Rp." + (harga+(harga*PPN1))+ "    |");
            
        }
        
    }
}

