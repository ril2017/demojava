package cesi.ril.minimum;

import cesi.ril.minimum.AnimalAbstract;
import cesi.ril.minimum.OiseauAbstract;

public class Poule implements animal, oiseau {

	protected animal a = new AnimalAbstract();
	protected oiseau o = new OiseauAbstract();
	
	public void cri() {
		a.cry();
		o.saute();
		boolean b = o.vole();
	}
	
	@Override
	public boolean vole() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public int getNombre_plumes() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setNombre_plumes(int nombre_plumes) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public float getEnvergure() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setEnvergure(float envergure) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getCouleur() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void saute() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		
	}
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
	public void setCouleur(int couleur) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double CalculVitesse(double vitesse, int facteur) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
