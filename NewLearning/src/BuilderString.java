
public class BuilderString {

	public static void main(String[] args) {
	
//		StringBuilder sb = new StringBuilder("Hemant");
//		sb.setCharAt(0, 'p');
//		System.out.println(sb);
		
		
		

		
		
		//String concept
		
//		String s1 = "Hemant";
//		String s2 = "Sharma";
//		String s3 = "Hemant";
		
		String s1 = new String("Hemant");
		String s2 = new String("Sharma");
		String s3 = new String("Hemant");
		
		if(s1==s3) {  // "==" this operator compare the memory address 
			System.out.println("Right");
		}else {
			System.out.println("Wrong");
		}
		
		
		
		if(s1.equals(s3)) {  // .equals compare the content 
			System.out.println("Right");
		}else {
			System.out.println("Wrong");
		}
	}

}
