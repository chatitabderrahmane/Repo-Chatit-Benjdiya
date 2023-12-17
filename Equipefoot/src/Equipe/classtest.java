package Equipe;

import java.util.ArrayList; 
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


public class classtest {
	public Personne[] prsn_lst ;
	public classtest(Personne[] prsn_lst) {
		// TODO Auto-generated constructor stub
		this.prsn_lst=prsn_lst;
	}
	public void trie() {
		Arrays.sort(prsn_lst);
	}
	public void ajoute(Personne p) {
		prsn_lst[prsn_lst.length+1]=p;
	}
	public void supp(Personne p) {
//		 prsn_lst[p.id]=null; Personne.id--;
//		 for(int i=0;i<Personne.id;i++) {int j=0;
//			 prsn_lst[j]=prsn_lst[i];j++;
//		 }
		ArrayList<Personne> a=new ArrayList<Personne>(Arrays.asList(prsn_lst));
		a.remove(p);
		
		prsn_lst=a.toArray(new Personne[a.size()]);//a chercher
	}
//	public int cmpt_tabl_elements() {
//		return prsn_lst.size();
//	}
	public int cmpt_tabl_elements() {
		return prsn_lst.length;
	}
	public void inverse() {int i=Personne.id;int j=0; Personne a[]=new Personne[i];
//		 while(i>0) {
//			 a[j]=prsn_lst[i];
//			 j++;
//			 --i;
//		 } 
//		 prsn_lst=a;
	ArrayList<Personne> c=new ArrayList<Personne>(Arrays.asList(prsn_lst));
	prsn_lst=c.reversed().toArray(new Personne[c.size()]);
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
		Arrays.sort(prsn_lst,com);
	}
	public Personne max_age() {
		this.trie(com);
		return prsn_lst[Personne.id-1];
		
	}
	public boolean comparer(Personne[] l2)
	{
		return Arrays.equals(l2, prsn_lst);
	}
	

}
class t1{
	public static void main(String[] args) {
		Personne[] lst =new Personne[]{ new joueur("ahmed","moh",20,"maroc","player","milieu",10,true),
		new joueur("mobarik","mehdi",29,"maroc","player","milieu",8,true),
		new joueur("neffati","adam",27,"maroc","player","attaquant",77,true),
//		new joueur("zniti","anas",34,"maroc","player","gardien",1,true)
		};
	
		classtest tab=new classtest(lst);
		tab.aff();
		System.out.println("////////");
//		tab.ajoute(new joueur("zehouni","naoufal",35,"maroc","player","attaquant",9,true));
//		System.out.println(tab.maxage());
//		tab.aff();
		
		
//		Personne[] lst2 =new Personne[]{ new joueur("ahmed","moh",20,"maroc","player","milieu",10,true),
//				new joueur("mobarik","mehdi",22,"maroc","player","milieu",8,true),
//				new joueur("neffati","adam",27,"maroc","player","attaquant",77,true),
//				new joueur("zniti","anas",34,"maroc","player","gardien",1,true)};
		
		System.out.println(tab.max_age().toString());
//		tab.inverse();
//		tab.aff();	
//		tab.inverse();
		
		
//		System.out.println(tab.comparer(lst2));
		
		
	
	}
	
	
	
}











