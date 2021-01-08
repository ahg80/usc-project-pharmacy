package com.company;

import com.company.service.Service;
import com.company.view.*;
import com.company.repository.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<String> usernames1 = new ArrayList<>();
    public static List<String> passes1 = new ArrayList<>();
    public static void main(String[] args) throws Exception {

        Login app1 = new Login();
        MainMenu apptest2=new MainMenu();
        MedicinesTable test3=new MedicinesTable();
        OrdersTable o1=new OrdersTable();
        NewEmployee e1=new NewEmployee();
        NewOrder o2=new NewOrder();
        NewMedicine m1=new NewMedicine();
        EmployeeTable et1=new EmployeeTable();
        Edit ee=new Edit();
        Service.getInstance().report();
       usernames1.addAll(ConnectDB.usernames);
       passes1.addAll(ConnectDB.passwords);

    }
}
