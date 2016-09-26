package bean;

import java.util.Date;

public class Produit {

	private String id;
	private String nom;
	private Prix prix;
	private String description;
	private String image;
	private Date dateDeDisponibilite;
	
	public Produit() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Prix getPrix() {
		return prix;
	}

	public void setPrix(Prix prix) {
		this.prix = prix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getDateDeDisponibilite() {
		return dateDeDisponibilite;
	}

	public void setDateDeDisponibilite(Date dateDeDisponibilite) {
		this.dateDeDisponibilite = dateDeDisponibilite;
	}
}
