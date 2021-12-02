
public class UsePrivate {
	
	
	
	public static void main(String[] args) {
		Confident co= new Confident();
		co.setPassword("Admin");
		System.out.println(co.getPassword());
		
		
	}

}

class Confident{
	
	int a =10;
	private String password;
	
	public String getPassword() {
		return this.password;
		
		
	}
	public void setPassword(String pass) {
		this.password=pass;
		
	}
	
}