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
		setQtdFunc(1);
	}
	
	
	public void updFunc(int id, String nome, int idade, int experiencia) {
		
	}
	
	public void rmFunc(int id) {
		
	}
	
	public void printFuncCargo(String cargo) {
		
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
	
	public String toString() {
		if(getGerente() == null)
			return "Setor de "+getNomeS()+
					 "\nGerente do Setor : Sem Gerente"+
					 "\nFuncionarios: "+
					 "\n"+funcionarios+"\n";
		else
		return "Setor de "+getNomeS()+
			 "\nGerente do Setor : "+gerente.getNome()+
			 "\nFuncionarios: "+
			 "\n"+funcionarios+"\n";
	}

	public int getQtdFunc() {
		return qtdFunc;
	}

	public void setQtdFunc(int n) {
		this.qtdFunc = qtdFunc+n;
	}

}
