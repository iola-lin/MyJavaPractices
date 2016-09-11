import java.math.BigDecimal;

public class DecimalDemo2{
	public static void main(String[] agrs){
		BigDecimal trueResult = new BigDecimal("0.3");
		BigDecimal operand1  = new BigDecimal("0.1");
		BigDecimal operand2  = new BigDecimal("0.1");
		BigDecimal operand3  = new BigDecimal("0.1");
		if(operand1.add(operand2).add(operand3).equals(trueResult)){
			System.out.println("Equal to 0.3");
		}
		else {
			System.out.println("Not equal to 0.3");
		}
	}
}