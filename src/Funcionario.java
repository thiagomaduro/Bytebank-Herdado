//Nao pode instanciar dessa classe, pq ela eh abstrata 
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	//Metodo abstrato, que so pode ser utilizado pelos filhos!
	//eh obrigatorio o filho declarar esse metodo!
	public abstract double getBonificacao(); 

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
