package programacion_3;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame {
	Color verde=new Color(10,160,10);
	Color verdeEsmeralda = new Color(46, 204, 113);
	Color grisClaro = new Color(180, 204, 180);

	
	public Ventana() {
		this.setVisible(true);
		this.setSize(1000,750);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(300,300));
		this.setMaximumSize(new Dimension(1050,770));
		this.setTitle("Estudiantes");
		this.setLayout(null);
		this.getContentPane().setBackground(verde);
		
		JMenuBar barra = new JMenuBar();
		JMenu archivo = new JMenu("Archivo");
		barra.add(archivo);
		
		JMenuItem  open =new JMenuItem("Abrir");
		JMenuItem  close =new JMenuItem("Cerrar");
		JMenuItem  save=new JMenuItem("Guardar");
		JMenuItem  NewFile =new JMenuItem("Nuevo");
		archivo.add(open);
		archivo.add(close);
		archivo.add(save);
		archivo.add(NewFile);

		JMenu submenu=new JMenu("Otros");
		archivo.addSeparator();
		JMenuItem menuItem = new JMenuItem("Marcar Favorito");
		submenu.add(menuItem);
		menuItem = new JMenuItem("Desmarcar Favorito");
		archivo.add(submenu);
		submenu.add(menuItem);

		this.setJMenuBar(barra);
		this.add(barra);
		this.users();
		this.repaint();
		this.revalidate();
		
		
		
	}
	
	
	public void login() {
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(new Color(215,220,215));
		contenedor.setSize(500,750);
		contenedor.setLocation(0,0);		
		contenedor.setLayout(null);
		this.add(contenedor);
		
		//titulo de bienvenida
		JLabel title_login = new JLabel();
		title_login.setText("PENNY BANK");
		title_login.setSize(200,30);
		title_login.setLocation(150,80);
		title_login.setOpaque(false);
		title_login.setForeground(verde);
		title_login.setFont(new Font("Tahoma",Font.BOLD,30));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);
		
		JLabel userlabel = new JLabel();
		userlabel.setText("Nombre de usuario:");
		userlabel.setSize(200,30);
		userlabel.setLocation(75,165);
		userlabel.setOpaque(false);
		userlabel.setFont(new Font("Arial",Font.BOLD,16));
		userlabel.setHorizontalAlignment(JLabel.CENTER);
		userlabel.setForeground(Color.black);
		contenedor.add(userlabel);
		
		//nombre de ussuario
		JTextField username = new JTextField();
		username.setSize(300,30);
		username.setLocation(100,190);
		username.setFont(new Font("",Font.BOLD,20));
		contenedor.add(username);
		
		
		JLabel pswlabel = new JLabel();
		pswlabel.setText("Contraseña:");
		pswlabel.setSize(200,30);
		pswlabel.setLocation(45,235);
		pswlabel.setOpaque(false);
		pswlabel.setFont(new Font("Arial",Font.BOLD,16));
		pswlabel.setHorizontalAlignment(JLabel.CENTER);
		pswlabel.setForeground(Color.black);
		contenedor.add(pswlabel);
		
		JPasswordField psw = new JPasswordField();
		psw.setSize(300,30);
		psw.setLocation(100,260);
		psw.setFont(new Font("",Font.BOLD,20));
		contenedor.add(psw);
		
		JButton acceder = new JButton();
		acceder.setText("Acceder");
		acceder.setLocation(155,400);
		acceder.setSize(190,50);
		acceder.setBackground(new Color(10,250,20));
		acceder.setFont(new Font("Tahoma", Font.BOLD, 17));
		acceder.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		contenedor.add(acceder);
	
		JLabel recuperar = new JLabel();
		recuperar.setText("Recuperar contraseña");
		recuperar.setSize(200,30);
		recuperar.setLocation(230,290);
		recuperar.setOpaque(false);
		recuperar.setFont(new Font("Arial",Font.BOLD,13));
		recuperar.setHorizontalAlignment(JLabel.CENTER);
		recuperar.setForeground(Color.blue);
		contenedor.add(recuperar);
		
		JCheckBox recordar = new JCheckBox();
		recordar.setSize(120,30);
		recordar.setLocation(96,290);
		recordar.setOpaque(false);
		recordar.setText("Recordarme");
		recordar.setFont(new Font("Arial",Font.BOLD,13));
		contenedor.add(recordar);
		
		contenedor.repaint();
		contenedor.revalidate();
		
	}
	
	public void registro() {
		//marco de registtro
				JPanel registro = new JPanel();
				registro.setOpaque(true);
				registro.setBackground(new Color(85,85,85));
				registro.setSize(500,750);
				registro.setLocation(500,0);		
				registro.setLayout(null);
				this.add(registro);
				
				JLabel r_title = new JLabel();
				r_title.setText("REGISTRO");
				r_title.setSize(200, 30);
				r_title.setLocation(150, 80);
				r_title.setOpaque(false);
				r_title.setForeground(Color.white);
				r_title.setFont(new Font("Tahoma", Font.BOLD, 30));
				r_title.setHorizontalAlignment(JLabel.CENTER);
				registro.add(r_title);
				
				JLabel userlabel2 = new JLabel();
				userlabel2.setText("Nombre de usuario:");
				userlabel2.setSize(200,30);
				userlabel2.setLocation(75,165);
				userlabel2.setOpaque(false);
				userlabel2.setFont(new Font("Arial",Font.BOLD,16));
				userlabel2.setHorizontalAlignment(JLabel.CENTER);
				userlabel2.setForeground(Color.white);
				registro.add(userlabel2);
				
				//nombre de ussuario
				JTextField username2 = new JTextField();
				username2.setSize(300,30);
				username2.setLocation(100,190);
				username2.setFont(new Font("",Font.BOLD,20));
				registro.add(username2);
				
				JLabel bio_text = new JLabel();
				bio_text.setText("Biografía");
				bio_text.setSize(200,30);
				bio_text.setLocation(150,220);
				bio_text.setOpaque(false);
				bio_text.setFont(new Font("Tahoma",Font.BOLD,16));
				bio_text.setHorizontalAlignment(JLabel.CENTER);
				bio_text.setForeground(Color.white);
				bio_text.setHorizontalAlignment(JLabel.CENTER);
				registro.add(bio_text);
				
				JTextArea biografia = new JTextArea();
				biografia.setSize(300,80);
				biografia.setLocation(100,250);
				biografia.setFont(new Font("",Font.BOLD,15));
				biografia.setLineWrap(true);
				biografia.setWrapStyleWord(true);
				registro.add(biografia);
				
				JLabel preferencias = new JLabel();
				preferencias.setText("PREFERENCIAS");
				preferencias.setSize(200, 30);
				preferencias.setLocation(150, 330);
				preferencias.setOpaque(false);
				preferencias.setFont(new Font("Tahoma", Font.BOLD, 16));
				preferencias.setForeground(Color.yellow);
				preferencias.setHorizontalAlignment(JLabel.CENTER);
				registro.add(preferencias);
				
				JPanel fondo=new JPanel();
				fondo.setSize(300,40);
				fondo.setLocation(100,360);
				fondo.setBackground(Color.yellow);
				registro.add(fondo);
				
				JCheckBox debito = new JCheckBox("Débito");
				debito.setSize(100, 30);
				debito.setLocation(70, 355);
				debito.setOpaque(false);
				debito.setForeground(Color.black);
				debito.setFont(new Font("Tahoma", Font.BOLD, 16));
				fondo.add(debito);

				JCheckBox credito = new JCheckBox("Crédito");
				credito.setSize(100, 30);
				credito.setLocation(180, 355);
				credito.setOpaque(false);
				credito.setForeground(Color.black);
				credito.setFont(new Font("Tahoma", Font.BOLD, 16));
				fondo.add(credito);

				JCheckBox inversiones = new JCheckBox("Inversiones");
				inversiones.setSize(120, 30);
				inversiones.setLocation(290, 355);
				inversiones.setOpaque(false);
				inversiones.setForeground(Color.black);
				inversiones.setFont(new Font("Tahoma", Font.BOLD, 16));
				fondo.add(inversiones);
				
				JLabel terminos = new JLabel();
				terminos.setText("Términos y condiciones");
				terminos.setSize(300, 30);
				terminos.setLocation(100, 420);
				terminos.setOpaque(true);
				terminos.setBackground(verdeEsmeralda);
				terminos.setFont(new Font("Tahoma", Font.BOLD, 16));
				terminos.setForeground(Color.black);
				terminos.setHorizontalAlignment(JLabel.CENTER);
				registro.add(terminos);

				JRadioButton aceptar = new JRadioButton("Aceptar");
				aceptar.setBounds(150, 450, 100, 30);
				aceptar.setOpaque(false);
				aceptar.setForeground(Color.green);
				aceptar.setFont(new Font("Tahoma", Font.BOLD, 14));

				JRadioButton rechazar = new JRadioButton("Rechazar");
				rechazar.setBounds(260, 450, 100, 30);
				rechazar.setOpaque(false);
				rechazar.setForeground(Color.red);
				rechazar.setFont(new Font("Tahoma", Font.BOLD, 14));

				ButtonGroup grupoTerminos = new ButtonGroup();
				grupoTerminos.add(aceptar);
				grupoTerminos.add(rechazar);
				registro.add(aceptar);
				registro.add(rechazar);
				
				String[] ciudades = {"Selecciones su ciudad...", "La Paz", "Los Cabos", "Loreto" };
				JComboBox ciudad = new JComboBox(ciudades);
				ciudad.setBounds(100, 495, 300, 30);
				ciudad.setFont(new Font("Tahoma", Font.PLAIN, 17));
				ciudad.setBackground(Color.white);
				registro.add(ciudad);
				
				JButton crearCuenta = new JButton("CREAR CUENTA");
				crearCuenta.setBounds(150, 550, 200, 60);
				crearCuenta.setBackground(new Color(10, 250, 20));
				crearCuenta.setForeground(Color.BLACK);
				crearCuenta.setFont(new Font("Tahoma", Font.BOLD, 17));
				crearCuenta.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
				crearCuenta.setFocusable(false);

				registro.add(crearCuenta);
				
				registro.repaint();
				registro.revalidate();
		
	}
	
	public void users() {
		JPanel users= new JPanel();
		users.setSize(900,500);
		users.setLocation(45,100);
		users.setBackground(Color.white);
		users.setLayout(null);
		this.add(users);
		
		JLabel users_title=new JLabel("USUARIOS");
		users_title.setBounds(325,30,250,40);
		users_title.setOpaque(false);
		users_title.setFont(new Font("Tahoma", Font.BOLD, 25));
		users_title.setHorizontalAlignment(JLabel.CENTER);
		users.add(users_title);
		
		JButton export = new JButton("Exportar");
		export.setBounds(30,90,100,40);
		export.setFont(new Font("Tahoma", Font.BOLD, 13));
		users.add(export);
		
		JButton add = new JButton("Añadir");
		add.setBounds(140,90,100,40);
		add.setFont(new Font("Tahoma", Font.BOLD, 13));
		users.add(add);
		
		Object[] table_head = {"No. control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"};
		
		Object [][] table_content = {
			    {"22104567", "María Fernanda", "López Hernández", "5", "9.2", "Editar/Eliminar"},
			    {"21103218", "Carlos Eduardo", "Ramírez Torres", "7", "8.7", "Editar/Eliminar"},
			    {"23105644", "Ana Sofía", "García Martínez", "3", "9.5", "Editar/Eliminar"},
			    {"20109876", "Luis Alberto", "Sánchez Cruz", "8", "8.9", "Editar/Eliminar"},
			    {"22106754", "Valeria", "Morales Ruiz", "4", "9.1", "Editar/Eliminar"},
			    {"21104539", "Diego Armando", "Pérez Navarro", "6", "8.4", "Editar/Eliminar"},
			    {"23102311", "Camila", "Ortega Flores", "2", "9.6", "Editar/Eliminar"},
			    {"20103422", "Jorge Iván", "Castillo Vega", "9", "8.2", "Editar/Eliminar"},
			    {"22107890", "Fernanda", "Mendoza Salas", "1", "9.8", "Editar/Eliminar"},
			    {"21105673", "Ricardo", "Delgado Romero", "5", "8.6", "Editar/Eliminar"}
			};
		
		JTable users_table=new JTable(table_content,table_head);
		JScrollPane scrollPane=new JScrollPane(users_table);

		scrollPane.setLocation(30,200);
		scrollPane.setSize(800,100);
		users_table.setBorder(BorderFactory.createLineBorder(Color.black));
		users.add(scrollPane);
		
		
		
		
		users.repaint();
	}
	
	
	
	
	
	
	
	
}