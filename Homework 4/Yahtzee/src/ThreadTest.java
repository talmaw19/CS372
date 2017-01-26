import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class ThreadTest extends JFrame {
    
    Countdown[] cs = new Countdown[5];

	public ThreadTest() {
    	 
    	setSize(800, 300);
       	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout());
        
       
        JButton btnStart = new JButton("Start");
        btnStart.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) 
        	{
        		if(btnStart.getText()=="Start"){
        			btnStart.setText("Stop");
        			int sum = 0;
        			for (int m =0; m <5; m++)
        			{
        				sum += cs[m].getValue();
        			}
        			//JPanel panel = new JPanel();
        			//panel.setLayout();
        		}
//            	
        	}
        });
        getContentPane().add(btnStart);
        
        
       
        
        for (int i=0; i<5; i++) {
            JLabel l = new JLabel();
            cs[i] = new Countdown(l);
            getContentPane().add(l);
        }

        this.setVisible(true);

        Thread[] ts = new Thread[5];
        for (int i=0; i<5; i++) {
            ts[i] = new Thread(cs[i]);
            ts[i].start();
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException ex) {;}
        }
    }
    
	public static void main(String[] args) {
        ThreadTest t = new ThreadTest();
       
    	
    }

    public static void getinfo(String[] args) {
        System.out.printf("Active count: %d\n", Thread.activeCount());
        System.out.printf("Thread ID: %d\n", Thread.currentThread().getId());
        System.out.printf("Thread Name: %s\n", Thread.currentThread().getName());
        System.out.printf("Thread Priority: %d\n", Thread.currentThread().getPriority());
        System.out.printf("Thread State: %s\n", Thread.currentThread().getState().toString());
        System.out.printf("Thread Alive? %b\n", Thread.currentThread().isAlive());

        try {
            System.out.printf("Taking a nap... ");
            Thread.sleep(1000);
            System.out.printf(" and now I'm awake\n");
        }
        catch (InterruptedException ex) {
            System.out.printf(" and I was interrupted\n");
        }
    }
}
