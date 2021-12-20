import java.util.Scanner;

public class Exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		//réel airC
		float airC;
		//réel angle
		float angleA;
		//réel rayonR
		float rayonR;

		//SAISIES
		//écrire  "donnez moi le rayonR:"
		System.out.println("Donnez moi svp le rayonR:");
		//lire le rayonR
		Scanner sc = new Scanner(System.in);//crée un scanner
		rayonR = sc.nextFloat();
		

		//ecrire "donnez moi svp angleA:"
		System.out.println("Donnez moi svp angleA");
		//lire angleA
		angleA=sc.nextFloat();
		

		//traitement
		//air <---rayonR.PI*Maths.pow(rayonR,2)*angleA/360
	
		airC = (float) ((Math.PI*Math.pow(rayonR,2)*angleA)/360);



		//affichage

		System.out.println("L'air circulaire est " + airC);
	}



}


