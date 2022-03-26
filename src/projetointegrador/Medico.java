package projetointegrador;

public class Medico extends Pessoa {
	
	private String especialidade;
	
	public Medico(String nome, String cpf, String especialidade) {
		super(nome, cpf);
		this.especialidade = especialidade;
	}

	public String getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(String especialidade) 
	{
		this.especialidade = especialidade ;
	}

}
