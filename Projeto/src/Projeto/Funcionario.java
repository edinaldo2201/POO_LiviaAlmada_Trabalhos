package Projeto;

public class Funcionario {
	private int id;
	private String nome;
	private int idade;
	private String cargo;
	private String sexo;
	private int experiencia;
	protected float salario;
	
	public Funcionario(int id, String nome, int idade, String cargo, String sexo, int experiencia) {
		this.setId(id);
		this.setNome(nome);
		this.setIdade(idade);
		this.setCargo(cargo);
		this.setSexo(sexo);
		this.setExperiencia(experiencia);	
		this.setSalario(experiencia);
	}
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(int experiencia) {
		
	}
	
	public String toString() {
		return "ID: "+getId()+" | Nome: "+getNome()+" | Idade: "+getIdade()+
		"\n"+"Sexo: "+getSexo()+" | Cargo: "+getCargo()+" | Salário: "+getSalario()+"\n"+
		"-----------------------------------------------------------------------------------------\n";
		
	}

}
