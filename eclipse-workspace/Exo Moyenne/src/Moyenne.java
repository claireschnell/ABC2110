import java.util.Scanner;

public class Moyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Traduction du pseudo code en code java
		//DECLARATION DES VARIABLES

		//réel nombre1
		float nombre1;	
		//Réel nombre2
		float nombre2;
		//Réel moyenne;
		float moyenne;

		//SAISIES
		//ecrire "Donnez moi svp le premier nombre:"
		System.out.println("Donnez moi svp le premier nombre:");
		//lire nombre1
		Scanner sc = new Scanner(System.in); //crée un outil scanner
		nombre1 = sc.nextFloat();
		System.out.println("Vous avez saisie nombre1="+nombre1);

		//ecrire "donnez moi svp le deuxième nombre:"
		System.out.println("Donnez moi svp le deuxième nombre:");
		//lire nombre2
		nombre2 = sc.nextFloat();
		System.out.println("Vous avez saisie nombre2="+nombre2);
	
		//TRAITEMENT
		//moyenne <--(nombre1+nombre2)/2
		moyenne = (nombre1+nombre2)/2;
		
		//AFFICHAGE
		//écrire "la valeur moyenne est : ",moyenne"
		System.out.println("la moyenne des 2 nombres est ="+moyenne);
		
		
		
}
	
}
