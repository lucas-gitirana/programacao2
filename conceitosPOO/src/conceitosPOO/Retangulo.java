package conceitosPOO;

public class Retangulo {
	private double altura;
	private double largura;
	
	public Retangulo() {
		this.altura = 0;
		this.largura = 0;
	}
	
	public Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public boolean setAltura(double altura) {		
		if(altura > 0) {
			this.altura = altura;
			return true;
		}
		else {
			return false;
		}			
	}

	public double getLargura() {
		return largura;
	}

	public boolean setLargura(double largura) {
		if(largura > 0) {
			this.largura = largura;
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getArea() {
		return this.altura * this.largura;
	}
	
	public double getPerimetro() {
		return (this.altura * 2) + (this.largura * 2);
	}

	@Override
	public String toString() {
		return "Retangulo [altura=" + altura + ", largura=" + largura + "]";
	}		
}
