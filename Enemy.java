import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;

import javax.swing.JPanel;


	public class Enemy implements ImageObserver 
		{
		Image im;
		Image Sprite1;
		Image Sprite2;
		int enemyX=0;  
		int enemyY=0;
		int dx = 10;
		Enemy(int a,int b)
			{
			enemyX=a;
			enemyY=b;
			Sprite1 = readImage("Sprite1.png");
			Sprite2 = readImage("Sprite2.png");
			
			}
		public static Image readImage(String imageName)
			{
			Image image = Toolkit.getDefaultToolkit().getImage(imageName);
			MediaTracker imageTracker = new MediaTracker(new JPanel());
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
		public void draw(Graphics g)
			{
			if(SpaceInvaders.count==0||SpaceInvaders.count==1||SpaceInvaders.count==2||SpaceInvaders.count==3||SpaceInvaders.count==4||SpaceInvaders.count==5)
				{
				g.drawImage(Sprite1, enemyX, enemyY, null);
				}
			else if (SpaceInvaders.count==6||SpaceInvaders.count==7||SpaceInvaders.count==8||SpaceInvaders.count==9||SpaceInvaders.count==10)
				{
				g.drawImage(Sprite2,enemyX,enemyY,null);
				}
			}
		public boolean move()
			{
			enemyX=enemyX+dx;
			if(enemyX>550||enemyX<25)
				{
				return true;
				}
			return false;
				}
				public void collision(Rectangle br)
				{
				Rectangle r=new Rectangle(enemyX,enemyY,25,25);
				boolean b=r.intersects(br);
				if(b==true) 
					{
					enemyY=600;
					HeroBullet.y=-600;
					}
		}
	public void switchDirection()
		{
		if(dx==10)
			{
			dx=-10;
			enemyY=enemyY+10;
			}
		else 
			{
			dx=10;
			enemyY=enemyY+10;
			}
		}
	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) 
		{
		return false;
		}
	}
