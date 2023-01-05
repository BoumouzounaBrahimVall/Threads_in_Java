package P4;
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
		for(Jouet J:Simulation.jouets) J.tuEsVerifiePar(this);

		
	}
	
}
