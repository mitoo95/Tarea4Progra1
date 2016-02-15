import java.util.Scanner;

public class Tarea4{
	public static void main(String args[]){
		Scanner rd = new Scanner(System.in);

		int num;
		int x = 0;

		System.out.println("Ingrese un numero: ");
		num = rd.nextInt();

		int i = 1;

		while(i <= num){
			x = x + i;
			i++;
		}
		System.out.println("La suma de todos los numeros hasta "+num +" es: " +x);
	}
}