package compris;

import java.util.Scanner;

public class compris {
public static void main(String[]args) {

	
	
	//DECLARATION DE VARIABLES
	//chaine de caractères compris
	String compris;
	
	//chaine de caractere compris2
	String compris2;
	// affichage 1ere action
	//ecrire "faire une lecture attentive"
	System.out.println("faire une lecture attentive");
	//ecrire "Avez vous compris? oui/non"
	
	System.out.println ("faire une lecture attentive");
	//lire compris("Avez vous compris? oui/non?)
	System.out.println ("Avez vous compris? oui/non");
	//création du scanner
	Scanner sc = new Scanner (System.in);
	
	//lire compris
	compris = sc.nextLine();
	
   //Si (compris=="non")
	if (compris.equals("non")) {
		//ecrire "Effectuez une relecture de l'enonce"
		System.out.println("Effectuez une relecture de l'enonce");
		//ecrire "Avez vous bien compris l'enonce cette fois-ci? oui/non"?
		System.out.println("Avez-vous compris l'enonce cette fois-ci? oui/non");
		//lire compris2
		compris2 = sc.next();
		//Si ((compris2=="non") Alors
		if (compris2.equals(("non"))) {
			//ecrire "Demandez de l'aide à votre formateur"
			System.out.println("Demandez de l'aide à votre formateur");
	    }
		//FinSi
	}
	
}


	
	
	
	
	
	
	

