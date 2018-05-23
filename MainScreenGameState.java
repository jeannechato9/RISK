package lib.natives;


import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.gui.AbstractComponent;
import org.newdawn.slick.gui.ComponentListener;
import org.newdawn.slick.gui.MouseOverArea;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

class MainScreenGameState extends BasicGameState implements ComponentListener {
	
	public static final int ID = 1;
	private GameContainer container;
	  private StateBasedGame game;
	  private Image image;
	  private int posMouseY;
	  private int posMouseX;
	  private MouseOverArea Button_2;
	  private MouseOverArea Button_3;
	  private MouseOverArea Button_4;
	  private MouseOverArea Button_5;
	  private MouseOverArea Button_6;
	  private int nbre_joueurs;
	



	  @Override
	  public void init(GameContainer container, StateBasedGame game) throws SlickException {
	    this.container = container;
	    this.image = new Image("bouton.png");
	    Button_2 = new MouseOverArea(container,image, 620, 450, this);
	    Button_3 = new MouseOverArea(container,image, 660,450, this);
	    Button_4 = new MouseOverArea(container,image, 700,450, this);
	    Button_5 = new MouseOverArea(container,image, 740,450, this);
	    Button_6 = new MouseOverArea(container,image, 780,450, this);
	  }

	  public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
			
			
			g.setColor( new Color( 173, 244, 251 ) );
			g.fillRect( 0,  0, 2000, 2000);
			g.setColor(Color.red);
			g.fillRect( 620,  300, 200, 40);

			g.setColor(Color.black);
			g.drawString("Commencer le jeu", 640, 310);
			this.image = new Image("menu.png");
			g.drawImage( this.image, 500, 50);

			g.drawString("Indiquer nombre de joueurs", 600, 410);

			posMouseY = container.getInput().getMouseY();
			posMouseX= container.getInput().getMouseX();
			
			Button_2.render(container, g);
			g.drawString("2", Button_2.getX()+13, Button_2.getY() + 3);
			
			Button_3.render(container, g);
			g.drawString("3", Button_3.getX()+13, Button_3.getY() + 3);
			
			Button_4.render(container, g);
			g.drawString("4", Button_4.getX()+13, Button_4.getY() + 3);
			
			Button_5.render(container, g);
			g.drawString("5", Button_5.getX()+13, Button_5.getY() + 3);
			
			Button_6.render(container, g);
			g.drawString("6", Button_6.getX()+13, Button_6.getY() + 3);
			
			

		}

	  @Override
	  public void update(GameContainer a, StateBasedGame game, int delta) throws SlickException {
		  if (container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON) && posMouseX<820 && posMouseX>620 && posMouseY<340 && posMouseY>300) {
				game.enterState(map.ID,new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
			}
		  
	  }

	  @Override
	  public void componentActivated(AbstractComponent source) {
	    if (source == Button_2) {
	    	nbre_joueurs=2;
	    } 
	    if (source == Button_3) {
	    	nbre_joueurs=3;
	    	System.out.println(getNbre_joueurs());
	    } 
	    if (source == Button_4) {
	    	nbre_joueurs=4;			
	    } 
	    if (source == Button_5) {
	    	nbre_joueurs=5;			
	    } 
	    else if (source == Button_6) {
	    	nbre_joueurs=6;				
	    } 
	  }
	  
	  public int getNbre_joueurs()
      {
        return nbre_joueurs;
      } 
	  
	  public void setNbre_joueurs(int nbre_joueurs)
      {
        this.nbre_joueurs = nbre_joueurs;
      }
	  
	  public int getID() {
		    return ID;
		  }

	  
	}
