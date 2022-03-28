package projetointegrador;

public class Paciente extends Pessoa {
	private String endereco;

	public Paciente(String nome, String cpf, String endereco) {
		super(nome, cpf);
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Nome do médico: " + this.getNome() + " - CPF: " + this.getCpf() + " - endereço: " + this.getEndereco();
	}

}
