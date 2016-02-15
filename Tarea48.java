import java.util.Scanner;

public class Tarea48{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int num, count = 0, x;

		x = 1;
		System.out.println("Ingrese un numero para saber si es primo: ");
		num = in.nextInt();

		while(x <= num){
			if(num % x == 0){
				count ++;
			}	
			x++;
		}
		if(count <= 2){
			System.out.println("El numero es primo");
		}
		else{
			System.out.println("El numero es compuesto");
		}
	}
}