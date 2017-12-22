package cesi.ril.minimum;

public interface animal {

	public void cry();
	public int getAge();
	public void setAge(int age);
	public int getTaille();
	public void setTaille(int taille);
	public int getLargeur();
	public void setLargeur(int largeur);
	public int getCouleur();
	public void setCouleur(int couleur);
	public double CalculVitesse(double vitesse, int facteur);
}
