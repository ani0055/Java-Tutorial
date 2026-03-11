// package JDBC;
import java.sql.*;

public class DAO {
    public static void main(String[] args) throws SQLException {
        studentDAO dao = new studentDAO();
        student s1 = new student();
        s1.roll_no = 13;
        s1.name = "Palak";
        dao.addStudent(s1);

        
    }
}

class studentDAO{

    private static final String URL =  "jdbc:mysql://127.0.0.1:3306/aliens";
    private static final String PASSWORD = "Anistar@7259";
    private static final String USERNAME = "root";
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public student getstudent(int roll_no) throws SQLException{
        student s = new student();
        s.roll_no = roll_no;
        String query = "SELECT stud_name FROM students WHERE roll_no ="+roll_no;
        Connection con = getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        s.name = rs.getString(1);   

        rs.close();
        st.close();
        con.close();

        return s;
    }

    public void addStudent(student s) throws SQLException{

        String query = "Insert into students values (?,?)";
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, s.roll_no);
        ps.setString(2, s.name);

        int count = ps.executeUpdate();

        System.out.println(count + " rows affected");

        con.close();
        ps.close();

    }
}

class student{
    int roll_no;
    String name;
}
