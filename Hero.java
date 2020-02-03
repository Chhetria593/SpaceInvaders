
import java.awt.Color;
import java.awt.Graphics;

public class Hero 
{	
	int x=300;
	int y=525;
	public void draw (Graphics g)
	{
	g.setColor(Color.blue);
	g.fillRect(x,y,40,40);
	}
	public void moveL()
	{
		x=x-20;
	}
	public void moveR()
	{
		x=x+20;
	}
{
	
}
}



