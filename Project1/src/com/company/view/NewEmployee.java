package com.company.view;

import javax.swing.*;
import java.awt.*;

public class NewEmployee extends JFrame {
    public NewEmployee() {
        this("NEW EMPLOYEE");
    }

    public NewEmployee(String NewEmployee) {
        super(NewEmployee);
        this.setSize(500, 400);
        final JTextField mellicode,name,family,phonenumber,addres,username,password,confirmpassword;
        JLabel MCODE1=new JLabel("MELLICODE:");
        mellicode=new JTextField(10);
        JLabel NAME1=new JLabel("NAME:");
        name=new JTextField(15);
        JLabel FAMILY1=new JLabel("FAMILY:");
        family=new JTextField(15);
        JLabel PHONENUMBER1=new JLabel("PHONE NUMBER:");
        phonenumber=new JTextField(11);
        JLabel ADDRES1=new JLabel("ADDRES:");
        addres=new JTextField(20);
        JLabel USERNAME1=new JLabel("USERNAME:");
        username=new JTextField(10);
        JLabel PASSWORD1=new JLabel("PASSWORD:");
        password=new JPasswordField(12);
        JLabel PASSWORD2=new JLabel("confirm pass:");
        confirmpassword=new JPasswordField(12);
        JButton okbutton=new JButton("OK");
        this.add(MCODE1);
        MCODE1.setBounds(100,40,100,18);
        this.add(mellicode);
        mellicode.setBounds(200,40,150,18);
        this.add(NAME1);
        NAME1.setBounds(100,70,100,18);
        this.add(name);
        name.setBounds(200,70,150,18);
        this.add(FAMILY1);
        FAMILY1.setBounds(100,100,100,18);
        this.add(family);
        family.setBounds(200,100,150,18);
        this.add(PHONENUMBER1);
        PHONENUMBER1.setBounds(100,130,100,18);
        this.add(phonenumber);
        phonenumber.setBounds(200,130,150,18);
        this.add(USERNAME1);
        USERNAME1.setBounds(100,160,100,18);
        this.add(username);
        username.setBounds(200,160,150,18);
        this.add(PASSWORD1);
        PASSWORD1.setBounds(100,190,100,18);
        this.add(password);
        password.setBounds(200,190,150,18);
        this.add(PASSWORD2);
        PASSWORD2.setBounds(100,220,100,18);
        this.add(confirmpassword);
        confirmpassword.setBounds(200,220,150,18);
        okbutton.setBounds(180,280,95,30);
        this.add(okbutton);
        this.setLayout(null);
        this.setVisible(true);

    }
}
