
public class SistemaInterno {

	private int senha = 2222;
	
	public void autentica(Autenticavel a) {
		boolean autenticou = a.autentica(this.senha);
		if(autenticou) {
			System.out.println("Voce esta no nosso sistema interno. Seja bem vindo");
		} else {
			System.out.println("Voce nao tem permissao para entrar no nosso sistema interno!");
		}
	}
}
