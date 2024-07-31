package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento {
	public static void main(String[] args) {
		Assento assento = new Assento("13C");
		Cliente cliente = new Cliente("Daniel", assento);
		
		DAO<Object> dao = new DAO<Object>();
		
		dao.AbriT()
			.incluir(assento)
			.incluir(cliente)
			.FecharT()
			.fechar();
		
	}
}
