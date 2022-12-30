package tp4;

import java.util.Random;

public class VerificateurJouet implements Runnable { //implements Runnable
	private String nom ;
	public Thread p;
	//partie 4
	private int niveau;
	private int vitesse;
	public VerificateurJouet(String nm,int nv,int vs )
	{
		this.nom=nm;
		p=new Thread(this);
		vitesse=vs;
		niveau=nv;
	}
	public String getNom() {return nom;}
	public void setNom(String nom) {	this.nom = nom;}
	//partie 4
	public int getNiveau() {return niveau;}
	public void setNiveau(int niveau) {this.niveau = niveau;}
	public int getVitesse() {return vitesse;}
	public void setVitesse(int vitesse) {	this.vitesse = vitesse;	}
	
	
	@Override
	public void run() {
		// partie 1
		//for (int i=0;i<=9;i++) verifieJouet(i);
		//partie 2
		for(Jouet J:Simulation.jouets) J.tuEsVerifiePar(this);

		
	}
	// partie 1
	/*
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
	*/
}
