//SpaceInvader Original
import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.text.html.parser.Entity;

public class SpaceInvaders extends GameSkeleton 
	{
	//declaring variables
	static final long serialVersionUID = 0;
	int xCoordinate;
	int squareSize;
	
	Hero hero = new Hero();
	Score score = new Score();
	Enemy enemy = new Enemy();
	public void start()
		{ 
		xCoordinate = 300;
		squareSize = 10;
		
		
		}
	public void tick ()
		{ 
		squareSize = squareSize + 1;
		
		
		}
	public void draw(Graphics g) 
		{ 
		g.setColor(Color.white);
		g.fillRect(0,  0,  this.getWidth(), this.getHeight());
	
		g.setColor(Color.yellow);
		g.fillRect(0, 0, 600, 600);
		
		hero.draw(g);
		}
	public void whichKey(int inKey)
		{ 
		if (KeyEvent.VK_Q == inKey)
			{	
			System.exit(0);
			}
		if (KeyEvent.VK_S == inKey)
			{
			start();
			}
		if (KeyEvent.VK_LEFT == inKey)
			{
			xCoordinate = xCoordinate -10;
			squareSize = squareSize -1;
			}
		if (KeyEvent.VK_RIGHT == inKey)
			{
			xCoordinate = xCoordinate + 10;
			squareSize = squareSize + 1;
			}
	
		}

	public static void main(String args [])
		{ 	
		new SpaceInvaders() .playSpaceInvaders();
		}
	}
