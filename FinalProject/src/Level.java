import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.text.html.ImageView;
import java.awt.Point;


public class Level extends Hat implements Runnable{
private JLabel  _label;
private static int level = 0;
private static final int userpl =1;
private static final int gameover = 2;
private static final int welcome=0;
private int lvl; 
private static ImageView bg;
private static final String[] img = new String[] {"resources/marinerhat.png", "resources/marinerhat2.png","resources/marinerhat3.png"};
private JLabel[] imgg = new JLabel[3];
	
	public Level(JLabel label)
	{ super(ball);
		this._label = label;
		
		//level = welcome;
	
	}
	public static void paint(Graphics g1)
	{

	}

public static void main(String[] args)
{ 
// Level l = new Level(1);
 /// come back to me please

//int choice = randChoice(1, 100);
}
public double win=0;
public int lose=0;
public void Winner()
{
        win++;
}
public void Loser()
{
        lose++;
}
private int bal;
String imageName =null;
 
public void showBall()
{

}
int hatSwitch = 10;
@Override
public void run() {
// TODO Auto-generated method stub
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	URL imgUrl = getClass().getResource(img[0]);
	Image i = toolkit.getImage(imgUrl); 

	ImageIcon icon= null;
	Random rnd = new Random();
	
	icon= new HatImage1(i,150,200);
	
	_label.setIcon(icon);
	int pos =0;
		if (pos==1)
		{
		imgg[0]= new JLabel(new HatImage1(i,150,200));
		
		}
		else if(pos ==2)
		{
		imgg[1]= new JLabel(new HatImage2(i,300,200));
		}
		else if(pos ==3)
		{
		imgg[2] =new JLabel(new HatImage3(i,450,200));
		}
	
for (int m = hatSwitch; m >1; m--)
	{
	// makes sure that the hatSwich moves through and switches the hats around switching thier position around 
	}
}
}