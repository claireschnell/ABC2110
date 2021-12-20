import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Traduction du pseudo code en code java
		//DECLARATION DES VARIABLES

		//réel a
		float a;
		//réel b
		float b;
		//réel t
		float t;

		//saisies
		//écrire "donne moi a"
		System.out.println("donne moi a");
		//lire a
		Scanner sc = new Scanner(System.in); //crée un outil scanner
		a = sc.nextFloat();


		//écrire "donne moi b"
		System.out.println("donne moi b");
		//lire b
		b = sc.nextFloat();


		//traitement
		t = b;
		b = a;
		a = t;




		//affichage

		System.out.println("la valeur de a  est égale "  +a );
		System.out.println("la valeur de b  est "  +b);

	}
}
