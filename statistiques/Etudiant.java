package statistiques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Etudiant implements IStatisticable , Comparable <Etudiant>  

{
	private String matricule;
	private String Nom;
	private ArrayList<Note>Note;
	
public Etudiant (String matricule, String Nom) {
	this.matricule=matricule;
	this.Nom=Nom;
	Note=new ArrayList<Note>();
}
	void addNote(Note note) {
		
		Note.add(note);
	}

	@Override
	public double getAVG() {
		// TODO Auto-generated method stub
		double s=0;
		for (int i=0; i<Note.size(); i++) {
			Note.get(i).getNote();
			s=s+Note.get(i).getNote();
		}
		return s/Note.size();
	}

	@Override
	public double getMin() {
		double min = Note.get(0).getNote();
		for (Note n:Note) {
			if (n.getNote()<min)
				min=n.getNote();
		}
		return min;
	}

	@Override
	public double getMax() {
		/*double max = Note.get(0).getNote();
		for (Note n:Note) {
			if (n.getNote()>max)
				max=n.getNote();*/
		double max = Note.get(0).getNote();
		Iterator <Note> it = Note.iterator();
		while (it.hasNext()) {
			Note N=it.next();
			if(N.getNote()>max) {
				max=N.getNote();
			}
		}
		return max;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	
	public ArrayList<Note> getNote() {
		return Note;
	}


	public static void main(String[] args) {
		Etudiant E = new Etudiant ("AAABBB","salah" );
		E.addNote(new Note("aa", 10));
		E.addNote(new Note("bb", 11));
		System.out.println(E.getAVG());
		System.out.println(E.getMin());
		System.out.println(E.getMax());
		System.out.println(E.getNote());
		
		Stats s= new Stats();
		
		Collections.sort(s.getEtudiantList());
		

	}
	@Override
	public int compareTo(Etudiant E1) {
		return this.matricule.compareTo(E1.matricule);
		
	}
	public static void add(Etudiant e) {
		// TODO Auto-generated method stub
		
	}

	}
