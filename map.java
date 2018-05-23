package lib.natives;

import org.newdawn.slick.BasicGame;


import org.newdawn.slick.Color;
import org.newdawn.slick.Font;

import java.awt.event.MouseEvent;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class map extends BasicGameState {
	
	public static final int ID = 2;
	private GameContainer container;
	private Image image;
	private int posMouseY;
	private int posMouseX;
	private boolean clic_gauche=false;
	public String mouse;
	private StateBasedGame game;
	private map map;
	private int nbre_joueurs=6;
	private Territoire territoire=new Territoire();
	private Initialisation initialisation= new Initialisation(map, nbre_joueurs);

	private Armee armee= new Armee(map);
	

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
        this.initialisation.render(container, g);

		this.territoire.render(container, g);
		this.armee.render(container, g);
		
		

	}

	
	@Override
	public void init(GameContainer container, StateBasedGame game) throws SlickException {
		this.container = container;

		this.initialisation.init();
		this.territoire.init(container);
		this.armee.init(container);
		
	}

	@Override
	public void update(GameContainer arg0, StateBasedGame game, int arg1) throws SlickException {
		this.initialisation.update();
		this.territoire.update(container);
		this.armee.update(container);
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

}
