import java.awt.Color;
import java.awt.Graphics;

public class SIScore extends GameSkeleton {
	static final long serialVersionUID = 0;
	int Score;

public void start()
{
	Score = 0;
}

public void tick()
{
	
}

public void draw(Graphics g)
{
	//Score HUD
	g.setColor(Color.pink);
	g.fillRect(475, 40, 105, 20);
	g.setColor(Color.black);
	g.drawString("Score: " + Score, 480, 55);
}

	
	//repaint();


public static void main(String args[])
{
	new SpaceInvaders().playGame();
}
}
