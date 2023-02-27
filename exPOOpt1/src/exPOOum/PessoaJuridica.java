package exPOOum;

public class PessoaJuridica extends Cliente {

	private String cnpj;
	private String nomeFantasia;
	
	public PessoaJuridica(String email, String nome, String cidade, String telefone, String interesse,
			String nomeFantasia, String cnpj) {
		super(email, nome, cidade, telefone, interesse);
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	
	public void visualizar() {
		super.visualizar();
		
		System.out.println("Nome fantasia: " + this.nomeFantasia);
		System.out.println("CNPJ: " + this.cnpj);
		System.out.println("---------------------------------------------");
	}
}
