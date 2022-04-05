package statistiques;

public class Note {
private String NomCours;
private double note;
	public Note(String nc, double n) {
		NomCours=nc;
		note = n;
		// TODO Auto-generated constructor stub
	}
	public String getNomCours() {
		return NomCours;
	}
	public void setNomCours(String nomCours) {
		NomCours = nomCours;
	}
	public double getNote() {
		return note;
	}
	public void setNote(double note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "Note [NomCours=" + NomCours + ", note=" + note + "]";
	}
	
}
