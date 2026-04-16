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
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;

public class TicTacToe {

	private JFrame TicTacToe;
	Color fondo = new Color(29, 10, 79);
	Color linea = new Color(123, 29, 211);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
					window.TicTacToe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		TicTacToe = new JFrame();
		TicTacToe.setBackground(new Color(64, 0, 64));
		TicTacToe.getContentPane().setBackground(new Color(64, 0, 128));
		TicTacToe.setIconImage(Toolkit.getDefaultToolkit().getImage(TicTacToe.class.getResource("/programacion_3/resources/agregar.png")));
		TicTacToe.setTitle("TicTacToe");
		TicTacToe.getContentPane().setMinimumSize(new Dimension(50, 50));
		TicTacToe.setMinimumSize(new Dimension(100,100));
		TicTacToe.setBounds(100, 100, 600, 650);
		TicTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TicTacToe.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel norte = new JPanel();
		norte.setBackground(new Color(64, 0, 128));
		TicTacToe.getContentPane().add(norte, BorderLayout.NORTH);
		norte.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 0, 128));
		norte.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("00:00");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(64, 0, 128));
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(64, 0, 128));
		norte.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("X:0");
		lblNewLabel_1.setBackground(new Color(14, 131, 248));
		lblNewLabel_1.setForeground(new Color(14, 131, 248));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("O:0");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		panel_1.add(lblNewLabel_2);
		
		JPanel sur = new JPanel();
		sur.setForeground(new Color(123, 29, 211));
		sur.setBackground(new Color(64, 0, 128));
		TicTacToe.getContentPane().add(sur, BorderLayout.SOUTH);
		
		JButton botonReiniciar = new JButton("Reiniciar");
		botonReiniciar.setBorder(new LineBorder(new Color(168, 81, 255), 2, true));
		botonReiniciar.setBackground(new Color(64, 0, 128));
		botonReiniciar.setForeground(new Color(255, 0, 255));
		botonReiniciar.setIcon(new ImageIcon(TicTacToe.class.getResource("/programacion_3/resources/rehacer.png")));
		botonReiniciar.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		sur.add(botonReiniciar);
		
		JPanel centro = new JPanel();
		TicTacToe.getContentPane().add(centro, BorderLayout.CENTER);
		centro.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton boton7FocusableparaNoMostrar = new JButton();
		boton7FocusableparaNoMostrar.setFocusable(false);
		boton7FocusableparaNoMostrar.setFont(new Font("Segoe UI", Font.BOLD, 99));
		boton7FocusableparaNoMostrar.setText("X");
		boton7FocusableparaNoMostrar.setBorder(new LineBorder(linea, 3));
		boton7FocusableparaNoMostrar.setBackground(fondo);
		boton7FocusableparaNoMostrar.setForeground(new Color(14, 131, 248));
		centro.add(boton7FocusableparaNoMostrar);

		JButton boton8 = new JButton();
		boton8.setBorder(new LineBorder(linea, 3));
		boton8.setBackground(fondo);
		boton8.setForeground(Color.WHITE);
		centro.add(boton8);

		JButton boton9 = new JButton();
		boton9.setBorder(new LineBorder(linea, 3));
		boton9.setBackground(fondo);
		boton9.setForeground(Color.WHITE);
		centro.add(boton9);

		JButton boton4 = new JButton();
		boton4.setFocusable(false);
		boton4.setFont(new Font("Segoe UI", Font.BOLD, 99));
		boton4.setText("O");
		boton4.setBorder(new LineBorder(linea, 3));
		boton4.setBackground(fondo);
		boton4.setForeground(new Color(255, 0, 0));
		centro.add(boton4);

		JButton boton5 = new JButton();
		boton5.setBorder(new LineBorder(linea, 3));
		boton5.setBackground(fondo);
		boton5.setForeground(Color.WHITE);
		centro.add(boton5);

		JButton boton6 = new JButton();
		boton6.setBorder(new LineBorder(linea, 3));
		boton6.setBackground(fondo);
		boton6.setForeground(Color.WHITE);
		centro.add(boton6);

		JButton boton1 = new JButton();
		boton1.setBorder(new LineBorder(linea, 3));
		boton1.setBackground(fondo);
		boton1.setForeground(Color.WHITE);
		centro.add(boton1);

		JButton boton2 = new JButton();
		boton2.setBorder(new LineBorder(linea, 3));
		boton2.setBackground(fondo);
		boton2.setForeground(Color.WHITE);
		centro.add(boton2);

		JButton boton3 = new JButton();
		boton3.setBorder(new LineBorder(linea, 3));
		boton3.setBackground(fondo);
		boton3.setForeground(Color.WHITE);
		centro.add(boton3);
	}

}
