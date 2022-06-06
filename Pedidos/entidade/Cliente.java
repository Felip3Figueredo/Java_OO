package entidade;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	String nome;
	String email;
	Date dataDeAniversario;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Cliente(String nome, String email, Date nascimento) {
		super();
		this.nome = nome;
		this.email = email;
		this.dataDeAniversario = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataDeAniversario() {
		return dataDeAniversario;
	}

	public void setDataDeAniversario(Date dataDeAniversario) {
		this.dataDeAniversario = dataDeAniversario;
	}
	
	public String toString() {
		
		return "Nome: " + nome  
			+	", Email: " + email
			+ ", Nascimento: " + sdf.format(getDataDeAniversario());
	}
	

}
