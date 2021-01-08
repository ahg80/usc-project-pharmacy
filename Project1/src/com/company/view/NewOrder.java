package com.company.view;

import javax.swing.*;

public class NewOrder extends JFrame {
    public NewOrder() {
        this("NEW ORDER");
    }

    public NewOrder(String NewOrder) {
        super(NewOrder);
        this.setSize(500, 400);
        final JTextField code,name,number,dragstore,price;
         JLabel CODE1=new JLabel("CODE:");
         code=new JTextField(10);
         JLabel NAME1=new JLabel("NAME:");
         name=new JTextField(15);
         JLabel NUMBER1=new JLabel("NUMBER:");
         number=new JTextField(10);
         JLabel Dragstore1=new JLabel("DRAGSTORE:");
         dragstore=new JTextField(11);
         JLabel PRICE1=new JLabel("PRICE:");
        price=new JTextField(15);
        JButton okbutton=new JButton("OK");
        this.add(CODE1);
        CODE1.setBounds(100,40,100,18);
        this.add(code);
        code.setBounds(180,40,150,18);
        this.add(NAME1);
        NAME1.setBounds(100,70,100,18);
        this.add(name);
        name.setBounds(180,70,150,18);
        this.add(NUMBER1);
        NUMBER1.setBounds(100,100,100,18);
        this.add(number);
        number.setBounds(180,100,150,18);
        this.add(Dragstore1);
        Dragstore1.setBounds(100,130,100,18);
        this.add(dragstore);
        dragstore.setBounds(180,130,150,18);
        this.add(PRICE1);
        PRICE1.setBounds(100,160,100,18);
        this.add(price);
        price.setBounds(180,160,150,18);
        okbutton.setBounds(180,200,95,30);
        this.add(okbutton);
        this.setLayout(null);
        this.setVisible(true);

    }
}

