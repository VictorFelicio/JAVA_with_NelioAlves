import java.util.Scanner;

public class Diferencas_produtos {

	public static void main(String[] args) {
		int a, b, c, d, res1, res2, res3;
		Scanner ler = new Scanner(System.in);
		System.out.println("Descobrir a diferen�a dos produtos apenas com numeros INTEIROS.");
		System.out.println("Entre com o 1� 2� 3� e 4� n�mero:");
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
		d = ler.nextInt();
		System.out.printf("Os n�meros selecionados foram 1� %d, 2� %d, 3� %d, 4� %d\n2", a, b, c, d);
		res1 = a * b;
		res2 = c * d;
		res3 = res1 - res2;
		System.out.println("O produto entre " + a + " e " + b + " � igual a: " + res1);
		System.out.println("O produto entre " + c + " e " + d + " � igual a: " + res2);
		System.out.println("A diferen�a entre " + res1 + " e " + res2 + " � igual a: " + res3);

		ler.close();
	}

}
