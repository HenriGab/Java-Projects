package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tela extends JFrame implements ActionListener{

    JButton comecar,dinheiro,cart;
    ImageIcon inicio = new ImageIcon(getClass().getResource("chr800.png"));
    JLabel label = new JLabel(inicio);
    Container n = new JPanel();
    Container c = getContentPane();
    JLabel metodo;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.sss");
    JLabel jl = new JLabel(sdf.format(new Date()));





    public  Tela (){
        super("churrasic park  ");


        comecar = new JButton("Aperte para continuar");
        dinheiro = new JButton("Dinheiro");
        cart = new JButton("Cartão");
        metodo = new JLabel("Selecione o metodo");
    n.setLayout(new GridLayout(2,2));




    c.add (BorderLayout.SOUTH,comecar);
    c.add(label);
    c.add (BorderLayout.NORTH,jl);

    comecar.addActionListener(this);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(800,800);
    setVisible(true);
    setLocationRelativeTo(null);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Tela2();


    }


}

