package com.klachko.jdbc;

import java.sql.*;

/**
 * Created by User on 05.02.2018.
 */
public class Main {
    private static final String url="jdbc:mysql://localhost:3306/labor_sql?serverTimezone=UTC&useSSL=false";
    private static final String user="root";
    private static final String password="root";

    private static Connection connection=null;
    private static Statement statement=null;
    private static ResultSet rs=null;

    public static void main(String[] args) {
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection(url, user, password);
            statement=connection.createStatement();
            rs=statement.executeQuery("INSERT into pc value('1112', 'aaa',322,4,12,'y',2323)");
            while (rs.next()){
                int count=rs.getInt(1);
                System.out.println(rs.getInt(3));


            }

        }catch (Exception e){

        }
    }
}
