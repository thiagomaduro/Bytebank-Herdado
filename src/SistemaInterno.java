
public class SistemaInterno {

	private int senha = 2222;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Voc� est� no nosso sistema interno. Seja bem vindo");
		} else {
			System.out.println("Voc� n�o tem permiss�o para entrar no nosso sistema interno!");
		}
	}
}
