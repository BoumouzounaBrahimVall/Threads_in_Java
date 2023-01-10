package P4;

public class Simulation {
	public static Jouet[] jouets =new Jouet[10];
	
	public static void main(String[] args) {
		for(int i =0;i<10;i++)
		{
			jouets[i]=new Jouet(i);
		}
		
		VerificateurJouet Ahmed=new VerificateurJouet("Ahmed",1,30);
		VerificateurJouet Amine=new VerificateurJouet("Amine",1,100);
		VerificateurJouet Bachid=new VerificateurJouet("Bachid",2,5);
		Ahmed.p.start();
		Amine.p.start();
		Bachid.p.start();
		
	}
}
