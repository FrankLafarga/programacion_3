package controllers;

import models.AuthModel;
import views.AuthView;

public class AuthController {

    private AuthView vista;
    private AuthModel modelo;

    public AuthController() {
        modelo = new AuthModel();
        vista = new AuthView(this);
    }
    public void showLogin() {
        vista.login();;
    }

    public boolean login(String user, String pass) {
        return modelo.acces(user, pass);
    }
}