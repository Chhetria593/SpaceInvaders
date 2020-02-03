import java.awt.Color;
import java.awt.Graphics;

public class Hero 
{	
	int x=300;
	int y=525;
	public void draw (Graphics g)
	{
	g.setColor(Color.BLACK);
	g.fillRect(x,y,40,40);
	}
	public void moveL()
	{
		x=x-20;
		if (x<0||x<-1)
		{
			x=10;
		}
	}
	public void moveR()
	{
		x=x+20;
		if (x>550||x>551)
		{
			x=550;
		}
	}
{
	
}
}
