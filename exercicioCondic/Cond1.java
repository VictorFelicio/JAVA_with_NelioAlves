import java.util.Scanner;

public class Cond1 {

	public static void main(String[] args) {

		Float x, y, z;

		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um numero para descobrirmos se é negativo ou positivo");

		x = ler.nextFloat();

		if (x >= 0) {

			System.out.printf("O número %.2f é positivo !\n", x);

		} else {

			System.out.printf("O número %.2f é negativo !\n", x);
		}
		;

		if (x % 2 == 0) {
			System.out.printf("O númer %.2f é par !\n", x);
		}

		else {
			System.out.printf("O número %.2f é ímpar !\n", x);
		}
		;

		System.out.println("Digite dois números para descobrirmos se são múltiplos:");

		x = ler.nextFloat();
		y = ler.nextFloat();

		if (x % y == 0) {
			System.out.printf("Os números %.2f e %.2f são múltiplos!\n", x, y);

		} else if (y % x == 0) {
			System.out.printf("Os números %.2f e %.2f são múltiplos\n", y, x);
		} else {
			System.out.printf("Os números %.2f e %.2f não são múltiplos ! \n");
		}

		ler.close();
	}

}
