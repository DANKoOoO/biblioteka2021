package biblioteka.interfejs;

import java.util.LinkedList;

import biblioteka.Autor;
import biblioteka.Knjiga;
/**
 * Interfejs koji predstavlja biblioteku.
 * 
 * @author danko
 *
 */
public interface Bibliotekainterfejs {
	/**
	 * Dodaje novu knjigu u biblioteku.
	 * @param knjiga Knjiga koja se dodaje.
	 * 
	 * @throws java.lang.NullPointerException Ako je uneta knjiga null.
	 * @throws java.lang.RuntimeException Ako uneta knjiga vec postoji u biblioteci (duplikat)
	 */
	public void dodajKnjigu(Knjiga knjiga);
	public void obrisiKnjigu(Knjiga knjiga);
	public LinkedList<Knjiga> vratiSveKnjige();
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, String isbn, String izdavac, String naslov);
}
