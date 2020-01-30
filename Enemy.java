import java.awt.Color;
import java.awt.Graphics;

public class Enemy {

	
		int enemyX=300;  
		int enemyY=50;
		
		
		public void draw(Graphics g)
			{
			g.setColor(Color.white);
			g.fillRect(enemyX, enemyY, 25, 25);
			}

}


