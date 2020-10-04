package Projeto;

public class Gerente extends Funcionario{
	private float salarioGerente;
	
	public Gerente(int id, String nome, int idade, String cargo, String sexo, int experiencia) {
		super(id, nome, idade, cargo, sexo, experiencia);
		this.salarioGerente = 5000;
		setSalario(experiencia);
	}
	
	public void setSalario(int experiencia) {
		this.salario = this.salarioGerente +(this.salarioGerente*experiencia*0.02f);
	}
}
