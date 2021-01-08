package com.company.view;

import javax.swing.*;

public class MainMenu extends JFrame {
    public MainMenu() {
        this("Menu");
    }

    public MainMenu(String MainMenu) {
        super(MainMenu);
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton medicinesbutton=new JButton("medicines");
        JButton ordersbutton=new JButton("orders");
        JButton newemployeebutton=new JButton("new employee");
        JButton neworderbutton=new JButton("new order");
        JButton addMedicinesbutton=new JButton("add medicines");
        JButton logoutbutton=new JButton("logout");
        medicinesbutton.setBounds(130,60,200,40);
        this.add(medicinesbutton);
        ordersbutton.setBounds(130,110,200,40);
        this.add(ordersbutton);
        newemployeebutton.setBounds(40,160,120,40);
        this.add(newemployeebutton);
        neworderbutton.setBounds(170,160,120,40);
        this.add(neworderbutton);
        addMedicinesbutton.setBounds(300,160,120,40);
        this.add(addMedicinesbutton);
        logoutbutton.setBounds(190,230,80,40);
        this.add(logoutbutton);
        this.setLayout(null);
        this.setVisible(true);

    }
}
