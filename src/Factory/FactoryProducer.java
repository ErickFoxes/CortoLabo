/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Aritmetico.FactoryAritmetico;

/**
 *
 * @author uca
 */
public class FactoryProducer {
    public static AbstractFactor getFactory(String type){
        switch (type){
            case "Suma":
                return  new FactoryAritmetico();
            
        }
        return null;
}
}
