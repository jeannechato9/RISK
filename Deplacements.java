package lib.natives;


import java.util.ArrayList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Deplacements {
	
	
	
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
	
	private int tour=1;
	private int nbre_joueurs;
	private Image image;
	private MainScreenGameState menu;
	private Territoire territoire=new Territoire();
	private int posMouseX;
	private int posMouseY;
	private int[] Tableau_terr_x_debut=territoire.getTableau_terr_x_debut();
	int w=1;
	int v=1;
	int x=1;
	int y=1;
	int z=1;
	int r=1;
	
private int[] Europe={1, 2, 3, 4, 5, 6, 7};
	
	private int[] Amerique_Nord={8, 9, 10, 11, 12, 13, 14, 15, 16};
	
	private int[] Afrique={17, 18, 19, 20, 21, 22};
	
	private int[] Australie={23, 24, 25, 26};
	
	private int[] Amerique_Sud={27, 28, 29, 30};
	
	private int[] Asie={31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42};
	
	private int[][] Regions= {Europe, Amerique_Nord, Afrique, Australie, Amerique_Sud, Asie};

	private int[] Tableau_terr_y_debut=territoire.getTableau_terr_y_debut();

	private int[] Tableau_terr_x_fin=territoire.getTableau_terr_x_fin();
	

	private int[] Tableau_terr_y_fin=territoire.getTableau_terr_y_fin();
	private int[][] Tableau_terri_alentour=territoire.getTableau_terri_alentour();
	private boolean une_fois=true;
	private int territoire_selectionne;
	private boolean pose_renforts=true;

	private int territoire_attaque;
	ArrayList territoires_joueur1 = new ArrayList();
	ArrayList territoires_joueur2 = new ArrayList();
	ArrayList territoires_joueur3 = new ArrayList();
	ArrayList territoires_joueur4 = new ArrayList();
	ArrayList territoires_joueur5 = new ArrayList();
	ArrayList territoires_joueur6 = new ArrayList();
	ArrayList Territoires= new ArrayList();
	
	
	
	ArrayList armees_posees_joueur1 = new ArrayList();
	int[] Armees_posees_joueur1=new int[21];
	int[] Armees_posees_joueur2=new int[21];
	int[] Armees_posees_joueur3=new int[21];
	int[] Armees_posees_joueur4=new int[21];
	int[] Armees_posees_joueur5=new int[21];
	int[] Armees_posees_joueur6=new int[21];
	ArrayList armees_posees_joueur2 = new ArrayList();
	ArrayList armees_posees_joueur3 = new ArrayList();
	ArrayList armees_posees_joueur4 = new ArrayList();
	ArrayList armees_posees_joueur5 = new ArrayList();
	ArrayList armees_posees_joueur6 = new ArrayList();
	ArrayList nbre_armees_joueur1 = new ArrayList();
	ArrayList nbre_armees_joueur2 = new ArrayList();
	ArrayList nbre_armees_joueur3 = new ArrayList();
	ArrayList nbre_armees_joueur4 = new ArrayList();
	ArrayList nbre_armees_joueur5 = new ArrayList();
	ArrayList nbre_armees_joueur6 = new ArrayList();
	boolean Affichage=true;

	public Deplacements( int nbre_joueurs, Integer [] territoiresjoueur1, Integer [] territoiresjoueur2, Integer [] territoiresjoueur3,
			Integer [] territoiresjoueur4, Integer [] territoiresjoueur5, Integer [] territoiresjoueur6, int[] armees_posees_joueur1,
			int[] armees_posees_joueur2,  int[] armees_posees_joueur3,  int[] armees_posees_joueur4,  int[] armees_posees_joueur5,  int[] armees_posees_joueur6) {
		
		this.nbre_joueurs=nbre_joueurs;
		this.territoiresjoueur1=territoiresjoueur1;
		this.territoiresjoueur2=territoiresjoueur2;
		this.territoiresjoueur3=territoiresjoueur3;
		this.territoiresjoueur4=territoiresjoueur4;
		this.territoiresjoueur5=territoiresjoueur5;
		this.territoiresjoueur6=territoiresjoueur6;
		this.Armees_posees_joueur1=armees_posees_joueur1;
		this.Armees_posees_joueur2=armees_posees_joueur2;
		this.Armees_posees_joueur3=armees_posees_joueur3;
		this.Armees_posees_joueur4=armees_posees_joueur4;
		this.Armees_posees_joueur5=armees_posees_joueur5;
		this.Armees_posees_joueur6=armees_posees_joueur6;
		
	}
	
	private Initialisation initialisatio=new Initialisation(menu, 2);
	
	private Integer [] territoiresjoueur1= new Integer[21];
 	private Integer [] territoiresjoueur2= new Integer[21];
 	private Integer [] territoiresjoueur3= new Integer[14];
 	private Integer [] territoiresjoueur4= new Integer[14];
 	private Integer [] territoiresjoueur5= new Integer[14];
 	private Integer [] territoiresjoueur6= new Integer[14];
 	boolean une_fois_1=true;
	
	
	public void init(GameContainer container) throws SlickException {
		
		
		
		

		for(int i=0; i<Armees_posees_joueur1.length; i++) {
			armees_posees_joueur1.add(Armees_posees_joueur1[i]);
		}
		
		
		for(int i=0; i<Armees_posees_joueur2.length; i++) {
			armees_posees_joueur2.add(Armees_posees_joueur2[i]);
		}
		
		
		for(int i=0; i<Armees_posees_joueur3.length; i++) {
			armees_posees_joueur3.add(Armees_posees_joueur3[i]);
		}
		
		for(int i=0; i<Armees_posees_joueur4.length; i++) {
			armees_posees_joueur4.add(Armees_posees_joueur4[i]);
		}
		
		for(int i=0; i<Armees_posees_joueur5.length; i++) {
			armees_posees_joueur5.add(Armees_posees_joueur5[i]);
		}
		
		for(int i=0; i<Armees_posees_joueur6.length; i++) {
			armees_posees_joueur6.add(Armees_posees_joueur6[i]);
		}
		
		for(int i=0; i<territoiresjoueur1.length;i++) {
			if(territoiresjoueur1[i]!=null) {
			territoires_joueur1.add(territoiresjoueur1[i]);
		  }
		}
		
		for(int i=0; i<territoiresjoueur2.length;i++) {
			if(territoiresjoueur2[i]!=null) {
			territoires_joueur2.add(territoiresjoueur2[i]);
		  }
		}
		
		for(int i=0; i<territoiresjoueur3.length;i++) {
			if(territoiresjoueur3[i]!=null) {
			territoires_joueur3.add(territoiresjoueur3[i]);
		  }
		}
		
		for(int i=0; i<territoiresjoueur4.length;i++) {
			if(territoiresjoueur4[i]!=null) {
			territoires_joueur4.add(territoiresjoueur4[i]);
		  }
		}
		
		for(int i=0; i<territoiresjoueur5.length;i++) {
			if(territoiresjoueur5[i]!=null) {
			territoires_joueur5.add(territoiresjoueur5[i]);
		  }
		}
		
		for(int i=0; i<territoiresjoueur6.length;i++) {
			if(territoiresjoueur6[i]!=null) {
			territoires_joueur6.add(territoiresjoueur6[i]);
		  }
		}
		
		Territoires.add(territoires_joueur1);
		Territoires.add(territoires_joueur2);
		Territoires.add(territoires_joueur3);
		Territoires.add(territoires_joueur4);
		Territoires.add(territoires_joueur5);
		Territoires.add(territoires_joueur6);
		  
		
		
		
			  
	}

    public void render(GameContainer container, Graphics g) throws SlickException {
    	g.setColor(Color.black);
    	g.drawString("tour :"+tour, 700, 140);
    	
    	
    	render_armees_placees_joueur1( g, armees_posees_joueur1);
    	render_armees_placees_joueur1( g, armees_posees_joueur2);
    	if(nbre_joueurs==3) {
    		render_armees_placees_joueur1( g, armees_posees_joueur3);
    	}
    	
    	if(nbre_joueurs==4) {
    		render_armees_placees_joueur1( g, armees_posees_joueur3);
    		render_armees_placees_joueur1( g, armees_posees_joueur4);
    	}
    	
    	
    	if(nbre_joueurs==5) {
    		render_armees_placees_joueur1( g, armees_posees_joueur3);
    		render_armees_placees_joueur1( g, armees_posees_joueur4);
    		render_armees_placees_joueur1( g, armees_posees_joueur5);
    	}
    	
    	
    	if(nbre_joueurs==6) {
    		render_armees_placees_joueur1( g, armees_posees_joueur3);
    		render_armees_placees_joueur1( g, armees_posees_joueur4);
    		render_armees_placees_joueur1( g, armees_posees_joueur5);
    		render_armees_placees_joueur1( g, armees_posees_joueur6);
    	}
    	
    	
    	if(territoires_joueur1.size()==42) {
    		g.drawString("Victoire du joueur 1", 650, 200);
    	}
    	
    	if(territoires_joueur2.size()==42) {
    		g.drawString("Victoire du joueur 1", 650, 200);
    	}
    	
    	
    	if(nbre_joueurs==2) {
        	
        	
    	if((tour%2)==1&&tour!=1){
    		if(Affichage=true) {
    			if(w!=0) {
    		if(une_fois_1) {
    		w=renforts(territoires_joueur1);
    		v=renforts(territoires_joueur2);
    		
    		}
    		une_fois_1=false;
    		w=affichage_1(g, w, container, armees_posees_joueur1);
    		}
    		
    		if(w==0) {
    			v=affichage_2(g, v, container, armees_posees_joueur2);
    			
    		}
    		
    		if(v==0) {
    			Affichage=false;
    		}
    		}
    		
    		
    		
    		
    		
    	}
    		
    	if(tour==1) {
    		g.drawString("Joueur 1 à votre tour", 650, 155);
    		
    	}

    	if((tour%2)==0){
    		g.drawString("Joueur 2 à votre tour", 650, 155);
    	}
    	
    	
    		
    	}
    	
    	
    	for(int i = 0; i < territoires_joueur1.size(); i++) {
    		for(int e=0; e<43; e++) {
			 if(territoires_joueur1.contains(e)) {	
				    render_pions(0, g, e);   
			 }
			 
			    
		  	}
    	}
    	
    	
    	
    	
    	
    	for(int i = 0; i < territoires_joueur2.size(); i++) {
    		for(int e=0; e<43; e++) {
			 if(territoires_joueur2.contains(e)) {	
				    render_pions(1, g, e);   
			 }
			 
			    
		  	}
    	}
    	
    	
    	

    	
    	
    
    	
    	if(nbre_joueurs==3) {
    		
    		
    		if(territoires_joueur3.size()==42) {
        		g.drawString("Victoire du joueur 1", 650, 200);
        	}
    		
    		if((tour%3)==1&&tour!=1){
        		if(Affichage=true) {
        			if(w!=0) {
        		if(une_fois_1) {
        		w=renforts(territoires_joueur1);
        		v=renforts(territoires_joueur2);
        		x=renforts(territoires_joueur3);
        		}
        		une_fois_1=false;
        		w=affichage_1(g, w, container, armees_posees_joueur1);
        		}
        		
        		if(w==0) {
        			v=affichage_2(g, v, container, armees_posees_joueur2);
        			
        		}
        		
        		if(v==0) {
        			x=affichage_3(g, x, container, armees_posees_joueur3);
        			
        		}
        		
        		
        		
        		if(x==0) {
        			Affichage=false;
        		}
        		
        		}
        		
        		
        	}
        		
            
        	

        	if((tour%3)==2){
        		g.drawString("Joueur 2 à votre tour", 650, 155);
        	}
        	
        		
        		
        	if((tour%3)==0){
            		g.drawString("Joueur 3 à votre tour", 650, 155);
            	}
        	
        	if((tour%3)==1&&Affichage==false){
        		g.drawString("Joueur 1 à votre tour", 650, 155);
        	}
        		
        		
            	
        		
   
        		
        		
    		
    	}
    	
    	
    	for(int i = 0; i < territoires_joueur3.size(); i++) {
            		for(int e=0; e<43; e++) {
        			 if(territoires_joueur3.contains(e)) {	
        				    render_pions(2, g, e);   
        			 }
        			 
        			    
        		  	}
            	}
    	
    	
    	for(int i = 0; i < territoires_joueur4.size(); i++) {
    		for(int e=0; e<43; e++) {
			 if(territoires_joueur4.contains(e)) {	
				    render_pions(3, g, e);   
			 }
			 
			    
		  	}
    	}
    	
    	for(int i = 0; i < territoires_joueur5.size(); i++) {
    		for(int e=0; e<43; e++) {
			 if(territoires_joueur5.contains(e)) {	
				    render_pions(4, g, e);   
			 }
			 
			    
		  	}
    	}
    	
    	for(int i = 0; i < territoires_joueur6.size(); i++) {
    		for(int e=0; e<43; e++) {
			 if(territoires_joueur6.contains(e)) {	
				    render_pions(5, g, e);   
			 }
			 
			    
		  	}
    	}
    	
    	
if(nbre_joueurs==4) {
	
	
	if(territoires_joueur4.size()==42) {
		g.drawString("Victoire du joueur 1", 650, 200);
	}
    		
    		if((tour%4)==1&&tour!=1){
        		if(Affichage=true) {
        			if(w!=0) {
        		if(une_fois_1) {
        		w=renforts(territoires_joueur1);
        		v=renforts(territoires_joueur2);
        		x=renforts(territoires_joueur3);
        		y=renforts(territoires_joueur4);
        		}
        		une_fois_1=false;
        		w=affichage_1(g, w, container, armees_posees_joueur1);
        		}
        		
        		if(w==0) {
        			v=affichage_2(g, v, container, armees_posees_joueur2);
        			
        		}
        		
        		if(v==0) {
        			x=affichage_3(g, x, container, armees_posees_joueur3);
        			
        		}
        		
        		
        		
        		if(x==0) {
        			y=affichage_4(g, y, container, armees_posees_joueur4);
        		}
        		
        		
        		if(y==0) {
        			Affichage=false;
        		}
        		
        		}
        		
        		
        	}
        		
            
        	

        	if((tour%4)==2){
        		g.drawString("Joueur 2 à votre tour", 650, 155);
        	}
        	
        	if((tour%4)==1&&Affichage==false){
        		g.drawString("Joueur 1 à votre tour", 650, 155);
        	}
        		
        		
        	if((tour%4)==0){
            		g.drawString("Joueur 4 à votre tour", 650, 155);
            	}
            	
        	if((tour%4)==3){
        		g.drawString("Joueur 3 à votre tour", 650, 155);
        	}
        			
    		
    	}











if(nbre_joueurs==5) {
	
	
	if(territoires_joueur5.size()==42) {
		g.drawString("Victoire du joueur 1", 650, 200);
	}
	
	if((tour%5)==1&&tour!=1){
		if(Affichage=true) {
			if(w!=0) {
		if(une_fois_1) {
		w=renforts(territoires_joueur1);
		v=renforts(territoires_joueur2);
		x=renforts(territoires_joueur3);
		y=renforts(territoires_joueur4);
		z=renforts(territoires_joueur5);
		}
		une_fois_1=false;
		w=affichage_1(g, w, container, armees_posees_joueur1);
		}
		
		if(w==0) {
			v=affichage_2(g, v, container, armees_posees_joueur2);
			
		}
		
		if(v==0) {
			x=affichage_3(g, x, container, armees_posees_joueur3);
			
		}
		
		
		
		if(x==0) {
			y=affichage_4(g, y, container, armees_posees_joueur4);
		}
		
		
		if(y==0) {
			z=affichage_5(g, z, container, armees_posees_joueur5);
		}
		
		
		if(z==0) {
			Affichage=false;
		}
		}
		
		
	}
		
    
	

	if((tour%5)==2){
		g.drawString("Joueur 2 à votre tour", 650, 155);
	}
	
	if((tour%5)==1&&Affichage==false){
		g.drawString("Joueur 1 à votre tour", 650, 155);
	}
		
		
	if((tour%5)==4){
    		g.drawString("Joueur 4 à votre tour", 650, 155);
    	}
	
	
	if((tour%5)==0){
		g.drawString("Joueur 5 à votre tour", 650, 155);
	}
    	
	if((tour%5)==3){
		g.drawString("Joueur 3 à votre tour", 650, 155);
	}
		
	
		

		
		
	
}


if(nbre_joueurs==6) {
	
	if(territoires_joueur6.size()==42) {
		g.drawString("Victoire du joueur 1", 650, 200);
	}
	
	if((tour%6)==1&&tour!=1){
		if(Affichage=true) {
			if(w!=0) {
		if(une_fois_1) {
		w=renforts(territoires_joueur1);
		v=renforts(territoires_joueur2);
		x=renforts(territoires_joueur3);
		y=renforts(territoires_joueur4);
		z=renforts(territoires_joueur5);
		r=renforts(territoires_joueur6);
		}
		une_fois_1=false;
		w=affichage_1(g, w, container, armees_posees_joueur1);
		}
		
		if(w==0) {
			v=affichage_2(g, v, container, armees_posees_joueur2);
			
		}
		
		if(v==0) {
			x=affichage_3(g, x, container, armees_posees_joueur3);
			
		}
		
		
		
		if(x==0) {
			y=affichage_4(g, y, container, armees_posees_joueur4);
		}
		
		
		if(y==0) {
			z=affichage_5(g, z, container, armees_posees_joueur5);
		}
		
		
		if(z==0) {
			r=affichage_6(g, r, container, armees_posees_joueur6);
		}
		
		if(r==0) {
			Affichage=false;
		}
		
		
		
		
		}
		
		
	}
		
    
	

	if((tour%6)==2){
		g.drawString("Joueur 2 à votre tour", 650, 155);
	}
	
	if((tour%6)==1&&Affichage==false){
		g.drawString("Joueur 1 à votre tour", 650, 155);
	}
		
		
	if((tour%6)==4){
    		g.drawString("Joueur 4 à votre tour", 650, 155);
    	}
	
	
	if((tour%6)==5){
		g.drawString("Joueur 5 à votre tour", 650, 155);
	}
    	
	if((tour%6)==3){
		g.drawString("Joueur 3 à votre tour", 650, 155);
	}
	
	
	if((tour%6)==0){
		g.drawString("Joueur 6 à votre tour", 650, 155);
	}
		
	
		

		
		
	
}




    	
    	
    }
    
 

    public void update(GameContainer container, int delta) throws SlickException {

    	posMouseY = container.getInput().getMouseY();
		posMouseX= container.getInput().getMouseX();
		
		
    	if(nbre_joueurs==2) {
    		if((tour%2)==1&&Affichage==false){
    			
    			if(territoire_selectionne==0) {
    				if(container.getInput().isKeyPressed(Input.KEY_ENTER)) {
        				tour=tour+1;
        			}
    			territoire_selectionne=territoire_selectionne_1( container);
    			}
    			
    			
    			
    			
    			
    			if(territoire_selectionne!=0) {
    				territoire_attaque=territoire_attaque_1(territoire_attaque, container, territoire_selectionne);
    				
    			}
    			
    			if(territoire_attaque!=0) {
    				if(!armees_posees_joueur2.contains(territoire_attaque)) {
    				int a=0;
    				territoires_joueur1.add(territoire_attaque);
    				for(int i=0; i<territoires_joueur2.size();i++) {
    					if((int)territoires_joueur2.get(i)==(int)territoire_attaque) {
    						a+=i;
    						territoires_joueur2.remove(a);	
    					}
    					
    				}
    				boolean une_fois=true;	
    				for(int i=0; i<armees_posees_joueur1.size();i++) {
    					
        					if((int)armees_posees_joueur1.get(i)==(int)territoire_selectionne&&une_fois==true) {
        						armees_posees_joueur1.remove(i);
        						une_fois=false;
        					}
    				}
    				
    				
    				
    				territoire_attaque=0;
    				territoire_selectionne=0;
    			}
    			}
    			if(armees_posees_joueur2.contains(territoire_attaque)) {
    				boolean une_fois=true;	
    				for(int i=0; i<armees_posees_joueur1.size();i++) {
    					
    					if((int)armees_posees_joueur1.get(i)==(int)territoire_selectionne&&une_fois==true) {
    						armees_posees_joueur1.remove(i);
    					}
				}
    				
    				for(int i=0; i<armees_posees_joueur2.size();i++) {
    					
    					if((int)armees_posees_joueur2.get(i)==(int)territoire_attaque&&une_fois==true) {
    						armees_posees_joueur2.remove(i);
    						une_fois=false;
    					}
    				}
    					
    					territoire_attaque=0;
        				territoire_selectionne=0;
				
    				
    			}
    			
    			
    			
    					
    				}
    		
    		if(tour==1){
    			if(territoire_selectionne==0) {
    				if(container.getInput().isKeyPressed(Input.KEY_ENTER)) {
        				tour=tour+1;
        			}
    			territoire_selectionne=territoire_selectionne_1( container);
    			
    			}
    			
    			
    			
    			if(territoire_selectionne!=0) {
    				territoire_attaque=territoire_attaque_1(territoire_attaque, container, territoire_selectionne);
    				
    			}
    			
    			
    			if(territoire_attaque!=0) {
    				if(!armees_posees_joueur2.contains(territoire_attaque)) {
    				int a=0;
    				territoires_joueur1.add(territoire_attaque);
    				for(int i=0; i<territoires_joueur2.size();i++) {
    					if((int)territoires_joueur2.get(i)==(int)territoire_attaque) {
    						a+=i;
    						territoires_joueur2.remove(a);	
    					}
    				}
    				boolean une_fois=true;	
    				for(int i=0; i<armees_posees_joueur1.size();i++) {
    					
        					if((int)armees_posees_joueur1.get(i)==(int)territoire_selectionne&&une_fois==true) {
        						armees_posees_joueur1.remove(i);
        						une_fois=false;
        					}
    				}
    				
    				
    				territoire_attaque=0;
    				territoire_selectionne=0;
    			}
    				
    				if(armees_posees_joueur2.contains(territoire_attaque)) {
        				boolean une_fois=true;	
        				for(int i=0; i<armees_posees_joueur1.size();i++) {
        					
        					if((int)armees_posees_joueur1.get(i)==(int)territoire_selectionne&&une_fois==true) {
        						armees_posees_joueur1.remove(i);
        					}
    				}
        				
        				for(int i=0; i<armees_posees_joueur2.size();i++) {
        					
        					if((int)armees_posees_joueur2.get(i)==(int)territoire_attaque&&une_fois==true) {
        						armees_posees_joueur2.remove(i);
        						une_fois=false;
        					}
        				}
        					
        					territoire_attaque=0;
            				territoire_selectionne=0;
    				
    				}
    			
    			}
    			
    					
    				}
    		
    		
    		
    		
    		if((tour%2)==0){
    			
    			
    			if(territoire_selectionne==0) {
    				if(container.getInput().isKeyPressed(Input.KEY_ENTER)) {
        				tour=tour+1;
        			}
    			territoire_selectionne=territoire_selectionne_2( container);
    			
    			}
    			
    			
    			if(territoire_selectionne!=0) {
    				territoire_attaque=territoire_attaque_2(territoire_attaque, container, territoire_selectionne);
    				
    			}
    			
    			if(territoire_attaque!=0) {

    				if(!armees_posees_joueur1.contains(territoire_attaque)) {

    				int a=0;
    				territoires_joueur2.add(territoire_attaque);
    				for(int i=0; i<territoires_joueur1.size();i++) {
    					if((int)territoires_joueur1.get(i)==(int)territoire_attaque) {
    						a+=i;
    						territoires_joueur1.remove(a);	
    					}
    				}
    					
    				boolean une_fois=true;	
    				for(int i=0; i<armees_posees_joueur2.size();i++) {
        					
            					if((int)armees_posees_joueur2.get(i)==(int)territoire_selectionne&&une_fois==true) {
            						armees_posees_joueur2.remove(i);
            						une_fois=false;
            					}
        				}
    				
    				territoire_attaque=0;
    				territoire_selectionne=0;
    				
    				}
    				
    				if(armees_posees_joueur1.contains(territoire_attaque)) {
        				boolean une_fois=true;	
        				for(int i=0; i<armees_posees_joueur2.size();i++) {
        					
        					if((int)armees_posees_joueur2.get(i)==(int)territoire_selectionne&&une_fois==true) {
        						armees_posees_joueur2.remove(i);
        						une_fois=false;
        					}
    				}
        				une_fois=true;
        				for(int i=0; i<armees_posees_joueur1.size();i++) {
        					
        					if((int)armees_posees_joueur1.get(i)==(int)territoire_attaque&&une_fois==true) {
        						armees_posees_joueur1.remove(i);
        						une_fois=false;
        					}
        				}
        					
        					territoire_attaque=0;
            				territoire_selectionne=0;
    				
    				}
    			
    				
    			}
    		
    			
    		Affichage=true;
    		une_fois_1=true;
    				w=1;
    				v=1;
				
    			
    			if(container.getInput().isKeyPressed(Input.KEY_ENTER)) {
					tour+=1;
					
				}
    		}
    				
    					
    				
    		
    		
    		
    		
    		
    			
    			}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	if(nbre_joueurs==3) {
    		
    		if((tour%3)==1&&Affichage==false){
    			if(territoire_selectionne==0) {
    				if(container.getInput().isKeyPressed(Input.KEY_ENTER)) {
        				tour=tour+1;
        			}
    			territoire_selectionne=territoire_selectionne_1( container);
    			
    			}
    			
    			
    			
    			if(territoire_selectionne!=0) {
    				territoire_attaque=territoire_attaque_1_3(territoire_attaque, container, territoire_selectionne);
    				
    			}
    			
    			if(territoire_attaque!=0) {

    				if(!armees_posees_joueur2.contains(territoire_attaque)&&!armees_posees_joueur3.contains(territoire_attaque)) {
    				int a=0;
    				int b=0;
    				territoires_joueur1.add(territoire_attaque);
    				for(int i=0; i<territoires_joueur2.size();i++) {
    					if((int)territoires_joueur2.get(i)==(int)territoire_attaque) {
    						a+=i;
    						territoires_joueur2.remove(a);	
    					}
    				}
    				for(int i=0; i<territoires_joueur3.size();i++) {
    					if((int)territoires_joueur3.get(i)==(int)territoire_attaque) {
    						b+=i;
    						territoires_joueur3.remove(b);	
    					}
    				}
    				boolean une_fois=true;	
    				for(int i=0; i<armees_posees_joueur1.size();i++) {
    					
        					if((int)armees_posees_joueur1.get(i)==(int)territoire_selectionne&&une_fois==true) {
        						armees_posees_joueur1.remove(i);
        						une_fois=false;
        					}
    				}
    				
    				
    				
    				territoire_attaque=0;
    				territoire_selectionne=0;
    			}
    			
    				if(armees_posees_joueur2.contains(territoire_attaque)||armees_posees_joueur3.contains(territoire_attaque)) {
        				boolean une_fois=true;	
        				for(int i=0; i<armees_posees_joueur1.size();i++) {
        					
        					if((int)armees_posees_joueur1.get(i)==(int)territoire_selectionne&&une_fois==true) {
        						armees_posees_joueur1.remove(i);
        						une_fois=false;
        					}
    				}
        				une_fois=true;
        				for(int i=0; i<armees_posees_joueur2.size();i++) {
        					
        					if((int)armees_posees_joueur2.get(i)==(int)territoire_attaque&&une_fois==true) {
        						armees_posees_joueur2.remove(i);
        						une_fois=false;
        					}
        				}
        				une_fois=true;
            			for(int i=0; i<armees_posees_joueur3.size();i++) {
            					
            					if((int)armees_posees_joueur3.get(i)==(int)territoire_attaque&&une_fois==true) {
            						armees_posees_joueur3.remove(i);
            						une_fois=false;
            				}
            			}
        					
        					territoire_attaque=0;
            				territoire_selectionne=0;
    				
    				
    			}
    			
    			
    			
    					
    				}
    		
    		if(tour==1){
    			
    			if(territoire_selectionne==0) {
    				
    				if(container.getInput().isKeyPressed(Input.KEY_ENTER)) {
        				tour=tour+1;
        			}
    				
    			territoire_selectionne=territoire_selectionne_1( container);
    			}
    			
    			
    			
    			if(territoire_selectionne!=0) {
    				territoire_attaque=territoire_attaque_1_3(territoire_attaque, container, territoire_selectionne);
    				
    				
    			}
    			
    			
    			if(territoire_attaque!=0) {
    				if(!armees_posees_joueur2.contains(territoire_attaque)&&!armees_posees_joueur3.contains(territoire_attaque)) {
    					
    				int a=0;
    				int b=0;
    				territoires_joueur1.add(territoire_attaque);
    				for(int i=0; i<territoires_joueur2.size();i++) {
    					if((int)territoires_joueur2.get(i)==(int)territoire_attaque) {
    						a+=i;
    						territoires_joueur2.remove(a);	
    					}
    					
    				
    				}
    				for(int i=0; i<territoires_joueur3.size();i++) {
    					if((int)territoires_joueur3.get(i)==(int)territoire_attaque) {
    						b+=i;
    						territoires_joueur3.remove(b);	
    					}
    				}
    				boolean une_fois=true;	
    				for(int i=0; i<armees_posees_joueur1.size();i++) {
    					
        					if((int)armees_posees_joueur1.get(i)==(int)territoire_selectionne&&une_fois==true) {
        						armees_posees_joueur1.remove(i);
        						une_fois=false;
        					}
    				}
    				
    				
    				territoire_attaque=0;
    				territoire_selectionne=0;
    			}
    				
    				if(armees_posees_joueur2.contains(territoire_attaque)||armees_posees_joueur3.contains(territoire_attaque)) {
        				boolean une_fois=true;	
        				for(int i=0; i<armees_posees_joueur1.size();i++) {
        					
        					if((int)armees_posees_joueur1.get(i)==(int)territoire_selectionne&&une_fois==true) {
        						armees_posees_joueur1.remove(i);
        						une_fois=false;
        					}
    				}
        				une_fois=true;
        				for(int i=0; i<armees_posees_joueur2.size();i++) {
        					
        					if((int)armees_posees_joueur2.get(i)==(int)territoire_attaque&&une_fois==true) {
        						armees_posees_joueur2.remove(i);
        						une_fois=false;
        					}
        				}
        				une_fois=true;
            			for(int i=0; i<armees_posees_joueur3.size();i++) {
            					
            					if((int)armees_posees_joueur3.get(i)==(int)territoire_attaque&&une_fois==true) {
            						armees_posees_joueur3.remove(i);
            						une_fois=false;
            				}
            			}
        					
        					territoire_attaque=0;
            				territoire_selectionne=0;
    				
    				
    			}
    			}
    				
    				
    				
    				
    				
    				
    			}
    			
    			
    					
    				}
    		
    		
    		
    		
    		if((tour%3)==2){
    			
    			
    			if(territoire_selectionne==0) {
    			territoire_selectionne=territoire_selectionne_2( container);
    			
    			}
    			
    			
    			if(territoire_selectionne!=0) {
    				territoire_attaque=territoire_attaque_2_3(territoire_attaque, container, territoire_selectionne);
    				
    			}
    			
    			if(territoire_attaque!=0) {

    				if(!armees_posees_joueur1.contains(territoire_attaque)&&!armees_posees_joueur3.contains(territoire_attaque)) {
    				int a=0;
    				int b=0;
    				territoires_joueur2.add(territoire_attaque);
    				for(int i=0; i<territoires_joueur1.size();i++) {
    					if((int)territoires_joueur1.get(i)==(int)territoire_attaque) {
    						a+=i;
    						territoires_joueur1.remove(a);	
    					}
    				}
    				
    				for(int i=0; i<territoires_joueur3.size();i++) {
    					if((int)territoires_joueur3.get(i)==(int)territoire_attaque) {
    						b+=i;
    						territoires_joueur3.remove(b);	
    					}
    				}
    					
    				boolean une_fois=true;	
    				for(int i=0; i<armees_posees_joueur2.size();i++) {
        					
            					if((int)armees_posees_joueur2.get(i)==(int)territoire_selectionne&&une_fois==true) {
            						armees_posees_joueur2.remove(i);
            						une_fois=false;
            					}
        				}
    				
    				territoire_attaque=0;
    				territoire_selectionne=0;
    			
    			}
    			
    				
    				if(armees_posees_joueur1.contains(territoire_attaque)||armees_posees_joueur3.contains(territoire_attaque)) {
        				boolean une_fois=true;	
        				for(int i=0; i<armees_posees_joueur2.size();i++) {
        					
        					if((int)armees_posees_joueur2.get(i)==(int)territoire_selectionne&&une_fois==true) {
        						armees_posees_joueur2.remove(i);
        						une_fois=false;
        					}
    				}
        				une_fois=true;
        				for(int i=0; i<armees_posees_joueur1.size();i++) {
        					
        					if((int)armees_posees_joueur1.get(i)==(int)territoire_attaque&&une_fois==true) {
        						armees_posees_joueur1.remove(i);
        						une_fois=false;
        					}
        				}
        				une_fois=true;
            			for(int i=0; i<armees_posees_joueur3.size();i++) {
            					
            					if((int)armees_posees_joueur3.get(i)==(int)territoire_attaque&&une_fois==true) {
            						armees_posees_joueur3.remove(i);
            						une_fois=false;
            				}
            			}
        					
        					territoire_attaque=0;
            				territoire_selectionne=0;
    				
    				
    			}
    				
    				
    			}
    				
    		}
    			
    			
    			if((tour%3)==0){
        			
        			
        			if(territoire_selectionne==0) {
        			territoire_selectionne=territoire_selectionne_3( container);
        			
        			
        			
        			}
        			
        			
        			if(territoire_selectionne!=0) {
        				territoire_attaque=territoire_attaque_3(territoire_attaque, container, territoire_selectionne);
        				
        			}
        			
        			if(territoire_attaque!=0) {
        				if(!armees_posees_joueur1.contains(territoire_attaque)&&!armees_posees_joueur2.contains(territoire_attaque)) {
        				int a=0;
        				int b=0;
        				territoires_joueur3.add(territoire_attaque);
        				for(int i=0; i<territoires_joueur1.size();i++) {
        					if((int)territoires_joueur1.get(i)==(int)territoire_attaque) {
        						a+=i;
        						territoires_joueur1.remove(a);	
        					}
        				}
        				
        				for(int i=0; i<territoires_joueur2.size();i++) {
        					if((int)territoires_joueur2.get(i)==(int)territoire_attaque) {
        						b+=i;
        						territoires_joueur2.remove(b);	
        					}
        				}
        					
        				boolean une_fois=true;	
        				for(int i=0; i<armees_posees_joueur3.size();i++) {
            					
                					if((int)armees_posees_joueur3.get(i)==(int)territoire_selectionne&&une_fois==true) {
                						armees_posees_joueur3.remove(i);
                						une_fois=false;
                					}
            				}
        				
        				territoire_attaque=0;
        				territoire_selectionne=0;
        				
        				
        				}
        				
        				
        				if(armees_posees_joueur1.contains(territoire_attaque)||armees_posees_joueur2.contains(territoire_attaque)) {
            				boolean une_fois=true;	
            				for(int i=0; i<armees_posees_joueur3.size();i++) {
            					
            					if((int)armees_posees_joueur3.get(i)==(int)territoire_selectionne&&une_fois==true) {
            						armees_posees_joueur3.remove(i);
            						une_fois=false;
            					}
        				}
            				une_fois=true;
            				for(int i=0; i<armees_posees_joueur1.size();i++) {
            					
            					if((int)armees_posees_joueur1.get(i)==(int)territoire_attaque&&une_fois==true) {
            						armees_posees_joueur1.remove(i);
            						une_fois=false;
            					}
            				}
            				une_fois=true;
                			for(int i=0; i<armees_posees_joueur2.size();i++) {
                					
                					if((int)armees_posees_joueur2.get(i)==(int)territoire_attaque&&une_fois==true) {
                						armees_posees_joueur2.remove(i);
                						une_fois=false;
                				}
                			}
            					
            					territoire_attaque=0;
                				territoire_selectionne=0;
        				
        				
        			}
        				
        				
        				
        				
        			}
    			}
    			
    			Affichage=true;
    			
    			if(container.getInput().isKeyPressed(Input.KEY_ENTER)) {
					tour+=1;
					w=1;
					v=1;
					x=1;
					une_fois_1=true;
					
				}
    				
    					
  
    		
    		
    			
    			}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	if(nbre_joueurs==4) {
    		
    		if((tour%4)==1&&Affichage==false){
    			if(territoire_selectionne==0) {
    				if(container.getInput().isKeyPressed(Input.KEY_ENTER)) {
        				tour=tour+1;
        			}
    			territoire_selectionne=territoire_selectionne_1( container);
    			
    			}
    			
    			
    			
    			if(territoire_selectionne!=0) {
    				territoire_attaque=territoire_attaque_1_4(territoire_attaque, container, territoire_selectionne);
    				
    			}
    			
    			if(territoire_attaque!=0) {

    				if(!armees_posees_joueur2.contains(territoire_attaque)&&!armees_posees_joueur3.contains(territoire_attaque)&&!armees_posees_joueur4.contains(territoire_attaque)) {
    				int a=0;
    				int b=0;
    				int c=0;
    				territoires_joueur1.add(territoire_attaque);
    				for(int i=0; i<territoires_joueur2.size();i++) {
    					if((int)territoires_joueur2.get(i)==(int)territoire_attaque) {
    						a+=i;
    						territoires_joueur2.remove(a);	
    					}
    				}
    				for(int i=0; i<territoires_joueur3.size();i++) {
    					if((int)territoires_joueur3.get(i)==(int)territoire_attaque) {
    						b+=i;
    						territoires_joueur3.remove(b);	
    					}
    				}
    				for(int i=0; i<territoires_joueur4.size();i++) {
    					if((int)territoires_joueur4.get(i)==(int)territoire_attaque) {
    						c+=i;
    						territoires_joueur4.remove(c);	
    					}
    				}
    				boolean une_fois=true;	
    				for(int i=0; i<armees_posees_joueur1.size();i++) {
    					
        					if((int)armees_posees_joueur1.get(i)==(int)territoire_selectionne&&une_fois==true) {
        						armees_posees_joueur1.remove(i);
        						une_fois=false;
        					}
    				}
    				
    				
    				
    				territoire_attaque=0;
    				territoire_selectionne=0;
    			}
    				
    				
    				if(armees_posees_joueur2.contains(territoire_attaque)||armees_posees_joueur3.contains(territoire_attaque)||armees_posees_joueur4.contains(territoire_attaque)) {
        				boolean une_fois=true;	
        				for(int i=0; i<armees_posees_joueur1.size();i++) {
        					
        					if((int)armees_posees_joueur1.get(i)==(int)territoire_selectionne&&une_fois==true) {
        						armees_posees_joueur1.remove(i);
        						une_fois=false;
        					}
    				}
        				une_fois=true;
        				for(int i=0; i<armees_posees_joueur2.size();i++) {
        					
        					if((int)armees_posees_joueur2.get(i)==(int)territoire_attaque&&une_fois==true) {
        						armees_posees_joueur2.remove(i);
        						une_fois=false;
        					}
        				}
        				une_fois=true;
            			for(int i=0; i<armees_posees_joueur3.size();i++) {
            					
            					if((int)armees_posees_joueur3.get(i)==(int)territoire_attaque&&une_fois==true) {
            						armees_posees_joueur3.remove(i);
            						une_fois=false;
            				}
            			}
            					
            					une_fois=true;
                    			for(int i=0; i<armees_posees_joueur4.size();i++) {
                    					
                    					if((int)armees_posees_joueur4.get(i)==(int)territoire_attaque&&une_fois==true) {
                    						armees_posees_joueur4.remove(i);
                    						une_fois=false;
                    				}
                    			}
        					territoire_attaque=0;
            				territoire_selectionne=0;
    				
    				
    			}
    			}
    			
    			
    			
    					
    				}
    		
    		if(tour==1){
    			
    			if(territoire_selectionne==0) {
    				
    				if(container.getInput().isKeyPressed(Input.KEY_ENTER)) {
        				tour=tour+1;
        			}
    				
    			territoire_selectionne=territoire_selectionne_1( container);
    			}
    			
    			
    			
    			if(territoire_selectionne!=0) {
    				territoire_attaque=territoire_attaque_1_4(territoire_attaque, container, territoire_selectionne);
    				
    				
    			}
    			
    			
    			if(territoire_attaque!=0) {
    				if(!armees_posees_joueur2.contains(territoire_attaque)&&!armees_posees_joueur3.contains(territoire_attaque)&&!armees_posees_joueur4.contains(territoire_attaque)) {
    				int a=0;
    				int b=0;
    				int c=0;
    				territoires_joueur1.add(territoire_attaque);
    				for(int i=0; i<territoires_joueur2.size();i++) {
    					if((int)territoires_joueur2.get(i)==(int)territoire_attaque) {
    						a+=i;
    						territoires_joueur2.remove(a);	
    					}
    					
    				
    				}
    				for(int i=0; i<territoires_joueur3.size();i++) {
    					if((int)territoires_joueur3.get(i)==(int)territoire_attaque) {
    						b+=i;
    						territoires_joueur3.remove(b);	
    					}
    				}
    				for(int i=0; i<territoires_joueur4.size();i++) {
    					if((int)territoires_joueur4.get(i)==(int)territoire_attaque) {
    						c+=i;
    						territoires_joueur4.remove(c);	
    					}
    				}
    				boolean une_fois=true;	
    				for(int i=0; i<armees_posees_joueur1.size();i++) {
    					
        					if((int)armees_posees_joueur1.get(i)==(int)territoire_selectionne&&une_fois==true) {
        						armees_posees_joueur1.remove(i);
        						une_fois=false;
        					}
    				}
    				
    				
    				territoire_attaque=0;
    				territoire_selectionne=0;
    			}
    				
    				if(armees_posees_joueur2.contains(territoire_attaque)||armees_posees_joueur3.contains(territoire_attaque)||armees_posees_joueur4.contains(territoire_attaque)) {
        				boolean une_fois=true;	
        				for(int i=0; i<armees_posees_joueur1.size();i++) {
        					
        					if((int)armees_posees_joueur1.get(i)==(int)territoire_selectionne&&une_fois==true) {
        						armees_posees_joueur1.remove(i);
        						une_fois=false;
        					}
    				}
        				une_fois=true;
        				for(int i=0; i<armees_posees_joueur2.size();i++) {
        					
        					if((int)armees_posees_joueur2.get(i)==(int)territoire_attaque&&une_fois==true) {
        						armees_posees_joueur2.remove(i);
        						une_fois=false;
        					}
        				}
        				une_fois=true;
            			for(int i=0; i<armees_posees_joueur3.size();i++) {
            					
            					if((int)armees_posees_joueur3.get(i)==(int)territoire_attaque&&une_fois==true) {
            						armees_posees_joueur3.remove(i);
            						une_fois=false;
            				}
            			}
            					
            					une_fois=true;
                    			for(int i=0; i<armees_posees_joueur4.size();i++) {
                    					
                    					if((int)armees_posees_joueur4.get(i)==(int)territoire_attaque&&une_fois==true) {
                    						armees_posees_joueur4.remove(i);
                    						une_fois=false;
                    				}
                    			}
        					
        					territoire_attaque=0;
            				territoire_selectionne=0;
    				
    				
    			}
    			}
    			
    			
    			
    					
    				}
    		
    		
    		
    		
    		if((tour%4)==2){
    			
    			
    			if(territoire_selectionne==0) {
    			territoire_selectionne=territoire_selectionne_2( container);
    			
    			}
    			
    			
    			if(territoire_selectionne!=0) {
    				territoire_attaque=territoire_attaque_2_4(territoire_attaque, container, territoire_selectionne);
    				
    			}
    			
    			if(territoire_attaque!=0) {
    				if(!armees_posees_joueur1.contains(territoire_attaque)&&!armees_posees_joueur3.contains(territoire_attaque)&&!armees_posees_joueur4.contains(territoire_attaque)) {
    				int a=0;
    				int b=0;
    				int c=0;
    				territoires_joueur2.add(territoire_attaque);
    				for(int i=0; i<territoires_joueur1.size();i++) {
    					if((int)territoires_joueur1.get(i)==(int)territoire_attaque) {
    						a+=i;
    						territoires_joueur1.remove(a);	
    					}
    				}
    				
    				for(int i=0; i<territoires_joueur3.size();i++) {
    					if((int)territoires_joueur3.get(i)==(int)territoire_attaque) {
    						b+=i;
    						territoires_joueur3.remove(b);	
    					}
    				}
    				
    				for(int i=0; i<territoires_joueur4.size();i++) {
    					if((int)territoires_joueur4.get(i)==(int)territoire_attaque) {
    						c+=i;
    						territoires_joueur4.remove(c);	
    					}
    				}
    					
    				boolean une_fois=true;	
    				for(int i=0; i<armees_posees_joueur2.size();i++) {
        					
            					if((int)armees_posees_joueur2.get(i)==(int)territoire_selectionne&&une_fois==true) {
            						armees_posees_joueur2.remove(i);
            						une_fois=false;
            					}
        				}
    				
    				territoire_attaque=0;
    				territoire_selectionne=0;
    				
    				}
    				
    				if(armees_posees_joueur1.contains(territoire_attaque)||armees_posees_joueur3.contains(territoire_attaque)||armees_posees_joueur4.contains(territoire_attaque)) {
        				boolean une_fois=true;	
        				for(int i=0; i<armees_posees_joueur2.size();i++) {
        					
        					if((int)armees_posees_joueur2.get(i)==(int)territoire_selectionne&&une_fois==true) {
        						armees_posees_joueur2.remove(i);
        						une_fois=false;
        					}
    				}
        				une_fois=true;
        				for(int i=0; i<armees_posees_joueur1.size();i++) {
        					
        					if((int)armees_posees_joueur1.get(i)==(int)territoire_attaque&&une_fois==true) {
        						armees_posees_joueur1.remove(i);
        						une_fois=false;
        					}
        				}
        				une_fois=true;
            			for(int i=0; i<armees_posees_joueur3.size();i++) {
            					
            					if((int)armees_posees_joueur3.get(i)==(int)territoire_attaque&&une_fois==true) {
            						armees_posees_joueur3.remove(i);
            						une_fois=false;
            				}
            			}
            					
            					une_fois=true;
                    			for(int i=0; i<armees_posees_joueur4.size();i++) {
                    					
                    					if((int)armees_posees_joueur4.get(i)==(int)territoire_attaque&&une_fois==true) {
                    						armees_posees_joueur4.remove(i);
                    						une_fois=false;
                    				}
                    			}
        					
        					territoire_attaque=0;
            				territoire_selectionne=0;
    				
    				
    			}
    				
    			}
    		}
    			
    			
    			if((tour%4)==3){
        			
        			
        			if(territoire_selectionne==0) {
        			territoire_selectionne=territoire_selectionne_3( container);
        			
        			
        			
        			}
        			
        			
        			if(territoire_selectionne!=0) {
        				territoire_attaque=territoire_attaque_3_4(territoire_attaque, container, territoire_selectionne);

        				System.out.println(territoire_selectionne);
        				System.out.println(territoire_attaque);
        				
        			}
        			
        			if(territoire_attaque!=0) {
        				if(!armees_posees_joueur2.contains(territoire_attaque)&&!armees_posees_joueur1.contains(territoire_attaque)&&!armees_posees_joueur4.contains(territoire_attaque)) {
        				int a=0;
        				int b=0;
        				int c=0;
        				territoires_joueur3.add(territoire_attaque);
        				for(int i=0; i<territoires_joueur1.size();i++) {
        					if((int)territoires_joueur1.get(i)==(int)territoire_attaque) {
        						a+=i;
        						territoires_joueur1.remove(a);	
        					}
        				}
        				
        				for(int i=0; i<territoires_joueur2.size();i++) {
        					if((int)territoires_joueur2.get(i)==(int)territoire_attaque) {
        						b+=i;
        						territoires_joueur2.remove(b);	
        					}
        				}
        				

        				for(int i=0; i<territoires_joueur4.size();i++) {
        					if((int)territoires_joueur4.get(i)==(int)territoire_attaque) {
        						c+=i;
        						territoires_joueur4.remove(c);	
        					}
        				}
        					
        				boolean une_fois=true;	
        				for(int i=0; i<armees_posees_joueur3.size();i++) {
            					
                					if((int)armees_posees_joueur3.get(i)==(int)territoire_selectionne&&une_fois==true) {
                						armees_posees_joueur3.remove(i);
                						une_fois=false;
                					}
            				}
        				
        				territoire_attaque=0;
        				territoire_selectionne=0;
        				
        				}
        				
        				if(armees_posees_joueur2.contains(territoire_attaque)||armees_posees_joueur1.contains(territoire_attaque)||armees_posees_joueur4.contains(territoire_attaque)) {
            				boolean une_fois=true;	
            				for(int i=0; i<armees_posees_joueur3.size();i++) {
            					
            					if((int)armees_posees_joueur3.get(i)==(int)territoire_selectionne&&une_fois==true) {
            						armees_posees_joueur3.remove(i);
            						une_fois=false;
            					}
        				}
            				une_fois=true;
            				for(int i=0; i<armees_posees_joueur2.size();i++) {
            					
            					if((int)armees_posees_joueur2.get(i)==(int)territoire_attaque&&une_fois==true) {
            						armees_posees_joueur2.remove(i);
            						une_fois=false;
            					}
            				}
            				une_fois=true;
                			for(int i=0; i<armees_posees_joueur1.size();i++) {
                					
                					if((int)armees_posees_joueur1.get(i)==(int)territoire_attaque&&une_fois==true) {
                						armees_posees_joueur1.remove(i);
                						une_fois=false;
                				}
                			}
                					
                					une_fois=true;
                        			for(int i=0; i<armees_posees_joueur4.size();i++) {
                        					
                        					if((int)armees_posees_joueur4.get(i)==(int)territoire_attaque&&une_fois==true) {
                        						armees_posees_joueur4.remove(i);
                        						une_fois=false;
                        				}
                        			}
            					
            					territoire_attaque=0;
                				territoire_selectionne=0;
        				
        				
        			}
        				
        			}
    			}
    			
    			
    			
    			
    			
	if((tour%4)==0){																				
        			
        			
        			if(territoire_selectionne==0) {
        			territoire_selectionne=territoire_selectionne_4(container);
        			
        			
        			
        			}
        			
        			
        			if(territoire_selectionne!=0) {
        				territoire_attaque=territoire_attaque_4(territoire_attaque, container, territoire_selectionne);
        				
        			}
        			
        			if(territoire_attaque!=0) {
        				if(!armees_posees_joueur2.contains(territoire_attaque)&&!armees_posees_joueur3.contains(territoire_attaque)&&!armees_posees_joueur1.contains(territoire_attaque)) {
        				int a=0;
        				int b=0;
        				int c=0;
        				territoires_joueur4.add(territoire_attaque);
        				for(int i=0; i<territoires_joueur1.size();i++) {
        					if((int)territoires_joueur1.get(i)==(int)territoire_attaque) {
        						a+=i;
        						territoires_joueur1.remove(a);	
        					}
        				}
        				
        				for(int i=0; i<territoires_joueur2.size();i++) {
        					if((int)territoires_joueur2.get(i)==(int)territoire_attaque) {
        						b+=i;
        						territoires_joueur2.remove(b);	
        					}
        				}
        				

        				for(int i=0; i<territoires_joueur3.size();i++) {
        					if((int)territoires_joueur3.get(i)==(int)territoire_attaque) {
        						c+=i;
        						territoires_joueur3.remove(c);	
        					}
        				}
        					
        				boolean une_fois=true;	
        				for(int i=0; i<armees_posees_joueur4.size();i++) {
            					
                					if((int)armees_posees_joueur4.get(i)==(int)territoire_selectionne&&une_fois==true) {
                						armees_posees_joueur4.remove(i);
                						une_fois=false;
                					}
            				}
        				
        				territoire_attaque=0;
        				territoire_selectionne=0;
        				}
        				
        				if(armees_posees_joueur2.contains(territoire_attaque)||armees_posees_joueur3.contains(territoire_attaque)||armees_posees_joueur1.contains(territoire_attaque)) {
            				boolean une_fois=true;	
            				for(int i=0; i<armees_posees_joueur4.size();i++) {
            					
            					if((int)armees_posees_joueur4.get(i)==(int)territoire_selectionne&&une_fois==true) {
            						armees_posees_joueur4.remove(i);
            						une_fois=false;
            					}
        				}
            				une_fois=true;
            				for(int i=0; i<armees_posees_joueur2.size();i++) {
            					
            					if((int)armees_posees_joueur2.get(i)==(int)territoire_attaque&&une_fois==true) {
            						armees_posees_joueur2.remove(i);
            						une_fois=false;
            					}
            				}
            				une_fois=true;
                			for(int i=0; i<armees_posees_joueur3.size();i++) {
                					
                					if((int)armees_posees_joueur3.get(i)==(int)territoire_attaque&&une_fois==true) {
                						armees_posees_joueur3.remove(i);
                						une_fois=false;
                				}
                			}
                					
                					une_fois=true;
                        			for(int i=0; i<armees_posees_joueur1.size();i++) {
                        					
                        					if((int)armees_posees_joueur1.get(i)==(int)territoire_attaque&&une_fois==true) {
                        						armees_posees_joueur1.remove(i);
                        						une_fois=false;
                        				}
                        			}
            					
            					territoire_attaque=0;
                				territoire_selectionne=0;
        				
        				
        			}
        			}
    			}
    			
    			Affichage=true;
    			
    			if(container.getInput().isKeyPressed(Input.KEY_ENTER)) {
					tour+=1;
					w=1;
					v=1;
					x=1;
					y=1;
					une_fois_1=true;
					
				}
    				
    					
  
    		
    		
    			
    			}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
if(nbre_joueurs==5) {
    		
    		if((tour%5)==1&&Affichage==false){
    			if(territoire_selectionne==0) {
    				if(container.getInput().isKeyPressed(Input.KEY_ENTER)) {
        				tour=tour+1;
        			}
    			territoire_selectionne=territoire_selectionne_1( container);
    			
    			}
    			
    			
    			
    			if(territoire_selectionne!=0) {
    				territoire_attaque=territoire_attaque_1_5(territoire_attaque, container, territoire_selectionne);
    				
    			}
    			
    			if(territoire_attaque!=0) {
    				if(!armees_posees_joueur2.contains(territoire_attaque)&&!armees_posees_joueur3.contains(territoire_attaque)&&!armees_posees_joueur4.contains(territoire_attaque)&&!armees_posees_joueur5.contains(territoire_attaque)) {
    				int a=0;
    				int b=0;
    				int c=0;
    				int d=0;
    				territoires_joueur1.add(territoire_attaque);
    				for(int i=0; i<territoires_joueur2.size();i++) {
    					if((int)territoires_joueur2.get(i)==(int)territoire_attaque) {
    						a+=i;
    						territoires_joueur2.remove(a);	
    					}
    				}
    				for(int i=0; i<territoires_joueur3.size();i++) {
    					if((int)territoires_joueur3.get(i)==(int)territoire_attaque) {
    						b+=i;
    						territoires_joueur3.remove(b);	
    					}
    				}
    				for(int i=0; i<territoires_joueur4.size();i++) {
    					if((int)territoires_joueur4.get(i)==(int)territoire_attaque) {
    						c+=i;
    						territoires_joueur4.remove(c);	
    					}
    				}
    				for(int i=0; i<territoires_joueur5.size();i++) {
    					if((int)territoires_joueur5.get(i)==(int)territoire_attaque) {
    						d+=i;
    						territoires_joueur5.remove(d);	
    					}
    				}
    				boolean une_fois=true;	
    				for(int i=0; i<armees_posees_joueur1.size();i++) {
    					
        					if((int)armees_posees_joueur1.get(i)==(int)territoire_selectionne&&une_fois==true) {
        						armees_posees_joueur1.remove(i);
        						une_fois=false;
        					}
    				}
    				
    				
    				
    				territoire_attaque=0;
    				territoire_selectionne=0;
    			}
    				
    				if(armees_posees_joueur2.contains(territoire_attaque)||armees_posees_joueur3.contains(territoire_attaque)||armees_posees_joueur4.contains(territoire_attaque)||armees_posees_joueur5.contains(territoire_attaque)) {
        				boolean une_fois=true;	
        				for(int i=0; i<armees_posees_joueur1.size();i++) {
        					
        					if((int)armees_posees_joueur1.get(i)==(int)territoire_selectionne&&une_fois==true) {
        						armees_posees_joueur1.remove(i);
        						une_fois=false;
        					}
    				}
        				une_fois=true;
        				for(int i=0; i<armees_posees_joueur2.size();i++) {
        					
        					if((int)armees_posees_joueur2.get(i)==(int)territoire_attaque&&une_fois==true) {
        						armees_posees_joueur2.remove(i);
        						une_fois=false;
        					}
        				}
        				une_fois=true;
            			for(int i=0; i<armees_posees_joueur3.size();i++) {
            					
            					if((int)armees_posees_joueur3.get(i)==(int)territoire_attaque&&une_fois==true) {
            						armees_posees_joueur3.remove(i);
            						une_fois=false;
            				}
            			}
            					
            					une_fois=true;
                    			for(int i=0; i<armees_posees_joueur4.size();i++) {
                    					
                    					if((int)armees_posees_joueur4.get(i)==(int)territoire_attaque&&une_fois==true) {
                    						armees_posees_joueur4.remove(i);
                    						une_fois=false;
                    				}
                    			}
                    			
                    			une_fois=true;
                    			for(int i=0; i<armees_posees_joueur5.size();i++) {
                    					
                    					if((int)armees_posees_joueur5.get(i)==(int)territoire_attaque&&une_fois==true) {
                    						armees_posees_joueur5.remove(i);
                    						une_fois=false;
                    				}
                    					
                    			}
        					
        					territoire_attaque=0;
            				territoire_selectionne=0;
    				
    				
    			}
    				
    			}
    			
    			
    			
    					
    				}
    		
    		if(tour==1){
    			
    			if(territoire_selectionne==0) {
    				
    				if(container.getInput().isKeyPressed(Input.KEY_ENTER)) {
        				tour=tour+1;
        			}
    				
    			territoire_selectionne=territoire_selectionne_1( container);
    			}
    			
    			
    			
    			if(territoire_selectionne!=0) {
    				territoire_attaque=territoire_attaque_1_5(territoire_attaque, container, territoire_selectionne);
    				
    				
    			}
    			
    			
    			if(territoire_attaque!=0) {
    				if(!armees_posees_joueur2.contains(territoire_attaque)&&!armees_posees_joueur3.contains(territoire_attaque)&&!armees_posees_joueur4.contains(territoire_attaque)&&!armees_posees_joueur5.contains(territoire_attaque)) {
    				int a=0;
    				int b=0;
    				int c=0;
    				int d=0;
    				territoires_joueur1.add(territoire_attaque);
    				for(int i=0; i<territoires_joueur2.size();i++) {
    					if((int)territoires_joueur2.get(i)==(int)territoire_attaque) {
    						a+=i;
    						territoires_joueur2.remove(a);	
    					}
    					
    				
    				}
    				for(int i=0; i<territoires_joueur3.size();i++) {
    					if((int)territoires_joueur3.get(i)==(int)territoire_attaque) {
    						b+=i;
    						territoires_joueur3.remove(b);	
    					}
    				}
    				for(int i=0; i<territoires_joueur4.size();i++) {
    					if((int)territoires_joueur4.get(i)==(int)territoire_attaque) {
    						c+=i;
    						territoires_joueur3.remove(c);	
    					}
    				}
    				
    				for(int i=0; i<territoires_joueur5.size();i++) {
    					if((int)territoires_joueur5.get(i)==(int)territoire_attaque) {
    						d+=i;
    						territoires_joueur5.remove(d);	
    					}
    				}
    				boolean une_fois=true;	
    				for(int i=0; i<armees_posees_joueur1.size();i++) {
    					
        					if((int)armees_posees_joueur1.get(i)==(int)territoire_selectionne&&une_fois==true) {
        						armees_posees_joueur1.remove(i);
        						une_fois=false;
        					}
    				}
    				
    				
    				territoire_attaque=0;
    				territoire_selectionne=0;
    			}

    				if(armees_posees_joueur2.contains(territoire_attaque)||armees_posees_joueur3.contains(territoire_attaque)||armees_posees_joueur4.contains(territoire_attaque)||armees_posees_joueur5.contains(territoire_attaque)) {
        				boolean une_fois=true;	
        				for(int i=0; i<armees_posees_joueur1.size();i++) {
        					
        					if((int)armees_posees_joueur1.get(i)==(int)territoire_selectionne&&une_fois==true) {
        						armees_posees_joueur1.remove(i);
        						une_fois=false;
        					}
    				}
        				une_fois=true;
        				for(int i=0; i<armees_posees_joueur2.size();i++) {
        					
        					if((int)armees_posees_joueur2.get(i)==(int)territoire_attaque&&une_fois==true) {
        						armees_posees_joueur2.remove(i);
        						une_fois=false;
        					}
        				}
        				une_fois=true;
            			for(int i=0; i<armees_posees_joueur3.size();i++) {
            					
            					if((int)armees_posees_joueur3.get(i)==(int)territoire_attaque&&une_fois==true) {
            						armees_posees_joueur3.remove(i);
            						une_fois=false;
            				}
            			}
            					
            					une_fois=true;
                    			for(int i=0; i<armees_posees_joueur4.size();i++) {
                    					
                    					if((int)armees_posees_joueur4.get(i)==(int)territoire_attaque&&une_fois==true) {
                    						armees_posees_joueur4.remove(i);
                    						une_fois=false;
                    				}
                    			}
                    			
                    			une_fois=true;
                    			for(int i=0; i<armees_posees_joueur5.size();i++) {
                    					
                    					if((int)armees_posees_joueur5.get(i)==(int)territoire_attaque&&une_fois==true) {
                    						armees_posees_joueur5.remove(i);
                    						une_fois=false;
                    				}
                    					
                    			}
        					
        					territoire_attaque=0;
            				territoire_selectionne=0;
    				
    				
    			}
    			}
    			
    			
    			
    					
    				}
    		
    		
    		
    		
    		if((tour%5)==2){
    			
    			
    			if(territoire_selectionne==0) {
    			territoire_selectionne=territoire_selectionne_2( container);
    			
    			}
    			
    			
    			if(territoire_selectionne!=0) {
    				territoire_attaque=territoire_attaque_2_5(territoire_attaque, container, territoire_selectionne);
    				
    			}
    			
    			if(territoire_attaque!=0) {
    				if(!armees_posees_joueur1.contains(territoire_attaque)&&!armees_posees_joueur3.contains(territoire_attaque)&&!armees_posees_joueur4.contains(territoire_attaque)&&!armees_posees_joueur5.contains(territoire_attaque)) {
    				int a=0;
    				int b=0;
    				int c=0;
    				int d=0;
    				territoires_joueur2.add(territoire_attaque);
    				for(int i=0; i<territoires_joueur1.size();i++) {
    					if((int)territoires_joueur1.get(i)==(int)territoire_attaque) {
    						a+=i;
    						territoires_joueur1.remove(a);	
    					}
    				}
    				
    				for(int i=0; i<territoires_joueur3.size();i++) {
    					if((int)territoires_joueur3.get(i)==(int)territoire_attaque) {
    						b+=i;
    						territoires_joueur3.remove(b);	
    					}
    				}
    				
    				for(int i=0; i<territoires_joueur4.size();i++) {
    					if((int)territoires_joueur4.get(i)==(int)territoire_attaque) {
    						c+=i;
    						territoires_joueur4.remove(c);	
    					}
    				}
    				
    				for(int i=0; i<territoires_joueur5.size();i++) {
    					if((int)territoires_joueur5.get(i)==(int)territoire_attaque) {
    						d+=i;
    						territoires_joueur5.remove(d);	
    					}
    				}
    					
    				boolean une_fois=true;	
    				for(int i=0; i<armees_posees_joueur2.size();i++) {
        					
            					if((int)armees_posees_joueur2.get(i)==(int)territoire_selectionne&&une_fois==true) {
            						armees_posees_joueur2.remove(i);
            						une_fois=false;
            					}
        				}
    				
    				territoire_attaque=0;
    				territoire_selectionne=0;
    				}
    				

    				if(armees_posees_joueur1.contains(territoire_attaque)||armees_posees_joueur3.contains(territoire_attaque)||armees_posees_joueur4.contains(territoire_attaque)||armees_posees_joueur5.contains(territoire_attaque)) {
        				boolean une_fois=true;	
        				for(int i=0; i<armees_posees_joueur2.size();i++) {
        					
        					if((int)armees_posees_joueur2.get(i)==(int)territoire_selectionne&&une_fois==true) {
        						armees_posees_joueur2.remove(i);
        						une_fois=false;
        					}
    				}
        				une_fois=true;
        				for(int i=0; i<armees_posees_joueur1.size();i++) {
        					
        					if((int)armees_posees_joueur1.get(i)==(int)territoire_attaque&&une_fois==true) {
        						armees_posees_joueur1.remove(i);
        						une_fois=false;
        					}
        				}
        				une_fois=true;
            			for(int i=0; i<armees_posees_joueur3.size();i++) {
            					
            					if((int)armees_posees_joueur3.get(i)==(int)territoire_attaque&&une_fois==true) {
            						armees_posees_joueur3.remove(i);
            						une_fois=false;
            				}
            			}
            					
            					une_fois=true;
                    			for(int i=0; i<armees_posees_joueur4.size();i++) {
                    					
                    					if((int)armees_posees_joueur4.get(i)==(int)territoire_attaque&&une_fois==true) {
                    						armees_posees_joueur4.remove(i);
                    						une_fois=false;
                    				}
                    			}
                    			
                    			une_fois=true;
                    			for(int i=0; i<armees_posees_joueur5.size();i++) {
                    					
                    					if((int)armees_posees_joueur5.get(i)==(int)territoire_attaque&&une_fois==true) {
                    						armees_posees_joueur5.remove(i);
                    						une_fois=false;
                    				}
                    					
                    					
                    			}
        					territoire_attaque=0;
            				territoire_selectionne=0;
    				
    				
    			}
    				
    				
    			}
    		}
    			
    			
    			if((tour%5)==3){
        			
        			
        			if(territoire_selectionne==0) {
        			territoire_selectionne=territoire_selectionne_3( container);
        			
        			
        			
        			}
        			
        			
        			if(territoire_selectionne!=0) {
        				territoire_attaque=territoire_attaque_3_5(territoire_attaque, container, territoire_selectionne);
        				
        			}
        			
        			if(territoire_attaque!=0) {
        				if(!armees_posees_joueur2.contains(territoire_attaque)&&!armees_posees_joueur1.contains(territoire_attaque)&&!armees_posees_joueur4.contains(territoire_attaque)&&!armees_posees_joueur5.contains(territoire_attaque)) {
        				int a=0;
        				int b=0;
        				int c=0;
        				int d=0;
        				territoires_joueur3.add(territoire_attaque);
        				for(int i=0; i<territoires_joueur1.size();i++) {
        					if((int)territoires_joueur1.get(i)==(int)territoire_attaque) {
        						a+=i;
        						territoires_joueur1.remove(a);	
        					}
        				}
        				
        				for(int i=0; i<territoires_joueur2.size();i++) {
        					if((int)territoires_joueur2.get(i)==(int)territoire_attaque) {
        						b+=i;
        						territoires_joueur2.remove(b);	
        					}
        				}
        				

        				for(int i=0; i<territoires_joueur4.size();i++) {
        					if((int)territoires_joueur4.get(i)==(int)territoire_attaque) {
        						c+=i;
        						territoires_joueur4.remove(c);	
        					}
        				}
        				
        				
        				for(int i=0; i<territoires_joueur5.size();i++) {
        					if((int)territoires_joueur5.get(i)==(int)territoire_attaque) {
        						d+=i;
        						territoires_joueur5.remove(d);	
        					}
        				}
        					
        				boolean une_fois=true;	
        				for(int i=0; i<armees_posees_joueur3.size();i++) {
            					
                					if((int)armees_posees_joueur3.get(i)==(int)territoire_selectionne&&une_fois==true) {
                						armees_posees_joueur3.remove(i);
                						une_fois=false;
                					}
            				}
        				
        				territoire_attaque=0;
        				territoire_selectionne=0;
        				}
        				

        				if(armees_posees_joueur2.contains(territoire_attaque)||armees_posees_joueur1.contains(territoire_attaque)||armees_posees_joueur4.contains(territoire_attaque)||armees_posees_joueur5.contains(territoire_attaque)) {
            				boolean une_fois=true;	
            				for(int i=0; i<armees_posees_joueur3.size();i++) {
            					
            					if((int)armees_posees_joueur3.get(i)==(int)territoire_selectionne&&une_fois==true) {
            						armees_posees_joueur3.remove(i);
            						une_fois=false;
            					}
        				}
            				une_fois=true;
            				for(int i=0; i<armees_posees_joueur2.size();i++) {
            					
            					if((int)armees_posees_joueur2.get(i)==(int)territoire_attaque&&une_fois==true) {
            						armees_posees_joueur2.remove(i);
            						une_fois=false;
            					}
            				}
            				une_fois=true;
                			for(int i=0; i<armees_posees_joueur1.size();i++) {
                					
                					if((int)armees_posees_joueur1.get(i)==(int)territoire_attaque&&une_fois==true) {
                						armees_posees_joueur1.remove(i);
                						une_fois=false;
                				}
                			}
                					
                					une_fois=true;
                        			for(int i=0; i<armees_posees_joueur4.size();i++) {
                        					
                        					if((int)armees_posees_joueur4.get(i)==(int)territoire_attaque&&une_fois==true) {
                        						armees_posees_joueur4.remove(i);
                        						une_fois=false;
                        				}
                        			}
                        			
                        			une_fois=true;
                        			for(int i=0; i<armees_posees_joueur5.size();i++) {
                        					
                        					if((int)armees_posees_joueur5.get(i)==(int)territoire_attaque&&une_fois==true) {
                        						armees_posees_joueur5.remove(i);
                        						une_fois=false;
                        				}
                        					
                        			}		
            					
            					territoire_attaque=0;
                				territoire_selectionne=0;
        				
        				
        			}
        				
        				
        			}
    			}
    			
    			
    			
    			
    			
	if((tour%5)==4){																					
        			
        			
        			if(territoire_selectionne==0) {
        			territoire_selectionne=territoire_selectionne_4(container);
        			
        			
        			
        			}
        			
        			
        			if(territoire_selectionne!=0) {
        				territoire_attaque=territoire_attaque_4_5(territoire_attaque, container, territoire_selectionne);
        				
        			}
        			
        			if(territoire_attaque!=0) {
        				if(!armees_posees_joueur2.contains(territoire_attaque)&&!armees_posees_joueur3.contains(territoire_attaque)&&!armees_posees_joueur1.contains(territoire_attaque)&&!armees_posees_joueur5.contains(territoire_attaque)) {
        				int a=0;
        				int b=0;
        				int c=0;
        				int d=0;
        				territoires_joueur4.add(territoire_attaque);
        				for(int i=0; i<territoires_joueur1.size();i++) {
        					if((int)territoires_joueur1.get(i)==(int)territoire_attaque) {
        						a+=i;
        						territoires_joueur1.remove(a);	
        					}
        				}
        				
        				for(int i=0; i<territoires_joueur2.size();i++) {
        					if((int)territoires_joueur2.get(i)==(int)territoire_attaque) {
        						b+=i;
        						territoires_joueur2.remove(b);	
        					}
        				}
        				

        				for(int i=0; i<territoires_joueur3.size();i++) {
        					if((int)territoires_joueur3.get(i)==(int)territoire_attaque) {
        						c+=i;
        						territoires_joueur3.remove(c);	
        					}
        				}
        					
        				for(int i=0; i<territoires_joueur5.size();i++) {
        					if((int)territoires_joueur5.get(i)==(int)territoire_attaque) {
        						d+=i;
        						territoires_joueur5.remove(d);	
        					}
        				}
        					
        				boolean une_fois=true;	
        				for(int i=0; i<armees_posees_joueur4.size();i++) {
            					
                					if((int)armees_posees_joueur4.get(i)==(int)territoire_selectionne&&une_fois==true) {
                						armees_posees_joueur4.remove(i);
                						une_fois=false;
                					}
            				}
        				
        				territoire_attaque=0;
        				territoire_selectionne=0;
        				}
        				

        				if(armees_posees_joueur2.contains(territoire_attaque)||armees_posees_joueur3.contains(territoire_attaque)||armees_posees_joueur1.contains(territoire_attaque)||armees_posees_joueur5.contains(territoire_attaque)) {
            				boolean une_fois=true;	
            				for(int i=0; i<armees_posees_joueur4.size();i++) {
            					
            					if((int)armees_posees_joueur4.get(i)==(int)territoire_selectionne&&une_fois==true) {
            						armees_posees_joueur4.remove(i);
            						une_fois=false;
            					}
        				}
            				une_fois=true;
            				for(int i=0; i<armees_posees_joueur2.size();i++) {
            					
            					if((int)armees_posees_joueur2.get(i)==(int)territoire_attaque&&une_fois==true) {
            						armees_posees_joueur2.remove(i);
            						une_fois=false;
            					}
            				}
            				une_fois=true;
                			for(int i=0; i<armees_posees_joueur3.size();i++) {
                					
                					if((int)armees_posees_joueur3.get(i)==(int)territoire_attaque&&une_fois==true) {
                						armees_posees_joueur3.remove(i);
                						une_fois=false;
                				}
                			}
                					
                					une_fois=true;
                        			for(int i=0; i<armees_posees_joueur1.size();i++) {
                        					
                        					if((int)armees_posees_joueur1.get(i)==(int)territoire_attaque&&une_fois==true) {
                        						armees_posees_joueur1.remove(i);
                        						une_fois=false;
                        				}
                        			}
                        			
                        			une_fois=true;
                        			for(int i=0; i<armees_posees_joueur5.size();i++) {
                        					
                        					if((int)armees_posees_joueur5.get(i)==(int)territoire_attaque&&une_fois==true) {
                        						armees_posees_joueur5.remove(i);
                        						une_fois=false;
                        				}
                        					
                        					
                        			}
            					territoire_attaque=0;
                				territoire_selectionne=0;
        				
        				
        			}
        				
        				
        				
        			}
    			}
	
	
	
	if((tour%5)==0){																					
		
		
		if(territoire_selectionne==0) {
		territoire_selectionne=territoire_selectionne_5(container);
		
		
		
		}
		
		
		if(territoire_selectionne!=0) {
			territoire_attaque=territoire_attaque_5_5(territoire_attaque, container, territoire_selectionne);
			
		}
		
		if(territoire_attaque!=0) {
			if(!armees_posees_joueur2.contains(territoire_attaque)&&!armees_posees_joueur3.contains(territoire_attaque)&&!armees_posees_joueur4.contains(territoire_attaque)&&!armees_posees_joueur1.contains(territoire_attaque)) {
			int a=0;
			int b=0;
			int c=0;
			int d=0;
			territoires_joueur5.add(territoire_attaque);
			for(int i=0; i<territoires_joueur1.size();i++) {
				if((int)territoires_joueur1.get(i)==(int)territoire_attaque) {
					a+=i;
					territoires_joueur1.remove(a);	
				}
			}
			
			for(int i=0; i<territoires_joueur2.size();i++) {
				if((int)territoires_joueur2.get(i)==(int)territoire_attaque) {
					b+=i;
					territoires_joueur2.remove(b);	
				}
			}
			

			for(int i=0; i<territoires_joueur3.size();i++) {
				if((int)territoires_joueur3.get(i)==(int)territoire_attaque) {
					c+=i;
					territoires_joueur3.remove(c);	
				}
			}
				
			for(int i=0; i<territoires_joueur4.size();i++) {
				if((int)territoires_joueur4.get(i)==(int)territoire_attaque) {
					d+=i;
					territoires_joueur4.remove(c);	
				}
			}
				
			boolean une_fois=true;	
			for(int i=0; i<armees_posees_joueur5.size();i++) {
					
    					if((int)armees_posees_joueur5.get(i)==(int)territoire_selectionne&&une_fois==true) {
    						armees_posees_joueur5.remove(i);
    						une_fois=false;
    					}
				}
			
			territoire_attaque=0;
			territoire_selectionne=0;
			}
			

			if(armees_posees_joueur2.contains(territoire_attaque)||armees_posees_joueur3.contains(territoire_attaque)||armees_posees_joueur4.contains(territoire_attaque)||armees_posees_joueur1.contains(territoire_attaque)) {
				boolean une_fois=true;	
				for(int i=0; i<armees_posees_joueur5.size();i++) {
					
					if((int)armees_posees_joueur5.get(i)==(int)territoire_selectionne&&une_fois==true) {
						armees_posees_joueur5.remove(i);
						une_fois=false;
					}
			}
				une_fois=true;
				for(int i=0; i<armees_posees_joueur2.size();i++) {
					
					if((int)armees_posees_joueur2.get(i)==(int)territoire_attaque&&une_fois==true) {
						armees_posees_joueur2.remove(i);
						une_fois=false;
					}
				}
				une_fois=true;
    			for(int i=0; i<armees_posees_joueur3.size();i++) {
    					
    					if((int)armees_posees_joueur3.get(i)==(int)territoire_attaque&&une_fois==true) {
    						armees_posees_joueur3.remove(i);
    						une_fois=false;
    				}
    			}
    					
    					une_fois=true;
            			for(int i=0; i<armees_posees_joueur4.size();i++) {
            					
            					if((int)armees_posees_joueur4.get(i)==(int)territoire_attaque&&une_fois==true) {
            						armees_posees_joueur4.remove(i);
            						une_fois=false;
            				}
            			}
            			
            			une_fois=true;
            			for(int i=0; i<armees_posees_joueur1.size();i++) {
            					
            					if((int)armees_posees_joueur1.get(i)==(int)territoire_attaque&&une_fois==true) {
            						armees_posees_joueur1.remove(i);
            						une_fois=false;
            				}
            					
            			}		
					
					territoire_attaque=0;
    				territoire_selectionne=0;
			
			
		}
			
			
			
		}
	}
    			
    			Affichage=true;
    			
    			if(container.getInput().isKeyPressed(Input.KEY_ENTER)) {
					tour+=1;
					w=1;
					v=1;
					x=1;
					y=1;
					z=1;
					une_fois_1=true;
					
				}
    				
    					
  
    		
    		
    			
    			}





































if(nbre_joueurs==6) {
	
	if((tour%6)==1&&Affichage==false){
		if(territoire_selectionne==0) {
			if(container.getInput().isKeyPressed(Input.KEY_ENTER)) {
				tour=tour+1;
			}
		territoire_selectionne=territoire_selectionne_1( container);
		
		}
		
		
		
		if(territoire_selectionne!=0) {
			territoire_attaque=territoire_attaque_1_6(territoire_attaque, container, territoire_selectionne);
			
		}
		
		if(territoire_attaque!=0) {
			if(!armees_posees_joueur2.contains(territoire_attaque)&&!armees_posees_joueur3.contains(territoire_attaque)&&!armees_posees_joueur4.contains(territoire_attaque)&&!armees_posees_joueur5.contains(territoire_attaque)&&!armees_posees_joueur6.contains(territoire_attaque)) {
			int a=0;
			int b=0;
			int c=0;
			int d=0;
			int e=0;
			territoires_joueur1.add(territoire_attaque);
			for(int i=0; i<territoires_joueur2.size();i++) {
				if((int)territoires_joueur2.get(i)==(int)territoire_attaque) {
					a+=i;
					territoires_joueur2.remove(a);	
				}
			}
			for(int i=0; i<territoires_joueur3.size();i++) {
				if((int)territoires_joueur3.get(i)==(int)territoire_attaque) {
					b+=i;
					territoires_joueur3.remove(b);	
				}
			}
			for(int i=0; i<territoires_joueur4.size();i++) {
				if((int)territoires_joueur4.get(i)==(int)territoire_attaque) {
					c+=i;
					territoires_joueur4.remove(c);	
				}
			}
			for(int i=0; i<territoires_joueur5.size();i++) {
				if((int)territoires_joueur5.get(i)==(int)territoire_attaque) {
					d+=i;
					territoires_joueur5.remove(d);	
				}
			}
			
			for(int i=0; i<territoires_joueur6.size();i++) {
				if((int)territoires_joueur6.get(i)==(int)territoire_attaque) {
					e+=i;
					territoires_joueur6.remove(e);	
				}
			}
			boolean une_fois=true;	
			for(int i=0; i<armees_posees_joueur1.size();i++) {
				
					if((int)armees_posees_joueur1.get(i)==(int)territoire_selectionne&&une_fois==true) {
						armees_posees_joueur1.remove(i);
						une_fois=false;
					}
			}
			
			
			
			territoire_attaque=0;
			territoire_selectionne=0;
		}
			
			
			if(armees_posees_joueur2.contains(territoire_attaque)||armees_posees_joueur3.contains(territoire_attaque)||armees_posees_joueur4.contains(territoire_attaque)||armees_posees_joueur5.contains(territoire_attaque)||armees_posees_joueur6.contains(territoire_attaque)) {
				boolean une_fois=true;	
				for(int i=0; i<armees_posees_joueur1.size();i++) {
					
					if((int)armees_posees_joueur1.get(i)==(int)territoire_selectionne&&une_fois==true) {
						armees_posees_joueur1.remove(i);
						une_fois=false;
					}
			}
				une_fois=true;
				for(int i=0; i<armees_posees_joueur2.size();i++) {
					
					if((int)armees_posees_joueur2.get(i)==(int)territoire_attaque&&une_fois==true) {
						armees_posees_joueur2.remove(i);
						une_fois=false;
					}
				}
				une_fois=true;
    			for(int i=0; i<armees_posees_joueur3.size();i++) {
    					
    					if((int)armees_posees_joueur3.get(i)==(int)territoire_attaque&&une_fois==true) {
    						armees_posees_joueur3.remove(i);
    						une_fois=false;
    				}
    			}
    					
    					une_fois=true;
            			for(int i=0; i<armees_posees_joueur4.size();i++) {
            					
            					if((int)armees_posees_joueur4.get(i)==(int)territoire_attaque&&une_fois==true) {
            						armees_posees_joueur4.remove(i);
            						une_fois=false;
            				}
            			}
            			
            			une_fois=true;
            			for(int i=0; i<armees_posees_joueur5.size();i++) {
            					
            					if((int)armees_posees_joueur5.get(i)==(int)territoire_attaque&&une_fois==true) {
            						armees_posees_joueur5.remove(i);
            						une_fois=false;
            				}
            			}
            			
            			une_fois=true;
            			for(int i=0; i<armees_posees_joueur6.size();i++) {
            					
            					if((int)armees_posees_joueur6.get(i)==(int)territoire_attaque&&une_fois==true) {
            						armees_posees_joueur6.remove(i);
            						une_fois=false;
            				}
            					
            					
					
					territoire_attaque=0;
    				territoire_selectionne=0;
			}
		}
			
			
		}
		
		
		
				
			}
	
	if(tour==1){
		
		if(territoire_selectionne==0) {
			
			if(container.getInput().isKeyPressed(Input.KEY_ENTER)) {
				tour=tour+1;
			}
			
		territoire_selectionne=territoire_selectionne_1( container);
		}
		
		
		
		if(territoire_selectionne!=0) {
			territoire_attaque=territoire_attaque_1_6(territoire_attaque, container, territoire_selectionne);
			
			
		}
		
		
		if(territoire_attaque!=0) {
			if(!armees_posees_joueur2.contains(territoire_attaque)&&!armees_posees_joueur3.contains(territoire_attaque)&&!armees_posees_joueur4.contains(territoire_attaque)&&!armees_posees_joueur5.contains(territoire_attaque)&&!armees_posees_joueur6.contains(territoire_attaque)) {
				
			int a=0;
			int b=0;
			int c=0;
			int d=0;
			int e=0;
			territoires_joueur1.add(territoire_attaque);
			for(int i=0; i<territoires_joueur2.size();i++) {
				if((int)territoires_joueur2.get(i)==(int)territoire_attaque) {
					a+=i;
					territoires_joueur2.remove(a);	
				}
				
			
			}
			for(int i=0; i<territoires_joueur3.size();i++) {
				if((int)territoires_joueur3.get(i)==(int)territoire_attaque) {
					b+=i;
					territoires_joueur3.remove(b);	
				}
			}
			for(int i=0; i<territoires_joueur4.size();i++) {
				if((int)territoires_joueur4.get(i)==(int)territoire_attaque) {
					c+=i;
					territoires_joueur4.remove(c);	
				}
			}
			
			for(int i=0; i<territoires_joueur6.size();i++) {
				if((int)territoires_joueur6.get(i)==(int)territoire_attaque) {
					e+=i;
					territoires_joueur6.remove(e);	
				}
			}
			
			for(int i=0; i<territoires_joueur5.size();i++) {
				if((int)territoires_joueur5.get(i)==(int)territoire_attaque) {
					d+=i;
					territoires_joueur5.remove(d);	
				}
			}
			boolean une_fois=true;	
			for(int i=0; i<armees_posees_joueur1.size();i++) {
				
					if((int)armees_posees_joueur1.get(i)==(int)territoire_selectionne&&une_fois==true) {
						armees_posees_joueur1.remove(i);
						une_fois=false;
					}
			}
			
			
			territoire_attaque=0;
			territoire_selectionne=0;
		}

			if(armees_posees_joueur2.contains(territoire_attaque)||armees_posees_joueur3.contains(territoire_attaque)||armees_posees_joueur4.contains(territoire_attaque)||armees_posees_joueur5.contains(territoire_attaque)||armees_posees_joueur6.contains(territoire_attaque)) {
				boolean une_fois=true;	
				for(int i=0; i<armees_posees_joueur1.size();i++) {
					
					if((int)armees_posees_joueur1.get(i)==(int)territoire_selectionne&&une_fois==true) {
						armees_posees_joueur1.remove(i);
						une_fois=false;
					}
			}
				une_fois=true;
				for(int i=0; i<armees_posees_joueur2.size();i++) {
					
					if((int)armees_posees_joueur2.get(i)==(int)territoire_attaque&&une_fois==true) {
						armees_posees_joueur2.remove(i);
						une_fois=false;
					}
				}
				une_fois=true;
    			for(int i=0; i<armees_posees_joueur3.size();i++) {
    					
    					if((int)armees_posees_joueur3.get(i)==(int)territoire_attaque&&une_fois==true) {
    						armees_posees_joueur3.remove(i);
    						une_fois=false;
    				}
    			}
    					
    					une_fois=true;
            			for(int i=0; i<armees_posees_joueur4.size();i++) {
            					
            					if((int)armees_posees_joueur4.get(i)==(int)territoire_attaque&&une_fois==true) {
            						armees_posees_joueur4.remove(i);
            						une_fois=false;
            				}
            			}
            			
            			une_fois=true;
            			for(int i=0; i<armees_posees_joueur5.size();i++) {
            					
            					if((int)armees_posees_joueur5.get(i)==(int)territoire_attaque&&une_fois==true) {
            						armees_posees_joueur5.remove(i);
            						une_fois=false;
            				}
            			}
            			
            			une_fois=true;
            			for(int i=0; i<armees_posees_joueur6.size();i++) {
            					
            					if((int)armees_posees_joueur6.get(i)==(int)territoire_attaque&&une_fois==true) {
            						armees_posees_joueur6.remove(i);
            						une_fois=false;
            				}
            					
            					
					
					territoire_attaque=0;
    				territoire_selectionne=0;
			}
		}
			
		}
		
		
		
				
			}
	
	
	
	
	if((tour%6)==2){
		
		
		if(territoire_selectionne==0) {
		territoire_selectionne=territoire_selectionne_2( container);
		
		}
		
		
		if(territoire_selectionne!=0) {
			territoire_attaque=territoire_attaque_2_6(territoire_attaque, container, territoire_selectionne);
			
		}
		
		if(territoire_attaque!=0) {
			if(!armees_posees_joueur1.contains(territoire_attaque)&&!armees_posees_joueur3.contains(territoire_attaque)&&!armees_posees_joueur4.contains(territoire_attaque)&&!armees_posees_joueur5.contains(territoire_attaque)&&!armees_posees_joueur6.contains(territoire_attaque)) {
				
			int a=0;
			int b=0;
			int c=0;
			int d=0;
			int e=0;
			territoires_joueur2.add(territoire_attaque);
			for(int i=0; i<territoires_joueur1.size();i++) {
				if((int)territoires_joueur1.get(i)==(int)territoire_attaque) {
					a+=i;
					territoires_joueur1.remove(a);	
				}
			}
			
			for(int i=0; i<territoires_joueur3.size();i++) {
				if((int)territoires_joueur3.get(i)==(int)territoire_attaque) {
					b+=i;
					territoires_joueur3.remove(b);	
				}
			}
			
			for(int i=0; i<territoires_joueur4.size();i++) {
				if((int)territoires_joueur4.get(i)==(int)territoire_attaque) {
					c+=i;
					territoires_joueur4.remove(c);	
				}
			}
			
			for(int i=0; i<territoires_joueur5.size();i++) {
				if((int)territoires_joueur5.get(i)==(int)territoire_attaque) {
					d+=i;
					territoires_joueur5.remove(d);	
				}
			}
			for(int i=0; i<territoires_joueur6.size();i++) {
				if((int)territoires_joueur6.get(i)==(int)territoire_attaque) {
					e+=i;
					territoires_joueur6.remove(e);	
				}
			}
				
			boolean une_fois=true;	
			for(int i=0; i<armees_posees_joueur2.size();i++) {
					
    					if((int)armees_posees_joueur2.get(i)==(int)territoire_selectionne&&une_fois==true) {
    						armees_posees_joueur2.remove(i);
    						une_fois=false;
    					}
				}
			
			territoire_attaque=0;
			territoire_selectionne=0;
			
			
			
		}
			
			if(armees_posees_joueur1.contains(territoire_attaque)||armees_posees_joueur3.contains(territoire_attaque)||armees_posees_joueur4.contains(territoire_attaque)||armees_posees_joueur5.contains(territoire_attaque)||armees_posees_joueur6.contains(territoire_attaque)) {
				boolean une_fois=true;	
				for(int i=0; i<armees_posees_joueur2.size();i++) {
					
					if((int)armees_posees_joueur2.get(i)==(int)territoire_selectionne&&une_fois==true) {
						armees_posees_joueur2.remove(i);
						une_fois=false;
					}
			}
				une_fois=true;
				for(int i=0; i<armees_posees_joueur1.size();i++) {
					
					if((int)armees_posees_joueur1.get(i)==(int)territoire_attaque&&une_fois==true) {
						armees_posees_joueur1.remove(i);
						une_fois=false;
					}
				}
				une_fois=true;
    			for(int i=0; i<armees_posees_joueur3.size();i++) {
    					
    					if((int)armees_posees_joueur3.get(i)==(int)territoire_attaque&&une_fois==true) {
    						armees_posees_joueur3.remove(i);
    						une_fois=false;
    				}
    			}
    					
    					une_fois=true;
            			for(int i=0; i<armees_posees_joueur4.size();i++) {
            					
            					if((int)armees_posees_joueur4.get(i)==(int)territoire_attaque&&une_fois==true) {
            						armees_posees_joueur4.remove(i);
            						une_fois=false;
            				}
            			}
            			
            			une_fois=true;
            			for(int i=0; i<armees_posees_joueur5.size();i++) {
            					
            					if((int)armees_posees_joueur5.get(i)==(int)territoire_attaque&&une_fois==true) {
            						armees_posees_joueur5.remove(i);
            						une_fois=false;
            				}
            			}
            			
            			une_fois=true;
            			for(int i=0; i<armees_posees_joueur6.size();i++) {
            					
            					if((int)armees_posees_joueur6.get(i)==(int)territoire_attaque&&une_fois==true) {
            						armees_posees_joueur6.remove(i);
            						une_fois=false;
            				}
            			}
            					
            					
					
					territoire_attaque=0;
    				territoire_selectionne=0;
			
		}
		}
	}
		
		
		if((tour%6)==3){
			
			
			if(territoire_selectionne==0) {
			territoire_selectionne=territoire_selectionne_3( container);
			
			
			
			}
			
			
			if(territoire_selectionne!=0) {
				territoire_attaque=territoire_attaque_3_6(territoire_attaque, container, territoire_selectionne);
				
			}
			
			if(territoire_attaque!=0) {
				if(!armees_posees_joueur2.contains(territoire_attaque)&&!armees_posees_joueur1.contains(territoire_attaque)&&!armees_posees_joueur4.contains(territoire_attaque)&&!armees_posees_joueur5.contains(territoire_attaque)&&!armees_posees_joueur6.contains(territoire_attaque)) {
					
				int a=0;
				int b=0;
				int c=0;
				int d=0;
				int e=0;
				territoires_joueur3.add(territoire_attaque);
				for(int i=0; i<territoires_joueur1.size();i++) {
					if((int)territoires_joueur1.get(i)==(int)territoire_attaque) {
						a+=i;
						territoires_joueur1.remove(a);	
					}
				}
				
				for(int i=0; i<territoires_joueur2.size();i++) {
					if((int)territoires_joueur2.get(i)==(int)territoire_attaque) {
						b+=i;
						territoires_joueur2.remove(b);	
					}
				}
				

				for(int i=0; i<territoires_joueur4.size();i++) {
					if((int)territoires_joueur4.get(i)==(int)territoire_attaque) {
						c+=i;
						territoires_joueur4.remove(c);	
					}
				}
				
				
				for(int i=0; i<territoires_joueur5.size();i++) {
					if((int)territoires_joueur5.get(i)==(int)territoire_attaque) {
						d+=i;
						territoires_joueur5.remove(d);	
					}
				}
				
				for(int i=0; i<territoires_joueur6.size();i++) {
					if((int)territoires_joueur6.get(i)==(int)territoire_attaque) {
						e+=i;
						territoires_joueur5.remove(e);	
					}
				}
					
				boolean une_fois=true;	
				for(int i=0; i<armees_posees_joueur3.size();i++) {
    					
        					if((int)armees_posees_joueur3.get(i)==(int)territoire_selectionne&&une_fois==true) {
        						armees_posees_joueur3.remove(i);
        						une_fois=false;
        					}
    				}
				
				territoire_attaque=0;
				territoire_selectionne=0;
				}
				
				
				if(armees_posees_joueur2.contains(territoire_attaque)||armees_posees_joueur1.contains(territoire_attaque)||armees_posees_joueur4.contains(territoire_attaque)||armees_posees_joueur5.contains(territoire_attaque)||armees_posees_joueur6.contains(territoire_attaque)) {
					boolean une_fois=true;	
					for(int i=0; i<armees_posees_joueur3.size();i++) {
						
						if((int)armees_posees_joueur3.get(i)==(int)territoire_selectionne&&une_fois==true) {
							armees_posees_joueur3.remove(i);
							une_fois=false;
						}
				}
					une_fois=true;
					for(int i=0; i<armees_posees_joueur2.size();i++) {
						
						if((int)armees_posees_joueur2.get(i)==(int)territoire_attaque&&une_fois==true) {
							armees_posees_joueur2.remove(i);
							une_fois=false;
						}
					}
					une_fois=true;
	    			for(int i=0; i<armees_posees_joueur1.size();i++) {
	    					
	    					if((int)armees_posees_joueur1.get(i)==(int)territoire_attaque&&une_fois==true) {
	    						armees_posees_joueur1.remove(i);
	    						une_fois=false;
	    				}
	    			}
	    					
	    					une_fois=true;
	            			for(int i=0; i<armees_posees_joueur4.size();i++) {
	            					
	            					if((int)armees_posees_joueur4.get(i)==(int)territoire_attaque&&une_fois==true) {
	            						armees_posees_joueur4.remove(i);
	            						une_fois=false;
	            				}
	            			}
	            			
	            			une_fois=true;
	            			for(int i=0; i<armees_posees_joueur5.size();i++) {
	            					
	            					if((int)armees_posees_joueur5.get(i)==(int)territoire_attaque&&une_fois==true) {
	            						armees_posees_joueur5.remove(i);
	            						une_fois=false;
	            				}
	            			}
	            			
	            			une_fois=true;
	            			for(int i=0; i<armees_posees_joueur6.size();i++) {
	            					
	            					if((int)armees_posees_joueur6.get(i)==(int)territoire_attaque&&une_fois==true) {
	            						armees_posees_joueur6.remove(i);
	            						une_fois=false;
	            				}
	            					
	            					
						
						territoire_attaque=0;
	    				territoire_selectionne=0;
				}
			}
				
				
				
			}
		}
		
		
		
		
		
if((tour%6)==4){																					
			
			
			if(territoire_selectionne==0) {
			territoire_selectionne=territoire_selectionne_4(container);
			
			
			
			}
			
			
			if(territoire_selectionne!=0) {
				territoire_attaque=territoire_attaque_4_6(territoire_attaque, container, territoire_selectionne);
				
			}
			
			if(territoire_attaque!=0) {
				if(!armees_posees_joueur2.contains(territoire_attaque)&&!armees_posees_joueur3.contains(territoire_attaque)&&!armees_posees_joueur1.contains(territoire_attaque)&&!armees_posees_joueur5.contains(territoire_attaque)&&!armees_posees_joueur6.contains(territoire_attaque)) {
					
				int a=0;
				int b=0;
				int c=0;
				int d=0;
				int e=0;
				territoires_joueur4.add(territoire_attaque);
				for(int i=0; i<territoires_joueur1.size();i++) {
					if((int)territoires_joueur1.get(i)==(int)territoire_attaque) {
						a+=i;
						territoires_joueur1.remove(a);	
					}
				}
				
				for(int i=0; i<territoires_joueur2.size();i++) {
					if((int)territoires_joueur2.get(i)==(int)territoire_attaque) {
						b+=i;
						territoires_joueur2.remove(b);	
					}
				}
				

				for(int i=0; i<territoires_joueur3.size();i++) {
					if((int)territoires_joueur3.get(i)==(int)territoire_attaque) {
						c+=i;
						territoires_joueur3.remove(c);	
					}
				}
					
				for(int i=0; i<territoires_joueur5.size();i++) {
					if((int)territoires_joueur5.get(i)==(int)territoire_attaque) {
						d+=i;
						territoires_joueur5.remove(d);	
					}
				}
				
				for(int i=0; i<territoires_joueur6.size();i++) {
					if((int)territoires_joueur6.get(i)==(int)territoire_attaque) {
						e+=i;
						territoires_joueur6.remove(e);	
					}
				}
					
				boolean une_fois=true;	
				for(int i=0; i<armees_posees_joueur4.size();i++) {
    					
        					if((int)armees_posees_joueur4.get(i)==(int)territoire_selectionne&&une_fois==true) {
        						armees_posees_joueur4.remove(i);
        						une_fois=false;
        					}
    				}
				
				territoire_attaque=0;
				territoire_selectionne=0;
				}
				
				if(armees_posees_joueur2.contains(territoire_attaque)||armees_posees_joueur3.contains(territoire_attaque)||armees_posees_joueur1.contains(territoire_attaque)||armees_posees_joueur5.contains(territoire_attaque)||armees_posees_joueur6.contains(territoire_attaque)) {
					boolean une_fois=true;	
					for(int i=0; i<armees_posees_joueur4.size();i++) {
						
						if((int)armees_posees_joueur4.get(i)==(int)territoire_selectionne&&une_fois==true) {
							armees_posees_joueur4.remove(i);
							une_fois=false;
						}
				}
					une_fois=true;
					for(int i=0; i<armees_posees_joueur2.size();i++) {
						
						if((int)armees_posees_joueur2.get(i)==(int)territoire_attaque&&une_fois==true) {
							armees_posees_joueur2.remove(i);
							une_fois=false;
						}
					}
					une_fois=true;
	    			for(int i=0; i<armees_posees_joueur3.size();i++) {
	    					
	    					if((int)armees_posees_joueur3.get(i)==(int)territoire_attaque&&une_fois==true) {
	    						armees_posees_joueur3.remove(i);
	    						une_fois=false;
	    				}
	    			}
	    					
	    					une_fois=true;
	            			for(int i=0; i<armees_posees_joueur1.size();i++) {
	            					
	            					if((int)armees_posees_joueur1.get(i)==(int)territoire_attaque&&une_fois==true) {
	            						armees_posees_joueur1.remove(i);
	            						une_fois=false;
	            				}
	            			}
	            			
	            			une_fois=true;
	            			for(int i=0; i<armees_posees_joueur5.size();i++) {
	            					
	            					if((int)armees_posees_joueur5.get(i)==(int)territoire_attaque&&une_fois==true) {
	            						armees_posees_joueur5.remove(i);
	            						une_fois=false;
	            				}
	            			}
	            			
	            			une_fois=true;
	            			for(int i=0; i<armees_posees_joueur6.size();i++) {
	            					
	            					if((int)armees_posees_joueur6.get(i)==(int)territoire_attaque&&une_fois==true) {
	            						armees_posees_joueur6.remove(i);
	            						une_fois=false;
	            				}
	            					
	            					
	            			}
						territoire_attaque=0;
	    				territoire_selectionne=0;
				
			}
				
				
				
			}
		}



if((tour%6)==5){																					


if(territoire_selectionne==0) {
territoire_selectionne=territoire_selectionne_5(container);



}


if(territoire_selectionne!=0) {
	territoire_attaque=territoire_attaque_5_6(territoire_attaque, container, territoire_selectionne);
	
}

if(territoire_attaque!=0) {
	if(!armees_posees_joueur2.contains(territoire_attaque)&&!armees_posees_joueur3.contains(territoire_attaque)&&!armees_posees_joueur4.contains(territoire_attaque)&&!armees_posees_joueur1.contains(territoire_attaque)&&!armees_posees_joueur6.contains(territoire_attaque)) {
		
	int a=0;
	int b=0;
	int c=0;
	int d=0;
	int e=0;
	territoires_joueur5.add(territoire_attaque);
	for(int i=0; i<territoires_joueur1.size();i++) {
		if((int)territoires_joueur1.get(i)==(int)territoire_attaque) {
			a+=i;
			territoires_joueur1.remove(a);	
		}
	}
	
	for(int i=0; i<territoires_joueur2.size();i++) {
		if((int)territoires_joueur2.get(i)==(int)territoire_attaque) {
			b+=i;
			territoires_joueur2.remove(b);	
		}
	}
	

	for(int i=0; i<territoires_joueur3.size();i++) {
		if((int)territoires_joueur3.get(i)==(int)territoire_attaque) {
			c+=i;
			territoires_joueur3.remove(c);	
		}
	}
		
	for(int i=0; i<territoires_joueur4.size();i++) {
		if((int)territoires_joueur4.get(i)==(int)territoire_attaque) {
			d+=i;
			territoires_joueur4.remove(d);	
		}
	}
	for(int i=0; i<territoires_joueur6.size();i++) {
		if((int)territoires_joueur6.get(i)==(int)territoire_attaque) {
			e+=i;
			territoires_joueur6.remove(e);	
		}
	}
		
	boolean une_fois=true;	
	for(int i=0; i<armees_posees_joueur5.size();i++) {
			
				if((int)armees_posees_joueur5.get(i)==(int)territoire_selectionne&&une_fois==true) {
					armees_posees_joueur5.remove(i);
					une_fois=false;
				}
		}
	
	territoire_attaque=0;
	territoire_selectionne=0;
	}
	
	if(armees_posees_joueur2.contains(territoire_attaque)||armees_posees_joueur3.contains(territoire_attaque)||armees_posees_joueur4.contains(territoire_attaque)||armees_posees_joueur1.contains(territoire_attaque)||armees_posees_joueur6.contains(territoire_attaque)) {
		boolean une_fois=true;	
		for(int i=0; i<armees_posees_joueur5.size();i++) {
			
			if((int)armees_posees_joueur5.get(i)==(int)territoire_selectionne&&une_fois==true) {
				armees_posees_joueur5.remove(i);
				une_fois=false;
			}
	}
		une_fois=true;
		for(int i=0; i<armees_posees_joueur2.size();i++) {
			
			if((int)armees_posees_joueur2.get(i)==(int)territoire_attaque&&une_fois==true) {
				armees_posees_joueur2.remove(i);
				une_fois=false;
			}
		}
		une_fois=true;
		for(int i=0; i<armees_posees_joueur3.size();i++) {
				
				if((int)armees_posees_joueur3.get(i)==(int)territoire_attaque&&une_fois==true) {
					armees_posees_joueur3.remove(i);
					une_fois=false;
			}
		}
				
				une_fois=true;
    			for(int i=0; i<armees_posees_joueur4.size();i++) {
    					
    					if((int)armees_posees_joueur4.get(i)==(int)territoire_attaque&&une_fois==true) {
    						armees_posees_joueur4.remove(i);
    						une_fois=false;
    				}
    			}
    			
    			une_fois=true;
    			for(int i=0; i<armees_posees_joueur1.size();i++) {
    					
    					if((int)armees_posees_joueur1.get(i)==(int)territoire_attaque&&une_fois==true) {
    						armees_posees_joueur1.remove(i);
    						une_fois=false;
    				}
    			}
    			
    			une_fois=true;
    			for(int i=0; i<armees_posees_joueur6.size();i++) {
    					
    					if((int)armees_posees_joueur6.get(i)==(int)territoire_attaque&&une_fois==true) {
    						armees_posees_joueur6.remove(i);
    						une_fois=false;
    				}
    			}
    					
    					
			
			territoire_attaque=0;
			territoire_selectionne=0;
	
}
	
	
	
}
}



if((tour%6)==0){																					


if(territoire_selectionne==0) {
territoire_selectionne=territoire_selectionne_6(container);



}


if(territoire_selectionne!=0) {
	territoire_attaque=territoire_attaque_6_6(territoire_attaque, container, territoire_selectionne);
	
}

if(territoire_attaque!=0) {
	if(!armees_posees_joueur2.contains(territoire_attaque)&&!armees_posees_joueur3.contains(territoire_attaque)&&!armees_posees_joueur4.contains(territoire_attaque)&&!armees_posees_joueur5.contains(territoire_attaque)&&!armees_posees_joueur1.contains(territoire_attaque)) {
		
	int a=0;
	int b=0;
	int c=0;
	int d=0;
	int e=0;
	territoires_joueur6.add(territoire_attaque);
	for(int i=0; i<territoires_joueur1.size();i++) {
		if((int)territoires_joueur1.get(i)==(int)territoire_attaque) {
			a+=i;
			territoires_joueur1.remove(a);	
		}
	}
	
	for(int i=0; i<territoires_joueur2.size();i++) {
		if((int)territoires_joueur2.get(i)==(int)territoire_attaque) {
			b+=i;
			territoires_joueur2.remove(b);	
		}
	}
	

	for(int i=0; i<territoires_joueur3.size();i++) {
		if((int)territoires_joueur3.get(i)==(int)territoire_attaque) {
			c+=i;
			territoires_joueur3.remove(c);	
		}
	}
		
	for(int i=0; i<territoires_joueur4.size();i++) {
		if((int)territoires_joueur4.get(i)==(int)territoire_attaque) {
			d+=i;
			territoires_joueur4.remove(d);	
		}
	}
	for(int i=0; i<territoires_joueur5.size();i++) {
		if((int)territoires_joueur5.get(i)==(int)territoire_attaque) {
			e+=i;
			territoires_joueur5.remove(e);	
		}
	}
		
	boolean une_fois=true;	
	for(int i=0; i<armees_posees_joueur6.size();i++) {
			
				if((int)armees_posees_joueur6.get(i)==(int)territoire_selectionne&&une_fois==true) {
					armees_posees_joueur6.remove(i);
					une_fois=false;
				}
		}
	
	territoire_attaque=0;
	territoire_selectionne=0;
	}
	
	if(armees_posees_joueur2.contains(territoire_attaque)||armees_posees_joueur3.contains(territoire_attaque)||armees_posees_joueur4.contains(territoire_attaque)||armees_posees_joueur5.contains(territoire_attaque)||armees_posees_joueur1.contains(territoire_attaque)) {
		boolean une_fois=true;	
		for(int i=0; i<armees_posees_joueur6.size();i++) {
			
			if((int)armees_posees_joueur6.get(i)==(int)territoire_selectionne&&une_fois==true) {
				armees_posees_joueur6.remove(i);
				une_fois=false;
			}
	}
		une_fois=true;
		for(int i=0; i<armees_posees_joueur2.size();i++) {
			
			if((int)armees_posees_joueur2.get(i)==(int)territoire_attaque&&une_fois==true) {
				armees_posees_joueur2.remove(i);
				une_fois=false;
			}
		}
		une_fois=true;
		for(int i=0; i<armees_posees_joueur3.size();i++) {
				
				if((int)armees_posees_joueur3.get(i)==(int)territoire_attaque&&une_fois==true) {
					armees_posees_joueur3.remove(i);
					une_fois=false;
			}
		}
				
				une_fois=true;
    			for(int i=0; i<armees_posees_joueur4.size();i++) {
    					
    					if((int)armees_posees_joueur4.get(i)==(int)territoire_attaque&&une_fois==true) {
    						armees_posees_joueur4.remove(i);
    						une_fois=false;
    				}
    			}
    			
    			une_fois=true;
    			for(int i=0; i<armees_posees_joueur5.size();i++) {
    					
    					if((int)armees_posees_joueur5.get(i)==(int)territoire_attaque&&une_fois==true) {
    						armees_posees_joueur5.remove(i);
    						une_fois=false;
    				}
    			}
    			
    			une_fois=true;
    			for(int i=0; i<armees_posees_joueur1.size();i++) {
    					
    					if((int)armees_posees_joueur1.get(i)==(int)territoire_attaque&&une_fois==true) {
    						armees_posees_joueur1.remove(i);
    						une_fois=false;
    				}
    					
    			}
			
			territoire_attaque=0;
			territoire_selectionne=0;
	
}
	
	
	
}
}
		
		Affichage=true;
		
		if(container.getInput().isKeyPressed(Input.KEY_ENTER)) {
			tour+=1;
			w=1;
			v=1;
			x=1;
			y=1;
			z=1;
			une_fois_1=true;
			
		}
			
				

	
	
		
		}
    	
    	
  
    	
    	
    	
    	}
    
    		
    
    
    
    
    
    
    public int territoire_selectionne_1( GameContainer container) {
    	if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&territoires_joueur1.contains(e+1)&&armees_posees_joueur1.contains(e+1)){
				return e+1;
		
		  }
    	
    }
	
    }
		return territoire_selectionne;
    }
    
    
    
    
    
    public int territoire_selectionne_2( GameContainer container) {
    	if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&territoires_joueur2.contains(e+1)&&armees_posees_joueur2.contains(e+1)){
				return e+1;
		
		  }
    	
    }
	
    }
		return territoire_selectionne;
    }
    
    
    
    public int territoire_selectionne_3( GameContainer container) {
    	if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&territoires_joueur3.contains(e+1)&&armees_posees_joueur3.contains(e+1)){
				return e+1;
		
		  }
    	
    }
	
    }
		return territoire_selectionne;
    }
    
    
    
    public int territoire_selectionne_4( GameContainer container) {
    	if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&territoires_joueur4.contains(e+1)&&armees_posees_joueur4.contains(e+1)){
				return e+1;
		
		  }
    	
    }
	
    }
		return territoire_selectionne;
    }
    
    
    
    public int territoire_selectionne_5( GameContainer container) {
    	if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&territoires_joueur5.contains(e+1)&&armees_posees_joueur5.contains(e+1)){
				return e+1;
		
		  }
    	
    }
	
    }
		return territoire_selectionne;
    }
    
    
    
    public int territoire_selectionne_6( GameContainer container) {
    	if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&territoires_joueur6.contains(e+1)&&armees_posees_joueur6.contains(e+1)){
				return e+1;
		
		  }
    	
    }
	
    }
		return territoire_selectionne;
    }
    
    
    
    
    public int territoire_attaque_1(int territoire_attaque, GameContainer container, int territoire_selectionne) {
    	if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&territoires_joueur2.contains(e+1)){
					for(int i=0; i<Tableau_terri_alentour[territoire_selectionne-1].length;i++) {
						if(Tableau_terri_alentour[territoire_selectionne-1][i]==e) {
									return e+1;
						}
					}
					
		
		  }
    	
    }
	
    }
		return territoire_attaque;
    }
    
    
    
    public int territoire_attaque_1_3(int territoire_attaque, GameContainer container, int territoire_selectionne) {
    	if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&(territoires_joueur2.contains(e+1)||territoires_joueur3.contains(e+1))){
					for(int i=0; i<Tableau_terri_alentour[territoire_selectionne-1].length;i++) {
						if(Tableau_terri_alentour[territoire_selectionne-1][i]==e) {
									return e+1;
						}
					}
					
		
		  }
    	
    }
	
    }
		return territoire_attaque;
    }
    
    public int territoire_attaque_1_4(int territoire_attaque, GameContainer container, int territoire_selectionne) {
    	if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&(territoires_joueur2.contains(e+1)||territoires_joueur3.contains(e+1)||territoires_joueur4.contains(e+1))){
					for(int i=0; i<Tableau_terri_alentour[territoire_selectionne-1].length;i++) {
						if(Tableau_terri_alentour[territoire_selectionne-1][i]==e) {
									return e+1;
						}
					}
					
		
		  }
    	
    }
	
    }
		return territoire_attaque;
    }
    
    
    public int territoire_attaque_1_5(int territoire_attaque, GameContainer container, int territoire_selectionne) {
    	if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&(territoires_joueur2.contains(e+1)||territoires_joueur3.contains(e+1)||territoires_joueur4.contains(e+1)||territoires_joueur5.contains(e+1))){
					for(int i=0; i<Tableau_terri_alentour[territoire_selectionne-1].length;i++) {
						if(Tableau_terri_alentour[territoire_selectionne-1][i]==e) {
									return e+1;
						}
					}
					
		
		  }
    	
    }
	
    }
		return territoire_attaque;
    }
    
    
    public int territoire_attaque_1_6(int territoire_attaque, GameContainer container, int territoire_selectionne) {
    	if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&(territoires_joueur2.contains(e+1)||territoires_joueur3.contains(e+1)||territoires_joueur4.contains(e+1)||territoires_joueur5.contains(e+1)||territoires_joueur6.contains(e+1))){
					for(int i=0; i<Tableau_terri_alentour[territoire_selectionne-1].length;i++) {
						if(Tableau_terri_alentour[territoire_selectionne-1][i]==e) {
									return e+1;
						}
					}
					
		
		  }
    	
    }
	
    }
		return territoire_attaque;
    }
    
    
    public int territoire_attaque_2(int territoire_attaque, GameContainer container, int territoire_selectionne) {
    	if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&territoires_joueur1.contains(e+1)){
					for(int i=0; i<Tableau_terri_alentour[territoire_selectionne-1].length;i++) {
						if(Tableau_terri_alentour[territoire_selectionne-1][i]==e) {
									return e+1;
						}
					}
					
		
		  }
    	
    }
	
    }
		return territoire_attaque;
    }
    
    
    
    public int territoire_attaque_2_3(int territoire_attaque, GameContainer container, int territoire_selectionne) {
    	if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&(territoires_joueur1.contains(e+1)||territoires_joueur3.contains(e+1))){
					for(int i=0; i<Tableau_terri_alentour[territoire_selectionne-1].length;i++) {
						if(Tableau_terri_alentour[territoire_selectionne-1][i]==e) {
									return e+1;
						}
					}
					
		
		  }
    	
    }
	
    }
		return territoire_attaque;
    }
    
    
    
    
    public int territoire_attaque_2_4(int territoire_attaque, GameContainer container, int territoire_selectionne) {
    	if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&(territoires_joueur1.contains(e+1)||territoires_joueur3.contains(e+1)||territoires_joueur4.contains(e+1))){
					for(int i=0; i<Tableau_terri_alentour[territoire_selectionne-1].length;i++) {
						if(Tableau_terri_alentour[territoire_selectionne-1][i]==e) {
									return e+1;
						}
					}
					
		
		  }
    	
    }
	
    }
		return territoire_attaque;
    }
    
    
    public int territoire_attaque_2_5(int territoire_attaque, GameContainer container, int territoire_selectionne) {
    	if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&(territoires_joueur1.contains(e+1)||territoires_joueur3.contains(e+1)||territoires_joueur4.contains(e+1)||territoires_joueur5.contains(e+1))){
					for(int i=0; i<Tableau_terri_alentour[territoire_selectionne-1].length;i++) {
						if(Tableau_terri_alentour[territoire_selectionne-1][i]==e) {
									return e+1;
						}
					}
					
		
		  }
    	
    }
	
    }
		return territoire_attaque;
    }
    
    
    public int territoire_attaque_2_6(int territoire_attaque, GameContainer container, int territoire_selectionne) {
    	if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&(territoires_joueur1.contains(e+1)||territoires_joueur3.contains(e+1)||territoires_joueur4.contains(e+1)||territoires_joueur5.contains(e+1)||territoires_joueur6.contains(e+1))){
					for(int i=0; i<Tableau_terri_alentour[territoire_selectionne-1].length;i++) {
						if(Tableau_terri_alentour[territoire_selectionne-1][i]==e) {
									return e+1;
						}
					}
					
		
		  }
    	
    }
	
    }
		return territoire_attaque;
    }
    
    
    
    
    public int territoire_attaque_3(int territoire_attaque, GameContainer container, int territoire_selectionne) {
    	if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&(territoires_joueur1.contains(e+1)||territoires_joueur2.contains(e+1))){
					for(int i=0; i<Tableau_terri_alentour[territoire_selectionne-1].length;i++) {
						if(Tableau_terri_alentour[territoire_selectionne-1][i]==e) {
									return e+1;
						}
					}
					
		
		  }
    	
    }
	
    }
		return territoire_attaque;
    }
    
    public int territoire_attaque_3_4(int territoire_attaque, GameContainer container, int territoire_selectionne) {
    	if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&(territoires_joueur1.contains(e+1)||territoires_joueur2.contains(e+1)||territoires_joueur4.contains(e+1))){
					for(int i=0; i<Tableau_terri_alentour[territoire_selectionne-1].length;i++) {
						if(Tableau_terri_alentour[territoire_selectionne-1][i]==e) {
									return e+1;
						}
					}
					
		
		  }
    	
    }
	
    }
		return territoire_attaque;
    }
    
    
    public int territoire_attaque_3_5(int territoire_attaque, GameContainer container, int territoire_selectionne) {
    	if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&(territoires_joueur1.contains(e+1)||territoires_joueur2.contains(e+1)||territoires_joueur4.contains(e+1)||territoires_joueur5.contains(e+1))){
					for(int i=0; i<Tableau_terri_alentour[territoire_selectionne-1].length;i++) {
						if(Tableau_terri_alentour[territoire_selectionne-1][i]==e) {
									return e+1;
						}
					}
					
		
		  }
    	
    }
	
    }
		return territoire_attaque;
    }
    
    
    public int territoire_attaque_3_6(int territoire_attaque, GameContainer container, int territoire_selectionne) {
    	if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&(territoires_joueur1.contains(e+1)||territoires_joueur2.contains(e+1)||territoires_joueur4.contains(e+1)||territoires_joueur5.contains(e+1)||territoires_joueur6.contains(e+1))){
					for(int i=0; i<Tableau_terri_alentour[territoire_selectionne-1].length;i++) {
						if(Tableau_terri_alentour[territoire_selectionne-1][i]==e) {
									return e+1;
						}
					}
					
		
		  }
    	
    }
	
    }
		return territoire_attaque;
    }
    
    public int territoire_attaque_4(int territoire_attaque, GameContainer container, int territoire_selectionne) {
    	if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&(territoires_joueur1.contains(e+1)||territoires_joueur2.contains(e+1)||territoires_joueur3.contains(e+1))){
					for(int i=0; i<Tableau_terri_alentour[territoire_selectionne-1].length;i++) {
						if(Tableau_terri_alentour[territoire_selectionne-1][i]==e) {
									return e+1;
						}
					}
					
		
		  }
    	
    }
	
    }
		return territoire_attaque;
    }
    
    
    public int territoire_attaque_4_5(int territoire_attaque, GameContainer container, int territoire_selectionne) {
    	if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&(territoires_joueur1.contains(e+1)||territoires_joueur2.contains(e+1)||territoires_joueur3.contains(e+1)||territoires_joueur5.contains(e+1))){
					for(int i=0; i<Tableau_terri_alentour[territoire_selectionne-1].length;i++) {
						if(Tableau_terri_alentour[territoire_selectionne-1][i]==e) {
									return e+1;
						}
					}
					
		
		  }
    	
    }
	
    }
		return territoire_attaque;
    }
    
    
    public int territoire_attaque_4_6(int territoire_attaque, GameContainer container, int territoire_selectionne) {
    	if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&(territoires_joueur1.contains(e+1)||territoires_joueur2.contains(e+1)||territoires_joueur3.contains(e+1)||territoires_joueur5.contains(e+1)||territoires_joueur6.contains(e+1))){
					for(int i=0; i<Tableau_terri_alentour[territoire_selectionne-1].length;i++) {
						if(Tableau_terri_alentour[territoire_selectionne-1][i]==e) {
									return e+1;
						}
					}
					
		
		  }
    	
    }
	
    }
		return territoire_attaque;
    }
    
    
    
    public int territoire_attaque_5_5(int territoire_attaque, GameContainer container, int territoire_selectionne) {
    	if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&(territoires_joueur1.contains(e+1)||territoires_joueur2.contains(e+1)||territoires_joueur3.contains(e+1)||territoires_joueur4.contains(e+1))){
					for(int i=0; i<Tableau_terri_alentour[territoire_selectionne-1].length;i++) {
						if(Tableau_terri_alentour[territoire_selectionne-1][i]==e) {
									return e+1;
						}
					}
					
		
		  }
    	
    }
	
    }
		return territoire_attaque;
    }
    
    
    
    public int territoire_attaque_5_6(int territoire_attaque, GameContainer container, int territoire_selectionne) {
    	if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&(territoires_joueur1.contains(e+1)||territoires_joueur2.contains(e+1)||territoires_joueur3.contains(e+1)||territoires_joueur4.contains(e+1)||territoires_joueur6.contains(e+1))){
					for(int i=0; i<Tableau_terri_alentour[territoire_selectionne-1].length;i++) {
						if(Tableau_terri_alentour[territoire_selectionne-1][i]==e) {
									return e+1;
						}
					}
					
		
		  }
    	
    }
	
    }
		return territoire_attaque;
    }
    
    
    public int territoire_attaque_6_6(int territoire_attaque, GameContainer container, int territoire_selectionne) {
    	if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&(territoires_joueur1.contains(e+1)||territoires_joueur2.contains(e+1)||territoires_joueur3.contains(e+1)||territoires_joueur4.contains(e+1)||territoires_joueur5.contains(e+1))){
					for(int i=0; i<Tableau_terri_alentour[territoire_selectionne-1].length;i++) {
						if(Tableau_terri_alentour[territoire_selectionne-1][i]==e) {
									return e+1;
						}
					}
					
		
		  }
    	
    }
	
    }
		return territoire_attaque;
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
    
   
 
    
    
    
    public  int affichage_1(Graphics g, int a, GameContainer container, ArrayList Armee_posees_joueur1) {
    	
    	if(a!=0) {
    		if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
    			for(int e=1; e <42; e++) {
    				if(posMouseX>Tableau_terr_x_debut[e]&&
    				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
    				posMouseY<Tableau_terr_y_fin[e]&&territoires_joueur1.contains(e+1)){
    					Armee_posees_joueur1.add(e+1);
    			  a=a-1;
    		
    		  }
    			}
    		}
    		g.setColor(Color.black);
    	   g.drawString("Joueur 1 placez vos renforts sur vos territoires", 500, 180);
    	   g.drawString("Il vous reste "+a+" renforts à placer", 555, 195);
    	   
    	   return a;
    	}
    	


    	else{
    		return 0;
    	}
    	
    }

    
 public  int affichage_2(Graphics g, int a, GameContainer container, ArrayList Armee_posees_joueur2) {
    	
    	if(a!=0) {
    		if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
    			for(int e=1; e <42; e++) {
    				if(posMouseX>Tableau_terr_x_debut[e]&&
    				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
    				posMouseY<Tableau_terr_y_fin[e]&&territoires_joueur2.contains(e+1)){
    					Armee_posees_joueur2.add(e+1);
    			  a=a-1;
    		
    		  }
    			}
    		}
    		g.setColor(Color.black);
    	   g.drawString("Joueur 2 placez vos renforts sur vos territoires", 500, 180);
    	   g.drawString("Il vous reste "+a+" renforts à placer", 555, 195);
    	   
    	   return a;
    	}
    	


    	else{
    		return 0;
    	}
    	
    }

 
 
 public  int affichage_3(Graphics g, int a, GameContainer container, ArrayList Armee_posees_joueur2) {
 	
 	if(a!=0) {
 		if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
 			for(int e=1; e <42; e++) {
 				if(posMouseX>Tableau_terr_x_debut[e]&&
 				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
 				posMouseY<Tableau_terr_y_fin[e]&&territoires_joueur3.contains(e+1)){
 					Armee_posees_joueur2.add(e+1);
 			  a=a-1;
 		
 		  }
 			}
 		}
 		g.setColor(Color.black);
 	   g.drawString("Joueur 3 placez vos renforts sur vos territoires", 500, 180);
 	   g.drawString("Il vous reste "+a+" renforts à placer", 555, 195);
 	   
 	   return a;
 	}
 	


 	else{
 		return 0;
 	}
 	
 }

 
 
 
 
 public  int affichage_4(Graphics g, int a, GameContainer container, ArrayList Armee_posees_joueur2) {
	 	
	 	if(a!=0) {
	 		if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
	 			for(int e=1; e <42; e++) {
	 				if(posMouseX>Tableau_terr_x_debut[e]&&
	 				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
	 				posMouseY<Tableau_terr_y_fin[e]&&territoires_joueur4.contains(e+1)){
	 					Armee_posees_joueur2.add(e+1);
	 			  a=a-1;
	 		
	 		  }
	 			}
	 		}
	 		g.setColor(Color.black);
	 	   g.drawString("Joueur 4 placez vos renforts sur vos territoires", 500, 180);
	 	   g.drawString("Il vous reste "+a+" renforts à placer", 555, 195);
	 	   
	 	   return a;
	 	}
	 	


	 	else{
	 		return 0;
	 	}
	 	
	 }

 
 
 
 public  int affichage_5(Graphics g, int a, GameContainer container, ArrayList Armee_posees_joueur2) {
	 	
	 	if(a!=0) {
	 		if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
	 			for(int e=1; e <42; e++) {
	 				if(posMouseX>Tableau_terr_x_debut[e]&&
	 				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
	 				posMouseY<Tableau_terr_y_fin[e]&&territoires_joueur5.contains(e+1)){
	 					Armee_posees_joueur2.add(e+1);
	 			  a=a-1;
	 		
	 		  }
	 			}
	 		}
	 		g.setColor(Color.black);
	 	   g.drawString("Joueur 5 placez vos renforts sur vos territoires", 500, 180);
	 	   g.drawString("Il vous reste "+a+" renforts à placer", 555, 195);
	 	   
	 	   return a;
	 	}
	 	


	 	else{
	 		return 0;
	 	}
	 	
	 }
 
 
 public  int affichage_6(Graphics g, int a, GameContainer container, ArrayList Armee_posees_joueur2) {
	 	
	 	if(a!=0) {
	 		if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
	 			for(int e=1; e <42; e++) {
	 				if(posMouseX>Tableau_terr_x_debut[e]&&
	 				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
	 				posMouseY<Tableau_terr_y_fin[e]&&territoires_joueur6.contains(e+1)){
	 					Armee_posees_joueur2.add(e+1);
	 			  a=a-1;
	 		
	 		  }
	 			}
	 		}
	 		g.setColor(Color.black);
	 	   g.drawString("Joueur 6 placez vos renforts sur vos territoires", 500, 180);
	 	   g.drawString("Il vous reste "+a+" renforts à placer", 555, 195);
	 	   
	 	   return a;
	 	}
	 	


	 	else{
	 		return 0;
	 	}
	 	
	 }
    
    public void render_armees_placees_joueur1(Graphics g, ArrayList armees_posees_joueur1) {

    	Map<Integer,Integer> map_1 = new HashMap<>();
    	for(int i = 0 ; i < armees_posees_joueur1.size() ; i++){
    	 // Si l'element existe deja, on remplace la valeur
    	 if(map_1.containsKey(armees_posees_joueur1.get(i))){
    	  map_1.replace((Integer) armees_posees_joueur1.get(i),map_1.get(armees_posees_joueur1.get(i))+1);
    	 }
    	 // Sinon on l'ajoute
    	 else{
    	  map_1.put((Integer)armees_posees_joueur1.get(i),1);
    	 }
    	}
    	
    	for(Integer key : map_1.keySet()){	
    		
    		
    		 g.setColor(Color.black);
    		 g.drawString( Integer.toString(map_1.get(key)+1),Tableau_terr_x_debut[key-1], Tableau_terr_y_debut[key-1]);
    		}
    	


    	
    }



   

    
    public int renforts(ArrayList territoires_joueur1) {
    	int w=0;
		for(int i=0; i<territoires_joueur1.size(); i++) {
			w=w+1;	
			
		}
		w=w/3;
		
		if(territoires_joueur1.contains(1)&&territoires_joueur1.contains(2)&&territoires_joueur1.contains(3)&&territoires_joueur1.contains(4)&&
				territoires_joueur1.contains(5)&&territoires_joueur1.contains(6)&&territoires_joueur1.contains(7)) {
			w=w+3;
		}
		
		if(territoires_joueur1.contains(8)&&territoires_joueur1.contains(9)&&territoires_joueur1.contains(10)&&territoires_joueur1.contains(11)&&
				territoires_joueur1.contains(12)&&territoires_joueur1.contains(13)&&territoires_joueur1.contains(14)&&territoires_joueur1.contains(15)&&territoires_joueur1.contains(16)) {
			w=w+4;
		}
		
		
		if(territoires_joueur1.contains(17)&&territoires_joueur1.contains(18)&&territoires_joueur1.contains(19)&&territoires_joueur1.contains(20)&&
				territoires_joueur1.contains(21)&&territoires_joueur1.contains(22)) {
			w=w+3;
		}
		
		if(territoires_joueur1.contains(23)&&territoires_joueur1.contains(24)&&territoires_joueur1.contains(25)&&territoires_joueur1.contains(26)) {
			w=w+2;
		}
		
		if(territoires_joueur1.contains(27)&&territoires_joueur1.contains(28)&&territoires_joueur1.contains(29)&&territoires_joueur1.contains(30)) {
			w=w+2;
		}
		
		if(territoires_joueur1.contains(31)&&territoires_joueur1.contains(32)&&territoires_joueur1.contains(33)&&territoires_joueur1.contains(34)&&
				territoires_joueur1.contains(35)&&territoires_joueur1.contains(36)&&territoires_joueur1.contains(37)&&territoires_joueur1.contains(38)
				&&territoires_joueur1.contains(39)&&territoires_joueur1.contains(40)&&territoires_joueur1.contains(41)&&territoires_joueur1.contains(42)) {
			w=w+6;
		}
		
		return w;
		
    }
   
    
}
    