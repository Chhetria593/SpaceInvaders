//Arun Chhetri
import java.awt.*;
import java.awt.event.KeyEvent;

public class SpaceInvaders extends GameSkeleton 
	{
	//declaring variables
	static final long serialVersionUID = 0;
	int xCoordinate;
	int squareSize;
	//hero variable
	Hero hero =new Hero(300);
	//Enemies variable
	Enemy[] enemy = new Enemy[20];
	//hero bullet
	HeroBullet hb = new HeroBullet();
	
	public void start()
		{ 
		xCoordinate = 300;
		squareSize = 10;
		
		enemy[0] = new Enemy(100,50);
		enemy[1]= new Enemy(200,50);
		enemy[2] = new Enemy(300,50);
		enemy[3] = new Enemy(400,50);
		enemy[4] = new Enemy(500,50);
		enemy[5] = new Enemy(100,100);
		enemy[6] = new Enemy(200,100);
		enemy[7] = new Enemy(300,100);
		enemy[8] = new Enemy(400,100);
		enemy[9] = new Enemy(500,100);
		enemy[10] = new Enemy(100,150);
		enemy[11]= new Enemy(200,150);
		enemy[12] = new Enemy(300,150);
		enemy[13] = new Enemy(400,150);
		enemy[14] = new Enemy(500,150);
		enemy[15] = new Enemy(100,200);
		enemy[16] = new Enemy(200,200);
		enemy[17] = new Enemy(300,200);
		enemy[18] = new Enemy(400,200);
		enemy[19] = new Enemy(500,200);
		}
	public void tick ()
		{ 
		squareSize = squareSize + 1;
		squareSize = squareSize + 1;
		boolean switchb = false;
		for(int u=0;u<20;u=u+1)
			{
			boolean b = enemy[u].move();
			if(b==true)
				{
				switchb=true;
				System.out.println("Arun");
				}
			}
		if(switchb==true) 
			{
			for(int x=0;x<20;x=x+1) 
				{
				enemy[x].switchDirection();
				}
			}
		hb.move();
		Rectangle br=hb.getRectangle();
		for (int x=0;x<20;x=x+1)
			{
			enemy[x].collision(br);
			}
		
		}
	public void draw(Graphics g) 
		{ 
		g.setColor(Color.white);
		g.fillRect(0,  0,  this.getWidth(), this.getHeight());
	
		g.setColor(Color.yellow);
		g.fillRect(0, 0, 600, 600);
		//Draws enemies
		for(int s=0;s<20;s=s+1)
			{
			enemy[s].draw(g);
			}
		//Draws hero
		hero.draw(g);
		//HeroBullet
		hb.draw(g);
		}
	public void whichKey(int inKey)
		{ 
		if (KeyEvent.VK_Q == inKey)
			{	
			System.exit(0);
			}
		else if (KeyEvent.VK_S == inKey)
			{
			start();
			}
		else if (KeyEvent.VK_LEFT == inKey)
			{
			xCoordinate = xCoordinate -10;
			squareSize = squareSize -1;
			}
		else if (KeyEvent.VK_RIGHT == inKey)
			{
			xCoordinate = xCoordinate + 10;
			squareSize = squareSize + 1;
			}
		hero.whichkey(inKey);
		hb.whichKey(inKey,hero.X);
		repaint();
		}

	public static void main(String args [])
		{ 	
		new SpaceInvaders() .playSpaceInvaders();
		}
	}
