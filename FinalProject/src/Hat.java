import java.util.Random;

import javax.swing.*;

public class Hat {
public static final int height = 100;
static boolean ball;
public static final int width =100;
public static final int x = 0;
public static final int y = 0;
public Hat(boolean ball)
{
this.ball = ball;
}
public boolean hasBall()
{
return ball;
}
public void setBall(boolean ball){
this.ball = ball;
}

}

