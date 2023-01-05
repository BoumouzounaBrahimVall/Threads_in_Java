package P1;

import java.util.Random;

public class Jouet1 {
	private final int nbr;
	

	public Jouet1(int nm) {
		nbr = nm;
	}

	private void showSleepShow(VerificateurJouet1 v)
	{
		System.out.println("verificateur :" + v.getNom() + " commence a verifier le jouet :" + nbr);
		try {
			Random r=new Random();
			Thread.sleep(r.nextLong(0, 1001));
		}catch (InterruptedException e) {}
		
		System.out.println("    verificateur :" + v.getNom() + " a fini de verifiers le jouet :" + nbr);
	}
	public  void tuEsVerifiePar(VerificateurJouet1 v) {
			showSleepShow(v);
	}
}



































