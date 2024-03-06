package conceitosPOO;

public class Main {

	public static void main(String[] args) {
		
		//Exerc�cio 01
		System.out.println("EXERC�CIO 01");
		
		Carro carro = new Carro("AAA999-0", "Volks", "Gol", "Prata");
//		carro.setPlaca("AAAAAAAAAA");
		System.out.println(carro.toString());
		
		//Exerc�cio 02
		System.out.println("\n\nEXERC�CIO 02");
		
		Calculadora calc = new Calculadora(80, 0);
		System.out.println("Adi��o: "+calc.adicao());
		System.out.println("Subtra��o: "+calc.subtracao());
		System.out.println("Multiplica��o: "+calc.multiplicacao());
		System.out.println("Divis�o: "+calc.divisao());	
		System.out.println(calc.toString());
		
		//Exerc�cio 03
		System.out.println("\n\nEXERC�CIO 03");
		
		Retangulo ret = new Retangulo();
		if(ret.setAltura(2) && ret.setLargura(10)) {
			System.out.println("�rea: "+ret.getArea());
			System.out.println("Per�metro: "+ret.getPerimetro());
			System.out.println(ret.toString());
		}
		else {
			System.out.println("Foram informados valores inv�lidos para altura e largura");
		}
				
		//Exerc�cio 04
		System.out.println("\n\nEXERC�CIO 04");
		
		Produto prod = new Produto(1123l, "Camiseta", 120, 100);
		if(prod.aplicarDesconto(5)) {
			System.out.println(prod.getValorUnitario());
		}
		else {
			System.out.println("O valor de desconto est� inv�lido");
		}
		
		if(prod.aplicarAcrescimo(-9)) {
			System.out.println(prod.getValorUnitario());
		}
		else {
			System.out.println("O valor de acr�scimo est� inv�lido");
		}
		
		System.out.println(prod.toString());
		
		//Exerc�cio 05
		System.out.println("\n\nEXERC�CIO 05");
		
		System.out.println("Adi��o com inteiros: "+Calculadora.adicao(10, 1));
		System.out.println("Subtra��o com inteiros: "+Calculadora.subtracao(10, 5));
		System.out.println("Multiplica��o com inteiros: "+Calculadora.multiplicacao(2, 7));
		System.out.println("Divis�o com inteiros: "+Calculadora.divisao(10, 3));
		
	}
	
	

}
