import java.util.ArrayList;
import java.util.Collections;

public class TestlistasEmpleado {

	public static void main(String[] args) {
		ArrayList<Empleado> lista = new ArrayList();
		
		Empleado emp1 = new Empleado(101,"tomas lopez", 75000);
		
		lista.add(new Empleado(107,"andres lopez", 25000));
		lista.add(new Empleado(108,"sara lopez", 45000));
		lista.add(new Empleado(103,"eva lopez", 55000));
		lista.add(new Empleado(101,"tomas lopez", 75000));
		
		
		for (Empleado ele: lista) {
			System.out.println(ele.getNombre() + " - " + ele.salarioMensual(14));
		}
		Collections.sort(lista);
/*		if (lista.contains(emp1))
			System.out.println("respuesta : "+lista.remove(emp1));
		else
			System.out.println("no existe");
*/		
		for (Empleado ele: lista) {
			System.out.println(ele.getIdEmpleado()+ " - " + ele.getNombre() + " - " + ele.salarioMensual(14));
		}

	}

}
