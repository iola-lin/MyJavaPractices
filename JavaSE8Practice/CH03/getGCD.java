public class getGCD{
	public static void main(String[] args){
		int m = 1000, n = 495, remainder = 1;
		int dividend = m, divisor = n;
		while (remainder != 0){
			remainder = dividend % divisor;
			dividend = divisor;
			divisor = remainder;
		}
		System.out.println("the quotient = " + dividend);
	}
}