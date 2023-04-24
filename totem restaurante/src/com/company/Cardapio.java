package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cardapio extends JFrame implements ActionListener{
    ImageIcon inicio = new ImageIcon(getClass().getResource("chr800.png"));
    JLabel label = new JLabel(inicio);
    JButton carnes,Bebidas,voltar,Cancelar,Pagar;
    Container n3 = new JPanel();
    Container n32 = new JPanel();
    Container c3 = getContentPane();
   JLabel display;






    public  Cardapio (){
        super("Cardapio");
        carnes = new JButton("Carnes");
        Bebidas = new JButton("Bebidas");
    voltar = new JButton("Voltar");
    Cancelar = new JButton("Cancelar");
        display = new JLabel();
        display.setFont(new Font("serif", Font.PLAIN, 20));


        n3.setLayout(new GridLayout(2,2));
            n3.add(Bebidas);
            n3.add(carnes);

        n32.setLayout(new GridLayout(2,2));
            n32.add(voltar);
            n32.add(Cancelar);

        c3.add(BorderLayout.EAST,n32);
        c3.add (BorderLayout.WEST,n3);
        c3.add(label);
        c3.add(BorderLayout.SOUTH,display);

       voltar.addActionListener(this);
        Cancelar.addActionListener(this);
        carnes.addActionListener(this);
        Bebidas.addActionListener(this);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,800);
        setVisible(true);
        setLocationRelativeTo(null);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == voltar){
            setVisible(false);
            new Tela2();

        }
        if(e.getSource() == Cancelar){
            setVisible(false);
            new Tela();

        }
        if(e.getSource()== carnes){
            setVisible(false);
            new Carnes();
        }
        if(e.getSource()== Bebidas){
            setVisible(false);
            new Bebidas();
        }

        }
    }




