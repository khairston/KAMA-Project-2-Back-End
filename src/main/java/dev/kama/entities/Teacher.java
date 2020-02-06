package dev.kama.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TEACHER")
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "T_ID")
	private int tId;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "fname")
	private String fname;
	
	@Column(name = "lname")
	private String lname;

	@OneToMany(mappedBy = "teacher", fetch = FetchType.EAGER)
	private Set<Report> reports = new HashSet<Report>();
	
	public Teacher() {
		super();
	}

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}


	@Override
	public String toString() {
		return "Teacher [tId=" + tId + ", username=" + username + ", password=" + password + ", fname=" + fname
				+ ", lname=" + lname + "]";
	}
	
}
