package desafio;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
		String continuar = "S";
		
		while(continuar.equalsIgnoreCase("S")) {
		
			System.out.println("Escolha uma opção:\n"
					+ "1. Cadastrar Novo Produto\n"
					+ "2. Editar Produto Existente\n"
					+ "3. Excluir Produto Existente\n"
					+ "4. Listar Todos os Produtos");
			System.out.print("Opção: ");
			int opcao = s.nextInt();
		
			switch(opcao) {
				case 1:
					System.out.print("Código: ");
					Long codigo = s.nextLong();
					System.out.print("Descrição: ");
					String desc = s.next();
					System.out.print("Estoque: ");
					int estoque = s.nextInt();
					System.out.print("Valor Unitário: R$ ");
					double valor = s.nextDouble();
					
					Produto produto = new Produto(codigo, desc, estoque, valor);
					listaProdutos.add(produto);
					
					
					break;
				
				case 4:
					
					System.out.println("Produtos cadastrados:");
					
					for(Produto p : listaProdutos) {
						System.out.println(p.toString());
					}
					
					break;
			}
			
			System.out.print("Deseja continuar (S ou N): ");
			continuar = s.next();
			
		}				
	}
}
