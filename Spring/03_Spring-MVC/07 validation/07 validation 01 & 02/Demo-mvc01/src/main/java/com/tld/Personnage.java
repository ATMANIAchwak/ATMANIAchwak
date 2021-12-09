package com.tld;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Personnage {

	private String prenom;//taille <20
	
	@NotNull
	@Size(min=1, message="nom obligatoire")
	private String nom;  //oblig
	
//	private String role; //paysan magicien militaire
//	
//	private int pointDeVie;//// de 1 10
//	private List<String> equipements;//épée, couteau, potion 
//	private LocalDate creaDate;// compris 1920 et 2021
//	private boolean majeur;//majorité à 18 ans
	
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
//	public String getRole() {
//		return role;
//	}
//	public void setRole(String role) {
//		this.role = role;
//	}
//	public int getPointDeVie() {
//		return pointDeVie;
//	}
//	public void setPointDeVie(int pointDeVie) {
//		this.pointDeVie = pointDeVie;
//	}
//	public List<String> getEquipements() {
//		return equipements;
//	}
//	public void setEquipements(List<String> equipements) {
//		this.equipements = equipements;
//	}
//	public LocalDate getCreaDate() {
//		return creaDate;
//	}
//	public void setCreaDate(LocalDate creaDate) {
//		this.creaDate = creaDate;
//	}
//	public boolean isMajeur() {
//		return majeur;
//	}
//	public void setMajeur(boolean majeur) {
//		this.majeur = majeur;
//	}
	
}
