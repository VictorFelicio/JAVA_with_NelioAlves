import java.util.Scanner;

public class Diferencas_produtos {

	public static void main(String[] args) {
		int a, b, c, d, res1, res2, res3;
		Scanner ler = new Scanner(System.in);
		System.out.println("Descobrir a diferença dos produtos apenas com numeros INTEIROS.");
		System.out.println("Entre com o 1º 2º 3º e 4º número:");
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
		d = ler.nextInt();
		System.out.printf("Os números selecionados foram 1º %d, 2º %d, 3º %d, 4º %d\n2", a, b, c, d);
		res1 = a * b;
		res2 = c * d;
		res3 = res1 - res2;
		System.out.println("O produto entre " + a + " e " + b + " é igual a: " + res1);
		System.out.println("O produto entre " + c + " e " + d + " é igual a: " + res2);
		System.out.println("A diferença entre " + res1 + " e " + res2 + " é igual a: " + res3);

		ler.close();
	}

}
