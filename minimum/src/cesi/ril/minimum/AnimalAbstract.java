package cesi.ril.minimum;

public class AnimalAbstract implements animal {

	int age;
	int taille;
	int largeur;
	int couleur;
	double vitesse;
	
	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getTaille() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setTaille(int taille) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getLargeur() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setLargeur(int largeur) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getCouleur() {
		// TODO Auto-generated method stub
		return 12;
	}
	@Override
	public void setCouleur(int couleur) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double CalculVitesse(double vitesse, int facteur) {
		// TODO Auto-generated method stub
		this.vitesse = vitesse * facteur;
		return vitesse;
	}
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("cry...");
	}
	
	
}
