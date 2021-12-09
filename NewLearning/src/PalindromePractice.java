
public class PalindromePractice {
	public static void main(String[] args) {
		
		String name = "abcdcba";
		String rev= "";
		
		for(int i=name.length()-1;i>=0;i--) {
			rev  += name.charAt(i);
		}
		System.out.println(rev);
		
		boolean palindrome = true;
		for(int i=0;i<=name.length()-1;i++) {
			char c=name.charAt(i);
			System.out.print(c);
			if(name.charAt(i)!=rev.charAt(i)) {
				palindrome = false;
			}
		
		
	}
		System.out.println("=============");
		if(palindrome) {
			System.out.println("Plaindrome is ");
		}else {
			System.out.println("Non palindrome");
		}
}
}
