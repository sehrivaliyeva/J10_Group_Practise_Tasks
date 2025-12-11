package lesson15lesson16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyClass {
    public static void main(String[] args) throws SQLException {

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123456")) {

        }

    }
}