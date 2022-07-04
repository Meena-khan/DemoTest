package Example;


// Palindrome of a number
public class TestTry1 {

	public static void main(String args[]) {

//		int num = 567;
		
		int rev = 0;
		int num = 121;
		int remainder;	
		int originalNum = num;

		System.out.println("program started");

		while (num > 0) {
			remainder = num % 10; 
			System.out.println(remainder);

			rev = rev * 10 + remainder;
			System.out.println(rev);

			num = num / 10;
			System.out.println(num);

		}
		if (originalNum == rev) {
			System.out.println("number is palindrome " + rev);
		}else {
			System.out.println("number is not palindrome " + rev);

		}
	}

}
