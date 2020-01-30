import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class GameSkeleton extends JFrame implements KeyListener 
	{
	static final long serialVersionUID = 0;
	Image im;
	int xCoordinate = 300;
	int yCoordinate = 300;
	int squareSize = 10;
	int ticWait=100;
	
	GameSkeleton () 
		{
		super("Game Skeleton");
		JPanel p = new JPanel ();
		this.setSize(600, 600);
		this.setVisible(true);
		p.requestFocus();
		addKeyListener(this);
		addWindowListener(new WindowAdapter()
		{                                                                                      
		public void windowClosing(WindowEvent e) 
			{
			System.exit(0);
			}
		});      
		}
                    
                                        
	public void start()                 
		{
		System.out.println("Plese creat your own statr() method");                         
		}
	public void makeProgramWait(int milliseconds)                          
		{
		try                         
			{
			Thread.sleep(milliseconds);                         
			}
		catch (Exception e)                   
			{
			System.out.println("An error in sleep process.");                       
			}
		}
	
	
	
	public void playSpaceInvaders() 
		{
		start();
		while (true)
			{
			tick();
			makeProgramWait(ticWait);
			repaint();
			}
		}
		public void tick() 
		{
		}
		
	
	public void paint(Graphics g) 
		{
		if (im == null)
			{
			im = createImage (this.getWidth(), this.getHeight());
			}
			Graphics tempG = im.getGraphics();
			paintScreen (tempG);
			g.drawImage(im, 0, 0, this);
		}
	public void paintScreen(Graphics g)		
		{
		draw(g);
		}
	public void draw (Graphics g) 
		{
		System.out.println("executing drawscreen from GameSkeleton. drawScreen method not found in game.");
		}
	
	public void keyPressed(KeyEvent e) 
		{
		int inKey = e.getKeyCode();
		whichKey(inKey);
		repaint();
		}
	
	public void whichKey(int inKey) 
		{
		
		System.out.println("plese creat a whichKey method in yours game.");
		
		}
	public void keyReleased(KeyEvent e) 
		{
		}
		
		
	public void keyTyped(KeyEvent e) 
		{
			
		}
	public static Image redImage(String imageName) 
		{
		Image image = Toolkit.getDefaultToolkit().getImage(imageName);
		MediaTracker imageTracker = new MediaTracker (new JPanel());
		imageTracker.addImage(image, 0);
		try
			{
			imageTracker.waitForID(0);
			}
		catch(InterruptedException e)
			{
		return null;
			}
			return image;
		}
	}