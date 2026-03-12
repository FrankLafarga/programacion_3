package programacion_3;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
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

public class Ventana extends JFrame implements ActionListener {
	Color verde=new Color(140,180,140);
	Color verdeO=new Color(30,100,70);
	Color verdeHoja=new Color(200,250,200);
	Color verdeClaro=new Color(230,245,230);
	Color rojoClaro = new Color(180,50,50);
	Color verdeEsmeralda = new Color(46, 160, 110);
	Color verdeHover = new Color(30, 180, 120);  
	Color grisClaro = new Color(180, 204, 180);
	Color blancof= new Color(240,240,240);
	Color grisClarito = new Color(200,200,200);
	Color gris = new Color(200,200,200);
	Color azulMar = new Color(0, 123, 255);
	Color azulO = new Color(0,70,120);
	
	String titulo="Hola...";
	private JPanel contenedor;
	private JPanel cargando;
	private JButton acceder,registrarC;
	
	public Ventana() {
		
		this.setVisible(true);
		this.setSize(1000,750);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(300,300));
		this.setMaximumSize(new Dimension(1050,770));
		this.setTitle("Estudiantes");
		this.setLayout(null);
		this.getContentPane().setBackground(verdeClaro);
		//menu();
		//calcular_intereses();
		//login();
		pintar();
		
		
		this.repaint();
		this.revalidate();
	}
	public void pintar() {
		JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D)g;
                
                g2d.setColor(rojoClaro);
                g2d.setStroke(new BasicStroke(2));
                g2d.drawLine(0, 0, 100, 100);
                g2d.drawLine(200, 200, 500, 200);
                g2d.drawRect(250,200,100,100 );
                g2d.setColor(azulO);
                g2d.drawOval(400,100,70,50);
                g2d.drawOval(250,100,70,50);
                g2d.setStroke(new BasicStroke(5));
                g2d.drawArc(320,145,90,50,0,180);
                g2d.drawPolygon(new int []{200,100,300},new int [] {100,300,500},3);
                
                g2d.setColor(verdeHover);
                g2d.fillRect(500, 500,100,100);
                g2d.setColor(Color.orange);
                g2d.fillArc(300,250,100,100,0,300);

                g2d.fillPolygon(new int []{500,400,600},new int [] {300,400,800},3);
                
                
                try {	
                BufferedImage image = ImageIO.read(new File("/programacion_3/resources/candadoVerde.png"));
                g2d.drawImage(image ,500,9,null);
                }catch (IOException e) {
                	e.printStackTrace();
                }
            }
       
        };
        pane.setBackground(blancof);
        pane.setSize(1000,750);
        pane.setLocation(0,0);
        this.add(pane);
    }
	
	
	public void login() {
		titulo="INICIO DE SESIÓN";
		contenedor = new JPanel();
		contenedor.setOpaque(false);
		contenedor.setBackground(new Color(240,240,240));
		contenedor.setSize(500,500);
		contenedor.setLocation(250,100);		
		contenedor.setLayout(null);
		this.add(contenedor);
		
		Icono plantaa = new Icono("planta.jpg",1000,750);
		plantaa.setLocation(0,0);
		plantaa.setOpaque(true);
		this.add(plantaa);
		
		//titulo de bienvenida		
		JLabel title_login = new JLabel();
		title_login.setText("BIENVENIDO");
		title_login.setSize(500,50);
		title_login.setLocation(0,40);
		title_login.setOpaque(false);
		title_login.setForeground(Color.black);
		title_login.setFont(new Font("Times New Roman",Font.BOLD,60));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);
		
		JLabel userlabel = new JLabel();
		userlabel.setText("Nombre de usuario:");
		userlabel.setSize(200,30);
		userlabel.setLocation(75,165);
		userlabel.setOpaque(false);
		userlabel.setFont(new Font("Arial",Font.ITALIC,16));
		userlabel.setHorizontalAlignment(JLabel.CENTER);
		userlabel.setForeground(Color.black);
		contenedor.add(userlabel);
		
		//nombre de ussuario
		JTextField username = new JTextField();
		username.setSize(300,30);
		username.setLocation(100,190);
		username.setBackground(blancof);
		username.setFont(new Font("",Font.BOLD,20));
		contenedor.add(username);
		
		
		JLabel pswlabel = new JLabel();
		pswlabel.setText("Contraseña:");
		pswlabel.setSize(200,30);
		pswlabel.setLocation(45,235);
		pswlabel.setOpaque(false);
		pswlabel.setFont(new Font("Arial",Font.ITALIC,16));
		pswlabel.setHorizontalAlignment(JLabel.CENTER);
		pswlabel.setForeground(Color.black);
		contenedor.add(pswlabel);
		
		JPasswordField psw = new JPasswordField();
		psw.setSize(300,30);
		psw.setLocation(100,260);
		psw.setBackground(blancof);
		psw.setFont(new Font("",Font.BOLD,20));
		contenedor.add(psw);
		
		acceder = new JButton();
		acceder.setText("Acceder");
		acceder.setLocation(155,370);
		acceder.setSize(190,50);
		acceder.setBackground(verde);
		acceder.setFont(new Font("Tahoma", Font.ITALIC, 20));
		acceder.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		contenedor.add(acceder);
		acceder.addActionListener(this);
		acceder.addMouseListener(new java.awt.event.MouseAdapter() {

		    @Override
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        acceder.setBackground(verdeHover);
		        acceder.setForeground(Color.WHITE); 
		        acceder.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
		    }

		    @Override
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        acceder.setBackground(verde);
		        acceder.setForeground(Color.BLACK);
		        acceder.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		    }
		});
		    
		registrarC = new JButton();
		registrarC.setText("No tengo una cuenta...");
		registrarC.setLocation(145,478);
		registrarC.setSize(210,20);
		registrarC.setOpaque(false);
		registrarC.setForeground(Color.black);
		registrarC.setFont(new Font("Tahoma", Font.ITALIC, 17));
		registrarC.setContentAreaFilled(false);
		registrarC.setBorderPainted(false);     
		registrarC.setFocusPainted(false);
		registrarC.addActionListener(this);
		registrarC.addMouseListener(new java.awt.event.MouseAdapter() {

		    @Override
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        registrarC.setForeground(Color.blue); 
		    }

		    @Override
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	registrarC.setForeground(Color.black);
		    }
		});
		contenedor.add(registrarC);
	
		JLabel recuperar = new JLabel();
		recuperar.setText("Recuperar contraseña");
		recuperar.setSize(200,30);
		recuperar.setLocation(230,290);
		recuperar.setOpaque(false);
		recuperar.setFont(new Font("Arial",Font.ITALIC,13));
		recuperar.setHorizontalAlignment(JLabel.CENTER);
		recuperar.setForeground(Color.blue);
		contenedor.add(recuperar);
		
		JCheckBox recordar = new JCheckBox();
		recordar.setSize(120,30);
		recordar.setLocation(96,290);
		recordar.setOpaque(false);
		recordar.setText("Recordarme");
		recordar.setFont(new Font("Arial",Font.ITALIC,13));
		contenedor.add(recordar);
		
		
		//iconos
		Icono iconoUsuario = new Icono("usuarioVerde.png",35,35);
		iconoUsuario.setLocation(62,187);
		iconoUsuario.setOpaque(true);
		contenedor.add(iconoUsuario);
		
		Icono iconoCandado = new Icono("candadoVerde.png",35,35);
		iconoCandado.setLocation(62,254);
		iconoCandado.setOpaque(true);
		contenedor.add(iconoCandado);
		
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
			    {"21105673", "Ricardo", "Delgado Romero", "5", "8.6", "Editar/Eliminar"},
			    {"22108812", "Alejandro", "Guzmán Orozco", "4", "8.5", "Editar/Eliminar"},
			    {"23109923", "Ximena", "Rojas Duarte", "2", "9.4", "Editar/Eliminar"},
			    {"21101145", "Roberto", "Villarreal Kent", "6", "7.9", "Editar/Eliminar"},
			    {"20102256", "Paola", "Soto Mayorga", "8", "9.0", "Editar/Eliminar"},
			    {"22103367", "Mauricio", "Luna Valdés", "4", "8.8", "Editar/Eliminar"},
			    {"23104478", "Daniela", "Bravo Esparza", "1", "9.7", "Editar/Eliminar"},
			    {"21105589", "Gabriel", "Peralta Silva", "7", "8.3", "Editar/Eliminar"},
			    {"20106690", "Lucía", "Castañeda Ríos", "9", "9.9", "Editar/Eliminar"},
			    {"22107701", "Esteban", "Meza Galindo", "3", "8.1", "Editar/Eliminar"},
			    {"23108812", "Natalia", "Vargas Montes", "2", "9.3", "Editar/Eliminar"}
			};
		
		JTable users_table=new JTable(table_content,table_head);
		JScrollPane scrollPane=new JScrollPane(users_table);

		scrollPane.setLocation(30,200);
		scrollPane.setSize(800,150);
		users_table.setBorder(BorderFactory.createLineBorder(Color.black));
		users.add(scrollPane);
		
		
		
		
		users.repaint();
	}
	
	public void menu() {
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
		JMenuItem menuItem = new JMenuItem(titulo);
		submenu.add(menuItem);
		menuItem = new JMenuItem("Desmarcar Favorito");
		archivo.add(submenu);
		submenu.add(menuItem);

		this.setJMenuBar(barra);
		this.add(barra);
	}
	
	public void calcular_intereses(){
		JPanel contenedor_int = new JPanel();
		contenedor_int.setOpaque(true);
		contenedor_int.setBackground(azulO);
		contenedor_int.setSize(1000,650);
		contenedor_int.setLocation(0,20);		
		contenedor_int.setLayout(new BorderLayout(0,5));
		this.add(contenedor_int);
		
		JLabel title = new JLabel("Calculador de Interés");
		title.setFont(new Font("Tahoma", Font.BOLD, 30));
		title.setOpaque(false);
		title.setForeground(blancof);
		title.setHorizontalAlignment(JLabel.CENTER);
		contenedor_int.add(title,BorderLayout.NORTH);
		
		JPanel panelDatos = new JPanel();
		panelDatos.setSize(0,100);
		panelDatos.setOpaque(true);
		panelDatos.setBackground(grisClarito);
		panelDatos.setLayout(new GridLayout(8,1,10,10));
		contenedor_int.add(panelDatos,BorderLayout.CENTER);
		
		JPanel panelEspaciador = new JPanel();
		panelEspaciador.setOpaque(true);
		panelEspaciador.setBackground(grisClarito);
		panelEspaciador.setPreferredSize(new Dimension(300,0));
		panelEspaciador.setLayout(null);
		contenedor_int.add(panelEspaciador,BorderLayout.EAST);
		
		JPanel panelEspaciador2 = new JPanel();
		panelEspaciador2.setOpaque(true);
		panelEspaciador2.setBackground(grisClarito);
		panelEspaciador2.setPreferredSize(new Dimension(300,0));
		panelEspaciador2.setLayout(null);
		contenedor_int.add(panelEspaciador2,BorderLayout.WEST);
		
		JLabel capital = new JLabel("Capital incial $");
		capital.setOpaque(false);
		capital.setPreferredSize(new Dimension (0,10));
		capital.setFont(new Font("Arial", Font.ITALIC, 20));
		capital.setHorizontalAlignment(JLabel.CENTER);
		capital.setForeground(Color.black);
		panelDatos.add(capital);

		JTextField cantidad = new JTextField();
		cantidad.setSize(300, 30);
		cantidad.setPreferredSize(new Dimension (0,10));
		cantidad.setBackground(Color.white);
		cantidad.setBorder(new javax.swing.border.LineBorder(Color.BLACK, 1));
		cantidad.setFont(new Font("Arial", Font.BOLD, 20));
		panelDatos.add(cantidad);

		JLabel tiempoLabel = new JLabel("Tiempo (meses)");
		tiempoLabel.setOpaque(false);
		tiempoLabel.setFont(new Font("Arial", Font.ITALIC, 20));
		tiempoLabel.setHorizontalAlignment(JLabel.CENTER);
		tiempoLabel.setForeground(Color.black);
		panelDatos.add(tiempoLabel);

		JTextField tiempoField = new JTextField();
		tiempoField.setSize(300, 30);
		tiempoField.setBackground(Color.white);
		tiempoField.setBorder(new javax.swing.border.LineBorder(Color.BLACK, 1));
		tiempoField.setFont(new Font("Arial", Font.BOLD, 20));
		panelDatos.add(tiempoField);

		JLabel tasaLabel = new JLabel("tasa de interés anual %");
		tasaLabel.setOpaque(false);
		tasaLabel.setFont(new Font("Arial", Font.ITALIC, 20));
		tasaLabel.setHorizontalAlignment(JLabel.CENTER);
		tasaLabel.setForeground(Color.black);
		panelDatos.add(tasaLabel);

		JTextField tasaField = new JTextField();
		tasaField.setSize(300, 30);
		tasaField.setBackground(Color.white);
		tasaField.setBorder(new javax.swing.border.LineBorder(Color.BLACK, 1));
		tasaField.setFont(new Font("Arial", Font.BOLD, 20));
		panelDatos.add(tasaField);

		JButton ca = new JButton("Calcular interés");
		ca.setBackground(azulMar);
		ca.setPreferredSize(new Dimension(76, 40));
		ca.setForeground(Color.white);
		ca.setBorder(new javax.swing.border.LineBorder(Color.BLACK, 1));
		ca.setFont(new Font("Tahoma", Font.BOLD, 25));
		panelDatos.add(ca);

		JButton del = new JButton("limpiar");
		del.setBackground(Color.gray);
		del.setForeground(Color.white);
		del.setPreferredSize(new Dimension(80, 40));
		del.setBorder(new javax.swing.border.LineBorder(Color.BLACK, 1));
		del.setFont(new Font("Tahoma", Font.BOLD, 25));
		panelDatos.add(del);
		
		JPanel panelResultados = new JPanel();
		panelResultados.setOpaque(true);
		panelResultados.setBackground(rojoClaro);
		panelResultados.setPreferredSize(new Dimension(0, 120)); 
		panelResultados.setBorder(BorderFactory.createEmptyBorder(10, 100, 10, 100));
		panelResultados.setLayout(new GridLayout(2, 2, 10, 10));
		contenedor_int.add(panelResultados, BorderLayout.SOUTH);

		JLabel interesLabel = new JLabel("Total Interés:");
		interesLabel.setOpaque(true);
		interesLabel.setBackground(blancof);
		interesLabel.setFont(new Font("Arial", Font.ITALIC, 20));
		interesLabel.setHorizontalAlignment(JLabel.CENTER);
		interesLabel.setForeground(Color.black);
		panelResultados.add(interesLabel);

		JTextField interesField = new JTextField("$0.00");
		interesField.setSize(300, 30);
		interesField.setForeground(verdeO);
		interesField.setBackground(verdeHoja);
		interesField.setBorder(new javax.swing.border.LineBorder(Color.BLACK, 1));
		interesField.setFont(new Font("Arial", Font.BOLD, 20));
		panelResultados.add(interesField);

		JLabel montoLabel = new JLabel("Monto Total:");
		montoLabel.setOpaque(true);
		montoLabel.setBackground(blancof);
		montoLabel.setFont(new Font("Arial", Font.ITALIC, 20));
		montoLabel.setHorizontalAlignment(JLabel.CENTER);
		montoLabel.setForeground(Color.black);
		panelResultados.add(montoLabel);

		JTextField montoField = new JTextField("$0.00");
		montoField.setSize(300, 30);
		montoField.setBackground(verdeHoja);
		montoField.setForeground(verdeO);
		montoField.setBorder(new javax.swing.border.LineBorder(Color.BLACK, 1));
		montoField.setFont(new Font("Arial", Font.BOLD, 20));
		panelResultados.add(montoField);
		this.repaint();
	}
	
	
	
	
	
	
	//metodos para hacer que el botonm acceder sea interactivo
	public void mostrarCargando() {

        cargando = new JPanel();
        cargando.setBounds(250,100,500,500);
        cargando.setLayout(null);
        cargando.setOpaque(true);
        cargando.setBackground(Color.WHITE);

        Icono gifCargando = new Icono("cargandoVerde.gif",188,188,true);
        gifCargando.setBounds(156,80,188,188);
        cargando.add(gifCargando);

        JLabel textoIniciando = new JLabel("Iniciando sesión...");
        textoIniciando.setBounds(50,350,400,30);
        textoIniciando.setOpaque(true);
        textoIniciando.setForeground(verdeEsmeralda);
        textoIniciando.setFont(new Font("Tahoma",Font.BOLD,30));
        textoIniciando.setHorizontalAlignment(JLabel.CENTER);
        cargando.add(textoIniciando);

        this.remove(contenedor);
        this.add(cargando);
        this.revalidate();
        this.repaint();
        entrarEn3Segundos();
    }
	
	private void entrarEn3Segundos() {

	    javax.swing.Timer timer = new javax.swing.Timer(3000, e -> {

	    	this.getContentPane().removeAll();	
	    	this.revalidate();
		    this.repaint();
	    	users();     
	    	menu();
	        this.revalidate();
	        this.repaint();

	    });

	    timer.setRepeats(false);
	    timer.start();
	}
	
	@Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == acceder) {
            mostrarCargando();
        }
        if(e.getSource() == registrarC ) {
        	this.getContentPane().removeAll();
        	this.remove(contenedor);
        	registro();
        	this.repaint();
        	this.revalidate();
        	
        }
    }
}