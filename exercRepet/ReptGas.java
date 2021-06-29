import java.util.Scanner;

public class ReptGas {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int gas = 0;
		int alc = 0;
		int dis = 0;
		int fim = 0;

		while (fim != 4) {

			System.out.println("\n Por favor digite:\n \nGasolina:1 \n \n Álcool:2 \n \n Diesel: 3 \n \n Fim: 4 \n ");
			fim = leia.nextInt();

			switch (fim) {

			case 1:
				gas = gas + 1;
				break;
			case 2:
				alc = alc + 1;
				break;
			case 3:
				dis = dis + 1;
				break;
			case 4:
				fim = 4;
				break;
			default:
				System.out.println("Por favor digite um valor válido");
				break;

			}
			System.out.println("-----------------------------------");
			System.out.println("\nGasolina possui " + gas+" votos");
			System.out.println();
			System.out.println("Álcool possui " + alc+" votos");
			System.out.println();
			System.out.println("Diesel possui " + dis+ "votos");
			System.out.println("-----------------------------------");

		}

		leia.close();

	}
}