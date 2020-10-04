package Projeto;

public class Main {

	public static void main(String[] args) {
		Empresa empresa = new Empresa("POO Ltda");
		
		Gerente gerenteR = empresa.cadGerente("Carlos", 18, "Gerente", "Masculino", 50);
		empresa.addSetor("Roupas", gerenteR);
		empresa.ListSetores();
		Gerente gerenteR2 = empresa.cadGerente("Carlos", 18, "Gerente", "Masculino", 59);
		empresa.addSetor("Roupas", gerenteR2);
		Gerente gerenteR3 = empresa.cadGerente("Maria", 18, "Gerente", "Masculino", 3);
		empresa.addSetor("Brinquedos", gerenteR3);
		
		empresa.cadFunc("Roupas", "Edinaldo", 19, "Faxineiro", "Masculino", 10);
		empresa.cadFunc("Roupas", "Layza", 20, "Secretário", "Feminino", 10);
		
		empresa.ListFunc();
		empresa.ListSetores();
		
		empresa.ListFuncCargo("Faxineiro");
		
		empresa.ListQtdFuncSetor("Roupas");
	}

}
