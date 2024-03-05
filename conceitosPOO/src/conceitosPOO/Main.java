package conceitosPOO;

public class Main {

	public static void main(String[] args) {
		
		//Exercício 01
		System.out.println("EXERCÍCIO 01");
		
		Carro carro = new Carro("AAA999", "Volks", "Gol", "Prata");
		System.out.println(carro.toString());
		
		//Exercício 02
		System.out.println("\n\nEXERCÍCIO 02");
		
		Calculadora calc = new Calculadora(80, 5);
		System.out.println("Adição: "+calc.adicao());
		System.out.println("Subtração: "+calc.subtracao());
		System.out.println("Multiplicação: "+calc.multiplicacao());
		System.out.println("Divisão: "+calc.divisao());	
		System.out.println(calc.toString());
		
		//Exercício 03
		System.out.println("\n\nEXERCÍCIO 03");
		
		Retangulo ret = new Retangulo();
		if(ret.setAltura(2) && ret.setLargura(10)) {
			System.out.println("Área: "+ret.getArea());
			System.out.println("Perímetro: "+ret.getPerimetro());
			System.out.println(ret.toString());
		}
		else {
			System.out.println("Foram informados valores inválidos para altura e largura");
		}
				
		//Exercício 04
		System.out.println("\n\nEXERCÍCIO 04");
		
		Produto prod = new Produto(1123l, "Camiseta", 120, 100);
		if(prod.aplicarDesconto(5)) {
			System.out.println(prod.getValorUnitario());
		}
		else {
			System.out.println("O valor de desconto está inválido");
		}
		
		if(prod.aplicarAcrescimo(-9)) {
			System.out.println(prod.getValorUnitario());
		}
		else {
			System.out.println("O valor de acréscimo está inválido");
		}
		
		System.out.println(prod.toString());
		
		//Exercício 05
		System.out.println("\n\nEXERCÍCIO 05");
		
		System.out.println("Adição com inteiros: "+calc.adicao(10, 1));
		System.out.println("Subtração com inteiros: "+calc.subtracao(10, 5));
		System.out.println("Multiplicação com inteiros: "+calc.multiplicacao(2, 7));
		System.out.println("Divisão com inteiros: "+calc.divisao(10, 3));
		
	}
	
	

}
