package Projeto;

import java.util.ArrayList;

public class Setor {
	private String nomeS;
	private Gerente gerente;
	private ArrayList<Funcionario> funcionarios;
	private int qtdFunc;
	
	public Setor(String nomeS, Gerente gerente) {
		setNomeS(nomeS);
		this.gerente = gerente;
		funcionarios = new ArrayList<Funcionario>();
		this.qtdFunc = 1;
	}
	
	public void addFunc(Funcionario func) {
		funcionarios.add(func);
	}
	
	
	public void updFunc(int id, String nome, int idade, int experiencia) {
		
	}
	
	public void rmFunc(int id) {
		
	}
	
	public void show(){
		
	}
	
	public void printFuncCargo(String cargo) {
		
	}
	
	public void searchFunc(String nome) {
		
	}
	
	public int qtdSetor(){
		return 0;
	}
	
	public void updGerente(Gerente gerente) {
		
	}

	public String getNomeS() {
		return nomeS;
	}

	public void setNomeS(String nomeS) {
		this.nomeS = nomeS;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	
	public String toString() {
		return "Setor de "+getNomeS()+
			 "\nGerente do Setor : "+gerente.getNome()+
			 "\nFuncionarios: "+
			 "\n"+funcionarios+"\n";
	}

	public int getQtdFunc() {
		return qtdFunc;
	}

	public void setQtdFunc() {
		this.qtdFunc = qtdFunc+1;
	}

}
