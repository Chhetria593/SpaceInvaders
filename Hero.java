	import java.awt.Color;
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
			if (x==-1||x<5)
			{
				x=10;
			}
		}
		public void moveR()
		{
			x=x+20;
			if (x==601||x>550)
			{
				x=550;
			}
		}
	{
		
	}
	}
