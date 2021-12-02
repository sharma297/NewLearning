
public class OopsCopyConstructor {

	public static void main(String[] args) {
		
		
		Student s1 = new Student();
		s1.age=78;
		s1.name="kamal";
		
		Student s2= new Student(s1) ;
			s2.printinfo();
		
		}

	}

class Student{
	String name;
	int age;
	
	public void printinfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	Student(Student s2){
		this.age= s2.age;
		this.name= s2.name;
		
	}
	Student(){
		
	}
}



