
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
		//usando o metodo super para pegar o método da super class
		return super.getBonificacao() + super.getSalario();
	}
	
	
	
	
}
