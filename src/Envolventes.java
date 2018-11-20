import java.util.Scanner;

public class Envolventes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer num1, num2, num3;
		String cadena = "123456tomas";
		
		 
		num1 = new Integer(12);
		num2 = new Integer("123");
		num3 = 876;
		System.out.print("por dios teclea un numero : ");
		try {
			cadena = sc.next();
			int i = num3.intValue();
			int j = Integer.parseInt(cadena);
			System.out.println(j);
		}catch(NumberFormatException e) {
			System.out.println("te he dicho animal de bellota");
		}

	}

}
