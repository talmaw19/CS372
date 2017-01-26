import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
class Hat2 {
public static final int width = 0;
private HatImage1 hat1 = null;
private HatImage2 hat2 =null;
private HatImage3 hat3 = null;
public int x;
public int y;
public static final int height =100;
public Hat2(int x, int y, int width, int height) {
// TODO Auto-generated constructor stub
}
	}
class HatImage1 extends ImageIcon
{
private Image img = null;
private Hat2 hat1 = null;
public HatImage1(Image img, int x, int y)
{
    //ImageIcon icon = new ImageIcon(img);
    super(img);
this.hat1 = new Hat2(x,y,200,200);
}
public Hat2 getHat()
{
     return this.hat1;
}
public Image getImage1()
{
     return this.img;
}
public void move(int x, int y)
{   // this.hat1.setBound(x,y,hat1.width, hat1.height);
} 

public void draw (Graphics2D g2)
{
     g2.drawImage(this.img, 0, 0, 256, 220, null);
}
}

class HatImage2 extends ImageIcon
{
private Image img2 = null;
private Hat2 hat2 = null;
public HatImage2(Image img2, int x, int y)
{ super(img2);
this.hat2 = new Hat2(x,y,200,200);
	}
public Hat2 getHat()
{
    return this.hat2;
}
public Image getImage2()
{
    return this.img2;
}
public void draw (Graphics2D g2)
{
    g2.drawImage(this.img2, this.hat2.x, this.hat2.y, this.hat2.width, this.hat2.height,null); 
}

}
class HatImage3 extends ImageIcon 
{
private Image img3 = null;
private Hat2 hat3 = null;
public HatImage3(Image img3, int x, int y)
{
	super(img3);
	
	this.hat3 = new Hat2(x,y,200,200);
}
public Hat2 getHat3()
{
    return this.hat3;
}
public Image getImage3()
{
    return this.img3;
}
public void draw (Graphics2D g2)
{
    g2.drawImage(this.img3, this.hat3.x, this.hat3.y, this.hat3.width, this.hat3.height,null);
}
}
