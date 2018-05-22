/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Aritmetico.Ari;
import Aritmetico.FactoryAritmetico;
import Aritmetico.Suma;

/**
 *
 * @author uca
 */
public interface AbstractFactor {
    Ari getAri(String type);
}
