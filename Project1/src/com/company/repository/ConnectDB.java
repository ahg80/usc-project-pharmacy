package com.company.repository;

import com.company.entity.EmployeeEntity;
import com.company.entity.MedicinesEntity;
import com.company.entity.ParchasedMedicinesEntuty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ConnectDB implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;
    public static List<String> usernames = new ArrayList<>();
    public static List<String> passwords = new ArrayList<>();
    public ConnectDB() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pharmacy", "myjava123");
        connection.setAutoCommit(false);
    }
    public void insertNewEmployee(EmployeeEntity entity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into employeesinfo (MELLICODE, NAME, FAMILY, PHONENUM, CITY, STREET, ALLEY, PELAKNUM) values (?,?,?,?,?,?,?,?)");
        preparedStatement.setLong(1, entity.getMELLICODE());
        preparedStatement.setString(2, entity.getNAME());
        preparedStatement.setString(3, entity.getFAMILY());
        preparedStatement.setLong(4, entity.getPHONENUM());
        preparedStatement.setString(5, entity.getCITY());
        preparedStatement.setString(6, entity.getSTREET());
        preparedStatement.setString(7, entity.getALLEY());
        preparedStatement.setInt(8, entity.getPELAKNUM());
        preparedStatement.executeUpdate();
    }

    public void insertNewMedicine(MedicinesEntity  entity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into medicines (CODE, NAME, NUM, PRICE, EXPDATE) values (?,?,?,?,?)");
        preparedStatement.setInt(1, entity.getCODE());
        preparedStatement.setString(2, entity.getNAME());
        preparedStatement.setInt(3, entity.getNUM());
        preparedStatement.setInt(4, entity.getPRICE());
        preparedStatement.setDate(5, entity.getEXPDATE());
        preparedStatement.executeUpdate();
    }
    public void insertNewParchasedMedicines(ParchasedMedicinesEntuty entity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into parchasedmedicines (CODE, NAME, NUM, PRICE, DRAGSTORENAME, ORDERSDATE, EXPDATE) values (?,?,?,?,?,?,?)");
        preparedStatement.setInt(1, entity.getCODE());
        preparedStatement.setString(2, entity.getNAME());
        preparedStatement.setInt(3, entity.getNUM());
        preparedStatement.setInt(4, entity.getPRICE());
        preparedStatement.setString(5, entity.getDRAGSTORE());
        preparedStatement.setDate(6, entity.getORDERSDATE());
        preparedStatement.setDate(7, entity.getEXPDATE());
        preparedStatement.executeUpdate();
    }


    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}
