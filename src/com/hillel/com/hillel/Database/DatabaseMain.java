package com.hillel.com.hillel.Database;

import java.sql.*;

/**
 * Created by VZhuchkovsky on 06.07.2015.
 */
/*CREATE TABLE store (name VARCHAR(20) PRIMARY KEY, category VARCHAR(20), price INTEGER);
        select * from store
        INSERT INTO store (name, category, price) VALUES('Mouse', 'Computers', 20);
        INSERT INTO store (name, category, price) VALUES('Gear', 'Machinery', 20);
        UPDATE store set price = 25 where name = 'Mouse'
        DELETE FROM store WHERE name = 'Mouse'
        */
public class DatabaseMain {
    public static void main(String[] args) throws SQLException {
        System.setProperty("jdbc.drivers", "org.postgresql.Driver");

        String connectionString = "jdbc:postgresql://localhost:5432/postgres";

        Connection connection = DriverManager.getConnection(connectionString, "postgres", "postgres");

        read(connection);

        //updateCurrent(connection, 34, "Mouse");
        update(connection, 10, "Mouse' or ''='");

        //updateWithInjection(connection, 10, "Mouse' or ''='");

        delete(connection, "name1");
        delete(connection, "name2");
        delete(connection, "name3");

        read(connection);

        connection.close();
    }

    private static void delete(Connection connection, String name) throws SQLException {
        String sql = "DELETE FROM store WHERE name = ?";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, name);

        statement.executeUpdate();
        statement.close();

    }

    private static void update(Connection connection, int price, String name) throws SQLException {
        String sql = "UPDATE store SET price = ? WHERE name = ?";

        PreparedStatement statement = connection.prepareStatement(sql);


        statement.setInt(1, price);
        statement.setString(2, name);

        statement.executeUpdate();

        System.out.println(statement.toString());
        statement.close();
    }

    private static void updateWithInjection(Connection connection, int newPrice, String name) throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "UPDATE store SET price = " + newPrice + " WHERE name = '" + name + "'";
        System.out.println("update command: " + sql);

        statement.executeUpdate(sql);

        statement.close();

    }

    private static void read(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "SELECT name, category, price FROM store";
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            String name = resultSet.getString("name");
            String category = resultSet.getString("category");
            Integer price = resultSet.getInt("price");
            Product product = new Product(name, category, price, null);
            System.out.println(product);
        }

        resultSet.close();
        statement.close();
    }
}