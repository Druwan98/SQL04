package exercise;

import java.sql.*;

public class SQL04 {
    public static void main(String[] args) {

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "Asdasd123stella.");
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from student");

            while (resultSet.next()) {
                String first_name = resultSet.getString("first_name");
                String last_name = resultSet.getString("last_name");
                String country = resultSet.getString("country");
                String[] surname = {last_name};
                System.out.println("Nome: " + first_name + " - " + "Cognome: " + surname[0] + " - " + "Nazionalità: " + country);


            }

        } catch (SQLException e) {
            e.getMessage();
        }

    }
}
