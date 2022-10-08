/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testoop;

/**
 *
 * @author Pasan Yasara
 */
public class Samsung extends Phone {

    @Override
    public void call() {
        System.out.println("Call with Samsung");
    }
    
    public void talk()
    {
        super.talk();
        System.out.println("Talk with Samsung");
    }
    
}
