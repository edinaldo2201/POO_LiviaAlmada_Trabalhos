package Projeto;

public class Main {

	public static void main(String[] args) {
		Empresa empresa = new Empresa("POO Ltda");
		
		empresa.addSetor("Roupas", "Carlos", 18, "Gerente", "Masculio", 12);
		empresa.ListSetores();
		empresa.addSetor("Roupas", "Carlos", 18, "Gerente", "Masculio", 12);
		empresa.addSetor("Brinquedos", "Maria", 18, "Gerente", "Masculio", 12);
		
		empresa.cadFunc("Roupas", "Edinaldo", 19, "Faxineiro", "Masculino", 10);
		
		empresa.ListFunc();
		empresa.ListSetores();
		
		empresa.ListFuncCargo("Faxineiro");
		
		empresa.ListQtdFuncSetor("Roupas");
	}

}
