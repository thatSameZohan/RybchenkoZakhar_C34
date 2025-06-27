package org;

import java.sql.*;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws SQLException {

        Connection connection=DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "5784");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string");
        String s = scanner.nextLine();

        while (!s.isEmpty()){
            PreparedStatement preparedStatement=connection.prepareStatement("insert into enterstrings (enterstring) values (?)");
            preparedStatement.setString(1, s);
            preparedStatement.execute();
            preparedStatement.close();
            System.out.println("Enter the string");
            s=scanner.nextLine();
        }

        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select enterstring from enterstrings");

        while (resultSet.next()){
            System.out.println(resultSet.getString("enterstring"));
        }

        statement.close();
        connection.close();




//        Statement statement=connection.createStatement();
//        statement.execute("insert into enterstrings (enterstring) valuses");
//        statement.execute("insert into persons (name, password, salary) values
//                ('Zhulik', 'qwezxc', 5000);
//        ResultSet resultSet=statement.executeQuery("select * from persons");
//        while (resultSet.next()){
//            System.out.println(resultSet.getInt(4));
//        }
//        Person person=new Person("Roman","rrr333", 2700);
//        PreparedStatement preparedStatement=connection
//                .prepareStatement("insert into persons (name, password, salary) values (?,?,?)");
//        preparedStatement.setString(1, person.getName());
//        preparedStatement.setString(2, person.getPassword());
//        preparedStatement.setInt(3, person.getSalary());
//        preparedStatement.execute();
//        statement.close();
//        connection.close();

    }
}
