/****
 *  Koodi lukee tiedoston ja kertoo, onko annettu sana siina tiedostossa.
 **/

import java.util.*;
import java.io.*;


public class Hakija {

	private static Scanner nappis = new Scanner(System.in);

	private static Scanner tiedos = null;

	private static ArrayList<String> rivit = new ArrayList<String>();

	public static void main(String[] args) {

		boolean onkoOK = false;
		
		while( ! onkoOK  ) {

			System.out.println("Anna luettava tiedosto:");
			String tiedostoNimi = nappis.nextLine();

			try {

				File tiedosto = new File( tiedostoNimi );
				tiedos = new Scanner( tiedosto );

				onkoOK = true;

			} catch(Exception e) {
				System.out.println("Ei onnistu! Yrita uudelleen.");
			}

		}

		while( tiedos.hasNextLine() ) {
			String rivi = tiedos.nextLine();
			rivit.add( rivi );
		}

		// TODO: lisaa tahan
		// 1) kysy sana
		// 2) tarkista, onko sana tiedostossa

	}

}
