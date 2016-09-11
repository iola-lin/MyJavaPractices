import java.util.Scanner;

public class guessNum{
	public static void main(String[] agrs){
		Scanner console = new Scanner(System.in);
		int number = (int) (Math.random() * 10);
		int guess;
		
		do{
			System.out.println("²q¼Æ¦r(0 ~ 9): ");
			guess = console.nextInt();
		}while(guess != number);
		
		System.out.println("²q¹ï¤F!!");
	}
}