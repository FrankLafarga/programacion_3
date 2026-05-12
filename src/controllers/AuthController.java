package controllers;
import models.AuthModel;
import models.UserModel;
import views.AppView;
import views.AuthView;

public class AuthController {

    private AuthModel model;
    private AuthView view;
    private AppView app;
    private UserModel usuarioActivo;


    public AuthController() {
    	model= new AuthModel();
    	view= new AuthView();
    }
    
    public void login() {
    	view.login();
    }

    public boolean autenticar(String usuario, String password) {
        UserModel u = model.validarUsuario(usuario, password);

        if (u!=null) {     
            usuarioActivo = u;
        	app = new AppView();
        	
           
            return true;
        } else { return false; 
        	}
    }
    
    public void logout() {
        usuarioActivo = null;
       // app.dispose();
        view.login();
    }    
    
}