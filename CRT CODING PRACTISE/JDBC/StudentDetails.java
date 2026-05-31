import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDetails {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3307/student_db";
        String user = "root";
        String password = "";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            Statement st = con.createStatement();

            String query = "SELECT * FROM students";

            ResultSet rs = st.executeQuery(query);

            System.out.println("Student Details:");
            System.out.println("---------------------------------------------");

            while(rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("student_name");
                int age = rs.getInt("age");
                String dept = rs.getString("dept");
                double salary = rs.getDouble("salary");
                String gender = rs.getString("gender");

                System.out.println(
                    "ID: " + id +
                    ", Name: " + name +
                    ", Age: " + age +
                    ", Dept: " + dept +
                    ", Salary: " + salary +
                    ", Gender: " + gender
                );
            }

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}