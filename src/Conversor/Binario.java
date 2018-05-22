/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

/**
 *
 * @author Yliana Leones
 */
public class Binario implements Conver{
     @Override
    public String bina(int a) {
        System.out.println("binario woo");
        int i;
        String c="";
        while(a>=2){
            if(a==3){
                c="11"+c;
                break;
            }else if(a==2){
                c="10"+c;
                break;
            }
            if(a%2==0){
                c="0"+c;
            }else{
                c="1"+c;
            }
            
            
            a=a/2;
            
            
        }
        
        
        return c;
    }
}
