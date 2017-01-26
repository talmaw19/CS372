import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class levl extends JComponent implements ActionListener, MouseListener {

	JLabel [] labels = new JLabel [3];
	static JFrame frame;
	JLabel lab;
	Thread thread;
	static Image imageField;
	Image imagePlay;
	Image imageQuit;
	Image imageInstructions;
	int ballinhat;
	
	public levl(Image Field){
		this.imageField = Field;
		frame = new JFrame();
		frame.setSize(1012,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		Random rand= new Random();
		ballinhat=rand.nextInt(3);
		Level[] lvl = new Level [3];
		JPanel c = new JPanel(new FlowLayout());
		frame.add(c);
		for (int i=0; i<3; i++)
		{
			labels[i] = new JLabel();
			labels[i].addMouseListener(this);
			lvl[i]= new Level(labels[i]);
			c.add(labels[i], BorderLayout.CENTER);
		} this.setVisible(true);
			
		
		Thread[] t = new Thread[3];
		for (int i = 0; i <3; i++)
		{
			t[i] = new Thread(lvl[i]);
//            t[i].start();
//            try {
//                Thread.sleep(1);
//            }
//            catch (InterruptedException ex) {;}
			
		}
		JPanel p;
		p = new JPanel(new FlowLayout());
		JLabel text = new JLabel (" \nPICK A HAT\n");
		//text.setSize(200,200);
		text.setFont(new Font("Serif", Font.BOLD,150));
		frame.getContentPane().add(text, BorderLayout.NORTH);
		p_1= new JPanel();
		JButton Play = new JButton("PLAY");
		Play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(p);
				if (Play.getText().equals("PLAY"))
				{
					for(int i = 0; i < 3; i++)
					{
						t[i].start();
					}
				}
					//displaynewframe();
			}
		});
		p_1.add(Play);
		
		JButton Quit = new JButton("QUIT");
		Quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				leave();
			}
		});
		p_1.add(Quit);
		
		JButton Instructions = new JButton("INSTRUCTIONS");
		Instructions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(p);
				repaint();
				displayRules();
				
			}
		});
		p_1.add(Instructions);
		frame.getContentPane().add(p_1, BorderLayout.SOUTH);
		
		frame.setVisible(true);
	}
	
	public void paint(Graphics g)
	{
	Graphics2D g2 =(Graphics2D)g;
	g2.drawImage(imageField, 0,0,this);
	
	}
	public static void main(String[] args)
	{
		levl l = new levl(imageField);
	
	}	
	private static JPanel p_1;
	

	private static void displayRules()
	{
		JOptionPane.showMessageDialog(frame, String.format(" Main goal is to find the ball at first "
				+ "you will be shown the ball\n" 
				+ "in the beginning and you are asked to click when you are ready\n" 
				+ "all you have to do is keep track of where the ball is located. \n " 
				+ " you get three strikes and you are out! GOOD LUCK AND DONT LOSE! :) "));
	
		
	}
	
	private void displaynewframe(){
		JFrame frame = new JFrame("Playing mode" );
	    frame.setSize( 1012,861 );
	    frame.setLocationRelativeTo( null );
	    frame.setVisible( true ); 
	}
	public void leave(){
		System.exit(0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		JLabel lab = (JLabel)e.getSource();
		
		boolean correct = false;
		if (lab == labels[0]&& ballinhat == 0)
		{
			correct = true;
		}
		else if (lab == labels[1] && ballinhat == 1)
		{
			correct = true;
		}
		else if (lab== labels[2]&& ballinhat ==2)
		{
			correct =true;
		}
		JOptionPane.showMessageDialog(frame, String.format("YOU GOT IT  %s ", correct? "RIGHT :)" : "WRRRRONG :/ :( "));
				
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub 
	}
}