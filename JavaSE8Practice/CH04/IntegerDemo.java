public class IntegerDemo{
	public static void main(String[] args){
		int data1 = 10;
		int data2 = 20;
		
		//unboxing
		// Integer intWrapper1 = new Integer(data1);
		// Integer intWrapper2 = new Integer(data2);
		
		// auto boxing
		Integer intWrapper1 = data1;
		Integer intWrapper2 = data2;
		
		System.out.println(data1/3);
		System.out.println(intWrapper1.doubleValue()/3);
		System.out.println(intWrapper1.compareTo(intWrapper2));
	}
}