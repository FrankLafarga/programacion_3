package models;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    private static final String URL =
            "jdbc:mysql://sql12.freedb.tech:3306/freedb_programacion2026?useSSL=false&serverTimezone=UTC";

    private static final String USER =
            "freedbprog2026";

    private static final String PASSWORD =
            "Prog2026DB";

    public static Connection getConexion() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            return DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );

        } catch(Exception e) {

            System.out.println(
                    "Error conexión: "
                    +e.getMessage()
            );

        }

        return null;

    }

}