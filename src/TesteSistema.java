
public class TesteSistema {

	public static void main(String[] args) {
		
		
	
	Gerente g = new Gerente();
	g.setSenha(2222);
	
	Administrador a = new Administrador();
	a.autentica(2325);
	
	SistemaInterno si = new SistemaInterno();
	si.autentica(g);
	si.autentica(a);
	
	}
}
