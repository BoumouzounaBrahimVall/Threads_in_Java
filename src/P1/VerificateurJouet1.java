package P1;

import java.util.Random;

public class VerificateurJouet1 implements Runnable { //implements Runnable
	private String nom ;
	public Thread p;

	public VerificateurJouet1(String nm )
	{
		this.nom=nm;
		p=new Thread(this);
		
	}
	public String getNom() {return nom;}
	public void setNom(String nom) {	this.nom = nom;}

	@Override
	public void run() {
		for (int i=0;i<=9;i++) verifieJouet(i);
		
	}

	private void verifieJouet(int nbr)
	{
		Random r=new Random();
		System.out.println("verificateur :"+nom+" commence a verifier le jouet :"+nbr);
		try {
			Thread.sleep(r.nextLong(0, 1001));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("    verificateur :"+nom+" a fini de verifiers le jouet :"+nbr);

		
		
	}
	
}
