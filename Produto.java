package desafio;

// @autor Lucas Emanoel Gitirana - Engenharia de Software UDESC

public class Produto {

	private Long id;
	private String descricao;
	private int estoque;
	private double valorUnitario;
	
	public Produto() {
		this.id = 0l;
		this.descricao = "";
		this.estoque = 0;
		this.valorUnitario = 0;
	}
	
	public Produto(Long codigo, String descricao, int estoque, double valorUnitario) {
		this.id = codigo;
		this.descricao = descricao;
		this.estoque = estoque;
		this.valorUnitario = valorUnitario;
	}

	public Long getId() {
		return id;
	}

	public boolean setId(Long id) {
		
		if(id > 0) {
			this.id = id;
			return true;
		} else {
			return false;
		}
	}

	public String getDescricao() {
		return descricao;
	}

	public boolean setDescricao(String descricao) {
		
		if(!descricao.isBlank()) {
			this.descricao = descricao;
			return true;
		}else {
			return false;
		}
	}

	public int getEstoque() {
		return estoque;
	}

	public boolean setEstoque(int estoque) {
		
		if(estoque >= 0) {
			this.estoque = estoque;
			return true;
		} else {
			return false;
		}
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public boolean setValorUnitario(double valorUnitario) {
		
		if(valorUnitario >= 0) {
			this.valorUnitario = valorUnitario;
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Produto [ID=" + id + ", descricao=" + descricao + ", estoque=" + estoque + ", valorUnitario="
				+ valorUnitario + "]";
	}
	
	
}
