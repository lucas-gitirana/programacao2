package conceitosPOO;

public class Calculadora {

	//Exercício 02
	
	private double n1;
	private double n2;
	
	public Calculadora() {
		this.n1 = 0;
		this.n2 = 0;
	}
	
	public Calculadora(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double adicao() {
		return n1 + n2;
	}
	
	public int adicao(int num01, int num02) {
		return num01 + num02;
	}
	
	public double subtracao() {
		return n1 - n2;
	}
	
	public int subtracao(int num01, int num02) {
		return num01 - num02;
	}
	
	public double multiplicacao() {
		return n1 * n2;
	}
	
	public int multiplicacao(int num01, int num02) {
		return num01 * num02;
	}
	
	public double divisao() {
		return n1 / n2;
	}
	
	public int divisao(int num01, int num02) {
		return num01 / num02;
	}

	@Override
	public String toString() {
		return "Calculadora [n1=" + n1 + ", n2=" + n2 + "]";
	}	
}
