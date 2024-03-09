package desafio;

import java.util.ArrayList;
import java.util.Scanner;

// @autor Lucas Emanoel Gitirana - Engenharia de Software UDESC

public class Sistema {

	public static void main(String[] args) {						
			
			Scanner s = new Scanner(System.in);
			ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
			String continuar = "S";				
			
			while(continuar.equalsIgnoreCase("S")) {
			
				System.out.println("====================== Menu ======================");
				System.out.println("Escolha uma opção:\n"
						+ "1. Cadastrar Novo Produto\n"
						+ "2. Editar Produto Existente\n"
						+ "3. Excluir Produto Existente\n"
						+ "4. Listar Todos os Produtos");
				
				System.out.println("Opção: ");
				int opcao = s.nextInt();
				String msg = "";
			
				switch(opcao) {
					case 1:
						System.out.println("====================== Cadastro de Produto ======================");
						
						System.out.println("Código: ");
						Long codigo = s.nextLong();
						
						if(!verificaIdUnico(listaProdutos, codigo)) {
							System.out.println("Descrição: ");
							String desc = s.next();
							System.out.println("Estoque: ");
							int estoque = s.nextInt();
							System.out.println("Valor Unitário: R$ ");
							double valor = s.nextDouble();
							
							Produto produto = new Produto(codigo, desc, estoque, valor);					
							
							if(listaProdutos.add(produto)) {
								System.out.println("Produto inserido com sucesso!");
								System.out.println(produto.toString());
							} else {
								System.out.println("Não foi possível cadastrar o produto.");
							}
						} else {
							System.out.println("O código informado já está sendo usado!");
						}
						
						break;
						
					case 2:
						
						System.out.println("====================== Edição de Produto Existente ======================");
						System.out.println("Informe o código do produto a ser editado: ");
						Long idProdutoEdicao = s.nextLong();
		
						boolean success = false;						
						
						if(verificaIdUnico(listaProdutos, idProdutoEdicao)) {
							for(Produto p : listaProdutos) {
								if(p.getId() == idProdutoEdicao) {
									System.out.println("Descrição: ");
									success = p.setDescricao(s.next());
									System.out.println("Estoque: ");
									success = p.setEstoque(s.nextInt());
									System.out.println("Valor Unitário: R$ ");
									success = p.setValorUnitario(s.nextDouble());
									break;
									
								}								
							}
							
							if(success) {
								System.out.println("O produto de ID "+idProdutoEdicao+" foi editado com sucesso!");
							} else {
								System.out.println("Não foi possível editar o produto de ID "+idProdutoEdicao+".");
							}
						}
						else {
							System.out.println("O produto de ID "+idProdutoEdicao+" não existe!");
						}
						
						break;
					
					case 3:
						
						System.out.println("====================== Exclusão de Produto Existente ======================");
						System.out.println("Informe o código do produto a ser excluído: ");
						Long idProdutoExclusao = s.nextLong();
						
						Produto produtoExclusao = new Produto();
						msg = "";
						
						if(verificaIdUnico(listaProdutos, idProdutoExclusao)) {
							for(Produto p : listaProdutos) {
								if(p.getId() == idProdutoExclusao) {
									produtoExclusao = p;
									break;
								}
							}
							
							if(listaProdutos.remove(produtoExclusao)) {
								msg = "O produto de ID "+idProdutoExclusao+" foi excluído com sucesso!";
							} else {
								msg = "Não foi possível excluir o produto de ID "+idProdutoExclusao+".";
							}
						} else {
							msg = "O produto de ID "+idProdutoExclusao+" não existe!";
						}
						
						System.out.println(msg);
						
						break;
						
					
					case 4:
						
						System.out.println("====================== Produtos Cadastrados ======================");
						
						if(listaProdutos.size() == 0) {
							System.out.println("Não há produtos cadastrados!");
						}else {					
							for(Produto p : listaProdutos) {
								System.out.println(p.toString());
							}
						}				
						
						break;
				}
				
				System.out.print("Deseja continuar? (S ou N): ");
				continuar = s.next();
				
		}				
	}	
	
	public static boolean verificaIdUnico(ArrayList<Produto> lista, Long id) {
		
		boolean existe = false;
		
		for(Produto p : lista) {
			if(p.getId() == id) {
				existe = true;
				break;
			}
		}
		
		return existe;
	}
}
