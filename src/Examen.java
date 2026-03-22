import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JCheckBox;

public class Examen {

	Color blancof= new Color(240,240,240);
	Color grisClarito = new Color(200,200,200);
	Color gris = new Color(200,200,200);
	Color azulMar = new Color(0, 123, 255);
	Color azulO = new Color(0,70,120);
	private JFrame frmExamen;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable users_table;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen window = new Examen();
					window.frmExamen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Examen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmExamen = new JFrame();
		frmExamen.setTitle("Facturación");
		frmExamen.setBounds(100, 100, 600,700);
		frmExamen.setBackground(azulMar);
		frmExamen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel borde_superior = new JPanel();
		borde_superior.setPreferredSize(new Dimension(10, 50));
		borde_superior.setBackground(azulMar);
		frmExamen.getContentPane().add(borde_superior, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Factura en Java ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		GroupLayout gl_borde_superior = new GroupLayout(borde_superior);
		gl_borde_superior.setHorizontalGroup(
			gl_borde_superior.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_borde_superior.createSequentialGroup()
					.addContainerGap(219, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addGap(206))
		);
		gl_borde_superior.setVerticalGroup(
			gl_borde_superior.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_borde_superior.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		borde_superior.setLayout(gl_borde_superior);
		
		JPanel borde_inferior = new JPanel();
		borde_inferior.setBackground(azulMar);
		frmExamen.getContentPane().add(borde_inferior, BorderLayout.SOUTH);
		
		JPanel Principal = new JPanel();
		frmExamen.getContentPane().add(Principal, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Datos del cliente ", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(new Color(240, 240, 240));
		panel.setForeground(new Color(240, 240, 240));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Datos de factura ", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(UIManager.getColor("Button.background"));
		
		JLabel lblNewLabel_1_4 = new JLabel("N°  Factura: ");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Fecha:");
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_1_4_2 = new JLabel("1");
		lblNewLabel_1_4_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		
		JLabel lblNewLabel_1_4_2_1 = new JLabel("21/03/2026");
		lblNewLabel_1_4_2_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1_4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(lblNewLabel_1_4_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(102)
					.addComponent(lblNewLabel_1_4_1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1_4_2_1, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(19, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_1_4, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_1_4_2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_1_4_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_1_4_2_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_1.setBackground(UIManager.getColor("Button.background"));
		
		JButton btnNewButton = new JButton("Ver listado de facturas");
		btnNewButton.setIcon(new ImageIcon(Examen.class.getResource("/programacion_3/resources/lista.png")));
		
		JButton btnAadir = new JButton("Añadir");
		btnAadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAadir.setIcon(new ImageIcon(Examen.class.getResource("/programacion_3/resources/agregar.png")));
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(Examen.class.getResource("/programacion_3/resources/cancelado.png")));
		GroupLayout gl_panel_1_1 = new GroupLayout(panel_1_1);
		gl_panel_1_1.setHorizontalGroup(
			gl_panel_1_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1_1.createSequentialGroup()
					.addGap(6)
					.addComponent(btnNewButton)
					.addGap(42)
					.addComponent(btnAadir, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
					.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_1_1.setVerticalGroup(
			gl_panel_1_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1_1.createSequentialGroup()
					.addGroup(gl_panel_1_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAadir, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_1_1.setLayout(gl_panel_1_1);
		
		Object[] table_head = {"Producto", "Cantidad", "Valor", "Subtotal"};

		Object[][] table_content = {
		    {"Laptop HP 15\"", "2", "$850.00", "$1700.00"},
		    {"Mouse Inalámbrico", "5", "$25.00", "$125.00"},
		    {"Teclado Mecánico", "3", "$45.00", "$135.00"},
		    {"Monitor Dell 24\"", "4", "$150.00", "$600.00"},
		    {"Cable HDMI 2m", "10", "$8.00", "$80.00"},
		    {"Disco Duro 1TB", "6", "$60.00", "$360.00"},
		    {"Memoria RAM 16GB", "8", "$75.00", "$600.00"},
		    {"Tarjeta Madre", "2", "$120.00", "$240.00"},
		    {"Fuente de Poder 600W", "3", "$55.00", "$165.00"},		 
		    {"Ventilador 120mm", "10", "$12.00", "$120.00"}
		};
		
		users_table=new JTable(table_content,table_head);
		JScrollPane scrollPane=new JScrollPane(users_table);

		scrollPane.setLocation(30,200);
		scrollPane.setSize(800,150);
		users_table.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JLabel lblNewLabel_1_5 = new JLabel("Subtotal:");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_1_6 = new JLabel("% Descuento:");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_1_7 = new JLabel("IVA 16%");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_1_8 = new JLabel("Total de factura:");
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_4.setText("%5");
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("$4,125.00");
		lblNewLabel_1_5_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		
		JLabel lblNewLabel_1_5_1_1 = new JLabel("$627.00");
		lblNewLabel_1_5_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_1_5_1_2 = new JLabel("$206.25");
		lblNewLabel_1_5_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_1_5_1_3 = new JLabel("$4,545.75");
		lblNewLabel_1_5_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnFinalizarFactura = new JButton("Finalizar factura");
		
		JButton btnLimpiar = new JButton("Limpiar");
		GroupLayout gl_Principal = new GroupLayout(Principal);
		gl_Principal.setHorizontalGroup(
			gl_Principal.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Principal.createSequentialGroup()
					.addGap(27)
					.addGroup(gl_Principal.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Principal.createParallelGroup(Alignment.LEADING, false)
							.addComponent(panel_1_1, GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
							.addComponent(scrollPane))
						.addGroup(gl_Principal.createSequentialGroup()
							.addComponent(lblNewLabel_1_8)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_1_5_1_3, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Principal.createSequentialGroup()
							.addComponent(lblNewLabel_1_5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblNewLabel_1_5_1, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Principal.createSequentialGroup()
							.addGroup(gl_Principal.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_Principal.createSequentialGroup()
									.addComponent(lblNewLabel_1_7, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addGap(23))
								.addGroup(gl_Principal.createSequentialGroup()
									.addComponent(lblNewLabel_1_6)
									.addGap(18)))
							.addGroup(gl_Principal.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1_5_1_1, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Principal.createSequentialGroup()
									.addGroup(gl_Principal.createParallelGroup(Alignment.TRAILING)
										.addComponent(btnFinalizarFactura, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_Principal.createSequentialGroup()
											.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
											.addGap(28)
											.addComponent(chckbxNewCheckBox, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
											.addGap(50)
											.addComponent(lblNewLabel_1_5_1_2, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)))
									.addGap(18)
									.addComponent(btnLimpiar, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))))
					.addGap(52))
		);
		gl_Principal.setVerticalGroup(
			gl_Principal.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Principal.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_Principal.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_Principal.createSequentialGroup()
							.addGap(46)
							.addGroup(gl_Principal.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_5, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_5_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_Principal.createParallelGroup(Alignment.TRAILING)
								.addGroup(Alignment.LEADING, gl_Principal.createSequentialGroup()
									.addComponent(chckbxNewCheckBox, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_Principal.createSequentialGroup()
									.addGroup(gl_Principal.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_1_6, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
										.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
									.addGap(10))))
						.addGroup(gl_Principal.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_1_5_1_2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)))
					.addGroup(gl_Principal.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1_7, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_5_1_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_Principal.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1_5_1_3, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_8, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_Principal.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnFinalizarFactura, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnLimpiar, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(27))
		);
		
		JLabel lblNewLabel_1 = new JLabel("Documento:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_1_1 = new JLabel("Dirección:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_1_2 = new JLabel("Nombres:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_1_3 = new JLabel("Teléfono:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField_1)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
					.addGap(30)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_1_3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_2))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_3, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		Principal.setLayout(gl_Principal);
	}
}
