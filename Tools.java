

import java.util.Scanner;

/**
 * Classe contente tutti i metodi utili per eseguire varie operazioni
 */

public class Tools {

	/**
	 * Toglie tutti gli spazi dalla stringa
	 * 
	 * @param x : stringa da compattare
	 * @return : stringa compattata
	 */
	public static String trim(String x) {
		String s = "";
		for (int i = 0; i < x.length(); i++) {
			char c = x.charAt(i);
			if (c != ' ') {
				s = s + c;
			}
		}
		return s;
	}
	
		

	/**
	 * Confronta due stringhe
	 * 
	 * @param s1 : prima stringa
	 * @param s2 : seconda stringa
	 * @return : true se le due stringhe sono uguali, false se sono diverse
	 */

	public static boolean equals(String s1, String s2) {
		int n1 = s1.length();
		int n2 = s2.length();
		if (n1 != n2)
			return false;
		for (int i = 0; i < n1; i++) {
			if (s1.charAt(i) != s2.charAt(i))
				return false;
		}

		return true;

	}

	/*
	 * Versione dell' equals che ignora le maiuscole o le minuscole
	 */

	public static boolean equalsIgnoreCase(String s1, String s2) {
		int n1 = s1.length();
		int n2 = s2.length();
		if (n1 != n2)
			return false;

		String s1n = toLowerCase(s1);
		String s2n = toLowerCase(s2);

		for (int i = 0; i < n1; i++) {
			if (s1n.charAt(i) != s2n.charAt(i))
				return false;
		}

		return true;

	}

	/**
	 * Confronta due stringhe
	 * 
	 * @param s1 : prima stringa
	 * @param s2 : seconda stringa
	 * @return : un numero positivo se viene prima alfabeticamente la seconda,
	 *         negativo se viene prima la prima stringa, 0 se sono uguali
	 */

	public static int compareTo(String s1, String s2) {
		int n;

		if (s1.length() < s2.length()) {
			n = s1.length();
		} else {
			n = s2.length();
		}

		for (int i = 0; i < n; i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			if (c1 != c2) {
				return (int) (c1 - c2);
			}
		}

		return 0;
	}

	/*
	 * Versione del compareTo che ignora le maiuscole e le minuscole
	 */

	public static int compareToIgnoreCase(String s1, String s2) {
		int n;

		if (s1.length() < s2.length()) {
			n = s1.length();
		} else {
			n = s2.length();
		}

		String s1n = toLowerCase(s1);
		String s2n = toLowerCase(s2);

		for (int i = 0; i < n; i++) {
			char c1 = s1n.charAt(i);
			char c2 = s2n.charAt(i);
			if (c1 != c2) {
				return (int) (c1 - c2);
			}
		}

		return 0;
	}

	/**
	 * Converte i caratteri maiuscoli di una stringa in minuscolo
	 * 
	 * @param x : stringa da modificare
	 * @return : stringa modificata
	 */

	public static String toLowerCase(String x) {
		String s = "";
		for (int i = 0; i < x.length(); i++) {
			char c = x.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				c = (char) (c + ('a' - 'A'));
			}
			s = s + c;

		}
		return s;
	}

	/**
	 * Converte i caratteri minuscoli di una stringa in maiuscolo
	 * 
	 * @param x : stringa da modificare
	 * @return : stringa modificata
	 */

	public static String toUpperCase(String x) {
		String s = "";
		for (int i = 0; i < x.length(); i++) {
			char c = x.charAt(i);
			if (c >= 'a' && c <= 'z') {
				c = (char) ('A' + (char) (c - 'a'));
			}
			s = s + c;

		}
		return s;
	}

	/**
	 * Legge da tastiera un valore intero qualsiasi
	 * 
	 * @param messaggio : messaggio da mostrare all'utente nella fase di inserimento
	 *                  dati
	 * @return : valore intero inserito
	 */

	public static int leggiIntero(String messaggio) {
		Scanner input = new Scanner(System.in);
		int i = 0;
		String intero = "";
		boolean ok;
		do {
			ok = true;
			System.out.print(messaggio);
			intero = input.nextLine();
			intero = trim(intero);
			System.out.print("\n");
			try {
				i = Integer.parseInt(intero);
			} catch (NumberFormatException e) {
				ok = false;
				System.out.print("ERRORE. Formato non valido.\n");
			}
		} while (!ok);
		return i;
	}

	/**
	 * Legge da tastiera un valore decimale qualsiasi
	 * 
	 * @param messaggio : messaggio da mostrare all'utente nella fase di inserimento
	 *                  dati
	 * @return : valore decimale inserito
	 */

	public static double leggiDouble(String messaggio) {
		Scanner input = new Scanner(System.in);
		double d = 0;
		String decimale = "";
		boolean ok;
		do {
			ok = true;
			System.out.print(messaggio);
			decimale = input.nextLine();
			decimale = trim(decimale);
			System.out.print("\n");
			try {
				d = Double.parseDouble(decimale);
			} catch (NumberFormatException e) {
				ok = false;
				System.out.print("ERRORE. Formato non valido.\n");
			}
		} while (!ok);
		return d;
	}

	/**
	 * Legge da tastiera un valore intero positivo
	 * 
	 * @param messaggio : messaggio da mostrare all'utente nella fase di inserimento
	 *                  dati
	 * @return : valore intero positivo inserito
	 */

	public static int leggiInteroPos(String messaggio) {
		int i = leggiIntero(messaggio);
		while (i <= 0) {
			System.out.print("ERRORE. Valore non valido.\n");
			i = leggiIntero(messaggio);
		}
		return i;
	}

	/**
	 * Legge da tastiera un valore decimale positivo
	 * 
	 * @param messaggio : messaggio da mostrare all'utente nella fase di inserimento
	 *                  dati
	 * @return : valore decimale positivo inserito
	 */

	public static double leggiDoublePos(String messaggio) {
		double d = leggiDouble(messaggio);
		while (d <= 0) {
			System.out.print("ERRORE. Valore non valido.\n");
			d = leggiDouble(messaggio);
		}
		return d;
	}

	/**
	 * Legge da tastiera una stringa
	 * 
	 * @param messaggio : messaggio da mostrare all'utente nella fase di inserimento
	 *                  dati
	 * @return : stringa inserita
	 */

	public static String leggiStringa(String messaggio) {
		Scanner input = new Scanner(System.in);
		String s = "";
		System.out.print(messaggio);
		s = input.nextLine();
		System.out.print("\n");
		return s;
	}

	/**
	 * Legge da tastiera un carattere qualsiasi
	 * 
	 * @param messaggio : messaggio da mostrare all'utente nella fase di inserimento
	 *                  dati
	 * @return : carattere inserito
	 */

	public static char leggiChar(String messaggio) {
		Scanner input = new Scanner(System.in);
		String s = "";
		System.out.print(messaggio);
		s = input.nextLine();
		System.out.print("\n");
		return s.charAt(0);
	}

	/**
	 * Legge da tastiera un valore booleano (si puo' inserire una stringa che
	 * corrisponde ad uno dei parametri)
	 * 
	 * @param messaggio : messaggio da mostrare all'utente nella fase di inserimento
	 *                  dati
	 * @param vero      : stringa inseribile corrispondente al valore true
	 * @param falso     : stringa inseribile corrispondente al valore false
	 * @return true se la stringa e' uguale a al parametro vero, false se la stringa
	 *         e' uguale al parametro falso
	 */

	public static boolean leggiBool(String messaggio, String vero, String falso) {
		Scanner input = new Scanner(System.in);
		boolean ok = true;
		String bool = "";
		do {

			ok = true;
			System.out.print(messaggio);
			bool = input.nextLine();
			bool = trim(bool);
			System.out.print("\n");

			if (bool.equalsIgnoreCase(vero))
				return true;

			if (bool.equalsIgnoreCase(falso))
				return false;

			System.out.println("ERRORE. Formato non valido. Reinserire. ");

		} while (ok);

		return false;

	}

	/*
	 * Metodo di supporto per pot
	 */

	private static double potBase(double b, int esp) {
		if (esp == 0)
			return 1;
		else
			return b * potBase(b, esp - 1);
	}

	/**
	 * Calcola la potenza di una base decimale con esponente intero, sia positivo
	 * che negativo
	 * 
	 * @param b   : base decimale
	 * @param esp : esponente intero
	 * @return : risultato potenza
	 */

	public static double pot(double b, int esp) {
		double d;
		if (esp < 0) {
			esp = esp * (-1);
			d = 1 / (potBase(b, esp));
		} else {
			d = potBase(b, esp);
		}
		return d;
	}

	/**
	 * Arrotonda un numero alla prima cifra decimale
	 * 
	 * @param x : numero da arrotondare
	 * @return : numero arrotondato
	 */

	public static double arrotonda1(double x) {
		x = Math.round(x * 10);
		x = x / 10;
		return x;
	}

	/**
	 * Arrotonda un numero alla seconda cifra decimale
	 * 
	 * @param x : numero da arrotondare
	 * @return : numero arrotondato
	 */

	public static double arrotonda2(double x) {
		x = Math.round(x * 100);
		x = x / 100;
		return x;
	}

	/**
	 * Arrotonda un numero alla terza cifra decimale
	 * 
	 * @param x : numero da arrotondare
	 * @return : numero arrotondato
	 */

	public static double arrotonda3(double x) {
		x = Math.round(x * 1000);
		x = x / 1000;
		return x;
	}

}
