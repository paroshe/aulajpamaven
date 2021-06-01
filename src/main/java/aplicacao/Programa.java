package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		//INSERÇÃO DE DADOS NO BANCO COM PERSISTÊNCIA
		/*Pessoa p1 = new Pessoa(null, "Juliete Cardoso", "julietecardoso@gmail.com");
		Pessoa p2 = new Pessoa(null, "Gilberto Mendes", "gilbertomendes@gmail.com");
		Pessoa p3 = new Pessoa(null, "Cristina Arruda","crisarruda@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().begin();
		em.getTransaction().commit();*/
		
		//---------------------------------------------------------------------------------
		
		//BUSCA DE DADOS NO BANCO
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);
		
		//---------------------------------------------------------------------------------
		
		//EXCLUIR DADOS DO BANCO
		/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();*/
		
		/*Pessoa p = em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();*/
		
		//--------------------------------------------------------------------------------
		
		System.out.println("Acabou! É TETRA!");
		em.close();
		emf.close();
	}
}
