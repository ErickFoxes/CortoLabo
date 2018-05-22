/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetico;

/**
 *
 * @author uca
 */
public class Suma implements Ari {

    @Override
    public String srdm(int a,int b) {
        System.out.println(a+b);
        return Integer.toString(a+b);
    }
    
}
