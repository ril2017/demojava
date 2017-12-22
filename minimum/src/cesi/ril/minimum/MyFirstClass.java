package cesi.ril.minimum;



import cesi.edu.*;

public class MyFirstClass extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mon premier programme...");

		goodies myGoodies = new goodies();
		
		Poule p = new Poule();
		p.cri();
		
		int i = 3;
		int j = 0;

		try {
		  System.out.println("résultat = " + (i / j));
		} catch (Exception  e) {
			System.out.println("résultat = division par zéro Exception interceptée");
		}
		
	}

}
