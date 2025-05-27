package com.besant.packages.jdbc;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        //steps to connect java to DB
        //create a driver
        //create a connection --auth
        //preapring the query
        //excecute the query
        //close the connections
        PreparedStatement statement Connection connection;
        try {
            //creating a driver
            Class.forName("com.mysql.cj.jsbc.Driver");
            //create a connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Gauri@1029");
//step 3
            //prepare the query
            statement = connection.prepareStatement("insery into user (name) values ('nmae1')");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
//step 4
//excecute the query
        statement.executeUpdate();
catch(Exception e)
        //TODO : handle exception
        connection.close();
    }
}