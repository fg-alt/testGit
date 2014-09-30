package com.societe.blog.front;

@ManagedBean
@RequestScoped
public class MasterDetailsManagedBean {

	private String toto;

	@NotNull
	@NotEmpty
	private String nom;

	@NotNull
	@NotEmpty
	private String prenom;

	@NotNull
	@Email
	private String email;

	private String tata4;
	private String tata33;

	private String tutu;

	private String tata2;

	public String enregisterContact() {
		return "detail";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
