
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario thiago = new Funcionario();

		thiago.setNome("Thiago Maduro");
		thiago.setCpf("222.222.222-00");
		thiago.setSalario(5000);
		System.out.println(thiago.getNome());
		System.out.println(thiago.getBonificacao());

	}
}
