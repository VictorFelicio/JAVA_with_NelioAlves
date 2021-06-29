import java.util.Scanner;

public class Repeticoes {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int senha = 0;

		while (senha != 2002) {

			System.out.println("Por favor digite a senha:");

			senha = leia.nextInt();

			if (senha != 2002) {

				System.out.println("Senha incorreta, digite-a novamente:");

			} else {

				System.out.println("Senha correta, Login aprovado !:");
			}

		}

		leia.close();
	}
}