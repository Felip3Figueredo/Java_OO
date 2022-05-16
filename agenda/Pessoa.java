package agenda;


public class Pessoa {
	String nome;
	int idade;
	double altura;
	int id;
	
	
	public Pessoa(int id, String nome, int idade, double altura) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	

	public Pessoa() {
		
	}

	
	public int getId() {
		return id;
	}



	public String getNome() {
		return nome;
	}
	

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
		
	}

	
	

}
