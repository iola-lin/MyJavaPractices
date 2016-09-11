import java.math.BigDecimal;

public class DecimalDemo{
	public static void main(String[] agrs){
		BigDecimal operand1 = new BigDecimal("1.0");
		BigDecimal operand2 = new BigDecimal("0.8");
		BigDecimal result = operand1.subtract(operand2);
		System.out.println(result);
		System.out.printf("%.2f", 1.0-0.8);
	}
}