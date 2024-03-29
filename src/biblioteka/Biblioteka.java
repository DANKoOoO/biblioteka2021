package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.Bibliotekainterfejs;
/**
 * Biblioteka sa knjigama.
 * 
 * @author danko
 *
 */
public class Biblioteka implements Bibliotekainterfejs {
	/**
	 * dvostruko spregnuta lista sa knjigama
	 */
	private LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();
	
	@Override
	public void dodajKnjigu(Knjiga knjiga) {

		if (knjiga == null)
			throw new NullPointerException("Knjiga ne sme biti null");
		if (knjige.contains(knjiga))
			throw new RuntimeException("Knjiga vec postoji");

		knjige.add(knjiga);

	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		if(knjiga == null || !knjige.contains(knjiga))
			throw new RuntimeException("Knjiga ne sme biti null i mora postojati u biblioteci");
			
		knjige.remove(knjiga);

	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {		
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, String isbn, String izdavac, String naslov) {

		if (autor == null && isbn == null && naslov == null && izdavac == null)
			throw new RuntimeException("Moraate uneti bar 1 kriterijum pretrage");



		LinkedList<Knjiga> rezultat = new LinkedList<Knjiga>();
		for(Knjiga knjiga: knjige)
			if(knjiga.getNaslov().contains(naslov))
				rezultat.add(knjiga);
				
		return rezultat;
	}

}
