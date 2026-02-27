package programacion_3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaCalculadora extends JFrame{
	Color gris = new Color(40,40,40);
	Color grisClaro = new Color(170,170,170);

	Color naranja = new Color(200,125,10);
	public VentanaCalculadora() {
		
		this.setVisible(true);
		this.setSize(350,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(350,400));
		this.setMaximumSize(new Dimension(350,400));
		this.setTitle("Calculadora");
		this.setLayout(null);
		this.getContentPane().setBackground(Color.BLACK);
		
		JPanel calculator= new JPanel();
		calculator.setSize(350,400);
		calculator.setLocation(0,0);
		calculator.setBackground(Color.black);
		calculator.setLayout(null);
		this.add(calculator);
		
		JButton cero = new JButton("0");
		cero.setBackground(gris);
		cero.setForeground(Color.white);
		cero.setBounds(5,310,80,45);
		cero.setFont(new Font("Tahoma", Font.BOLD, 13));
		calculator.add(cero);
		
		JButton punto = new JButton(".");
		punto.setBackground(gris);
		punto.setForeground(Color.white);
		punto.setFont(new Font("Tahoma", Font.BOLD, 13));
		punto.setBounds(90, 310, 80, 45);
		calculator.add(punto);
		
		JButton uno = new JButton("1");
		uno.setBackground(gris);
		uno.setForeground(Color.white);
		uno.setFont(new Font("Tahoma", Font.BOLD, 13));
		uno.setBounds(5, 260, 80, 45);
		calculator.add(uno);

		JButton dos = new JButton("2");
		dos.setBackground(gris);
		dos.setForeground(Color.white);
		dos.setFont(new Font("Tahoma", Font.BOLD, 13));
		dos.setBounds(90, 260, 80, 45);
		calculator.add(dos);

		JButton tres = new JButton("3");
		tres.setBackground(gris);
		tres.setForeground(Color.white);
		tres.setFont(new Font("Tahoma", Font.BOLD, 13));
		tres.setBounds(175, 260, 80, 45);
		calculator.add(tres);

		JButton cuatro = new JButton("4");
		cuatro.setBackground(gris);
		cuatro.setForeground(Color.white);
		cuatro.setFont(new Font("Tahoma", Font.BOLD, 13));
		cuatro.setBounds(5, 210, 80, 45);
		calculator.add(cuatro);

		JButton cinco = new JButton("5");
		cinco.setBackground(gris);
		cinco.setForeground(Color.white);
		cinco.setFont(new Font("Tahoma", Font.BOLD, 13));
		cinco.setBounds(90, 210, 80, 45);
		calculator.add(cinco);

		JButton seis = new JButton("6");
		seis.setBackground(gris);
		seis.setForeground(Color.white);
		seis.setFont(new Font("Tahoma", Font.BOLD, 13));
		seis.setBounds(175, 210, 80, 45);
		calculator.add(seis);

		JButton siete = new JButton("7");
		siete.setBackground(gris);
		siete.setForeground(Color.white);
		siete.setFont(new Font("Tahoma", Font.BOLD, 13));
		siete.setBounds(5, 160, 80, 45);
		calculator.add(siete);

		JButton ocho = new JButton("8");
		ocho.setBackground(gris);
		ocho.setForeground(Color.white);
		ocho.setFont(new Font("Tahoma", Font.BOLD, 13));
		ocho.setBounds(90, 160, 80, 45);
		calculator.add(ocho);

		JButton nueve = new JButton("9");
		nueve.setBackground(gris);
		nueve.setForeground(Color.white);
		nueve.setFont(new Font("Tahoma", Font.BOLD, 13));
		nueve.setBounds(175, 160, 80, 45);
		calculator.add(nueve);
		
		JButton igual = new JButton("=");
		igual.setBackground(naranja);
		igual.setForeground(Color.white);
		igual.setFont(new Font("Tahoma", Font.BOLD, 21));
		igual.setBounds(175, 310, 80, 45);
		calculator.add(igual);
		
		JButton mas = new JButton("+");
		mas.setBackground(naranja);
		mas.setForeground(Color.white);
		mas.setFont(new Font("Tahoma", Font.BOLD, 18));
		mas.setBounds(260, 310, 70, 45);
		calculator.add(mas);
		
		JButton menos = new JButton("-");
		menos.setBackground(naranja);
		menos.setForeground(Color.white);
		menos.setFont(new Font("Tahoma", Font.BOLD, 20));
		menos.setBounds(260, 260, 70, 45);
		calculator.add(menos);
		
		JButton mult = new JButton("X");
		mult.setBackground(naranja);
		mult.setForeground(Color.white);
		mult.setVerticalAlignment(JLabel.CENTER);
		mult.setFont(new Font("Tahoma", Font.BOLD, 15));
		mult.setBounds(260, 210, 70, 45);
		calculator.add(mult);
		
		JButton div = new JButton("/");
		div.setBackground(naranja);
		div.setForeground(Color.white);
		div.setFont(new Font("Tahoma", Font.BOLD, 18));
		div.setBounds(260, 160, 70, 45);
		calculator.add(div);
		
		JButton ce = new JButton("CE");
		ce.setBackground(grisClaro);
		ce.setForeground(Color.black);
		ce.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ce.setBounds(5, 110, 80, 45);
		calculator.add(ce);
		
		JLabel fondo  = new JLabel();
		fondo.setBackground(grisClaro);
		fondo.setBounds(90, 110, 240, 45);
		fondo.setOpaque(true);
		calculator.add(fondo);
		
		JTextField resultado = new JTextField();
		resultado.setSize(325,100);
		resultado.setLocation(5,5);
		resultado.setBackground(Color.black);
		resultado.setForeground(Color.white);
		resultado.setFont(new Font("Tahoma",Font.BOLD,20));
		calculator.add(resultado);
		
		this.repaint();
		
		
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
