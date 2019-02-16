
public class Gerente implements Autenticavel{
	

	
	@Override
	public double getBonificacao() {
		System.out.println("Usando a bonificacao do gerente");
		//usando o metodo super para pegar o método da super class
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
}
