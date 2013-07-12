/****
 *  Koodi lukee tiedoston ja kertoo, onko annettu sana siina tiedostossa.
 **/

import java.util.*;
import java.io.*;


public class Hakija {

	/*** Tahan luetaan kayttajan syote nappikselta. */
	private static Scanner nappis = new Scanner(System.in);

    /*** Tahan juttuun luetaan tiedosto */
	private static Scanner tiedos = null;

	/*** Kerataan tahan kaikki rivit ***/
	private static ArrayList<String> rivit = new ArrayList<String>();

	/*** Tama osuus suoritetaan. **/
	public static void main(String[] args) {

		// luetaan tiedoston nimi ja valmistaudutaan lukemaan se tiedosto
		System.out.println("Anna luettava tiedosto:");
		String tiedostoNimi = nappis.nextLine();

		try {
			File tiedosto = new File( tiedostoNimi );
			tiedos = new Scanner( tiedosto );
		} catch(Exception e) {
			System.out.println("Ei onnistu!");
		}

		// lue kaikki rivit
		while( tiedos.hasNextLine() ) {
			String rivi = tiedos.nextLine();
			rivit.add( rivi );
		}

	}

}
