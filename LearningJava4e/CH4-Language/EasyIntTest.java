public class EasyIntTest{
	public static void main(String[] args){
		
		/* what's the meaning of 'underscore'? */
		// int RICHARD_NIXONS_SSN = 567_68_0515;
		// int for_no_reason = 1_2_3;
		// int JAVA_ID = 0xCAFE_BABE;
		// int sub_ID = 0xBABE;
		// System.out.println(RICHARD_NIXONS_SSN);
		// System.out.println(for_no_reason);
		// System.out.println(JAVA_ID);
		// System.out.println(sub_ID);
		
		/* all allow */
		byte one = 0b00000001;
		byte two = (byte) 0b00000010;
		byte one2 = (byte) 00000001;
		byte one3 = 00000001;
		System.out.println(one);
		System.out.println(two);
		System.out.println(one2);
		System.out.println(one3);
		
		/* cannot display */		
		char smiley = '\u263a';
		System.out.println(smiley);
	}
}