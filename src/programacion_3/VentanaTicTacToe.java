package programacion_3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.util.stream.IntStream;

import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

public class VentanaTicTacToe {

	private String turno="x";
	private int puntosX=0,puntosO=0;
	private JFrame VentanaTicTacToe;
	private JLabel lblNewLabel,lblNewLabel_1,lblNewLabel_2;
	Color fondo = new Color(29, 10, 79);
	Color linea = new Color(123, 29, 211);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaTicTacToe window = new VentanaTicTacToe();
					window.VentanaTicTacToe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaTicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	Botones[] tablero=new Botones[9];

	private void initialize() {
		VentanaTicTacToe = new JFrame();
		VentanaTicTacToe.setBackground(new Color(64, 0, 64));
		VentanaTicTacToe.getContentPane().setBackground(new Color(64, 0, 128));
		VentanaTicTacToe.setIconImage(Toolkit.getDefaultToolkit().getImage(TicTacToe.class.getResource("/programacion_3/resources/agregar.png")));
		VentanaTicTacToe.setTitle("TicTacToe");
		VentanaTicTacToe.getContentPane().setMinimumSize(new Dimension(50, 50));
		VentanaTicTacToe.setMinimumSize(new Dimension(100,100));
		VentanaTicTacToe.setBounds(100, 100, 600, 650);
		VentanaTicTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		VentanaTicTacToe.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel norte = new JPanel();
		norte.setBackground(new Color(64, 0, 128));
		VentanaTicTacToe.getContentPane().add(norte, BorderLayout.NORTH);
		norte.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 0, 128));
		norte.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel = new JLabel("Turno de:"+turno);
		lblNewLabel.setForeground(new Color(14, 131, 248));
		lblNewLabel.setBackground(new Color(64, 0, 128));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(64, 0, 128));
		norte.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		lblNewLabel_1 = new JLabel("X:"+puntosX);
		lblNewLabel_1.setBackground(new Color(14, 131, 248));
		lblNewLabel_1.setForeground(new Color(14, 131, 248));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 24));
		panel_1.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("O:"+puntosO);
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 24));
		panel_1.add(lblNewLabel_2);
		
		JPanel sur = new JPanel();
		sur.setForeground(new Color(123, 29, 211));
		sur.setBackground(new Color(64, 0, 128));
		VentanaTicTacToe.getContentPane().add(sur, BorderLayout.SOUTH);
		
		JButton botonReiniciar = new JButton("Reiniciar");
		botonReiniciar.setBorder(new LineBorder(new Color(168, 81, 255), 2, true));
		botonReiniciar.setBackground(new Color(64, 0, 128));
		botonReiniciar.setForeground(new Color(255, 0, 255));
		botonReiniciar.setIcon(new ImageIcon(TicTacToe.class.getResource("/programacion_3/resources/rehacer.png")));
		botonReiniciar.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		botonReiniciar.addActionListener(e->{
			reiniciar();
		});
		sur.add(botonReiniciar);
		
		JPanel centro = new JPanel();
		VentanaTicTacToe.getContentPane().add(centro, BorderLayout.CENTER);
		centro.setLayout(new GridLayout(3, 3, 0, 0));
		
		
		for(int i=0; i<9; i++) {
			tablero[i]=new Botones(i);
			centro.add(tablero[i]);
				tablero[i].addActionListener(e-> {
				Botones boton=(Botones)e.getSource();
				if(boton.getEstado()) {
				jugar(boton);
				comprobar(boton);
				}
				});
			}
	}
	
	public void jugar(Botones boton) {
		//esto es para los turnos
		if(turno.equals("x")) {
			boton.setOpaque(true);
			boton.setForeground(new Color(14, 131, 248));
			boton.setText("X");
			boton.setEstado(false);
			turno="o";
			lblNewLabel.setText("Turno de: " +turno);
			lblNewLabel.setForeground(new Color(255,0,0));
		}else {
			boton.setForeground(new Color(255,0,0));
			boton.setText("O");
			turno="x";
			lblNewLabel.setText("Turno de: " +turno);
			lblNewLabel.setForeground(new Color(14, 131, 248));
			boton.setEstado(false);
		}	
	}

	public void comprobar(Botones boton) {
		//para comprobar
		//ganaa x
		if(IntStream.of(2,4,6).allMatch(i -> tablero[i].getText().equals("X"))||IntStream.of(0, 4, 8).allMatch(i -> tablero[i].getText().equals("X"))||IntStream.of(1,4,7).allMatch(i -> tablero[i].getText().equals("X"))||IntStream.of(2,5,8).allMatch(i -> tablero[i].getText().equals("X"))||IntStream.of(0, 3, 6).allMatch(i -> tablero[i].getText().equals("X"))||IntStream.of(0, 1, 2).allMatch(i -> tablero[i].getText().equals("X"))||IntStream.of(3, 4, 5).allMatch(i -> tablero[i].getText().equals("X"))||IntStream.of(6, 7, 8).allMatch(i -> tablero[i].getText().equals("X"))){
			puntosX++;
			lblNewLabel_1.setText("X:"+puntosX);
			JOptionPane.showMessageDialog(VentanaTicTacToe, "Las X ganan...");
			reiniciar();
		}
		//gana o
		
		else if(IntStream.of(2,4,6).allMatch(i -> tablero[i].getText().equals("O"))||IntStream.of(0, 4, 8).allMatch(i -> tablero[i].getText().equals("O"))||IntStream.of(1,4,7).allMatch(i -> tablero[i].getText().equals("O"))||IntStream.of(2,5,8).allMatch(i -> tablero[i].getText().equals("O"))||IntStream.of(0, 3, 6).allMatch(i -> tablero[i].getText().equals("O"))||IntStream.of(0, 1, 2).allMatch(i -> tablero[i].getText().equals("O"))||IntStream.of(3, 4, 5).allMatch(i -> tablero[i].getText().equals("O"))||IntStream.of(6, 7, 8).allMatch(i -> tablero[i].getText().equals("O"))){
			puntosO++;
			lblNewLabel_2.setText("O:"+puntosO);
			JOptionPane.showMessageDialog(VentanaTicTacToe, "Las O ganan...");
			reiniciar();
		}
		
		//empate
		else if(IntStream.of(0,1,2,3,4,5,6,7,8).allMatch(i -> tablero[i].getEstado()==false)){
			JOptionPane.showMessageDialog(VentanaTicTacToe, "Ha habido un empate.");
			reiniciar();
		}
	}
	
	public void reiniciar() {
		for(int i=0; i<9; i++) {
			tablero[i].setEnabled(true);
			tablero[i].setEstado(true);
			tablero[i].setText("");
		}
	}

	
	
	
	
	
	
	
}
