package statistiques;

import java.util.ArrayList;
import java.util.List;

public class Stats {
private List<Etudiant> etudiantList;

public Stats() {
		// TODO Auto-generated constructor stub
		setEtudiantList(new ArrayList<Etudiant>());
}
public void getClassDetails() {
	
}
public double getClassAvg() {
	return 0;
}
public Etudiant getBestStudent() {
	return null;
}
public Etudiant getWorstStudent() {
	return null;
}
public List<Etudiant> getEtudiantList() {
	return etudiantList;
}
void addEtudiant(Etudiant E) {
	
	Etudiant.add(E);
}
public void setEtudiantList(ArrayList<Etudiant> etudiantList) {
	this.etudiantList = etudiantList;
}
}
