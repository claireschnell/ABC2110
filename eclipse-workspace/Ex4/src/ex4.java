import java.util.Scanner;
public class ex4 {
	public static void main (String[] args) {
		//TODO Auto-generated method stub
		//r�el sommeI
		float sommeI;
		//r�el InteretS
		float interetS;
		//r�el nombreannee
		float nombreannee;
		//r�el valeurS
		float valeurS;
		//r�el valeurC
		double valeurC;

		//saisies
		//�crire "donne moi sommeI"
		System.out.println("donne moi sommeI");
		//lire sommeI
		Scanner src= new Scanner(System.in);//cr�e un scanner
		sommeI=src.nextFloat();
		//ecrire "donne moi interetS"
		System.out.println("Donne moi interetS");
		//lire interetS
		interetS=src.nextFloat();
		
		//�crire "donne moi nombreannee"
		System.out.println ("donne moi nombreannee");
		//lire nombreannee
		nombreannee=src.nextFloat();
		
		//traitement
        //
	
		valeurS = (float) sommeI * (1+nombreannee * interetS);
		valeurC = (double) sommeI * (Math.pow((1+interetS),nombreannee));
		
		





		//affichage
		//�crire "la valeur acquise par la somme  S plac�e pendant n ann�e avec int�rpet est";
		System.out.println ("la valeur acquise par la somme  S plac�e pendant n ann�e avec int�ret est =" +valeurS );
		System.out.println("la valeur acquise par la somme S pendant n ann�e avec int�r�t compos� est ="+valeurC); 

	}
}
