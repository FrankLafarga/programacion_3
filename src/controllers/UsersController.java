package controllers;

import java.util.ArrayList;

import models.User;
import models.UserModel;
import views.AppView;

public class UsersController {

    private AppView vista;
    private UserModel modelo;

    public UsersController() {

        modelo = new UserModel();
        vista = new AppView(this);

    }

    public ArrayList<User> obtenerUsuarios() {

        return modelo.obtenerUsuarios();

    }

    public boolean addUser(String correo, String password, String nombre) {

        User u = new User();

        u.setUsername(correo);
        u.setPassword(password);
        u.setNombreCompleto(nombre);

        return modelo.registrarUsuario(u);

    }

}