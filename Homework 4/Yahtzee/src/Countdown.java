import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


class Countdown implements Runnable {
    private JLabel _label;
    private int rollLand;
    Random rnd = new Random();
    ImageIcon[] icons = new ImageIcon[6];
    String[] srcs = {"/resources/one.png", "/resources/two.png", "/resources/three.png", "/resources/four.png", "/resources/five.png", "/resources/six.png"};
    
    public Countdown(JLabel label) {
        _label = label;

        for (int i=0; i<6; i++) {
			URL iu = getClass().getResource(srcs[i]);
			Image dice1 = Toolkit.getDefaultToolkit().getImage(iu);
			dice1 = dice1.getScaledInstance(100,100, Image.SCALE_DEFAULT);
			icons[i] = new ImageIcon(dice1);
        }
}
    
    public int getValue() {return rollLand;}
    int roll = rnd.nextInt(40)+40;
    public void run() {
    	
        for (int i=roll; i>1; i--) {
          rollLand = rnd.nextInt(6);
          _label.setIcon(icons[rollLand]);
          //_label.setText(String.format("%d", rollLand));
          try {
          Thread.sleep(100);
          } catch (Exception e){;}
        }
        
    }
  
}
     /*     _label.setText(String.format("%d", i));
          try {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex) {;}
        }
       _label.setText("Blast off"); */
   







