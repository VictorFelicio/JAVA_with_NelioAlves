import java.util.Scanner;

public class Soma_Simples {

	public static void main(String[] args) {
		Float x, y, z;

		Scanner sc = new Scanner(System.in);
		System.out.println("Para somar informe o primeiro número:");
		x = sc.nextFloat();
		System.out.println("Agora informe o segundo número:");
		y = sc.nextFloat();
		z = x + y;
		System.out.printf("O resultado da soma entra " + x + " e " + y + " é igual a " + z);
		sc.close();
	}
}
