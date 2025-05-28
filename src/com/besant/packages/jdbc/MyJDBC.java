package com.besant.packages.jdbc;

import java.nio.channels.ScatteringByteChannel;
import java.sql.*;

public class MyJDBC {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc",
                    "root", "Gauri@1029"
            );

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM user");

            while(resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }

        }
        catch(SQLException e){
            e.printStackTrace();
        }
        }


}

