/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetico;

import Factory.AbstractFactor;

/**
 *
 * @author uca
 */
public class FactoryAritmetico implements AbstractFactor{

    @Override
    public Ari getAri(String type) {
        switch (type) {
            case "Suma":
                return new Suma();
            case "Resta":
                return new Resta();
            case "Division":
                return new Division();
            case "Multiplicacion":
                return new Multi();   
                
             
        }
        return null;
    }
    
}
