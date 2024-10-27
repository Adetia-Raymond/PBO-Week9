/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.praktikumpbo_9;

/**
 *
 * @author Raymond
 */
abstract class Hewan {
    abstract void bersuara();
}

class Kucing extends Hewan{
    @Override
    void bersuara(){
        System.out.println("Meong");
    }
}

class Anjing extends Hewan{
    @Override
    void bersuara(){
        System.out.println("Guk Guk");
    }
}


