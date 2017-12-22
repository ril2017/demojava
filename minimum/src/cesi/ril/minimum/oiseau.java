package cesi.ril.minimum;

public interface oiseau {

	public boolean vole();
	public int getNombre_plumes();
	public void setNombre_plumes(int nombre_plumes);
	public float getEnvergure();
	public void setEnvergure(float envergure);
	public int getCouleur();
	public void setCouleur(int couleur);
	void saute();
}
