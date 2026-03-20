package programacion_3;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaDibujos extends JFrame {
	
	public VentanaDibujos() {
			this.setVisible(true);
			this.setSize(1000,750);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
			this.setMinimumSize(new Dimension(300,300));
			this.setMaximumSize(new Dimension(1050,770));
			this.setTitle("Dibujos");
			this.setLayout(null);
			this.getContentPane().setBackground(Color.white);			
			this.repaint();
			this.revalidate();
			//pintarCasa();
			
			pintarMario();
		}
	
	public void pintarCasa() {
		Color rojoClaro = new Color(180,50,50);
		Color cremaPared = new Color(245, 212, 114);
		Color sombraCrema = new Color(201, 161, 74);
		Color cafePuerta = new Color(133, 102, 33);
		Color cafeOscuro = new Color(92, 70, 23);
		Color blanco = new Color(245, 245, 245);
		Color grisPiso = new Color(102, 102, 102);
		Color grisOscuro = new Color(70,70,70);
		Color azulCielo = new Color(0, 191, 255);
		Color maderaValla = new Color(255, 184, 77);
		Color atrasValla = new Color(211, 151, 64);
		Color verdeOscuro = new Color(51, 77, 0);
		Color verdePasto = new Color(119, 153, 51);
		Color tierraClara = new Color(204, 187, 102);
		
		JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D)g;     
                
                g2d.setStroke(new BasicStroke(2));
             
              //valla      
                g2d.setColor(atrasValla);
                g2d.fillRect(0, 490,1000,80);
                
                g2d.setColor(maderaValla);               
                g2d.fillPolygon(new int []{0, 0, 35, 70, 70}, new int [] {620, 350, 310, 350, 620}, 5);
                g2d.fillPolygon(new int []{93, 93, 128, 163, 163}, new int [] {620, 350, 310, 350, 620}, 5);
                g2d.fillPolygon(new int []{186, 186, 221, 256, 256}, new int [] {620, 350, 310, 350, 620}, 5);
                g2d.fillPolygon(new int []{279, 279, 314, 349, 349}, new int [] {620, 350, 310, 350, 620}, 5);
                g2d.fillPolygon(new int []{372, 372, 407, 442, 442}, new int [] {620, 350, 310, 350, 620}, 5);
                g2d.fillPolygon(new int []{465, 465, 500, 535, 535}, new int [] {620, 350, 310, 350, 620}, 5);
                g2d.fillPolygon(new int []{558, 558, 593, 628, 628}, new int [] {620, 350, 310, 350, 620}, 5);
                g2d.fillPolygon(new int []{651, 651, 686, 721, 721}, new int [] {620, 350, 310, 350, 620}, 5);
                g2d.fillPolygon(new int []{744, 744, 779, 814, 814}, new int [] {620, 350, 310, 350, 620}, 5);
                g2d.fillPolygon(new int []{837, 837, 872, 907, 907}, new int [] {620, 350, 310, 350, 620}, 5);
                g2d.fillPolygon(new int []{930, 930, 965, 1000, 1000}, new int [] {620, 350, 310, 350, 620}, 5);               
                                                
                //chimenea
                g2d.setColor(grisPiso);
                g2d.fillRect(600, 150,70,90);
                g2d.fillRect(590, 120,90,40);
                
                g2d.setColor(grisOscuro);
                g2d.fillPolygon(new int []{596,670,670},new int [] {160,160,170},3);
                
                //pared casa
                g2d.setColor(cremaPared);
                g2d.fillRect(325, 230,350,350);
                
                g2d.setColor(sombraCrema);
                g2d.fillPolygon(new int []{325,675,675},new int [] {280,350,280},3);   
                g2d.fillRect(645,470,30,20);
                
                g2d.setStroke(new BasicStroke(3));
                g2d.setColor(cafePuerta);
                g2d.drawLine(325, 300, 673, 300);
                g2d.drawLine(325, 335, 673, 335);
                g2d.drawLine(325, 370, 673, 370);
                g2d.drawLine(325, 405, 673, 405);
                g2d.drawLine(325, 440, 673, 440);
                g2d.drawLine(325, 475, 673, 475);
                g2d.drawLine(325, 510, 673, 510);
                g2d.drawLine(325, 545, 673, 545);
                g2d.drawLine(325, 580, 673, 580);
                
                //nubes 
                g2d.setColor(blanco);
                                                
                g2d.fillArc(50,20,50,40,0,360);
                g2d.fillArc(80,10,60,50,0,360);
                g2d.fillArc(120,20,50,40,0,360);

                g2d.fillArc(450,50,50,40,0,360);
                g2d.fillArc(480,40,60,50,0,360);
                g2d.fillArc(520,50,50,40,0,360);
                
                g2d.fillArc(800,30,50,40,0,360);
                g2d.fillArc(830,20,60,50,0,360);
                g2d.fillArc(870,30,50,40,0,360);
                
                
                //Techo
                g2d.setColor(rojoClaro);
                g2d.fillPolygon(new int []{230,420,770},new int [] {280,90,280},3);                                                  
                
                //puerta
                g2d.setColor(cafePuerta);
                g2d.fillRect(370, 368,100,200);
                
                g2d.setStroke(new BasicStroke(5));
                g2d.setColor(cafeOscuro);
                g2d.drawRect(370,368,100,200 );
                
                g2d.setColor(blanco);
                g2d.fillArc(440,460,15,15,0,360);
                               
                // ventana
                g2d.setColor(sombraCrema);
                g2d.fillPolygon(new int []{540,675,675},new int [] {485,485,508},3);
                
                g2d.setColor(rojoClaro);
                g2d.fillRect(540,368,103,102 );
                
                g2d.setColor(blanco);
                g2d.fillRect(548,376,40,40);  
                g2d.fillRect(595,376,40,40);  
                g2d.fillRect(548,422,40,40);  
                g2d.fillRect(595,422,40,40); 
                
                g2d.setColor(grisPiso);
                g2d.fillRect(534,467,115,20); 

                
                //piso
                g2d.setColor(grisPiso);
                g2d.fillRect(250, 570,500,50);
                
                g2d.setColor(verdeOscuro);
                g2d.fillRect(0, 620,1000,15);

                g2d.setColor(verdePasto);
                g2d.fillRect(0, 635,1000,50);                
                g2d.setColor(tierraClara);
                g2d.fillRect(0, 685,1000,30);           
           }
       
        };
        pane.setBackground(azulCielo);
        pane.setSize(1000,750);
        pane.setLocation(0,0);
        this.add(pane);
    }
	
	public void pintarMario() {
	    Color azulFondo = new Color(175, 240, 255);
	    Color negro = new Color(0, 0, 0);
	    Color naranjaPiso = new Color(248, 152, 98);
	    Color cafePiso = new Color(176, 107, 60);
	    Color cafeLineas = new Color(92, 45, 10);
	    Color verdeArbusto = new Color(42, 160, 0);
	    Color azulBloque = new Color(113, 201, 255);
	    Color rosaBloque = new Color(255, 195, 185);
	    Color verdeBloque = new Color(0, 215, 90);
	    Color naranjaBloques = new Color(255, 145, 85);
	    Color verdeTuboClaro = new Color(230, 255, 230);
	    Color verdeTuboMedio = new Color(0, 165, 0);
	    Color verdeTuboOscuro = new Color(0, 100, 0);

	    JPanel pane = new JPanel() {
	        @Override
	        protected void paintComponent(Graphics g) {
	            super.paintComponent(g);
	            Graphics2D g2d = (Graphics2D)g;
	            g2d.setStroke(new BasicStroke(3));

	            g2d.setColor(negro);
	            g2d.fillRect(430, 310, 32, 310);
	            g2d.fillRect(340, 420, 32, 200);

	            g2d.setColor(azulBloque);
	            g2d.fillRect(280, 260, 150, 360);
	            g2d.setColor(negro);
	            g2d.drawRect(280, 260, 150, 360);
	            g2d.drawRect(288, 268, 8, 8); 
	            g2d.drawLine(288, 268, 296, 276);
	            g2d.drawRect(414, 268, 8, 8); 
	            g2d.drawLine(414, 268, 422, 276);
	            g2d.drawRect(288, 604, 8, 8); 
	            g2d.drawLine(288, 604, 296, 612);
	            g2d.drawRect(414, 604, 8, 8); 
	            g2d.drawLine(414, 604, 422, 612);

	            g2d.setColor(rosaBloque);
	            g2d.fillRect(190, 380, 150, 240);
	            g2d.setColor(negro);
	            g2d.drawRect(190, 380, 150, 240);
	            g2d.drawRect(198, 388, 8, 8); 
	            g2d.drawLine(198, 388, 206, 396);
	            g2d.drawRect(324, 388, 8, 8); 
	            g2d.drawLine(324, 388, 332, 396);
	            g2d.drawRect(198, 604, 8, 8); 
	            g2d.drawLine(198, 604, 206, 612);
	            g2d.drawRect(324, 604, 8, 8); 
	            g2d.drawLine(324, 604, 332, 612);

	            g2d.setColor(verdeBloque);
	            g2d.fillRect(860, 380, 150, 240);
	            g2d.setColor(negro);
	            g2d.drawRect(860, 380, 150, 240);
	            g2d.drawRect(868, 388, 8, 8); 
	            g2d.drawLine(868, 388, 876, 396);
	            g2d.drawRect(868, 604, 8, 8); 
	            g2d.drawLine(868, 604, 876, 612);

	            g2d.setColor(verdeTuboClaro); 
	            g2d.fillRect(545, 460, 20, 160);
	            g2d.setColor(verdeTuboMedio); 
	            g2d.fillRect(565, 460, 50, 160);
	            g2d.setColor(verdeTuboOscuro); 
	            g2d.fillRect(615, 460, 40, 160);
	            g2d.setColor(negro); 
	            g2d.drawRect(545, 460, 110, 160);

	            g2d.setColor(verdeTuboClaro); 
	            g2d.fillRect(535, 390, 25, 70);
	            g2d.setColor(verdeTuboMedio); 
	            g2d.fillRect(560, 390, 55, 70);
	            g2d.setColor(verdeTuboOscuro); 
	            g2d.fillRect(615, 390, 50, 70);
	            g2d.setColor(negro); 
	            g2d.drawRect(535, 390, 130, 70);

	            g2d.setColor(verdeArbusto);
	            g2d.fillArc(50, 560, 70, 70, 0, 180);
	            g2d.fillArc(120, 550, 60, 80, 0, 180);
	            g2d.fillArc(80, 520, 70, 110, 0, 180);
	            g2d.setColor(negro);
	            g2d.drawArc(50, 560, 70, 70, 0, 180);
	            g2d.drawArc(120, 550, 60, 80, 0, 180);
	            g2d.drawArc(80, 520, 70, 110, 0, 180);

	            g2d.setColor(naranjaBloques);
	            g2d.fillRect(50, 230, 55, 55);
	            g2d.fillRect(160, 50, 55, 55);
	            g2d.fillRect(215, 50, 55, 55);
	            g2d.fillRect(860, 230, 55, 55);

	            g2d.setColor(Color.white);

	            g2d.setFont(new Font("Tahoma",Font.BOLD,32));
	            g2d.drawString("?",70,268);
	            g2d.drawString("?",179,88);
	            g2d.drawString("?",233,88);
	            g2d.drawString("?",879,268);

	            
	            g2d.setColor(negro);
	            g2d.drawRect(50, 230, 55, 55);
	            g2d.fillRect(58, 238, 4, 4); 
	            g2d.fillRect(93, 238, 4, 4); 
	            g2d.fillRect(58, 273, 4, 4); 
	            g2d.fillRect(93, 273, 4, 4);
	            

	            g2d.drawRect(160, 50, 55, 55);
	            g2d.fillRect(168, 58, 4, 4); 
	            g2d.fillRect(203, 58, 4, 4); 
	            g2d.fillRect(168, 93, 4, 4); 
	            g2d.fillRect(203, 93, 4, 4);

	            g2d.drawRect(215, 50, 55, 55);
	            g2d.fillRect(223, 58, 4, 4); 
	            g2d.fillRect(258, 58, 4, 4); 
	            g2d.fillRect(223, 93, 4, 4); 
	            g2d.fillRect(258, 93, 4, 4);

	            g2d.drawRect(860, 230, 55, 55);
	            g2d.fillRect(868, 238, 4, 4); 
	            g2d.fillRect(903, 238, 4, 4); 
	            g2d.fillRect(868, 273, 4, 4); 
	            g2d.fillRect(903, 273, 4, 4);

	            g2d.setColor(naranjaPiso);
	            g2d.fillRect(0, 620, 1000, 20);
	            g2d.setColor(cafePiso);
	            g2d.fillRect(0, 640, 1000, 110);
	            
	            g2d.setColor(cafeLineas);
	            g2d.drawLine(0, 640, 1000, 640);
	            g2d.drawLine(0, 675, 1000, 675);
	            g2d.drawLine(0, 710, 1000, 710);
	            g2d.drawLine(0, 745, 1000, 745);
	            
	            for(int i = 0; i < 1000; i += 35) {
	                g2d.drawLine(i, 640, i, 750);
	            }
	        }
	    };
	    pane.setBackground(azulFondo);
	    pane.setSize(1000, 750);
	    pane.setLocation(0, 0);
	    this.add(pane);
	}
	
	
	
	
}
