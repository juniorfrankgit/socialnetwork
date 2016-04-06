package socialnetwork.model;

import java.util.ArrayList;
import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Embedded;
/**
 *Model class which will store the users
 *This class represent a table on the data base
 * @author frank
 *
 */
@Entity
@SuppressWarnings("serial") 
public class User implements java.io.Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String lastname;
	private String password;
	private String firstname;
	private String email;
	
	public User(Long id,String lastname,String firstname,String email, 
			String password) {
		super();
		this.lastname = lastname;
		this.password = password;
		this.firstname = firstname;
		this.email = email;
		this.id = id;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
