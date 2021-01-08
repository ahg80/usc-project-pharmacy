package com.company.view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MedicinesTable extends JFrame {
    public MedicinesTable() {
        this("medicines");
    }

    public MedicinesTable(String MedicinesTable) {
        super(MedicinesTable);
        this.setSize(500, 400);
        String data[][]={ {"101","Amit","670000","NGFUN","GHCTUG"},
                {"102","Jai","780000","DXGK","GFDHJKB"},
                {"101","Sachin","700000","VG","FDYVBH"}};
        String column[]={"CODE","NAME","NUMBER","PRICE","Expiration"};
        JTable mt=new JTable(data,column);
        mt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(mt);

        JButton EditButton=new JButton("Edit");
        EditButton.setBounds(190,300,95,40);

        this.add(EditButton);
        this.add(sp);
        this.setVisible(true);
    }
}