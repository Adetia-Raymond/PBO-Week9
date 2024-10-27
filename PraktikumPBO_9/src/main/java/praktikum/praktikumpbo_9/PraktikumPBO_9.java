/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum.praktikumpbo_9;

/**
 *
 * @author Raymond
 */
public class PraktikumPBO_9 {

    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda(); 
        sepeda.berjalan();
        mobil.berjalan();

        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();
        kucing.bersuara();
        anjing.bersuara();
    }
}
