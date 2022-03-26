package projetointegrador;

import java.util.ArrayList;
import java.util.Scanner;

public class InterfaceDeUsuario {

	public boolean mostrarMenu = true;
	private ArrayList<Medico> listaMedicos = new ArrayList<Medico>();
	private ArrayList<Paciente> listaPacientes = new ArrayList<Paciente>();
	private ArrayList<Consulta> listaConsultas = new ArrayList<Consulta>();
	Scanner entrada = new Scanner(System.in);

	public void apresentarInterface() {
		while(mostrarMenu) {
		this.mostrarMenuOpcoes();
		int opcao = entrada.nextInt();
			switch (opcao) {
			case 0:
				mostrarMenu = false;
				break;
			case 1: // cadastrar médicos
				System.out.println("Nome: ");
				String nomeMedico = entrada.next();
				System.out.println("CPF: ");
				String cpfMedico = entrada.next();
				System.out.println("Especialidade: ");
				String especialidadeMedico = entrada.next();
				Medico medico = new Medico(nomeMedico, cpfMedico, especialidadeMedico);
				listaMedicos.add(medico);
				break;

			case 2: // cadastrar pacientes
				System.out.println("Nome: ");
				String nomePaciente = entrada.next();
				System.out.println("CPF: ");
				String cpfPaciente = entrada.next();
				System.out.println("Endereço: ");
				String enderecoPaciente = entrada.next();
				Paciente paciente = new Paciente(nomePaciente, cpfPaciente, enderecoPaciente);
				listaPacientes.add(paciente);
				break;

			case 3: // realizar agendamentos
				System.out.println("Número para identificar consulta (inteiro): ");
				int identificadorConsulta = entrada.nextInt();
				System.out.println("Dia: ");
				int diaConsulta = entrada.nextInt();
				System.out.println("Mês: ");
				int mesConsulta = entrada.nextInt();
				System.out.println("Ano: ");
				int anoConsulta = entrada.nextInt();
				System.out.println("Hora inteira: ");
				int horaConsulta = entrada.nextInt();
				System.out.println("CPF do médico: ");
				String cpfMedicoConsulta = entrada.next();
				System.out.println("CPF do paciente: ");
				String cpfPacienteConsulta = entrada.next();
				Medico medicoConsulta = getMedicoByCpf(cpfMedicoConsulta);
				Paciente pacienteConsulta = getPacienteByCpf(cpfPacienteConsulta);
				Consulta consulta = new Consulta(identificadorConsulta, diaConsulta, mesConsulta, anoConsulta,
						horaConsulta, medicoConsulta, pacienteConsulta);
				listaConsultas.add(consulta);
				break;

			case 4: // verificar consultas
				for (int i = 0; i < listaConsultas.size(); i++) {
					System.out.println(listaConsultas.get(i).getIdentificadorConsulta());
					System.out.println(listaConsultas.get(i).getDia());
					System.out.println(listaConsultas.get(i).getMes());
					System.out.println(listaConsultas.get(i).getAno());
					System.out.println(listaConsultas.get(i).getHoraInteira());
				}
				break;

			case 5: // consultar pacientes
				for (int i = 0; i < listaPacientes.size(); i++) {
					System.out.println(listaPacientes.get(i).getNome());
					System.out.println(listaPacientes.get(i).getCpf());
					System.out.println(listaPacientes.get(i).getEndereco());

				}
				break;

			case 6: // consultar médicos
				for (int i = 0; i < listaMedicos.size(); i++) {
					System.out.println(listaMedicos.get(i).getNome());
					System.out.println(listaMedicos.get(i).getCpf());
					System.out.println(listaMedicos.get(i).getEspecialidade());
				}
				break;

			case 7: // consultar especialidades
				for (int i = 0; i < listaMedicos.size(); i++) {
					System.out.println(listaMedicos.get(i).getEspecialidade());
				}
				break;

			}

		}

	}

	private void mostrarMenuOpcoes() {
		System.out.println("1.Cadastrar Médico");
		System.out.println("2.Cadastrar Paciente");
		System.out.println("3.Marcar Consulta");
		System.out.println("4.Verificar Consultas Marcadas");
		System.out.println("5.Verificar Pacientes Cadastrados");
		System.out.println("6.Verificar Médicos Cadastrados");
		System.out.println("7.Verificar Especialidades Disponíveis");
		System.out.println("0.Sair");
	}
	
	private Medico getMedicoByCpf(String cpf) {
		for(Medico medico : listaMedicos) {
			if(medico.getCpf().equals(cpf)) {
				return medico;
			}
		}
		return null;
	}

	private Paciente getPacienteByCpf(String cpf) {
		for(Paciente paciente : listaPacientes) {
			if(paciente.getCpf().equals(cpf)) {
				return paciente;
			}
		}
		return null;
	}
}
