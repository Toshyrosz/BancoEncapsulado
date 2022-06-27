
public class TestaGetSet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337,24563);
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente daniel = new Cliente();
		
		daniel.setNome("Daniel Venancio");
		conta.setTitular(daniel);
		
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("programador");
		System.out.println(conta.getTitular().getProfissao());
		
		
	}

}
