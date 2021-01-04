package com.example.XiaoYuanLunTan.Util;

import java.sql.*;

public class BaseDao {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    private Statement statement;

    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/pers",
                    "peter",
                    "REN_wen_123");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Test",
                    "hl",
                    "Hailong.0616");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
    public ResultSet executeQuery(String sql, Object... params){
        connection = getConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                System.out.println(params[i]);
                preparedStatement.setObject(i + 1, params[i]);
            }
            return preparedStatement.executeQuery();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public int executeUpdate(String sql, Object... params) {
        connection = getConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                System.out.println(params[i]);
                preparedStatement.setObject(i + 1, params[i]);
            }
            return preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("2");
        }
        return -1;
    }
}
