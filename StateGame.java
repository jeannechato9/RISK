package lib.natives;


import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

class StateGame extends StateBasedGame {
	private GameContainer container;
	MainScreenGameState menu=new MainScreenGameState();
	
	
	public StateGame() {
	    super("RISK");
	    
	  }
	
	  public void initStatesList(GameContainer container) throws SlickException {
			addState(menu);
		  	addState(new map(menu)); 
		  }
	  
	
	}