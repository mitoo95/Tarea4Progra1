import java.util.Scanner;

public class Tarea47{
	public static void main(String args[]){
		Scanner rd = new Scanner(System.in);

		System.out.print("Ingrese un numero para ver sus divisores: ");
		long num1 = rd.nextLong();

		System.out.println("Divisores del numero " +num1+ " son: ");

		for(int num2 = 2; num2 <= num1 / 2; num2++){
			if(num1 % num2 == 0){
				System.out.print(num2+" , ");
			}
		}
		System.out.println(num1);
	}
}