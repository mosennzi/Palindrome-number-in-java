import java.util.Scanner;
public class Palindrome {
 
	public static void main(String[] arg) {
		double sum =0; 
		Scanner input = new Scanner(System.in); 
		System.out.print("enter number = ");
		int inpt = input.nextInt();
		int l = String.valueOf(inpt).length();
		int num = inpt;

		for (int i = 1; i<=l; i++) {
           
            double b =(num%10)* Math.pow(10, l-i);
      		 
            num = num/10;
            sum = sum +b;
            
           
		}
 		  if((int) sum == inpt) {
 			 System.out.println("Palindrome number ");
 		  }else {
  			 System.out.println("Not a Palindrome number ");

 			  
		  }
		   
	}
}
