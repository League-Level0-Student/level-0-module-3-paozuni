import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class checkpoint{
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "What is you favorite color?");
JOptionPane.showInputDialog(null);
JOptionPane.showMessageDialog(null, "Really?! That's my favorite color too!!");

Robot ace = new Robot();
ace.penDown();
ace.move(100);
ace.turn(90);
ace.move(100);
ace.turn(90);
ace.move(100);
ace.turn(90);
ace.move(100);
ace.penUp();




}

}

