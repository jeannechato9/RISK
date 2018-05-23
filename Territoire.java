package lib.natives;

import org.newdawn.slick.GameContainer;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Territoire {

	private int posMouseY;
	private int posMouseX;

	private GameContainer container;
	private map map;
	private Graphics g;

	
	private int [] TableauTerritoires = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
			23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42};
	
	
	
	 public void update(GameContainer container) throws SlickException {
		 	posMouseY = container.getInput().getMouseY();
			posMouseX= container.getInput().getMouseX();
		
	  }
	  
	  public void init(GameContainer container) throws SlickException {

			
	  }
	  
	  public void render(GameContainer container, Graphics g) throws SlickException {
		 

	  }
	  
	  
	  public int[] getTableauTerritoires() {
		  return TableauTerritoires;
		 }
	  
}
