package com.tld;

import java.util.LinkedHashMap;

public class Utilisateur {

	private String nom;
	private String prenom;
	private String pays;
	private LinkedHashMap<String, String> paysListe;
	
	public Utilisateur() {
		paysListe= new LinkedHashMap<>();
	 paysListe.put("BR",  "Bresil");
	 paysListe.put("FR",  "France");
	 paysListe.put("DE",  "Allemagne");
	 paysListe.put("IN",  "Inde");
	 paysListe.put("USA",  "Etats Unis");
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
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}

	public LinkedHashMap<String, String> getPaysListe() {
		return paysListe;
	}

	public void setPaysListe(LinkedHashMap<String, String> paysListe) {
		this.paysListe = paysListe;
	}
	
}
