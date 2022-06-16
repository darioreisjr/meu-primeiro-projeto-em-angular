//Gerente e um funcionario, gerente herda da class Funcionario
public class Gerente extends Funcionario {

	private double senha;
	
	public void setSenha(double senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}
	
	
}
