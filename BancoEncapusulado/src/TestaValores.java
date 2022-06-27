
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337,24563);
		/*conta esta inconsistente a nossa regra de negocio
		/
		conta.setAgencia(-50);
		conta.setNumero(-330);
		*/
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337,15425);
		System.out.println(conta2.getAgencia());
		Conta conta3 = new Conta(1337,15425);
		System.out.println(conta3.getAgencia());
		
		System.out.println(Conta.getTotal());
	}

}
