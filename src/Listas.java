import java.util.ArrayList;
import java.util.Collections;

public class Listas {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("tomas");
		lista.add("eva");
		lista.add("sara");
		lista.add("andres");
		lista.add("eva");
		
		
		for (String ele: lista) {
			System.out.println(ele);
		}
		
		Collections.sort(lista);
		System.out.println(lista);
/*		
		System.out.println("remove");
		
		System.out.println(lista.remove(2));
		lista.clear();
		System.out.println(lista);
		System.out.println(lista.indexOf("andres"));
*/		
		

	}

}
