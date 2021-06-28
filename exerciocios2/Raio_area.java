import java.util.Scanner;

public class Raio_area {

	public static void main(String[] args) {

		Float diam, raio, area;
		Double pi = 3.14159;

		Scanner ler = new Scanner(System.in);
		System.out.println("Vamos calcular o RAIO de um circulo, para isso informe o diâmetro (em centímetros):");
		diam = ler.nextFloat();
		raio = diam / 2;
		System.out.println("O raio é equivalente a: " + raio + " cm.");
		area = (float) (pi * (raio * raio));
		System.out.printf("A area do círculo com diâmetro %.2f é equivalente a %.4f cm²", diam, area);
		ler.close();
	}

}
