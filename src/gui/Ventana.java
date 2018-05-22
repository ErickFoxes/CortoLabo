/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Aritmetico.Ari;
import Conversor.Conver;
import Factory.AbstractFactor;
import Factory.FactoryProducer;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author uca
 */
public class Ventana extends JFrame{
    private JTextField caja1,caja2,caja3; 
    private JButton botonS,botonR,botonD,botonM,botonB;
    String Regex;
    
    
    public Ventana(){
        super("Titulo de la ventana");
        initComponent();
        
    }

    public void initComponent() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        caja1 = new JTextField();
        caja1.setBounds(10, 20, 150, 30);
        
        caja2 = new JTextField();
        caja2.setBounds(200, 20, 150, 30);
        
        caja3 = new JTextField();
        caja3.setBounds(105, 200, 150, 30);
        
        botonS = new JButton("Suma");
        botonS.setBounds(10, 60, 75, 30);
        
        botonR = new JButton("Resta");
        botonR.setBounds(110, 60, 75, 30);
        
        botonD = new JButton("Division");
        botonD.setBounds(210, 60, 75, 30);
        
        botonM = new JButton("Multiplicacion");
        botonM.setBounds(310, 60, 75, 30);
        
        botonB = new JButton("Binario");
        botonB.setBounds(410, 60, 75, 30);
        
        Container contenedor = getContentPane();
        contenedor.add(botonS);
        contenedor.add(botonR);
        contenedor.add(botonD);
        contenedor.add(botonM);
        contenedor.add(botonB);
        contenedor.add(caja2);
        contenedor.add(caja1);
        contenedor.add(caja3);
        AbstractFactor factory, factoryb;

        
        factory =  FactoryProducer.getFactory("Suma");
        factoryb =  FactoryProducer.getFactory("Bina");
        
        Regex = "[+-/*]";
        
        
        botonS.addActionListener(new ActionListener(){
            String c;
            @Override
            
            public void actionPerformed(ActionEvent e) {
                Pattern patron = Pattern.compile(Regex);
                Matcher m = patron.matcher(caja1.getText());
                Matcher n = patron.matcher(caja2.getText());
                boolean coincidencia = m.find();
                boolean coincidenci = n.find();
                if(coincidencia){
                     JOptionPane.showMessageDialog(null, "No se aceptan los signos +,-,* ni /");
                }else if(coincidenci){
                     JOptionPane.showMessageDialog(null, "No se aceptan los signos +,-,* ni /");
                }
                else{
                    Ari sumar = factory.getAri("Suma");

                    c=sumar.srdm(Integer.parseInt(caja1.getText()),Integer.parseInt(caja2.getText()));
                    caja3.setText(c);
                }
                
            }
        });
        botonR.addActionListener(new ActionListener(){
            String c;
            @Override
            public void actionPerformed(ActionEvent e) {
                Pattern patron = Pattern.compile(Regex);
                Matcher m = patron.matcher(caja1.getText());
                
                 Matcher n = patron.matcher(caja2.getText());
                boolean coincidenci = n.find();
                
                boolean coincidencia = m.find();
                if(coincidencia){
                     JOptionPane.showMessageDialog(null, "No se aceptan los signos +,-,* ni /");
                }else if(coincidenci){
                     JOptionPane.showMessageDialog(null, "No se aceptan los signos +,-,* ni /");
                }else{
                    Ari Restar = factory.getAri("Resta");
                    c=Restar.srdm(Integer.parseInt(caja1.getText()),Integer.parseInt(caja2.getText()));
                    caja3.setText(c);
                }
            
            }
        });
        botonD.addActionListener(new ActionListener(){
            String c;
            @Override
            public void actionPerformed(ActionEvent e) {
                Pattern patron = Pattern.compile(Regex);
                Matcher m = patron.matcher(caja1.getText());
                Matcher n = patron.matcher(caja2.getText());
                boolean coincidenci = n.find();
                boolean coincidencia = m.find();
                if(coincidencia){
                     JOptionPane.showMessageDialog(null, "No se aceptan los signos +,-,* ni /");
                }else if(coincidenci){
                     JOptionPane.showMessageDialog(null, "No se aceptan los signos +,-,* ni /");
                }else{
                    Ari Divi = factory.getAri("Division");
                    c=Divi.srdm(Integer.parseInt(caja1.getText()),Integer.parseInt(caja2.getText()));
                    caja3.setText(c);
                }
            
            }
        });
        botonM.addActionListener(new ActionListener(){
            String c;
            @Override
            public void actionPerformed(ActionEvent e) {
                Pattern patron = Pattern.compile(Regex);
                Matcher m = patron.matcher(caja1.getText());
                Matcher n = patron.matcher(caja2.getText());
                boolean coincidenci = n.find();
                boolean coincidencia = m.find();
                if(coincidencia){
                     JOptionPane.showMessageDialog(null, "No se aceptan los signos +,-,* ni /");
                }else if(coincidenci){
                     JOptionPane.showMessageDialog(null, "No se aceptan los signos +,-,* ni /");
                }else{
                    Ari Multipli = factory.getAri("Multiplicacion");
                    c=Multipli.srdm(Integer.parseInt(caja1.getText()),Integer.parseInt(caja2.getText()));
                    caja3.setText(c);
                }
            
            }
        });
        botonB.addActionListener(new ActionListener(){
           String c;
            @Override
            public void actionPerformed(ActionEvent e) {
                Pattern patron = Pattern.compile(Regex);
                Matcher m = patron.matcher(caja1.getText());
                Matcher n = patron.matcher(caja2.getText());
                boolean coincidenci = n.find();
                boolean coincidencia = m.find();
                if(coincidencia){
                     JOptionPane.showMessageDialog(null, "No se aceptan los signos +,-,* ni /");
                }else if(coincidenci){
                     JOptionPane.showMessageDialog(null, "No se aceptan los signos +,-,* ni /");
                }else{
                    Conver Bina = factoryb.getConver("Bina");
                    c=Bina.bina(Integer.parseInt(caja1.getText()));
                   caja3.setText(c);
                }
            
            }
        });
        
        
        setSize(600,400);     
    }
    public static void main(String[] args){
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new Ventana().setVisible(true);
            }
        });
    }
}