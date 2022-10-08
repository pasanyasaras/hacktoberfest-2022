/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testoop;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;


/**
 *
 * @author Pasan Yasara
 */
public class testdouble {
    public static void main(String[] args) {
        double x = 1000000000.58;
        
        NumberFormat nf = NumberFormat.getInstance(new Locale("en", "US"));
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        BigDecimal bd = new BigDecimal(x);
        
        
        System.out.println(nf.format(bd.doubleValue()*0.59));
    }
    
}
