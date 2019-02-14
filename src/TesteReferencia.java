
public class TesteReferencia {

	public static void main(String[] args) {
		// Funcionario esta ficando no lugar do gerente, pq todo Gerente é um
		// funcionário
		// e na class gerente ele esta dando um "extends" para a classe mãe
		// Funcionário.
		// Nesse caso, funcionário roda do lado esquerdo. Do lado direito não!!!
		// Gerente g1 = new Gerente();

		Gerente g1 = new Gerente();

		g1.setNome("marcos");
		g1.setSalario(5000.0);

		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500);

		Designer d = new Designer();
		d.setSalario(1000);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		System.out.println(controle.getSoma());
	}
}
