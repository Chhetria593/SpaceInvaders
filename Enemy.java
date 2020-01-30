import java.awt.Color;
import java.awt.Graphics;

public class Enemy {
	
	int enemyX = 0;
	int enemyY = 0;

	Enemy(int a,int b)
		{
		enemyX=a;
		enemyY=b;
		}

		public void draw(Graphics g)
		{
		g.setColor(Color.white);
		g.fillRect(enemyX, enemyY, 25, 25);
		}
		
	}

