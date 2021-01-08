package com.company.view;

import javax.swing.*;

public class EmployeeTable extends JFrame {
    public EmployeeTable() {
        this("Employees");
    }

    public EmployeeTable(String EmployeeTable) {
        super(EmployeeTable);
        this.setSize(500, 400);
        String data[][]={ {"101","Amit","670000","NGFUN","GHCTUG"},
                {"102","Jai","780000","DXGK","GFDHJKB"},
                {"101","Sachin","700000","VG","FDYVBH"}};
        String column[]={"MELLICODE","NAME","FAMILY","PHONE NUMBER","ADDRES"};
        JTable empt=new JTable(data,column);
        empt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(empt);

        JButton EditButton=new JButton("Edit");
        EditButton.setBounds(190,300,95,40);
        this.add(EditButton);
        this.add(sp);
        this.setVisible(true);
    }
}
