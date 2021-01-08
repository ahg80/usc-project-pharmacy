package com.company.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Edit extends JFrame {
    public Edit() {
        this("edit info");
    }

    public Edit(String Edit) {
        super(Edit);
        this.setSize(500, 400);
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        JTabbedPane tp=new JTabbedPane();
        tp.setBounds(0,0,500,400);
        tp.add("orders",p1);
        tp.add("medicines",p2);
        tp.add("employee",p3);
        JTextField adad=new JTextField(10);
        JLabel lbl1=new JLabel("enter medicine code");
        JButton edbu=new JButton("DELETE");
        JButton dbu=new JButton("EDIT");
        JTextField adad2=new JTextField(10);
        JLabel lbl2=new JLabel("enter medicine code");
        JButton edbu2=new JButton("DELETE");
        JButton dbu2=new JButton("EDIT");
        JTextField adad3=new JTextField(10);
        JLabel lbl3=new JLabel("enter mellicode");
        JButton edbu3=new JButton("DELETE");
        JButton dbu3=new JButton("EDIT");
        p1.add(lbl1);
        p1.add(adad);
        p1.add(edbu);
        p1.add(dbu);
        p2.add(lbl2);
        p2.add(adad2);
        p2.add(edbu2);
        p2.add(dbu2);
        p3.add(lbl3);
        p3.add(adad3);
        p3.add(edbu3);
        p3.add(dbu3);
        class ListenToClick implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==edbu){

                }
                else if(e.getSource()==dbu){

                }
                else if(e.getSource()==dbu2){

                }
                else if(e.getSource()==edbu2){

                }
                else if(e.getSource()==dbu3){

                }
                else if(e.getSource()==edbu){

                }
            }
        }
        edbu.addActionListener(new ListenToClick());
        dbu.addActionListener(new ListenToClick());
        this.add(tp);
        this.setLayout(null);
        this.setVisible(true);
    }
}