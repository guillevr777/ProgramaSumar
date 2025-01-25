package programas;

import java.util.Scanner;

public class ProgramaConcatenado {

public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		String tabla[] = new String[3];

		System.out.println("introduzca su nombre y el de dos amigos :");
		for (int i = 0 ; i < tabla.length ; i++) {
			tabla[i] = reader.next();
		}
		for (int i = 0 ; i < 2 ; i++) {
			if (i != 0) {
			System.out.print(tabla[i] + " y " + tabla[i+1] + ".");
			} else {
				System.out.print("Tu te llamas " + tabla[i] + " y tus amigos se llaman ");
			}
		}
		reader.close();
	}
}
