/**
* The Java Application Development Homework Assignment 2 implements an application that 
* simply displays the city and everything within including the people, workers, and the jobs it holds. 
* 
*
* @author Tersa Motbaynor Almaw 
* @version 1.0 
* @since 1/5/2017
* 
*/ 

import java.util.Scanner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.io.InputStream;
import java.net.URL;
/**
*   this models a city which holds people, and buildings.
*
*/
public class City extends JComponent implements MouseMotionListener, MouseListener{


	int iTeacherX = 20;int iTeacherY = 10;
int iTeacher2X = 120;int iTeacher2Y= 10;
int iTeacher3X = 190;int iTeacher3Y= 10;
int iPoliceX = 230;int iPoliceY= 10;
int iPolice2X=290;int iPolice2Y=10;
int iKid1X = 340;int iKid1Y =10;// image kid x and y coordinates  
int iKid2X = 400; int iKid2Y= 10;
int drag =0;


Image imageCity, imageTeacher, imageTeacher2, imageTeacher3, imagePolice,imagePolice2, imageKid,imageKid2, imageSchool, imageCityHall;
/**
 * this calls the people in the array
 */
Person[] people = { new Teacher("Kenna", 26, 9856423, "Computer Science", 12), 
		new Teacher("Angel", 32, 5642369, "English", 9), 
		new Teacher("Sam", 29, 2565487, "Math", 11), 
		new Police("Jason", 54, 5698885, Police.Rank.Cheif), 
		new Police("Kim", 30, 4565656, Police.Rank.Sargent),
		new Kid("George", 16, 2226545, "Snickers"),
		new Kid("Emily",15, 1645545, "Kit Kat")};
/**
 * this calls the building in the array
 */	
Building[] building = { new CityHall ("EJ" , "12th Ave NE Bellevue" ), 
			new School (" Northeast High School", "Oakland Park 1st Ave, Chyrsler 300" )};


String teacher1 =people[0].getName();
String teacher2 =people[1].getName();
String teacher3 =people[2].getName();
String POfficer1 =people[3].getName();
String POfficer2 =people[4].getName();
String kid1 = people[5].getName();
String kid2 = people[6].getName();

CityHall cityH= (CityHall) building[0]; 
School skool = (School) building[1];
	
JFrame frame;
/**
*  the city constructor holds a @param of all the people in the city and buildings the city includes 
*/
public City(Image city, Image t , Image t2, Image t3, Image p, Image p2, Image k, Image k2, Image s, Image ch){
	imageCity = city;
	imageTeacher= t;
	imageTeacher2= t2;
	imageTeacher3= t3;
	imagePolice= p;
	imagePolice2= p2;
	imageKid=k;
	imageKid2=k2;
	imageSchool =s;
	imageCityHall =ch;
	addMouseMotionListener(this);
	addMouseListener(this);
//	setLayout(new GridLayout(1, 0, 0, 0));
}
/**
*  this 2nd constructor has a @param just for the image of jrSchool 
*/
public City(Image jrSchool)
{
	imageSchool = jrSchool;
}
/**
 *  this mousePressed method knows when the mouse button has been pressed on an object (picture) 
 *  it then locates the coordinates of x and y using the getX and getY functions
 *  
 *  @param MouseEvent e
 */
public void mousePressed(MouseEvent e)
{
	drag =0;
	 if (e.getX()>= iTeacherX && e.getX()<= iTeacherX+100 && e.getY() >= iTeacherY && e.getY() <= iTeacherY+100)
		drag = 1;
	else if (e.getX()>= iTeacher2X && e.getX()<= iTeacher2X+100 && e.getY() >= iTeacher2Y && e.getY() <= iTeacher2Y+100)
		drag = 2;
	else if (e.getX()>= iTeacher3X && e.getX()<= iTeacher3X+100 && e.getY() >= iTeacher3Y && e.getY() <= iTeacher3Y+100)
		drag = 3;
	else if (e.getX()>= iPoliceX && e.getX()<= iPoliceX+100 && e.getY() >= iPoliceY && e.getY() <= iPoliceY+100)
		drag = 4;
	else if (e.getX()>= iPolice2X && e.getX()<= iPolice2X+100 && e.getY() >= iPolice2Y && e.getY() <= iPolice2Y+100)
		drag = 5;
	else if (e.getX()>= iKid1X && e.getX()<= iKid1X+100 && e.getY() >= iKid1Y && e.getY() <= iKid1Y+100)
		drag = 6;
	else if (e.getX()>= iKid2X && e.getX()<= iKid2X+100 && e.getY() >= iKid2Y && e.getY() <= iKid2Y+100)
		drag = 7;
	
	
}
/**
*  this method has no return function but when the mouse button is pressed on an object (picture) and is dragged it will then 
*  the getX() and getY() gets the x and y coordinates  but doesn't @return the x and y coordinates 
*/
public void mouseDragged(MouseEvent e) {
	//  imageX = e.getX();
	 // imageY = e.getY();
	System.out.printf("%d, %d\n", e.getX(), e.getY());
	if (drag == 0)
	{
		 if (e.getX()>= iTeacherX && e.getX()<= iTeacherX+100 && e.getY() >= iTeacherY && e.getY() <= iTeacherY+100)
			 drag = 1;
		else if (e.getX()>= iTeacher2X && e.getX()<= iTeacher2X+60 && e.getY() >= iTeacher2Y && e.getY() <= iTeacher2Y+60)
			drag = 2;
		else if (e.getX()>= iTeacher3X && e.getX()<= iTeacher3X+60 && e.getY() >= iTeacher3Y && e.getY() <= iTeacher3Y+60)
			drag = 3;
		else if (e.getX()>= iPoliceX && e.getX()<= iPoliceX+60 && e.getY() >= iPoliceY && e.getY() <= iPoliceY+60)
			drag = 4;
		else if (e.getX()>= iPolice2X && e.getX()<= iPolice2X+60 && e.getY() >= iPolice2Y && e.getY() <= iPolice2Y+60)
			drag = 5;
		else if (e.getX()>= iKid1X && e.getX()<= iKid1X+60 && e.getY() >= iKid1Y && e.getY() <= iKid1Y+60)
			drag = 6;
		else if (e.getX()>= iKid2X && e.getX()<= iKid2X+60 && e.getY() >= iKid2Y && e.getY() <= iKid2Y+60)
			drag = 7;
	}
	System.out.printf("drag: %d\n", drag);
	if (drag == 1)
	{
		iTeacherX = e.getX();
		iTeacherY = e.getY();	
	}
	System.out.printf("drag: %d\n", drag);
	if (drag == 2)
	{
		iTeacher2X = e.getX();
		iTeacher2Y = e.getY();		
	}
	if (drag == 3)
	{
		iTeacher3X = e.getX();
		iTeacher3Y = e.getY();	
	}
	if (drag == 4)
	{
		iPoliceX = e.getX();
		iPoliceY = e.getY();
	}
	if (drag == 5)
	{ 
		iPolice2X = e.getX();
		iPolice2Y = e.getY();	
	}
	if (drag == 6)
	{
		iKid1X = e.getX();
		iKid1Y = e.getY();	
	}
	if (drag == 7)
	{
		iKid2X = e.getX();
		iKid2Y = e.getY();		
	}
	repaint();
}
/**
 * this matches up the people to the picture 
 */
public void paint(Graphics g) {
    Graphics2D g2 = (Graphics2D)g;
    g2.drawImage(imageCity, 0, 0, this);
    g2.drawImage(imageTeacher, iTeacherX, iTeacherY, this); 
    g2.drawImage(imageTeacher2, iTeacher2X, iTeacher2Y, this); 
    g2.drawImage(imageTeacher3, iTeacher3X, iTeacher3Y, this); 
    g2.drawImage(imagePolice, iPoliceX, iPoliceY , this);
    g2.drawImage(imagePolice2, iPolice2X, iPolice2Y, this);
    g2.drawImage(imageKid, iKid1X, iKid1Y, this);
    g2.drawImage(imageKid2, iKid2X, iKid2Y, this);
    g2.drawImage(imageSchool, 80,150, this);
    g2.drawImage(imageCityHall, 450, 120, this);
}
	
static int imageWidth=60, imageHeight=60;
	
public static void main (String[] args)
{
	
   	
	String CITY = "/resources/cityhallschool.png";
	String kid = "/resources/kid.png";
	String k2 ="/resources/kid2.png";
	
	String police="/resources/police.png";
	String police2 ="/resources/police2.png";
	
	String teacher ="/resources/teacher.png";
	String teaCHER2 ="/resources/teacher2.png";
	String teaCHER3 = "/resources/teacher3.png";
	
	String skl = "/resources/School.png";
	String cHall = "/resources/CityHall.png";
	
	Image imageCity = Toolkit.getDefaultToolkit().getImage(City.class.getResource(CITY));
	Image jrSchool = Toolkit.getDefaultToolkit().getImage(City.class.getResource(skl));
	jrSchool = jrSchool.getScaledInstance(150,150, Image.SCALE_DEFAULT);
	Image imageCityHall = Toolkit.getDefaultToolkit().getImage(City.class.getResource(cHall));
	imageCityHall = imageCityHall.getScaledInstance(200,200, Image.SCALE_DEFAULT);
	
	Image imageTeacher = Toolkit.getDefaultToolkit().getImage(City.class.getResource(teacher));
	imageTeacher = imageTeacher.getScaledInstance(imageWidth,imageHeight, Image.SCALE_DEFAULT);
	
	Image imageTeacher2 = Toolkit.getDefaultToolkit().getImage(City.class.getResource(teaCHER2));
	imageTeacher2 = imageTeacher2.getScaledInstance(imageWidth,imageHeight, Image.SCALE_DEFAULT);
	
	Image imageTeacher3 = Toolkit.getDefaultToolkit().getImage(City.class.getResource(teaCHER3));
	imageTeacher3 = imageTeacher3.getScaledInstance(imageWidth,imageHeight, Image.SCALE_DEFAULT);
	
	Image imagePolice = Toolkit.getDefaultToolkit().getImage(City.class.getResource(police));
	imagePolice = imagePolice.getScaledInstance(imageWidth,imageHeight, Image.SCALE_DEFAULT);
	Image imagePolice2 = Toolkit.getDefaultToolkit().getImage(City.class.getResource(police2));
	imagePolice2 = imagePolice2.getScaledInstance(imageWidth,imageHeight, Image.SCALE_DEFAULT);
	
	Image imageKid = Toolkit.getDefaultToolkit().getImage(City.class.getResource(kid));
	imageKid = imageKid.getScaledInstance(imageWidth,imageHeight, Image.SCALE_DEFAULT);
	Image imageKid2 = Toolkit.getDefaultToolkit().getImage(City.class.getResource(k2));
	imageKid2 = imageKid2.getScaledInstance(imageWidth,imageHeight, Image.SCALE_DEFAULT);
	
	
	JFrame frame = new JFrame("DragImage");
	frame.add(new City(imageCity, imageTeacher, imageTeacher2, imageTeacher3, imagePolice, imagePolice2, imageKid, imageKid2, jrSchool, imageCityHall));
	frame.setSize(870,520);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
					
       
}

@Override
public void mouseClicked(MouseEvent e) {	
	 if(e.getX() > 100 && e.getX() < 250 && e.getY() > 130 && e.getY() < 300) {
			System.out.printf("%s,%s\n",building[1].Name,building[1].address);
			
			if(iTeacherX > 100 && iTeacherX < 250 && iTeacherY > 130 && iTeacherY < 300) {
				skool.addOccupation(teacher1);
			}
			else if (iTeacherX < 100 || iTeacherX < 250 || iTeacherY < 130 || iTeacherY > 300) {
				skool.removeOccupation(teacher1);		
			}
			if(iTeacher2X > 100 && iTeacher2X< 250 && iTeacher2Y > 130 && iTeacher2Y < 300) {
				skool.addOccupation(teacher2);
			}
			else if (iTeacher2X < 100 || iTeacher2X > 250 || iTeacher2Y < 130 || iTeacher2Y > 300) {
				skool.removeOccupation(teacher2);
			} 
			if(iTeacher3X > 100 && iTeacher3X< 250 && iTeacher3Y > 130 && iTeacher3Y < 300) {
				skool.addOccupation(teacher3);
			}
			else if (iTeacher3X > 100 || iTeacher3X < 250 || iTeacher3Y > 130 || iTeacher3Y < 300) {
				skool.removeOccupation(teacher3);
			}
			skool.showTheOccupants();
	 		}
		else if(e.getX() > 450 && e.getX() < 620&& e.getY() > 120 && e.getY() < 300) 
		{
			
			if(iPoliceX > 450 && iPoliceX < 620 && iPoliceY > 120 && iPoliceY < 300) {
				cityH.addOccupation(POfficer1);
			}
			else if (iPoliceX < 450 || iPoliceX > 620 || iPoliceY < 120 || iPoliceY > 300) {
				cityH.removeOccupation(POfficer1);
			}	
			if(iPolice2X > 450 && iPolice2X < 620 && iPolice2Y > 120 && iPolice2Y < 300) {
				cityH.addOccupation(POfficer2);
			}
			else if (iPolice2X < 450 || iPolice2X > 620 || iPolice2Y < 120 || iPolice2Y > 300) {
				cityH.removeOccupation(POfficer2);
			}
			System.out.printf("%s,%s\n",building[0].Name,building[0].address);
			cityH.showOccupants();
		}
	 
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
/**
 *  the purpose of the mouseRelased Method is that it calls it just after the mouse button is released 
 *  the getX() and getY() gets the x and y coordinates  but doesn't @return the x and y coordinates 
 * 
 */
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub

	
	if (drag==1)
	{
		System.out.printf(("%s,%d,%d\n"), people[0].getName(), people[0].getAge(),people[0].getPhoneNumber());
	
	}	
	 else if ((drag ==2)){
		
		 System.out.printf("%s,%d,%d\n",people[1].getName(),people[1].getAge(),people[1].getPhoneNumber());
	 }
	 else if ((drag ==3)) { 
		
		 System.out.printf("%s,%d,%d\n",people[2].getName(),people[2].getAge(),people[2].getPhoneNumber());
	 }
	
	 else if ((drag ==4)) {	
		 	Police police1 = (Police) people[3];
			System.out.printf("%s,%d,%d,%s\n",people[3].getName(),people[3].getAge(),people[3].getPhoneNumber(), police1.getJobRole());
		 
	 }
	 else if ((drag ==5)){	
		Police police2 = (Police) people[4];
		System.out.printf("%s,%d,%d,%s\n",people[4].getName(),people[4].getAge(),people[4].getPhoneNumber(), police2.getJobRole());
	 
	 }
	 else if ((drag ==6 )) {	
		System.out.printf("%s,%d,%d\n",people[5].getName(),people[5].getAge(),people[5].getPhoneNumber());
	 }
	 else if ((drag == 7)) {	
		System.out.printf("%s,%d,%d\n",people[6].getName(),people[6].getAge(),people[6].getPhoneNumber());}
	
	 
	drag = 0;

}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseMoved(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}