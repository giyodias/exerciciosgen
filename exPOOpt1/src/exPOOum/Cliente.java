package exPOOum;

public class Cliente {
	
	private String email;
	private String nome;
	private String cidade;
	private String telefone;
	private String interesse;
	
	public Cliente(String email, String nome, String cidade, String telefone, String interesse) {
		
		this.email = email;
		this.nome = nome;
		this.cidade = cidade;
		this.telefone = telefone;
		this.interesse = interesse;
	}

	
	
	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCidade() {
		return cidade;
	}



	public void setCidade(String cidade) {
		this.cidade = cidade;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public String getInteresse() {
		return interesse;
	}



	public void setInteresse(String interesse) {
		this.interesse = interesse;
	}



	public void visualizar() {

		System.out.println("---------------------------------------------");
		System.out.println("             Dados do cliente:               ");
		System.out.println("---------------------------------------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("E-mail: " + this.email);
		System.out.println("Cidade: " + this.cidade);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Interesse: " + this.interesse);
		
	}

}
