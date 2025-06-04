package modelo;

public class produto {
	
	private String id, nome;
	private int quantidade, estoque;
	private double precoCompra, precoVenda;
	
	
	public produto(String id, String nome, int quantidade, int estoque, double precoCompra, double precoVenda) {
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.estoque = estoque;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public int getEstoque() {
		return estoque;
	}


	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}


	public double getPrecoCompra() {
		return precoCompra;
	}


	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}


	public double getPrecoVenda() {
		return precoVenda;
	}


	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	public double getLucro() {
		if(precoCompra == 0) {
			return 0;
		}
		
		return ((precoVenda - precoCompra)/precoCompra * 100);
		
		
	}


	@Override
	public String toString() {
		return "produto [id=" + id + ", nome=" + nome + ", quantidade=" + quantidade + ", estoque=" + estoque + ", precoCompra=" + precoCompra + ", precoVenda=" + precoVenda + ", getLucro()=" + getLucro() + "]";
	}
	
	

}
