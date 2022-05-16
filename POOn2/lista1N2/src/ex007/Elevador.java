package ex007;

public class Elevador {
	private int terreo = 0;
	private int andarAtual;
	private int totalAndares;
	private int capacidadeElevador;
	private int qtdPessoasDentro;
	
	void Inicializa () {
		andarAtual = 0;
		capacidadeElevador = 0; 
	}

	void Entra () {
		while(capacidadeElevador >= qtdPessoasDentro) {
			qtdPessoasDentro ++;
		}
	}
	
	void Sai () {
		while(qtdPessoasDentro > 0) {
			qtdPessoasDentro --;
		}
	}
	
	void Sobe () {
		while (andarAtual < totalAndares && andarAtual >=0) {
			andarAtual++;
		}
	}

	public int getTerreo() {
		return terreo;
	}

	public void setTerreo(int terreo) {
		this.terreo = terreo;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

	public int getCapacidadeElevador() {
		return capacidadeElevador;
	}

	public void setCapacidadeElevador(int capacidadeElevador) {
		this.capacidadeElevador = capacidadeElevador;
	}

	public int getQtdPessoasDentro() {
		return qtdPessoasDentro;
	}

	public void setQtdPessoasDentro(int qtdPessoasDentro) {
		this.qtdPessoasDentro = qtdPessoasDentro;
	}
	
	
	

}
