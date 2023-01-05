package P2;

import java.util.Random;

public class VerificateurJouet2 implements Runnable { //implements Runnable
	private String nom ;
	public Thread p;

	public VerificateurJouet2(String nm )
	{
		this.nom=nm;
		p=new Thread(this);
		
	}
	public String getNom() {return nom;}
	public void setNom(String nom) {	this.nom = nom;}

	
	
	@Override
	public void run() {
	
		for(Jouet2 J:Simulation2.jouets) J.tuEsVerifiePar(this);

		
	}
	
}
