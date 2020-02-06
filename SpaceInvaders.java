//SpaceInvader Original
import java.awt.*;
import java.awt.event.KeyEvent;



public class SpaceInvaders extends GameSkeleton 
	{
	//declaring variables
	static final long serialVersionUID = 0;
	int xCoordinate;
	int squareSize;
	static int count=0;
	
	Hero hero = new Hero();
	Score score = new Score();
	Enemy enemy = new Enemy();
	Barrier barrier = new Barrier(); 
	
	public void start()
		{ 
		xCoordinate = 300;
		squareSize = 10;
		
		
		}
	public void tick ()
		{ 
		squareSize = squareSize + 1;
		if(count>=0)
			{
			count++;
			System.out.println(count);
			}
		if(count>=10)
			{
			count=0;
			System.out.println(count);
			}

	public void draw(Graphics g) 
		{ 
		g.setColor(Color.black);
		g.fillRect(0,  0,  this.getWidth(), this.getHeight());
	
		g.setColor(Color.black);
		g.fillRect(0, 0, 600, 600);
		
		hero.draw(g);
		enemy.draw(g);
		score.draw(g);
		barrier.draw(g);
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
			
			hero.moveL();
			}
		if (KeyEvent.VK_RIGHT == inKey)
			{
			xCoordinate = xCoordinate + 10;
			squareSize = squareSize + 1;
			
			hero.moveR();
			}
	
		}

	public static void main(String args [])
		{ 	
		new SpaceInvaders() .playSpaceInvaders();
		}
	}
