import java.util.Scanner;

public class Salarios {

	public static void main(String[] args) {

		int fun1, fun2, fun3, hr1, hr2, hr3;

		Float sal, sFin;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o número do funcionário:");

		fun1 = ler.nextInt();

		System.out.println("Digite as horas trabalhadas:");

		hr1 = ler.nextInt();

		System.out.println("Digite o valor do salário por hora trabalhada:");

		sal = ler.nextFloat();

		sFin = hr1 * sal;

		System.out.printf("O funcionário %d trabalhou um total de %d hora(s) e sua remuneração será de R$%.2f\n", fun1,
				hr1, sFin);

		System.out.println("Digite o número do funcionário:");

		fun2 = ler.nextInt();

		System.out.println("Digite as horas trabalhadas:");

		hr2 = ler.nextInt();

		System.out.println("Digite o valor do salário por hora trabalhada:");

		sal = ler.nextFloat();

		sFin = hr2 * sal;

		System.out.printf("O funcionário %d trabalhou um total de %d hora(s) e sua remuneração será de R$%.2f\n", fun2,
				hr2, sFin);

		System.out.println("Digite o número do funcionário:");

		fun3 = ler.nextInt();

		System.out.println("Digite as horas trabalhadas:");

		hr3 = ler.nextInt();

		System.out.println("Digite o valor do salário por hora trabalhada:");

		sal = ler.nextFloat();

		sFin = hr3 * sal;

		System.out.printf("O funcionário %d trabalhou um total de %d hora(s) e sua remuneração será de R$%.2f", fun3,
				hr3, sFin);

		ler.close();

	}

}
