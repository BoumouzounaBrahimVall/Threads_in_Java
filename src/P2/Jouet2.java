package P2;

import java.util.Random;

public class Jouet2 {
	private final int nbr;
	

	public Jouet2(int nm) {
		nbr = nm;
	}

	private void showSleepShow(VerificateurJouet2 v)
	{
		System.out.println("verificateur :" + v.getNom() + " commence a verifier le jouet :" + nbr);
		try {
			 Random r=new Random();
			 Thread.sleep(r.nextLong(0, 1001));
			
		}catch (InterruptedException e) {}
		
		System.out.println("    verificateur :" + v.getNom() + " a fini de verifiers le jouet :" + nbr);
	}
	public synchronized void tuEsVerifiePar(VerificateurJouet2 v) {
				showSleepShow(v);

	}
}



































