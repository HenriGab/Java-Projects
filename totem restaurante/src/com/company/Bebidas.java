package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Bebidas extends JFrame implements ActionListener{
    ImageIcon inicio = new ImageIcon(getClass().getResource("chr800.png"));
    JLabel label = new JLabel(inicio);
    JButton coca,guarana,sucoUva,breja,vinho,voltar,cancelar,finalizar;
    Container n5 = new JPanel();
    Container n52 = new JPanel();
    Container c5 = getContentPane();
    int contBebida = 0;
    JLabel msg = new JLabel();
    JLabel valorf = new JLabel();
    JLabel finar = new JLabel();
    int coc=0,guara=0,suco=0,bre=0,vin =0;
    int valor;
    int finalV;
    //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.sss");
   // JLabel jl = new JLabel(sdf.format(new Date()));
    Date date = Calendar.getInstance().getTime();
    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
    String strDate = dateFormat.format(date);




    public  Bebidas (){
        super("Carnes");
        voltar = new JButton("Voltar");
        cancelar = new JButton("cancelar");
        coca = new JButton("COCA-COLA R$ 5 ");
        guarana = new JButton("GUARANA R$ 6");
        sucoUva = new JButton("Suco de Uva R$ 5");
        breja = new JButton("Cerveja R$ 5");
        vinho = new JButton("Vinho R$ 10");
        finalizar = new JButton("Finalizar pedido");




        n5.setLayout(new GridLayout(3,2));
        n5.add(coca);
        n5.add(guarana);
        n5.add(sucoUva);
        n5.add(breja);
        n5.add(vinho);

        n52.setLayout(new GridLayout(2,2));
        n52.add(voltar);
        n52.add(cancelar);

        c5.add(BorderLayout.EAST,n52);
        c5.add (BorderLayout.WEST,n5);
        c5.add(label);
        c5.add(BorderLayout.NORTH,msg);
        c5.add(BorderLayout.SOUTH,valorf);
        c5.add(BorderLayout.PAGE_START,finalizar);

        voltar.addActionListener(this);
        cancelar.addActionListener(this);
        coca.addActionListener(this);
        guarana.addActionListener(this);
        sucoUva.addActionListener(this);
        breja.addActionListener(this);
        vinho.addActionListener(this);
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
        if(e.getSource() == coca){
            contBebida = contBebida+1;
            coc = coc+1;
            valor = valor+ 5;
              String i = Integer.toString(valor);

            valorf.setText("VALOR TOTAL: "+i);
            if (contBebida > 5){
                msg.setText("Não é possivel adicionar mais: " );


                contBebida = contBebida-1;
                coc=coc-1;
                valor = valor- 5;
                String p = Integer.toString(valor);

                valorf.setText("VALOR TOTAL: "+p);
            }
        }

        if(e.getSource() == guarana){
            contBebida = contBebida+1;
            guara = guara+1;
            valor = valor+ 6;
            String i = Integer.toString(valor);

            valorf.setText("VALOR TOTAL: "+i);
            if (contBebida > 5){
                msg.setText("Não é possivel adicionar mais: " );

                contBebida = contBebida-1;
                guara = guara-1;
                valor = valor - 6;
                String p = Integer.toString(valor);

                valorf.setText("VALOR TOTAL: "+p);
            }
        }
        if(e.getSource() == sucoUva){
            contBebida = contBebida+1;
            valor = valor+ 5;
            suco = suco+1;
            String i = Integer.toString(valor);

            valorf.setText("VALOR TOTAL: "+i);
            if (contBebida > 5){
                msg.setText("Não é possivel adicionar mais: " );

                contBebida = contBebida-1;
                suco = suco-1;
                valor = valor- 5;
                String p = Integer.toString(valor);

                valorf.setText("VALOR TOTAL: "+p);
            }
        }
        if(e.getSource() == breja){
            contBebida = contBebida+1;
            bre = bre+1;
            valor = valor+ 5;
            String i = Integer.toString(valor);

            valorf.setText("VALOR TOTAL: "+i);

            if (contBebida > 5){
                msg.setText("Não é possivel adicionar mais: " );

                contBebida = contBebida-1;
                bre = bre-1;
                valor = valor- 5;
                String p = Integer.toString(valor);

                valorf.setText("VALOR TOTAL: "+p);
            }
        }
        if(e.getSource() == vinho){
            contBebida = contBebida+1;
            vin = vin+1;
            valor = valor+ 10;
            String i = Integer.toString(valor);

            valorf.setText("VALOR TOTAL: "+i);
            if (contBebida > 5){
                msg.setText("Não é possivel adicionar mais: " );

                contBebida = contBebida-1;
                vin = vin-1;
                valor = valor- 10;
                String p = Integer.toString(valor);

                valorf.setText("VALOR TOTAL: "+p);
            }
        }
        if(e.getSource()== finalizar){

            valorf.setText("Valor final: " +valor +"  \nData do pedido: "+ strDate);

        }

    }
}