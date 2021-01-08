package com.company.view;

import javax.swing.*;

public class NewMedicine extends JFrame {
    public NewMedicine() {
        this("NEW MEDICINE");
    }
    public NewMedicine(String NewMedicine) {
        super(NewMedicine);
        this.setSize(500, 400);
        final JTextField code,name,number,price,Expiration;
        String cmbydata[]={"1399","1400","1401","1402","1403","1404","1405","1406","1407","1408"};
        JComboBox cmby=new JComboBox(cmbydata);
        cmby.setBounds(180,160,90,20);
        String cmbmdata[]={"1","2","3","4","5","6","7","8","9","10","11","12"};
        JComboBox cmbm=new JComboBox(cmbmdata);
        cmbm.setBounds(290,160,40,20);
        String cmbddata[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
        JComboBox cmbd=new JComboBox(cmbddata);
        cmbd.setBounds(350,160,40,20);
        JLabel CODE1=new JLabel("CODE:");
        code=new JTextField(10);
        JLabel NAME1=new JLabel("NAME:");
        name=new JTextField(15);
        JLabel NUMBER1=new JLabel("NUMBER:");
        number=new JTextField(10);
        JLabel PRICE1=new JLabel("PRICE:");
        price=new JTextField(15);
        JLabel Expiration1 =new JLabel("Expiration");
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
        this.add(PRICE1);
        PRICE1.setBounds(100,130,100,18);
        this.add(price);
        price.setBounds(180,130,150,18);
        this.add(Expiration1);
        Expiration1.setBounds(100,160,100,18);
        okbutton.setBounds(180,200,95,30);
        this.add(cmby);
        this.add(cmbm);
        this.add(cmbd);
        this.add(okbutton);
        this.setLayout(null);
        this.setVisible(true);                                                         }
}
