import java.awt.*;
//swing is a GUI tool!
import javax.swing.*;

//declare a class called HelloJava
public class HelloJava {
	//declare a method called main()
	public static void main(String[] args){
		// System.out.println("Hello, Java!");
		//new: depoly a memory space for a new JFame object
		JFrame frame = new JFrame("Hello, Java!");
		//use a object, not draw with method (?)
		// JLabel label = new JLabel("Hello, Java!", JLabel.CENTER); 
		// frame.add(label);
		frame.add(new HelloComponent());
		frame.setSize(300,300);
		frame.setVisible(true);
	}		
	//add "static" which is not in the example	
	static class	HelloComponent extends JComponent {
		//override paintComponent!
		public void paintComponent(Graphics g) {
			g.drawString("Hello, Java!", 125, 95);
		}
	}
}