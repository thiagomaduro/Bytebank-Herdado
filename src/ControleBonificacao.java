
public class ControleBonificacao {
	private double soma;

	//Metodo genérico, onde toda vez que chamar esse metodo pra outra classe, 
	//ele irá chamar o getBonificacao da classe certa.
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma +=  boni;

	}

	public double getSoma() {
		return soma;
	}

}
