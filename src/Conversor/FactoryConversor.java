/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;


import Aritmetico.Ari;
import Factory.AbstractFactor;

/**
 *
 * @author Yliana Leones
 */
public class FactoryConversor implements AbstractFactor{
    @Override
    public Ari getAri(String type) {
        return null;
    }
    
    @Override
    public Conver getConver(String type) {
        switch (type) {
            case "Bina":
                return new Binario();
             
        }
        return null;
    }

    
}
