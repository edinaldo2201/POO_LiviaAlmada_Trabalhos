package Projeto;

import java.util.ArrayList;

public class Empresa {
	
	private String nomeEmp;
	private ArrayList<Funcionario> funcionarios;
	private ArrayList<Setor> setores;
	private int idFunc;
	private int qtdFunc;
	
	public Empresa (String nomeEmp) {
		setNomeEmp(nomeEmp);
		funcionarios = new ArrayList<Funcionario>();
		setores = new ArrayList<Setor>();
		this.idFunc = 100;
		this.qtdFunc = 0;
	}
	
	public void addSetor(String setorS, Gerente gerente) {
		boolean igual = false;
		for(Setor setor: setores) {
			if(setor.getNomeS() == setorS) {
				igual = true;	
				break;
			}
		}
		if(igual)
			System.out.println("O setor Informado já existe !!!");
		else {
			Setor auxS = new Setor(setorS, gerente);
			setores.add(auxS);
			System.out.println("Setor de "+auxS.getNomeS()+" Criado com Sucesso!!!");
		}		
	}
	
	public void cadFunc(String setorS, String nome, int idade, String cargo, String sexo, int experiencia) {
		if(verifCad(idade, sexo, experiencia)) {
			for(Setor setor: setores) {
				if(setor.getNomeS() == setorS && setor.getGerente() != null) {
					if(cargo == "Faxineiro") {
						Faxineiro auxF = new Faxineiro(idFunc, nome, idade, cargo, sexo, experiencia);
						setor.addFunc(auxF);
						funcionarios.add(auxF);
					}else if(cargo == "Secretário") {
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
		System.out.println("Empresa:"+getNomeEmp());
		System.out.println("\nFuncionários: \n"+funcionarios);
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
			System.out.println("O Setor de "+setorS+" não possui funcionários!!!");
		else if(nFunc == 1)
			System.out.println("O Setor de "+setorS+" não possui funcionários além do Gerente!!!");
		else
			System.out.println("O Setor de "+setorS+" possui "+nFunc+" funcionários, incluindo o Gerente!!!");
	}
	
	public void ListQtdTotalFunc () {
		System.out.println("Total de Funcionários na empresa: "+getQtdFunc());
	}
	
	public Gerente cadGerente(String nome, int idade, String cargo, String sexo, int experiencia) {
		if(experiencia >= 50 && verifCad(idade, sexo, experiencia)) {
			Gerente auxG = new Gerente(idFunc, nome, idade, cargo, sexo, experiencia);
			funcionarios.add(auxG);
			idFunc++;
			setQtdFunc(1);
			System.out.println("Gerente Cadastrado com sucesso!!!");
			return auxG;
		}else
			System.out.println("O Gerente Não possui o Nível de experiência mínimo exigido!!!");
		
		return null;
	}
	
	public void TrocarGerente (String setorS, String nome, int idade, String cargo, String sexo, int experiencia) {
		
	}
	
	public void RemoverSetor(String setorS) {
		for(Setor setor: setores) {
			if(setor.getNomeS() == setorS && setor.getQtdFunc() == 0) 
				setores.remove(setor);
		}
	}

	public void setNomeEmp(String nomeEmp) {
		this.nomeEmp = nomeEmp;
	}
	public String getNomeEmp() {
		return this.nomeEmp;
	}
	public void setQtdFunc(int n) {
		this.qtdFunc = qtdFunc+n;
	}
	public int getQtdFunc() {
		return qtdFunc;
	}
	

}
