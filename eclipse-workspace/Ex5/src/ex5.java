import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Traduction du pseudo code en code java
		//DECLARATION DES VARIABLES

		//r�el a
		float a;
		//r�el b
		float b;
		//r�el t
		float t;

		//saisies
		//�crire "donne moi a"
		System.out.println("donne moi a");
		//lire a
		Scanner sc = new Scanner(System.in); //cr�e un outil scanner
		a = sc.nextFloat();


		//�crire "donne moi b"
		System.out.println("donne moi b");
		//lire b
		b = sc.nextFloat();


		//traitement
		t = b;
		b = a;
		a = t;




		//affichage

		System.out.println("la valeur de a  est �gale "  +a );
		System.out.println("la valeur de b  est "  +b);

	}
}
