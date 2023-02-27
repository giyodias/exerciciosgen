package exPOOum;

public class PessoaFisica extends Cliente {

	private String cpf;
	private String apelido;
	
	
	public PessoaFisica(String email, String nome, String cidade, String telefone, String interesse,
			String apelido, String cpf) {
		
		super(email, nome, cidade, telefone, interesse);
		this.apelido = apelido;
		this.cpf = cpf;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getApelido() {
		return apelido;
	}


	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	public void visualizar() {
		super.visualizar();
		

		System.out.println("Apelido: " + this.apelido);
		System.out.println("CPF: " + this.cpf);
		
	}
	
}
