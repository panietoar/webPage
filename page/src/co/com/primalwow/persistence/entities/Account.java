package co.com.primalwow.persistence.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * The persistent class for the account database table.
 * 
 */
@Entity
@Table(name = "account")
@NamedQuery(name = "Account.findAll", query = "SELECT a FROM Account a")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String email;
	private int expansion;
	private Timestamp joindate;
	private String regMail;
	private String shaPassHash;
	private String username;

	private String clave;

	public Account() {
	}

	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getExpansion() {
		return this.expansion;
	}

	public void setExpansion(int expansion) {
		this.expansion = expansion;
	}

	public Timestamp getJoindate() {
		return this.joindate;
	}

	public void setJoindate(Timestamp joindate) {
		this.joindate = joindate;
	}

	@Column(name = "reg_mail")
	public String getRegMail() {
		return this.regMail;
	}

	public void setRegMail(String regMail) {
		this.regMail = regMail;
	}

	@Column(name = "sha_pass_hash")
	public String getShaPassHash() {
		return this.shaPassHash;
	}

	public void setShaPassHash(String shaPassHash) {
		this.shaPassHash = shaPassHash;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Transient
	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

}