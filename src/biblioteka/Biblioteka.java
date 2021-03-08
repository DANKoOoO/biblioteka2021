package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.Bibliotekainterfejs;

public class Biblioteka implements Bibliotekainterfejs {

	private LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();
	
	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		if(knjiga == null || knjige.contains(knjiga))
			throw new RuntimeException("Knjiga ne sme biti null i ne sme biti duplikat");
		
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
