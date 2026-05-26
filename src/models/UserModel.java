package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserModel {

    private Connection conn;

    public UserModel() {

        conn=Conexion.getConexion();

    }

    public ArrayList<User> obtenerUsuarios() {

        ArrayList<User> listaUsuarios=new ArrayList<>();

        try {

            String sql="SELECT * FROM usuarios";

            PreparedStatement ps=conn.prepareStatement(sql);

            ResultSet rs=ps.executeQuery();

            while(rs.next()) {

                User user=new User();

                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setNombreCompleto(
                        rs.getString("nombre_completo")
                );

                listaUsuarios.add(user);

            }

            rs.close();
            ps.close();

        } catch(Exception e) {

            System.out.println(e.getMessage());

        }

        return listaUsuarios;

    }

    public boolean registrarUsuario(User u) {

        try {

            String sql="""
                INSERT INTO usuarios
                (username,password,nombre_completo)
                VALUES(?,?,?)
            """;

            PreparedStatement ps=
                    conn.prepareStatement(sql);

            ps.setString(1,u.getUsername());
            ps.setString(2,u.getPassword());
            ps.setString(3,u.getNombreCompleto());

            int filas=ps.executeUpdate();

            ps.close();

            return filas>0;

        } catch(Exception e){

            System.out.println(e.getMessage());

        }

        return false;

    }

}