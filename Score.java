import java.awt.Color;
import java.awt.Graphics;

public class Score {
	int Score;

public void start()
{
	Score = 0;
}

public void draw(Graphics g)
{
	//Score HUD
	g.setColor(Color.pink);
	g.fillRect(475, 40, 105, 20);
	g.setColor(Color.black);
	g.drawString("Score: " + Score, 480, 55);
}
}
