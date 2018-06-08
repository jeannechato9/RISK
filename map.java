package lib.natives;

import org.newdawn.slick.BasicGame;



import org.newdawn.slick.Color;
import org.newdawn.slick.Font;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class map extends BasicGameState {
	
	public map(MainScreenGameState menu) {
		
		this.menu=menu;
	}
	
	
	public static final int ID = 2;
	private GameContainer container;
	private Image image;
	private int posMouseY;
	private int posMouseX;
	private int nbre_joueurs;
	public String mouse;
	private map map;			//menu.getNbre_joueurs()
	private Territoire territoire=new Territoire();
	private Initialisation initialisation;
	MainScreenGameState menu;
	private Armee armee=new Armee(menu, nbre_joueurs);
	private Integer[] territoiresjoueur1;
	private Integer[] territoiresjoueur2;
	private Integer[] territoiresjoueur3;
	private Integer[] territoiresjoueur4;
	private Integer[] territoiresjoueur5;
	private Integer[] territoiresjoueur6;
	private int[] armees_posees_joueur1=new int[21];
	private int[] armees_posees_joueur2=new int[21];
	private int[] armees_posees_joueur3=new int[21];
	private int[] armees_posees_joueur4=new int[21];
	private int[] armees_posees_joueur5=new int[21];
	private int[] armees_posees_joueur6=new int[21];
	private ArrayList nbre_armees_joueur2= new ArrayList();
	private ArrayList nbre_armees_joueur3= new ArrayList();
	private ArrayList nbre_armees_joueur4= new ArrayList();
	private ArrayList nbre_armees_joueur5= new ArrayList();
	private ArrayList nbre_armees_joueur6= new ArrayList();
	private Deplacements deplacements=new Deplacements(nbre_joueurs, territoiresjoueur1, territoiresjoueur2, territoiresjoueur3, territoiresjoueur4, territoiresjoueur5, 
			territoiresjoueur6, armees_posees_joueur1, armees_posees_joueur2, armees_posees_joueur3, armees_posees_joueur4, armees_posees_joueur5, armees_posees_joueur6);
	

	 Boolean une_fois=true;
	 Boolean une_fois_2=true;
	
	
	@Override
	public void init(GameContainer container, StateBasedGame game) throws SlickException {
		
		this.container = container;
		this.territoire.init(container);

		
	}
	
	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
		
		this.image = new Image("Risk_game_map.png");
		g.setColor( new Color( 173, 244, 251 ) );
		g.fillRect( 0,  0, 2000, 2000);
		g.drawImage( this.image, 100, 200);
		g.setColor(Color.white);
		g.setColor(Color.black);
		posMouseY = container.getInput().getMouseY();
		posMouseX= container.getInput().getMouseX();
		mouse = "x: " + posMouseX + " y: " + posMouseY;
		g.drawString(mouse, 50, 50);
		this.image = new Image("titre.png");
		g.drawImage( this.image, 600, 0);
		
		
        this.armee.render(container, g);

		this.territoire.render(container, g);
		int a=3;
		update(container, game, a);
		boolean fin=armee.getfin();
		if(fin) {
			this.deplacements.render(container, g);
			
		}
		
		
		
		
		

	}

	@Override
	public void update(GameContainer arg0, StateBasedGame game, int arg1) throws SlickException {
		this.menu.update(arg0, game, arg1);
		nbre_joueurs=menu.getNbre_joueurs();
		if(une_fois) {
		initialisation= new Initialisation(menu, nbre_joueurs);
		
		this.initialisation.init();

		}
		if(une_fois) {
			armee=new Armee(menu, nbre_joueurs);
			this.armee.init(container);
			territoiresjoueur1=armee.getTerritoirejoueur1();
			territoiresjoueur2=armee.getTerritoirejoueur2();
			territoiresjoueur3=armee.getTerritoirejoueur3();
			territoiresjoueur4=armee.getTerritoirejoueur4();
			territoiresjoueur5=armee.getTerritoirejoueur5();
			territoiresjoueur6=armee.getTerritoirejoueur6();
			if(nbre_joueurs==2) {
			armees_posees_joueur1=armee.getarmees_posees_joueur1_2();
			armees_posees_joueur2=armee.getarmees_posees_joueur2_2();
			}
			if(nbre_joueurs==3) {
				armees_posees_joueur1=armee.getarmees_posees_joueur1_3();
				armees_posees_joueur2=armee.getarmees_posees_joueur2_3();
				armees_posees_joueur3=armee.getarmees_posees_joueur3_3();
			}
			if(nbre_joueurs==4) {
				armees_posees_joueur1=armee.getarmees_posees_joueur1_4();
				armees_posees_joueur2=armee.getarmees_posees_joueur2_4();
				armees_posees_joueur3=armee.getarmees_posees_joueur3_4();
				armees_posees_joueur4=armee.getarmees_posees_joueur4_4();
			}
			if(nbre_joueurs==5) {
				armees_posees_joueur1=armee.getarmees_posees_joueur1_5();
				armees_posees_joueur2=armee.getarmees_posees_joueur2_5();
				armees_posees_joueur3=armee.getarmees_posees_joueur3_5();
				armees_posees_joueur4=armee.getarmees_posees_joueur4_5();
				armees_posees_joueur5=armee.getarmees_posees_joueur5_5();
			}
			if(nbre_joueurs==6) {
				armees_posees_joueur1=armee.getarmees_posees_joueur1_6();
				armees_posees_joueur2=armee.getarmees_posees_joueur2_6();
				armees_posees_joueur3=armee.getarmees_posees_joueur3_6();
				armees_posees_joueur4=armee.getarmees_posees_joueur4_6();
				armees_posees_joueur5=armee.getarmees_posees_joueur5_6();
				armees_posees_joueur6=armee.getarmees_posees_joueur6_6();
			}
			nbre_armees_joueur2=armee.getnbre_armees_joueur2();
			nbre_armees_joueur3=armee.getnbre_armees_joueur3();
			nbre_armees_joueur4=armee.getnbre_armees_joueur4();
			nbre_armees_joueur5=armee.getnbre_armees_joueur5();
			nbre_armees_joueur6=armee.getnbre_armees_joueur6();

			}
		
				une_fois=false;
		boolean fin=armee.getfin();
		if(fin) {	
			if(une_fois_2) {
			deplacements= new Deplacements(nbre_joueurs, territoiresjoueur1, territoiresjoueur2, territoiresjoueur3, territoiresjoueur4, territoiresjoueur5, territoiresjoueur6,
					armees_posees_joueur1, armees_posees_joueur2, armees_posees_joueur3, armees_posees_joueur4, armees_posees_joueur5, armees_posees_joueur6);
		

				this.deplacements.init(container);
			}
			une_fois_2=false;
			this.deplacements.update(container, 0);
		}
		
	
		

		this.territoire.update(container);
		this.initialisation.update();
	}
	
	
	

	@Override
	public void keyReleased(int key, char c) {
		if (Input.KEY_ESCAPE == key) {
			container.exit();
		}
	}
	
	public int getID() {
	    return ID;
	  }
	
	public void setnbre_joueurs(int nbre_joueurs) {
		this.nbre_joueurs=nbre_joueurs;
	}
	
	public int getnbre_joueurs() {
		return nbre_joueurs;
	}
}
