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

		boolean onkoOK = false;
		
		// jatketaan tiedoston kysymista kunnes meilla on oikea tiedosto.
		while( ! onkoOK  ) {

			// luetaan tiedoston nimi ja valmistaudutaan lukemaan se tiedosto
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

		// lue jokainen rivi ja tallenna ne rivit-listaan
		while( tiedos.hasNextLine() ) {
			String rivi = tiedos.nextLine();
			rivit.add( rivi );
		}

		// TODO: lisaa tahan
		// 1) kysy sana
		// 2) tarkista, onko sana tiedostossa

	}

}
