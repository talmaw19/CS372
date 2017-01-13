import javax.imageio.IIOException;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class Main extends JComponent implements MouseMotionListener, MouseListener{
	/**
	 * 
	 */
	int clicked =0;
	private static final int minNumber = 1110000;
	private static int lastNumber = minNumber;
	private int number;
	private static String shapeName;
	/**
	 * @wbp.parser.constructor
	 */
	public Main(String sName)
	{
		
		Choice choice = new Choice();
		choice.setBounds(26, 46, 28, 20);
		add(choice);
		shapeName =sName;
		number =lastNumber;
		lastNumber++;
		
	}
	public String getName() {return shapeName;}
	public Integer getIntNumber(){return number;}
	public String getNumber() { return String.format("%d-%04d", number / 10000, number % 10000); }
	
	
	
	Image imageCircle, imageRectangle, imageTriangle, imageSquare;

	public Main(Image cir, Image rec, Image tri, Image squ){
		imageCircle = cir;
		imageRectangle =rec;
		imageTriangle = tri;
		imageSquare = squ;
	}
	
	private static Map<Integer, Shape> sha = new HashMap<Integer, Shape>();
	
//	public Main(Image newSqu){
//		imageSquare = newSqu;
//	}
	// if the cirlce is click on it should display this
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		g2.drawImage(imageCircle,0,0, this);
		g2.drawImage(imageRectangle,100,100, this);
		g2.drawImage(imageTriangle,200,200, this);
		g2.drawImage(imageSquare, 300, 300, this);
	//	g2.drawImage(imageRectangle, imageX, imageY, this);

	}
	
	static int imageWidth = 60, imageHeight =60;
	public static void main(String[] args) throws IOException
	{
		
		String c = "/resources/Circle.png";
		String r = "/resources/Rectangle.png";
		String t = "/resources/Triangle.png";
		String s = "/resources/Square.png";
		
		Image imageCircle = Toolkit.getDefaultToolkit().getImage(Main.class.getResource(c));
		imageCircle = imageCircle.getScaledInstance(imageWidth,imageHeight, Image.SCALE_DEFAULT);
		Image imageRectangle = Toolkit.getDefaultToolkit().getImage(Main.class.getResource(r));
		imageRectangle = imageRectangle.getScaledInstance(100,90, Image.SCALE_DEFAULT);
		Image imageTriangle= Toolkit.getDefaultToolkit().getImage(Main.class.getResource(t));
		imageTriangle = imageTriangle.getScaledInstance(imageWidth,imageHeight, Image.SCALE_DEFAULT);
		Image imageSquare= Toolkit.getDefaultToolkit().getImage(Main.class.getResource(s));
		imageSquare = imageSquare.getScaledInstance(imageWidth,imageHeight, Image.SCALE_DEFAULT);
		
		JFrame frame = new JFrame("DragImage");
		frame.getContentPane().add(new Main(imageCircle, imageRectangle, imageTriangle, imageSquare));
		frame.setSize(900,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel p = new JPanel();
		JPanel p2 = new JPanel(new GridBagLayout());
		JButton b1 = new JButton("Show Information");
		JButton b2 = new JButton("Next");
		
		// arraging it up and down
		GridBagConstraints c1 = new GridBagConstraints();
		c1.insets = new Insets(10,10,10,10); // the spacings in between eachother
		c1.gridx = 0;
		c1.gridy= 1;
		p2.add(b1,c1);
		c1.gridx = 0;
		c1.gridy= 2;
		
		
		p2.setBackground(Color.magenta);
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "you have clicked");
				
			}
			
		});
		/* figure out a way to display the shapes.txt*/
	//	BufferedReader in = new BufferedReader(new FileReader("user.dir"));	
		
		//Scanner inFile1 = new Scanner(new File("shapes.txt")).useDelimiter(",\\s*");
	}
	//Scanner inFile1 = new Scanner (new File("shapes.txt")).useDelimiter("\\s* circle \\s*");
	

	
	public static String[] shapes = {"circle", "rectangle", "triangle", "square"};

	private static void typesOfShapes()
	{
		Random rnd = new Random();
		for (int i=0; i <shapes.length; i++)
		{
			Main sh =new Main(String.format("%s", shapeName, shapes[rnd.nextInt(shapes.length)]));
		}
	
	} 
	@Override
	public void mouseClicked(MouseEvent arg0) {/* TODO Auto-generated method stub	*/
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {/* TODO Auto-generated method stub	*/}

	@Override
	public void mouseExited(MouseEvent arg0) {/* TODO Auto-generated method stub	*/}

	@Override
	public void mousePressed(MouseEvent e) {/* TODO Auto-generated method stub	*/
		clicked =0;
		if()
			clicked =1;
		else if()
			clicked =2;
		else if()
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {/* TODO Auto-generated method stub	*/}

	@Override
	public void mouseDragged(MouseEvent arg0) {/* TODO Auto-generated method stub	*/}

	@Override
	public void mouseMoved(MouseEvent arg0) {/* TODO Auto-generated method stub	*/}
}
