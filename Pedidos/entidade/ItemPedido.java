package entidade;

public class ItemPedido {
	Integer quantidade;
	Double preco;
	
	Produto prod = new Produto();
	
	public ItemPedido(Integer quantidade, Double preco) {
		super();
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Double subTotal() {
		return quantidade*preco;
	}
	
}
