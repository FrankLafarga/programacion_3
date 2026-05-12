package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import controllers.AuthController;
import programacion_3.Icono;

public class AuthView extends JFrame {

	Color verde=new Color(140,180,140);
	Color blancof= new Color(240,240,240);
	Color verdeHoja=new Color(200,250,200);
	Color verdeClaro=new Color(230,245,230);
	Color rojoClaro = new Color(180,50,50);
	Color verdeEsmeralda = new Color(46, 160, 110);
	Color verdeHover = new Color(30, 180, 120);  
	private String direccion="login";
	private JPanel contenedor;
	private JPanel cargando;
	private JButton acceder,registrarC,volver;
	private AuthController controller;
	
	public void login() {
		this.setVisible(true);
		this.setSize(1000,750);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(450,450));
		this.setMaximumSize(new Dimension(1920,1080));
		this.setTitle("Estudiantes");
		this.setLayout(new BorderLayout());
		this.getContentPane().setBackground(verdeClaro);
		
		this.repaint();
		this.revalidate();
		
		JPanel fondo = new JPanel();
		this.add(fondo,BorderLayout.CENTER);
		fondo.setLayout(new BorderLayout());
		
		Icono plantaa = new Icono("planta.jpg",1000,750);
		plantaa.setLocation(0,0);
		plantaa.setOpaque(true);
		fondo.add(plantaa,BorderLayout.CENTER);
		
		contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(new Color(224, 224, 224));
		contenedor.setPreferredSize(new Dimension(600,750));
		contenedor.setLayout(null);
		fondo.add(contenedor,BorderLayout.EAST);
		
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
		username.setFont(new Font("Arial",Font.BOLD,20));
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
		acceder.addActionListener(e-> {
			String usuario = username.getText();
		    String password = new String(psw.getPassword());
		   controller=new AuthController();
		    if(!controller.autenticar(usuario, password)) {
		    	
		    	psw.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
		    	username.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
		    	
		    }else {
		    	psw.setBorder(new LineBorder(new Color(203, 213, 225), 2, true));
		    	username.setBorder(new LineBorder(new Color(203, 213, 225), 2, true));
		    	username.setForeground(new Color(0, 0, 0));
				psw.setForeground(new Color(0, 0, 0));
				
				this.dispose();
		    }
		});
		
		
		
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
		
		registrarC.addActionListener(e ->{
		});
		
		
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
}
