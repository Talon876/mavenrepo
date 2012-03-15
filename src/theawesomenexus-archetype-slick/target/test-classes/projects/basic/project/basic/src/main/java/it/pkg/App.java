package it.pkg;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Game;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class App extends BasicGame
{
	Image background = null;
	Image ship = null;
	float x = 400;
	float y = 300;
	float scale = 1.0f;
	static boolean isDebug;
	
	public App()
	{
		super("basic - (v0.1-SNAPSHOT)");
	}

	public static void main(String[] args) throws SlickException
	{
		/*
		 * Checks to see if this hs been ran with -Ddebugging=true. If it has, it should expect
		 * to have the libraries in the correct place. If not, it sets the org.lwjgl.librarypath to the
		 * /natives/ directory.
		 */
		isDebug = Boolean.parseBoolean(System.getProperty("debugging"));
		if (!isDebug)
		{
			System.setProperty("org.lwjgl.librarypath", System.getProperty("user.dir") + "/natives/");
		}
		else
		{
			System.out.println("-Ddebugging=true has been set. Entering debug mode!");
		}

		AppGameContainer app = new AppGameContainer(new App());
		app.setDisplayMode(800, 600, false);
		app.start();
	}

	@Override
	public void init(GameContainer container) throws SlickException
	{
		background = new Image("images/background.jpg");
		ship = new Image("images/ship.png");
	}

	@Override
	public void update(GameContainer container, int delta) throws SlickException
	{
		Input input = container.getInput();

		if (input.isKeyDown(Input.KEY_A))
		{
			ship.rotate(-.2f * delta);
		}
		if (input.isKeyDown(Input.KEY_D))
		{
			ship.rotate(.2f * delta);
		}
		if (input.isKeyDown(Input.KEY_W))
		{
			float hip = .4f * delta;
			float rotation = ship.getRotation();
			x += hip * Math.sin(Math.toRadians(rotation));
			y -= hip * Math.cos(Math.toRadians(rotation));
		}
		if (input.isKeyDown(Input.KEY_2))
		{
			scale += (scale >= 5.0f) ? 0 : .1f;
			ship.setCenterOfRotation(ship.getWidth() / 2.0f * scale, ship.getHeight() / 2.0f * scale);
		}
		if (input.isKeyDown(Input.KEY_1))
		{
			scale -= (scale <= 1.0f) ? 0 : .1f;
			ship.setCenterOfRotation(ship.getWidth() / 2.0f * scale, ship.getHeight() / 2.0f * scale);
		}
	}

	public void render(GameContainer container, Graphics g) throws SlickException
	{
		background.draw(0, 0);
		ship.draw(x, y, scale);
	}
}
