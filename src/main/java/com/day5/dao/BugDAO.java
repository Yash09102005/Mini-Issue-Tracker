package com.day5.dao;

import com.day5.model.Bug;
import com.day5.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BugDAO {

    // ADD BUG
    public void addBug(Bug bug) {

        String query = "INSERT INTO bugs(title, description, status) VALUES (?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
                PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, bug.getTitle());
            pst.setString(2, bug.getDescription());
            pst.setString(3, bug.getStatus());

            pst.executeUpdate();

            System.out.println("Bug Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // VIEW BUGS
    public void viewBugs() {

        String query = "SELECT * FROM bugs";

        try (Connection con = DBConnection.getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query)) {

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("title") + " | " +
                                rs.getString("description") + " | " +
                                rs.getString("status"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE STATUS
    public void updateStatus(int id, String status) {

        String query = "UPDATE bugs SET status=? WHERE id=?";

        try (Connection con = DBConnection.getConnection();
                PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, status);
            pst.setInt(2, id);

            int rows = pst.executeUpdate();

            if (rows > 0) {
                System.out.println("Status Updated");
            } else {
                System.out.println("Bug ID not found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE BUG
    public void deleteBug(int id) {

        String query = "DELETE FROM bugs WHERE id=?";

        try (Connection con = DBConnection.getConnection();
                PreparedStatement pst = con.prepareStatement(query)) {

            pst.setInt(1, id);

            int rows = pst.executeUpdate();

            if (rows > 0) {
                System.out.println("Bug Deleted");
            } else {
                System.out.println("Bug ID not found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}