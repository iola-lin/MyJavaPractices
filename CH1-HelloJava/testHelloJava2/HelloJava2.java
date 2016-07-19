import javax.swing.*;

public class HelloJava2{
	public static void main(String[] args){
		JFrame frame = new JFrame("HelloJava2");
		// frame.add(new HelloComponent2("Hello Java!"));
		//args[0]: get string from first(index=0) cmd; U have to type before "Enter" java command
		HelloComponent2 newobj = new HelloComponent2(args[0]);
		frame.add(newobj);
		//You would not need to press ctrl+C again
		//or use listener, but this is more convenience
		//(so EXIT_ON_CLOSE is a static constant in JFrame?)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}