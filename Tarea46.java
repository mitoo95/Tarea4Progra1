import java.util.Scanner;

public class Tarea46{
	public static void main(String args[]){
		Scanner rd = new Scanner(System.in);

		System.out.print("Ingrese Altura Deseada: ");
		int alt = rd.nextInt();

		for(int x = 1; x <= alt; x++){
			for(int y = 1; y <= (alt - x); y++){
				System.out.print(" ");
			}
			for(int z = 0; z < (x + (x - 1)); z++){
				System.out.print("*");
			}
			for(int p = 1; p <= (alt - x); p++){
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}