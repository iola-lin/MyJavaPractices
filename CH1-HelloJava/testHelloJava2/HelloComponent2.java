import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class HelloComponent2 extends JComponent implements MouseMotionListener{
	String theMessage;
	int messageX = 125, messageY = 95; 
	public HelloComponent2(String message){
		theMessage = message; // or this.theMessage = message; if we wnat to pass to otherclass, that's ncessary
		//where is the below this from? a method from JComponent??
		addMouseMotionListener(this);
	}
	public void paintComponent(Graphics g){
		g.drawString(theMessage, messageX, messageY);
	}
	//automatically on a listener
	public void mouseDragged(MouseEvent e){
		//save the mouse coordinates and paint the message.
		messageX = e.getX();
		messageY = e.getY();
		//the method included in JComponent (so need to import javax.swing.*)
		//recreate HelloComponent2 again, cannot call paintComponent due to no graphics context to pass to it.
		repaint();
	}
	//MouseMotionListener needed
	public void mouseMoved(MouseEvent e) {}
}