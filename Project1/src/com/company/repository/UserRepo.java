package com.company.repository;

import com.company.entity.EmployeeEntity;
import com.company.entity.UserEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserRepo implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;
    public static List<String> usernames = new ArrayList<>();
    public static List<String> passwords = new ArrayList<>();
    public UserRepo() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pharmacy", "myjava123");
        connection.setAutoCommit(false);
    }
    public void insertNewUser(UserEntity entity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into users (USERNAME,PASSWORD) values (?,?)");
        preparedStatement.setString(1, entity.getUSERNAME());
        preparedStatement.setString(2, entity.getPASSWORD());
        preparedStatement.executeUpdate();
    }
    public List<UserEntity> selectuser() throws Exception {
        preparedStatement = connection.prepareStatement("select * from users");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<UserEntity> UserList = new ArrayList<>();
        while (resultSet.next()) {
            UserEntity entity1 = new UserEntity();
            System.out.println(resultSet.getString(1)+resultSet.getString(2));
            entity1.setUSERNAME(resultSet.getString(1));
            entity1.setPASSWORD(resultSet.getString(2));
            UserList.add(entity1);
            usernames.add(resultSet.getString(1));
            passwords.add(resultSet.getString(2));
        }
        return UserList;
    }
    @Override
    public void close() throws Exception {

    }
}
