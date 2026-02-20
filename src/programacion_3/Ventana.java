package programacion_3;


import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame {
	
	public Ventana() {
		this.setVisible(true);
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(700,700));
		this.setTitle("Banca Móvil Penny Bank");
		this.setBackground(Color.GREEN);
		JLabel et = new JLabel();
		et.setText("Bienvenido a la banca movil de Penny Bank");
		this.add(et);
	}

}