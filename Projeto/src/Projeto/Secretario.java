package Projeto;

public class Secretario extends Funcionario {
	
	private float salarioSecretario;

	public Secretario(int id, String nome, int idade, String cargo, String sexo, int experiencia) {
		super(id, nome, idade, cargo, sexo, experiencia);
		this.salarioSecretario = 3000;
		setSalario(experiencia); 
	}
	
	public void setSalario(int experiencia) {
		this.salario = this.salarioSecretario +(this.salarioSecretario*experiencia*0.07f);
	}
}
