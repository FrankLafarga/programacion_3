package programacion_3;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Botones extends JButton {
	private int posicion;
	private boolean estado;
	Color fondo = new Color(29, 10, 79);
	Color linea = new Color(123, 29, 211);

	
	public Botones(int posicion) {
		this.posicion=posicion;
		this.estado=true;
		setVerticalAlignment(SwingConstants.CENTER);
		setFocusable(false);
		setFont(new Font("Segoe UI", Font.BOLD, 150));
		setBorder(new LineBorder(linea, 3));
		setBackground(fondo);
		
	}


	public int getPosicion() {
		return posicion;
	}


	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}


	public boolean getEstado() {
		return estado;
	}


	public void setEstado(boolean b) {
		this.estado = b;
	}
	

}
