package exPOOum;

public class Cliente {
	
	//atributos
	private int idade;
	private String nome;
	private String cidade;
	private String telefone;
	private String genero;
	
	//metodo construtor
	public Cliente(int idade, String nome, String cidade, String telefone, String genero) {
		this.idade = idade;
		this.nome = nome;
		this.cidade = cidade;
		this.telefone = telefone;
		this.genero = genero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void visualizar() {
		System.out.println("Dados do cliente: ");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Gênero: " + this.genero);
		System.out.println("Cidade: " + this.cidade);
		System.out.println("Telefone: " + this.telefone);
	}

}
