package lib.natives;


import java.util.Arrays;
import java.util.Random;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Initialisation {
	private int nbre_joueurs;
	private map map;
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
	private String mission_joueur1, mission_joueur6="vide",mission_joueur2="vide", mission_joueur3="vide",
			mission_joueur4="vide", mission_joueur5="vide";

	String [] tab_missions_6 = {miss1, miss3, miss4, miss7, miss8};
	String [] tab_missions_5 = {miss1, miss3, miss4, miss6, miss8};
	String [] tab_missions_4 = {miss1, miss3, miss4, miss6, miss8};
	String [] tab_missions_3 = {miss1, miss2, miss3, miss4, miss5, miss8};
	String [] tab_missions_2 = {miss2, miss3, miss5, miss8};
	private int X;
	private int joueur_adverse, joueur_adverse2, joueur_adverse3, joueur_adverse4, joueur_adverse5, joueur_adverse6;
	private Territoire territoires=new Territoire();
	private int [] tableauTerritoires=territoires.getTableauTerritoires();
	 
	int [] Territoirejoueur1= new int [7];
	int [] Territoirejoueur2= new int[7];
	int [] Territoirejoueur3= new int [7];
	int [] Territoirejoueur4= new int[7];
	int [] Territoirejoueur5= new int[7];
	int [] Territoirejoueur6= new int[7];
	private int nbre_armees;
	

	
	
	 public void update() throws SlickException {
		
		
	  }
	  
	  public void init() throws SlickException {
		  
		   if(nbre_joueurs==6) {
			   nbre_armees=20;
			 Random rand = new Random();
			 int select = rand.nextInt(tab_missions_6.length);
			 if(select==0) {
				 Random random = new Random();
			 int s=random.nextInt(5);
			 joueur_adverse=2+s;
			 miss1="Détruire le joueur "+joueur_adverse;
			 mission_joueur1=miss1;
			 }
			 else {
			 mission_joueur1=tab_missions_6[select];
			 }
			 
			 
			 Random rand2 = new Random();
			 int select2 = rand2.nextInt(tab_missions_6.length);
			 if(select2==0) {
				 Random random = new Random();
				 int [] val= {1, 3, 4, 5, 6};
			 int s=random.nextInt(val.length);
			 joueur_adverse2=val[s];
			 miss1="Détruire le joueur "+joueur_adverse2;
			 mission_joueur2=miss1;
			 }
			 else {
			 mission_joueur2=tab_missions_6[select2];
			 }
			
			 Random rand3 = new Random();
			 int select3 = rand3.nextInt(tab_missions_6.length);
			 if(select3==0) {
				 Random random = new Random();

				 int [] val= {1, 2, 4, 5, 6};
			 int s=random.nextInt(val.length);
			 joueur_adverse3=val[s];
			 miss1="Détruire le joueur "+joueur_adverse3;
			 mission_joueur3=miss1;
			 	}
			 else {
				 mission_joueur3=tab_missions_6[select3];
				 
			 }
			 
			 
			 
			 Random rand4 = new Random();
			 int select4 = rand4.nextInt(tab_missions_6.length);
			 if(select4==0) {
				 Random random = new Random();
				 int [] val= {1, 2, 3, 5, 6};
			 int s=random.nextInt(val.length);
			 joueur_adverse4=val[s];
			 miss1="Détruire le joueur "+joueur_adverse4;
			 mission_joueur4=miss1;
			 	}
			 else {
			 mission_joueur4=tab_missions_6[select4];
			 }
			 
			 
			 Random rand5 = new Random();
			 int select5 = rand5.nextInt(tab_missions_6.length);
			 if(select5==0) {
				 Random random = new Random();
				 int [] val= {1, 2, 3, 4, 6};
			 int s=random.nextInt(val.length);
			 joueur_adverse5=val[s];
			 miss1="Détruire le joueur "+joueur_adverse5;					
			 mission_joueur5=miss1;
			 }
			 else {
			 mission_joueur5=tab_missions_6[select5];
			 }
			 
			 
			 Random rand6 = new Random();
			 int select6 = rand6.nextInt(tab_missions_6.length);
			 if(select6==0) {
				 Random random = new Random();
			 int s=random.nextInt(5);
			 joueur_adverse6=1+s;
			 miss1="Détruire le joueur "+joueur_adverse6;
			 mission_joueur6=miss1;
			 }
			 else {
				 mission_joueur6=tab_missions_6[select6];
			 }
			 
			 
			 
			 
			 //attribution des territoires
			 
			 
			   for(int i = 0; i < Territoirejoueur1.length; i++)
			   {
			   	Random rand7 = new Random();
			   	int s=rand7.nextInt(tableauTerritoires.length);
			     Territoirejoueur1[i]=tableauTerritoires[s]; 
			     Random rand8 = new Random();
				 int t=rand8.nextInt(tableauTerritoires.length);
				 Territoirejoueur2[i]=tableauTerritoires[t]; 
				 Random rand9 = new Random();
				 int u=rand9.nextInt(tableauTerritoires.length);
				 Territoirejoueur3[i]=tableauTerritoires[u]; 
				 Random rand10 = new Random();
				 int v=rand10.nextInt(tableauTerritoires.length);
				 Territoirejoueur4[i]=tableauTerritoires[v]; 
				 Random rand11 = new Random();
				 int w=rand11.nextInt(tableauTerritoires.length);
				 Territoirejoueur5[i]=tableauTerritoires[w]; 
				 Random rand12 = new Random();
				 int x=rand12.nextInt(tableauTerritoires.length);
				 Territoirejoueur6[i]=tableauTerritoires[x]; 
				 
			   }
			   
System.out.println(Arrays.toString(Territoirejoueur1)+"drrf");
			   
		 }
		   
		   if(nbre_joueurs==5) {
			   Random rand = new Random();
				 int select = rand.nextInt(tab_missions_5.length);
				 mission_joueur1=tab_missions_5[select];
				 Random rand2 = new Random();
				 int select2 = rand2.nextInt(tab_missions_5.length);
				 mission_joueur2=tab_missions_5[select2];
				 Random rand3 = new Random();
				 int select3 = rand3.nextInt(tab_missions_5.length);
				 mission_joueur3=tab_missions_5[select3];
				 Random rand4 = new Random();
				 int select4 = rand4.nextInt(tab_missions_5.length);
				 mission_joueur4=tab_missions_5[select4];
				 Random rand5 = new Random();
				 int select5 = rand5.nextInt(tab_missions_5.length);
				 mission_joueur5=tab_missions_5[select5];	   
		   }
		   if(nbre_joueurs==4) {
			   Random rand = new Random();
				 int select = rand.nextInt(tab_missions_4.length);
				 mission_joueur1=tab_missions_4[select];
				 Random rand2 = new Random();
				 int select2 = rand2.nextInt(tab_missions_4.length);
				 mission_joueur2=tab_missions_4[select2];
				 Random rand3 = new Random();
				 int select3 = rand3.nextInt(tab_missions_4.length);
				 mission_joueur3=tab_missions_4[select3];
				 Random rand4 = new Random();
				 int select4 = rand4.nextInt(tab_missions_4.length);
				 mission_joueur4=tab_missions_4[select4];
		   }
		   if(nbre_joueurs==3) {
			   Random rand = new Random();
				 int select = rand.nextInt(tab_missions_3.length);
				 mission_joueur1=tab_missions_3[select];
				 Random rand2 = new Random();
				 int select2 = rand2.nextInt(tab_missions_3.length);
				 mission_joueur2=tab_missions_3[select2];
				 Random rand3 = new Random();
				 int select3 = rand3.nextInt(tab_missions_3.length);
				 mission_joueur3=tab_missions_3[select3];
		   }
		   
		   if(nbre_joueurs==2) {
			   Random rand = new Random();
				 int select = rand.nextInt(tab_missions_2.length);
				 mission_joueur1=tab_missions_2[select];
				 Random rand2 = new Random();
				 int select2 = rand2.nextInt(tab_missions_2.length);
				 mission_joueur2=tab_missions_2[select2];
		   }
		   
		   
	  }
	  
	  public void render(GameContainer container, Graphics g) throws SlickException {
		  g.setColor(Color.black);
		  if(!mission_joueur1.equals("vide") ){
			  	g.drawString("Le joueur 1 a pour mission de: " + mission_joueur1, 0, 20);
			  	g.drawString("Le joueur 1 detient les territoires" + Arrays.toString(Territoirejoueur1), 0, 800);
			 }
		  if(!mission_joueur2.equals("vide") ){
			  	g.drawString("Le joueur 2 a pour mission de: " + mission_joueur2, 0, 40);
			  	g.drawString("Le joueur 2 detient les territoires" + Arrays.toString(Territoirejoueur2), 0, 820);
			 }
		  if(!mission_joueur3.equals("vide") ){
			  	g.drawString("Le joueur 3 a pour mission de: " + mission_joueur3, 0, 60);
			  	g.drawString("Le joueur 3 detient les territoires" + Arrays.toString(Territoirejoueur3), 0, 840);
			 }
		  
		  
		  if(!mission_joueur4.equals("vide") ){
			  	g.drawString("Le joueur 4 a pour mission de: " + mission_joueur4, 0, 80);
			  	g.drawString("Le joueur 4 detient les territoires" + Arrays.toString(Territoirejoueur4), 0, 860);
			 }
		  if(!mission_joueur5.equals("vide") ){
			  	g.drawString("Le joueur 5 a pour mission de: " + mission_joueur5, 0, 100);
			  	g.drawString("Le joueur 5 detient les territoires" + Arrays.toString(Territoirejoueur5), 0, 880);
			 }
		  if(!mission_joueur6.equals("vide") ){
			  	g.drawString("Le joueur 6 a pour mission de: " + mission_joueur6, 0, 120);
			  	g.drawString("Le joueur 6 detient les territoires" + Arrays.toString(Territoirejoueur6), 0, 900);
			 }

	
	  }
	  
	  
	 public Initialisation(map map, int nbre_joueurs) {
		    this.map = map;
		    this.nbre_joueurs=nbre_joueurs;
		  }
	 
	 public boolean getIni() {
		 return ini;
	 }
	 
	 public int [] getTerritoirejoueur1() {
		 return Territoirejoueur1;
	 }
}
