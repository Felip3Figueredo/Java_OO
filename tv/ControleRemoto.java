// Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o volume
// e trocar os canais da televisão. O controle de volume permite:

// a. aumentar ou diminuir a potência do volume de som em uma unidade de
// cada vez;
// b. aumentar e diminuir o número do canal em uma unidade
// c. trocar para um canal indicado;
// d. consultar o valor do volume de som e o canal selecionado.

package ex008;

import java.util.Scanner;

public class ControleRemoto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\tControle Remoto\t\t");
		Televisao tev = new Televisao();

		boolean controleRemoto = true;
		int resp;
		int escolherCanal;
		do {
			System.out.println("[1] - Aumentar volume;");
			System.out.println("[2] - Diminuir volume;");
			System.out.println("[3] - Aumentar Canal;");
			System.out.println("[4] - Diminuir Canal;");
			System.out.println("[5] - Escolher Canal;");
			System.out.println("[6] - Status;");
			System.out.println("[7] - Sair.");
			resp = sc.nextInt();

			switch (resp) {
			case 1:
				tev.setVolumeAtual(tev.getVolumeAtual() + 1);
				break;

			case 2:
				if (tev.getVolumeAtual() > 0) {
					tev.setVolumeAtual(tev.getVolumeAtual() - 1);
				}
				break;

			case 3:
				tev.setCanalAtual(tev.getCanalAtual() + 1);
				break;

			case 4:
				if (tev.getCanalAtual() > 0) {
					tev.setCanalAtual(tev.getCanalAtual() - 1);
				}
				break;

			case 5:
				System.out.print("Canal: ");
				escolherCanal = sc.nextInt();
				tev.setCanalAtual(escolherCanal);
				break;
			case 6:
				System.out.println(tev);
				break;
			case 7:
				controleRemoto = false;
				break;

			default:
				System.out.println("Valor invalido.");
				break;

			}

		} while (controleRemoto);

		sc.close();

	}

}