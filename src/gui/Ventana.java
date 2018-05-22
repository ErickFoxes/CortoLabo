/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Aritmetico.Ari;
import Factory.AbstractFactor;
import Factory.FactoryProducer;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        AbstractFactor factory;

        
        factory =  FactoryProducer.getFactory("Suma");
        botonS.addActionListener(new ActionListener(){
            int c;
            @Override
            public void actionPerformed(ActionEvent e) {
                
            Ari sumar = factory.getAri("Suma");
            
            c=sumar.srdm(Integer.parseInt(caja1.getText()),Integer.parseInt(caja2.getText()));
            caja3.setText();
            }
        });
        botonR.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
            Ari Restar = factory.getAri("Resta");
            Restar.srdm(Integer.parseInt(caja1.getText()),Integer.parseInt(caja2.getText()));
            }
        });
        botonD.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
            Ari Divi = factory.getAri("Division");
            Divi.srdm(Integer.parseInt(caja1.getText()),Integer.parseInt(caja2.getText()));
            }
        });
        botonM.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
            Ari Multipli = factory.getAri("Multiplicacion");
            Multipli.srdm(Integer.parseInt(caja1.getText()),Integer.parseInt(caja2.getText()));
            }
        });
        
        setSize(400,400);     
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