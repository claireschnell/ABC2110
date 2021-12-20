import java.util.Scanner;
public class ex4 {
	public static void main (String[] args) {
		//TODO Auto-generated method stub
		//réel sommeI
		float sommeI;
		//réel InteretS
		float interetS;
		//réel nombreannee
		float nombreannee;
		//réel valeurS
		float valeurS;
		//réel valeurC
		double valeurC;

		//saisies
		//écrire "donne moi sommeI"
		System.out.println("donne moi sommeI");
		//lire sommeI
		Scanner src= new Scanner(System.in);//crée un scanner
		sommeI=src.nextFloat();
		//ecrire "donne moi interetS"
		System.out.println("Donne moi interetS");
		//lire interetS
		interetS=src.nextFloat();
		
		//écrire "donne moi nombreannee"
		System.out.println ("donne moi nombreannee");
		//lire nombreannee
		nombreannee=src.nextFloat();
		
		//traitement
        //
	
		valeurS = (float) sommeI * (1+nombreannee * interetS);
		valeurC = (double) sommeI * (Math.pow((1+interetS),nombreannee));
		
		





		//affichage
		//écrire "la valeur acquise par la somme  S placée pendant n année avec intérpet est";
		System.out.println ("la valeur acquise par la somme  S placée pendant n année avec intéret est =" +valeurS );
		System.out.println("la valeur acquise par la somme S pendant n année avec intérêt composé est ="+valeurC); 

	}
}
