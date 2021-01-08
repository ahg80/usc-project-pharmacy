package com.company.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepo implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;
    public EmployeeRepo() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pharmacy", "myjava123");
        connection.setAutoCommit(false);
    }

    @Override
    public void close() throws Exception {

    }
}
