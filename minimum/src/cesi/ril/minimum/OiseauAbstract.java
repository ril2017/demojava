package cesi.ril.minimum;

public class OiseauAbstract implements oiseau {

	int nombres_plumes;
	float envergure;
	String couleur = "";

	@Override
	public void saute() {
		// TODO Auto-generated method stub
		System.out.println("Saute");
	}
	
	@Override
	public boolean vole() {
		// TODO Auto-generated method stub
		System.out.println("vole");
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
		return 12;
	}

	@Override
	public void setCouleur(int couleur) {
		// TODO Auto-generated method stub
		
	}

	
	
}
