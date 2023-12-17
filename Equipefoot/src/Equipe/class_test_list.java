package Equipe;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import collection.Employe;
import collection.IllegalArgumentException;


public class class_test_list {
	public ArrayList<Personne> prsn_lst ;
	public void alimenter(ArrayList<Personne> prsn_lst) {
		// TODO Auto-generated constructor stub
		this.prsn_lst=prsn_lst;
	}
	public void parc() {
		Iterator<Personne> it = prsn_lst.iterator();
		while(it.hasNext()) {
			Personne a= it.next();
		}
	}
	public void trie() {
		Collections.sort(prsn_lst);
	}
	public void ajoute(Personne p) {
		prsn_lst.add(p);
	}
	public void supp(Personne p) {
		
	prsn_lst.remove(p);
	}
	public int cmpt_tabl_elements() {
		return prsn_lst.size();
	}

	public void inverse() {
		prsn_lst.reversed();

	}
	public void aff() {
		for (Personne personne : prsn_lst) {
			System.out.println((personne.toString()));
			
		}
		
	}
	Comparator<Personne> com =new Comparator<Personne>() {
		
		@Override
		public int compare(Personne o1, Personne o2) {
			if(o1.getAge()>o2.getAge()) return 1;
			else return -1;
		}
	};
	public void trie(Comparator<Personne> com) {
		Collections.sort(prsn_lst,com);
	}
	public Personne max_age() {
		this.trie(com);
		return prsn_lst.getLast();
		
	}
	public boolean comparer(ArrayList<Personne> l2)
	{
		return l2.equals( prsn_lst);
	}
	public Personne recuperer(int id) {
		return prsn_lst.get(id);
		 
	}
	public void recherche(Personne p) {
		System.out.println(prsn_lst.get(prsn_lst.indexOf(p)));
	}
	public void copy() {
		ArrayList<Personne> prsn_lst_copy ;
		prsn_lst_copy=prsn_lst;
	}
	public void melange() {
		Collections.shuffle(prsn_lst);
	}
	public ArrayList<Personne> extraire(int s,int e)
	{
		if(s>=0 && s<e && e<prsn_lst.size())
		return new ArrayList<Personne>(prsn_lst.subList(s, e));
		throw new IllegalArgumentException();

	}
	public void echanger(int i,int j)
	{
		Collections.swap(prsn_lst, i, j);
	}
	public void vider()
	{
		prsn_lst.clear();
	}
	public boolean estVide()
	{
		return prsn_lst.isEmpty();
	}

}

class t2{
	public static void main(String[] args) {
		ArrayList<Personne> lst =new ArrayList<Personne>();
		lst.add( new joueur("ahmed","moh",20,"maroc","player","milieu",10,true));
		lst.add( new joueur("mobarik","mehdi",29,"maroc","player","milieu",8,true));
		lst.add( new joueur("neffati","adam",27,"maroc","player","attaquant",77,true));
		lst.add( new joueur("zniti","anas",34,"maroc","player","gardien",1,true));
		
	
		class_test_list tab= new class_test_list();
		tab.alimenter(lst);
//		tab.parc(); 
//		System.out.println(tab.recuperer(4));
		tab.echanger(0, 3);
		tab.aff();
		
		
	
	}
	
	
	
}


