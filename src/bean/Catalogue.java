package bean;

import java.util.Calendar;
import java.util.HashMap;

public class Catalogue {

	private static Catalogue catalogue;
	private String nom;
	private HashMap<String, Produit> listProduit;
	
	public Catalogue() {

	}

	public static Catalogue getInstance() {
		if (catalogue == null) {
			init();
		}
		return catalogue;
	}
	
	private static void init() {
		Produit produit1 = new Produit();
	    produit1.setId("P1");
	    produit1.setNom("PHILIPS 52PFL7203H");
	    Prix prix1 =  new Prix ();
	    prix1.setPrixEuro(1499.99f);
	    prix1.setPrixLivre(1309.52f);
	    produit1.setPrix(prix1);        
	    Produit produit2 = new Produit();
	    produit2.setId("P2");
	    produit2.setNom("SAMSU_PS42A416");
	    Prix prix2 =  new Prix ();
	    prix2.setPrixEuro(589.99f);
	    prix2.setPrixLivre(515.07f);
	    produit2.setPrix(prix2);
	    Calendar c = Calendar.getInstance();
	    c.set(2011, 0, 25);
	    produit2.setDateDeDisponibilite(c.getTime());      produit2.setImage("http://t3.gstatic.com/images?q=tbn:ANd9GcRFl5tec0RXso9SdJtEtOUZNhGSCMgwBaZVRapiPeKQ_x7PMA7NGA");
	    produit2.setDescription("Téléviseur Plasma 42\" (106 cm) 16:9 - Tuner TNT intégré - Double HDMI - Entrée PC - Résolution: 1024 x 768 - Luminosité: 1500 cd/m² - Taux de contarste: 100 000:1 - Angle de vision: 175°");   
	    Produit produit3 = new Produit();
	    produit3.setId("P3");
	    produit3.setNom("PHILIPS 52PFL7203H");  produit3.setImage("http://t1.gstatic.com/images?q=tbn:ANd9GcQiymzV76YAa3xX7YCJIccfNfhvp_az0XDvBfsSefIrmByazMZ_5A");
	    Prix prix3 =  new Prix ();
	    prix3.setPrixEuro(1499.99f);
	    prix3.setPrixLivre(1309.52f);
	    produit3.setPrix(prix3);
	    Produit produit4 = new Produit();
	    produit4.setId("P4");
	    produit4.setNom("TOSHIBA 32CV515DG");
	    Prix prix4 =  new Prix ();
	    prix4.setPrixEuro(499.99f);
	    prix4.setPrixLivre(436.50f);
	    produit4.setPrix(prix4);
	    produit4.setDescription("Téléviseur LCD 32\" (81 cm) 16:9 HD TV - Tuner TNT HD intégré - Triple HDMI - Résolution: 1366 x 768 - Luminosité: 500 cd/m² - Contraste: 30000:1 - Temps de réponse: 8 ms - Angle de vision: 178°");  
	    HashMap <String,Produit> listProduit = new HashMap <String,Produit>();
	    listProduit.put(produit1.getId(),produit1);
	    listProduit.put(produit2.getId(), produit2);
	    listProduit.put(produit3.getId(), produit3);
	    listProduit.put(produit4.getId(), produit4);
	    catalogue = new Catalogue();
	    catalogue.setNom("Catalogue");
	    catalogue.setListProduit(listProduit);
	}
	
	public static Catalogue getCatalogue() {
		return catalogue;
	}

	public static void setCatalogue(Catalogue catalogue) {
		Catalogue.catalogue = catalogue;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public HashMap<String, Produit> getListProduit() {
		return listProduit;
	}

	public void setListProduit(HashMap<String, Produit> listProduit) {
		this.listProduit = listProduit;
	}
}
