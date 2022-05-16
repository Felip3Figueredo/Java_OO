//Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as
//seguintes operações:

//a. void armazenaPessoa(String nome, int idade, float altura);
//b. void removePessoa(String nome);
//c. int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
//d. void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
//e. void imprimePessoa(int index); // imprime os dados da pessoa que está na posição
//“i” da agenda.

//OBS: Para não ocorrer o risco de apagar mais de 1 registro ao digitar 1 nome, tomei a decisão de acrescentar 
//o parametro id.

package agenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<Pessoa>();
		boolean menu = true;
		int escolhaMenu, idade, id = 0;
		String nome;
		double altura;
		int idPesquisa;

		do {
			System.out.println("\t\tMenu\t\t\n");
			System.out.println("[1] - Cadastrar pessoa");
			System.out.println("[2] - Remover pessoa");
			System.out.println("[3] - Pesquisar pessoa");
			System.out.println("[4] - Listar agenda");
			System.out.println("[5] - Sair da agenda");
			System.out.print("Digite aqui a resposta do menu: ");
			escolhaMenu = sc.nextInt();
			
			System.out.println();
			switch (escolhaMenu) {
			case 1:
				System.out.println("\t\tCadastro\t\t\n");
				System.out.print("Nome: ");
				sc.nextLine();
				nome = sc.nextLine();
				System.out.print("Idade: ");
				idade = sc.nextInt();
				System.out.print("Altura: ");
				altura = sc.nextDouble();
				id += 1;

				Pessoa pessoa = new Pessoa(id, nome, idade, altura);

				list.add(pessoa);
				break;

			case 2:
				System.out.println("\t\tRemover usuario\t\t\n");
				System.out.println("Digite o ID do usuario que deseja deletar: ");
				idPesquisa = sc.nextInt();

				while (pesquisaId(list, idPesquisa)) {
					System.out.print("ID não encontrado, digite novamente: ");
					idPesquisa = sc.nextInt();
				}

				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getId() == idPesquisa) {
						list.remove(i);
						System.out.println("Pessoa removida da agenda");
					}
				}

				break;

			case 3:
				System.out.println("\t\tPesquisa\t\t\n");
				System.out.println("Digite o id da pessoa: ");
				idPesquisa = sc.nextInt();

				while (pesquisaId(list, idPesquisa)) {
					System.out.print("ID não encontrado, digite novamente: ");
					idPesquisa = sc.nextInt();
				}

				for (Pessoa lista : list) {
					if (lista.getId() == idPesquisa) {
						Pessoa pesqPessoa = new Pessoa();
						pesqPessoa = lista;

						System.out.println("ID: " + pesqPessoa.getId());
						System.out.println("Nome: " + pesqPessoa.getNome());
						System.out.println("Idade: " + pesqPessoa.getIdade());
						System.out.printf("Altura: %.2f", pesqPessoa.getAltura());
					}

				}

				break;

			case 4:
				System.out.println("\t\t\tAgenda\t\t\t");
				
				for (Pessoa agenda : list) {
					System.out.println();
					System.out.println("ID: " + agenda.getId());
					System.out.println("Nome: " + agenda.getNome());
					System.out.println("Idade: " + agenda.getIdade());
					System.out.printf("Altura: %.2f\n", agenda.getAltura());
					System.out.println("---------------------");
				}
				break;
			case 5:
				menu = false;
				break;

			default:
				System.out.println("Invalido.");
				break;
			}

		} while (menu);

		sc.close();
	}

	public static boolean pesquisaId(List<Pessoa> list, int id) {
		boolean idp = true;

		for (Pessoa lista : list) {
			if (lista.getId() == id) {
				idp = false;
			}
		}

		return idp;
	}

}
