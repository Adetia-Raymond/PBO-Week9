/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.praktikumpbo_9;

/**
 *
 * @author Raymond
 */
abstract class Kendaraan { 
    
    abstract void berjalan();
    
    void info() { 
        System.out.println("Ini adalah kendaraan."); 
    }
}

class Mobil extends Kendaraan { 
    @Override
    void berjalan() {
        System.out.println("Mobil sedang berjalan dengan cepat.");
    }
}

class Sepeda extends Kendaraan {    
    @Override
    void berjalan() { 
        System.out.println("Sepeda sedang berjalan dengan pelan.");
    }
} 
    