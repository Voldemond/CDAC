package com.cdac.tester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import com.cdac.dao.BankAccountDaoImpl;

public class TestStoredFunction {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/advjava";
        String user = "root";
        String password = "cdac";

        try (Connection connection = DriverManager.getConnection(jdbcURL, user, password);
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Connected to the database!");
            BankAccountDaoImpl dao = new BankAccountDaoImpl(connection);

            System.out.println("Enter source account ID: ");
            int srcAccountId = scanner.nextInt();

            System.out.println("Enter destination account ID: ");
            int destAccountId = scanner.nextInt();

            System.out.println("Enter transfer amount: ");
            double amount = scanner.nextDouble();

            double updatedBalance = dao.transferFunds(srcAccountId, destAccountId, amount);
            System.out.println("Funds transferred successfully!");
            System.out.println("Updated balance of destination account: " + updatedBalance);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
