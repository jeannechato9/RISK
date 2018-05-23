package lib.natives;

import org.newdawn.slick.BasicGame;

import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Main {

	public static void main(String[] args) throws SlickException {
        new AppGameContainer(new StateGame(), 1450, 950, false).start();
    }

}
