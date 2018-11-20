import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		 Set<String > conjunto = new TreeSet<>();
		
		conjunto.add("tomas");
		conjunto.add("sara");
		conjunto.add("eva");
		conjunto.add("andres");
		conjunto.add("eva");
		
		for(String ele: conjunto) {
			System.out.println(ele);
			
		}
	}

}
