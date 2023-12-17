package Equipe;

import java.sql.Date;
import java.util.Objects;

public class joueur extends Personne{
	private String position;
	private int tenue_nmbr;
	public boolean available;

	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public int getTenue_nmbr() {
		return tenue_nmbr;
	}


	public void setTenue_nmbr(int tenue_nmbr) {
		this.tenue_nmbr = tenue_nmbr;
	}




	public joueur( String nomP, String prenom, int age,String nationnaliter, 
			String status,String position,int tenue_nmbr, boolean available) {
		super( nomP, prenom, age,nationnaliter, status);
		// TODO Auto-generated constructor stub
		this.position=position; this.tenue_nmbr=tenue_nmbr; this.available=available;
	}


	@Override
	public String toString() {
		return "joueur [available=" + available + ", Position=" + getPosition() + ", Tenue_nmbr="
				+ getTenue_nmbr() + ", " + super.toString() + "]";
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		joueur other = (joueur) obj;
		return available == other.available && Objects.equals(position, other.position)
				&& tenue_nmbr == other.tenue_nmbr;
	}
	
	

	
}
