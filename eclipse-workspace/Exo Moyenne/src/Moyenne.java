import java.util.Scanner;

public class Moyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Traduction du pseudo code en code java
		//DECLARATION DES VARIABLES

		//r?el nombre1
		float nombre1;	
		//R?el nombre2
		float nombre2;
		//R?el moyenne;
		float moyenne;

		//SAISIES
		//ecrire "Donnez moi svp le premier nombre:"
		System.out.println("Donnez moi svp le premier nombre:");
		//lire nombre1
		Scanner sc = new Scanner(System.in); //cr?e un outil scanner
		nombre1 = sc.nextFloat();
		System.out.println("Vous avez saisie nombre1="+nombre1);

		//ecrire "donnez moi svp le deuxi?me nombre:"
		System.out.println("Donnez moi svp le deuxi?me nombre:");
		//lire nombre2
		nombre2 = sc.nextFloat();
		System.out.println("Vous avez saisie nombre2="+nombre2);
	
		//TRAITEMENT
		//moyenne <--(nombre1+nombre2)/2
		moyenne = (nombre1+nombre2)/2;
		//SI (moyenne>=10) Alors
		if (moyenne>=10) {
		
		//
		}
		//Sinon
		else {
		  // moyenne <-- moyenne+1
			moyenne = moyenne +1;
		
		//FinSI
		}
		
		
		
		//AFFICHAGE
		//?crire "la valeur moyenne est : ",moyenne"
		System.out.println("la moyenne des 2 nombres est ="+moyenne);
		
		
		
}
	
}
