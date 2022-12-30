// Partie 2
package tp4;

import java.util.Random;

public class Jouet extends Thread {
	private final int nbr ;
	//partie 3
	private boolean  dejaVerifie;

	public Jouet(int nm)
	{		
		dejaVerifie=false;
		nbr =nm;	
	}
	public synchronized void tuEsVerifiePar(VerificateurJouet v){
		if(dejaVerifie) 
			{
			if(v.getNiveau()==1)return;
			
			//while();
			}
		dejaVerifie=true;
		Random r=new Random();
		System.out.println("verificateur :"+v.getNom()+" commence a verifier le jouet :"+nbr);
		try {
			sleep(r.nextLong(0, 1001));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("    verificateur :"+v.getNom()+" a fini de verifiers le jouet :"+nbr);

		
	}
}
