import java.awt.Color;
import java.awt.Graphics;

public class Barrier {
	int barrierX=300;  
	
	
	
	public void draw(Graphics g)
		{
		g.setColor(Color.green);
		g.fillRect(barrierX, 400, 50, 25);
		}


}
