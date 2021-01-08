package com.company.view;

import javax.swing.*;

public class OrdersTable extends JFrame {
    public OrdersTable() {
        this("ORDERS");
    }

    public OrdersTable(String OrdersTable) {
        super(OrdersTable);
        this.setSize(500, 400);
        String data[][]={ {"101","Amit","670000","NGFUN","GHCTUG"},
                {"102","Jai","780000","DXGK","GFDHJKB"},
                {"101","Sachin","700000","VG","FDYVBH"}};
        String column[]={"CODE","NAME","NUMBER","dragstore","price"};
        JTable jt=new JTable(data,column);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);
        JButton EditButton=new JButton("Edit");
        EditButton.setBounds(190,300,95,40);
        this.add(EditButton);
        this.add(sp);
        this.setVisible(true);
    }
}
