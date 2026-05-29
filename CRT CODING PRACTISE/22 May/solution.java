/*
PROJECT NAME : LIBRARY FINE MANAGEMENT SYSTEM (BATCH PROCESSING)

DATABASE:

CREATE DATABASE library_batch;

USE library_batch;

CREATE TABLE members(
id INT PRIMARY KEY,
name VARCHAR(30),
book_days INT,
book_returned_days INT,
membership_type VARCHAR(20),
fine DOUBLE,
status VARCHAR(30)
);
*/

import java.sql.*;
import java.util.*;

public class solution {

    public static void main(String args[]) throws Exception {

        // Step 1: Load Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 2: Create Connection
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/library_batch",
                "root",
                "root"
        );

        // Step 3: Disable Auto Commit
        con.setAutoCommit(false);

        // Step 4: SQL Query
        String sql = "insert into members values(?,?,?,?,?,?,?)";

        // Step 5: Prepare Statement
        PreparedStatement ps = con.prepareStatement(sql);

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Number of Members : ");
        int n = in.nextInt();

        // Counters
        int noFineCount = 0;
        int lowFineCount = 0;
        int mediumFineCount = 0;
        int highFineCount = 0;
        int blacklistedCount = 0;

        // Process all members
        for (int i = 1; i <= n; i++) {

            System.out.println();
            System.out.println("Enter Member " + i + " Details");
            System.out.println("Id Name Book_Days Returned_Days Membership_Type");

            int id = in.nextInt();
            String name = in.next();
            int bookDays = in.nextInt();
            int returnedDays = in.nextInt();
            String membershipType = in.next();

            // Calculate Delay
            int delay = returnedDays - bookDays;

            double fine = 0;
            String status = "";

            // Rule 2: Fine Calculation
            if (delay <= 0) {
                fine = 0;
                status = "NO FINE";
            }

            else if (delay >= 1 && delay <= 5) {
                fine = delay * 2;
                status = "LOW FINE";
            }

            else if (delay >= 6 && delay <= 10) {
                fine = delay * 5;
                status = "MEDIUM FINE";
            }

            else {
                fine = delay * 10;
                status = "HIGH FINE";
            }

            // Rule 3: Membership Discount
            if (membershipType.equalsIgnoreCase("GOLD")) {
                fine = fine - (fine * 0.20);
            }

            else if (membershipType.equalsIgnoreCase("SILVER")) {
                fine = fine - (fine * 0.10);
            }

            // Rule 4: Blacklist Rule
            if (bookDays > 14 && delay > 5 && !status.equals("NO FINE")) {
                status = "BLACKLISTED";
            }

            // Counters
            if (status.equals("NO FINE")) {
                noFineCount++;
            }

            else if (status.equals("LOW FINE")) {
                lowFineCount++;
            }

            else if (status.equals("MEDIUM FINE")) {
                mediumFineCount++;
            }

            else if (status.equals("HIGH FINE")) {
                highFineCount++;
            }

            else if (status.equals("BLACKLISTED")) {
                blacklistedCount++;
            }

            // Pass Values into Query
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, bookDays);
            ps.setInt(4, returnedDays);
            ps.setString(5, membershipType);
            ps.setDouble(6, fine);
            ps.setString(7, status);

            // Store in Batch
            ps.addBatch();

            System.out.println("Record Added To Batch");
        }

        // Execute Batch
        int result[] = ps.executeBatch();

        // Commit Changes
        con.commit();

        // Final Report
        System.out.println();
        System.out.println("======= FINAL REPORT =======");

        System.out.println("Total Records Inserted = " + result.length);
        System.out.println("No Fine Members = " + noFineCount);
        System.out.println("Low Fine Members = " + lowFineCount);
        System.out.println("Medium Fine Members = " + mediumFineCount);
        System.out.println("High Fine Members = " + highFineCount);
        System.out.println("Blacklisted Members = " + blacklistedCount);

        // Close Resources
        ps.close();
        con.close();
        in.close();

        System.out.println("Database Closed");
    }
}