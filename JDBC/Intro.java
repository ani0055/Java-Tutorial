package JDBC;

import java.sql.*;
import java.util.Scanner;


// steps:
// 1.import libraries -> java.sql.*;
// 2.load and register the driver -> com.mysql.jdbc.Driver use class.forName("")
// 3.create connection -> create an object of connectioon interface 
// 4.create a statement -> create an object of Statement
// 5.execute the query
// 6.process the results
// 7.close

public class Intro {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://127.0.0.1:3306/aliens";
        String password = "Anistar@7259";
        String Username = "root";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll no : ");
        int roll_no = sc.nextInt();
        System.out.println("Enter the Name : ");
        String Name = sc.next(); 
        String query =  "insert into students values (?,?)";

        // Class.forName("com.mysql.cj.jdbc.Driver"); //JDBC 4.0, MySQL driver auto-loads
        Connection con = DriverManager.getConnection(url,Username,password);

        PreparedStatement ps = con.prepareStatement(query);
        Statement st = con.createStatement();

        ps.setInt(1, roll_no);
        ps.setString(2, Name);

        int count = ps.executeUpdate();

        System.out.println(count + " rows affected");

        ResultSet rs = st.executeQuery("SELECT * FROM students");
        while(rs.next()){
            System.out.println(rs.getInt("roll_no")+" "+rs.getString("stud_name"));
        }

        rs.close();
        st.close();
        con.close();
        ps.close();
        sc.close();
    }
}
