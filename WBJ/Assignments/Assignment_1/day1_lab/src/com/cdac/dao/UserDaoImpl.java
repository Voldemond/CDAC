package com.cdac.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.cdac.pojos.User;
import static com.cdac.utils.DBUtils.*;

public class UserDaoImpl implements UserDao {
    // state -
    private Connection connection;
    private PreparedStatement pst1, pst2, pst3, pst4, pst5;

    // Constructor
    public UserDaoImpl() throws SQLException {
        // 1. Open connection
        connection = openConnection();
        // 2. Prepare statements
        pst1 = connection.prepareStatement("select * from users where role=?");
        pst2 = connection.prepareStatement("insert into users values(default,?,?,?,?,?,?,?)");
        pst3 = connection.prepareStatement("update users set password=? where id=?");
        pst4 = connection.prepareStatement("delete from users where id=?");
        pst5 = connection.prepareStatement("select * from users where email=? and password=?");
        System.out.println("UserDaoImpl created!");
    }

    @Override
    public List<User> fetchUserDetailsByRole(String role) throws SQLException {
        List<User> users = new ArrayList<>();
        pst1.setString(1, role);
        try (ResultSet rst = pst1.executeQuery()) {
            while (rst.next()) {
                users.add(new User(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4),
                        rst.getString(5), rst.getDate(6), rst.getBoolean(7), rst.getString(8)));
            }
        }
        return users;
    }

    @Override
    public String registerVoter(User newVoter) throws SQLException {
        pst2.setString(1, newVoter.getFirstName());
        pst2.setString(2, newVoter.getLastName());
        pst2.setString(3, newVoter.getEmail());
        pst2.setString(4, newVoter.getPassword());
        pst2.setDate(5, newVoter.getDob());
        pst2.setBoolean(6, newVoter.isStatus());
        pst2.setString(7, newVoter.getUserRole());
        int updateCount = pst2.executeUpdate();
        if (updateCount == 1)
            return "User registered successfully!";
        return "User registration failed!";
    }

    @Override
    public String changePassword(int userId, String newPassword) throws SQLException {
        pst3.setString(1, newPassword);
        pst3.setInt(2, userId);
        int updateCount = pst3.executeUpdate();
        if (updateCount == 1)
            return "Password updated successfully!";
        return "Password update failed!";
    }

    @Override
    public String deleteUser(int userId) throws SQLException {
        pst4.setInt(1, userId);
        int updateCount = pst4.executeUpdate();
        if (updateCount == 1)
            return "User deleted successfully!";
        return "User deletion failed!";
    }

    @Override
    public User signIn(String email, String password) throws SQLException {
        pst5.setString(1, email);
        pst5.setString(2, password);
        try (ResultSet rst = pst5.executeQuery()) {
            if (rst.next()) {
                return new User(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4),
                        rst.getString(5), rst.getDate(6), rst.getBoolean(7), rst.getString(8));
            }
        }
        return null; // Sign-in failed
    }

    @Override
    public void cleanUp() throws SQLException {
        if (pst1 != null)
            pst1.close();
        if (pst2 != null)
            pst2.close();
        if (pst3 != null)
            pst3.close();
        if (pst4 != null)
            pst4.close();
        if (pst5 != null)
            pst5.close();
        closeConnection();
        System.out.println("UserDaoImpl cleaned up!");
    }
}
