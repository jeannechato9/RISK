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
	
	public StateGame() {
	    super("RISK");
	    
	  }
	  
	  
	  public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
		  
	  }
	  
	  public void init(GameContainer container, StateBasedGame game) throws SlickException {
		  this.container = container;
	  }
	  
	  public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
	  }
 
	  @Override
	  public void initStatesList(GameContainer container) throws SlickException {
		  	addState(new MainScreenGameState());
		  	addState(new map()); 
		  }
	  

	
	}