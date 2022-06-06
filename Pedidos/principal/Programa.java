package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entidade.Cliente;
import entidade.ItemPedido;
import entidade.Produto;
import entidade.StatusPedido;


public class Programa {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Produto> listP = new ArrayList<>();
		List<ItemPedido> listIP = new ArrayList<>();
		Date data = new Date();
		double somaProduto = 0.0;
		
		System.out.println("\t\t\tDados do Cliente");
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Data de nascimento: ");
		Date nascimento = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nome, email, nascimento);
		
		
		System.out.println("\t\t\tDados do Pedido\t\t\t\n");
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		
		System.out.print("Quantos itens deseja adicionar ao pedido: ");
		int qtdPed = sc.nextInt();
		
		for (int i = 0 ; i < qtdPed ; i++) {
			System.out.print("Digite os dados do item #" + i);
			sc.nextLine();
			
			System.out.println("---------------------------");
			System.out.print("\nNome do produto: ");
			String produto = sc.nextLine();
			System.out.print("Preço unitario: ");
			double preco = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			
			Produto prod = new Produto(produto, preco);
			listP.add(prod);
			ItemPedido iP = new ItemPedido(quantidade, preco);
			listIP.add(iP);
		}
		
		System.out.println("\t\t\tSumario do pedido\t\t\t");
		System.out.println("Data e hora do pedido " + data);
		System.out.println("Status do pedido: " + status);
		System.out.println("Cliente " + cliente);
		
		System.out.println("\t\t\tItens do pedido\t\t\t\n");
		for (int i = 0 ; i < listP.size() ; i++) {
			System.out.println(listP.get(i).getNome() + ", Quantidade: " + listIP.get(i).getQuantidade() + ", Subtotal: " + listIP.get(i).subTotal());
			somaProduto += listIP.get(i).subTotal();
		}
		
		System.out.println("\n\nValor total: R$ " + String.format("%.2f", somaProduto));
		
		sc.close();
	}

}

































