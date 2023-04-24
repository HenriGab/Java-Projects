package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Carnes extends JFrame implements ActionListener{
    ImageIcon inicio = new ImageIcon(getClass().getResource("chr800.png"));
    JLabel label = new JLabel(inicio);
    JButton picanha,abacaxi,bisteca,peDePorco,dino,voltar,cancelar,finalizar;
    Container n4 = new JPanel();
    Container n42 = new JPanel();
    Container c4 = getContentPane();
    int contCarne = 0;
    String select;
    JLabel msg = new JLabel();
    int pi=0,aba=0,bis=0,pe=0,di =0;
    int valor=0;
    JLabel valorFCarne = new JLabel();
    int finalVcarne;
    Date date = Calendar.getInstance().getTime();
    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
    String strDate = dateFormat.format(date);



    public  Carnes (){
        super("Carnes");
        voltar = new JButton("Voltar");
        cancelar = new JButton("cancelar");
        picanha = new JButton("PICANHA R$ 50");
        abacaxi = new JButton("ABACAXI ASSADO R$ 10");
        bisteca = new JButton("BISTEQUINHA R$ 12");
        peDePorco = new JButton("PÉ DE PORCO R$10");
        dino = new JButton("Dinossauro no espeto R$ 25");
        finalizar = new JButton("Finalizar pedido");



        n4.setLayout(new GridLayout(3,2));
        n4.add(picanha);
        n4.add(abacaxi);
        n4.add(bisteca);
        n4.add(peDePorco);
        n4.add(dino);

        n42.setLayout(new GridLayout(2,2));
        n42.add(voltar);
        n42.add(cancelar);

        c4.add(BorderLayout.EAST,n42);
        c4.add (BorderLayout.WEST,n4);
        c4.add(label);
        c4.add(BorderLayout.NORTH,msg);
        c4.add(BorderLayout.SOUTH,valorFCarne);
        c4.add(BorderLayout.PAGE_START,finalizar);

        voltar.addActionListener(this);
        cancelar.addActionListener(this);
        picanha.addActionListener(this);
        abacaxi.addActionListener(this);
        bisteca.addActionListener(this);
        peDePorco.addActionListener(this);
        dino.addActionListener(this);
        finalizar.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,800);
        setVisible(true);
        setLocationRelativeTo(null);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == voltar){
            setVisible(false);
            new Cardapio();

        }
        if(e.getSource() == cancelar){
            setVisible(false);
            new Tela();

        }
        if(e.getSource() == picanha){
            contCarne = contCarne+1;
            pi = pi+1;
            valor = valor + 50;
            String c = Integer.toString(valor);

            valorFCarne.setText("VALOR TOTAL: "+c);
            if (contCarne > 5){
                msg.setText("Não é possivel adicionar mais: " );

                contCarne = contCarne-1;
                pi=pi-1;
                valor = valor - 50;
                String q = Integer.toString(valor);

                valorFCarne.setText("VALOR TOTAL: "+q);
            }
        }

            if(e.getSource() == abacaxi){
                contCarne = contCarne+1;
                aba = aba+1;
                valor = valor + 10;
                String c = Integer.toString(valor);

                valorFCarne.setText("VALOR TOTAL: "+c);
                if (contCarne > 5){
                    msg.setText("Não é possivel adicionar mais: " );

                    contCarne = contCarne-1;
                    aba = aba-1;
                    valor = valor - 10;
                    String q = Integer.toString(valor);

                    valorFCarne.setText("VALOR TOTAL: "+q);
                }
            }
                if(e.getSource() == bisteca){
                    contCarne = contCarne+1;
                    bis = bis+1;
                    valor = valor + 12;
                    String c = Integer.toString(valor);

                    valorFCarne.setText("VALOR TOTAL: "+c);
                    if (contCarne > 5){
                        msg.setText("Não é possivel adicionar mais: " );

                        contCarne = contCarne-1;
                        bis = bis-1;
                        valor = valor - 12;
                        String q = Integer.toString(valor);

                        valorFCarne.setText("VALOR TOTAL: "+q);

                    }
                }
                    if(e.getSource() == peDePorco){
                        contCarne = contCarne+1;
                        pe = pe+1;
                        valor = valor + 10;
                        String c = Integer.toString(valor);

                        valorFCarne.setText("VALOR TOTAL: "+c);

                        if (contCarne > 5){
                            msg.setText("Não é possivel adicionar mais: " );

                            contCarne = contCarne-1;
                            pe = pe-1;
                            valor = valor - 10;
                            String q = Integer.toString(valor);

                            valorFCarne.setText("VALOR TOTAL: "+q);
                        }
                    }
                        if(e.getSource() == dino){
                            contCarne = contCarne+1;
                            di = di+1;
                            valor = valor + 25;
                            String c = Integer.toString(valor);

                            valorFCarne.setText("VALOR TOTAL: "+c);
                            if (contCarne > 5){
                                msg.setText("Não é possivel adicionar mais: " );

                                contCarne = contCarne-1;
                                di = di-1;
                                valor = valor - 25;
                                String q = Integer.toString(valor);

                                valorFCarne.setText("VALOR TOTAL: "+q);
                            }
                        }
                        if(e.getSource()== finalizar){
                            if(e.getSource()== finalizar){

                                valorFCarne.setText("Valor final: " +valor +"  \nData do pedido: "+ strDate);
                                try {
                                    wait(1000);
                                } catch (InterruptedException interruptedException) {
                                    interruptedException.printStackTrace();
                                }
                            }
        System.out.println("dino: " +di + ", picanha: " +pi + " abacaxi: " + aba + " pe de porco: " + pe+" ");
        System.out.println(valor);
        finalVcarne = valor;
        }



    }
}






