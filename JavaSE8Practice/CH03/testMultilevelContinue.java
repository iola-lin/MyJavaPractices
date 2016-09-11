public class testMultilevelContinue{
	public static void main(String[] args){
		back1:
		for(int i = 0; i < 10; i++){  // Indent or not were the same.
			back2:
			for(int j = 0; j < 10; j++){
				if(j == 9){
					continue back2; //change to "back1" or  "back2", figuring out the difference.
				}
			}
			System.out.println("test");
		}
	}
}