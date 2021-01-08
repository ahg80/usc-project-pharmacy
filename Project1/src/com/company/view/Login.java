package com.company.view;

import com.company.entity.UserEntity;
import com.company.repository.ConnectDB;
import com.company.repository.UserRepo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Login extends JFrame {
    private String value1, value2;
    public int index;
    public String header, message;
    JFrame f=new JFrame();

    private void Dialogerror(String message, String header) {
        JOptionPane.showMessageDialog(f, message, header, JOptionPane.ERROR_MESSAGE);
    }
    public Login() {
        this("Login");
    }

    public Login(String LOGIN) {
        super(LOGIN);

        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lbl1 = new JLabel("USERNAME:");
        final JTextField tf1, pf2;
        tf1 = new JTextField(10);
        JLabel lbl2 = new JLabel("PASSWORD:");
        pf2 = new JPasswordField(10);
        JButton loginbutton = new JButton("LOGIN");
        this.add(lbl1);
        lbl1.setBounds(100, 50, 100, 100);
        this.add(tf1);
        tf1.setBounds(180, 94, 150, 18);
        this.add(lbl2);
        lbl2.setBounds(100, 80, 100, 100);
        pf2.setBounds(180, 124, 150, 18);
        this.add(pf2);
        this.add(loginbutton);

        loginbutton.setBounds(200, 200, 95, 30);
        class ListenToClick implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame f=new JFrame();
                String username=tf1.getText();
                String password=pf2.getText();
                  if (tf1.getText().equals("") || tf1.getText().equals("enter username")){
                        Dialogerror("username cant be null","login error");
                            }

                  else if (pf2.getText().equals("") || pf2.getText().equals("enter password")) {
                        Dialogerror("password cant be null","login error");
                            }
                  else {
                      if (UserRepo.usernames.contains(username) == false) {
                          Dialogerror("username is not true", "login error");
                      } else {
                          index = UserRepo.usernames.indexOf(tf1.getText());
                          String pass = UserRepo.passwords.get(index);
                          if (password.equals(pass)) {
                              MainMenu menu = new MainMenu();
                          } else {
                              Dialogerror("password is not true", "login error");
                          }
                      }
                  }
            }
        }


        loginbutton.addActionListener(new ListenToClick());

        this.setLayout(null);
        this.setVisible(true);

    }

}

