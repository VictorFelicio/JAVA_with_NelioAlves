import java.util.Scanner;

public class Raio_area {

	public static void main(String[] args) {

		Float diam, raio, area;
		Double pi = 3.14159;

		Scanner ler = new Scanner(System.in);
		System.out.println("Vamos calcular o RAIO de um circulo, para isso informe o di�metro (em cent�metros):");
		diam = ler.nextFloat();
		raio = diam / 2;
		System.out.println("O raio � equivalente a: " + raio + " cm.");
		area = (float) (pi * (raio * raio));
		System.out.printf("A area do c�rculo com di�metro %.2f � equivalente a %.4f cm�", diam, area);
		ler.close();
	}

}
