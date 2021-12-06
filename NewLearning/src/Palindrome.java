
public class Palindrome {
	public static void main(String[] args) {
		
		String a = "abba";
		
		String rev= "";
		for(int i =a.length()-1;i>=0;i--) {
			rev = rev+a.charAt(i);
			//rev += a.charAt(i);
			
		}
		System.out.println(rev);
		
		boolean palindrome = true;
		 for(int i=0;i<=a.length()-1;i++) {
			char cha =a.charAt(i);
			System.out.print(cha);
			if(rev.charAt(i)!=a.charAt(i)) {
				palindrome=false;
		 }
		
			
		}
		 System.out.println();
		 if(palindrome) {
			 System.out.println("Palindrome");
		 }else {
			 System.out.println("Not palindrome");
		 }
	}

}
