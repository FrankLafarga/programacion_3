package programacion_3;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Icono extends JLabel{

	public Icono(String nombre, int x,int y) {
		ImageIcon icono = new ImageIcon(getClass().getResource("/programacion_3/resources/"+nombre));
		setSize(x,y);	
		Image img = icono.getImage().getScaledInstance(x, y, Image.SCALE_SMOOTH);
		setIcon(new ImageIcon(img));
	}	
	
	public Icono(String nombre, int ancho, int alto, boolean verdad) {
        ImageIcon icono = new ImageIcon(
            getClass().getResource("/programacion_3/resources/" + nombre)
        );

        setIcon(icono);      
        setSize(ancho,alto);
        setOpaque(false);
    }

}
	
