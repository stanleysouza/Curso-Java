package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		Usuario novoUsario = new Usuario("Arthur","Arthur@lanche.com.br");
		
		em.getTransaction().begin();
		em.persist(novoUsario);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}
}
