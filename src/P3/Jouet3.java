// Partie 2
package P3;

import java.util.Random;

public class Jouet3 {
	private final int nbr;
	// partie 3
	private boolean dejaVerifie;

	public Jouet3(int nm) {
		dejaVerifie = false;
		nbr = nm;
	}

	private void showSleepShow(VerificateurJouet3 v)
	{
		System.out.println("verificateur :" + v.getNom() + " commence a verifier le jouet :" + nbr);
		try {
			Random r=new Random();
			Thread.sleep(r.nextLong(0, 1001));
		}catch (InterruptedException e) {}
		
		System.out.println("    verificateur :" + v.getNom() + " a fini de verifiers le jouet :" + nbr);
	}
	public  void tuEsVerifiePar(VerificateurJouet3 v) {
				
		if(dejaVerifie )return;
		
		dejaVerifie = true;
		synchronized(this) {
			showSleepShow(v);
		}
		

	}
}



































