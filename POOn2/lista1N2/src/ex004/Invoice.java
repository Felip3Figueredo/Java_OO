package ex004;

public class Invoice {
	int numeroDoItem;
	String descItem;
	double quant;
	double precUnitario;

	public Invoice(int numeroDoItem, String descItem, double quant, double precUnitario) {
		super();
		this.numeroDoItem = numeroDoItem;
		this.descItem = descItem;
		this.quant = quant;
		this.precUnitario = precUnitario;
	}

	public Invoice() {
	}

	public static double getInvoiceAmount(double quant, double precUnitario) {
		return quant * precUnitario;
	}

	public int getNumeroDoItem() {
		return numeroDoItem;
	}

	public void setNumeroDoItem(int numeroDoItem) {
		this.numeroDoItem = numeroDoItem;
	}

	public String getDescItem() {
		return descItem;
	}

	public void setDescItem(String descItem) {
		this.descItem = descItem;
	}

	public double getQuant() {
		return quant;
	}

	public void setQuant(double quant) {
		this.quant = quant;
	}

	public double getPrecUnitario() {
		return precUnitario;
	}

	public void setPrecUnitario(double precUnitario) {
		this.precUnitario = precUnitario;
	}

	public String toString() {
		return "Numero do item: " + numeroDoItem + "\nDescrição: " + descItem
				+ String.format("\nValor do faturamento: R$ %.2f", +getInvoiceAmount(quant, precUnitario));
	}

}
