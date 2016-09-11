public class findArmstrong{
	public static void main(String[] args){
		System.out.print("Armstrong:");
		for (int i = 100; i < 1000; i++){
			int hundreds = i/100;
			int tens = (i-hundreds*100)/10;
			int ones = i % 10;
			int numArmstrong = (int) (Math.pow(hundreds, 3) + Math.pow(tens, 3) + Math.pow(ones, 3));
			if( numArmstrong == i)
				System.out.print(" " + i);			
		}
	}
}