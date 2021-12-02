

public class WordStatic {

	public static void main(String[] args) {
		
		Stu d= new Stu();
		Stu d1= new Stu();
		
		Stu d2= new Stu();
		
		d.a=7;
		
		System.out.println(d.a);
		System.out.println(d1.a);
		
		System.out.println(d2.a);
		
	}
}
class Stu{
	
	static int a =9;
	
	
}