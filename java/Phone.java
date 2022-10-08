/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testoop;

/**
 *
 * @author Pasan Yasara
 */
public abstract class Phone {
    
    public Phone(){
        System.out.println("Phone Constructor");
    }
    
    public abstract void call();
    
    public void talk(){
        System.out.println("Phone is calling");
    }
}
