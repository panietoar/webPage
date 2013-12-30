package co.com.primalwow.view.ui;

import java.sql.Timestamp;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import co.com.primalwow.persistence.entities.Account;
import co.com.primalwow.services.AccountSvc;
import co.com.primalwow.utils.Encriptador;

@ManagedBean
@ViewScoped
public class RegistroUI {
	
	private AccountSvc cuentaSvc = AccountSvc.getInstance();
	
	private Account cuenta;

	@PostConstruct
	public void init(){
		
		cuenta = new Account();
		
	}
	
	public String crearCuenta(){
		try {
			cuenta.setShaPassHash(Encriptador.encriptarClave(cuenta.getUsername(), cuenta.getClave()));
			cuenta.setExpansion(2);
			cuenta.setJoindate(new Timestamp(new Date().getTime()));
			cuentaSvc.instertarCuenta(cuenta);
			System.out.println("Cuenta creada");
			cuenta = new Account();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public Account getCuenta() {
		return cuenta;
	}

	public void setCuenta(Account cuenta) {
		this.cuenta = cuenta;
	}

}
