import java.util.Scanner;

public class Cond1 {

	public static void main(String[] args) {

		Float x, y, z;

		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um numero para descobrirmos se � negativo ou positivo");

		x = ler.nextFloat();

		if (x >= 0) {

			System.out.printf("O n�mero %.2f � positivo !\n", x);

		} else {

			System.out.printf("O n�mero %.2f � negativo !\n", x);
		}
		;

		if (x % 2 == 0) {
			System.out.printf("O n�mer %.2f � par !\n", x);
		}

		else {
			System.out.printf("O n�mero %.2f � �mpar !\n", x);
		}
		;

		System.out.println("Digite dois n�meros para descobrirmos se s�o m�ltiplos:");

		x = ler.nextFloat();
		y = ler.nextFloat();

		if (x % y == 0) {
			System.out.printf("Os n�meros %.2f e %.2f s�o m�ltiplos!\n", x, y);

		} else if (y % x == 0) {
			System.out.printf("Os n�meros %.2f e %.2f s�o m�ltiplos\n", y, x);
		} else {
			System.out.printf("Os n�meros %.2f e %.2f n�o s�o m�ltiplos ! \n");
		}

		ler.close();
	}

}
