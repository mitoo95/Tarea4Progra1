import java.util.Scanner;

public class Tarea42{
	public static void main(String args[]){
		Scanner rd = new Scanner(System.in);

		System.out.print("Ingrese Altura Deseada: ");
		int alt = rd.nextInt();
		System.out.print("Ingrese Anchura Deseada: ");
		int anch = rd.nextInt();

		for(int fila = 0; fila < alt; fila++){
			for(int columna = 0; columna < anch; columna++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}