//using StringBuilder (create just one object)
public class addStrNum3{
	public static void main(String[] agrs){
		StringBuilder oneTo100 = new StringBuilder();
		for(int i=1; i<100; i++){
			oneTo100.append(i).append("+");
		}
		System.out.println(oneTo100.append(100).toString());
	}
}