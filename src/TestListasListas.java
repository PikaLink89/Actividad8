import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestListasListas {

	public static void main(String[] args) {
		List<Empleado> lista, lista2, lista3;
		
		lista2 = new ArrayList<>();
		lista3 = new LinkedList<>();
		lista = new Vector<>();
		
		lista.seadd(new Empleado(107,"andres lopez", 25000));
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
