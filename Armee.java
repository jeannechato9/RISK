package lib.natives;

import java.util.Arrays;

import org.newdawn.slick.AppletGameContainer.Container;
import org.newdawn.slick.Color;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Armee {
	
	private map map;
	private int posMouseY;
	private int posMouseX;
	private int x_terr1_EU, y_terr1_EU,x_terr2_EU, y_terr2_EU,x_terr3_EU, y_terr3_EU,x_terr4_EU, y_terr4_EU,x_terr5_EU,
	y_terr5_EU, x_terr6_EU, y_terr6_EU, x_terr7_EU, y_terr7_EU;
	private int x_terr1_NA, y_terr1_NA,x_terr2_NA, y_terr2_NA,x_terr3_NA, y_terr3_NA,x_terr4_NA, y_terr4_NA,x_terr5_NA,
	y_terr5_NA, x_terr6_NA, y_terr6_NA, x_terr7_NA, y_terr7_NA, x_terr8_NA, y_terr8_NA, x_terr9_NA, y_terr9_NA;
	private int x_terr1_AF, y_terr1_AF,x_terr2_AF, y_terr2_AF,x_terr3_AF, y_terr3_AF,x_terr4_AF, y_terr4_AF,x_terr5_AF,
	y_terr5_AF, x_terr6_AF, y_terr6_AF;
	private int x_terr1_AUSTR, y_terr1_AUSTR,x_terr2_AUSTR, y_terr2_AUSTR,x_terr3_AUSTR, y_terr3_AUSTR,x_terr4_AUSTR, y_terr4_AUSTR;
	private int x_terr1_AS, y_terr1_AS,x_terr2_AS, y_terr2_AS,x_terr3_AS, y_terr3_AS,x_terr4_AS, y_terr4_AS;
	private int x_terr1_ASIE, y_terr1_ASIE,x_terr2_ASIE, y_terr2_ASIE,x_terr3_ASIE, y_terr3_ASIE,x_terr4_ASIE, y_terr4_ASIE,x_terr5_ASIE,
	y_terr5_ASIE, x_terr6_ASIE, y_terr6_ASIE, x_terr7_ASIE, y_terr7_ASIE, x_terr8_ASIE, y_terr8_ASIE, x_terr9_ASIE, y_terr9_ASIE,
	x_terr10_ASIE, y_terr10_ASIE, x_terr11_ASIE, y_terr11_ASIE, x_terr12_ASIE, y_terr12_ASIE, x_terr13_ASIE, y_terr13_ASIE,
	x_terr14_ASIE, y_terr14_ASIE;
	
	private int [] Tableau_terr_x= {x_terr1_EU, x_terr2_EU,x_terr3_EU,x_terr4_EU,x_terr5_EU, x_terr6_EU, x_terr7_EU,
		x_terr1_NA, x_terr2_NA,x_terr3_NA,x_terr4_NA, x_terr5_NA, x_terr6_NA, x_terr7_NA, x_terr8_NA, x_terr9_NA, 
		x_terr1_AF,x_terr2_AF,x_terr3_AF,x_terr4_AF,x_terr5_AF, x_terr6_AF, x_terr1_AUSTR,x_terr2_AUSTR,x_terr3_AUSTR,
		x_terr4_AUSTR, x_terr1_AS,x_terr2_AS,x_terr3_AS,x_terr4_AS, x_terr1_ASIE,x_terr2_ASIE,x_terr3_ASIE,x_terr4_ASIE,
		x_terr5_ASIE, x_terr6_ASIE, x_terr7_ASIE, x_terr8_ASIE, x_terr9_ASIE, x_terr10_ASIE, x_terr11_ASIE, 
		x_terr12_ASIE, x_terr13_ASIE, x_terr14_ASIE};
	
	
	private int [] Tableau_terr_y= { y_terr1_EU, y_terr2_EU, y_terr3_EU, y_terr4_EU,y_terr5_EU, y_terr6_EU, y_terr7_EU,
		y_terr1_NA, y_terr2_NA, y_terr3_NA, y_terr4_NA, y_terr5_NA, y_terr6_NA, y_terr7_NA, y_terr8_NA, y_terr9_NA,
		y_terr1_AF, y_terr2_AF, y_terr3_AF, y_terr4_AF, y_terr5_AF, y_terr6_AF, y_terr1_AUSTR, y_terr2_AUSTR, 
		y_terr3_AUSTR, y_terr4_AUSTR, y_terr1_AS, y_terr2_AS, y_terr3_AS, y_terr4_AS, y_terr1_ASIE, y_terr2_ASIE, 
		y_terr3_ASIE, y_terr4_ASIE, y_terr5_ASIE, y_terr6_ASIE, y_terr7_ASIE, y_terr8_ASIE, y_terr9_ASIE,y_terr10_ASIE,
		y_terr11_ASIE, y_terr12_ASIE, y_terr13_ASIE, y_terr14_ASIE};
	
	int e=13;

	private Initialisation initialisatio= new Initialisation(map, 6);
	private boolean init=initialisatio.getIni();
	private int [] territoirejoueur1_2=new int[7];
	private int [] territoirejoueur2_2=new int[7];
	private int [] territoirejoueur3_2=new int[7];
	private int [] territoirejoueur4_2=new int[7];
	private int [] territoirejoueur5_2=new int[7];
	private int [] territoirejoueur6_2=new int[7];
	private Integer [] territoirejoueur1= new Integer[7];
 	private Integer [] territoirejoueur2= new Integer[7];
 	private Integer [] territoirejoueur3= new Integer[7];
 	private Integer [] territoirejoueur4= new Integer[7];
 	private Integer [] territoirejoueur5= new Integer[7];
 	private Integer [] territoirejoueur6=new Integer[7];
 	private Integer [][] TableauTerritoiresJoueurs= {territoirejoueur1,territoirejoueur2, territoirejoueur3, territoirejoueur4, territoirejoueur5, territoirejoueur6};
	private int [] Tableau_X_territoires= {640, 600, 710, 710, 743, 800, 655, /*Europe*/
	185, 260, 230, 320, 543, 293, 343, 420, 235,   /*Amerique du Nord*/
	745, 785, 755, 843, 670, 760,    /* Afrique*/
	1220, 1135, 1230, 1150,   /*Australie*/
	400, 450, 350, 340,   /*Amerique du Sud*/
	907, 1017, 980, 1030, 1190, 1080, 812, 420, 1055, 945, 905, 1075		/*Asie*/
	};
	
	private int [] Tableau_Y_territoires= {315, 270, 323, 270, 355, 300, 350,
	260, 310, 467, 390, 230, 268, 320, 305, 360,
	550, 512, 435, 635, 470, 640,
	660, 547, 575, 675,
	700, 600, 615, 530,
	350, 395, 445, 305, 395, 265, 423, 305, 470, 250, 280, 264
	};


	private GameContainer container;

	 public void update(GameContainer container) throws SlickException {
		
		
	  }
	  
	  public void init(GameContainer container) throws SlickException {

		  this.initialisatio.init();
		  territoirejoueur1_2= initialisatio.getTerritoirejoueur1();
		  for(int i = 0; i < territoirejoueur1_2.length; i++) {
			  territoirejoueur1[i]=Integer.valueOf(territoirejoueur1_2[i]);
		  }
		  
		  
		 territoirejoueur2_2= initialisatio.getTerritoirejoueur2();
		 for(int i = 0; i < territoirejoueur2_2.length; i++) {
			  territoirejoueur2[i]=Integer.valueOf(territoirejoueur2_2[i]);
		  }
		 territoirejoueur3_2= initialisatio.getTerritoirejoueur3();
		 for(int i = 0; i < territoirejoueur3_2.length; i++) {
			  territoirejoueur3[i]=Integer.valueOf(territoirejoueur3_2[i]);
		  }
		 territoirejoueur4_2= initialisatio.getTerritoirejoueur4();
		 for(int i = 0; i < territoirejoueur4_2.length; i++) {
			  territoirejoueur4[i]=Integer.valueOf(territoirejoueur4_2[i]);
		  }
		 territoirejoueur5_2= initialisatio.getTerritoirejoueur5();
		 for(int i = 0; i < territoirejoueur5_2.length; i++) {
			  territoirejoueur5[i]=Integer.valueOf(territoirejoueur5_2[i]);
		  }
		 territoirejoueur6_2= initialisatio.getTerritoirejoueur6();
		 for(int i = 0; i < territoirejoueur6_2.length; i++) {
			  territoirejoueur6[i]=Integer.valueOf(territoirejoueur6_2[i]);
		  }
		  
		  
		  
		  
		  
		 System.out.print(Arrays.toString(territoirejoueur1)+"couc");
		  	
	  }
	  
	  public void render(GameContainer container, Graphics g) throws SlickException {
		  if(init==true) {
		  e=Dim(container, e);
		  if(e!=0) {
		   g.drawString("Joueur 1 placez vos armées sur vos territoires", 500, 140);
		   g.drawString("Il vous reste "+e+" armées à placer", 555, 155);
		  }
		  
		  g.drawString("Joueur 1 :pions rouges", 1200, 20);
		  g.drawString("Joueur 2 :pions bleus", 1200, 35);
		  g.drawString("Joueur 3 :pions blancs", 1200, 50);
		  g.drawString("Joueur 4 :pions jaunes", 1200, 65);
		  g.drawString("Joueur 5 :pions roses", 1200, 80);
		  g.drawString("Joueur 6 :pions verts", 1200, 95);
		  
		  for(int i = 0; i < TableauTerritoiresJoueurs.length; i++) {
			  for(int e=1; e <43; e++) {
			 if(Arrays.asList(TableauTerritoiresJoueurs[i]).contains(e)) {	
				    render_pions(i, g, e);   
			 }
			 
			  }
			    
		 }
		  
		 
		 
		 
		 	//faire apparaitre e fois des points
		
		 
		 
		
		 if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
		 Dim_x(container);
		 Dim_y(container);
		 }
		 
		 
		  }
	  }
	  
	  public Armee(map map) {
		    this.map = map;
		  }
	  
	  public int Dim( GameContainer container, int e) {
		  if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)&& e>0){
		  
			  return e-1;
		  }
		  else {
			  return e;
		  }
	  }
		  
		  
		 
		  
public int Dim_y( GameContainer container) {

	 posMouseY=container.getInput().getMouseY();
	 return posMouseY;	 
	
			   
	  
  }

public int Dim_x( GameContainer container) {
	
	 posMouseX=container.getInput().getMouseX();
	 posMouseY=container.getInput().getMouseY();
	 return posMouseX;	
	
}

public void render_pions(int i, Graphics g, int e) {
	if(i==0) {
		 g.setColor(Color.red);
		 g.fillOval(Tableau_X_territoires[e-1], Tableau_Y_territoires[e-1], 15, 15);
		 g.setColor(Color.black);
		 g.drawOval(Tableau_X_territoires[e-1], Tableau_Y_territoires[e-1], 15, 15);
		 
		 }
   if(i==1) {
		 g.setColor(Color.blue);
		 g.fillOval(Tableau_X_territoires[e-1], Tableau_Y_territoires[e-1], 15, 15);
		 g.setColor(Color.black);
		 g.drawOval(Tableau_X_territoires[e-1], Tableau_Y_territoires[e-1], 15, 15);
		 }
   if(i==2) {
		 g.setColor(Color.white);
		 g.fillOval(Tableau_X_territoires[e-1], Tableau_Y_territoires[e-1], 15, 15);
		 g.setColor(Color.black);
		 g.drawOval(Tableau_X_territoires[e-1], Tableau_Y_territoires[e-1], 15, 15);
		 }
   if(i==3) {
		 g.setColor(Color.black);
		 g.fillOval(Tableau_X_territoires[e-1], Tableau_Y_territoires[e-1], 15, 15);
		 g.setColor(Color.black);
		 g.drawOval(Tableau_X_territoires[e-1], Tableau_Y_territoires[e-1], 15, 15);
		 }
   if(i==4) {
		 g.setColor(Color.yellow);
		 g.fillOval(Tableau_X_territoires[e-1], Tableau_Y_territoires[e-1], 15, 15);
		 g.setColor(Color.black);
		 g.drawOval(Tableau_X_territoires[e-1], Tableau_Y_territoires[e-1], 15, 15);
		 }
   if(i==5) {
		 g.setColor(Color.green);
		 g.fillOval(Tableau_X_territoires[e-1], Tableau_Y_territoires[e-1], 15, 15);
		 g.setColor(Color.black);
		 g.drawOval(Tableau_X_territoires[e-1], Tableau_Y_territoires[e-1], 15, 15);
		 }
}

}
