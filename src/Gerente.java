//Gerente eh um Funcionario e assina um Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();

	}

	@Override
	public double getBonificacao() {
		System.out.println("Usando a bonificacao do gerente");
		// usando o metodo super para pegar o método da super class
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);

	}
}
