package natan.io.projeto1.entity;

import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

	@org.springframework.data.annotation.Id
	private String id;
	private String name;
	private String email;

	public User() {
	}

	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	private Set<Role> roles;

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
