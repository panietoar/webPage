package co.com.primalwow.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import co.com.primalwow.persistence.entities.Account;

public class AccountSvc {

	private static AccountSvc instance;
	private EntityManagerFactory emFactory;
	
	public static AccountSvc getInstance(){
		if(instance == null){
			instance = new AccountSvc();
		}
		return instance;
	}
	
	private AccountSvc(){
		emFactory = Persistence.createEntityManagerFactory("hibernate.pagina");
	}

	public Account instertarCuenta(Account nuevaCuenta) throws Exception{
		
		EntityManager em = emFactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(nuevaCuenta);
		em.getTransaction().commit();
		em.close();
		return nuevaCuenta;
	}
	
}
