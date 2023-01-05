package P1;

public class Simulation1 {
	public static Jouet1[] jouets =new Jouet1[10];
	
	public static void main(String[] args) {
		
		VerificateurJouet1 Ahmed=new VerificateurJouet1("Ahmed");
		VerificateurJouet1 Amine=new VerificateurJouet1("Amine");
		Ahmed.p.start();
		Amine.p.start();
		
	}
}
