package lib.natives;


import java.util.ArrayList;
import java.util.Arrays;

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

	private int[] Tableau_terr_y_debut=territoire.getTableau_terr_y_debut();

	private int[] Tableau_terr_x_fin=territoire.getTableau_terr_x_fin();

	private int[] Tableau_terr_y_fin=territoire.getTableau_terr_y_fin();
	private int[][] Tableau_terri_alentour=territoire.getTableau_terri_alentour();
	private boolean une_fois=true;
	private int territoire_selectionne;

	private int territoire_attaque;
	ArrayList territoires_joueur1 = new ArrayList();
	ArrayList territoires_joueur2 = new ArrayList();
	ArrayList territoires_joueur3 = new ArrayList();
	ArrayList territoires_joueur4 = new ArrayList();
	ArrayList territoires_joueur5 = new ArrayList();
	ArrayList territoires_joueur6 = new ArrayList();
	ArrayList Territoires= new ArrayList();

	public Deplacements( int nbre_joueurs, Integer [] territoiresjoueur1, Integer [] territoiresjoueur2, Integer [] territoiresjoueur3,
			Integer [] territoiresjoueur4, Integer [] territoiresjoueur5, Integer [] territoiresjoueur6) {
		
		this.nbre_joueurs=nbre_joueurs;
		this.territoiresjoueur1=territoiresjoueur1;
		this.territoiresjoueur2=territoiresjoueur2;
		this.territoiresjoueur3=territoiresjoueur3;
		this.territoiresjoueur4=territoiresjoueur4;
		this.territoiresjoueur5=territoiresjoueur5;
		this.territoiresjoueur6=territoiresjoueur6;
	}
	
	private Initialisation initialisatio=new Initialisation(menu, 2);
	
	private Integer [] territoiresjoueur1= new Integer[21];
 	private Integer [] territoiresjoueur2= new Integer[21];
 	private Integer [] territoiresjoueur3= new Integer[14];
 	private Integer [] territoiresjoueur4= new Integer[14];
 	private Integer [] territoiresjoueur5= new Integer[14];
 	private Integer [] territoiresjoueur6= new Integer[14];

	
	
	public void init(GameContainer container) throws SlickException {
		System.out.println(Arrays.toString(territoiresjoueur1));
		System.out.println(Arrays.toString(territoiresjoueur2));
		System.out.println(Arrays.toString(territoiresjoueur3));
		System.out.println(Arrays.toString(territoiresjoueur4));
		System.out.println(Arrays.toString(territoiresjoueur5));
		System.out.println(Arrays.toString(territoiresjoueur6));
		
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
		  
		
		

		System.out.println(Territoires);
		
			  
	}

    public void render(GameContainer container, Graphics g) throws SlickException {
    	this.image = new Image("canon.png");
		g.drawImage( this.image, 600, 0);
    	g.setColor(Color.black);
    	g.drawString("tour :"+tour, 700, 140);
    	
    	

    	if((tour%2)==1){
    		g.drawString("Joueur 1 à votre tour", 650, 155);
    	}
    	
    	
    	for(int i = 0; i < territoires_joueur1.size(); i++) {
    		for(int e=0; e<43; e++) {
			 if(territoires_joueur1.contains(e)) {	
				    render_pions(0, g, e);   
			 }
			 
			    
		  	}
    	}
    	

    	if((tour%2)==0){
    		g.drawString("Joueur 2 à votre tour", 650, 155);
    	}
    		for(int i = 0; i < territoires_joueur2.size(); i++) {
    		for(int e=0; e<43; e++) {
			 if(territoires_joueur2.contains(e)) {	
				    render_pions(1, g, e);   
			 }
			 
			    
		  	}
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    }
    
 

    public void update(GameContainer container, int delta) throws SlickException {

    	posMouseY = container.getInput().getMouseY();
		posMouseX= container.getInput().getMouseX();
    	if(nbre_joueurs==2) {
    		if((tour%2)==1){
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
    				int a=0;
    				territoires_joueur1.add(territoire_attaque);
    				for(int i=0; i<territoires_joueur2.size();i++) {
    					if((int)territoires_joueur2.get(i)==(int)territoire_attaque) {
    						a+=i;
    						territoires_joueur2.remove(a);	
    					}
    				}
    				
    				
    				
    				System.out.println(territoires_joueur1);
    				System.out.println("2:"+territoires_joueur2);
    				territoire_attaque=0;
    				territoire_selectionne=0;
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
    				int a=0;
    				territoires_joueur2.add(territoire_attaque);
    				for(int i=0; i<territoires_joueur1.size();i++) {
    					if((int)territoires_joueur1.get(i)==(int)territoire_attaque) {
    						a+=i;
    						territoires_joueur2.remove(a);	
    					}
    				
    				territoire_attaque=0;
    				territoire_selectionne=0;
    				}
    				
    			}
    			if(container.getInput().isMousePressed(Input.MOUSE_RIGHT_BUTTON)) {
					tour+=1;
				}
    			
    					
    				}
    		
    		
    		
    		
    		
    			
    			}
    	
    	}
    		
    public int territoire_selectionne_1( GameContainer container) {
    	if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			for(int e=1; e <42; e++) {
				if(posMouseX>Tableau_terr_x_debut[e]&&
				posMouseX<Tableau_terr_x_fin[e]&&posMouseY>Tableau_terr_y_debut[e]&&
				posMouseY<Tableau_terr_y_fin[e]&&territoires_joueur1.contains(e+1)){
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
				posMouseY<Tableau_terr_y_fin[e]&&territoires_joueur2.contains(e+1)){
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
    
   
  
    
    
}
    