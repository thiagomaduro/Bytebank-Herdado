
public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Gerente Loucão");
		g1.setCpf("783648746");
		g1.setSalario(5000.0);
		
		
		g1.setSenha(2222);
		boolean autenticou = g1.autentica(2222);
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	}
}
