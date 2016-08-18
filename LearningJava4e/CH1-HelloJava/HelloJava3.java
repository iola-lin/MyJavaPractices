import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloJava3{
	public static void main(String[] args){
		JFrame frame = new JFrame("HelloJava3");
		frame.add(new HelloComponent3("Hello Java!"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}

class HelloComponent3 extends JComponent implements MouseMotionListener, ActionListener{
	String theMessage;
	int messageX = 125, messageY = 95; //for position
	JButton theButton;
	int colorIndex;
	static Color[] someColors = {
		Color.black, Color.red, Color.green, Color.blue, Color.magenta};
	//constructor 
	public HelloComponent3(String message){
		theMessage = message;
		theButton = new JButton("Change Color!");
		setLayout(new FlowLayout());
		add(theButton);
		theButton.addActionListener(this); //a JButton method?
		addMouseMotionListener(this);
	}
	public void paintComponent(Graphics g){
		g.drawString(theMessage, messageX, messageY);
	}
	public void mouseDragged(MouseEvent e){
		messageX = e.getX();
		messageY = e.getY();
		repaint();
	}
	public void mouseMoved(MouseEvent e){}
	public void actionPerformed(ActionEvent e){
		//there is only one Listener would generate  ActionEvent. If more, check out whether the right one is necessary
		if(e.getSource() == theButton)
			changeColor();
	}
	synchronized private void changeColor(){
		if(++colorIndex == someColors.length)
			colorIndex = 0;
		setForeground(currentColor());
		repaint();
	}
	//convenience routine??
	synchronized private Color currentColor(){
		return someColors[colorIndex];
	}
}