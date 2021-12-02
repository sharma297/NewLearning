import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
	public static void main(String[] args) {

		String names[] = {"java", "pyton","java","c","c"};

		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])) {
					System.out.println("Duplicate words are : "+names[i]);
				}
			}
		}
		
		System.out.println("***********");
		
		Set<String> store =new HashSet<String>(); // It store unique values
		for(String name :names) {
			if(store.add(name) == false) {
				System.out.println("Duplicate words are : "+name);
			}
		}
	}
}
