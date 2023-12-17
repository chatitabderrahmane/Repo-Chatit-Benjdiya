package Equipe;

import java.sql.Date; 
import java.util.ArrayList;
import java.util.Objects;

public class Equipefbl   {
	private String nom; private Date date; private int nmbrjoueur;
	private String nationnalite;
	private ArrayList<Personne> listepersonne;
	public Equipefbl(String nom, Date date,int nmbrjoueur, String nationnalite) {
		this.nom=nom;this.date=date;this.nmbrjoueur=nmbrjoueur; this.nationnalite=nationnalite;
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Equipefbl [nom=" + nom + ", date=" + date + ", nmbrjoueur=" + nmbrjoueur + ", nationnalite="
				+ nationnalite + ", listepersonne=" + listepersonne + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipefbl other = (Equipefbl) obj;
		return Objects.equals(date, other.date) && Objects.equals(listepersonne, other.listepersonne)
				&& Objects.equals(nationnalite, other.nationnalite) && nmbrjoueur == other.nmbrjoueur
				&& Objects.equals(nom, other.nom);
	}
	
	
	
	

}

