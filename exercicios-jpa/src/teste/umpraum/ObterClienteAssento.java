package teste.umpraum;

import com.mysql.fabric.xmlrpc.Client;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {
	public static void main(String[] args) {
		DAO<Cliente> daocliente = new DAO<>(Cliente.class);
		
		Cliente cliente = daocliente.ObterPorID(1L);
		
		System.out.println(cliente.getAssento().getNome());
		
		daocliente.fechar();
		
		DAO<Assento> daoassento = new DAO<>(Assento.class);
		Assento assento = daoassento.ObterPorID(1L);
		System.out.println(assento.getCliente().getNome());
		
	}
}
