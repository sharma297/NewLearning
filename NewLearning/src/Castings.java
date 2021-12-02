
 public class Castings {

	public static void main(String[] args) {
		Person p  = new Person(9, "Harsh");		

	}
	
}

 class Person{
	
	String name ;
	int age ;

	public Person(int newage, String newname) {
		
		 this.name= newname;
		this.age = newage;
		
		System.out.println("Name of a person is "+newname+ " and age is "+ newage);
	}
}