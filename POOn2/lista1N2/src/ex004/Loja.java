package ex004;

import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\tBem vindo ao cadastro de produtos\t\t");

		System.out.print("Digite o n�mero do item: ");
		int numeroDoItem = sc.nextInt();
		System.out.println();

		System.out.print("Digite a descri��o do item: ");
		sc.nextLine();
		String descItem = sc.nextLine();
		System.out.println();

		System.out.print("Digite a quantidade do produto: ");
		double quant = sc.nextDouble();
		System.out.println();

		System.out.print("Digite o pre�o unitario: ");
		double precUnitario = sc.nextDouble();
		System.out.println();

		Invoice fat = new Invoice(numeroDoItem, descItem, quant, precUnitario);

		if (quant < 0) {
			System.out.println("Erro: Quantidade abaixo de 0.");
			fat.setQuant(0.0);
		}

		if (precUnitario < 0) {
			System.out.println("Erro: Valor de pre�o unitario abaixo de 0.");
			fat.setPrecUnitario(0.0);
		}

		System.out.println(fat);

		sc.close();
	}

}
