package Projeto;

import java.util.ArrayList;

public class Empresa {
	
	private String nome;
	private ArrayList<Funcionario> funcionarios;
	private ArrayList<Setor> setores;
	private int idFunc;
	private int qtdFunc;
	
	public Empresa (String nome) {
		setNome(nome);
		funcionarios = new ArrayList<Funcionario>();
		setores = new ArrayList<Setor>();
		this.idFunc = 100;
		this.qtdFunc = 0;
	}
	
	public void addSetor(String setorS, String nome, int idade, String cargo, String sexo, int experiencia) {
		boolean igual = false;
		for(Setor setor: setores) {
			if(setor.getNomeS() == setorS) {
				igual = true;	
				break;
			}
		}
		if(igual)
			System.out.println("O setor Informado j� existe !!!");
		else {
			Gerente auxG = new Gerente(idFunc, nome, idade, cargo, sexo, experiencia);
			funcionarios.add(auxG);
			idFunc++;
			setQtdFunc(1);
			Setor auxS = new Setor(setorS, auxG);
			setores.add(auxS);
			System.out.println("Setor de "+auxS.getNomeS()+" Criado com Sucesso!!!");
		}		
	}
	
	public void cadFunc(String setorS, String nome, int idade, String cargo, String sexo, int experiencia) {
		if(verifCad(idade, sexo, experiencia)) {
			for(Setor setor: setores) {
				if(setor.getNomeS() == setorS) {
					if(cargo == "Faxineiro") {
						Faxineiro auxF = new Faxineiro(idFunc, nome, idade, cargo, sexo, experiencia);
						setor.addFunc(auxF);
						funcionarios.add(auxF);
					}else if(cargo == "Secret�rio") {
						Secretario auxS = new Secretario(idFunc, nome, idade, cargo, sexo, experiencia);
						setor.addFunc(auxS);
						funcionarios.add(auxS);
					}else if(cargo == "Atendente") {
						Atendente auxA = new Atendente(idFunc, nome, idade, cargo, sexo, experiencia);
						setor.addFunc(auxA);
						funcionarios.add(auxA);
					}
					setQtdFunc(1);
					idFunc++;
				}
			}
		}
		
	}
	
	private boolean verifCad(int idade, String sexo, int experiencia) {
		if(idade < 18 || (sexo != "Masculino" && sexo != "Feminino") 
		 || experiencia < 0) {
			return false;
		}else {
			return true;
		}	 
	}
	
	
	public boolean AtualizarFunc (int id, String nome, int idade, int experiencia) {
		boolean have = false;
		for(Funcionario funcionario: funcionarios) {
			if(funcionario.getId() == id) {
				have = true;
				funcionario.setNome(nome);
				funcionario.setExperiencia(experiencia);
				funcionario.setIdade(idade);
			}
		}	
		return have;
	}
	
	public boolean RemoverFunc (int id) {
		boolean have = false;
		for(Funcionario funcionario: funcionarios) {
			if(funcionario.getId() == id) {
				have = true;
				funcionarios.remove(funcionario);
			}
		}	
		return have;
	}
	
	public void ListFunc () {
		System.out.println("Empresa:"+getNome());
		System.out.println("\nFuncion�rios: \n"+funcionarios);
	}
	
	public void ListSetores () {
		System.out.println("Setores: \n");
		System.out.println(setores);
		
	}
	
	public void ListFuncCargo (String cargo) {
		System.out.println(cargo+"s da empresa: ");
		for(Funcionario funcionario: funcionarios) {
			if(funcionario.getCargo() == cargo) {
				System.out.println(funcionario);
			}
		}
	}
	
	public void BuscarFunc (String nome) {
		for(Funcionario funcionario: funcionarios) {
			if(funcionario.getNome() == nome) {
				System.out.println(funcionario);
				break;
			}	
		}
	}
	
	public void ListQtdFuncSetor (String setorS) {
		int nFunc = 0;
		for(Setor setor: setores) {
			if(setor.getNomeS() == setorS) 
				nFunc = setor.getQtdFunc();
		}
		
		if(nFunc <= 0)
			System.out.println("O Setor de "+setorS+" n�o possui funcion�rios al�m do Gerente!!!");
		else if(nFunc == 1)
			System.out.println("O Setor de "+setorS+" possui apenas 1 funcion�rio al�m do Gerente!!!");
		else
			System.out.println("O Setor de "+setorS+" possui "+nFunc+" funcion�rio al�m do Gerente!!!");
	}
	
	public void ListQtdTotalFunc () {
		
	}
	
	public void TrocarGerente (String setorS, String nome, int idade, String cargo, String sexo, int experiencia) {
		if(verifCad(idade, sexo, experiencia)) {	
			for(Setor setor: setores) {
				if(funcionario.getId() == id) {
					
				}
			}	
		}
	}
	
	public void RemoverSetor(String setorS) {
		for(Setor setor: setores) {
			if(setor.getNomeS() == setorS) 
				setores.remove(setor);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdFunc() {
		return qtdFunc;
	}

	public void setQtdFunc(int n) {
		this.qtdFunc = qtdFunc+n;
	}
	

}
