package com.lee.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
   public static void main(String[] args) throws Exception {

      // register MySQL thin driver with DriverManager service
      // It is optional for JDBC4.x version
      Class.forName("com.mysql.cj.jdbc.Driver");
      //jdbc:mysql://localhost:3306/?user=root
      // variables
      final String url = "jdbc:mysql://localhost:3306/?user=root";
      final String user = "root";
      final String password = "bbbbbb";

      // establish the connection
      Connection con = DriverManager.getConnection(url, user, password);

      // display status message
      if (con == null) {
         System.out.println("JDBC connection is not established");
         return;
      } else
         System.out.println("Congratulations," + 
              " JDBC connection is established successfully.\n");

      // close JDBC connection
      con.close();

   } 
}