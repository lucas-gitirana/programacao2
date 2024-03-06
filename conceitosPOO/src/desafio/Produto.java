package desafio;

public class Produto {

	private Long codigo;
	private String descricao;
	private int estoque;
	private double valorUnitario;
	
	public Produto() {
		this.codigo = 0l;
		this.descricao = "";
		this.estoque = 0;
		this.valorUnitario = 0;
	}
	
	public Produto(Long codigo, String descricao, int estoque, double valorUnitario) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.estoque = estoque;
		this.valorUnitario = valorUnitario;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", estoque=" + estoque + ", valorUnitario="
				+ valorUnitario + "]";
	}	
}
