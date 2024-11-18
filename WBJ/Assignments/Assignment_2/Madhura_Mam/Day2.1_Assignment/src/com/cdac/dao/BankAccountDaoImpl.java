package com.cdac.dao;

import java.sql.Connection;
import java.sql.CallableStatement;

public class BankAccountDaoImpl {
    private Connection connection;

    public BankAccountDaoImpl(Connection connection) {
        this.connection = connection;
    }

    public double transferFunds(int srcAccountId, int destAccountId, double amount) throws Exception {
        String callFunction = "{? = call transfer_funds_func(?, ?, ?)}";
        try (CallableStatement cstmt = connection.prepareCall(callFunction)) {
            cstmt.registerOutParameter(1, java.sql.Types.DOUBLE); // Register return type
            cstmt.setInt(2, srcAccountId); // Set source account ID
            cstmt.setInt(3, destAccountId); // Set destination account ID
            cstmt.setDouble(4, amount); // Set transfer amount

            cstmt.execute(); // Execute the function
            return cstmt.getDouble(1); // Retrieve and return updated destination balance
        }
    }
}
