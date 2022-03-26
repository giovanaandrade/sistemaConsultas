package projetointegrador;

public class Consulta {
	
	private int identificadorConsulta ; 
	private int dia;
	private int mes;
	private int ano;
	private int horaInteira;
	private Medico medico;
	private Paciente paciente;
	
	public Consulta(int identificadorConsulta, int dia, int mes, int ano, int horaInteira, Medico medico,
			Paciente paciente) {
		super();
		this.identificadorConsulta = identificadorConsulta;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.horaInteira = horaInteira;
		this.medico = medico;
		this.paciente = paciente;
	}

	public int getIdentificadorConsulta() {
		return identificadorConsulta;
	}
	public void setIdentificadorConsulta(int identificadorConsulta) {
		this.identificadorConsulta = identificadorConsulta;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getHoraInteira() {
		return horaInteira;
	}
	public void setHoraInteira(int horaInteira) {
		this.horaInteira = horaInteira;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
}