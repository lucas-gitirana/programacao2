package conceitosPOO;

public class Carro {
	
	//Exercício 01
	
	private String placa;
	private String marca;
	private String modelo;
	private String cor;
	
	public Carro() {
		this.placa = "";
		this.marca = "";
		this.modelo = "";
		this.cor = "";
	}
	
	public Carro(String placa, String marca, String modelo, String cor) {
		setPlaca(placa);
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
	}		
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		if(placa.length() != 8) {
			System.out.println("Placa Inválida!");
		}
		else {
			this.placa = placa;
		}
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String toString() {
		return "Placa: "+this.placa+", Marca: "+this.marca+", Modelo: "+this.modelo+", Cor: "+this.cor+";";
	}
		

}
