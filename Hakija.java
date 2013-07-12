/****
 *  Koodi lukee tiedoston ja kertoo, onko annettu sana siina tiedostossa.
 **/

import java.util.*;
import java.io.*;


public class Hakija {

	private static Scanner j2 = new Scanner(System.in);

	private static Scanner j3 = null;

	private static ArrayList<String> hupshei = new ArrayList<String>();

	public static void main(String[] args) {

		boolean j1 = false;
		
		while( ! j1  ) {

			System.out.println("Anna luettava tiedosto:");
			String j5 = j2.nextLine();

			try {

				File j4 = new File( j5 );
				j3 = new Scanner( j4 );

				j1 = true;

			} catch(Exception e) {
				System.out.println("Ei onnistu! Yrita uudelleen.");
			}

		}

		while( j3.hasNextLine() ) {
			String jeejee = j3.nextLine();
			hupshei.add( jeejee );
		}

		// TODO: lisaa tahan
		// 1) kysy sana
		// 2) tarkista, onko sana tiedostossa

	}

}
