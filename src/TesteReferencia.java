

public class TesteReferencia {

	public static void main(String[] args) {
		//Funcionario esta ficando no lugar do gerente, pq todo Gerente é um funcionário
		//e na class gerente ele esta dando um "extends" para a classe mãe Funcionário.
		//Nesse caso, funcionário roda do lado esquerdo. Do lado direito não!!!
		//Gerente g1 = new Gerente();
		
		Gerente g1 = new Gerente();
		
		g1.setNome("marcos");
		g1.setSalario(5000.0);
		
		Funcionario f = new Funcionario();
		
		f.setNome("Juliana");
		f.setSalario(2000);
		
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500);
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ev);
		System.out.println(controle.getSoma());
	}
}
