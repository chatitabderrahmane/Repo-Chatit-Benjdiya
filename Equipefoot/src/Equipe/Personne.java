package Equipe;

import java.sql.Date; 
import java.util.Objects;



public class Personne implements  Comparable<Personne>{
	public static int id;  
	private String nomP, prenom; 
	private int age;
	private String nationnaliter;
	private String status;


	public Personne(String nomP,String prenom,int age,String nationnaliter,String status) {
//		super(nom, date, nmbrjoueur, nationnalite);
		// TODO Auto-generated constructor stub
		this.nomP=nomP; this.prenom=prenom; this.age=age;this.nationnaliter=nationnaliter; this.status=status;id++;
	}
	


	public String getNomP() {
		return nomP;
	}



	public void setNomP(String nomP) {
		this.nomP = nomP;
	}
	public String getnationnaliter() {
		return nationnaliter;
	}



	public void setnationnaliter(String nationnaliter) {
		this.nationnaliter = nationnaliter;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "Personne [nomP=" + nomP + ", prenom=" + prenom + ", age=" + age + ", status=" + status + "]";
	}


	@Override
	protected Personne clone(){
		try {
			return (Personne)super.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println("Erreur de Clonage");
			return null;
		}
	}
		
	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
//		if (!super.equals(obj))
//			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		return age == other.age && Objects.equals(nomP, other.nomP) && Objects.equals(prenom, other.prenom)
				&& Objects.equals(status, other.status);
	}
	
	@Override
	public int compareTo(Personne o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	
}
