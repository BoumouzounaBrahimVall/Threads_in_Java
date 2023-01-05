package P2;

public class Simulation2 {
	public static Jouet2[] jouets =new Jouet2[10];
	
	public static void main(String[] args) {
		for(int i =0;i<10;i++)
		{
			jouets[i]=new Jouet2(i);
		}
		
		VerificateurJouet2 Ahmed=new VerificateurJouet2("Ahmed");
		VerificateurJouet2 Amine=new VerificateurJouet2("Amine");
		Ahmed.p.start();
		Amine.p.start();
		
	}
}
