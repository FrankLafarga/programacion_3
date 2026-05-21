package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AuthModel {

    private Connection conn;

    public AuthModel() {

        try {

            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/programacion",
                    "root",
                    "educadex2026"
            );


        } catch(Exception e) {

            System.out.println("Error de conexion: " + e.getMessage());

        }

    }

    public boolean acces(String user, String password) {

        try {

            String sql = """
                SELECT * FROM admin
                WHERE username = ?
                AND password = ?
            """;

            PreparedStatement pass = conn.prepareStatement(sql);

            pass.setString(1, user);
            pass.setString(2, password);

            ResultSet rs = pass.executeQuery();

            if(rs.next()) {

                return true;

            }

        } catch (Exception e) {

            System.out.println("Error query: " + e.getMessage());

        }

        return false;
    }

}