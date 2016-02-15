import java.util.Scanner;

public class Tarea45{
	public static void main(String args[]){
		Scanner rd = new Scanner(System.in);

		System.out.print("Ingrese la anchura del rectangulo: ");
		int alt = rd.nextInt();

		System.out.print("Ingrese la altura del rectangulo: ");
		int anch = rd.nextInt();

		for(int col = 0; col < alt; col++){
			System.out.print("*");
		}
		System.out.println();

		for(int fila = 0; fila < anch-2; fila++){
			System.out.print("*");
			for(int col = 0; col < alt-2; col++){
				System.out.print(" ");
			}
			System.out.println("*");
		}

		for(int col = 0; col < alt; col++){
			System.out.print("*");
		}
		System.out.println(" ");
	}
}