import java.util.Scanner;

public class Factorials {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter a number");
//		int n = sc.nextInt();
		
		int f =1;
		
//		while(n!=0) {
//			
//			f = f*n;
//			n--;
//		}
//				
//		System.out.println("Factorial of that number is :"+f);
		
		for(int n1=5 ; n1!=0 ; n1--) {
			f=f*n1;
			
		}
		System.out.println(f);
	}

}
