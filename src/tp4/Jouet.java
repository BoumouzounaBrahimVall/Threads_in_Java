// Partie 2
package tp4;

//import java.util.Random;

public class Jouet {
	private final int nbr;
	// partie 3
	// private boolean dejaVerifie;
	private boolean dejaVerifie;

	public Jouet(int nm) {
		dejaVerifie = false;
		nbr = nm;
	}

	public synchronized void tuEsVerifiePar(VerificateurJouet v) {
		// traitement faite par Rachid
		if (v.getNiveau() == 2) {
			while (!dejaVerifie) {
				try {v.p.wait();} catch (InterruptedException e1) {}
			}
		}
		// traitment faite par Amine ou Ahmed
		if (v.getNiveau() == 1 ) {
			if(dejaVerifie )return;
			dejaVerifie = true;
		}
		
		// partie 2
		// Random r=new Random();
		System.out.println("verificateur :" + v.getNom() + " commence a verifier le jouet :" + nbr);
		try {
			// partie 2
			// Thread.sleep(r.nextLong(0, 1001));
			// partie 3
			Thread.sleep(v.getVitesse());
		}catch (InterruptedException e) {}
		
		System.out.println("    verificateur :" + v.getNom() + " a fini de verifiers le jouet :" + nbr);
		 if(v.getNiveau() == 1) notifyAll();


	}
}



































