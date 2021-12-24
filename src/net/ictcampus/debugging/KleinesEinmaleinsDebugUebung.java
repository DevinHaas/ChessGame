package net.ictcampus.debugging;

public class KleinesEinmaleinsDebugUebung {

	public static void main(String[] args) {
		String linie;
		int resultat;
		String[] kleinesEinmaleins = new String[10];

		int i = 1;

		while (i <= 10) {
			linie = i + "-er Reihe: ";

			int j = 1;

			while (j <= 10) {
				resultat = i * j;
				linie += resultat + " ";
				j++;
			}
			kleinesEinmaleins[i-1] = linie;
			i++;
		}

		for (String s : kleinesEinmaleins) {
			System.out.println(s);
		}
	}
}