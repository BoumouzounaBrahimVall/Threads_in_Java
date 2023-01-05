package P3;

public class Simulation3 {
	public static Jouet3[] jouets =new Jouet3[10];
	
	public static void main(String[] args) {
		for(int i =0;i<10;i++)
		{
			jouets[i]=new Jouet3(i);
		}
		
		VerificateurJouet3 Ahmed=new VerificateurJouet3("Ahmed");
		VerificateurJouet3 Amine=new VerificateurJouet3("Amine");
		Ahmed.p.start();
		Amine.p.start();
		
	}
}
