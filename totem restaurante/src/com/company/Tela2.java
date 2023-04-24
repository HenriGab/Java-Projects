package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela2 extends JFrame implements ActionListener {

    Container n2 = new JPanel();
    Container c2 = getContentPane();
    JButton cart,money,cancelar;
    JLabel metodo;
    ImageIcon inicio = new ImageIcon(getClass().getResource("chr800.png"));
    JLabel label = new JLabel(inicio);
    String mens;


    public Tela2 (){
        super ("PAGAMENTO");
        cart = new JButton("Cartão");
        money = new JButton("Dinheiro");
        cancelar = new JButton("Cancelar");
        metodo = new JLabel("Escolha o metodo de pagamento");
        metodo.setFont(new Font("Serif", Font.BOLD, 54));
        metodo.setForeground(Color.GREEN);

        n2.setLayout(new GridLayout(2,2));
            n2.add(cart);
            n2.add(money);

            getContentPane().setBackground(Color.black);
        c2.add(BorderLayout.WEST,n2);
        c2.add(BorderLayout.NORTH,metodo);
        c2.add(BorderLayout.EAST,cancelar);
       c2.add(label);
        cancelar.addActionListener(this);
        money.addActionListener(this);
        cart.addActionListener(this);




        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,800);
        setVisible(true);
        setLocationRelativeTo(null);
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == cancelar){
            setVisible(false);
            new Tela();
        }
        if(e.getSource() == cart){
            setVisible(false);
            new Cardapio();
            mens += "METODO CARTÃO";
        }
        if(e.getSource() == money){
            setVisible(false);
            new Cardapio();
            mens += "METODO DINHEIRO";
        }


    }
}
