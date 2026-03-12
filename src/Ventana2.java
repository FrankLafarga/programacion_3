import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import programacion_3.Icono;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Component;
import java.awt.Point;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;

public class Ventana2 {
	Color blancof= new Color(240,240,240);
	Color verdeHover = new Color(30, 180, 120);  
	private JFrame frmRegistro;
	private JTextField textField_2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 window = new Ventana2();
					window.frmRegistro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistro = new JFrame();
		frmRegistro.setTitle("Registro");
		frmRegistro.setLocationRelativeTo(null);
		frmRegistro.getContentPane().setBackground(blancof);
		frmRegistro.setBackground(blancof);
		frmRegistro.getContentPane().setForeground(new Color(0, 128, 255));
		frmRegistro.setBounds(100, 100, 830,700);
		frmRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistro.getContentPane().setLayout(new BorderLayout(50, 30));
		
		ImageIcon icono = new ImageIcon(getClass().getResource("/programacion_3/resources/usuarioVerde.png"));
		Image img = icono.getImage().getScaledInstance(80,80, Image.SCALE_SMOOTH);
		frmRegistro.setIconImage(img);
		
		JPanel izquierdo = new JPanel();
		izquierdo.setPreferredSize(new Dimension(400, 10));
		izquierdo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		izquierdo.setBackground(new Color(132, 234, 255));
		frmRegistro.getContentPane().add(izquierdo, BorderLayout.WEST);
		izquierdo.setLayout(new BorderLayout(0, 0));
		
		JPanel MARGEN_IZQUIERDO = new JPanel();
		izquierdo.add(MARGEN_IZQUIERDO, BorderLayout.WEST);
		
		JPanel contenedor = new JPanel();
		contenedor.setBackground(new Color(240, 240, 240));
		izquierdo.add(contenedor, BorderLayout.CENTER);
		contenedor.setLayout(new BorderLayout(0, 0));
		
		JPanel datos_personales = new JPanel();
		datos_personales.setFont(new Font("Tahoma", Font.ITALIC, 15));
		datos_personales.setPreferredSize(new Dimension(10, 300));
		datos_personales.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Datos personales"));
		datos_personales.setBackground(new Color(128, 255, 128));
		contenedor.add(datos_personales);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido Paterno:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		
		JLabel lblNewLabel_2 = new JLabel("Nombre(s):");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 15));
		
		JLabel lblNewLabel_3 = new JLabel("Apellido Materno:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 15));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setText("00/00/0000");
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Sexo:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.ITALIC, 13));
		rdbtnNewRadioButton.setOpaque(false);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setOpaque(false);
		rdbtnFemenino.setFont(new Font("Tahoma", Font.ITALIC, 13));
		
		ButtonGroup genero = new ButtonGroup();
		genero.add(rdbtnFemenino);
		genero.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_2_2 = new JLabel("Nacionalidad:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.ITALIC, 15));
		
		String[] paises = {
			    "Seleccione su país...", 
			    "México", 
			    "Argentina", 
			    "Colombia", 
			    "España", 
			    "Perú", 
			    "Chile", 
			    "Ecuador", 
			    "Uruguay"
			};
		JComboBox comboBox = new JComboBox(paises);
		GroupLayout gl_datos_personales = new GroupLayout(datos_personales);
		gl_datos_personales.setHorizontalGroup(
			gl_datos_personales.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_datos_personales.createSequentialGroup()
					.addGroup(gl_datos_personales.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_2_1)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_3_1)
						.addComponent(lblNewLabel_1)
						.addGroup(gl_datos_personales.createSequentialGroup()
							.addComponent(lblNewLabel_2_2)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_datos_personales.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_datos_personales.createSequentialGroup()
							.addGap(19)
							.addGroup(gl_datos_personales.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_datos_personales.createSequentialGroup()
							.addGap(54)
							.addGroup(gl_datos_personales.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnFemenino, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnNewRadioButton, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_datos_personales.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_datos_personales.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(comboBox, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(textField_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))))
					.addGap(34))
		);
		gl_datos_personales.setVerticalGroup(
			gl_datos_personales.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_datos_personales.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_datos_personales.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addGroup(gl_datos_personales.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(18)
					.addGroup(gl_datos_personales.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(41)
					.addGroup(gl_datos_personales.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_datos_personales.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnNewRadioButton, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnFemenino, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addGroup(gl_datos_personales.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(23, Short.MAX_VALUE))
		);
		datos_personales.setLayout(gl_datos_personales);
		
		JPanel datos_opcionales = new JPanel();
		datos_opcionales.setPreferredSize(new Dimension(10, 150));
		datos_opcionales.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Datos opcionales"));
		datos_opcionales.setBackground(new Color(128, 255, 0));
		contenedor.add(datos_opcionales, BorderLayout.SOUTH);
		
		String[] preferencias = { "Estilo", "Música", "Deportes", "Juegos", "Baile" };
		JList<String> list = new JList<>(preferencias);
		list.setLocation(new Point(10, 0));
		list.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		list.setFont(new Font("Tahoma", Font.PLAIN, 12));
		list.setToolTipText("Selecciona tu preferencia favorita");
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		JLabel lblNewLabel_3_2 = new JLabel("Descripción:");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.ITALIC, 15));
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Preferencias:");
		lblNewLabel_3_2_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		
		GroupLayout gl_datos_opcionales = new GroupLayout(datos_opcionales);
		gl_datos_opcionales.setHorizontalGroup(
			gl_datos_opcionales.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_datos_opcionales.createSequentialGroup()
					.addGap(46)
					.addGroup(gl_datos_opcionales.createParallelGroup(Alignment.LEADING)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
					.addGroup(gl_datos_opcionales.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3_2_1, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
						.addComponent(list, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
					.addGap(23))
		);
		gl_datos_opcionales.setVerticalGroup(
			gl_datos_opcionales.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_datos_opcionales.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_datos_opcionales.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3_2_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(gl_datos_opcionales.createParallelGroup(Alignment.LEADING)
						.addComponent(textArea)
						.addComponent(list, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		datos_opcionales.setLayout(gl_datos_opcionales);
		
		JPanel superior = new JPanel();
		superior.setBackground(new Color(225, 225, 225));
		superior.setPreferredSize(new Dimension(10, 50));
		superior.setBounds(new Rectangle(0, 0, 0, 50));
		frmRegistro.getContentPane().add(superior, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Registro de usuario");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 39));
		superior.add(lblNewLabel);
		
		JPanel inferior = new JPanel();
		inferior.setPreferredSize(new Dimension(10, 100));
		frmRegistro.getContentPane().add(inferior, BorderLayout.SOUTH);
		
		JButton botonSalir = new JButton("Cerrar");
		botonSalir.setBackground(new Color(240, 240, 240));
		Icono salir = new Icono("iconoCerrar.png", 23,30);
		botonSalir.setPreferredSize(new Dimension(120, 50));
		botonSalir.add(salir);
		inferior.add(botonSalir);
		
		JButton botonNuevo = new JButton("Nuevo");
		botonNuevo.setBackground(new Color(240, 240, 240));
		Icono nuevo = new Icono("archivoNuevo.png", 23,30);
		botonNuevo.setPreferredSize(new Dimension(120, 50));
		botonNuevo.add(nuevo);
		inferior.add(botonNuevo);
		
		JButton botonGuardar = new JButton("Guardar");
		botonGuardar.setBackground(new Color(240, 240, 240));
		Icono guardar = new Icono("iconoGuardado.png", 19,30);
		botonGuardar.setPreferredSize(new Dimension(120, 50));
		botonGuardar.add(guardar);
		inferior.add(botonGuardar);
		
		JPanel derecho = new JPanel();
		derecho.setPreferredSize(new Dimension(400, 10));
		frmRegistro.getContentPane().add(derecho, BorderLayout.EAST);
		derecho.setLayout(new BorderLayout(0, 0));
		
		JPanel perfil = new JPanel();
		perfil.setBackground(new Color(191, 252, 255));
		perfil.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 3, true), "Perfil de usuario", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		derecho.add(perfil, BorderLayout.CENTER);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(Ventana2.class.getResource("/programacion_3/resources/iconoRetrato.png")));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Modo restringido");
		chckbxNewCheckBox.setOpaque(false);
		
		JCheckBox chckbxRecomendarPerfil = new JCheckBox("Recomendar perfil");
		chckbxRecomendarPerfil.setOpaque(false);
		GroupLayout gl_perfil = new GroupLayout(perfil);
		gl_perfil.setHorizontalGroup(
			gl_perfil.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_perfil.createSequentialGroup()
					.addContainerGap(62, Short.MAX_VALUE)
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)
					.addGap(60))
				.addGroup(gl_perfil.createSequentialGroup()
					.addGap(141)
					.addGroup(gl_perfil.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxRecomendarPerfil)
						.addComponent(chckbxNewCheckBox))
					.addContainerGap(126, Short.MAX_VALUE))
		);
		gl_perfil.setVerticalGroup(
			gl_perfil.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_perfil.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxNewCheckBox, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(chckbxRecomendarPerfil, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(76, Short.MAX_VALUE))
		);
		perfil.setLayout(gl_perfil);
		
		JPanel separado = new JPanel();
		derecho.add(separado, BorderLayout.EAST);
	
	}
}
