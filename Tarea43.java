import java.util.Scanner;

public class Tarea43{
	public static void main(String args[]){
		Scanner rd = new Scanner(System.in);

		System.out.println("Altura del Triangulo:");
		int alt = rd.nextInt();

		for(int i = 1; i <= alt; i++){
			for(int j = 1; j <= i; j++){
				System.out.print('*');
			}
			System.out.println(" ");
		}
	}
}