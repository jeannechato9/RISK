package lib.natives;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	int a, b, c, d, e, f;
	int [] Alphabet= {a, b, c, d, e, f};
	MainScreenGameState menu;

	private Territoire territoires=new Territoire();
	private int nbre_joueurs;
	private int[] Tableau_terr_y_fin=territoires.getTableau_terr_y_fin();
	private int[] Tableau_terr_x_fin=territoires.getTableau_terr_x_fin();
	private int[] Tableau_terr_y_debut=territoires.getTableau_terr_y_debut();
	private int[] Tableau_terr_x_debut=territoires.getTableau_terr_x_debut();
	int []Armee_posees_joueur1= new int [13];
	int []	Armee_posees_joueur2= {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int []	Armee_posees_joueur3= { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int []	Armee_posees_joueur4= {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int []	Armee_posees_joueur5= { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int []	Armee_posees_joueur6= {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	boolean fin=false;
	int [] Armee_posees_joueur1_5= new int [16];
	int []	Armee_posees_joueur2_5= new int[17];
	int []	Armee_posees_joueur3_5= new int [16];
	int []	Armee_posees_joueur4_5= new int [17];
	int []	Armee_posees_joueur5_5=new int [16];
	
	int [] Armee_posees_joueur1_4=new int[19];
	int [] Armee_posees_joueur2_4=new int[20];
	int [] Armee_posees_joueur3_4=new int[19];
	int [] Armee_posees_joueur4_4=new int[20];
	
	int [] Armee_posees_joueur1_3=new int[21];
	int [] Armee_posees_joueur2_3=new int[21];
	int [] Armee_posees_joueur3_3=new int[21];
	
	int [] Armee_posees_joueur1_2=new int[19];
	int [] Armee_posees_joueur2_2=new int[19];

	ArrayList nbre_armees_joueur1 = new ArrayList();
	boolean une_fois_render_1=true;
	
	ArrayList nbre_armees_joueur2 = new ArrayList();
	boolean une_fois_render_2=true;
	
	ArrayList nbre_armees_joueur3 = new ArrayList();
	boolean une_fois_render_3=true;
	
	ArrayList nbre_armees_joueur4 = new ArrayList();
	boolean une_fois_render_4=true;
	
	ArrayList nbre_armees_joueur5 = new ArrayList();
	boolean une_fois_render_5=true;
	
	ArrayList nbre_armees_joueur6 = new ArrayList();
	boolean une_fois_render_6=true;

	 
	
	
	
public Armee(MainScreenGameState menu, int nbre_joueurs) {
		
		this.menu=menu;
		this.nbre_joueurs=nbre_joueurs;
	}



	private int [] territoirejoueur1_2=new int[7];
	private int [] territoirejoueur2_2=new int[7];
	private int [] territoirejoueur3_2=new int[7];
	private int [] territoirejoueur4_2=new int[7];
	private int [] territoirejoueur5_2=new int[7];
	private int [] territoirejoueur6_2=new int[7];
	

	private int [] territoirejoueur1_5=new int[9];
	private int [] territoirejoueur2_5=new int[8];
	private int [] territoirejoueur3_5=new int[9];
	private int [] territoirejoueur4_5=new int[8];
	private int [] territoirejoueur5_5=new int[8];
	
	private int [] territoirejoueur1_4=new int[11];
	private int []  territoirejoueur2_4=new int[10];
	private int [] territoirejoueur3_4=new int[11];			
	private int []  territoirejoueur4_4=new int[10];
	
	private int [] territoirejoueur1_3=new int[14];
	private int []  territoirejoueur2_3=new int[14];
	private int [] territoirejoueur3_3=new int[14];
	
	private int [] Territoirejoueur1_2=new int[21];
	private int []  Territoirejoueur2_2=new int[21];

 	private Integer [] territoirejoueur1= new Integer[21];
 	private Integer [] territoirejoueur2= new Integer[21];
 	private Integer [] territoirejoueur3= new Integer[14];
 	private Integer [] territoirejoueur4= new Integer[14];
 	private Integer [] territoirejoueur5= new Integer[14];
 	private Integer [] territoirejoueur6=new Integer[14];
 	private Integer [][] TableauTerritoiresJoueurs= {territoirejoueur1,territoirejoueur2, territoirejoueur3, territoirejoueur4, territoirejoueur5, territoirejoueur6};

 	
 	private int [] Tableau_X_territoires= {640, 600, 710, 710, 743, 800, 655, /*Europe*/
	185, 260, 230, 320, 543, 293, 343, 420, 235,   /*Amerique du Nord*/
	745, 785, 755, 843, 670, 760,    /* Afrique*/
	1220, 1135, 1230, 1150,   /*Australie*/
	400, 450, 350, 340,   /*Amerique du Sud*/
	907, 1017, 980, 1030, 1190, 1180, 812, 1075, 1055, 945, 905, 1075		/*Asie*/
	};
	
	private int [] Tableau_Y_territoires= {315, 270, 323, 270, 355, 300, 350,
	260, 310, 467, 390, 230, 268, 320, 305, 360,
	550, 512, 435, 635, 470, 640,
	660, 547, 575, 675,
	700, 600, 615, 530,
	350, 395, 445, 305, 395, 265, 423, 350, 470, 250, 280, 264
	};

	 private Initialisation initialisatio=new Initialisation(menu, 6);
	
	
	
	



	private GameContainer container;
	

	 public void update(GameContainer container) throws SlickException {

		
	  }
	  
	  public void init(GameContainer container) throws SlickException {
		  initialisatio=new Initialisation(menu, nbre_joueurs);
		  this.initialisatio.init();
		  
		  if(nbre_joueurs==6) {
			  
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
		  }
		  

		 if(nbre_joueurs==6) {
			 a=13;
			 b=13;
			 c=13;
			 d=13;
			 e=13;
			 f=13;
		 }
		 if(nbre_joueurs==5) {
			 territoirejoueur1_5= initialisatio.getTerritoirejoueur1_5();
			  for(int i = 0; i < territoirejoueur1_5.length; i++) {
				  territoirejoueur1[i]=Integer.valueOf(territoirejoueur1_5[i]);
			  }
			  
			  
			 territoirejoueur2_5= initialisatio.getTerritoirejoueur2_5();
			 for(int i = 0; i < territoirejoueur2_5.length; i++) {
				  territoirejoueur2[i]=Integer.valueOf(territoirejoueur2_5[i]);
			  }
			 territoirejoueur3_5= initialisatio.getTerritoirejoueur3_5();
			 for(int i = 0; i < territoirejoueur3_5.length; i++) {
				  territoirejoueur3[i]=Integer.valueOf(territoirejoueur3_5[i]);
			  }
			 territoirejoueur4_5= initialisatio.getTerritoirejoueur4_5();
			 for(int i = 0; i < territoirejoueur4_5.length; i++) {
				  territoirejoueur4[i]=Integer.valueOf(territoirejoueur4_5[i]);
			  }
			 territoirejoueur5_5= initialisatio.getTerritoirejoueur5_5();
			 for(int i = 0; i < territoirejoueur5_5.length; i++) {
				  territoirejoueur5[i]=Integer.valueOf(territoirejoueur5_5[i]);
			  }
			 a=c=e=16;
			 b=d=17;		
		 }
		 if(nbre_joueurs==4) {
			 
			 territoirejoueur1_4= initialisatio.getTerritoirejoueur1_4();
			  for(int i = 0; i < territoirejoueur1_4.length; i++) {
				  territoirejoueur1[i]=Integer.valueOf(territoirejoueur1_4[i]);
			  }
			  
			  
			 territoirejoueur2_4= initialisatio.getTerritoirejoueur2_4();
			 for(int i = 0; i < territoirejoueur2_4.length; i++) {
				  territoirejoueur2[i]=Integer.valueOf(territoirejoueur2_4[i]);
			  }
			 territoirejoueur3_4= initialisatio.getTerritoirejoueur3_4();
			 for(int i = 0; i < territoirejoueur3_4.length; i++) {
				  territoirejoueur3[i]=Integer.valueOf(territoirejoueur3_4[i]);
			  }
			 territoirejoueur4_4= initialisatio.getTerritoirejoueur4_4();
			 for(int i = 0; i < territoirejoueur4_4.length; i++) {
				  territoirejoueur4[i]=Integer.valueOf(territoirejoueur4_4[i]);
			  }
			 a=c=19;
			 b=d=20;			
		 }
		 if(nbre_joueurs==3) {
			 territoirejoueur1_3= initialisatio.getTerritoirejoueur1_3();
			  for(int i = 0; i < territoirejoueur1_3.length; i++) {
				  territoirejoueur1[i]=Integer.valueOf(territoirejoueur1_3[i]);
			  }
			  
			  
			 territoirejoueur2_3= initialisatio.getTerritoirejoueur2_3();
			 for(int i = 0; i < territoirejoueur2_3.length; i++) {
				  territoirejoueur2[i]=Integer.valueOf(territoirejoueur2_3[i]);
			  }
			 
			 territoirejoueur3_3= initialisatio.getTerritoirejoueur3_3();
			 for(int i = 0; i < territoirejoueur3_3.length; i++) {
				  territoirejoueur3[i]=Integer.valueOf(territoirejoueur3_3[i]);
			  }
			 a=b=c=21;
		 }
		 if(nbre_joueurs==2) {
			 a=b=19;
			 
			 territoirejoueur1_2= initialisatio.getTerritoirejoueur1_2();
			  for(int i = 0; i < territoirejoueur1_2.length; i++) {
				  territoirejoueur1[i]=Integer.valueOf(territoirejoueur1_2[i]);
			  }
			  
			  
			 territoirejoueur2_2= initialisatio.getTerritoirejoueur2_2();
			 for(int i = 0; i < territoirejoueur2_2.length; i++) {
				  territoirejoueur2[i]=Integer.valueOf(territoirejoueur2_2[i]);
			  }
		 }
	  }
	  
	  public void render(GameContainer container, Graphics g) throws SlickException {
		  
		 
		  posMouseY = container.getInput().getMouseY();
		  posMouseX= container.getInput().getMouseX();
		  
		  

		  if(nbre_joueurs==6) {
			  a=affichage_1( g, a, 0,  container,Armee_posees_joueur1);
				  if(Armee_posees_joueur1[0]!=0) {
					  render_armees_placees_joueur1(g, Armee_posees_joueur1);
			  }
			  
			 
		  
			  b=affichage_2( g, a, b, container, Armee_posees_joueur2);
			  if(Armee_posees_joueur2[0]!=0) {
				  render_armees_placees_joueur2(g, Armee_posees_joueur2);
		  }
			  
			  c=affichage_3( g, a, b, c, container, Armee_posees_joueur3);
		if(Armee_posees_joueur3[0]!=0) {
				  render_armees_placees_joueur3(g, Armee_posees_joueur3);
		  }
		
		d=affichage_4( g, a, b, c, d, container, Armee_posees_joueur4);
		if(Armee_posees_joueur4[0]!=0) {
			  render_armees_placees_joueur4(g, Armee_posees_joueur4);
	  }
		  e=affichage_5( g, a, b, c, d, e, container, Armee_posees_joueur5);
		  if(Armee_posees_joueur5[0]!=0) {

			  render_armees_placees_joueur5(g, Armee_posees_joueur5);
	  }
		  f=affichage_6( g, a, b, c, d, e, f, container, Armee_posees_joueur6);
		  if(Armee_posees_joueur6[0]!=0) {
			  render_armees_placees_joueur6(g, Armee_posees_joueur6);
			  fin=true;
	  }
		  
			  
			  	
			  
				  
				  
		  g.drawString("Joueur 1 :pions rouges", 1200, 20);
		  g.drawString("Joueur 2 :pions bleus", 1200, 35);
		  g.drawString("Joueur 3 :pions blancs", 1200, 50);
		  g.drawString("Joueur 4 :pions jaunes", 1200, 65);
		  g.drawString("Joueur 5 :pions noirs", 1200, 80);
		  g.drawString("Joueur 6 :pions verts", 1200, 95);
		  
		  
		  
		  
		  
		  for(int i = 0; i < TableauTerritoiresJoueurs.length; i++) {
			  for(int e=1; e <43; e++) {
			 if(Arrays.asList(TableauTerritoiresJoueurs[i]).contains(e)) {	
				    render_pions(i, g, e);   
			 }
			 
			  }
			    
		  	}
		  }
		  
		  
		  if(nbre_joueurs==5) {
			  
			  g.drawString("Joueur 1 :pions rouges", 1200, 20);
			  g.drawString("Joueur 2 :pions bleus", 1200, 35);
			  g.drawString("Joueur 3 :pions blancs", 1200, 50);
			  g.drawString("Joueur 4 :pions jaunes", 1200, 65);
			  g.drawString("Joueur 5 :pions noirs", 1200, 80);
			  
			  
			  a=affichage_1( g, a, 0, container, Armee_posees_joueur1_5);
			  if(Armee_posees_joueur1_5[0]!=0) {

				  render_armees_placees_joueur1(g, Armee_posees_joueur1_5);
		  }
			  b=affichage_2( g, a, b, container, Armee_posees_joueur2_5);
			  if(Armee_posees_joueur2_5[0]!=0) {

				  render_armees_placees_joueur2(g, Armee_posees_joueur2_5);
		  }
			  c=affichage_3( g, a, b, c, container, Armee_posees_joueur3_5);
			  if(Armee_posees_joueur3_5[0]!=0) {

				  render_armees_placees_joueur3(g, Armee_posees_joueur3_5);
		  }
			  d=affichage_4( g, a, b, c, d, container, Armee_posees_joueur4_5);
			  if(Armee_posees_joueur4_5[0]!=0) {

				  render_armees_placees_joueur4(g, Armee_posees_joueur4_5);
		  }
			  e=affichage_5( g, a, b, c, d, e, container, Armee_posees_joueur5_5);
			  if(Armee_posees_joueur5_5[0]!=0) {

				  render_armees_placees_joueur5(g, Armee_posees_joueur5_5);
				  fin=true;
		  }
			  
				
			  
			  for(int i = 0; i < TableauTerritoiresJoueurs.length-1; i++) {
				  for(int e=1; e <43; e++) {
				 if(Arrays.asList(TableauTerritoiresJoueurs[i]).contains(e)) {	
					    render_pions(i, g, e);   
				 }
				 
				  }
				    
			 }
			  }
		  
		  if(nbre_joueurs==4) {
			  
			 
			  
			  g.drawString("Joueur 1 :pions rouges", 1200, 20);
			  g.drawString("Joueur 2 :pions bleus", 1200, 35);
			  g.drawString("Joueur 3 :pions blancs", 1200, 50);
			  g.drawString("Joueur 4 :pions jaunes", 1200, 65);
			  
			  a=affichage_1( g, a, 0, container, Armee_posees_joueur1_4);
			  if(Armee_posees_joueur1_4[0]!=0) {

				  render_armees_placees_joueur1(g, Armee_posees_joueur1_4);
		  }
			  b=affichage_2( g, a, b, container, Armee_posees_joueur2_4);
			  if(Armee_posees_joueur2_4[0]!=0) {

				  render_armees_placees_joueur2(g, Armee_posees_joueur2_4);
		  }
			  c=affichage_3( g, a, b, c, container, Armee_posees_joueur3_4);
			  if(Armee_posees_joueur3_4[0]!=0) {

				  render_armees_placees_joueur3(g, Armee_posees_joueur3_4);
		  }
			  d=affichage_4( g, a, b, c, d, container, Armee_posees_joueur4_4);
			  if(Armee_posees_joueur4_4[0]!=0) {

				  render_armees_placees_joueur4(g, Armee_posees_joueur4_4);
				  fin=true;
		  }
			  
			  
			  
			  
			  for(int i = 0; i < TableauTerritoiresJoueurs.length-2; i++) {
				  for(int e=1; e <43; e++) {
				 if(Arrays.asList(TableauTerritoiresJoueurs[i]).contains(e)) {	
					    render_pions(i, g, e);   
				 }
				 
				  }
				    
			 }
			  }
		  
		  
		  if(nbre_joueurs==3) {
			  
			  
			  
			  g.drawString("Joueur 1 :pions rouges", 1200, 20);
			  g.drawString("Joueur 2 :pions bleus", 1200, 35);
			  g.drawString("Joueur 3 :pions blancs", 1200, 50);
			  
			  
			  a=affichage_1( g, a, 0, container, Armee_posees_joueur1_3);
			  if(Armee_posees_joueur1_3[0]!=0) {

				  render_armees_placees_joueur1(g, Armee_posees_joueur1_3);
		  }
			  b=affichage_2( g, a, b, container, Armee_posees_joueur2_3);
			  if(Armee_posees_joueur2_3[0]!=0) {

				  render_armees_placees_joueur2(g, Armee_posees_joueur2_3);
		  }
			  c=affichage_3( g, a, b, c, container, Armee_posees_joueur3_3);
			  if(Armee_posees_joueur3_3[0]!=0) {

				  render_armees_placees_joueur3(g, Armee_posees_joueur3_3);
				  fin=true;
		  }
			
			  
			 
			  
			  
			  
			  for(int i = 0; i < TableauTerritoiresJoueurs.length-3; i++) {
				  for(int e=1; e <43; e++) {
				 if(Arrays.asList(TableauTerritoiresJoueurs[i]).contains(e)) {	
					    render_pions(i, g, e);   
				 }
				 
				  }
				    
			 }
			  }
		  
		  
		  if(nbre_joueurs==2) {
			  
			  g.drawString("Joueur 1 :pions rouges", 1200, 20);
			  g.drawString("Joueur 2 :pions bleus", 1200, 35);
			  
			 
			  a=affichage_1( g, a, 0, container, Armee_posees_joueur1_2);
			  if(Armee_posees_joueur1_2[0]!=0) {

				  render_armees_placees_joueur1(g, Armee_posees_joueur1_2);
		  }
			  b=affichage_2( g, a, b, container, Armee_posees_joueur2_2);
			  if(Armee_posees_joueur2_2[0]!=0) {

				  render_armees_placees_joueur2(g, Armee_posees_joueur2_2);
				  fin=true;
		  }
			  
			  
			  
			  for(int i = 0; i < TableauTerritoiresJoueurs.length-4; i++) {
				  for(int e=1; e <43; e++) {
				 if(Arrays.asList(TableauTerritoiresJoueurs[i]).contains(e)) {	
					    render_pions(i, g, e);   
				 }
				 
				  }
				    
			 }
			  }
		  
		 
		 
		
		 this.initialisatio.render(container, g);
		 
		 
		 
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
		 g.setColor(Color.yellow);
		 g.fillOval(Tableau_X_territoires[e-1], Tableau_Y_territoires[e-1], 15, 15);
		 g.setColor(Color.black);
		 g.drawOval(Tableau_X_territoires[e-1], Tableau_Y_territoires[e-1], 15, 15);
		 }
   if(i==4) {
		 g.setColor(Color.black);
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

public  int affichage_1(Graphics g, int a,int i, GameContainer container, int []Armee_posees_joueur1) {
	
	if(a!=0) {
		if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&Arrays.asList(territoirejoueur1).contains(e+1)){
					Armee_posees_joueur1[a-1]=e+1;
			  a=a-1;
		
		  }
			}
		}
		
		g.setColor(Color.black);
	   g.drawString("Joueur 1 placez vos armées sur vos territoires", 500, 140);
	   g.drawString("Il vous reste "+a+" armées à placer", 555, 155);
	   
	   return a;
	}
	


	else{
		return 0;
	}
	
}


public void render_armees_placees_joueur1(Graphics g, int []Armee_posees_joueur1) {

	Map<Integer,Integer> map_1 = new HashMap<>();
	for(int i = 0 ; i < Armee_posees_joueur1.length ; i++){
	 // Si l'element existe deja, on remplace la valeur
	 if(map_1.containsKey(Armee_posees_joueur1[i])){
	  map_1.replace(Armee_posees_joueur1[i],map_1.get(Armee_posees_joueur1[i])+1);
	 }
	 // Sinon on l'ajoute
	 else{
	  map_1.put(Armee_posees_joueur1[i],1);
	 }
	}
	
	for(Integer key : map_1.keySet()){	
		
		
		 g.setColor(Color.black);
		}
	
	if(une_fois_render_1) {
		for(Integer key : map_1.keySet()){	
			nbre_armees_joueur1.add(key);
			nbre_armees_joueur1.add(map_1.get(key)+1);
		}
		
	}
	une_fois_render_1=false;


	
}




public  int affichage_2(Graphics g, int a,int b, GameContainer container, int []Armee_posees_joueur2) {
	if(a==0&&b!=0) {

		if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&Arrays.asList(territoirejoueur2).contains(e+1)){

					Armee_posees_joueur2[b-1]=e+1;
			  b=b-1;
		
		  }
			}
		}
		  g.drawString("Joueur 2 placez vos armées sur vos territoires", 500, 140);
		   g.drawString("Il vous reste "+b+" armées à placer", 555, 155);
		   return b;
	  }
	else{
		
		return b;
	}
	

}




public void render_armees_placees_joueur3(Graphics g, int [] Armee_posees_joueur3) {
	 
	Map<Integer,Integer> map_2 = new HashMap<>();
	for(int i = 0 ; i < Armee_posees_joueur3.length ; i++){
	 // Si l'element existe deja, on remplace la valeur
	 if(map_2.containsKey(Armee_posees_joueur3[i])){
	  map_2.replace(Armee_posees_joueur3[i],map_2.get(Armee_posees_joueur3[i])+1);
	 }
	 // Sinon on l'ajoute
	 else{
	  map_2.put(Armee_posees_joueur3[i],1);
	 }
	}
	
	
	if(une_fois_render_3) {
		for(Integer key : map_2.keySet()){	
			nbre_armees_joueur3.add(key);
			nbre_armees_joueur3.add(map_2.get(key)+1);
		}
		
	}
	une_fois_render_3=false;
}



public void render_armees_placees_joueur4(Graphics g, int [] Armee_posees_joueur4) {
	 
	Map<Integer,Integer> map_2 = new HashMap<>();
	for(int i = 0 ; i < Armee_posees_joueur4.length ; i++){
	 // Si l'element existe deja, on remplace la valeur
	 if(map_2.containsKey(Armee_posees_joueur4[i])){
	  map_2.replace(Armee_posees_joueur4[i],map_2.get(Armee_posees_joueur4[i])+1);
	 }
	 // Sinon on l'ajoute
	 else{
	  map_2.put(Armee_posees_joueur4[i],1);
	 }
	}
	
	
	
	if(une_fois_render_4) {
		for(Integer key : map_2.keySet()){	
			nbre_armees_joueur4.add(key);
			nbre_armees_joueur4.add(map_2.get(key)+1);
		}
		
	}
	une_fois_render_4=false;
}


public void render_armees_placees_joueur5(Graphics g, int [] Armee_posees_joueur5) {
	 
	Map<Integer,Integer> map_2 = new HashMap<>();
	for(int i = 0 ; i < Armee_posees_joueur5.length ; i++){
	 // Si l'element existe deja, on remplace la valeur
	 if(map_2.containsKey(Armee_posees_joueur5[i])){
	  map_2.replace(Armee_posees_joueur5[i],map_2.get(Armee_posees_joueur5[i])+1);
	 }
	 // Sinon on l'ajoute
	 else{
	  map_2.put(Armee_posees_joueur5[i],1);
	 }
	}
	
	
	
	if(une_fois_render_5) {
		for(Integer key : map_2.keySet()){	
			nbre_armees_joueur5.add(key);
			nbre_armees_joueur5.add(map_2.get(key)+1);
		}
		
	}
	une_fois_render_5=false;
}


public void render_armees_placees_joueur6(Graphics g, int [] Armee_posees_joueur2) {
	 
	Map<Integer,Integer> map_2 = new HashMap<>();
	for(int i = 0 ; i < Armee_posees_joueur6.length ; i++){
	 // Si l'element existe deja, on remplace la valeur
	 if(map_2.containsKey(Armee_posees_joueur6[i])){
	  map_2.replace(Armee_posees_joueur6[i],map_2.get(Armee_posees_joueur6[i])+1);
	 }
	 // Sinon on l'ajoute
	 else{
	  map_2.put(Armee_posees_joueur6[i],1);
	 }
	}
	
	
	
	if(une_fois_render_6) {
		for(Integer key : map_2.keySet()){	
			nbre_armees_joueur6.add(key);
			nbre_armees_joueur6.add(map_2.get(key)+1);
		}
		
	}
	une_fois_render_6=false;
}



public void render_armees_placees_joueur2(Graphics g, int [] Armee_posees_joueur2) {
	 
	Map<Integer,Integer> map_2 = new HashMap<>();
	for(int i = 0 ; i < Armee_posees_joueur2.length ; i++){
	 // Si l'element existe deja, on remplace la valeur
	 if(map_2.containsKey(Armee_posees_joueur2[i])){
	  map_2.replace(Armee_posees_joueur2[i],map_2.get(Armee_posees_joueur2[i])+1);
	 }
	 // Sinon on l'ajoute
	 else{
	  map_2.put(Armee_posees_joueur2[i],1);
	 }
	}
	
	for(Integer key : map_2.keySet()){
		 g.setColor(Color.black);
		}
	
	
	if(une_fois_render_2) {
		for(Integer key : map_2.keySet()){	

			nbre_armees_joueur2.add(key);
			nbre_armees_joueur2.add(map_2.get(key)+1);
			
		}
		
		
	}
	une_fois_render_2=false;
}

	  
public  int affichage_3(Graphics g, int a,int b,int c, GameContainer container, int [] Armee_posees_joueur3) {
	if(b==0&&c!=0) {
		if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&Arrays.asList(territoirejoueur3).contains(e+1)){

					  Armee_posees_joueur3[c-1]=e+1;
			  c=c-1;
		
		  }
			}
		}

		  g.drawString("Joueur 3 placez vos armées sur vos territoires", 500, 140);
		   g.drawString("Il vous reste "+c+" armées à placer", 555, 155);
		   return c;
	  }
	else{
		
		return c;
	}
}



	
	
	
	public  int affichage_4(Graphics g, int a,int b,int c,int d, GameContainer container, int []Armee_posees_joueur4) {
		if(c==0&&d!=0) {
			if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				for(int e=1; e <42; e++) {
					if(posMouseX>Tableau_terr_x_debut[e]&&
					posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
					posMouseY<Tableau_terr_y_fin[e]&&Arrays.asList(territoirejoueur4).contains(e+1)){

						  Armee_posees_joueur4[d-1]=e+1;
				  d=d-1;
			
			  }
				}
			}

			  g.drawString("Joueur 4 placez vos armées sur vos territoires", 500, 140);
			   g.drawString("Il vous reste "+d+" armées à placer", 555, 155);
			   return d;
		  }
		else{
			
			return d;
		}
	}
	

		
		
		public  int affichage_5(Graphics g, int a,int b,int c,int d, int e, GameContainer container, int []Armee_posees_joueur5) {
			if(d==0&&e!=0) {
				if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
					for(int z=1; z <42; z++) {
						if(posMouseX>Tableau_terr_x_debut[z]&&
						posMouseX<Tableau_terr_x_fin[z]&&posMouseY>Tableau_terr_y_debut[z]&&
						posMouseY<Tableau_terr_y_fin[z]&&Arrays.asList(territoirejoueur5).contains(z+1)){

							  Armee_posees_joueur5[e-1]=z+1;
					  e=e-1;
				
				  }
					}
				}

				  g.drawString("Joueur 5 placez vos armées sur vos territoires", 500, 140);
				   g.drawString("Il vous reste "+e+" armées à placer", 555, 155);
				   return e;
			  }
			else{
				
				return e;
			}
	
}

		
		

		public  int affichage_6(Graphics g, int a,int b,int c,int d, int e, int f, GameContainer container, int []Armee_posees_joueur6) {
			if(e==0&&f!=0) {
				if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
					for(int z=1; z <42; z++) {
						if(posMouseX>Tableau_terr_x_debut[z]&&
						posMouseX<Tableau_terr_x_fin[z]&&posMouseY>Tableau_terr_y_debut[z]&&
						posMouseY<Tableau_terr_y_fin[z]&&Arrays.asList(territoirejoueur6).contains(z+1)){

							  Armee_posees_joueur6[f-1]=z+1;
					  f=f-1;
				
				  }
					}
				}

				  g.drawString("Joueur 6 placez vos armées sur vos territoires", 500, 140);
				   g.drawString("Il vous reste "+f+" armées à placer", 555, 155);
				   return f;
			  }
			else{
				
				return f;
			}
		}
		
		public Integer[] getTerritoirejoueur1() {
			 return territoirejoueur1;
		 }
		
		public Integer[] getTerritoirejoueur2() {
			 return territoirejoueur2;
		 }
		
		public Integer[] getTerritoirejoueur3() {
			 return territoirejoueur3;
		 }
		
		public Integer[] getTerritoirejoueur4() {
			 return territoirejoueur4;
		 }
		
		public Integer[] getTerritoirejoueur5() {
			 return territoirejoueur5;
		 }
		
		public Integer[] getTerritoirejoueur6() {
			 return territoirejoueur6;
		 }
		
		public boolean getfin(){
	return fin;
		}
		
		
		public int[] getarmees_posees_joueur1_2() {
			return Armee_posees_joueur1_2;
		}
		
		public int[] getarmees_posees_joueur2_2() {
			return Armee_posees_joueur2_2;
		}
		
		
		public int[] getarmees_posees_joueur1_3() {
			return Armee_posees_joueur1_3;
		}
		
		public int[] getarmees_posees_joueur2_3() {
			return Armee_posees_joueur2_3;
		}
		
		public int[] getarmees_posees_joueur3_3() {
			return Armee_posees_joueur3_3;
		}
		
		
		public int[] getarmees_posees_joueur1_4() {
			return Armee_posees_joueur1_4;
		}
		
		public int[] getarmees_posees_joueur2_4() {
			return Armee_posees_joueur2_4;
		}
		
		public int[] getarmees_posees_joueur3_4() {
			return Armee_posees_joueur3_4;
		}
		
		
		public int[] getarmees_posees_joueur4_4() {
			return Armee_posees_joueur4_4;
		}
		
		public int[] getarmees_posees_joueur1_5() {
			return Armee_posees_joueur1_5;
		}
		
		
		public int[] getarmees_posees_joueur2_5() {
			return Armee_posees_joueur2_5;
		}
		
		public int[] getarmees_posees_joueur3_5() {
			return Armee_posees_joueur3_5;
		}
		
		public int[] getarmees_posees_joueur4_5() {
			return Armee_posees_joueur4_5;
		}
		
		public int[] getarmees_posees_joueur5_5() {
			return Armee_posees_joueur5_5;
		}
		
		
		public int[] getarmees_posees_joueur1_6() {
			return Armee_posees_joueur1;
		}
		
		
		public int[] getarmees_posees_joueur2_6() {
			return Armee_posees_joueur2;
		}
		
		public int[] getarmees_posees_joueur3_6() {
			return Armee_posees_joueur3;
		}
		
		public int[] getarmees_posees_joueur4_6() {
			return Armee_posees_joueur4;
		}
		
		public int[] getarmees_posees_joueur5_6() {
			return Armee_posees_joueur5;
		}
		
		public int[] getarmees_posees_joueur6_6() {
			return Armee_posees_joueur6;
		}
		
		
		
		
		
		public ArrayList getnbre_armees_joueur2() {
			return nbre_armees_joueur2;
		}
		
		public ArrayList getnbre_armees_joueur3() {
			return nbre_armees_joueur3;
		}
		
		
		public ArrayList getnbre_armees_joueur4() {
			return nbre_armees_joueur4;
		}
		
		
		public ArrayList getnbre_armees_joueur5() {
			return nbre_armees_joueur5;
		}
		
		
		public ArrayList getnbre_armees_joueur6() {
			return nbre_armees_joueur6;
		}
		
		
	
}

	


	
	 
	 






