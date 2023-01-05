package P3;


public class VerificateurJouet3 implements Runnable { //implements Runnable
	private String nom ;
	public Thread p;
	public VerificateurJouet3(String nm )
	{
		this.nom=nm;
		p=new Thread(this);
		
	}
	public String getNom() {return nom;}
	public void setNom(String nom) {	this.nom = nom;}


	@Override
	public void run() {
		
		for(Jouet3 J:Simulation3.jouets) J.tuEsVerifiePar(this);

		
	}

	
	
}
