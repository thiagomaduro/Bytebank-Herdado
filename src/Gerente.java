
public class Gerente extends Funcionario{
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	 
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
			}
	}
	
	@Override
	public double getBonificacao() {
		System.out.println("Usando a bonificacao do gerente");
		//usando o metodo super para pegar o método da super class
		return super.getSalario();
	}
	
	
	
	
}
