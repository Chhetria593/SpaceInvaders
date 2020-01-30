import java.awt.Graphics;

public class Hero 
{	
	int x=300;
	int y=400;
	public void draw (Graphics g)
	{
	g.setColor(Color.BLACK);
	g.fillRect(x,y,40,40);
	}
	public void moveL()
	{
		x=x-20;
	}
	public void move()
	{
		x=x+20;
	}
{
	
}
}
