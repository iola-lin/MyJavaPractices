// test for iterable
import java.util.*;

public class testIterable{
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		list.add("foo");
		list.add("bar");
		for(String s: list)
			System.out.println(s);
	}
}