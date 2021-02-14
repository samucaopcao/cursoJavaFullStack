package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

//Realmente e somente receber alguem que tenha o contrato com a 
//interface de permitirAcesso e chamar o método autenticar

public class FuncaoAutenticacao {

	private PermitirAcesso permitirAcesso;

	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}

	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
}
