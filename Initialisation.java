package lib.natives;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Initialisation {
	
	
	
public Initialisation(MainScreenGameState menu, int nbre_joueurs) {
		
		this.menu=menu;
		this.nbre_joueurs=nbre_joueurs;
	}

	MainScreenGameState menu;
	private int nbre_joueurs;
	private GameContainer container;
	private boolean ini=true;
	private String miss1="Détruire le joueur";
	private String miss2="Conquérir tous les territoires";
	private String miss3="Contrôler 3 régions et au moins 18 territoires";
	private String miss4="Contrôler 18 territoires avec au moins 2 armées";
	private String miss5="Contrôler 30 territoires";
	private String miss6="Contrôler 24 territoires";
	private String miss7="Contrôler 21 territoires";
	private String miss8="Contrôler la plus grosse région + 1 autre région";
	private String mission_joueur1="vide", mission_joueur6="vide",mission_joueur2="vide", mission_joueur3="vide",
			mission_joueur4="vide", mission_joueur5="vide";
	
	private String [] Tab_missions_joueurs= {mission_joueur1, mission_joueur2, mission_joueur3, mission_joueur4, mission_joueur5, mission_joueur6};

	String [] tab_missions_6 = {miss1, miss3, miss4, miss7, miss8};
	String [] tab_missions_5 = {miss1, miss3, miss4, miss6, miss8};
	String [] tab_missions_4 = {miss1, miss3, miss4, miss6, miss8};
	String [] tab_missions_3 = {miss1, miss2, miss3, miss4, miss5, miss8};
	String [] tab_missions_2 = {miss2, miss3, miss5, miss8};
	
	String [][] Tableau_mission_nbre_joueurs= { tab_missions_2, tab_missions_3, tab_missions_4, tab_missions_5, tab_missions_6};
	
	 int [] Territoirejoueur1=new int[7];
	 int [] Territoirejoueur2=new int[7];
	 int [] Territoirejoueur3=new int[7];			
	 int [] Territoirejoueur4=new int[7];
	 int [] Territoirejoueur5=new int[7];
	 int [] Territoirejoueur6=new int[7];
	 
	 int [] Territoirejoueur1_5=new int[9];
	 int []  Territoirejoueur2_5=new int[8];
	 int [] Territoirejoueur3_5=new int[9];				
	 int []  Territoirejoueur4_5=new int[8];
	 int []  Territoirejoueur5_5=new int[8];
	 
	 int [] Territoirejoueur1_4=new int[11];
	 int []  Territoirejoueur2_4=new int[10];
	 int [] Territoirejoueur3_4=new int[11];			
	 int []  Territoirejoueur4_4=new int[10];
	 
	 int [] Territoirejoueur1_3=new int[14];
	 int []  Territoirejoueur2_3=new int[14];
	 int [] Territoirejoueur3_3=new int[14];	
	 
	 int [] Territoirejoueur1_2=new int[21];
	 int []  Territoirejoueur2_2=new int[21];
	 
	 int [][]Tableau_territoires_joueur1= {Territoirejoueur1,Territoirejoueur1_5,Territoirejoueur1_4,Territoirejoueur1_3, Territoirejoueur1_2};
	 int [][]Tableau_territoires_joueur2= {Territoirejoueur2,Territoirejoueur2_5,Territoirejoueur2_4,Territoirejoueur2_3, Territoirejoueur2_2};
	 int [][]Tableau_territoires_joueur3= {Territoirejoueur3,Territoirejoueur3_5,Territoirejoueur3_4,Territoirejoueur3_3};
	 int [][]Tableau_territoires_joueur4= {Territoirejoueur4,Territoirejoueur4_5,Territoirejoueur4_4};
	 int [][]Tableau_territoires_joueur5= {Territoirejoueur5,Territoirejoueur5_5};
	 int [][]Tableau_territoires_joueur6= {Territoirejoueur6};
	 
	 int [][]Tableau_territoires_joueurs= {Territoirejoueur1, Territoirejoueur2, Territoirejoueur3, Territoirejoueur4, Territoirejoueur5, Territoirejoueur6};
	private int X;
	private int joueur_adverse, joueur_adverse2, joueur_adverse3, joueur_adverse4, joueur_adverse5, joueur_adverse6;
	private int[] tab_joueurs_adverse= {joueur_adverse, joueur_adverse2, joueur_adverse3, joueur_adverse4, joueur_adverse5, joueur_adverse6};
	private Territoire territoires=new Territoire();
	ArrayList liste_territoires = new ArrayList();

	 
	 
	
	int nbre_armees;
	 Boolean une_fois=true;

	

	
	
	 public void update() throws SlickException {
		 
		
	  }
	  
	  public void init() throws SlickException {
		  
		  for(int i=1; i<43;i++) {
			liste_territoires.add(i);
		  }
			
			
		   if(nbre_joueurs==6) {
			   nbre_armees=20;
			 Random rand = new Random();
			 attribution_missions(rand, 1, nbre_joueurs);
			 attribution_missions(rand, 2, nbre_joueurs);
			 attribution_missions(rand, 3, nbre_joueurs);
			 attribution_missions(rand, 4, nbre_joueurs);
			 attribution_missions(rand, 5, nbre_joueurs);
			 attribution_missions(rand, 6, nbre_joueurs);
			 
			 
			 
			 //attribution des territoires
			 Random rand7 = new Random();
			 
			 attribution_territoires_joueur1(rand7, 0);
			 attribution_territoires_joueur2(rand7, 0);
			 attribution_territoires_joueur3(rand7, 0);
			 attribution_territoires_joueur4(rand7, 0);
			 attribution_territoires_joueur5(rand7, 0);
			 attribution_territoires_joueur6(rand7, 0);

			 
			 
			   
			   
			   
			   
			 
				 
		   }		   
		 
		   
		   if(nbre_joueurs==5) {
			   nbre_armees=25;
			   
			   Random rand = new Random();
			   attribution_missions(rand, 1, nbre_joueurs);
			   attribution_missions(rand, 2, nbre_joueurs);
			   attribution_missions(rand, 3, nbre_joueurs);
			   attribution_missions(rand, 4, nbre_joueurs);
			   attribution_missions(rand, 5, nbre_joueurs);
			   
			   Random rand7 = new Random();
			   attribution_territoires_joueur1(rand7, 1);
			   attribution_territoires_joueur2(rand7, 1);
			   attribution_territoires_joueur3(rand7, 1);
			   attribution_territoires_joueur4(rand7, 1);
			   attribution_territoires_joueur5(rand7, 1);
				 
		   }
		   
		   if(nbre_joueurs==4) {
			   nbre_armees=30;
			   
			   Random rand = new Random();
			   attribution_missions(rand, 1, nbre_joueurs);
			   attribution_missions(rand, 2, nbre_joueurs);
			   attribution_missions(rand, 3, nbre_joueurs);
			   attribution_missions(rand, 4, nbre_joueurs);
			   
			   Random rand7 = new Random();
			   attribution_territoires_joueur1(rand7, 2);
			   attribution_territoires_joueur2(rand7, 2);
			   attribution_territoires_joueur3(rand7, 2);
			   attribution_territoires_joueur4(rand7, 2);
			   
		   }
		   if(nbre_joueurs==3) {
			   nbre_armees=35;
			   Random rand = new Random();
			   attribution_missions(rand, 1, nbre_joueurs);
			   attribution_missions(rand, 2, nbre_joueurs);
			   attribution_missions(rand, 3, nbre_joueurs);
			   
			   
			   Random rand7 = new Random();
			   attribution_territoires_joueur1(rand7, 3);
			   attribution_territoires_joueur2(rand7, 3);
			   attribution_territoires_joueur3(rand7, 3);
			   
			   
		   }
		   
		   if(nbre_joueurs==2) {
			   nbre_armees=40;
			   Random rand = new Random();
			   attribution_missions(rand, 1, nbre_joueurs);
			   attribution_missions(rand, 2, nbre_joueurs);
			   
			   Random rand7 = new Random();
			   attribution_territoires_joueur1(rand7, 4);
			   attribution_territoires_joueur2(rand7, 4);
			   
			   
		   }
		   
		   
	  }
	  
	  public void render(GameContainer container, Graphics g) throws SlickException {
		  g.setColor(Color.black);
		  
		  if(!Tab_missions_joueurs[0].equals("vide") ){
			  	g.drawString("Le joueur 1 a pour mission de: " + Tab_missions_joueurs[0], 0, 20);
			 }
		  if(!Tab_missions_joueurs[1].equals("vide") ){
			  	g.drawString("Le joueur 2 a pour mission de: " + Tab_missions_joueurs[1], 0, 40);
			 }
		  if(!Tab_missions_joueurs[2].equals("vide") ){
			  	g.drawString("Le joueur 3 a pour mission de: " + Tab_missions_joueurs[2], 0, 60);
			 }
		  
		  
		  if(!Tab_missions_joueurs[3].equals("vide") ){
			  	g.drawString("Le joueur 4 a pour mission de: " + Tab_missions_joueurs[3], 0, 80);
			 }
		  if(!Tab_missions_joueurs[4].equals("vide") ){
			  	g.drawString("Le joueur 5 a pour mission de: " + Tab_missions_joueurs[4], 0, 100);
			 }
		  if(!Tab_missions_joueurs[5].equals("vide") ){
			  	g.drawString("Le joueur 6 a pour mission de: " + Tab_missions_joueurs[5], 0, 120);
			 }

	  }
	  

	 
	 public boolean getIni() {
		 return ini;
	 }
	 
	 public int [] getTerritoirejoueur1() {
		 return Territoirejoueur1;
	 }
	 
	 public int [] getTerritoirejoueur1_5() {
		 return Tableau_territoires_joueur1[1];
	 }
	 
	 public int [] getTerritoirejoueur2_5() {
		 return Tableau_territoires_joueur2[1];
	 }
	 
	 public int [] getTerritoirejoueur3_5() {
		 return Tableau_territoires_joueur3[1];
	 }
	 
	 public int [] getTerritoirejoueur4_5() {
		 return Tableau_territoires_joueur4[1];
	 }
	 
	 public int [] getTerritoirejoueur5_5() {
		 return Tableau_territoires_joueur5[1];
	 }
	 
	 public int [] getTerritoirejoueur2() {
		 return Territoirejoueur2;
	 }
	 
	 public int [] getTerritoirejoueur3() {
		 return Territoirejoueur3;
	 }
	 
	 
	 public int [] getTerritoirejoueur4() {
		 return Territoirejoueur4;
	 }
	 
	 public int [] getTerritoirejoueur5() {
		 return Territoirejoueur5;
	 }
	 
	 public int [] getTerritoirejoueur6() {
		 return Territoirejoueur6;
		 
	 }
	 
	 
	 public int [] getTerritoirejoueur1_4() {
		 return Tableau_territoires_joueur1[2];
	 }
	 
	 public int [] getTerritoirejoueur2_4() {
		 return Tableau_territoires_joueur2[2];
	 }
	 
	 public int [] getTerritoirejoueur3_4() {
		 return Tableau_territoires_joueur3[2];
	 }
	 
	 public int [] getTerritoirejoueur4_4() {
		 return Tableau_territoires_joueur4[2];
	 }
	 
	 public int [] getTerritoirejoueur1_3() {
		 return Tableau_territoires_joueur1[3];
	 }
	 
	 public int [] getTerritoirejoueur2_3() {
		 return Tableau_territoires_joueur2[3];
	 }
	 
	 public int [] getTerritoirejoueur3_3() {
		 return Tableau_territoires_joueur3[3];
	 }
	 
	 
	 public int [] getTerritoirejoueur1_2() {
		 return Tableau_territoires_joueur1[4];
	 }
	 
	 public int [] getTerritoirejoueur2_2() {
		 return Tableau_territoires_joueur2[4];
	 }
	 
	 public int getnbre_armees() {
		 return nbre_armees;
	 }
	 
	 
	   	
	 public void attribution_missions(Random rand, int i, int nbre_joueurs) {
		 int select=rand.nextInt(Tableau_mission_nbre_joueurs[nbre_joueurs-2].length);
		 if(select==0) {
			 int e=0;
			 if(nbre_joueurs==5) {
				 e=1;
			 }
			 if(nbre_joueurs==4) {
				 e=2;
			 }
			 if(nbre_joueurs==3) {
				 e=3;
			 }
			 if(nbre_joueurs==2) {
				 e=4;
			 }
			 if(i==1) {
			 int s=rand.nextInt(5-e);
			 tab_joueurs_adverse[i-1]=2+s;
			 }
			 else if(i==2) {
				 int [] val= {1, 3, 4, 5, 6};
				 int s=rand.nextInt(val.length-e);
				 tab_joueurs_adverse[i-1]=val[s];

			 }
			 else if(i==3) {
				 int [] val= {1, 2, 4, 5, 6};
				 int s=rand.nextInt(val.length-e);
				 tab_joueurs_adverse[i-1]=val[s];
			 }
			 
			 else if(i==4) {
				 int [] val= {1, 2, 3, 5, 6};
				 int s=rand.nextInt(val.length-e);
				 tab_joueurs_adverse[i-1]=val[s];
			 }
			 
			 else if(i==5) {
				 int [] val= {1, 2, 3, 4, 6};
				 int s=rand.nextInt(val.length-e);
				 tab_joueurs_adverse[i-1]=val[s];

				 
			 }
			 else if(i==6) {
				 int s=rand.nextInt(5);
				 tab_joueurs_adverse[i-1]=1+s;

	 
			 }
			 
			 
			 miss1="Détruire le joueur "+tab_joueurs_adverse[i-1];
			 Tab_missions_joueurs[i-1]=miss1;
		 }
		 else {
			 Tab_missions_joueurs[i-1]=Tableau_mission_nbre_joueurs[nbre_joueurs-2][select];		 
		 }
	 }
	 
	 
	 public void attribution_territoires_joueur1(Random rand, int i) {
		 for(int a=0;a<Tableau_territoires_joueur1[i].length;a++) {
		 int index = rand.nextInt(liste_territoires.size());
		 Tableau_territoires_joueur1[i][a]=(int) liste_territoires.get(index);
		 liste_territoires.remove(index);

		 }
	 
	 }
	 
	 
	 
	 public void attribution_territoires_joueur2(Random rand, int i) {
		 for(int a=0;a<Tableau_territoires_joueur2[i].length;a++) {
		 int index = rand.nextInt(liste_territoires.size());
		 Tableau_territoires_joueur2[i][a]=(int) liste_territoires.get(index);
		 liste_territoires.remove(index);

		 }
	 
	 }
	 
	 public void attribution_territoires_joueur3(Random rand, int i) {
		 for(int a=0;a<Tableau_territoires_joueur3[i].length;a++) {
		 int index = rand.nextInt(liste_territoires.size());
		 Tableau_territoires_joueur3[i][a]=(int) liste_territoires.get(index);
		 liste_territoires.remove(index);

		 }
	 
	 }
	 
	 public void attribution_territoires_joueur4(Random rand, int i) {
		 for(int a=0;a<Tableau_territoires_joueur4[i].length;a++) {
		 int index = rand.nextInt(liste_territoires.size());
		 Tableau_territoires_joueur4[i][a]=(int) liste_territoires.get(index);
		 liste_territoires.remove(index);

		 }
	 
	 }
	 
	 public void attribution_territoires_joueur5(Random rand, int i) {
		 for(int a=0;a<Tableau_territoires_joueur5[i].length;a++) {
		 int index = rand.nextInt(liste_territoires.size());
		 Tableau_territoires_joueur5[i][a]=(int) liste_territoires.get(index);
		 liste_territoires.remove(index);

		 }
	 
	 }
	 
	 public void attribution_territoires_joueur6(Random rand, int i) {
		 for(int a=0;a<Tableau_territoires_joueur6[i].length;a++) {
		 int index = rand.nextInt(liste_territoires.size());
		 Tableau_territoires_joueur6[i][a]=(int) liste_territoires.get(index);
		 liste_territoires.remove(index);

		 }
	 
	 }
	 
	 
	 
	 public void setnbre_joueurs(int nbre_joueurs) {
			this.nbre_joueurs=nbre_joueurs;
		}
	 
	 
	 public int getnbre_joueurs() {
			return nbre_joueurs;
		}
	 
}
