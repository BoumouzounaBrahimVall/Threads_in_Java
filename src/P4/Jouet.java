// Partie 2
package P4;

//import java.util.Random;

public class Jouet {
	private final int nbr;
	
	private boolean dejaVerifie;

	public Jouet(int nm) {
		dejaVerifie = false;
		nbr = nm;
	}

	private void showSleepShow(VerificateurJouet v)
	{
		System.out.println("verificateur :" + v.getNom() + " commence a verifier le jouet :" + nbr);
		try {
			Thread.sleep(v.getVitesse());
		}catch (InterruptedException e) {}
		
		System.out.println("    verificateur :" + v.getNom() + " a fini de verifiers le jouet :" + nbr);
	}
	public  void tuEsVerifiePar(VerificateurJouet v) {
		// traitement faite par Bachir
		
		if (v.getNiveau() == 2) {
			synchronized(this) {
			while (!dejaVerifie) {
				
				try {v.p.wait();} catch (InterruptedException e1) {}}
			}
		
				showSleepShow(v);
				return;

		}
		// traitment faite par Amine ou Ahmed
		synchronized(this) {
			if(dejaVerifie )return;
			dejaVerifie = true;
			showSleepShow(v);
			notifyAll();}

	}
}



































